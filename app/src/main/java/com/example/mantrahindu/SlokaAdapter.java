package com.example.mantrahindu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SlokaAdapter extends RecyclerView.Adapter<SlokaAdapter.ViewHolder> {
    private List<SlokaModel> slokaData;

    public SlokaAdapter(List<SlokaModel> slokaList) {
        slokaData = slokaList;
    }

    @NonNull
    @Override

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.sloka_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SlokaModel model = slokaData.get(position);
        holder.textViewTitle.setText(model.scripture);
        holder.contentTextView.setText(model.content);
        holder.meanTextView.setText(model.mean);
    }

    @Override
    public int getItemCount() {
        return slokaData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewTitle;
        public TextView contentTextView;
        public TextView meanTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            contentTextView = itemView.findViewById(R.id.contentTextView);
            meanTextView = itemView.findViewById(R.id.meanContentTextView);
        }
    }
}
