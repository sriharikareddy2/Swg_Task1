package com.example.task1;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class activitylistadapter extends ArrayAdapter<Activity> {
    private Context mContext;
    private int mResource;

    public activitylistadapter(@NonNull Context context, int resource, @NonNull  ArrayList<Activity> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(mContext);
        convertView = layoutInflater.inflate(mResource,parent,false);
        ImageView imageView = convertView.findViewById(R.id.activityimage);
        TextView textheading = convertView.findViewById(R.id.heading);
        TextView textDes = convertView.findViewById(R.id.description);
        imageView.setImageResource(getItem(position).getImage());
        textheading.setText(getItem(position).getActivityname());
        textDes.setText(getItem(position).getDescription());
        return convertView;
}


}

