package com.myappgen6to7mt.activity;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.myappgen6to7mt.fragments.AFragment;
import com.myappgen6to7mt.fragments.BFragment;

public class MyPagerAdapter extends FragmentStatePagerAdapter {

    int tabCount;
    public MyPagerAdapter(FragmentManager supportFragmentManager, int tabCount) {
        super(supportFragmentManager);
        this.tabCount = tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                AFragment aFragment = new AFragment();
                return  aFragment;

            case 1:
                BFragment bFragment = new BFragment();
                return bFragment ;
            case 2:
                AFragment bFragment1 = new AFragment();
                return bFragment1 ;

        }

        return null;
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
