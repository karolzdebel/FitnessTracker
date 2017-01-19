package fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.karol.fitnesstracker.R;

/**
 * Created by Karol Zdebel on 2016-12-27.
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
        return inflater.inflate(R.layout.tab_nutrition,container,false);
    }

}
