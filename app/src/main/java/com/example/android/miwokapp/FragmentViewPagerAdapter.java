package com.example.android.miwokapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Veronica on 12/7/2017.
 */

public class FragmentViewPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;
    public FragmentViewPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        }else if (position == 1){
            return new FamilyFragment();
        }else if (position == 2){
            return new PhrasesFragment();
        }else {
            return new ColorsFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_numbers);
        }else if (position == 1){
            return mContext.getString(R.string.category_family);
        }else if (position == 2){
            return mContext.getString(R.string.category_phrases);
        }else {
            return mContext.getString(R.string.category_colors);
        }
    }
}
