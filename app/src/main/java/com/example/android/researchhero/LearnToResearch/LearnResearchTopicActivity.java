package com.example.android.researchhero.LearnToResearch;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.android.researchhero.R;
import com.example.android.researchhero.adapter.ResearchTopicFragmentPagerAdapter;

/**
 * Created by absak on 6/27/2017.
 */

public class LearnResearchTopicActivity extends AppCompatActivity {
    private RadioGroup quizRadioGroup;
    private RadioButton radioSubmitButton;
    private Button btnDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_research_topic);
        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        ResearchTopicFragmentPagerAdapter adapter = new ResearchTopicFragmentPagerAdapter(getSupportFragmentManager(), LearnResearchTopicActivity.this);

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
