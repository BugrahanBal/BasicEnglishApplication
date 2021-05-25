package co.example.basicenglish.ui.vocabulary;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import co.example.basicenglish.GeneralConstants;
import co.example.basicenglish.R;
import co.example.basicenglish.ui.sentence.s1.RecyclerDecoration;
import co.example.basicenglish.ui.vocabulary.v1.SayfaBir;
import co.example.basicenglish.ui.vocabulary.v1.SayfaBirVeri;

public class VocabularyFragment extends Fragment {

    RecyclerView recyclerViewVocabulary;
    private RecyclerViewClickListener listenerv1;
    private int lastPosition;

    public VocabularyFragment() {
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        //ViewModel yapısı LiveData nesnesi ile çok uyumlu bir şekilde çalışmaktadır.
        // Bu nesnenin Observable yapısı sayesin
        // ullanılabilir.
        View root = inflater.inflate(R.layout.fragment_vocabulary_sentence, container, false);

        setOnclicListener();

        recyclerViewVocabulary = root.findViewById(R.id.recyclerViewVocabularyAndSentence);

        //If the size of the RecyclerView (the RecyclerView itself)doesn't depend on the adapter content:mRecyclerView.setHasFixedSize(true);
        // depends on the adapter content:mRecyclerView.setHasFixedSize(false);

        recyclerViewVocabulary.setHasFixedSize(true);
        recyclerViewVocabulary.setItemAnimator(new DefaultItemAnimator());

        VocabularyAndSentenceAdapter vocabularyAdapter = new VocabularyAndSentenceAdapter(getContext().getApplicationContext(), VocabularyAndSentenceData.getData(), listenerv1);
        recyclerViewVocabulary.setAdapter(vocabularyAdapter);

        int sidePadding = getResources().getDimensionPixelSize(R.dimen.sidePadding);
        int topPadding = getResources().getDimensionPixelSize(R.dimen.topPadding);

        recyclerViewVocabulary.addItemDecoration(new RecyclerDecoration(sidePadding, topPadding));


        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext().getApplicationContext(), 2, GridLayoutManager.VERTICAL, false);
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


    private void setOnclicListener() {
        listenerv1 = new RecyclerViewClickListener() {
            @Override
            public void onClick(int position, VocabularyAndSentenceData selectedVocabulary) {

                ArrayList<SayfaBirVeri> sayfaBirs = new ArrayList<>();

                if (selectedVocabulary.getTextView1().equals(GeneralConstants.HOSPITAL)) {
                    sayfaBirs.addAll(SayfaBirVeri.getDataHospital());
                } else if (selectedVocabulary.getTextView1().equals(GeneralConstants.SCHOOL)) {
                    sayfaBirs.addAll(SayfaBirVeri.getDataSchool());
                }

                Intent vocabulary1 = new Intent(getContext().getApplicationContext(), SayfaBir.class);
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