package com.athulawalpola.tastychickenrecipes.recipeshome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import com.athulawalpola.tastychickenrecipes.R;
import com.athulawalpola.tastychickenrecipes.chickensalads.ChickenFiestaSalad;
import com.athulawalpola.tastychickenrecipes.chickensalads.FruityCurryChickenSalad;
import com.athulawalpola.tastychickenrecipes.chickensalads.HolidayChickenSalad;
import com.athulawalpola.tastychickenrecipes.chickensalads.SesamePastaChickenSalad;
import com.athulawalpola.tastychickenrecipes.chickensalads.SpecialChickenSalad;

public class ChickenSaladRecipes extends AppCompatActivity {

    CardView cardView_1, cardView_2, cardView_3, cardView_4, cardView_5;
    TextView textView_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chicken_salad_recipes);

        textView_1 = findViewById(R.id.icon_back_24);
        textView_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        cardView_1 = findViewById(R.id.chicken_salad_recipe_1);
        cardView_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFruityCurryChickenSalad();
            }
        });

        cardView_2 = findViewById(R.id.chicken_salad_recipe_2);
        cardView_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSpecialChickenSalad();
            }
        });

        cardView_3 = findViewById(R.id.chicken_salad_recipe_3);
        cardView_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSesamePastaChickenSalad();
            }
        });

        cardView_4 = findViewById(R.id.chicken_salad_recipe_4);
        cardView_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHolidayChickenSalad();
            }
        });

        cardView_5 = findViewById(R.id.chicken_salad_recipe_5);
        cardView_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChickenFiestaSalad();
            }
        });
    }

    private void openFruityCurryChickenSalad() {
        Intent intent = new Intent(this, FruityCurryChickenSalad.class);
        startActivity(intent);
    }

    private void openSpecialChickenSalad() {
        Intent intent = new Intent(this, SpecialChickenSalad.class);
        startActivity(intent);
    }

    private void openSesamePastaChickenSalad() {
        Intent intent = new Intent(this, SesamePastaChickenSalad.class);
        startActivity(intent);
    }

    private void openHolidayChickenSalad() {
        Intent intent = new Intent(this, HolidayChickenSalad.class);
        startActivity(intent);
    }

    private void openChickenFiestaSalad() {
        Intent intent = new Intent(this, ChickenFiestaSalad.class);
        startActivity(intent);
    }
}
