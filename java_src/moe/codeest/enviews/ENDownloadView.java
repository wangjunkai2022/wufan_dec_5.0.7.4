package moe.codeest.enviews;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import com.papa.gsyvideoplayer.R;
/* loaded from: classes7.dex */
public class ENDownloadView extends View {
    public static final int A = 2;
    public static final int B = 3;
    private static final int C = -1;
    private static final int D = -12959931;
    private static final int E = -1;
    private static final int F = 9;
    private static final int G = 9;
    private static final int H = 14;
    private static final int I = 0;
    private static final int J = 2;
    private static final int K = 2000;
    private static final DownloadUnit L = DownloadUnit.B;

    /* renamed from: y  reason: collision with root package name */
    public static final int f71616y = 0;

    /* renamed from: z  reason: collision with root package name */
    public static final int f71617z = 1;

    /* renamed from: b  reason: collision with root package name */
    private h f71618b;

    /* renamed from: c  reason: collision with root package name */
    private int f71619c;

    /* renamed from: d  reason: collision with root package name */
    private float f71620d;

    /* renamed from: e  reason: collision with root package name */
    private double f71621e;

    /* renamed from: f  reason: collision with root package name */
    private double f71622f;

    /* renamed from: g  reason: collision with root package name */
    private int f71623g;

    /* renamed from: h  reason: collision with root package name */
    private int f71624h;

    /* renamed from: i  reason: collision with root package name */
    private DownloadUnit f71625i;

    /* renamed from: j  reason: collision with root package name */
    private Paint f71626j;

    /* renamed from: k  reason: collision with root package name */
    private Paint f71627k;

    /* renamed from: l  reason: collision with root package name */
    private Paint f71628l;

    /* renamed from: m  reason: collision with root package name */
    private Path f71629m;

    /* renamed from: n  reason: collision with root package name */
    private RectF f71630n;

    /* renamed from: o  reason: collision with root package name */
    private RectF f71631o;

    /* renamed from: p  reason: collision with root package name */
    ValueAnimator f71632p;

    /* renamed from: q  reason: collision with root package name */
    private float f71633q;

    /* renamed from: r  reason: collision with root package name */
    private float f71634r;

    /* renamed from: s  reason: collision with root package name */
    private float f71635s;

    /* renamed from: t  reason: collision with root package name */
    private float f71636t;

    /* renamed from: u  reason: collision with root package name */
    private float f71637u;

    /* renamed from: v  reason: collision with root package name */
    private float f71638v;

    /* renamed from: w  reason: collision with root package name */
    private float f71639w;

    /* renamed from: x  reason: collision with root package name */
    private float f71640x;

    /* loaded from: classes7.dex */
    public enum DownloadUnit {
        GB,
        MB,
        KB,
        B,
        NONE
    }

    /* loaded from: classes7.dex */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ENDownloadView.this.f71633q = valueAnimator.getAnimatedFraction();
            ENDownloadView.this.invalidate();
        }
    }

    /* loaded from: classes7.dex */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ENDownloadView.this.f71619c = 1;
            ENDownloadView.this.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ENDownloadView.this.f71633q = valueAnimator.getAnimatedFraction();
            if (ENDownloadView.this.f71625i != DownloadUnit.NONE && ENDownloadView.this.f71622f > 0.0d) {
                ENDownloadView eNDownloadView = ENDownloadView.this;
                double d5 = eNDownloadView.f71633q;
                double d6 = ENDownloadView.this.f71622f;
                Double.isNaN(d5);
                eNDownloadView.f71621e = d5 * d6;
            }
            ENDownloadView.this.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ENDownloadView.this.f71619c = 1;
            ENDownloadView.this.i();
        }
    }

    /* loaded from: classes7.dex */
    class e implements ValueAnimator.AnimatorUpdateListener {
        e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ENDownloadView.this.f71633q = valueAnimator.getAnimatedFraction();
            ENDownloadView.this.invalidate();
        }
    }

    /* loaded from: classes7.dex */
    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ENDownloadView.this.f71633q = 0.0f;
            ENDownloadView.this.f71619c = 3;
            if (ENDownloadView.this.f71618b != null) {
                ENDownloadView.this.f71618b.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class g {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f71647a;

        static {
            int[] iArr = new int[DownloadUnit.values().length];
            f71647a = iArr;
            try {
                iArr[DownloadUnit.GB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71647a[DownloadUnit.MB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71647a[DownloadUnit.KB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f71647a[DownloadUnit.B.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes7.dex */
    interface h {
        void a();

        void b();
    }

    public ENDownloadView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        ValueAnimator valueAnimator = this.f71632p;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f71632p.removeAllUpdateListeners();
            if (this.f71632p.isRunning()) {
                this.f71632p.cancel();
            }
            this.f71632p = null;
        }
        if (this.f71619c != 1) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 100.0f);
        this.f71632p = ofFloat;
        ofFloat.setDuration(this.f71624h);
        this.f71632p.setInterpolator(new LinearInterpolator());
        this.f71632p.addUpdateListener(new c());
        this.f71632p.addListener(new d());
        this.f71632p.start();
    }

    private void j() {
        ValueAnimator valueAnimator = this.f71632p;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f71632p.removeAllUpdateListeners();
            if (this.f71632p.isRunning()) {
                this.f71632p.cancel();
            }
            this.f71632p = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 100.0f);
        this.f71632p = ofFloat;
        ofFloat.setDuration(700L);
        this.f71632p.setInterpolator(new OvershootInterpolator());
        this.f71632p.addUpdateListener(new e());
        this.f71632p.addListener(new f());
        this.f71632p.start();
    }

    private String k(DownloadUnit downloadUnit) {
        int i4 = g.f71647a[downloadUnit.ordinal()];
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? " b" : " kb" : " mb" : " gb";
    }

    public int getCurrentState() {
        return this.f71619c;
    }

    public void l() {
        ValueAnimator valueAnimator = this.f71632p;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f71632p.removeAllUpdateListeners();
            if (this.f71632p.isRunning()) {
                this.f71632p.cancel();
            }
            this.f71632p = null;
        }
    }

    public void m() {
        this.f71633q = 0.0f;
        this.f71619c = 0;
        ValueAnimator valueAnimator = this.f71632p;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f71632p.removeAllUpdateListeners();
            if (this.f71632p.isRunning()) {
                this.f71632p.cancel();
            }
            this.f71632p = null;
        }
    }

    public void n() {
        ValueAnimator valueAnimator = this.f71632p;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f71632p.removeAllUpdateListeners();
            if (this.f71632p.isRunning()) {
                this.f71632p.cancel();
            }
            this.f71632p = null;
        }
        this.f71619c = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 100.0f);
        this.f71632p = ofFloat;
        ofFloat.setDuration(1500L);
        this.f71632p.setInterpolator(new OvershootInterpolator());
        this.f71632p.addUpdateListener(new a());
        this.f71632p.addListener(new b());
        this.f71632p.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i4 = this.f71619c;
        if (i4 == 0) {
            float f5 = this.f71633q;
            if (f5 <= 0.4d) {
                canvas.drawCircle(this.f71636t, this.f71637u, this.f71639w, this.f71627k);
                float f6 = this.f71636t;
                float f7 = this.f71638v;
                float f8 = this.f71637u;
                canvas.drawLine(f6 - f7, f8, f6, f8 + f7, this.f71626j);
                float f9 = this.f71636t;
                float f10 = this.f71637u;
                float f11 = this.f71638v;
                canvas.drawLine(f9, f10 + f11, f9 + f11, f10, this.f71626j);
                float f12 = this.f71636t;
                float f13 = this.f71637u;
                float f14 = this.f71638v;
                float f15 = this.f71633q;
                canvas.drawLine(f12, (f13 + f14) - (((f14 * 1.3f) / 0.4f) * f15), f12, (f13 - (1.6f * f14)) + (((f14 * 1.3f) / 0.4f) * f15), this.f71626j);
                return;
            } else if (f5 <= 0.6d) {
                canvas.drawCircle(this.f71636t, this.f71637u, this.f71639w, this.f71627k);
                canvas.drawCircle(this.f71636t, this.f71637u - (this.f71638v * 0.3f), 2.0f, this.f71626j);
                float f16 = this.f71636t;
                float f17 = this.f71638v;
                float f18 = this.f71633q;
                float f19 = this.f71637u;
                canvas.drawLine((f16 - f17) - (((f17 * 1.2f) / 0.2f) * (f18 - 0.4f)), f19, f16, (f19 + f17) - ((f17 / 0.2f) * (f18 - 0.4f)), this.f71626j);
                float f20 = this.f71636t;
                float f21 = this.f71637u;
                float f22 = this.f71638v;
                float f23 = this.f71633q;
                canvas.drawLine(f20, (f21 + f22) - ((f22 / 0.2f) * (f23 - 0.4f)), f20 + f22 + (((f22 * 1.2f) / 0.2f) * (f23 - 0.4f)), f21, this.f71626j);
                return;
            } else if (f5 <= 1.0f) {
                canvas.drawCircle(this.f71636t, this.f71637u, this.f71639w, this.f71627k);
                float f24 = this.f71636t;
                float f25 = this.f71637u;
                float f26 = this.f71638v;
                canvas.drawCircle(f24, (f25 - (f26 * 0.3f)) - (((this.f71639w - (f26 * 0.3f)) / 0.4f) * (this.f71633q - 0.6f)), 2.0f, this.f71626j);
                float f27 = this.f71636t;
                float f28 = this.f71638v;
                float f29 = this.f71637u;
                canvas.drawLine(f27 - (f28 * 2.2f), f29, f27 + (f28 * 2.2f), f29, this.f71626j);
                return;
            } else {
                canvas.drawCircle(this.f71636t, this.f71637u, this.f71639w, this.f71627k);
                canvas.drawCircle(this.f71636t, (this.f71637u - this.f71639w) - ((this.f71638v * 3.0f) * (this.f71633q - 1.0f)), 3.0f, this.f71626j);
                float f30 = this.f71636t;
                float f31 = this.f71638v;
                float f32 = this.f71637u;
                canvas.drawLine(f30 - (f31 * 2.2f), f32, f30 + (f31 * 2.2f), f32, this.f71626j);
                return;
            }
        }
        if (i4 == 1) {
            float f33 = this.f71633q;
            if (f33 <= 0.2d) {
                this.f71628l.setTextSize((this.f71623g / 0.2f) * f33);
            }
            canvas.drawCircle(this.f71636t, this.f71637u, this.f71639w, this.f71627k);
            canvas.drawArc(this.f71630n, -90.0f, this.f71633q * 359.99f, false, this.f71626j);
            this.f71629m.reset();
            float f34 = this.f71620d + 2.0f;
            this.f71620d = f34;
            float f35 = this.f71636t;
            float f36 = this.f71640x;
            if (f34 > f35 - (6.0f * f36)) {
                this.f71620d = f35 - (f36 * 10.0f);
            }
            this.f71629m.moveTo(this.f71620d, this.f71637u);
            for (int i5 = 0; i5 < 4; i5++) {
                Path path = this.f71629m;
                float f37 = this.f71640x;
                path.rQuadTo(f37, (-(1.0f - this.f71633q)) * f37, f37 * 2.0f, 0.0f);
                Path path2 = this.f71629m;
                float f38 = this.f71640x;
                path2.rQuadTo(f38, (1.0f - this.f71633q) * f38, f38 * 2.0f, 0.0f);
            }
            canvas.save();
            canvas.clipRect(this.f71631o);
            canvas.drawPath(this.f71629m, this.f71626j);
            canvas.restore();
            DownloadUnit downloadUnit = DownloadUnit.NONE;
        } else if (i4 != 2) {
            if (i4 != 3) {
                return;
            }
            canvas.drawCircle(this.f71636t, this.f71637u, this.f71639w, this.f71627k);
            float f39 = this.f71636t;
            float f40 = this.f71638v;
            float f41 = this.f71637u;
            float f42 = this.f71633q;
            canvas.drawLine(f39 - f40, f41, (f40 * 0.5f * f42) + (f39 - (f40 * 0.5f)), (f40 * 0.65f) + f41 + (f40 * 0.35f * f42), this.f71626j);
            float f43 = this.f71636t;
            float f44 = this.f71638v;
            float f45 = this.f71633q;
            float f46 = this.f71637u;
            canvas.drawLine((f43 - (f44 * 0.5f)) + (f44 * 0.5f * f45), (f44 * 0.65f) + f46 + (f44 * 0.35f * f45), (f43 + (1.2f * f44)) - ((0.2f * f44) * f45), (f46 - (f44 * 1.3f)) + (f44 * 1.3f * f45), this.f71626j);
            float f47 = this.f71636t;
            float f48 = this.f71638v;
            float f49 = this.f71633q;
            float f50 = this.f71637u;
            canvas.drawLine((f47 - (f48 * 0.5f)) + (f48 * 0.5f * f49), (f48 * 0.65f) + f50 + (0.35f * f48 * f49), (0.5f * f48 * f49) + (f47 - (f48 * 0.5f)), (f50 + (0.65f * f48)) - ((f48 * 2.25f) * f49), this.f71626j);
        } else {
            canvas.drawCircle(this.f71636t, this.f71637u, this.f71639w, this.f71626j);
            float f51 = this.f71633q;
            if (f51 <= 0.5d) {
                Paint paint = this.f71628l;
                int i6 = this.f71623g;
                paint.setTextSize(i6 - ((i6 / 0.2f) * f51));
            } else {
                this.f71628l.setTextSize(0.0f);
            }
            if (this.f71625i != DownloadUnit.NONE && this.f71621e > 0.0d) {
                canvas.drawText(String.format("%.2f", Double.valueOf(this.f71621e)) + k(this.f71625i), this.f71636t, this.f71637u + (this.f71638v * 1.4f), this.f71628l);
            }
            float f52 = this.f71636t;
            float f53 = this.f71638v;
            float f54 = this.f71633q;
            float f55 = this.f71637u;
            canvas.drawLine((f52 - (f53 * 2.2f)) + (1.2f * f53 * f54), f55, f52 - (f53 * 0.5f), f55 + (f53 * 0.5f * f54 * 1.3f), this.f71626j);
            float f56 = this.f71636t;
            float f57 = this.f71638v;
            float f58 = this.f71637u;
            float f59 = this.f71633q;
            canvas.drawLine(f56 - (f57 * 0.5f), f58 + (0.5f * f57 * f59 * 1.3f), (f56 + (2.2f * f57)) - (f57 * f59), f58 - ((f57 * f59) * 1.3f), this.f71626j);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        float f5 = i4;
        this.f71634r = f5;
        float f6 = i5;
        this.f71635s = f6;
        float f7 = f5 / 2.0f;
        this.f71636t = f7;
        this.f71637u = f6 / 2.0f;
        float f8 = (f5 * 5.0f) / 12.0f;
        this.f71639w = f8;
        float f9 = f8 / 3.0f;
        this.f71638v = f9;
        float f10 = (f9 * 4.4f) / 12.0f;
        this.f71640x = f10;
        this.f71620d = f7 - (f10 * 10.0f);
        float f11 = this.f71636t;
        float f12 = this.f71639w;
        float f13 = this.f71637u;
        this.f71630n = new RectF(f11 - f12, f13 - f12, f11 + f12, f13 + f12);
        float f14 = this.f71636t;
        float f15 = this.f71640x;
        this.f71631o = new RectF(f14 - (f15 * 6.0f), 0.0f, f14 + (f15 * 6.0f), this.f71635s);
    }

    public void setDownloadConfig(int i4, double d5, DownloadUnit downloadUnit) {
        this.f71624h = i4;
        this.f71622f = d5;
        this.f71625i = downloadUnit;
    }

    public void setOnDownloadStateListener(h hVar) {
        this.f71618b = hVar;
    }

    public ENDownloadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.download);
        int color = obtainStyledAttributes.getColor(R.styleable.download_download_line_color, -1);
        int color2 = obtainStyledAttributes.getColor(R.styleable.download_download_bg_line_color, D);
        int color3 = obtainStyledAttributes.getColor(R.styleable.download_download_text_color, -1);
        int integer = obtainStyledAttributes.getInteger(R.styleable.download_download_line_width, 9);
        int integer2 = obtainStyledAttributes.getInteger(R.styleable.download_download_bg_line_width, 9);
        int integer3 = obtainStyledAttributes.getInteger(R.styleable.download_download_text_size, 14);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f71626j = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f71626j.setStrokeCap(Paint.Cap.ROUND);
        this.f71626j.setStrokeWidth(integer);
        this.f71626j.setColor(color);
        Paint paint2 = new Paint(1);
        this.f71627k = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f71627k.setStrokeCap(Paint.Cap.ROUND);
        this.f71627k.setStrokeWidth(integer2);
        this.f71627k.setColor(color2);
        Paint paint3 = new Paint(1);
        this.f71628l = paint3;
        paint3.setColor(color3);
        this.f71628l.setTextSize(integer3);
        this.f71628l.setTextAlign(Paint.Align.CENTER);
        this.f71629m = new Path();
        this.f71623g = integer3;
        this.f71619c = 0;
        this.f71625i = L;
        this.f71624h = 2000;
    }
}
