package com.athulawalpola.tastychickenrecipes.recipeshome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import com.athulawalpola.tastychickenrecipes.MainActivity;
import com.athulawalpola.tastychickenrecipes.R;
import com.athulawalpola.tastychickenrecipes.chickenstew.ChickenAndouilleGumbo;
import com.athulawalpola.tastychickenrecipes.chickenstew.ChickenPotPieStew;
import com.athulawalpola.tastychickenrecipes.chickenstew.GumboStyleChickenCreole;
import com.athulawalpola.tastychickenrecipes.chickenstew.Jambalaya;
import com.athulawalpola.tastychickenrecipes.chickenstew.ZydecoStompGumbo;

public class ChickenStewRecipes extends AppCompatActivity {

    CardView cardView_1, cardView_2, cardView_3, cardView_4, cardView_5;
    TextView textView_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chicken_stew_recipes);

        textView_1 = findViewById(R.id.icon_back_24);
        textView_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        cardView_1 = findViewById(R.id.chicken_stew_recipe_1);
        cardView_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openZydecoStompGumbo();
            }
        });

        cardView_2 = findViewById(R.id.chicken_stew_recipe_2);
        cardView_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChickenPotPieStew();
            }
        });

        cardView_3 = findViewById(R.id.chicken_stew_recipe_3);
        cardView_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openJambalaya();
            }
        });

        cardView_4 = findViewById(R.id.chicken_stew_recipe_4);
        cardView_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGumboStyleChickenCreole();
            }
        });

        cardView_5 = findViewById(R.id.chicken_stew_recipe_5);
        cardView_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChickenAndouilleGumbo();
            }
        });
    }

    private void openZydecoStompGumbo() {
        Intent intent = new Intent(this, ZydecoStompGumbo.class);
        startActivity(intent);
    }

    private void openChickenPotPieStew() {
        Intent intent = new Intent(this, ChickenPotPieStew.class);
        startActivity(intent);
    }

    private void openJambalaya() {
        Intent intent = new Intent(this, Jambalaya.class);
        startActivity(intent);
    }

    private void openGumboStyleChickenCreole() {
        Intent intent = new Intent(this, GumboStyleChickenCreole.class);
        startActivity(intent);
    }

    private void openChickenAndouilleGumbo() {
        Intent intent = new Intent(this, ChickenAndouilleGumbo.class);
        startActivity(intent);
    }
}
