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
    private int mAudioResourceId;


    public Word(String defaultTranslation , String miwokTranslation ,int audioResourceId) {
        mMiwokTranslation = miwokTranslation ;
        mDefaultTranslation = defaultTranslation ;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation , String miwokTranslation ,int imageResourceId ,int audioResourceId) {
        mMiwokTranslation = miwokTranslation ;
        mDefaultTranslation = defaultTranslation ;
        mImageResourceId = imageResourceId ;
        mAudioResourceId = audioResourceId;
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

    public int getAudioResourceId()
    {
        return mAudioResourceId;
    }

}