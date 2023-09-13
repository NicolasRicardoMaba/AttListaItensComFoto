package com.example.attlistaitenscomfoto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<ItensChurrasco> listaChurrasco = new ArrayList<ItensChurrasco>();
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listaChurrasco.add(new ItensChurrasco(1,"pão de alho", R.drawable.pao));
        listaChurrasco.add(new ItensChurrasco(2,"carne", R.drawable.carne));
        listaChurrasco.add(new ItensChurrasco(3,"linguiça", R.drawable.linguica));

    ItemChurrascoAdapter adapter = new ItemChurrascoAdapter(this, R.layout.item_churrasco, listaChurrasco);
listView.setAdapter(adapter);









    }
}