package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sanket on 06/02/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter (Activity context , ArrayList<Word> words)
    {
        super(context,0,words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item,parent,false);
        }

        Word currentWord = getItem(position);

        TextView miwokTextView = (TextView)listItemView.findViewById(R.id.miwok_numbers);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = (TextView)listItemView.findViewById(R.id.english_numbers);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView iconImageView = (ImageView)listItemView.findViewById(R.id.image);
        if(currentWord.hasImage())
        {
            iconImageView.setImageResource(currentWord.getImageResourceId());
            iconImageView.setVisibility(View.VISIBLE);
        }
        else
        {
            iconImageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
