package com.example.quizandroid1;

import java.util.ArrayList;
import java.util.List;

public class QuizClient {

   public static List <GameModel> gameModels = new ArrayList<>();

    public static List<GameModel> getQuiz(){
        gameModels.add(new GameModel(" Level 1","В каком году была изобретена зубная щетка?",
                "1938","1954","1947","1976","1938",R.drawable.ic_launcher_foreground));
        gameModels.add(new GameModel(" Level 2","В каком году расспался СССР?",
                "1989"," 1992","1991","1993","1991",R.drawable.ic_launcher_foreground));
        gameModels.add(new GameModel(" Level 3","В каком году пала стена Мария?",
                "867","845","839","853","845",R.drawable.ic_launcher_foreground));
        gameModels.add(new GameModel(" Level 4","Что изучает пунктуация?",
                "Части речи","Словосочетания и предложения","Правило написания слов",
                "Знаки препинания","Знаки препинания",R.drawable.ic_launcher_foreground));

       return gameModels;
    }
}
