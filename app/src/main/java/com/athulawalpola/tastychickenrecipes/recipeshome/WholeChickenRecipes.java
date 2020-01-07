package com.athulawalpola.tastychickenrecipes.recipeshome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import com.athulawalpola.tastychickenrecipes.R;
import com.athulawalpola.tastychickenrecipes.wholechicken.BakedSlowCookerChicken;
import com.athulawalpola.tastychickenrecipes.wholechicken.JuicyRoastedChicken;
import com.athulawalpola.tastychickenrecipes.wholechicken.RoastChickenRosemary;
import com.athulawalpola.tastychickenrecipes.wholechicken.SimpleWholeRoastedChicken;
import com.athulawalpola.tastychickenrecipes.wholechicken.SpicyRapidRoastChicken;

public class WholeChickenRecipes extends AppCompatActivity {

    CardView cardView_1, cardView_2, cardView_3, cardView_4, cardView_5;
    TextView textView_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.whole_chicken_recipes);

        textView_1 = findViewById(R.id.icon_back_24);
        textView_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        cardView_1 = findViewById(R.id.whole_chicken_recipe_1);
        cardView_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openJuicyRoastedChicken();
            }
        });

        cardView_2 = findViewById(R.id.whole_chicken_recipe_2);
        cardView_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSimpleWholeRoastedChicken();
            }
        });

        cardView_3 = findViewById(R.id.whole_chicken_recipe_3);
        cardView_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBakedSlowCookerChicken();
            }
        });

        cardView_4 = findViewById(R.id.whole_chicken_recipe_4);
        cardView_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSpicyRapidRoastChicken();
            }
        });

        cardView_5 = findViewById(R.id.whole_chicken_recipe_5);
        cardView_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRoastChickenRosemary();
            }
        });
    }

    private void openJuicyRoastedChicken() {
        Intent intent = new Intent(this, JuicyRoastedChicken.class);
        startActivity(intent);
    }

    private void openSimpleWholeRoastedChicken() {
        Intent intent = new Intent(this, SimpleWholeRoastedChicken.class);
        startActivity(intent);
    }

    private void openBakedSlowCookerChicken() {
        Intent intent = new Intent(this, BakedSlowCookerChicken.class);
        startActivity(intent);
    }

    private void openSpicyRapidRoastChicken() {
        Intent intent = new Intent(this, SpicyRapidRoastChicken.class);
        startActivity(intent);
    }

    private void openRoastChickenRosemary() {
        Intent intent = new Intent(this, RoastChickenRosemary.class);
        startActivity(intent);
    }
}
