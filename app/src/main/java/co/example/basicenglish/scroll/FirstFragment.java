package co.example.basicenglish.scroll;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import co.example.basicenglish.R;

public class FirstFragment extends Fragment {

    Animation topAnimation,bottomAnimation;
    ImageView imageView;
    TextView textView;

    public static FirstFragment newInstance(){
        return new FirstFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState){

        View root = inflater.inflate(R.layout.fragment_first,container,false);

        topAnimation = AnimationUtils.loadAnimation(getContext().getApplicationContext(), R.anim.top_animation);
        bottomAnimation = AnimationUtils.loadAnimation(getContext().getApplicationContext(),R.anim.bottom_animation);


        imageView =root.findViewById(R.id.imageView);
        textView=root.findViewById(R.id.text_home);

        imageView.setAnimation(topAnimation);
        textView.setAnimation(bottomAnimation);

        return root;
    }
}
