package com.example.android.researchhero.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.researchhero.fragment.ExperimentLessonFragment;
import com.example.android.researchhero.fragment.ExperimentQuizFragment;
import com.example.android.researchhero.fragment.HypothesisLessonFragment;
import com.example.android.researchhero.fragment.HypothesisQuizFragment;

/**
 * Created by absak on 7/13/2017.
 */

public class ExperimentFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 2;
    private String tabTitles[] = new String[] { "Lesson 01", "Quiz 01"};
    private Context context;

    public ExperimentFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ExperimentLessonFragment();
        }
        else {
            return new ExperimentQuizFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
