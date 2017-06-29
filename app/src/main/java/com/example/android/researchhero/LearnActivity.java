package com.example.android.researchhero;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

/**
 * Created by absak on 6/27/2017.
 */

public class LearnActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        // Find the View that shows the numbers category
        CardView researchMethodCardView = (CardView) findViewById(R.id.research_method_card_view);

        // Set a click listener on that View
        researchMethodCardView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent learnMenuIntent = new Intent(LearnActivity.this, ResearchMethodActivity.class);
                startActivity(learnMenuIntent);
            }
        });
    }
}
