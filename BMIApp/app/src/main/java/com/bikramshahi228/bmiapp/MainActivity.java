package com.bikramshahi228.bmiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText weight , heightFt , heightIn;
        Button button;
        TextView result;

        LinearLayout linearId;

        weight = findViewById(R.id.weight);
        heightFt = findViewById(R.id.heightFt);
        heightIn = findViewById(R.id.heightCm);

              button = findViewById(R.id.button);
              result = findViewById(R.id.result);
              linearId = findViewById(R.id.linearId);

              button.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {
                     int wt =  Integer.parseInt(weight.getText().toString());
                     int ft = Integer.parseInt(heightFt.getText().toString());
                     int In = Integer.parseInt(heightIn.getText().toString());

                     int totalInch = ft*12  + In ;
                     double totalCm = totalInch * 2.53;
                     double totalM = totalCm/100;


                     double bmi = wt/(totalM*totalM);

                     if(bmi > 25){
                         result.setText("You are overWeight");
                         linearId.setBackgroundColor(getResources().getColor(R.color.purple_200));
                     }else if(bmi < 18){
                         result.setText(" underWeight");
                         linearId.setBackgroundColor(getResources().getColor(R.color.teal_200));
                     }else{
                         result.setText("You are healthy");
                         linearId.setBackgroundColor(getResources().getColor(R.color.teal_700));
                     }
                  }
              });

    }
}