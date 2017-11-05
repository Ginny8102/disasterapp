package com.ginny.example.disasterapp.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class medical extends AppCompatActivity {
    public static medical instance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical);
        medical.instance = this;
        final CheckBox coldCheack = (CheckBox) findViewById(R.id.checkBox);
        coldCheack.setChecked(Data.cold);
        final CheckBox can = (CheckBox) findViewById(R.id.checkBox2);
        can.setChecked(Data.pain);
        final CheckBox baby = (CheckBox) findViewById(R.id.checkBox3);
        baby.setChecked(Data.acid);
        final CheckBox dry = (CheckBox) findViewById(R.id.checkBox4);
        dry.setChecked(Data.allergy);
        final CheckBox med = (CheckBox) findViewById(R.id.checkBox5);
        med.setChecked(Data.fak);
        final EditText editText2 = (EditText)findViewById(R.id.editText2);
        editText2.setText(Data.Prescription, TextView.BufferType.EDITABLE);
        Button done = (Button) findViewById(R.id.buttonOfDone);

        coldCheack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coldCheack.setChecked(!Data.cold);
                Data.cold = !Data.cold;
            }
        });

        can.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                can.setChecked(!Data.pain);
                Data.pain = !Data.pain;
            }
        });

        baby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                baby.setChecked(!Data.acid);
                Data.acid = !Data.acid;
            }
        });

        dry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dry.setChecked(!Data.allergy);
                Data.allergy = !Data.allergy;
            }
        });

        med.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                med.setChecked(!Data.fak);
                Data.fak = !Data.fak;
            }
        });

        editText2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Data.Prescription = editText2.getText().toString();
            }
        });

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(medical.instance, ResultAcivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                overridePendingTransition (0, 0);
            }
        });

    }
}
