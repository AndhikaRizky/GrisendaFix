package com.latihan.binaryworks.grisenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        Button login = (Button) findViewById(R.id.loginBtn);
        Button buka = (Button) findViewById(R.id.idpelanggan);

        buka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open = new Intent(getApplicationContext(),CrpelangganActivity.class);
                startActivity(open);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), ServiceActivity.class);
                startActivity(startIntent);
            }
        });
    }
}
