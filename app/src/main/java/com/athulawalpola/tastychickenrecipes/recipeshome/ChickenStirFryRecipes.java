package com.athulawalpola.tastychickenrecipes.recipeshome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import com.athulawalpola.tastychickenrecipes.R;
import com.athulawalpola.tastychickenrecipes.chickenstirfry.BroccoliChickenStirFry;
import com.athulawalpola.tastychickenrecipes.chickenstirfry.CaramelChicken;
import com.athulawalpola.tastychickenrecipes.chickenstirfry.ChickenStirFry;
import com.athulawalpola.tastychickenrecipes.chickenstirfry.GarlicChickenStirFry;
import com.athulawalpola.tastychickenrecipes.chickenstirfry.KungPaoChicken;

public class ChickenStirFryRecipes extends AppCompatActivity {

    CardView cardView_1, cardView_2, cardView_3, cardView_4, cardView_5;
    TextView textView_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chicken_stir_fry_recipes);

        textView_1 = findViewById(R.id.icon_back_24);
        textView_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        cardView_1 = findViewById(R.id.chicken_stirfry_recipe_1);
        cardView_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBroccoliChickenStirFry();
            }
        });

        cardView_2 = findViewById(R.id.chicken_stirfry_recipe_2);
        cardView_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKungPaoChicken();
            }
        });

        cardView_3 = findViewById(R.id.chicken_stirfry_recipe_3);
        cardView_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChickenStirFry();
            }
        });

        cardView_4 = findViewById(R.id.chicken_stirfry_recipe_4);
        cardView_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGarlicChickenStirFry();
            }
        });

        cardView_5 = findViewById(R.id.chicken_stirfry_recipe_5);
        cardView_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCaramelChicken();
            }
        });
    }

    private void openBroccoliChickenStirFry() {
        Intent intent = new Intent(this, BroccoliChickenStirFry.class);
        startActivity(intent);
    }

    private void openKungPaoChicken() {
        Intent intent = new Intent(this, KungPaoChicken.class);
        startActivity(intent);
    }

    private void openChickenStirFry() {
        Intent intent = new Intent(this, ChickenStirFry.class);
        startActivity(intent);
    }

    private void openGarlicChickenStirFry() {
        Intent intent = new Intent(this, GarlicChickenStirFry.class);
        startActivity(intent);
    }

    private void openCaramelChicken() {
        Intent intent = new Intent(this, CaramelChicken.class);
        startActivity(intent);
    }
}
