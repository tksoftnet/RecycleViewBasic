package com.example.recycleviewbasic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NameListAdapter extends RecyclerView.Adapter<NameListAdapter.NameViewHolder> {


    private LayoutInflater layoutInflater;
    private ArrayList<String> nameArrayList;

    public NameListAdapter(Context context, ArrayList<String> nameArrayList) {
        layoutInflater = LayoutInflater.from(context);
        this.nameArrayList = nameArrayList;
    }

    @NonNull
    @Override
    public NameListAdapter.NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = layoutInflater.inflate(R.layout.namelist_item, parent, false);
        return new NameViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull NameListAdapter.NameViewHolder holder, int position) {
        String mCurrent = nameArrayList.get(position);
        holder.nameItemView.setText(mCurrent);

    }

    @Override
    public int getItemCount() {
        return nameArrayList.size();
    }

    public class NameViewHolder extends RecyclerView.ViewHolder {
        public TextView nameItemView;
        NameListAdapter nameListAdapter;
        public NameViewHolder(@NonNull View itemView, NameListAdapter adapter) {
            super(itemView);
            nameItemView = itemView.findViewById(R.id.tvName);
            this.nameListAdapter = adapter;

        }
    }
}
