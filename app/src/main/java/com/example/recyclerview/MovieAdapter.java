package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.security.PublicKey;
import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ListViewHolder> {

    private ArrayList<Movie> ListMovie;

    public MovieAdapter(ArrayList<Movie> listMovie) {
        this.ListMovie = listMovie;
    }

    @NonNull
    @Override
    public MovieAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.ListViewHolder holder, int position) {
        Movie mov = ListMovie.get(position);

        holder.txtTitle.setText(mov.getTitle());
        holder.txtYear.setText(mov.getYear());
    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitle;
        TextView txtYear;
        public ListViewHolder(@NonNull View itemView){
            super(itemView);

            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtYear = itemView.findViewById(R.id.txtYear);
        }
    }
}
