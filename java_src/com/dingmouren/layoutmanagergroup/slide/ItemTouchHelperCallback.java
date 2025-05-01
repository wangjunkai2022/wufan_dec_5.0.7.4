package com.dingmouren.layoutmanagergroup.slide;

import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Objects;
/* loaded from: classes2.dex */
public class ItemTouchHelperCallback<T> extends ItemTouchHelper.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final RecyclerView.Adapter f10193a;

    /* renamed from: b  reason: collision with root package name */
    private List<T> f10194b;

    /* renamed from: c  reason: collision with root package name */
    private b<T> f10195c;

    /* JADX WARN: Multi-variable type inference failed */
    public ItemTouchHelperCallback(@NonNull RecyclerView.Adapter adapter, @NonNull List<T> list) {
        this.f10193a = (RecyclerView.Adapter) a(adapter);
        this.f10194b = (List) a(list);
    }

    private <T> T a(T t4) {
        Objects.requireNonNull(t4);
        return t4;
    }

    private float b(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        return recyclerView.getWidth() * getSwipeThreshold(viewHolder);
    }

    public void c(b<T> bVar) {
        this.f10195c = bVar;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        super.clearView(recyclerView, viewHolder);
        viewHolder.itemView.setRotation(0.0f);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        return ItemTouchHelper.Callback.makeMovementFlags(0, recyclerView.getLayoutManager() instanceof SlideLayoutManager ? 12 : 0);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isItemViewSwipeEnabled() {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f5, float f6, int i4, boolean z4) {
        super.onChildDraw(canvas, recyclerView, viewHolder, f5, f6, i4, z4);
        View view = viewHolder.itemView;
        if (i4 == 1) {
            float b5 = f5 / b(recyclerView, viewHolder);
            if (b5 > 1.0f) {
                b5 = 1.0f;
            } else if (b5 < -1.0f) {
                b5 = -1.0f;
            }
            view.setRotation(15.0f * b5);
            int childCount = recyclerView.getChildCount();
            if (childCount > 3) {
                for (int i5 = 1; i5 < childCount - 1; i5++) {
                    View childAt = recyclerView.getChildAt(i5);
                    float f7 = (childCount - i5) - 1;
                    float f8 = 1.0f - (f7 * 0.1f);
                    childAt.setScaleX((Math.abs(b5) * 0.1f) + f8);
                    childAt.setScaleY(f8 + (Math.abs(b5) * 0.1f));
                    childAt.setTranslationY(((f7 - Math.abs(b5)) * view.getMeasuredHeight()) / 14.0f);
                }
            } else {
                for (int i6 = 0; i6 < childCount - 1; i6++) {
                    View childAt2 = recyclerView.getChildAt(i6);
                    float f9 = (childCount - i6) - 1;
                    float f10 = 1.0f - (f9 * 0.1f);
                    childAt2.setScaleX((Math.abs(b5) * 0.1f) + f10);
                    childAt2.setScaleY(f10 + (Math.abs(b5) * 0.1f));
                    childAt2.setTranslationY(((f9 - Math.abs(b5)) * view.getMeasuredHeight()) / 14.0f);
                }
            }
            b<T> bVar = this.f10195c;
            if (bVar != null) {
                if (b5 != 0.0f) {
                    bVar.b(viewHolder, b5, b5 < 0.0f ? 4 : 8);
                } else {
                    bVar.b(viewHolder, b5, 1);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i4) {
        b<T> bVar;
        viewHolder.itemView.setOnTouchListener(null);
        T remove = this.f10194b.remove(viewHolder.getLayoutPosition());
        this.f10193a.notifyDataSetChanged();
        b<T> bVar2 = this.f10195c;
        if (bVar2 != null) {
            bVar2.a(viewHolder, remove, i4 == 4 ? 1 : 4);
        }
        if (this.f10193a.getItemCount() != 0 || (bVar = this.f10195c) == null) {
            return;
        }
        bVar.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ItemTouchHelperCallback(@NonNull RecyclerView.Adapter adapter, @NonNull List<T> list, b<T> bVar) {
        this.f10193a = (RecyclerView.Adapter) a(adapter);
        this.f10194b = (List) a(list);
        this.f10195c = bVar;
    }
}
