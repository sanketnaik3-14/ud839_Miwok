package com.example.android.miwok;

import android.content.Context;

import static android.os.Build.VERSION_CODES.N;

/**
 * Created by sanket on 06/02/17.
 */

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(String defaultTranslation , String miwokTranslation) {
        mMiwokTranslation = miwokTranslation ;
        mDefaultTranslation = defaultTranslation ;
    }

    public Word(String defaultTranslation , String miwokTranslation ,int imageResourceId) {
        mMiwokTranslation = miwokTranslation ;
        mDefaultTranslation = defaultTranslation ;
        mImageResourceId = imageResourceId ;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public int getImageResourceId() { return mImageResourceId;}

    public boolean hasImage()
    {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}