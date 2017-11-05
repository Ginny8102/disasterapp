package com.ginny.example.disasterapp.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Goodbye extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goodbye);

        String GoodBye = "You Ordered ";
        if(Data.water)
            GoodBye += "water, ";
        if(Data.cannedGoods)
            GoodBye += "canned foods, ";
        if(Data.babyFood)
            GoodBye += "baby food, ";
        if(Data.driedFoods)
            GoodBye += "dried foods,\n";
        int people = Data.eldrly + Data.adult +  Data.teen + Data.child + Data.youngchild;
        if (Data.tent)
            GoodBye += "a tent, ";
        if (Data.pt)
            GoodBye += "paper towels, ";
        if (Data.tp)
            GoodBye += "toilet paper, ";
        if (Data.toiletries)
            GoodBye += people+" toiletry kit(s), ";
        if (Data.sb)
            GoodBye += people+" sleeping bags, ";
        if (Data.blanket)
            GoodBye += people+" blankets, ";
        if (Data.Diper)
            GoodBye += Data.youngchild+" boxes of diapers";
        if (!Data.DietaryResrict.equals("Do not enter if none."))
            GoodBye += ".\nYour dietary restrictions: "+Data.DietaryResrict+".";
        GoodBye += "\nYou ordered ";
        if (Data.pain)
            GoodBye += "pain meds, ";
        if (Data.cold)
            GoodBye += "cold meds, ";
        if (Data.acid)
            GoodBye += "antacids, ";
        if (Data.allergy)
            GoodBye += "allergy meds";
        if(!Data.Prescription.equals("Do not enter if none."))
            GoodBye += ".\n Your prescription meds: "+Data.Prescription+".";
        GoodBye += "\nYou ordered these sizes of clothes:\n";
        if (Data.clothesMark[0])
            GoodBye += "Women's Extra Large, ";
        if (Data.clothesMark[1])
            GoodBye += "Women's Large, ";
        if (Data.clothesMark[2])
            GoodBye += "Women's Medium, ";
        if (Data.clothesMark[3])
            GoodBye += "Women's Small, ";
        if (Data.clothesMark[4])
            GoodBye += "Men's Extra Large, ";
        if (Data.clothesMark[5])
            GoodBye += "Men's Large, ";
        if (Data.clothesMark[6])
            GoodBye += "Men's Medium, ";
        if (Data.clothesMark[7])
            GoodBye += "Men's Small, ";
        if (Data.clothesMark[8])
            GoodBye += "Child's Large, ";
        if (Data.clothesMark[9])
            GoodBye += "Child's Medium, ";
        if (Data.clothesMark[10])
            GoodBye += "Child's Small, ";
        if (Data.clothesMark[11])
            GoodBye += "Child's Extra Small, ";
        if (Data.clothesMark[12])
            GoodBye += "Child's Extra Extra Small, ";
        if (Data.clothesMark[13])
            GoodBye += "Baby";
        GoodBye +=".\n";
        if (Data.fak)
            GoodBye += "You ordered a fist aid kit.";
        TextView MOO = (TextView) findViewById(R.id.textView5);
        MOO.setText(GoodBye);
    }
}
