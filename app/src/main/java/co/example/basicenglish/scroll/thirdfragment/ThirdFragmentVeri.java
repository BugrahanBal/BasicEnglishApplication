package co.example.basicenglish.scroll.thirdfragment;

import java.io.Serializable;
import java.util.ArrayList;

import co.example.basicenglish.R;


public class ThirdFragmentVeri implements Serializable {

    private String englishWord;
    private int imageID;


    public ThirdFragmentVeri (String englishWord, int imageID) {
        this.englishWord = englishWord;
        this.imageID = imageID;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public int getImageID() {
        return imageID;
    }


    public static ArrayList<ThirdFragmentVeri> getDataImage() {

        ArrayList<ThirdFragmentVeri> thirdFragmentVeris = new ArrayList<>();

        thirdFragmentVeris.add(new ThirdFragmentVeri("London Eye", R.drawable.ambulance));
        thirdFragmentVeris.add(new ThirdFragmentVeri("Tower Bridge ", R.drawable.art));


        return thirdFragmentVeris;
    }

}
