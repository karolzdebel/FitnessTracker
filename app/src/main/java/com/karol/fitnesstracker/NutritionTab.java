package com.karol.fitnesstracker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by K on 2016-12-27.
 */

public class NutritionTab extends Fragment {

    public NutritionTab(){
    }

    public static NutritionTab newInstance() {
        Bundle args = new Bundle();
        NutritionTab fragment = new NutritionTab();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View nutritionView = inflater.inflate(R.layout.nutrition_layout,container,false);
        return nutritionView;
    }

}
