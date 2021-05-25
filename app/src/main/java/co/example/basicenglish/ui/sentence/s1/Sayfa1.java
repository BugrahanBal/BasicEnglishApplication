package co.example.basicenglish.ui.sentence.s1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;


import java.util.ArrayList;
import java.util.Locale;

import co.example.basicenglish.GeneralConstants;
import co.example.basicenglish.R;

public class Sayfa1 extends AppCompatActivity {

    RecyclerView recyclerView;

    private Sayfa1Adapter.SayfaBirClickListener listener;
    private TextToSpeech ses;
    ArrayList<Sayfa1Veri> sayfaBirVeris = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ortak_vocabulary);

        Intent intent = getIntent();
        if (intent != null) {
            sayfaBirVeris = (ArrayList<Sayfa1Veri>) intent.getSerializableExtra(GeneralConstants.SAYFA_BIR_ARR_DATA);
        }

        ses = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    int result = ses.setLanguage(( Locale.ENGLISH ));
                    if (result == TextToSpeech.LANG_MISSING_DATA
                            || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.e("TTS", "Language not supported");
                    } else {
                        Log.e("TTS", "Initialization failed");

                    }

                }
            }
        }
        );

        ses.setSpeechRate((float) 0.7);

        setOnclickListener();




        recyclerView = findViewById(R.id.recyclerView);

        Sayfa1Adapter sayfaBirAdapter = new Sayfa1Adapter(this, sayfaBirVeris, listener);
        recyclerView.setAdapter(sayfaBirAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(( LinearLayoutManager.VERTICAL ));
        recyclerView.setLayoutManager(linearLayoutManager);

    }




    private void setOnclickListener() {

        listener = new Sayfa1Adapter.SayfaBirClickListener() {
            @Override
            public void onRowClicked(View v, int position) {

            }

            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onHeadphonesClicked(int position) {
                ses.speak(Sayfa1Veri.getDataHospital().get(position).getEnglishWord(),
                        TextToSpeech.QUEUE_FLUSH,
                        null,
                        null);
            }
        };

    }


}