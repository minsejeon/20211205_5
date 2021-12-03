package com.example.a11;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {
    ArrayList<Movie> items = new ArrayList<>();

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView movieNm;
        TextView audiAcc;
        TextView rank;

        public ViewHolder(View itemView) {
            super(itemView);

            movieNm = itemView.findViewById(R.id.tvMovieNm);
            audiAcc = itemView.findViewById(R.id.tvAudiAcc);
            rank = itemView.findViewById(R.id.tvRank);
        }

        public void setItem(Movie item) {
            movieNm.setText(item.movieNm);
            audiAcc.setText(item.audiAcc);
            rank.setText(item.rank);
        }
    }

    @NonNull
    @Override
    public MovieAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.movie_item, parent, false);

        return new MovieAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.ViewHolder holder, int position) {
        Movie item = items.get(position);
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addItem(Movie item) {
        items.add(item);
    }

    public void setItems(ArrayList<Movie> items) {
        this.items = items;
    }

    public Movie getItem(int position) {
        return items.get(position);
    }

    public void setItem(int position, Movie item) {
        items.set(position, item);
    }
}
