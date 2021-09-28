package com.example.quizandroid1.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quizandroid1.GameModel;
import com.example.quizandroid1.R;
import com.example.quizandroid1.interf.ItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class QuizAdapter extends RecyclerView.Adapter<QuizAdapter.QuizHolder> {
    ItemClickListener itemClickListener;

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    List<GameModel>list = new ArrayList<>();


    public QuizAdapter(List<GameModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public QuizAdapter.QuizHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        return new QuizHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuizAdapter.QuizHolder holder, int position) {
        holder.bind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }



    public class QuizHolder extends RecyclerView.ViewHolder {
        TextView tvLevel;
        ImageView imageView;

        public QuizHolder(@NonNull View itemView) {
            super(itemView);
            tvLevel = itemView.findViewById(R.id.tv_level);
            imageView = itemView.findViewById(R.id.image_view);
        }

        public void bind(GameModel gameModel) {
            tvLevel.setText(gameModel.getCurrentLevel());
            imageView.setImageResource(gameModel.getIcon());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    itemClickListener.itemClick(getAdapterPosition(),gameModel);
                }
            });
        }
    }
}
