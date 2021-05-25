package co.example.basicenglish.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

import co.example.basicenglish.R;


public class QuizActivity extends AppCompatActivity {


    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;

    private String mAnswer;
    private int mScore = 0;
    private int questionNumber ;
    private int randomListIndexNumber = 0  ;


    // random soruları her seferinde cagırmak yerine random olarak bir kere liste olusturup
    // o listeden soruları indexleyerek cek
    // her seferinde index icin random soru çekme ... ( random cok calısmıs olur )

    ArrayList<Integer> soruListe = getRandom();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);

        updateQuestion();


        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){


                if (mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optiona
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });


        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){


                if (mButtonChoice2.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });




        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){


                if (mButtonChoice3.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });


    }

    private void updateQuestion(){


       //int i = 0;
       // while (i < soruListe.size()){

        questionNumber = soruListe.get(randomListIndexNumber);

        mQuestionView.setText(mQuestionLibrary.getQuestion(questionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(questionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(questionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(questionNumber));
        mAnswer = mQuestionLibrary.getCorrectAnswer(questionNumber);
       // i++;




        randomListIndexNumber++;

    }


    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }

    private ArrayList getRandom() {

        Random random = new Random();
        ArrayList<Integer> randomList = new ArrayList<>();
        while (randomList.size() != 6) {
            int randomSayi = random.nextInt(10);
            if (!( randomList.contains(randomSayi) )) {
                randomList.add(randomSayi);
            }
        }

        return randomList;
    }

}