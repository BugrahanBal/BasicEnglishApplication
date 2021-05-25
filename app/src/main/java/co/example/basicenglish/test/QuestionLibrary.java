package co.example.basicenglish.test;

public class QuestionLibrary {

    private String mQuestions [] = {
            "Which part of the plant holds it in the soil?",
            "This part of the plant absorbs energy from the sun.",
            "This part of the plant attracts bees, butterflies and hummingbirds.",
            "The _______ holds the plant upright.",
            "11111111111111111111111111111111",
            "222222222222222222222222222",
            "2222222222222222222222222222222223333333333333.",
            "55555555555555555555.",
            "666666666666666666666",
            "7777777777777777777777",
            "T88888888888888",
            "999999999999999999999"

    };


    private String mChoices [][] = {
            {"Roots", "Stem", "Flower"},
            {"Fruit", "Leaves", "Seeds"},
            {"Bark", "Flower", "Roots"},
            {"Flower", "Lvfsfv", "Stem"},
            {"Roots", "33333", "Flower"},
            {"Fruit", "44444", "Seeds"},
            {"Bark", "55555", "Roots"},
            {"Flower", "Leagfrwves", "Stem"},
            {"Roots", "666", "Flower"},
            {"Fruit", "44444", "Seeds"},
            {"Bark", "232", "Roots"},
            {"Flower", "r3", "Stem"},
    };



    private String mCorrectAnswers[] = {"Roots", "Leaves", "Flower", "Stem","33333","44444","55555","Stem","666","44444","232","r3"};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}