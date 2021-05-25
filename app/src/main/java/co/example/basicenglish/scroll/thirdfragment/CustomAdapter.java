package co.example.basicenglish.scroll.thirdfragment;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import co.example.basicenglish.R;


public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomHolder>{

    ArrayList<ThirdFragmentVeri> mThirdFragmentVeri;
    LayoutInflater inflater;

    public CustomAdapter(Context context,ArrayList<ThirdFragmentVeri> thirdFragmentVeris){
        this.mThirdFragmentVeri = thirdFragmentVeris;
        inflater = LayoutInflater.from(context);
    }




    @NonNull
    @Override
    public CustomAdapter.CustomHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.third_fragment_gorunum,parent,false);
        return new CustomHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.CustomHolder holder, int position) {

        ThirdFragmentVeri selectedVeri = mThirdFragmentVeri.get(position);

        holder.textView.setText(selectedVeri.getEnglishWord());
        holder.imageView.setImageResource(selectedVeri.getImageID());


    }

    @Override
    public int getItemCount() {
        return mThirdFragmentVeri.size();
    }

    public static class CustomHolder extends RecyclerView.ViewHolder {

        TextView textView;
        ImageView imageView;

        public CustomHolder(@NonNull View itemView) {
            super(itemView);

            textView= itemView.findViewById(R.id.thirdfragmenText);
            imageView=itemView.findViewById(R.id.thirdfragmentView);
        }
    }


}

