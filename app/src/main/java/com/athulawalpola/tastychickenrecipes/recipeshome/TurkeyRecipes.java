package com.athulawalpola.tastychickenrecipes.recipeshome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import com.athulawalpola.tastychickenrecipes.R;
import com.athulawalpola.tastychickenrecipes.turkeyrecipes.DeliciousTurkeyBurgers;
import com.athulawalpola.tastychickenrecipes.turkeyrecipes.HomestyleTurkey;
import com.athulawalpola.tastychickenrecipes.turkeyrecipes.PerfectTurkey;
import com.athulawalpola.tastychickenrecipes.turkeyrecipes.SimpleTurkeyChilli;
import com.athulawalpola.tastychickenrecipes.turkeyrecipes.TurkeyQuinoaMeatloaf;
import com.athulawalpola.tastychickenrecipes.turkeyrecipes.RosemaryRoastedTurkey;

public class TurkeyRecipes extends AppCompatActivity {

    CardView cardView_1, cardView_2, cardView_3, cardView_4, cardView_5, cardView_6;
    TextView textView_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.turkey_recipes);

        textView_1 = findViewById(R.id.icon_back_24);
        textView_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        cardView_1 = findViewById(R.id.turkey_recipes_1);
        cardView_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDeliciousTurkeyBurgers();
            }
        });

        cardView_2 = findViewById(R.id.turkey_recipes_2);
        cardView_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTurkeyQuinoaMeatloaf();
            }
        });

        cardView_3 = findViewById(R.id.turkey_recipes_3);
        cardView_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSimpleTurkeyRecipes();
            }
        });

        cardView_4 = findViewById(R.id.turkey_recipes_4);
        cardView_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRosemaryRoastedTurkey();
            }
        });

        cardView_5 = findViewById(R.id.turkey_recipes_5);
        cardView_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPerfectTurkey();
            }
        });

        cardView_6 = findViewById(R.id.turkey_recipes_6);
        cardView_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomestyleTurkey();
            }
        });
    }

    private void openDeliciousTurkeyBurgers() {
        Intent intent = new Intent(this, DeliciousTurkeyBurgers.class);
        startActivity(intent);
    }

    private void openTurkeyQuinoaMeatloaf() {
        Intent intent = new Intent(this, TurkeyQuinoaMeatloaf.class);
        startActivity(intent);
    }

    private void openSimpleTurkeyRecipes() {
        Intent intent = new Intent(this, SimpleTurkeyChilli.class);
        startActivity(intent);
    }

    private void openRosemaryRoastedTurkey() {
        Intent intent = new Intent(this, RosemaryRoastedTurkey.class);
        startActivity(intent);
    }

    private void openPerfectTurkey() {
        Intent intent = new Intent(this, PerfectTurkey.class);
        startActivity(intent);
    }

    private void openHomestyleTurkey() {
        Intent intent = new Intent(this, HomestyleTurkey.class);
        startActivity(intent);
    }
}
