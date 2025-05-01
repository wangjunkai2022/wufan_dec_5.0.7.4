package com.join.mgps.base.decoration;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public abstract class GridDecoration extends RecyclerView.ItemDecoration {
    private static final String TAG = "UniversalItemDecoration";
    public Map<Integer, b> decorations = new HashMap();
    private int mTotalColumn = -1;
    private GridLayoutManager mGridLayoutManager = null;

    /* loaded from: classes4.dex */
    public static class a extends b {

        /* renamed from: g  reason: collision with root package name */
        private Paint f46224g;

        /* renamed from: h  reason: collision with root package name */
        public int f46225h;

        public a(int i4) {
            super(i4);
            this.f46225h = -16777216;
            Paint paint = new Paint(1);
            this.f46224g = paint;
            paint.setStyle(Paint.Style.FILL);
        }

        @Override // com.join.mgps.base.decoration.GridDecoration.b
        public void a(Canvas canvas, int i4, int i5, int i6, int i7) {
            this.f46224g.setColor(this.f46225h);
            canvas.drawRect(i4, i5, i6, i7, this.f46224g);
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        protected int f46226a;

        /* renamed from: b  reason: collision with root package name */
        protected int f46227b;

        /* renamed from: c  reason: collision with root package name */
        public int f46228c;

        /* renamed from: d  reason: collision with root package name */
        public int f46229d;

        /* renamed from: e  reason: collision with root package name */
        public int f46230e;

        /* renamed from: f  reason: collision with root package name */
        public int f46231f;

        public b(int i4) {
            this.f46226a = i4;
        }

        public abstract void a(Canvas canvas, int i4, int i5, int i6, int i7);
    }

    public static int string2Int(String str, int i4) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i4;
        }
    }

    public abstract b getItemOffsets(int i4);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (this.mGridLayoutManager == null) {
            this.mGridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
        }
        if (this.mTotalColumn == -1) {
            this.mTotalColumn = this.mGridLayoutManager.getSpanCount();
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        view.setTag(Integer.valueOf(childAdapterPosition));
        b itemOffsets = getItemOffsets(childAdapterPosition);
        if (itemOffsets != null) {
            if (childAdapterPosition == 0) {
                itemOffsets.f46227b = 0;
            } else {
                int i4 = childAdapterPosition - 1;
                b bVar = this.decorations.get(Integer.valueOf(i4));
                if (bVar != null) {
                    if (itemOffsets.f46226a == this.mTotalColumn && !isRight(i4, bVar.f46226a)) {
                        int i5 = bVar.f46227b;
                        int i6 = this.mTotalColumn;
                        itemOffsets.f46227b = bVar.f46226a + i5 + (i6 - (i5 % i6));
                    } else {
                        itemOffsets.f46227b = bVar.f46227b + bVar.f46226a;
                    }
                } else {
                    itemOffsets.f46227b = 0;
                }
            }
            rect.set(itemOffsets.f46228c, itemOffsets.f46230e, itemOffsets.f46229d, itemOffsets.f46231f);
        }
        this.decorations.put(Integer.valueOf(childAdapterPosition), itemOffsets);
    }

    public boolean isLeft(int i4) {
        int i5;
        return i4 == 0 || (i5 = i4 - 1) < 0 || this.decorations.get(Integer.valueOf(i5)) == null || (this.decorations.get(Integer.valueOf(i5)).f46227b + this.decorations.get(Integer.valueOf(i5)).f46226a) % this.mTotalColumn == 0;
    }

    public boolean isRight(int i4, int i5) {
        if (i4 > 0) {
            int i6 = i4 - 1;
            if (this.decorations.get(Integer.valueOf(i6)) == null) {
                return false;
            }
            int i7 = this.decorations.get(Integer.valueOf(i6)).f46227b + this.decorations.get(Integer.valueOf(i6)).f46226a;
            int i8 = this.mTotalColumn;
            return (i7 % i8) + i5 == i8;
        }
        return false;
    }

    public boolean isTop(int i4, int i5) {
        return i5 < i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            b bVar = this.decorations.get(Integer.valueOf(string2Int(childAt.getTag().toString(), 0)));
            if (bVar != null) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                int left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                int top = childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                int i5 = bVar.f46231f;
                if (i5 != 0) {
                    bVar.a(canvas, left - bVar.f46228c, bottom, right + bVar.f46229d, bottom + i5);
                }
                int i6 = bVar.f46230e;
                if (i6 != 0) {
                    bVar.a(canvas, left - bVar.f46228c, top - i6, right + bVar.f46229d, top);
                }
                int i7 = bVar.f46228c;
                if (i7 != 0) {
                    bVar.a(canvas, left - i7, top, left, bottom);
                }
                int i8 = bVar.f46229d;
                if (i8 != 0) {
                    bVar.a(canvas, right, top, right + i8, bottom);
                }
            }
        }
    }
}
