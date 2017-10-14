package com.example.minhaj.customlayout;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Minhaj on 10/15/2017.
 */

 class CustomAdapter extends ArrayAdapter<String> {


    CustomAdapter(@NonNull Context context, @LayoutRes String[] data1) {
        super(context,R.layout.custom_layout,data1);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater myInflate = LayoutInflater.from(getContext());
        View myView = myInflate.inflate(R.layout.custom_layout,parent,false);

        String dataItem = getItem(position);
        TextView myText = (TextView) myView.findViewById(R.id.textView);
        ImageView imageView = (ImageView) myView.findViewById(R.id.myImageView);

        myText.setText(dataItem);

        return myView;

    }
}
