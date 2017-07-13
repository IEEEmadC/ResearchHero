package com.example.android.researchhero.LearnToResearch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.android.researchhero.LearnPublishingResearchActivity;
import com.example.android.researchhero.R;

/**
 * Created by absak on 6/27/2017.
 */

public class ResearchMethodActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research_method);

        // Find the View that shows the Image Circle 1
        ImageView researchTopicImageView = (ImageView) findViewById(R.id.research_topic_circle_one);

        // Set a click listener on that View
        researchTopicImageView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent researchTopicIntent = new Intent(ResearchMethodActivity.this, LearnResearchTopicActivity.class);
                startActivity(researchTopicIntent);
            }
        });

        // Find the View that shows the image circle two
        ImageView researchPurposeImageView = (ImageView) findViewById(R.id.research_purpose_circle_two);

        // Set a click listener on that View
        researchPurposeImageView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent researchPurposeIntent = new Intent(ResearchMethodActivity.this, LearnResearchPurposeActivity.class);
                startActivity(researchPurposeIntent);
            }
        });

        // Find the View that shows the image circle three
        ImageView researchQuestionImageView = (ImageView) findViewById(R.id.research_question_circle_three);

        // Set a click listener on that View
        researchQuestionImageView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent researchPurposeIntent = new Intent(ResearchMethodActivity.this, LearnResearchQuestionActivity.class);
                startActivity(researchPurposeIntent);
            }
        });

        // Find the View that shows the image circle four
        ImageView hypothesisImageView = (ImageView) findViewById(R.id.hypothesis_circle_four);

        // Set a click listener on that View
        hypothesisImageView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent hypothesisIntent = new Intent(ResearchMethodActivity.this, LearnHypothesisActivity.class);
                startActivity(hypothesisIntent);
            }
        });

        // Find the View that shows the image circle five
        ImageView experimentImageView = (ImageView) findViewById(R.id.experiment_circle_five);

        // Set a click listener on that View
        experimentImageView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent experimentIntent = new Intent(ResearchMethodActivity.this, LearnExperimentActivity.class);
                startActivity(experimentIntent);
            }
        });
    }
}

