package com.example.android.researchhero.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.researchhero.R;

/**
 * A simple {@link Fragment} subclass.
 */

public class HypothesisLessonFragment extends Fragment {


    public HypothesisLessonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.activity_lesson, container, false);

        TextView lessonBodyTextView = (TextView) rootView.findViewById(R.id.lesson_body_text_view);
        lessonBodyTextView.setText(getString(R.string.hypothesis_lesson));

        TextView noticeTextView = (TextView) rootView.findViewById(R.id.notice_text_view);
        noticeTextView.setText("N.B:\nOnly attempt quiz after reading the lesson with care.");
        return rootView;
    }

}
