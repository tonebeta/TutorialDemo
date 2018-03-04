package com.tonebeta.tutorialdemo.ui.bases;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.tonebeta.tutorialdemo.model.CommonConstants;

/**
 * Created by 109890 on 2018/3/4.
 */

public abstract class BaseActivity extends AppCompatActivity implements CommonConstants {

    protected final String TAG = getClass().getSimpleName();

    protected abstract int getLayoutId();
    protected abstract void findViews();
    // 宣告抽象的進入點
    protected abstract void init();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        findViews();
        init();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    // 使用者UI互動，例如取得畫面的UI元件的property
    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }



}
