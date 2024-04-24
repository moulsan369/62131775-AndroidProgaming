package com.ntu.lovelist;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class loveViewHolder extends RecyclerView.ViewHolder {
    TextView txtName;
    TextView txtMessage;
    TextView txtDate;
    View view;

    loveViewHolder(View itemView)
    {
        super(itemView);
        txtName
                = (TextView)itemView
                .findViewById(R.id.txtName);
        txtDate
                = (TextView)itemView
                .findViewById(R.id.txtDate);
        txtMessage
                = (TextView)itemView
                .findViewById(R.id.txtMessage);
        view = itemView;
    }
}

