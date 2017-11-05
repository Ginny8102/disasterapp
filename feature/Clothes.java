package com.ginny.example.disasterapp.feature;

import android.content.Intent;
import android.media.MediaMuxer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Clothes extends AppCompatActivity {

    public static Clothes instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothes);
        Clothes.instance = this;
        final CheckBox WoXL = (CheckBox) findViewById(R.id.WXL);
        WoXL.setChecked(Data.clothesMark[0]);
        final CheckBox WoL = (CheckBox) findViewById(R.id.WL);
        WoL.setChecked(Data.clothesMark[1]);
        final CheckBox WoM = (CheckBox) findViewById(R.id.WM);
        WoM.setChecked(Data.clothesMark[2]);
        final CheckBox WoS = (CheckBox) findViewById(R.id.WS);
        WoS.setChecked(Data.clothesMark[3]);
        final CheckBox MXL = (CheckBox) findViewById(R.id.MXL);
        MXL.setChecked(Data.clothesMark[4]);
        final CheckBox ML = (CheckBox) findViewById(R.id.ML);
        ML.setChecked(Data.clothesMark[5]);
        final CheckBox MM = (CheckBox) findViewById(R.id.MM);
        MM.setChecked(Data.clothesMark[6]);
        final CheckBox MS = (CheckBox) findViewById(R.id.MS);
        MS.setChecked(Data.clothesMark[7]);
        final CheckBox ChL = (CheckBox) findViewById(R.id.CL);
        ChL.setChecked(Data.clothesMark[8]);
        final CheckBox ChM = (CheckBox) findViewById(R.id.CM);
        ChM.setChecked(Data.clothesMark[9]);
        final CheckBox ChS = (CheckBox) findViewById(R.id.CS);
        ChS.setChecked(Data.clothesMark[10]);
        final CheckBox ChXS = (CheckBox) findViewById(R.id.CXS);
        ChXS.setChecked(Data.clothesMark[11]);
        final CheckBox ChXXS = (CheckBox) findViewById(R.id.CXXS);
        ChXXS.setChecked(Data.clothesMark[12]);
        final CheckBox Babe = (CheckBox) findViewById(R.id.Baby);
        Babe.setChecked(Data.clothesMark[13]);
        Button done = (Button) findViewById(R.id.buttonOfDone);

        WoXL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WoXL.setChecked(!Data.clothesMark[0]);
                Data.clothesMark[0] = !Data.clothesMark[0];
            }
        });
        WoL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WoL.setChecked(!Data.clothesMark[1]);
                Data.clothesMark[1] = !Data.clothesMark[1];
            }
        });
        WoM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WoM.setChecked(!Data.clothesMark[2]);
                Data.clothesMark[2] = !Data.clothesMark[2];
            }
        });
        WoS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WoS.setChecked(!Data.clothesMark[3]);
                Data.clothesMark[3] = !Data.clothesMark[3];
            }
        });
        MXL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MXL.setChecked(!Data.clothesMark[4]);
                Data.clothesMark[4] = !Data.clothesMark[4];
            }
        });
        ML.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ML.setChecked(!Data.clothesMark[5]);
                Data.clothesMark[5] = !Data.clothesMark[5];
            }
        });
        MM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MM.setChecked(!Data.clothesMark[6]);
                Data.clothesMark[6] = !Data.clothesMark[6];
            }
        });
        MS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MS.setChecked(!Data.clothesMark[7]);
                Data.clothesMark[7] = !Data.clothesMark[7];
            }
        });
        ChL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChL.setChecked(!Data.clothesMark[8]);
                Data.clothesMark[8] = !Data.clothesMark[8];
            }
        });
        ChM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChM.setChecked(!Data.clothesMark[9]);
                Data.clothesMark[9] = !Data.clothesMark[9];
            }
        });
        ChS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChS.setChecked(!Data.clothesMark[10]);
                Data.clothesMark[10] = !Data.clothesMark[10];
            }
        });
        ChXS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChXS.setChecked(!Data.clothesMark[11]);
                Data.clothesMark[11] = !Data.clothesMark[11];
            }
        });
        ChXXS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChXXS.setChecked(!Data.clothesMark[12]);
                Data.clothesMark[12] = !Data.clothesMark[12];
            }
        });
        Babe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Babe.setChecked(!Data.clothesMark[13]);
                Data.clothesMark[13] = !Data.clothesMark[13];
            }
        });
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Clothes.instance, ResultAcivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                overridePendingTransition (0, 0);
            }
        });

    }
}
