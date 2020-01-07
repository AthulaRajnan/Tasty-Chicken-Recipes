package com.athulawalpola.tastychickenrecipes.recipeshome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import com.athulawalpola.tastychickenrecipes.R;
import com.athulawalpola.tastychickenrecipes.chickenbreasts.BraisedBalsamicChicken;
import com.athulawalpola.tastychickenrecipes.chickenbreasts.ChickenMarsala;
import com.athulawalpola.tastychickenrecipes.chickenbreasts.FamousButterChicken;
import com.athulawalpola.tastychickenrecipes.chickenbreasts.GarlicCheddarChicken;
import com.athulawalpola.tastychickenrecipes.chickenbreasts.GarlicChicken;
import com.athulawalpola.tastychickenrecipes.chickenbreasts.SalsaChicken;
import com.athulawalpola.tastychickenrecipes.chickenbreasts.SpicyGarlicLimeChicken;

public class ChickenBreastsRecipes extends AppCompatActivity {

    CardView cardView_1, cardView_2, cardView_3, cardView_4, cardView_5, cardView_6, cardView_7;
    TextView textView_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chicken_breasts_recipes);

        textView_1 = findViewById(R.id.icon_back_24);
        textView_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        cardView_1 = findViewById(R.id.chicken_breasts_recipe_1);
        cardView_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGarlicChicken();
            }
        });

        cardView_2 = findViewById(R.id.chicken_breasts_recipe_2);
        cardView_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSpicyGarlicLimeChicken();
            }
        });

        cardView_3 = findViewById(R.id.chicken_breasts_recipe_3);
        cardView_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGarlicCheddarChicken();
            }
        });

        cardView_4 = findViewById(R.id.chicken_breasts_recipe_4);
        cardView_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChickenMarsala();
            }
        });

        cardView_5 = findViewById(R.id.chicken_breasts_recipe_5);
        cardView_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSalsaChicken();
            }
        });

        cardView_6 = findViewById(R.id.chicken_breasts_recipe_6);
        cardView_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBraisedBalsamicChicken();
            }
        });

        cardView_7 = findViewById(R.id.chicken_breasts_recipe_7);
        cardView_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFamousButterChicken();
            }
        });
    }

    private void openFamousButterChicken() {
        Intent intent = new Intent(this, FamousButterChicken.class);
        startActivity(intent);
    }

    private void openGarlicChicken() {
        Intent intent = new Intent(this, GarlicChicken.class);
        startActivity(intent);
    }

    private void openSpicyGarlicLimeChicken() {
        Intent intent = new Intent(this, SpicyGarlicLimeChicken.class);
        startActivity(intent);
    }

    private void openGarlicCheddarChicken() {
        Intent intent = new Intent(this, GarlicCheddarChicken.class);
        startActivity(intent);
    }

    private void openChickenMarsala() {
        Intent intent = new Intent(this, ChickenMarsala.class);
        startActivity(intent);
    }

    private void openSalsaChicken() {
        Intent intent = new Intent(this, SalsaChicken.class);
        startActivity(intent);
    }

    private void openBraisedBalsamicChicken() {
        Intent intent = new Intent(this, BraisedBalsamicChicken.class);
        startActivity(intent);
    }
}
