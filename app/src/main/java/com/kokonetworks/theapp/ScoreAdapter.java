package com.kokonetworks.theapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ScoreAdapter extends RecyclerView.Adapter<ScoreAdapter.ViewHoder> {
    List<LeaderBoard> leaderBoardList = new ArrayList<LeaderBoard>();


    public ScoreAdapter(List<LeaderBoard> leaderBoardList) {
        this.leaderBoardList = leaderBoardList;
    }

    @NonNull
    @Override
    public ViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_leaderboard, parent, false);
        return new ViewHoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoder holder, int position) {
        LeaderBoard leaderBoard = leaderBoardList.get(position);
        holder.tvRank.setText(leaderBoard.rank);
        holder.tvScore.setText(leaderBoard.score.toString());
    }

    @Override
    public int getItemCount() {
        return leaderBoardList.size();
    }

    static class ViewHoder extends RecyclerView.ViewHolder{
        TextView tvRank, tvScore;
        public ViewHoder(@NonNull View itemView) {
            super(itemView);
            tvRank = itemView.findViewById(R.id.tvRank);
            tvScore = itemView.findViewById(R.id.tvScore);
        }
    }
}
