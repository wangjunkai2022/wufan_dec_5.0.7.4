package com.join.mgps.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.join.mgps.customview.SlidingTabLayout2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SlidingTabStrip2.java */
/* loaded from: classes4.dex */
public class e0 extends LinearLayout {

    /* renamed from: k  reason: collision with root package name */
    private static final int f48458k = 0;

    /* renamed from: l  reason: collision with root package name */
    private static final byte f48459l = 38;

    /* renamed from: m  reason: collision with root package name */
    private static final int f48460m = 3;

    /* renamed from: n  reason: collision with root package name */
    private static final int f48461n = -13388315;

    /* renamed from: b  reason: collision with root package name */
    private final int f48462b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f48463c;

    /* renamed from: d  reason: collision with root package name */
    private final int f48464d;

    /* renamed from: e  reason: collision with root package name */
    private final Paint f48465e;

    /* renamed from: f  reason: collision with root package name */
    private final int f48466f;

    /* renamed from: g  reason: collision with root package name */
    private int f48467g;

    /* renamed from: h  reason: collision with root package name */
    private float f48468h;

    /* renamed from: i  reason: collision with root package name */
    private SlidingTabLayout2.d f48469i;

    /* renamed from: j  reason: collision with root package name */
    private final b f48470j;

    /* compiled from: SlidingTabStrip2.java */
    /* loaded from: classes4.dex */
    private static class b implements SlidingTabLayout2.d {

        /* renamed from: a  reason: collision with root package name */
        private int[] f48471a;

        private b() {
        }

        @Override // com.join.mgps.customview.SlidingTabLayout2.d
        public final int a(int i4) {
            int[] iArr = this.f48471a;
            return iArr[i4 % iArr.length];
        }

        void b(int... iArr) {
            this.f48471a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0(Context context) {
        this(context, null);
    }

    private static int a(int i4, int i5, float f5) {
        float f6 = 1.0f - f5;
        return Color.rgb((int) ((Color.red(i4) * f5) + (Color.red(i5) * f6)), (int) ((Color.green(i4) * f5) + (Color.green(i5) * f6)), (int) ((Color.blue(i4) * f5) + (Color.blue(i5) * f6)));
    }

    private static int d(int i4, byte b5) {
        return Color.argb((int) b5, Color.red(i4), Color.green(i4), Color.blue(i4));
    }

    public int b(float f5) {
        Paint paint = new Paint();
        paint.setTextSize(f5);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return ((int) Math.ceil(fontMetrics.descent - fontMetrics.top)) + 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(int i4, float f5) {
        this.f48467g = i4;
        this.f48468h = f5;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(SlidingTabLayout2.d dVar) {
        this.f48469i = dVar;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(int... iArr) {
        this.f48469i = null;
        this.f48470j.b(iArr);
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        int i4;
        int height = getHeight();
        int childCount = getChildCount();
        SlidingTabLayout2.d dVar = this.f48469i;
        if (dVar == null) {
            dVar = this.f48470j;
        }
        if (childCount > 0) {
            View childAt = getChildAt(this.f48467g);
            int left = childAt.getLeft();
            int right = childAt.getRight();
            int a5 = dVar.a(this.f48467g);
            if (this.f48468h > 0.0f && this.f48467g < getChildCount() - 1) {
                int a6 = dVar.a(this.f48467g + 1);
                if (a5 != a6) {
                    a5 = a(a6, a5, this.f48468h);
                }
                View childAt2 = getChildAt(this.f48467g + 1);
                float left2 = this.f48468h * childAt2.getLeft();
                float f5 = this.f48468h;
                left = (int) (left2 + ((1.0f - f5) * left));
                right = (int) ((f5 * childAt2.getRight()) + ((1.0f - this.f48468h) * right));
            }
            this.f48465e.setColor(a5);
            if (childAt instanceof TextView) {
                int b5 = b(((TextView) childAt).getTextSize());
                this.f48465e.setAntiAlias(true);
                this.f48465e.setStrokeWidth(2.0f);
                this.f48465e.setStyle(Paint.Style.STROKE);
                float a7 = com.join.mgps.Util.c0.a(getContext(), 6.0f);
                RectF rectF = new RectF();
                rectF.left = left + com.join.mgps.Util.c0.a(getContext(), 1.0f);
                rectF.top = ((height - b5) / 2) * 1;
                rectF.right = right - com.join.mgps.Util.c0.a(getContext(), 1.0f);
                rectF.bottom = height - i4;
                canvas.drawRoundRect(rectF, a7, a7, this.f48465e);
            } else {
                canvas.drawRect(left, height - this.f48464d, right, height, this.f48465e);
            }
        }
        canvas.drawRect(0.0f, height - this.f48462b, getWidth(), height, this.f48463c);
    }

    e0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        float f5 = getResources().getDisplayMetrics().density;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842800, typedValue, true);
        int d5 = d(typedValue.data, f48459l);
        this.f48466f = d5;
        b bVar = new b();
        this.f48470j = bVar;
        bVar.b(f48461n);
        this.f48462b = (int) (0.0f * f5);
        Paint paint = new Paint();
        this.f48463c = paint;
        paint.setColor(d5);
        this.f48464d = (int) (f5 * 3.0f);
        this.f48465e = new Paint();
    }
}
