package com.example.mantrahindu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DoaAdapter extends  RecyclerView.Adapter<DoaAdapter.ViewHolder>{

    private List<DoaModel> doaData;

    public DoaAdapter(List<DoaModel> doaList) {
        doaData = doaList;
    }

    @NonNull
    @Override

    public DoaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.doa_item, parent, false);
        return new DoaAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DoaAdapter.ViewHolder holder, int position) {
        DoaModel model = doaData.get(position);
        holder.textViewTitle.setText(model.title);
        holder.contentTextView.setText(model.content);
        holder.meanTextView.setText(model.mean);
    }

    @Override
    public int getItemCount() {
        return doaData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewTitle;
        public TextView contentTextView;
        public TextView meanTextView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.doaTitleTextView);
            contentTextView = itemView.findViewById(R.id.doaContentTextView);
            meanTextView = itemView.findViewById(R.id.doaMeanTextView);
        }
    }
}
