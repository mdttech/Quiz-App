package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class UserInput extends AppCompatActivity {


    /**
     * Tracks the Score of the quiz
     */
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input);
    }

    /**
     * This method is called when the Submit button is clicked.
     */
    public void submitAnswer(View view) {


        // Question 1
        RadioButton user_input_question1_choice3;
        Boolean answer1;
        user_input_question1_choice3 = (RadioButton) this.findViewById(R.id.user_input_question1_choice3);
        answer1 = user_input_question1_choice3.isChecked();
        if (answer1) {
            score = score + 1;
        } else {
            score = score + 0;
        }


        // Question 2
        RadioButton user_input_question2_choice1;
        Boolean answer2;
        user_input_question2_choice1 = (RadioButton) this.findViewById(R.id.user_input_question2_choice1);
        answer2 = user_input_question2_choice1.isChecked();
        if (answer2) {
            score = score + 1;
        } else {
            score = score + 0;
        }


        // Question 3
        RadioButton user_input_question3_choice2;
        Boolean answer3;
        user_input_question3_choice2 = (RadioButton) this.findViewById(R.id.user_input_question3_choice2);
        answer3 = user_input_question3_choice2.isChecked();
        if (answer3) {
            score = score + 1;
        } else {
            score = score + 0;
        }


        // Question4
        EditText user_input_question4_answer;
        String answer4;
        user_input_question4_answer = (EditText) findViewById(R.id.user_input_question4_answer);
        answer4 = user_input_question4_answer.getText().toString();
        if (answer4.equals("Android:padding")) {
            score = score + 1;
        } else {
            score = score + 0;
        }


        // Question 5
        CheckBox user_input_question5_choice1;
        CheckBox user_input_question5_choice2;
        CheckBox user_input_question5_choice3;
        CheckBox user_input_question5_choice4;

        Boolean answer5_choice1;
        Boolean answer5_choice2;
        Boolean answer5_choice3;
        Boolean answer5_choice4;
        user_input_question5_choice1 = (CheckBox) this.findViewById(R.id.user_input_question5_choice1);
        user_input_question5_choice2 = (CheckBox) this.findViewById(R.id.user_input_question5_choice2);
        user_input_question5_choice3 = (CheckBox) this.findViewById(R.id.user_input_question5_choice3);
        user_input_question5_choice4 = (CheckBox) this.findViewById(R.id.user_input_question5_choice4);
        answer5_choice1 = user_input_question5_choice1.isChecked();
        answer5_choice2 = user_input_question5_choice2.isChecked();
        answer5_choice3 = user_input_question5_choice3.isChecked();
        answer5_choice4 = user_input_question5_choice4.isChecked();
        if (!answer5_choice1 && answer5_choice2 && answer5_choice3 && answer5_choice4) {
            score = score + 1;
        } else {
            score = score + 0;
        }

        /**
         * This display the score when the Submit button is clicked.
         */

        if (score == 5) {
            Toast.makeText(this, "Perfect! You scored 5 out of 5", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "You Scored" + score, Toast.LENGTH_LONG).show();
        }
        score = 0 ;
    }
}
