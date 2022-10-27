package com.example.form;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LihatForm extends AppCompatActivity {
    private TextView tableNama;
    private TextView tableHasilNama;
    private TextView tableTempatLahir;
    private TextView tableHasilTempatLahir;
    private TextView tableTanggalLahir;
    private TextView tableHasilTanggalLahir;
    private String HasilNama;
    private String HasilTempatLahir;
    private String HasilTanggalLahir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lihatform);

        tableNama = findViewById(R.id.table_nama);
        tableHasilNama = findViewById(R.id.table_hasil_nama);
        tableTempatLahir = findViewById(R.id.table_tempat_lahir);
        tableHasilTempatLahir = findViewById(R.id.table_hasil_tempat_lahir);
        tableTanggalLahir = findViewById(R.id.table_tanggal_lahir);
        tableHasilTanggalLahir = findViewById(R.id.table_hasil_tanggal_lahir);

        //Penerima
        Bundle extras = getIntent().getExtras();
        HasilNama = extras.getString("tableHasilNama");
        tableHasilNama.setText(HasilNama);
        HasilTempatLahir = extras.getString("tableTempatLahir");
        tableHasilTempatLahir.setText(HasilTempatLahir);
        HasilTanggalLahir = extras.getString("tableTanggalLahir");
        tableHasilTanggalLahir.setText(HasilTanggalLahir);



    }
}
