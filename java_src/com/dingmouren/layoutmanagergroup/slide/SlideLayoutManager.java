package com.dingmouren.layoutmanagergroup.slide;

import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.MotionEventCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
/* loaded from: classes2.dex */
public class SlideLayoutManager extends RecyclerView.LayoutManager {

    /* renamed from: a  reason: collision with root package name */
    private RecyclerView f10196a;

    /* renamed from: b  reason: collision with root package name */
    private ItemTouchHelper f10197b;

    /* renamed from: c  reason: collision with root package name */
    private View.OnTouchListener f10198c = new a();

    /* loaded from: classes2.dex */
    class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            RecyclerView.ViewHolder childViewHolder = SlideLayoutManager.this.f10196a.getChildViewHolder(view);
            if (MotionEventCompat.getActionMasked(motionEvent) == 0) {
                SlideLayoutManager.this.f10197b.startSwipe(childViewHolder);
                return false;
            }
            return false;
        }
    }

    public SlideLayoutManager(@NonNull RecyclerView recyclerView, @NonNull ItemTouchHelper itemTouchHelper) {
        this.f10196a = (RecyclerView) c(recyclerView);
        this.f10197b = (ItemTouchHelper) c(itemTouchHelper);
    }

    private <T> T c(T t4) {
        Objects.requireNonNull(t4);
        return t4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i4;
        detachAndScrapAttachedViews(recycler);
        int itemCount = getItemCount();
        if (itemCount <= 3) {
            for (int i5 = itemCount - 1; i5 >= 0; i5--) {
                View viewForPosition = recycler.getViewForPosition(i5);
                addView(viewForPosition);
                measureChildWithMargins(viewForPosition, 0, 0);
                int width = (getWidth() - getDecoratedMeasuredWidth(viewForPosition)) / 2;
                int height = (getHeight() - getDecoratedMeasuredHeight(viewForPosition)) / 5;
                layoutDecoratedWithMargins(viewForPosition, width, height, width + getDecoratedMeasuredWidth(viewForPosition), height + getDecoratedMeasuredHeight(viewForPosition));
                if (i5 > 0) {
                    float f5 = 1.0f - (i5 * 0.1f);
                    viewForPosition.setScaleX(f5);
                    viewForPosition.setScaleY(f5);
                    viewForPosition.setTranslationY((viewForPosition.getMeasuredHeight() * i5) / 14);
                } else {
                    viewForPosition.setOnTouchListener(this.f10198c);
                }
            }
            return;
        }
        for (int i6 = 3; i6 >= 0; i6--) {
            View viewForPosition2 = recycler.getViewForPosition(i6);
            addView(viewForPosition2);
            measureChildWithMargins(viewForPosition2, 0, 0);
            int width2 = (getWidth() - getDecoratedMeasuredWidth(viewForPosition2)) / 2;
            int height2 = (getHeight() - getDecoratedMeasuredHeight(viewForPosition2)) / 5;
            layoutDecoratedWithMargins(viewForPosition2, width2, height2, width2 + getDecoratedMeasuredWidth(viewForPosition2), height2 + getDecoratedMeasuredHeight(viewForPosition2));
            if (i6 == 3) {
                float f6 = 1.0f - ((i6 - 1) * 0.1f);
                viewForPosition2.setScaleX(f6);
                viewForPosition2.setScaleY(f6);
                viewForPosition2.setTranslationY((i4 * viewForPosition2.getMeasuredHeight()) / 14);
            } else if (i6 > 0) {
                float f7 = 1.0f - (i6 * 0.1f);
                viewForPosition2.setScaleX(f7);
                viewForPosition2.setScaleY(f7);
                viewForPosition2.setTranslationY((viewForPosition2.getMeasuredHeight() * i6) / 14);
            } else {
                viewForPosition2.setOnTouchListener(this.f10198c);
            }
        }
    }
}
