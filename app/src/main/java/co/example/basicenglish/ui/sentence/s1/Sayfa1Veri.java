package co.example.basicenglish.ui.sentence.s1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import co.example.basicenglish.R;

public class Sayfa1Veri implements Serializable {

    private String englishWord;
    private String turkishWord;


    public Sayfa1Veri(String englishWord, String turkishWord) {
        this.englishWord = englishWord;
        this.turkishWord = turkishWord;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public String getTurkishWord() {
        return turkishWord;
    }


    public static ArrayList<Sayfa1Veri> getDataHospital() {

        ArrayList<Sayfa1Veri> sayfaBirVeris = new ArrayList<>();

        sayfaBirVeris.add(new Sayfa1Veri("skirt","etek"));
        sayfaBirVeris.add(new Sayfa1Veri("how are you are u married ? ","kazak"));


        return sayfaBirVeris;
    }


}
