package com.example.quizandroid1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        findViewById(R.id.first_level).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GameModel gameModel = new GameModel();
                gameModel.setCurrentLevel("Level 1");
                gameModel.setQuestion("В каком году была изобретена зубная щетка?");
                gameModel.setFirstVariant("1938");
                gameModel.setSecondVariant("1954");
                gameModel.setThirdVariant("1947");
                gameModel.setFourthVariant("1976");
                gameModel.setAnswer("1938");
                Intent intent = new Intent(LevelActivity.this,GameActivity.class);
                intent.putExtra("KEY", gameModel);
                startActivity(intent);
            }
        });
        findViewById(R.id.second_level).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GameModel gameModel = new GameModel();
                gameModel.setCurrentLevel("Level 2");
                gameModel.setQuestion("В каком году расспался СССР?");
                gameModel.setFirstVariant("1992");
                gameModel.setSecondVariant("1989");
                gameModel.setThirdVariant("1991");
                gameModel.setFourthVariant("1993");
                gameModel.setAnswer("1991");
                Intent intent = new Intent(LevelActivity.this,GameActivity.class);
                intent.putExtra("KEY", gameModel);
                startActivity(intent);
            }
        });
        findViewById(R.id.third_level).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GameModel gameModel = new GameModel();
                gameModel.setCurrentLevel("Level 3");
                gameModel.setQuestion("В каком году марлийцы отправили 4 детей на операцию на острове Парадиз?");
                gameModel.setFirstVariant("829");
                gameModel.setSecondVariant("838");
                gameModel.setThirdVariant("859");
                gameModel.setFourthVariant("845");
                gameModel.setAnswer("845");
                Intent intent = new Intent(LevelActivity.this,GameActivity.class);
                intent.putExtra("KEY", gameModel);
                startActivity(intent);
            }
        });
        findViewById(R.id.fourth_level).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GameModel gameModel = new GameModel();
                gameModel.setCurrentLevel("Level 4");
                gameModel.setQuestion("Что изучает пунктуация?");
                gameModel.setFirstVariant("словосочетания и предложения");
                gameModel.setSecondVariant("Знаки препинания");
                gameModel.setThirdVariant("Части речи");
                gameModel.setFourthVariant("Правило написания слов");
                gameModel.setAnswer("Знаки препинания");
                Intent intent = new Intent(LevelActivity.this,GameActivity.class);
                intent.putExtra("KEY", gameModel);
                startActivity(intent);
            }
        });
    }
}