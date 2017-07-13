package com.example.android.researchhero.LearnToResearch;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.researchhero.R;

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

        return rootView;
    }

}
