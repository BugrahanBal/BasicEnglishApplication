package co.example.basicenglish.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import co.example.basicenglish.R;
import co.example.basicenglish.scroll.SectionPagerAdapter;

public class HomeFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        SectionPagerAdapter sectionsPagerAdapter = new SectionPagerAdapter(getContext().getApplicationContext(),
                getActivity().getSupportFragmentManager());

        ViewPager viewPager = root.findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);

        return root;
    }
}