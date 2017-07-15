package com.example.android.researchhero.LearnMenu;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.support.v4.app.TaskStackBuilder;

import com.example.android.researchhero.LearnPublishingResearchActivity;
import com.example.android.researchhero.LearnToResearch.ResearchMethodActivity;
import com.example.android.researchhero.R;

/**
 * Created by absak on 6/27/2017.
 */

public class LearnActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);



        // Find the View that shows the Research Method menu card
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


        // Find the View that shows the Publish Research menu card
        CardView publishResearchCardView = (CardView) findViewById(R.id.publish_research_card_view);

        // Set a click listener on that View
        publishResearchCardView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent learnMenuIntent = new Intent(LearnActivity.this, LearnPublishingResearchActivity.class);
                startActivity(learnMenuIntent);
            }
        });
    }



}
