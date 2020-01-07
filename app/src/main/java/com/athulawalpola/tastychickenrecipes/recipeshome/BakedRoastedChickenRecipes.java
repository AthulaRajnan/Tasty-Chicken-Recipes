package com.athulawalpola.tastychickenrecipes.recipeshome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import com.athulawalpola.tastychickenrecipes.R;
import com.athulawalpola.tastychickenrecipes.bakedroastedchicken.AnniversaryChicken;
import com.athulawalpola.tastychickenrecipes.bakedroastedchicken.ArtichokeChicken;
import com.athulawalpola.tastychickenrecipes.bakedroastedchicken.BakedGarlicParmesanChicken;
import com.athulawalpola.tastychickenrecipes.bakedroastedchicken.ChickenEnchiladas;
import com.athulawalpola.tastychickenrecipes.bakedroastedchicken.ChickenFlorentineCasserole;

public class BakedRoastedChickenRecipes extends AppCompatActivity {

    CardView cardView_1, cardView_2, cardView_3, cardView_4, cardView_5;
    TextView textView_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baked_roasted_chicken_recipes);

        textView_1 = findViewById(R.id.icon_back_24);
        textView_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        cardView_1 = findViewById(R.id.baked_roasted_chicken_recipe_1);
        cardView_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnniversaryChicken();
            }
        });

        cardView_2 = findViewById(R.id.baked_roasted_chicken_recipe_2);
        cardView_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChickenEnchiladas();
            }
        });

        cardView_3 = findViewById(R.id.baked_roasted_chicken_recipe_3);
        cardView_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBakedGarlicParmesanChicken();
            }
        });

        cardView_4 = findViewById(R.id.baked_roasted_chicken_recipe_4);
        cardView_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openArtichokeChicken();
            }
        });

        cardView_5 = findViewById(R.id.baked_roasted_chicken_recipe_5);
        cardView_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChickenFlorentineCasserole();
            }
        });
    }

    private void openAnniversaryChicken() {
        Intent intent = new Intent(this, AnniversaryChicken.class);
        startActivity(intent);
    }

    private void openChickenEnchiladas() {
        Intent intent = new Intent(this, ChickenEnchiladas.class);
        startActivity(intent);
    }

    private void openBakedGarlicParmesanChicken() {
        Intent intent = new Intent(this, BakedGarlicParmesanChicken.class);
        startActivity(intent);
    }

    private void openArtichokeChicken() {
        Intent intent = new Intent(this, ArtichokeChicken.class);
        startActivity(intent);
    }

    private void openChickenFlorentineCasserole() {
        Intent intent = new Intent(this, ChickenFlorentineCasserole.class);
        startActivity(intent);
    }
}
