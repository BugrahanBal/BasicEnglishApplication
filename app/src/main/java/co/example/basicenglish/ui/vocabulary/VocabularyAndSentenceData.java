package co.example.basicenglish.ui.vocabulary;

import java.util.ArrayList;

import co.example.basicenglish.GeneralConstants;
import co.example.basicenglish.R;

public class VocabularyAndSentenceData {

    private String textView1;
    private int ImageID1;



    public VocabularyAndSentenceData(String textView1, int imageID1) {
        this.textView1 = textView1;
        this.ImageID1 = imageID1;
    }

    public String getTextView1() {
        return textView1;
    }


    public int getImageID1() {
        return ImageID1;
    }


    public static ArrayList<VocabularyAndSentenceData> getData() {

        ArrayList<VocabularyAndSentenceData> vocabularyAndSentenceDataArrayList = new ArrayList<>();

        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.HOSPITAL,R.drawable.hospital));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.SCHOOL,R.drawable.school));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.COLOR,R.drawable.color));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.BODY,R.drawable.body));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.SPORT,R.drawable.sport));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.JOBS,R.drawable.job));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.ART,R.drawable.art));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.CLOTHES,R.drawable.clothes));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.CULINARY,R.drawable.culinary));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.MUSIC,R.drawable.music));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.FOOD,R.drawable.food));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.DRINK,R.drawable.hospital));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.NUMBER,R.drawable.numbers));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.CHORES,R.drawable.chores));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.TRANSPORTATION,R.drawable.trans));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.NATURE,R.drawable.nature));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.DISASTER,R.drawable.disaster));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.FAMILY,R.drawable.family));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.SEASON,R.drawable.season));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.MONTHS,R.drawable.months));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.EMOTION,R.drawable.emotion));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.HOBBY,R.drawable.hobby));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.EDUCATION,R.drawable.education));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.ANIMAL,R.drawable.animal));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.VEGETABLE,R.drawable.vegetable));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.HOUSE,R.drawable.house));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.FRUIT,R.drawable.fruit));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.POLITICS,R.drawable.politics));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.HEALTH,R.drawable.health));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.SHOPPING,R.drawable.shopping));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.ADJECTIVE,R.drawable.adjective));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.COUNTRY,R.drawable.country));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.CAR,R.drawable.car));


        return vocabularyAndSentenceDataArrayList;
    }
    public static ArrayList<VocabularyAndSentenceData> getData2() {

        ArrayList<VocabularyAndSentenceData> vocabularyAndSentenceDataArrayList = new ArrayList<>();

        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.EDUCATION,R.drawable.education));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.ANIMAL,R.drawable.animal));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.VEGETABLE,R.drawable.vegetable));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.HOUSE,R.drawable.house));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.FRUIT,R.drawable.fruit));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.POLITICS,R.drawable.politics));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.HEALTH,R.drawable.health));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.SHOPPING,R.drawable.shopping));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.ADJECTIVE,R.drawable.adjective));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.COUNTRY,R.drawable.country));
        vocabularyAndSentenceDataArrayList.add(new VocabularyAndSentenceData(GeneralConstants.CAR,R.drawable.car));
        return vocabularyAndSentenceDataArrayList;
    }

}
