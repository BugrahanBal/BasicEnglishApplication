package co.example.basicenglish.scroll;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import co.example.basicenglish.scroll.thirdfragment.ThirdFragment;

public class SectionPagerAdapter extends FragmentStatePagerAdapter {

    private Context mContext;

    FirstFragment firstFragment;
    SecondFragment secondFragment;
    ThirdFragment thirdFragment;

    public SectionPagerAdapter(Context context, FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mContext = context;

        firstFragment = new FirstFragment();
        secondFragment = new SecondFragment();
        thirdFragment = new ThirdFragment();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return firstFragment;
        } else if (position == 1) {
            return secondFragment;
        } else if (position == 2) {
            return thirdFragment;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
