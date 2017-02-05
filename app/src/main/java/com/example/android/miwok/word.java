package com.example.android.miwok;

import android.content.Context;

/**
 * Created by sanket on 06/02/17.
 */

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;


    public Word(String defaultTranslation , String miwokTranslation) {
        mMiwokTranslation = miwokTranslation ;
        mDefaultTranslation = defaultTranslation ;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }

}