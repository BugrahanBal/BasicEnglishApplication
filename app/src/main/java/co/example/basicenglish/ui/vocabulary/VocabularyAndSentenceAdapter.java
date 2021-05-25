package co.example.basicenglish.ui.vocabulary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import co.example.basicenglish.R;

public class VocabularyAndSentenceAdapter extends RecyclerView.Adapter<VocabularyAndSentenceAdapter.VocabularyHolder> {

    ArrayList<VocabularyAndSentenceData> mVocabularyAndSentenceData;
    LayoutInflater inflater;

    private RecyclerViewClickListener listener1;

    public VocabularyAndSentenceAdapter(Context context, ArrayList<VocabularyAndSentenceData> vocabularyAndSentenceData, RecyclerViewClickListener listener){
        this.mVocabularyAndSentenceData = vocabularyAndSentenceData;
        inflater = LayoutInflater.from(context);
        this.listener1 = listener;
    }

    @NonNull
    @Override
    public VocabularyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.vocabulary_sentence_anasayfa_row,parent,false);
        VocabularyHolder holder = new VocabularyHolder(view); 
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull VocabularyHolder holder, int position) {

        VocabularyAndSentenceData selectedVocabularyAndSentenceData = mVocabularyAndSentenceData.get(position) ;

        holder.imageView1.setImageResource(selectedVocabularyAndSentenceData.getImageID1());
        holder.textView1.setText(selectedVocabularyAndSentenceData.getTextView1());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener1.onClick(position, selectedVocabularyAndSentenceData);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mVocabularyAndSentenceData.size();
    }

    public class VocabularyHolder extends RecyclerView.ViewHolder{

        TextView textView1;
        ImageView imageView1;

        public VocabularyHolder(@NonNull View itemView) {
            super(itemView);

            textView1 = itemView.findViewById(R.id.textView1);
            imageView1 = itemView.findViewById(R.id.productImage);

        }
    }
}
