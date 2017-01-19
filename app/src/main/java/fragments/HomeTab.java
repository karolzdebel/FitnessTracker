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
        return inflater.inflate(R.layout.tab_home,container,false);
    }

}
