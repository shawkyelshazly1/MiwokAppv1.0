/**
 * Created by Veronica on 12/3/2017.
 */
package com.example.android.miwokapp;


public class Word {

    private String mDefaultTransilation;
    private String mMiwokTransilation;
    private int mAudioId;
    private int mImageId = NO_IMAGE;
    private static final int NO_IMAGE = -1;


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

    public int getAudioId(){
        return mAudioId;
    }

    public boolean hasImage(){
        return mImageId != NO_IMAGE;
    }
}
