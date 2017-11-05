package com.ginny.example.disasterapp.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class food extends AppCompatActivity {

    public static food instance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        food.instance = this;
        final CheckBox waterCheack = (CheckBox) findViewById(R.id.WaterBox);
        waterCheack.setChecked(Data.water);
        final CheckBox can = (CheckBox) findViewById(R.id.canBox);
        can.setChecked(Data.cannedGoods);
        final CheckBox baby = (CheckBox) findViewById(R.id.babyBox);
        baby.setChecked(Data.babyFood);
        final CheckBox dry = (CheckBox) findViewById(R.id.driedBox);
        dry.setChecked(Data.driedFoods);
        final EditText editText = (EditText)findViewById(R.id.editText);
        editText.setText(Data.DietaryResrict, TextView.BufferType.EDITABLE);
        Button done = (Button) findViewById(R.id.buttonOfDone);

        waterCheack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    waterCheack.setChecked(!Data.water);
                    Data.water = !Data.water;
            }
        });

        can.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                can.setChecked(!Data.cannedGoods);
                Data.cannedGoods = !Data.cannedGoods;
            }
        });

        baby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                baby.setChecked(!Data.babyFood);
                Data.babyFood = !Data.babyFood;
            }
        });

        dry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dry.setChecked(!Data.driedFoods);
                Data.driedFoods = !Data.driedFoods;
            }
        });

        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Data.DietaryResrict = editText.getText().toString();
            }
        });

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(food.instance, ResultAcivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                overridePendingTransition (0, 0);
            }
        });


    }
}
