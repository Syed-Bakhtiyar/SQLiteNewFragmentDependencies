package com.example.syedinkisarahmed.databasewithfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Syed Bakhtiyar on 11/8/2016.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {
    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new InsertFragment();
            case 1:
                return new ReadFragment();
            default:
                return null;


        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                return "Insert";
            case 1:
                return "Read";
            default:
                return null;


        }
    }
}
