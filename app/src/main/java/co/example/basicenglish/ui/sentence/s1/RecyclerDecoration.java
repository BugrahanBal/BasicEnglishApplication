package co.example.basicenglish.ui.sentence.s1;

import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;

public class RecyclerDecoration extends ItemDecoration {

        int sidePadding;
        int topPadding;

        public RecyclerDecoration(int sidePadding, int topPadding) {
            this.sidePadding = sidePadding;
            this.topPadding = topPadding;
        }

        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);

            outRect.bottom = topPadding;
            outRect.top = topPadding;

            outRect.left = sidePadding;
            outRect.right = sidePadding;
        }

}
