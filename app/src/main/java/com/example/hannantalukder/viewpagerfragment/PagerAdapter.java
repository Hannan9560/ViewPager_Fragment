package com.example.hannantalukder.viewpagerfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Hannan Talukder on 4/18/2017.
 */

public class PagerAdapter extends FragmentPagerAdapter{
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new FragmentOne();
             case 1:
                return new FragmentTwo();

        }
        return  null;

    }

    @Override
    public int getCount() {
        return 2;
    }
}
