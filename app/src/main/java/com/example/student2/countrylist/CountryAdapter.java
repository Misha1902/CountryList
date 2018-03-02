package com.example.student2.countrylist;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

import java.util.List;


public class CountryAdapter extends ArrayAdapter {
    public CountryAdapter(@NonNull Context context, @NonNull Object[] objects) {
        super(context, R.layout.country_item, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.country_item, null);
        }
        //View v = LayoutInflater.from(getContext()).inflate(R.layout.country_item, null);
        TextView num = (TextView) convertView.findViewById(R.id.CountryNumber);
        num.setText(position + ". ");
       
        TextView country =(TextView) convertView.findViewById(R.id.CountryName);
        country.setText((String)getItem(position));
        return convertView;
    }
}
