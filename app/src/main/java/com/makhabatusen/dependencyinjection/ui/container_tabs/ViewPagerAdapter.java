package com.makhabatusen.dependencyinjection.ui.container_tabs;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentStateAdapter {


    private final List<Fragment> fragmentList = new ArrayList<>();


    public ViewPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    public void addFragment(Fragment fragment) {
        fragmentList.add(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        return fragmentList.get(position);
    }

    @Override
    public int getItemCount() {
        return fragmentList.size();
    }

}
