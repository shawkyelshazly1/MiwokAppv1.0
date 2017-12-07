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



    public Word(String defaultTransilation,String miwokTransilation ,int imageId , int audioId){
        mDefaultTransilation = defaultTransilation;
        mMiwokTransilation = miwokTransilation;
        mImageId = imageId;
        mAudioId = audioId;

    }

    public Word(String defaultTransilation,String miwokTransilation , int audioId){
        mDefaultTransilation = defaultTransilation;
        mMiwokTransilation = miwokTransilation;
        mAudioId = audioId;


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


    public boolean hasImage(){
        return mImageId != NO_IMAGE;
    }

    public int getAudioResourceId() {
        return mAudioId;
    }
}
