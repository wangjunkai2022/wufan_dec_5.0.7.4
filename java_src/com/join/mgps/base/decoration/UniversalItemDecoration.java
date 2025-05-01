package com.join.mgps.base.decoration;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public abstract class UniversalItemDecoration extends RecyclerView.ItemDecoration {
    private static final String TAG = "UniversalItemDecoration";
    private Map<Integer, b> decorations = new HashMap();

    /* loaded from: classes4.dex */
    public static class a extends b {

        /* renamed from: e  reason: collision with root package name */
        private Paint f46232e;

        /* renamed from: f  reason: collision with root package name */
        public int f46233f = -16777216;

        public a() {
            Paint paint = new Paint(1);
            this.f46232e = paint;
            paint.setStyle(Paint.Style.FILL);
        }

        @Override // com.join.mgps.base.decoration.UniversalItemDecoration.b
        public void a(Canvas canvas, int i4, int i5, int i6, int i7) {
            this.f46232e.setColor(this.f46233f);
            canvas.drawRect(i4, i5, i6, i7, this.f46232e);
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public int f46234a;

        /* renamed from: b  reason: collision with root package name */
        public int f46235b;

        /* renamed from: c  reason: collision with root package name */
        public int f46236c;

        /* renamed from: d  reason: collision with root package name */
        public int f46237d;

        public abstract void a(Canvas canvas, int i4, int i5, int i6, int i7);

        public boolean b(int i4, int i5) {
            return i5 % i4 == 0;
        }

        public boolean c(int i4, int i5) {
            return i5 % i4 == i4 - 1;
        }

        public boolean d(int i4, int i5) {
            return i5 < i4;
        }
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
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        view.setTag(Integer.valueOf(childAdapterPosition));
        b itemOffsets = getItemOffsets(childAdapterPosition);
        if (itemOffsets != null) {
            rect.set(itemOffsets.f46234a, itemOffsets.f46236c, itemOffsets.f46235b, itemOffsets.f46237d);
        }
        this.decorations.put(Integer.valueOf(childAdapterPosition), itemOffsets);
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
                int i5 = bVar.f46237d;
                if (i5 != 0) {
                    bVar.a(canvas, left - bVar.f46234a, bottom, right + bVar.f46235b, bottom + i5);
                }
                int i6 = bVar.f46236c;
                if (i6 != 0) {
                    bVar.a(canvas, left - bVar.f46234a, top - i6, right + bVar.f46235b, top);
                }
                int i7 = bVar.f46234a;
                if (i7 != 0) {
                    bVar.a(canvas, left - i7, top, left, bottom);
                }
                int i8 = bVar.f46235b;
                if (i8 != 0) {
                    bVar.a(canvas, right, top, right + i8, bottom);
                }
            }
        }
    }
}
