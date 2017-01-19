package fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.karol.fitnesstracker.R;

/**
 * Created by Karol Zdebel on 2016-12-27.
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
        return inflater.inflate(R.layout.tab_settings,container,false);
    }
}
