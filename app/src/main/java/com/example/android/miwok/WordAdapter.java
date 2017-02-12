package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
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

    private int mColorResourceId;

    public WordAdapter (Activity context , ArrayList<Word> words ,int colorResourceId)
    {
        super(context,0,words);
        mColorResourceId = colorResourceId;
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

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
