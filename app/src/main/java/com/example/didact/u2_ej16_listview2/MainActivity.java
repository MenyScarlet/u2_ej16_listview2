package com.example.didact.u2_ej16_listview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvClickNormal, tvClickLargo;
    ListView lvNombres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvClickNormal = (TextView)findViewById(R.id.tvClickNormal);
        tvClickLargo = (TextView)findViewById(R.id.tvClickLargo);
        lvNombres = (ListView) findViewById(R.id.lvNombres);

        String[] nombres = {"Juan","Antonio","Laura","Sandra","María","Fernando","Alistar",
                "Shepar","Mel","Pedro"};
        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,nombres);
        lvNombres.setAdapter(adaptador);

        lvNombres.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                
            }
        }


    }//FIN onCreate

}//FIN MainActivity
