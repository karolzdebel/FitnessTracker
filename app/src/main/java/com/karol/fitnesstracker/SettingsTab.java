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

public class SettingsTab extends Fragment{

    public SettingsTab(){
    }

    public static SettingsTab newInstance() {

        Bundle args = new Bundle();

        SettingsTab fragment = new SettingsTab();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View settingsView = inflater.inflate(R.layout.settings_layout,container,false);
        return settingsView;
    }
}
