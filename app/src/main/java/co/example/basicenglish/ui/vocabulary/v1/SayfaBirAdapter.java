package co.example.basicenglish.ui.vocabulary.v1;

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

public class SayfaBirAdapter extends RecyclerView.Adapter<SayfaBirAdapter.SayfaBirHolder> {

    ArrayList<SayfaBirVeri> mSayfaBirVeri;
    LayoutInflater inflater;
    SayfaBirClickListener msayfaBirClickListener;

    public SayfaBirAdapter(Context context,
                           ArrayList<SayfaBirVeri> sayfaBirVeris,
                           SayfaBirClickListener sayfaBirClickListener ) {
        this.mSayfaBirVeri = sayfaBirVeris;
        inflater = LayoutInflater.from(context);
        this.msayfaBirClickListener = sayfaBirClickListener;
    }

    @NonNull
    @Override
    public SayfaBirAdapter.SayfaBirHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.vocabulary_row,parent,false);
        return new SayfaBirHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SayfaBirAdapter.SayfaBirHolder holder, int position) {

        SayfaBirVeri selectedBirVeri = mSayfaBirVeri.get(position);
        holder.englishWord.setText(selectedBirVeri.getEnglishWord());
        holder.turkishWord.setText(selectedBirVeri.getTurkishWord());
        holder.wordImage.setImageResource(selectedBirVeri.getImageID());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msayfaBirClickListener.onRowClicked(v,position);
            }
        });

        holder.soundImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msayfaBirClickListener.onHeadphonesClicked(position);
            }
        });
    }
    @Override
    public int getItemCount() {
        return mSayfaBirVeri.size();
    }

    public interface SayfaBirClickListener {

        void onRowClicked(View v,int position);
        void onHeadphonesClicked(int position);
    }

    public static class SayfaBirHolder extends RecyclerView.ViewHolder {

        TextView englishWord,turkishWord;
        ImageView wordImage, soundImage;

        public SayfaBirHolder(@NonNull View itemView) {
            super(itemView);

            englishWord = itemView.findViewById(R.id.englishWord);
            turkishWord = itemView.findViewById(R.id.turkishWord);
            wordImage = itemView.findViewById(R.id.productImage);
            soundImage = itemView.findViewById(R.id.sound);


        }
    }
}
