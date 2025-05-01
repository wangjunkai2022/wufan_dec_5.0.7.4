package com.join.mgps.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import com.join.mgps.customview.SlidingTabLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SlidingTabStrip.java */
/* loaded from: classes4.dex */
public class d0 extends LinearLayout {

    /* renamed from: k  reason: collision with root package name */
    private static final int f48441k = 0;

    /* renamed from: l  reason: collision with root package name */
    private static final byte f48442l = 38;

    /* renamed from: m  reason: collision with root package name */
    private static final int f48443m = 3;

    /* renamed from: n  reason: collision with root package name */
    private static final int f48444n = -13388315;

    /* renamed from: b  reason: collision with root package name */
    private final int f48445b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f48446c;

    /* renamed from: d  reason: collision with root package name */
    private final int f48447d;

    /* renamed from: e  reason: collision with root package name */
    private final Paint f48448e;

    /* renamed from: f  reason: collision with root package name */
    private final int f48449f;

    /* renamed from: g  reason: collision with root package name */
    private int f48450g;

    /* renamed from: h  reason: collision with root package name */
    private float f48451h;

    /* renamed from: i  reason: collision with root package name */
    private SlidingTabLayout.d f48452i;

    /* renamed from: j  reason: collision with root package name */
    private final b f48453j;

    /* compiled from: SlidingTabStrip.java */
    /* loaded from: classes4.dex */
    private static class b implements SlidingTabLayout.d {

        /* renamed from: a  reason: collision with root package name */
        private int[] f48454a;

        private b() {
        }

        @Override // com.join.mgps.customview.SlidingTabLayout.d
        public final int a(int i4) {
            int[] iArr = this.f48454a;
            return iArr[i4 % iArr.length];
        }

        void b(int... iArr) {
            this.f48454a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(Context context) {
        this(context, null);
    }

    private static int a(int i4, int i5, float f5) {
        float f6 = 1.0f - f5;
        return Color.rgb((int) ((Color.red(i4) * f5) + (Color.red(i5) * f6)), (int) ((Color.green(i4) * f5) + (Color.green(i5) * f6)), (int) ((Color.blue(i4) * f5) + (Color.blue(i5) * f6)));
    }

    private static int c(int i4, byte b5) {
        return Color.argb((int) b5, Color.red(i4), Color.green(i4), Color.blue(i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i4, float f5) {
        this.f48450g = i4;
        this.f48451h = f5;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(SlidingTabLayout.d dVar) {
        this.f48452i = dVar;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(int... iArr) {
        this.f48452i = null;
        this.f48453j.b(iArr);
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        int height = getHeight();
        int childCount = getChildCount();
        SlidingTabLayout.d dVar = this.f48452i;
        if (dVar == null) {
            dVar = this.f48453j;
        }
        if (childCount > 0) {
            View childAt = getChildAt(this.f48450g);
            int left = childAt.getLeft();
            int right = childAt.getRight();
            int a5 = dVar.a(this.f48450g);
            if (this.f48451h > 0.0f && this.f48450g < getChildCount() - 1) {
                int a6 = dVar.a(this.f48450g + 1);
                if (a5 != a6) {
                    a5 = a(a6, a5, this.f48451h);
                }
                View childAt2 = getChildAt(this.f48450g + 1);
                float left2 = this.f48451h * childAt2.getLeft();
                float f5 = this.f48451h;
                left = (int) (left2 + ((1.0f - f5) * left));
                right = (int) ((f5 * childAt2.getRight()) + ((1.0f - this.f48451h) * right));
            }
            this.f48448e.setColor(a5);
            canvas.drawRect(left, height - this.f48447d, right, height, this.f48448e);
        }
        canvas.drawRect(0.0f, height - this.f48445b, getWidth(), height, this.f48446c);
    }

    d0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        float f5 = getResources().getDisplayMetrics().density;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842800, typedValue, true);
        int c5 = c(typedValue.data, f48442l);
        this.f48449f = c5;
        b bVar = new b();
        this.f48453j = bVar;
        bVar.b(f48444n);
        this.f48445b = (int) (0.0f * f5);
        Paint paint = new Paint();
        this.f48446c = paint;
        paint.setColor(c5);
        this.f48447d = (int) (f5 * 3.0f);
        this.f48448e = new Paint();
    }
}
