package com.tonebeta.tutorialdemo.ui;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.tonebeta.tutorialdemo.R;
import com.tonebeta.tutorialdemo.ui.adapters.InstructionPageAdapter;
import com.tonebeta.tutorialdemo.ui.bases.BaseActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 109890 on 2018/3/4.
 */

public class UiMainActivity extends BaseActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void findViews() {
        viewPager = findViewById(R.id.viewpager_instruction);
        tabLayout = findViewById(R.id.tab_disc);
    }

    @Override
    protected void init() {
        initPager();
    }

    private void initPager() {
        List<Integer> indexList = new ArrayList<>(5);

        for (int i = 0; i < 5; i++) {
            indexList.add(i + 1);
        }

        viewPager.setAdapter(new InstructionPageAdapter(getSupportFragmentManager(), indexList));
        tabLayout.setupWithViewPager(viewPager);
    }
}
