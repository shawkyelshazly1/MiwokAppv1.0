/**
 * Created by Veronica on 12/3/2017.
 */
package com.example.android.miwokapp;


public class Word {

    private String mDefaultTransilation;
    private String mMiwokTransilation;
    private int mImageId;


    public Word(String defaultTransilation,String miwokTransilation ,int imageId){
        mDefaultTransilation = defaultTransilation;
        mMiwokTransilation = miwokTransilation;
        mImageId = imageId;

    }

    public Word(String defaultTransilation,String miwokTransilation){
        mDefaultTransilation = defaultTransilation;
        mMiwokTransilation = miwokTransilation;

    }

    public String getDefaultTransilation() {
        return mDefaultTransilation;
    }

    public String getMiwokTransilation(){
        return mMiwokTransilation;
    }

    public int getImageId(){
        return mImageId;
    }
}
