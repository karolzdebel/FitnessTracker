package interfaces;

import android.app.Fragment;

/**
 * Created by Karol Zdebel on 2017-01-01.
 */

public interface CreateWorkoutPlanNavigator{
    void startInfoFragment();
    void startScheduleFragment();
    void startAddWorkoutFragment();
    void startCreateWeightWorkoutFragment();
    void startCreateCardioWorkoutFragment();
    void startCreateOtherWorkoutFragment();
    void replaceFragment(Fragment fragment);
    void startFragment(Fragment fragment);
}
