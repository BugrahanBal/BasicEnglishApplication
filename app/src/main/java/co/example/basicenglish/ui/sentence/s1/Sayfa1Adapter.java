package co.example.basicenglish.ui.sentence.s1;

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

public class Sayfa1Adapter extends RecyclerView.Adapter<Sayfa1Adapter.Sayfa1Holder> {

    ArrayList<Sayfa1Veri> mSayfaBirVeri;
    LayoutInflater inflater;
    SayfaBirClickListener msayfaBirClickListener;

    public Sayfa1Adapter(Context context,
                           ArrayList<Sayfa1Veri> sayfaBirVeris,
                           SayfaBirClickListener sayfaBirClickListener ) {
        this.mSayfaBirVeri = sayfaBirVeris;
        inflater = LayoutInflater.from(context);
        this.msayfaBirClickListener = sayfaBirClickListener;
    }

    @NonNull
    @Override
    public Sayfa1Adapter.Sayfa1Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.sentence_row,parent,false);
        return new Sayfa1Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Sayfa1Adapter.Sayfa1Holder holder, int position) {

        Sayfa1Veri selectedBirVeri = mSayfaBirVeri.get(position);

        holder.englishWord.setText(selectedBirVeri.getEnglishWord());
        holder.turkishWord.setText(selectedBirVeri.getTurkishWord());


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

    public static class Sayfa1Holder extends RecyclerView.ViewHolder {

        TextView englishWord,turkishWord;
        ImageView  soundImage;

        public Sayfa1Holder(@NonNull View itemView) {
            super(itemView);

            englishWord = itemView.findViewById(R.id.englishWord);
            turkishWord = itemView.findViewById(R.id.turkishWord);
            soundImage = itemView.findViewById(R.id.sound);


        }
    }
}
