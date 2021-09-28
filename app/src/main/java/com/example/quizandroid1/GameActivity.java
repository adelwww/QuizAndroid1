package com.example.quizandroid1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {
    Button firstAnswer, secondAnswer, thirdAnswer, fourthAnswer;
    TextView currentLevelTv, questionTv, tvAnswerQuiz;
    GameModel gameModel;
    private String answer;
    private String firstVariant;
    private String secondVariant;
    private String thirdVariant;
    private String fourVariant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        initViews();
        setQuestion();
        click();
    }

    private void initViews() {
        currentLevelTv = findViewById(R.id.level_tv);
        questionTv = findViewById(R.id.question_tv);
        firstAnswer = findViewById(R.id.first_answer);
        secondAnswer = findViewById(R.id.second_answer);
        thirdAnswer = findViewById(R.id.third_answer);
        fourthAnswer = findViewById(R.id.fourth_answer);
        tvAnswerQuiz = findViewById(R.id.tv_answer_quiz);
    }

    private void setQuestion() {
        gameModel = (GameModel) getIntent().getSerializableExtra("KEY");
        if (gameModel != null) {
            currentLevelTv.setText(gameModel.getCurrentLevel());
            questionTv.setText(gameModel.getQuestion());
            answer = gameModel.getAnswer();
            firstAnswer.setText(gameModel.getFirstVariant());
            secondAnswer.setText(gameModel.getSecondVariant());
            thirdAnswer.setText(gameModel.getThirdVariant());
            fourthAnswer.setText(gameModel.getFourVariant());
            tvAnswerQuiz.setText(gameModel.getAnswer());
        }
    }
    private void click() {
        firstAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstAnswer.getText() == answer){
                    Toast.makeText(GameActivity.this, "Верно!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(GameActivity.this, "Не верно", Toast.LENGTH_SHORT).show();
                }

            }
        });
        secondAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (secondAnswer.getText() == answer){
                    Toast.makeText(GameActivity.this, "Верно!" , Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(GameActivity.this, "Не верно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        thirdAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (thirdAnswer.getText() == answer){
                    Toast.makeText(GameActivity.this, "Верно!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(GameActivity.this, "Не верно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        fourthAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fourthAnswer.getText() == answer){
                    Toast.makeText(GameActivity.this, "Верно!" , Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(GameActivity.this, "Не верно", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}