package com.example.android.quizappproject;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick(View view) {

        int score = 0;

        EditText questionOneAnswer = (EditText) findViewById(R.id.questionOneAnswer);
        CheckBox questionTwoLinearLayout = (CheckBox) findViewById(R.id.linear_layout_answer);
        CheckBox questionTwoRelativeLayout = (CheckBox) findViewById(R.id.relative_layout_answer);
        CheckBox questionTwoScrollView = (CheckBox) findViewById(R.id.scroll_view_answer);
        CheckBox questionTwoImageView = (CheckBox) findViewById(R.id.image_view_wrong_check);
        RadioButton questionThreeImageView = (RadioButton) findViewById(R.id.image_view_answer);
        RadioButton questionFourScrollView = (RadioButton) findViewById(R.id.scroll_view_answer_q4);


        String answerQ1 = questionOneAnswer.getText().toString();
        answerQ1 = answerQ1.replaceAll(" ","");

        boolean answerQ2LinearLayout = questionTwoLinearLayout.isChecked();
        boolean answerQ2RelativeLayout = questionTwoRelativeLayout.isChecked();
        boolean answerQ2ScrollView = questionTwoScrollView.isChecked();
        boolean answerQ2ImageView = questionTwoImageView.isChecked();
        boolean answerQ3RadioButton = questionThreeImageView.isChecked();
        boolean answerQ4ScrollView = questionFourScrollView.isChecked();

        if (answerQ1.equalsIgnoreCase("TextView")) {
            score += 1;
        }

        if (answerQ2LinearLayout && answerQ2RelativeLayout && answerQ2ScrollView && answerQ2ImageView) {

        } else if (answerQ2LinearLayout && answerQ2RelativeLayout && answerQ2ScrollView) {
            score += 1;
        }

        if (answerQ3RadioButton) {
            score += 1;
        }

        if (answerQ4ScrollView) {
            score +=1;
        }

        Toast.makeText(getApplicationContext(),"Quiz Result: " + score + " out of 4",Toast.LENGTH_LONG).show();
    }
}