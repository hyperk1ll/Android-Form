package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private TextView nama;
    private TextView tempatLahir;
    private TextView tanggalLahir;
    private EditText etName;
    private EditText etTempatLahir;
    private EditText etTanggalLahir;
    private Button btnSubmit;
    DatePickerDialog.OnDateSetListener setListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = findViewById(R.id.nama);
        tempatLahir = findViewById(R.id.tempatLahir);
        tanggalLahir = findViewById(R.id.tanggalLahir);
        etName = findViewById(R.id.et_name);
        etTempatLahir = findViewById(R.id.et_tempat_lahir);
        etTanggalLahir = findViewById(R.id.et_tanggal_lahir);

        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);

        etTanggalLahir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int day) {
                        month = month+1;
                        String date = day+"/"+month+"/"+year;
                        etTanggalLahir.setText(date);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });

        Button btn = (Button)findViewById(R.id.btnSubmit);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, LihatForm.class);
                intent.putExtra("tableHasilNama",etName.getText().toString());
                intent.putExtra("tableTempatLahir",etTempatLahir.getText().toString());
                intent.putExtra("tableTanggalLahir",etTanggalLahir.getText().toString());
                startActivity(intent);
            };
        });


    }
}