package com.tonebeta.tutorialdemo.ui.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.tonebeta.tutorialdemo.ui.fragments.UiInstructionPage;

import java.util.List;

/**
 * Created by 109890 on 2018/3/4.
 */

public class InstructionPageAdapter extends FragmentStatePagerAdapter {

    private List<Integer> indexList;

    public InstructionPageAdapter(FragmentManager fm, List<Integer> indexList) {
        super(fm);
        this.indexList = indexList;
    }

    @Override
    public Fragment getItem(int position) {
        return UiInstructionPage.newInstance(indexList.get(position));
    }

    @Override
    public int getCount() {
        return indexList.size();
    }
}
