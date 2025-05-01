package com.join.mgps.customview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.internal.view.SupportMenu;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class WaterProgressView extends View {
    private static final int E = 20;
    private static final int F = 10;
    private int A;
    ValueAnimator B;
    ValueAnimator C;
    Paint D;

    /* renamed from: b  reason: collision with root package name */
    private int f48079b;

    /* renamed from: c  reason: collision with root package name */
    private int f48080c;

    /* renamed from: d  reason: collision with root package name */
    private int f48081d;

    /* renamed from: e  reason: collision with root package name */
    private int f48082e;

    /* renamed from: f  reason: collision with root package name */
    private int f48083f;

    /* renamed from: g  reason: collision with root package name */
    private int f48084g;

    /* renamed from: h  reason: collision with root package name */
    private int f48085h;

    /* renamed from: i  reason: collision with root package name */
    private int f48086i;

    /* renamed from: j  reason: collision with root package name */
    private int f48087j;

    /* renamed from: k  reason: collision with root package name */
    private int f48088k;

    /* renamed from: l  reason: collision with root package name */
    private int f48089l;

    /* renamed from: m  reason: collision with root package name */
    private int f48090m;

    /* renamed from: n  reason: collision with root package name */
    private Paint f48091n;

    /* renamed from: o  reason: collision with root package name */
    private Paint f48092o;

    /* renamed from: p  reason: collision with root package name */
    private Paint f48093p;

    /* renamed from: q  reason: collision with root package name */
    private Paint f48094q;

    /* renamed from: r  reason: collision with root package name */
    private Path f48095r;

    /* renamed from: s  reason: collision with root package name */
    private Path f48096s;

    /* renamed from: t  reason: collision with root package name */
    private Rect f48097t;

    /* renamed from: u  reason: collision with root package name */
    private int f48098u;

    /* renamed from: v  reason: collision with root package name */
    private float f48099v;

    /* renamed from: w  reason: collision with root package name */
    private int f48100w;

    /* renamed from: x  reason: collision with root package name */
    private int f48101x;

    /* renamed from: y  reason: collision with root package name */
    private int f48102y;

    /* renamed from: z  reason: collision with root package name */
    private int f48103z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            WaterProgressView.this.f48098u = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            WaterProgressView.this.invalidate(new Rect(0, 0, WaterProgressView.this.f48089l + 0, WaterProgressView.this.f48090m + 0));
        }
    }

    /* loaded from: classes4.dex */
    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            WaterProgressView.this.f48085h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            WaterProgressView.this.invalidate();
        }
    }

    public WaterProgressView(Context context) {
        this(context, null);
    }

    private void e(Canvas canvas) {
        canvas.save();
        for (int i4 = 0; i4 < 100; i4++) {
            if (i4 < this.f48085h) {
                this.f48091n.setColor(this.f48080c);
            } else {
                this.f48091n.setColor(this.f48079b);
            }
            canvas.rotate(3.6f, this.f48086i / 2, this.f48087j / 2);
            canvas.drawLine(this.f48086i / 2, getPaddingTop(), this.f48086i / 2, getPaddingTop() + 20, this.f48091n);
        }
        canvas.restore();
    }

    private void f(Canvas canvas) {
        this.f48094q.getTextBounds(this.f48085h + "%", 0, (this.f48085h + "%").length(), this.f48097t);
        canvas.drawText(this.f48085h + "%", (this.f48086i / 2) - (this.f48097t.width() / 2), this.f48087j / 2, this.f48094q);
    }

    private void g(Canvas canvas, boolean z4) {
        this.f48095r.reset();
        canvas.save();
        canvas.clipPath(this.f48095r);
        this.f48095r.addCircle(this.f48086i / 2, this.f48087j / 2, this.f48101x, Path.Direction.CCW);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            canvas.clipPath(this.f48095r);
        } else {
            canvas.clipPath(this.f48095r, Region.Op.REPLACE);
        }
        canvas.restore();
        this.f48095r.reset();
        this.f48095r.moveTo(0, this.f48103z);
        if (z4) {
            int i5 = 1;
            while (true) {
                int i6 = this.f48100w;
                if (i5 <= i6 * 3) {
                    int i7 = this.f48102y;
                    int i8 = this.f48098u;
                    int i9 = (((i7 * i5) + 0) - (i7 / 2)) - i8;
                    if (i5 % 2 != 0) {
                        int i10 = this.f48103z;
                        this.f48095r.quadTo(i9, i10 - this.f48099v, ((i7 * i5) + 0) - i8, i10);
                    } else {
                        int i11 = this.f48103z;
                        this.f48095r.quadTo(i9, i11 + this.f48099v, ((i7 * i5) + 0) - i8, i11);
                    }
                    i5++;
                } else {
                    this.f48095r.lineTo(0 + (i6 * 2 * this.f48102y), 0.0f);
                    this.f48095r.lineTo(0.0f, 0.0f);
                    this.f48095r.close();
                    canvas.drawPath(this.f48095r, this.f48092o);
                    return;
                }
            }
        } else {
            this.f48096s.reset();
            canvas.save();
            canvas.clipPath(this.f48096s);
            this.f48096s.addCircle(this.f48086i / 2, this.f48087j / 2, this.f48101x, Path.Direction.CCW);
            if (i4 >= 26) {
                canvas.clipPath(this.f48096s);
            } else {
                canvas.clipPath(this.f48096s, Region.Op.REPLACE);
            }
            canvas.restore();
            this.f48096s.reset();
            this.f48096s.moveTo(0, this.f48103z);
            int i12 = (-this.f48100w) * 2;
            while (true) {
                int i13 = this.f48100w;
                if (i12 <= i13) {
                    int i14 = this.f48102y;
                    int i15 = this.f48098u;
                    int i16 = (((i14 * i12) + 0) - (i14 / 2)) + i15;
                    if (i12 % 2 != 0) {
                        int i17 = this.f48103z;
                        this.f48096s.quadTo(i16, i17 - this.f48099v, (i14 * i12) + 0 + i15, i17);
                    } else {
                        int i18 = this.f48103z;
                        this.f48096s.quadTo(i16, i18 + this.f48099v, (i14 * i12) + 0 + i15, i18);
                    }
                    i12++;
                } else {
                    this.f48096s.lineTo(0 + (i13 * this.f48102y * 2), 0.0f);
                    this.f48096s.lineTo(0.0f, 0.0f);
                    this.f48096s.close();
                    canvas.drawPath(this.f48096s, this.f48093p);
                    return;
                }
            }
        }
    }

    private void h(Canvas canvas, boolean z4) {
        this.D.setStyle(Paint.Style.FILL);
        this.D.setColor(SupportMenu.CATEGORY_MASK);
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        Path path = new Path();
        path.addCircle(width / 2, height / 2, this.f48101x, Path.Direction.CW);
        new Path().addCircle(0.0f, 0.0f, this.f48101x, Path.Direction.CW);
        if (z4) {
            this.f48095r.reset();
            this.f48095r.moveTo(0, this.f48103z);
            int i4 = 1;
            while (true) {
                int i5 = this.f48100w;
                if (i4 <= i5 * 3) {
                    int i6 = this.f48102y;
                    int i7 = this.f48098u;
                    int i8 = (((i6 * i4) + 0) - (i6 / 2)) - i7;
                    if (i4 % 2 != 0) {
                        int i9 = this.f48103z;
                        this.f48095r.quadTo(i8, i9 - this.f48099v, ((i6 * i4) + 0) - i7, i9);
                    } else {
                        int i10 = this.f48103z;
                        this.f48095r.quadTo(i8, i10 + this.f48099v, ((i6 * i4) + 0) - i7, i10);
                    }
                    i4++;
                } else {
                    this.f48095r.lineTo(0 + (i5 * 2 * this.f48102y), 0.0f);
                    this.f48095r.lineTo(0.0f, 0.0f);
                    this.f48095r.close();
                    path.op(this.f48095r, Path.Op.INTERSECT);
                    canvas.drawPath(path, this.f48092o);
                    return;
                }
            }
        } else {
            this.f48096s.reset();
            this.f48096s.moveTo(0, this.f48103z);
            int i11 = (-this.f48100w) * 2;
            while (true) {
                int i12 = this.f48100w;
                if (i11 <= i12) {
                    int i13 = this.f48102y;
                    int i14 = this.f48098u;
                    int i15 = (((i13 * i11) + 0) - (i13 / 2)) + i14;
                    if (i11 % 2 != 0) {
                        int i16 = this.f48103z;
                        this.f48096s.quadTo(i15, i16 - this.f48099v, (i13 * i11) + 0 + i14, i16);
                    } else {
                        int i17 = this.f48103z;
                        this.f48096s.quadTo(i15, i17 + this.f48099v, (i13 * i11) + 0 + i14, i17);
                    }
                    i11++;
                } else {
                    this.f48096s.lineTo(0 + (i12 * this.f48102y * 2), 0.0f);
                    this.f48096s.lineTo(0.0f, 0.0f);
                    this.f48096s.close();
                    path.op(this.f48096s, Path.Op.INTERSECT);
                    canvas.drawPath(path, this.f48093p);
                    return;
                }
            }
        }
    }

    private void i() {
        Paint paint = new Paint();
        this.f48091n = paint;
        paint.setColor(this.f48079b);
        this.f48091n.setStyle(Paint.Style.STROKE);
        this.f48091n.setAntiAlias(true);
        Paint paint2 = new Paint(1);
        this.f48092o = paint2;
        paint2.setAntiAlias(true);
        this.f48092o.setColor(this.f48081d);
        this.f48092o.setStrokeWidth(3.0f);
        this.f48092o.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint3 = new Paint();
        this.f48093p = paint3;
        paint3.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f48093p.setColor(this.f48082e);
        this.f48093p.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.f48094q = paint4;
        paint4.setAntiAlias(true);
        this.f48094q.setColor(this.f48083f);
        this.f48094q.setTextSize(this.f48088k);
        this.f48097t = new Rect();
        this.f48094q.getTextBounds(this.f48085h + "%", 0, (this.f48085h + "%").length(), this.f48097t);
        this.f48095r = new Path();
        this.f48096s = new Path();
    }

    private void j() {
        int i4 = this.f48085h;
        if (i4 < 50) {
            if (i4 < 20) {
                this.f48099v = 30.0f;
            } else {
                this.f48099v = i4 * 0.7f;
            }
        } else if (i4 > 80) {
            this.f48099v = 30.0f;
        } else {
            this.f48099v = (100 - i4) * 0.7f;
        }
    }

    private void m() {
        ValueAnimator ofInt = ValueAnimator.ofInt(0, this.f48102y * this.f48100w * 2);
        this.B = ofInt;
        ofInt.setDuration(this.A);
        this.B.setRepeatCount(-1);
        this.B.setInterpolator(new LinearInterpolator());
        this.B.addUpdateListener(new a());
        this.B.start();
    }

    @RequiresApi(api = 19)
    public void k() {
        this.B.pause();
    }

    @RequiresApi(api = 19)
    public void l() {
        this.B.resume();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i4 = this.f48090m;
        this.f48103z = i4 - ((this.f48085h * i4) / 100);
        h(canvas, false);
        h(canvas, true);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int min = Math.min(size, View.MeasureSpec.getSize(i5));
        if (mode == 1073741824) {
            this.f48086i = min;
        } else {
            this.f48086i = this.f48084g;
        }
        if (mode2 == 1073741824) {
            this.f48087j = min;
        } else {
            this.f48087j = this.f48084g;
        }
        int i6 = this.f48086i;
        this.f48089l = i6;
        int i7 = this.f48087j;
        this.f48090m = i7;
        this.f48102y = i6 / this.f48100w;
        this.f48101x = i6 / 2;
        setMeasuredDimension(i6, i7);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.f48086i = Math.min(i4, i5);
        int min = Math.min(i4, i5);
        this.f48087j = min;
        int i8 = this.f48086i;
        this.f48089l = i8;
        this.f48090m = min;
        this.f48102y = i8 / this.f48100w;
        this.f48101x = i8 / 2;
        m();
    }

    public void setProgress(int i4) {
        if (i4 <= 0 || i4 >= 100) {
            return;
        }
        this.f48085h = i4;
        ValueAnimator ofInt = ValueAnimator.ofInt(i4, i4);
        this.C = ofInt;
        ofInt.setDuration(2000L);
        this.C.addUpdateListener(new b());
        this.C.start();
    }

    public void setWaveTime(int i4) {
        this.A = i4;
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.setDuration(i4);
            this.B.start();
        }
        invalidate();
    }

    public WaterProgressView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WaterProgressView(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f48084g = 300;
        this.f48085h = 0;
        this.f48098u = 0;
        this.f48099v = 30.0f;
        this.f48100w = 2;
        this.A = 2000;
        this.D = new Paint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.WaterProgressView, i4, 0);
        this.f48079b = obtainStyledAttributes.getColor(1, -7829368);
        this.f48080c = obtainStyledAttributes.getColor(2, -16776961);
        this.f48081d = obtainStyledAttributes.getColor(0, -16776961);
        this.f48082e = obtainStyledAttributes.getColor(3, -16711936);
        this.f48083f = obtainStyledAttributes.getColor(4, -16777216);
        this.f48088k = (int) obtainStyledAttributes.getDimension(5, getResources().getDimensionPixelOffset(R.dimen.wdp32));
        this.f48099v = (int) obtainStyledAttributes.getDimension(7, getResources().getDimensionPixelOffset(R.dimen.wdp10));
        this.f48100w = obtainStyledAttributes.getInt(6, 2);
        obtainStyledAttributes.recycle();
        i();
    }
}
