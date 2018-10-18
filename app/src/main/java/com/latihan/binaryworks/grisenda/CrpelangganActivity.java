package com.latihan.binaryworks.grisenda;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class CrpelangganActivity extends AppCompatActivity {

    //int [] no = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e};
    String [] noi = {"1","2","3","4","5"};
    String[] nik = {"123456789", "123456789", "123456789", "123456789", "123456789"};
    String[] nama = {"hendi", "galang", "nanang", "khasbi", "upil"};
    String[] action = {"action", "action", "action", "action", "action"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crpelanggan);

        ListView listView = (ListView) findViewById(R.id.idlistview);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);


    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return noi.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.customlistview, null);

            TextView nok = (TextView)convertView.findViewById(R.id.idNo);
            TextView nikk = (TextView)convertView.findViewById(R.id.idNik);
            TextView namak = (TextView)convertView.findViewById(R.id.idNamaPelanggan);
            Button actionk = (Button)convertView.findViewById(R.id.idAction);

            nok.setText(noi[position]);
            nikk.setText(nik[position]);
            namak.setText(nama[position]);
            //actionk.setText(action[position]);
            actionk.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(),"NAaM",Toast.LENGTH_SHORT).show();
                }
            });

            return convertView;


        }

    }
}