package com.example.ngamia;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomArrayAdapter extends ArrayAdapter<String>{

    Context context;
    String[] names;
    int [] images;

    public CustomArrayAdapter(Context context,String[] names,int[] images){

        super(context,R.layout.saccospinner_item);
        this.names = names;
        this.images = images;
        this.context = context;
    }




    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.saccospinner_item,null);
        TextView t1 = (TextView)row.findViewById(R.id.textView1);
        ImageView i1 = (ImageView)row.findViewById(R.id.img1);

        t1.setText(names[position]);
        i1.setImageResource(images[position]);

        return row;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.saccospinner_item,null);
        TextView t1 = (TextView)row.findViewById(R.id.textView1);
        ImageView i1 = (ImageView)row.findViewById(R.id.img1);

        t1.setText(names[position]);
        i1.setImageResource(images[position]);

        return row;

    }
}
