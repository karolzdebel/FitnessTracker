package com.karol.fitnesstracker;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by K on 2016-12-27.
 */

public class ProgressTab extends Fragment {

    public ProgressTab(){
    }

    public static ProgressTab newInstance() {

        Bundle args = new Bundle();

        ProgressTab fragment = new ProgressTab();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View progressView = inflater.inflate(R.layout.progress_layout,container,false);
        return progressView;
    }

}
