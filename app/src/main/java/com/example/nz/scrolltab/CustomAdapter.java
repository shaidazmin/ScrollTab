package com.example.nz.scrolltab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Nz on 2/25/2019.
 */

public class CustomAdapter extends FragmentStatePagerAdapter {
    public CustomAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if(position == 0){
            fragment = new FragmentOne();
        }
        else if (position == 1 ){
            fragment = new FragmentTwo();
        }
        else if (position == 2 ){
            fragment = new FragmentThree();
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position ==0 ){
            return "This is Tab One";
        }
        if(position == 1 ){
            return "Thisis Tab Two";
        }
        if(position == 2){
            return  "This is Tab Three";

        }else
            return  null;
    }
}
