package com.ginny.example.disasterapp.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Necessities extends AppCompatActivity {
    public static Necessities instance;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_necessities);
        Necessities.instance = this;
        final CheckBox tents = (CheckBox) findViewById(R.id.checkBox7);
        tents.setChecked(Data.tent);
        final CheckBox tk = (CheckBox) findViewById(R.id.checkBox8);
        tk.setChecked(Data.toiletries);
        final CheckBox paper = (CheckBox) findViewById(R.id.checkBox9);
        paper.setChecked(Data.pt);
        final CheckBox toilet = (CheckBox) findViewById(R.id.checkBox10);
        toilet.setChecked(Data.tp);
        final CheckBox sleeping = (CheckBox) findViewById(R.id.checkBox11);
        sleeping.setChecked(Data.sb);
        final CheckBox blank = (CheckBox) findViewById(R.id.checkBox12);
        blank.setChecked(Data.blanket);
        final CheckBox D = (CheckBox) findViewById(R.id.Di);
        D.setChecked(Data.Diper);
        Button done = (Button) findViewById(R.id.buttonOfDone);

        tents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tents.setChecked(!Data.tent);
                Data.tent = !Data.tent;
            }
        });
        tk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tk.setChecked(!Data.toiletries);
                Data.toiletries = !Data.toiletries;
            }
        });
        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                D.setChecked(!Data.Diper);
                Data.Diper = !Data.Diper;
            }
        });
        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paper.setChecked(!Data.pt);
                Data.pt = !Data.pt;
            }
        });
        toilet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toilet.setChecked(!Data.tp);
                Data.tp = !Data.tp;
            }
        });
        sleeping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sleeping.setChecked(!Data.sb);
                Data.sb = !Data.sb;
            }
        });
        blank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blank.setChecked(!Data.blanket);
                Data.blanket = !Data.blanket;
            }
        });
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Necessities.instance, ResultAcivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                overridePendingTransition (0, 0);
            }
        });

    }
}
