package com.example.bd;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.bd.ui.FragmentAddFragment;
import com.example.bd.ui.FragmentDelFragment;
import com.example.bd.ui.FragmentShowFragment;
import com.example.bd.ui.FragmentUpdateFragment;

public class MainViewPagerAdapter extends FragmentPagerAdapter {
    MainViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 4;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: {
                return new FragmentShowFragment();
            }
            case 1: {
                return new FragmentAddFragment();
            }
            case 2: {
                return new FragmentUpdateFragment();
            }
            default: {
                return new FragmentDelFragment();
            }
        }
    }
}
