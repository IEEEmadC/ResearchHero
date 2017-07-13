package com.example.android.researchhero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.android.researchhero.LearnMenu.LearnActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        CardView learnCardView = (CardView) findViewById(R.id.learn_card_view);

        // Set a click listener on that View
        learnCardView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent menuIntent = new Intent(MainActivity.this, LearnActivity.class);
                startActivity(menuIntent);
            }
        });
    }
}
