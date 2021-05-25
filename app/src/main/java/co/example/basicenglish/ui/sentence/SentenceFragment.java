package co.example.basicenglish.ui.sentence;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import co.example.basicenglish.GeneralConstants;
import co.example.basicenglish.R;
import co.example.basicenglish.ui.sentence.s1.Sayfa1;
import co.example.basicenglish.ui.sentence.s1.Sayfa1Veri;
import co.example.basicenglish.ui.vocabulary.RecyclerViewClickListener;
import co.example.basicenglish.ui.vocabulary.VocabularyAndSentenceAdapter;
import co.example.basicenglish.ui.vocabulary.VocabularyAndSentenceData;


public class SentenceFragment extends Fragment {

    RecyclerView recyclerViewVocabulary;
    private RecyclerViewClickListener listeners1;
    private int lastPosition;

    public SentenceFragment(){}


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {



        View root = inflater.inflate(R.layout.fragment_vocabulary_sentence, container, false);

        setOnclickListener();

        recyclerViewVocabulary = root.findViewById(R.id.recyclerViewVocabularyAndSentence);

        VocabularyAndSentenceAdapter sentenceAdapter = new VocabularyAndSentenceAdapter(getContext().getApplicationContext(), VocabularyAndSentenceData.getData2(),listeners1);
        recyclerViewVocabulary.setAdapter(sentenceAdapter);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext().getApplicationContext(),2,GridLayoutManager.HORIZONTAL,false);
        recyclerViewVocabulary.setLayoutManager(gridLayoutManager);






        SharedPreferences getPrefs2 = PreferenceManager.getDefaultSharedPreferences(getContext().getApplicationContext());
        lastPosition = getPrefs2.getInt("lastpost",0);
        recyclerViewVocabulary.scrollToPosition(lastPosition);



        recyclerViewVocabulary.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                lastPosition = gridLayoutManager.findFirstVisibleItemPosition();
            }

        });



        return root;
    }

    private void setOnclickListener() {
        listeners1 = new RecyclerViewClickListener() {
            @Override
            public void onClick(int position1, VocabularyAndSentenceData selectedVocabulary) {

                ArrayList<Sayfa1Veri> sayfaBirs = new ArrayList<>();

                if (selectedVocabulary.getTextView1().equals(GeneralConstants.HOSPITAL)) {
                    sayfaBirs.addAll(Sayfa1Veri.getDataHospital());
                }

                Intent vocabulary1 = new Intent(getContext().getApplicationContext(), Sayfa1.class);
                vocabulary1.putExtra(GeneralConstants.SAYFA_BIR_ARR_DATA, sayfaBirs);
                startActivity(vocabulary1);
            }
        };
    }




    public void onPause() {

        super.onPause();

        SharedPreferences getPrefs = PreferenceManager.getDefaultSharedPreferences(getContext().getApplicationContext());
        SharedPreferences.Editor e = getPrefs.edit();
        e.putInt("lastpost",lastPosition);
        e.apply();




    }



}