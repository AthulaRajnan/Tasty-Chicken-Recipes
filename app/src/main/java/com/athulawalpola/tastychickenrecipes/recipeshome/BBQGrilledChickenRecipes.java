package com.athulawalpola.tastychickenrecipes.recipeshome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import com.athulawalpola.tastychickenrecipes.R;
import com.athulawalpola.tastychickenrecipes.bbqgrilledchicken.ChickenTikkaMasala;
import com.athulawalpola.tastychickenrecipes.bbqgrilledchicken.HoneyMustardGrilledChicken;
import com.athulawalpola.tastychickenrecipes.bbqgrilledchicken.KeyWestChicken;
import com.athulawalpola.tastychickenrecipes.bbqgrilledchicken.RosemaryRanchChickenKabobs;
import com.athulawalpola.tastychickenrecipes.bbqgrilledchicken.UnbelievableChicken;
import com.athulawalpola.tastychickenrecipes.bbqgrilledchicken.YummyHoneyChickenKabobs;

public class BBQGrilledChickenRecipes extends AppCompatActivity {

    CardView cardView_1, cardView_2, cardView_3, cardView_4, cardView_5, cardView_6;
    TextView textView_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bbq_grilled_chicken_recipes);

        textView_1 = findViewById(R.id.icon_back_24);
        textView_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        cardView_1 = findViewById(R.id.bbq_grilled_chicken_recipe_1);
        cardView_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRosemaryRanchChickenKabobs();
            }
        });

        cardView_2 = findViewById(R.id.bbq_grilled_chicken_recipe_2);
        cardView_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUnbelievableChicken();
            }
        });

        cardView_3 = findViewById(R.id.bbq_grilled_chicken_recipe_3);
        cardView_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHoneyMustardGrilledChicken();
            }
        });

        cardView_4 = findViewById(R.id.bbq_grilled_chicken_recipe_4);
        cardView_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChickenTikkaMasala();
            }
        });

        cardView_5 = findViewById(R.id.bbq_grilled_chicken_recipe_5);
        cardView_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openYummyHoneyChickenKabobs();
            }
        });

        cardView_6 = findViewById(R.id.bbq_grilled_chicken_recipe_6);
        cardView_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKeyWestChicken();
            }
        });
    }

    private void openRosemaryRanchChickenKabobs() {
        Intent intent = new Intent(this, RosemaryRanchChickenKabobs.class);
        startActivity(intent);
    }

    private void openUnbelievableChicken() {
        Intent intent = new Intent(this, UnbelievableChicken.class);
        startActivity(intent);
    }

    private void openHoneyMustardGrilledChicken() {
        Intent intent = new Intent(this, HoneyMustardGrilledChicken.class);
        startActivity(intent);
    }

    private void openChickenTikkaMasala() {
        Intent intent = new Intent(this, ChickenTikkaMasala.class);
        startActivity(intent);
    }

    private void openYummyHoneyChickenKabobs() {
        Intent intent = new Intent(this, YummyHoneyChickenKabobs.class);
        startActivity(intent);
    }

    private void openKeyWestChicken() {
        Intent intent = new Intent(this, KeyWestChicken.class);
        startActivity(intent);
    }
}
