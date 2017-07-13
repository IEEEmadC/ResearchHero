package com.example.android.researchhero.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.researchhero.R;

/**
 * A simple {@link Fragment} subclass.
 */

public class ResearchQuestionQuizFragment extends Fragment {
    private RadioGroup quizRadioGroup;
    private RadioButton radioSubmitButton;
    private Button btnDisplay;

    public ResearchQuestionQuizFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_quiz_radio_button, container, false);

        TextView quizQuestionTextView = (TextView) rootView.findViewById(R.id.question_text_view);
        quizQuestionTextView.setText(getString(R.string.research_question_quiz));

        // Find the submit button for the quiz
        Button submitButton = (Button) rootView.findViewById(R.id.radio_submit_button);

        // Find the radioGroup of the quiz
        quizRadioGroup = (RadioGroup) rootView.findViewById(R.id.quiz_radio_group);


        // Set a click listener on that View
        submitButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                // get selected radio button from radioGroup
                int selectedId = quizRadioGroup.getCheckedRadioButtonId();
                if(selectedId == R.id.radio_no) {
                    Toast.makeText(getActivity(),
                            "Correct Answer", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity(),
                            "Wrong Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return rootView;
    }

}
