package com.athulawalpola.tastychickenrecipes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

import com.athulawalpola.tastychickenrecipes.recipeshome.TurkeyRecipes;
import com.athulawalpola.tastychickenrecipes.recipeshome.BBQGrilledChickenRecipes;
import com.athulawalpola.tastychickenrecipes.recipeshome.BakedRoastedChickenRecipes;
import com.athulawalpola.tastychickenrecipes.recipeshome.ChickenBreastsRecipes;
import com.athulawalpola.tastychickenrecipes.recipeshome.ChickenLegsRecipes;
import com.athulawalpola.tastychickenrecipes.recipeshome.ChickenSaladRecipes;
import com.athulawalpola.tastychickenrecipes.recipeshome.ChickenStewRecipes;
import com.athulawalpola.tastychickenrecipes.recipeshome.ChickenStirFryRecipes;
import com.athulawalpola.tastychickenrecipes.recipeshome.FriedChickenRecipes;
import com.athulawalpola.tastychickenrecipes.recipeshome.ChickenSoupRecipes;
import com.athulawalpola.tastychickenrecipes.recipeshome.WholeChickenRecipes;

public class MainActivity extends AppCompatActivity {

    CardView cardView_0, cardView_1, cardView_2, cardView_3, cardView_4, cardView_5, cardView_6, cardView_7, cardView_8, cardView_9, cardView_10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView_0 = findViewById(R.id.recipe_0);
        cardView_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTurkeyRecipes();
            }
        });

        cardView_1 = findViewById(R.id.recipe_1);
        cardView_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChickenSoupRecipes();
            }
        });

        cardView_2 = findViewById(R.id.recipe_2);
        cardView_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChickenSaladRecipes();
            }
        });

        cardView_3 = findViewById(R.id.recipe_3);
        cardView_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChickenLegsRecipes();
            }
        });

        cardView_4 = findViewById(R.id.recipe_4);
        cardView_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChickenBreastsRecipes();
            }
        });

        cardView_5 = findViewById(R.id.recipe_5);
        cardView_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFriedChickenRecipes();
            }
        });

        cardView_6 = findViewById(R.id.recipe_6);
        cardView_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWholeChickenRecipes();
            }
        });

        cardView_7 = findViewById(R.id.recipe_7);
        cardView_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBBQGrilledRecipes();
            }
        });

        cardView_8 = findViewById(R.id.recipe_8);
        cardView_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChickenStirFryRecipes();
            }
        });

        cardView_9 = findViewById(R.id.recipe_9);
        cardView_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBakedRoastedRecipes();
            }
        });

        cardView_10 = findViewById(R.id.recipe_10);
        cardView_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChickenSausageRecipes();
            }
        });

    }

    private void openTurkeyRecipes() {
        Intent intent = new Intent(this, TurkeyRecipes.class);
        startActivity(intent);
    }

    public void openChickenSoupRecipes() {
        Intent intent = new Intent(this, ChickenSoupRecipes.class);
        startActivity(intent);
    }

    public void openChickenSaladRecipes() {
        Intent intent = new Intent(this, ChickenSaladRecipes.class);
        startActivity(intent);
    }

    public void openChickenLegsRecipes() {
        Intent intent = new Intent(this, ChickenLegsRecipes.class);
        startActivity(intent);
    }

    public void openChickenBreastsRecipes() {
        Intent intent = new Intent(this, ChickenBreastsRecipes.class);
        startActivity(intent);
    }

    public void openFriedChickenRecipes() {
        Intent intent = new Intent(this, FriedChickenRecipes.class);
        startActivity(intent);
    }

    public void openWholeChickenRecipes() {
        Intent intent = new Intent(this, WholeChickenRecipes.class);
        startActivity(intent);
    }

    private void openBBQGrilledRecipes() {
        Intent intent = new Intent(this, BBQGrilledChickenRecipes.class);
        startActivity(intent);
    }

    private void openChickenStirFryRecipes() {
        Intent intent = new Intent(this, ChickenStirFryRecipes.class);
        startActivity(intent);
    }

    private void openBakedRoastedRecipes() {
        Intent intent = new Intent(this, BakedRoastedChickenRecipes.class);
        startActivity(intent);
    }

    private void openChickenSausageRecipes() {
        Intent intent = new Intent(this, ChickenStewRecipes.class);
        startActivity(intent);
    }

}
