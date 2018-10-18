package com.latihan.binaryworks.grisenda;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class ServiceActivity extends AppCompatActivity {

    private static final String TAG = "ServiceActivity";
    private DatePickerDialog.OnDateSetListener mdate;
    TextView TglLahir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        getSupportActionBar().hide();

        TglLahir = (TextView)findViewById(R.id.dateText);

        TglLahir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                int tanggal = calendar.get(Calendar.DAY_OF_MONTH);
                int bulan = calendar.get(Calendar.MONTH);
                int tahun = calendar.get(Calendar.YEAR);

                DatePickerDialog dialog = new DatePickerDialog(
                        ServiceActivity.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mdate,tahun,bulan,tanggal);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        mdate = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int tahun, int bulan, int tanggal) {
                bulan = bulan + 1;
                Log.d(TAG, "onDateSet: mm/dd/yyy "+ tanggal + "/" + bulan + "/" + tahun);
                String date = tanggal + "-" + bulan + "-" + tahun;
                TglLahir.setText(date);
            }
        };
    }
}
