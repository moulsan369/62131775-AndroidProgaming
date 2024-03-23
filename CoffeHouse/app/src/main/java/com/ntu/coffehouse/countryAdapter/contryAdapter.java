package com.ntu.coffehouse.countryAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import com.ntu.coffehouse.R;
import com.ntu.coffehouse.models.Country;
import java.util.ArrayList;

class contryAdapter extends RecyclerView.Adapter<contryAdapter.CountryViewHolder> {

    ArrayList<Country> listQG;
    Context context;

    public contryAdapter(ArrayList<Country> listQG, Context context) {
        this.listQG = listQG;
        this.context = context;
    }

    @Override
    public CountryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.coutry_item, parent, false);
        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CountryViewHolder holder, int position) {
        Country qgShow = listQG.get(position);
        holder.textName.setText(qgShow.getNameCoutry());
        holder.textNumber.setText(String.valueOf(qgShow.getNumberPeoples()));
        int imgaeQG = context.getResources().getIdentifier(qgShow.getImageFile(), "drawable", context.getPackageName());
        holder.imageView.setImageResource(imgaeQG);
    }

    @Override
    public int getItemCount() {
        return listQG.size();
    }

    static class CountryViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textName;
        TextView textNumber;

        public CountryViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.txtImg);
            textName = itemView.findViewById(R.id.txtName);
            textNumber = itemView.findViewById(R.id.txtPeoples);
        }
    }
}
