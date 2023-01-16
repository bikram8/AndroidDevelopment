package com.bikramshahi228.recyclerviewbikram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.bikramshahi228.recyclerviewbikram.AdaptersCustom.NatureAdapture;
import com.bikramshahi228.recyclerviewbikram.Model.NatureModel;
import com.bikramshahi228.recyclerviewbikram.Model.RecyclerItemCickListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        getSupportActionBar().hide();




        recyclerView = findViewById(R.id.recyclerViewOrg);

        ArrayList<NatureModel> list = new ArrayList<>();
        list.add(new NatureModel(R.drawable.a,"Nature1"));
        list.add(new NatureModel(R.drawable.b,"Nature2"));
        list.add(new NatureModel(R.drawable.c,"Nature3"));
        list.add(new NatureModel(R.drawable.d,"Nature4"));
        list.add(new NatureModel(R.drawable.e,"Nature5"));
        list.add(new NatureModel(R.drawable.f,"Nature6"));
        list.add(new NatureModel(R.drawable.g,"Nature7"));
        list.add(new NatureModel(R.drawable.h,"Nature8"));
        list.add(new NatureModel(R.drawable.i,"Nature9"));

        NatureAdapture adapture = new NatureAdapture(list,this);
        recyclerView.setAdapter(adapture);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);


     recyclerView.addOnItemTouchListener(new RecyclerItemCickListener
             (this, recyclerView, new RecyclerItemCickListener.OnItemClickListener() {
                 @Override
                 public void onItemClick(View view, int position) {
                     switch (position){
                         case 0:
                             Intent intent = new Intent(MainActivity.this,ScrollingActivity1.class);
                             startActivity(intent);

                             break;

                         case 1:
                             Intent  intent1 = new Intent(MainActivity.this,ScrollingActivity2.class);
                             startActivity(intent1);

                             break;


                     }
                 }

                 @Override
                 public void onLongItemClick(View view, int position) {

                 }
             }

             ));

    }
}