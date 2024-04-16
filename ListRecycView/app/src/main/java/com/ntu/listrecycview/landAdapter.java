package com.ntu.listrecycview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class landAdapter extends RecyclerView.Adapter<landAdapter.itemLandHolder>{

    Context context;
    ArrayList<LandSpace> lsData;

    public landAdapter(Context context, ArrayList<LandSpace> lsData) {
        this.context = context;
        this.lsData = lsData;
    }

    @NonNull
    @Override
    public itemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater cai_bom = LayoutInflater.from(context);
        View vItem = cai_bom.inflate(R.layout.land_item, parent, false);
        itemLandHolder viewHolderCreated = new itemLandHolder(vItem);
        return viewHolderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull itemLandHolder holder, int position) {
        LandSpace landShow = lsData.get(position);
        String caption = landShow.getLandCaption();
        String nameImg = landShow.getLandImageFN();

        holder.tvCaption.setText(caption);

        String packageName = holder.itemView.getContext().getPackageName();
        int imgID = holder.itemView.getResources().getIdentifier(nameImg,"drawable", packageName);

        holder.imgLands.setImageResource(imgID);
    }

    @Override
    public int getItemCount() {
        return lsData.size();
    }

    class itemLandHolder extends RecyclerView.ViewHolder{
        TextView tvCaption;
        ImageView imgLands;

        public itemLandHolder(@NonNull View itemView) {
            super(itemView);
            tvCaption = itemView.findViewById(R.id.tV_land);
            imgLands = itemView.findViewById(R.id.imgView_land);

        }
    }
}
