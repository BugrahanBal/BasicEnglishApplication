package co.example.basicenglish.scroll;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.Random;

import co.example.basicenglish.R;


public class SecondFragment extends Fragment {

    TextView textView ;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance){


        View root = inflater.inflate(R.layout.fragment_second, container, false);

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

       textView = view.findViewById(R.id.randomText);

       textView.setText(getRandom());

    }

    public static String getRandom() {

        Random randomGenerator = new Random();
        ArrayList<String> randomSentence = new ArrayList<String>();

        randomSentence.add("22222222");
        randomSentence.add("111111111111");
        randomSentence.add("3333333333");

        int index = randomGenerator.nextInt(randomSentence.size());

        return randomSentence.get(index);
    }

}
