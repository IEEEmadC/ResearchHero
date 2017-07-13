package com.example.android.researchhero.LearnToResearch;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.android.researchhero.R;
import com.example.android.researchhero.fragment.HypothesisQuizFragment;
import com.example.android.researchhero.fragment.ResearchPurposeQuizFragment;

/**
 * Created by absak on 6/29/2017.
 */

public class HypothesisQuizActivity extends AppCompatActivity{
    private RadioGroup quizRadioGroup;
    private RadioButton radioSubmitButton;
    private Button btnDisplay;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_quiz);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new HypothesisQuizFragment())
                .commit();


        /*// Find the submit button for the quiz
        Button submitButton = (Button) findViewById(R.id.radio_submit_button);
        // Find the radioGroup of the quiz
        quizRadioGroup = (RadioGroup) findViewById(R.id.quiz_radio_group);


        // Set a click listener on that View
        submitButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                // get selected radio button from radioGroup
                int selectedId = quizRadioGroup.getCheckedRadioButtonId();
                if(selectedId == R.id.radio_no) {
                    Toast.makeText(ResearchTopicQuizOneActivity.this,
                            "Correct Answer", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ResearchTopicQuizOneActivity.this,
                            "Wrong Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });*/
    }
}
