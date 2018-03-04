package com.tonebeta.tutorialdemo.ui.bases;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 109890 on 2018/3/4.
 */

public abstract class BaseFragment extends Fragment {

    protected final String TAG = getClass().getSimpleName();

    protected abstract int getLayoutId();
    protected abstract void findRootViews(View rootView);
    protected abstract void init();
    protected abstract void clearReferences();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        onCreate(savedInstanceState);

        View rootView = inflater.inflate(getLayoutId(), container, false);
        findRootViews(rootView);
        init();

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart!");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume!");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause!");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop!");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView!");
        clearReferences();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy!");
    }
}
