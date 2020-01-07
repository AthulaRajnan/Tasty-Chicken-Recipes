package com.athulawalpola.tastychickenrecipes.recipeshome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import com.athulawalpola.tastychickenrecipes.R;
import com.athulawalpola.tastychickenrecipes.chickenlegs.MediterraneanLemonChicken;
import com.athulawalpola.tastychickenrecipes.chickenlegs.OvenBBQChickenDrumsticks;
import com.athulawalpola.tastychickenrecipes.chickenlegs.ParmesanChicken;
import com.athulawalpola.tastychickenrecipes.chickenlegs.SpicyHotChickenLegs;
import com.athulawalpola.tastychickenrecipes.chickenlegs.TaterCrispChicken;

public class ChickenLegsRecipes extends AppCompatActivity {

    CardView cardView_1, cardView_2, cardView_3, cardView_4, cardView_5;
    TextView textView_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chicken_legs_recipes);

        textView_1 = findViewById(R.id.icon_back_24);
        textView_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        cardView_1 = findViewById(R.id.chicken_legs_recipe_1);
        cardView_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMediterraneanLemonChicken();
            }
        });

        cardView_2 = findViewById(R.id.chicken_legs_recipe_2);
        cardView_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openParmesanChicken();
            }
        });

        cardView_3 = findViewById(R.id.chicken_legs_recipe_3);
        cardView_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOvenBBQChickenDrumsticks();
            }
        });

        cardView_4 = findViewById(R.id.chicken_legs_recipe_4);
        cardView_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSpicyHotChickenLegs();
            }
        });

        cardView_5 = findViewById(R.id.chicken_legs_recipe_5);
        cardView_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTaterCrispChicken();
            }
        });
    }

    private void openMediterraneanLemonChicken() {
        Intent intent = new Intent(this, MediterraneanLemonChicken.class);
        startActivity(intent);
    }

    private void openParmesanChicken() {
        Intent intent = new Intent(this, ParmesanChicken.class);
        startActivity(intent);
    }

    private void openOvenBBQChickenDrumsticks() {
        Intent intent = new Intent(this, OvenBBQChickenDrumsticks.class);
        startActivity(intent);
    }

    private void openSpicyHotChickenLegs() {
        Intent intent = new Intent(this, SpicyHotChickenLegs.class);
        startActivity(intent);
    }

    private void openTaterCrispChicken() {
        Intent intent = new Intent(this, TaterCrispChicken.class);
        startActivity(intent);
    }
}
