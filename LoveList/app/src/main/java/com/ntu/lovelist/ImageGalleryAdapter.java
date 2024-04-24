package com.ntu.lovelist;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class ImageGalleryAdapter extends RecyclerView.Adapter<loveViewHolder> {

    List<loveData> list;
    Context context;
    ClickListener listener;

    public ImageGalleryAdapter(List<loveData> list, Context context, ClickListener listener) {
        this.list = list;
        this.context = context;
        this.listener = listener;
    }

    @Override
    public loveViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        return new loveViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final loveViewHolder viewHolder, final int position) {
        viewHolder.txtName.setText(list.get(position).name);
        viewHolder.txtDate.setText(list.get(position).date);
        viewHolder.txtMessage.setText(list.get(position).message);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClick(viewHolder.getAdapterPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

