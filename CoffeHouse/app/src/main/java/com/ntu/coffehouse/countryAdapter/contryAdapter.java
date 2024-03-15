package com.ntu.coffehouse.countryAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.ntu.coffehouse.R;
import com.ntu.coffehouse.models.Country;

import java.util.ArrayList;

public class contryAdapter extends BaseAdapter {

    ArrayList<Country> listQG;

    Context context;

    public contryAdapter(ArrayList<Country> listQG, Context context) {
        this.listQG = listQG;
        this.context = context;
        mInflater = LayoutInflater.from(context);
    }

    LayoutInflater mInflater;



    @Override
    public int getCount() {
        return listQG.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CountryViewHolder viewItem;
        if (convertView ==null){
            viewItem = new CountryViewHolder();
            convertView = mInflater.inflate(R.layout.coutry_item, null);
            viewItem.textName = convertView.findViewById(R.id.txtName);
            viewItem.textNumber = convertView.findViewById(R.id.txtPeoples);
            viewItem.imageView = convertView.findViewById(R.id.txtImg);
            convertView.setTag(viewItem);
        }
        else {
            viewItem = (CountryViewHolder) convertView.getTag();
        }
        Country qgShow = listQG.get(position);
        String nameQG = qgShow.getNameCoutry();
        int numPeoples = qgShow.getNumberPeoples();
        String imgQG = qgShow.getImageFile();

        viewItem.textName.setText(nameQG);
        viewItem.textNumber.setText(numPeoples);

        int imgaeQG = findIDfromNameFile(imgQG);

        viewItem.imageView.setImageResource(imgaeQG);
        return convertView;
    }
    int findIDfromNameFile(String tenFileAnh){
        String namePage = context.getPackageName();
        int iD = context.getResources()
                .getIdentifier(
                        tenFileAnh, "drawable", namePage
                );
        return iD;
    }
    static class CountryViewHolder{
        ImageView imageView;
        TextView textName;

        TextView textNumber;
    }
}


