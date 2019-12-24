package com.athulawalpola.tastychickenrecipes.recipeshome;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

import com.athulawalpola.tastychickenrecipes.R;
import com.athulawalpola.tastychickenrecipes.souprecipes.ChickenNoodleSoup;
import com.athulawalpola.tastychickenrecipes.souprecipes.ChickenTacoSoup;
import com.athulawalpola.tastychickenrecipes.souprecipes.ChickenTortillaSoup;
import com.athulawalpola.tastychickenrecipes.souprecipes.LemonChickenOrzoSoup;
import com.athulawalpola.tastychickenrecipes.souprecipes.SpicyChickenSoup;

public class ChickenSoupRecipes extends AppCompatActivity {

    CardView cardView_1, cardView_2, cardView_3, cardView_4, cardView_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chicken_soup_recipes);

        cardView_1 = findViewById(R.id.chicken_soup_recipe_1);
        cardView_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChickenTacoSoup();
            }
        });

        cardView_2 = findViewById(R.id.chicken_soup_recipe_2);
        cardView_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChickenNoodleSoup();
            }
        });

        cardView_3 = findViewById(R.id.chicken_soup_recipe_3);
        cardView_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLemonChickenOrzoSoup();
            }
        });

        cardView_4 = findViewById(R.id.chicken_soup_recipe_4);
        cardView_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChickenTortillaSoup();
            }
        });

        cardView_5 = findViewById(R.id.chicken_soup_recipe_5);
        cardView_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSpicyChickenSoup();
            }
        });
    }

    private void openChickenTacoSoup() {
        Intent intent = new Intent(this, ChickenTacoSoup.class);
        startActivity(intent);
    }

    private void openChickenNoodleSoup() {
        Intent intent = new Intent(this, ChickenNoodleSoup.class);
        startActivity(intent);
    }

    private void openLemonChickenOrzoSoup() {
        Intent intent = new Intent(this, LemonChickenOrzoSoup.class);
        startActivity(intent);
    }

    private void openChickenTortillaSoup() {
        Intent intent = new Intent(this, ChickenTortillaSoup.class);
        startActivity(intent);
    }

    private void openSpicyChickenSoup() {
        Intent intent = new Intent(this, SpicyChickenSoup.class);
        startActivity(intent);
    }
}
