package com.example.quizandroid1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.quizandroid1.adapter.QuizAdapter;
import com.example.quizandroid1.interf.ItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class LevelActivity extends AppCompatActivity {
    List<GameModel> list = new ArrayList<>();
    RecyclerView recyclerView;
    QuizAdapter quizAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        list = QuizClient.getQuiz();
        quizAdapter = new QuizAdapter(list);
        recyclerView.setAdapter(quizAdapter);
        quizAdapter.setItemClickListener(new ItemClickListener() {
            @Override
            public void itemClick(int position, GameModel gameModel) {
                Intent intent = new Intent(LevelActivity.this,GameActivity.class);
                intent.putExtra("position",position);
                intent.putExtra("KEY",gameModel);
                startActivity(intent);
            }
        });
    }

}