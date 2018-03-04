package com.tonebeta.tutorialdemo.ui.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.tonebeta.tutorialdemo.R;
import com.tonebeta.tutorialdemo.model.CommonConstants;
import com.tonebeta.tutorialdemo.ui.bases.BaseFragment;

/**
 * Created by 109890 on 2018/3/4.
 */

public class UiInstructionPage extends BaseFragment implements CommonConstants {

    private TextView textView;

    public static UiInstructionPage newInstance(int index) {
        UiInstructionPage instance = new UiInstructionPage();

        Bundle arg = new Bundle();
        arg.putInt(BUNDLE_INDEX, index);

        instance.setArguments(arg);

        return instance;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_instruction;
    }

    @Override
    protected void findRootViews(View rootView) {
        textView = rootView.findViewById(R.id.textView);
    }

    @Override
    protected void init() {
        getBundleAndSetInfo();
    }

    private void getBundleAndSetInfo() {
        int index = getArguments().getInt(BUNDLE_INDEX);
        textView.setText(String.valueOf(index));

    }

    @Override
    protected void clearReferences() {

    }
}
