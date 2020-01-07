package com.athulawalpola.tastychickenrecipes.recipeshome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import com.athulawalpola.tastychickenrecipes.R;
import com.athulawalpola.tastychickenrecipes.friedchicken.ChickenFriedChicken;
import com.athulawalpola.tastychickenrecipes.friedchicken.CrispyFriedChicken;
import com.athulawalpola.tastychickenrecipes.friedchicken.FriedChickenwithCreamyGravy;
import com.athulawalpola.tastychickenrecipes.friedchicken.GarlicFriedChicken;
import com.athulawalpola.tastychickenrecipes.friedchicken.OvenFriedChicken;
import com.athulawalpola.tastychickenrecipes.friedchicken.TripleDippedFriedChicken;

public class FriedChickenRecipes extends AppCompatActivity {
    
    CardView cardView_1, cardView_2, cardView_3, cardView_4, cardView_5, cardView_6;
    TextView textView_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fried_chicken_recipes);

        textView_1 = findViewById(R.id.icon_back_24);
        textView_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        
        cardView_1 = findViewById(R.id.fried_chicken_recipe_1);
        cardView_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChickenFriedChicken();
            }
        });

        cardView_2 = findViewById(R.id.fried_chicken_recipe_2);
        cardView_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGarlicFriedChicken();
            }
        });

        cardView_3 = findViewById(R.id.fried_chicken_recipe_3);
        cardView_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOvenFriedChicken();
            }
        });

        cardView_4 = findViewById(R.id.fried_chicken_recipe_4);
        cardView_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTripleDippedFriedChicken();
            }
        });

        cardView_5 = findViewById(R.id.fried_chicken_recipe_5);
        cardView_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCrispyFriedChicken();
            }
        });

        cardView_6 = findViewById(R.id.fried_chicken_recipe_6);
        cardView_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFriedChickenwithCreamyGravy();
            }
        });
    }

    private void openChickenFriedChicken() {
        Intent intent = new Intent(this, ChickenFriedChicken.class);
        startActivity(intent);
    }

    private void openGarlicFriedChicken() {
        Intent intent = new Intent(this, GarlicFriedChicken.class);
        startActivity(intent);
    }

    private void openOvenFriedChicken() {
        Intent intent = new Intent(this, OvenFriedChicken.class);
        startActivity(intent);
    }

    private void openTripleDippedFriedChicken() {
        Intent intent = new Intent(this, TripleDippedFriedChicken.class);
        startActivity(intent);
    }

    private void openCrispyFriedChicken() {
        Intent intent = new Intent(this, CrispyFriedChicken.class);
        startActivity(intent);
    }

    private void openFriedChickenwithCreamyGravy() {
        Intent intent = new Intent(this, FriedChickenwithCreamyGravy.class);
        startActivity(intent);
    }
}
