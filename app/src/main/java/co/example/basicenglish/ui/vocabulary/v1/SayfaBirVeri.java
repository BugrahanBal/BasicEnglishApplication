package co.example.basicenglish.ui.vocabulary.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import co.example.basicenglish.R;

public class SayfaBirVeri implements Serializable {

    private String englishWord;
    private String turkishWord;
    private int imageID;

    public SayfaBirVeri(String englishWord, String turkishWord, int imageID) {
        this.englishWord = englishWord;
        this.turkishWord = turkishWord;
        this.imageID = imageID;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public String getTurkishWord() {
        return turkishWord;
    }

    public int getImageID() {
        return imageID;
    }

    public static ArrayList<SayfaBirVeri> getDataHospital() {

        ArrayList<SayfaBirVeri> sayfaBirVeris = new ArrayList<>();

        sayfaBirVeris.add(new SayfaBirVeri("coat","ceket",R.drawable.purple));
        sayfaBirVeris.add(new SayfaBirVeri("notebook","defter",R.drawable.notebook));
        sayfaBirVeris.add(new SayfaBirVeri("pencil","kalem",R.drawable.pencil));
        sayfaBirVeris.add(new SayfaBirVeri("shoes","ayakkabı",R.drawable.shoes));
        sayfaBirVeris.add(new SayfaBirVeri("skirt","etek",R.drawable.skirt));
        sayfaBirVeris.add(new SayfaBirVeri("sweater","kazak",R.drawable.sweater));
        sayfaBirVeris.add(new SayfaBirVeri("teacher","öğretmen",R.drawable.teacher));
        sayfaBirVeris.add(new SayfaBirVeri("notebook","defter",R.drawable.notebook));
        sayfaBirVeris.add(new SayfaBirVeri("pencil","kalem",R.drawable.pencil));
        sayfaBirVeris.add(new SayfaBirVeri("shoes","ayakkabı",R.drawable.shoes));
        sayfaBirVeris.add(new SayfaBirVeri("skirt","etek",R.drawable.skirt));
        sayfaBirVeris.add(new SayfaBirVeri("sweater","kazak",R.drawable.sweater));


        return sayfaBirVeris;
    }

    public static ArrayList<SayfaBirVeri> getDataSchool() {

        ArrayList<SayfaBirVeri> sayfaBirVeris = new ArrayList<>();

        sayfaBirVeris.add(new SayfaBirVeri("coat","ceket",R.drawable.coat));
        sayfaBirVeris.add(new SayfaBirVeri("notebook","defter",R.drawable.notebook));
        sayfaBirVeris.add(new SayfaBirVeri("pencil","kalem",R.drawable.pencil));
        sayfaBirVeris.add(new SayfaBirVeri("shoes","ayakkabı",R.drawable.shoes));
        sayfaBirVeris.add(new SayfaBirVeri("skirt","etek",R.drawable.skirt));
        sayfaBirVeris.add(new SayfaBirVeri("sweater","kazak",R.drawable.sweater));
        sayfaBirVeris.add(new SayfaBirVeri("teacher","öğretmen",R.drawable.teacher));
        sayfaBirVeris.add(new SayfaBirVeri("notebook","defter",R.drawable.notebook));
        sayfaBirVeris.add(new SayfaBirVeri("pencil","kalem",R.drawable.pencil));
        sayfaBirVeris.add(new SayfaBirVeri("shoes","ayakkabı",R.drawable.shoes));
        sayfaBirVeris.add(new SayfaBirVeri("skirt","etek",R.drawable.skirt));
        sayfaBirVeris.add(new SayfaBirVeri("sweater","kazak",R.drawable.sweater));

        return sayfaBirVeris;
    }

    public static ArrayList<SayfaBirVeri> getData3() {

        ArrayList<SayfaBirVeri> sayfaBirVeris = new ArrayList<>();

        sayfaBirVeris.add(new SayfaBirVeri("coat","ceket",R.drawable.coat));
        sayfaBirVeris.add(new SayfaBirVeri("notebook","defter",R.drawable.notebook));
        sayfaBirVeris.add(new SayfaBirVeri("pencil","kalem",R.drawable.pencil));
        sayfaBirVeris.add(new SayfaBirVeri("shoes","ayakkabı",R.drawable.shoes));
        sayfaBirVeris.add(new SayfaBirVeri("skirt","etek",R.drawable.skirt));
        sayfaBirVeris.add(new SayfaBirVeri("sweater","kazak",R.drawable.sweater));
        sayfaBirVeris.add(new SayfaBirVeri("teacher","öğretmen",R.drawable.teacher));
        sayfaBirVeris.add(new SayfaBirVeri("notebook","defter",R.drawable.notebook));
        sayfaBirVeris.add(new SayfaBirVeri("pencil","kalem",R.drawable.pencil));
        sayfaBirVeris.add(new SayfaBirVeri("shoes","ayakkabı",R.drawable.shoes));
        sayfaBirVeris.add(new SayfaBirVeri("skirt","etek",R.drawable.skirt));
        sayfaBirVeris.add(new SayfaBirVeri("sweater","kazak",R.drawable.sweater));

        return sayfaBirVeris;
    }
}
