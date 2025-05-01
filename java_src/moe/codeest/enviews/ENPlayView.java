package moe.codeest.enviews;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnticipateInterpolator;
import com.papa.gsyvideoplayer.R;
/* loaded from: classes7.dex */
public class ENPlayView extends View {

    /* renamed from: r  reason: collision with root package name */
    public static int f71648r = 0;

    /* renamed from: s  reason: collision with root package name */
    public static int f71649s = 1;

    /* renamed from: t  reason: collision with root package name */
    public static int f71650t = -1;

    /* renamed from: u  reason: collision with root package name */
    public static int f71651u = -328966;

    /* renamed from: v  reason: collision with root package name */
    public static int f71652v = 4;

    /* renamed from: w  reason: collision with root package name */
    public static int f71653w = 4;

    /* renamed from: x  reason: collision with root package name */
    public static int f71654x = 1200;

    /* renamed from: b  reason: collision with root package name */
    private int f71655b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f71656c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f71657d;

    /* renamed from: e  reason: collision with root package name */
    private int f71658e;

    /* renamed from: f  reason: collision with root package name */
    private int f71659f;

    /* renamed from: g  reason: collision with root package name */
    private int f71660g;

    /* renamed from: h  reason: collision with root package name */
    private int f71661h;

    /* renamed from: i  reason: collision with root package name */
    private int f71662i;

    /* renamed from: j  reason: collision with root package name */
    private RectF f71663j;

    /* renamed from: k  reason: collision with root package name */
    private RectF f71664k;

    /* renamed from: l  reason: collision with root package name */
    private float f71665l;

    /* renamed from: m  reason: collision with root package name */
    private Path f71666m;

    /* renamed from: n  reason: collision with root package name */
    private Path f71667n;

    /* renamed from: o  reason: collision with root package name */
    private PathMeasure f71668o;

    /* renamed from: p  reason: collision with root package name */
    private float f71669p;

    /* renamed from: q  reason: collision with root package name */
    private int f71670q;

    /* loaded from: classes7.dex */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ENPlayView.this.f71665l = 1.0f - valueAnimator.getAnimatedFraction();
            ENPlayView.this.invalidate();
        }
    }

    /* loaded from: classes7.dex */
    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ENPlayView.this.f71665l = valueAnimator.getAnimatedFraction();
            ENPlayView.this.invalidate();
        }
    }

    public ENPlayView(Context context) {
        super(context);
        this.f71655b = f71649s;
        this.f71665l = 1.0f;
    }

    private int b(int i4) {
        return (int) TypedValue.applyDimension(1, i4, getContext().getResources().getDisplayMetrics());
    }

    public void c() {
        int i4 = this.f71655b;
        int i5 = f71649s;
        if (i4 == i5) {
            return;
        }
        this.f71655b = i5;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 100.0f);
        ofFloat.setDuration(this.f71670q);
        ofFloat.setInterpolator(new AnticipateInterpolator());
        ofFloat.addUpdateListener(new b());
        if (ofFloat.isRunning()) {
            return;
        }
        ofFloat.start();
    }

    public void d() {
        int i4 = this.f71655b;
        int i5 = f71648r;
        if (i4 == i5) {
            return;
        }
        this.f71655b = i5;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 100.0f);
        ofFloat.setDuration(this.f71670q);
        ofFloat.setInterpolator(new AnticipateInterpolator());
        ofFloat.addUpdateListener(new a());
        if (ofFloat.isRunning()) {
            return;
        }
        ofFloat.start();
    }

    public int getCurrentState() {
        return this.f71655b;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f71660g, this.f71661h, this.f71658e / 2, this.f71657d);
        float f5 = this.f71665l;
        if (f5 < 0.0f) {
            int i4 = this.f71660g;
            int i5 = this.f71662i;
            int i6 = this.f71661h;
            canvas.drawLine(i4 + i5, (i6 - (i5 * 1.6f)) + (i5 * 10 * f5), i4 + i5, i6 + (i5 * 1.6f) + (i5 * 10 * f5), this.f71656c);
            int i7 = this.f71660g;
            int i8 = this.f71662i;
            int i9 = this.f71661h;
            canvas.drawLine(i7 - i8, i9 - (i8 * 1.6f), i7 - i8, i9 + (i8 * 1.6f), this.f71656c);
            canvas.drawArc(this.f71664k, -105.0f, 360.0f, false, this.f71656c);
        } else if (f5 <= 0.3d) {
            int i10 = this.f71660g;
            int i11 = this.f71662i;
            int i12 = this.f71661h;
            canvas.drawLine(i10 + i11, (i12 - (i11 * 1.6f)) + (((i11 * 3.2f) / 0.3f) * f5), i10 + i11, i12 + (i11 * 1.6f), this.f71656c);
            int i13 = this.f71660g;
            int i14 = this.f71662i;
            int i15 = this.f71661h;
            canvas.drawLine(i13 - i14, i15 - (i14 * 1.6f), i13 - i14, i15 + (i14 * 1.6f), this.f71656c);
            float f6 = this.f71665l;
            if (f6 != 0.0f) {
                canvas.drawArc(this.f71663j, 0.0f, f6 * 600.0f, false, this.f71656c);
            }
            RectF rectF = this.f71664k;
            float f7 = this.f71665l;
            canvas.drawArc(rectF, (f7 * 360.0f) - 105.0f, (1.0f - f7) * 360.0f, false, this.f71656c);
        } else if (f5 <= 0.6d) {
            canvas.drawArc(this.f71663j, (f5 - 0.3f) * 600.0f, 180.0f - ((f5 - 0.3f) * 600.0f), false, this.f71656c);
            this.f71667n.reset();
            PathMeasure pathMeasure = this.f71668o;
            float f8 = this.f71669p;
            pathMeasure.getSegment(0.02f * f8, (0.38f * f8) + (((f8 * 0.42f) / 0.3f) * (this.f71665l - 0.3f)), this.f71667n, true);
            canvas.drawPath(this.f71667n, this.f71656c);
            RectF rectF2 = this.f71664k;
            float f9 = this.f71665l;
            canvas.drawArc(rectF2, (f9 * 360.0f) - 105.0f, (1.0f - f9) * 360.0f, false, this.f71656c);
        } else if (f5 <= 0.8d) {
            this.f71667n.reset();
            PathMeasure pathMeasure2 = this.f71668o;
            float f10 = this.f71669p;
            float f11 = this.f71665l;
            pathMeasure2.getSegment((0.02f * f10) + (((f10 * 0.2f) / 0.2f) * (f11 - 0.6f)), (0.8f * f10) + (((f10 * 0.2f) / 0.2f) * (f11 - 0.6f)), this.f71667n, true);
            canvas.drawPath(this.f71667n, this.f71656c);
            RectF rectF3 = this.f71664k;
            float f12 = this.f71665l;
            canvas.drawArc(rectF3, (f12 * 360.0f) - 105.0f, (1.0f - f12) * 360.0f, false, this.f71656c);
        } else {
            this.f71667n.reset();
            this.f71668o.getSegment(this.f71662i * 10 * (this.f71665l - 1.0f), this.f71669p, this.f71667n, true);
            canvas.drawPath(this.f71667n, this.f71656c);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        int i8 = (i4 * 9) / 10;
        this.f71658e = i8;
        this.f71659f = (i5 * 9) / 10;
        this.f71662i = i8 / b(4);
        this.f71660g = i4 / 2;
        this.f71661h = i5 / 2;
        int i9 = this.f71660g;
        int i10 = this.f71662i;
        int i11 = this.f71661h;
        this.f71663j = new RectF(i9 - i10, i11 + (i10 * 0.6f), i9 + i10, i11 + (i10 * 2.6f));
        int i12 = this.f71660g;
        int i13 = this.f71658e;
        int i14 = this.f71661h;
        int i15 = this.f71659f;
        this.f71664k = new RectF(i12 - (i13 / 2), i14 - (i15 / 2), i12 + (i13 / 2), i14 + (i15 / 2));
        Path path = this.f71666m;
        int i16 = this.f71660g;
        int i17 = this.f71662i;
        path.moveTo(i16 - i17, this.f71661h + (i17 * 1.8f));
        Path path2 = this.f71666m;
        int i18 = this.f71660g;
        int i19 = this.f71662i;
        path2.lineTo(i18 - i19, this.f71661h - (i19 * 1.8f));
        this.f71666m.lineTo(this.f71660g + this.f71662i, this.f71661h);
        this.f71666m.close();
        this.f71668o.setPath(this.f71666m, false);
        this.f71669p = this.f71668o.getLength();
    }

    public void setDuration(int i4) {
        this.f71670q = i4;
    }

    public ENPlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f71655b = f71649s;
        this.f71665l = 1.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.play);
        int color = obtainStyledAttributes.getColor(R.styleable.play_play_line_color, f71650t);
        int color2 = obtainStyledAttributes.getColor(R.styleable.play_play_bg_line_color, f71651u);
        int integer = obtainStyledAttributes.getInteger(R.styleable.play_play_line_width, b(f71652v));
        int integer2 = obtainStyledAttributes.getInteger(R.styleable.play_play_bg_line_width, b(f71653w));
        obtainStyledAttributes.recycle();
        setLayerType(1, null);
        Paint paint = new Paint(1);
        this.f71656c = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f71656c.setStrokeCap(Paint.Cap.ROUND);
        this.f71656c.setColor(color);
        this.f71656c.setStrokeWidth(integer);
        this.f71656c.setPathEffect(new CornerPathEffect(1.0f));
        Paint paint2 = new Paint(1);
        this.f71657d = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f71657d.setStrokeCap(Paint.Cap.ROUND);
        this.f71657d.setColor(color2);
        this.f71657d.setStrokeWidth(integer2);
        this.f71666m = new Path();
        this.f71667n = new Path();
        this.f71668o = new PathMeasure();
        this.f71670q = f71654x;
    }
}
