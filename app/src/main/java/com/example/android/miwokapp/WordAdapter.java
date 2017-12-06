package com.example.android.miwokapp;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Veronica on 12/3/2017.
 */
public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(@NonNull Context context, ArrayList<Word> listArray) {
        super(context,0,listArray);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Word word = getItem(position);

        View listView = convertView;
        if(listView == null){
            listView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        TextView view1 = listView.findViewById(R.id.itemTop);
        TextView view2 = listView.findViewById(R.id.itemBottom);
        ImageView image1 = listView.findViewById(R.id.photo_item);

        view1.setText(word.getMiwokTransilation());
        view2.setText(word.getDefaultTransilation());
        image1.setImageResource(word.getImageId());
        return listView;

}
}
