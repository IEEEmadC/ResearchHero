package com.example.android.researchhero;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */

public class ResearchTopicLessonOneFragment extends Fragment {


    public ResearchTopicLessonOneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.activity_lesson, container, false);
        // Find the View that shows the numbers category
        Button continueButton = (Button) rootView.findViewById(R.id.continue_button);
        
        // Set a click listener on that View
        continueButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent learnMenuIntent = new Intent(getActivity(), ResearchTopicQuizOne.class);
                startActivity(learnMenuIntent);
            }
        });
        return rootView;
    }

}
