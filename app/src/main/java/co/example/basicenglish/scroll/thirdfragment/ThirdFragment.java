package co.example.basicenglish.scroll.thirdfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import co.example.basicenglish.R;

public class ThirdFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<ThirdFragmentVeri> thirdFragmentVeris = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.activity_ortak_vocabulary, container, false);

        recyclerView =  root.findViewById(R.id.recyclerView);

        CustomAdapter customAdapter = new CustomAdapter(getActivity().getApplicationContext(),ThirdFragmentVeri.getDataImage());
        recyclerView.setAdapter(customAdapter);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext().getApplicationContext(),1,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);



        return root;

    }
}