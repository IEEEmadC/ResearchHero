package com.example.android.researchhero.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.researchhero.fragment.AnalysisLessonFragment;
import com.example.android.researchhero.fragment.AnalysisQuizFragment;
import com.example.android.researchhero.fragment.ExperimentLessonFragment;
import com.example.android.researchhero.fragment.ExperimentQuizFragment;

/**
 * Created by absak on 7/13/2017.
 */

public class AnalysisFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 2;
    private String tabTitles[] = new String[] { "Lesson 01", "Quiz 01"};
    private Context context;

    public AnalysisFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AnalysisLessonFragment();
        }
        else {
            return new AnalysisQuizFragment();
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
