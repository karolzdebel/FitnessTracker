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

public class HomeTab extends Fragment{

    public HomeTab(){
    }

    public static HomeTab newInstance() {
        
        Bundle args = new Bundle();
        
        HomeTab fragment = new HomeTab();
        fragment.setArguments(args);
        return fragment;
    }
    
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View homeView = inflater.inflate(R.layout.home_layout,container,false);
        return homeView;
    }

}
