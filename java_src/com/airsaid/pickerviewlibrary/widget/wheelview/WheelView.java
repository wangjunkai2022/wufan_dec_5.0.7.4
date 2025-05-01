package com.airsaid.pickerviewlibrary.widget.wheelview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.airsaid.pickerviewlibrary.R;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class WheelView extends View {
    static final float O = 1.4f;
    private static final int P = 5;
    private static final float Q = 0.8f;
    private static final float R = 6.0f;
    int A;
    int B;
    int C;
    int D;
    int E;
    int F;
    int G;
    private int H;
    private float I;
    long J;
    int K;
    private int L;
    private int M;
    private int N;

    /* renamed from: b  reason: collision with root package name */
    Context f4471b;

    /* renamed from: c  reason: collision with root package name */
    Handler f4472c;

    /* renamed from: d  reason: collision with root package name */
    private GestureDetector f4473d;

    /* renamed from: e  reason: collision with root package name */
    f.c f4474e;

    /* renamed from: f  reason: collision with root package name */
    ScheduledExecutorService f4475f;

    /* renamed from: g  reason: collision with root package name */
    private ScheduledFuture<?> f4476g;

    /* renamed from: h  reason: collision with root package name */
    Paint f4477h;

    /* renamed from: i  reason: collision with root package name */
    Paint f4478i;

    /* renamed from: j  reason: collision with root package name */
    Paint f4479j;

    /* renamed from: k  reason: collision with root package name */
    e.c f4480k;

    /* renamed from: l  reason: collision with root package name */
    private String f4481l;

    /* renamed from: m  reason: collision with root package name */
    int f4482m;

    /* renamed from: n  reason: collision with root package name */
    int f4483n;

    /* renamed from: o  reason: collision with root package name */
    int f4484o;

    /* renamed from: p  reason: collision with root package name */
    float f4485p;

    /* renamed from: q  reason: collision with root package name */
    int f4486q;

    /* renamed from: r  reason: collision with root package name */
    int f4487r;

    /* renamed from: s  reason: collision with root package name */
    int f4488s;

    /* renamed from: t  reason: collision with root package name */
    boolean f4489t;

    /* renamed from: u  reason: collision with root package name */
    float f4490u;

    /* renamed from: v  reason: collision with root package name */
    float f4491v;

    /* renamed from: w  reason: collision with root package name */
    float f4492w;

    /* renamed from: x  reason: collision with root package name */
    int f4493x;

    /* renamed from: y  reason: collision with root package name */
    int f4494y;

    /* renamed from: z  reason: collision with root package name */
    private int f4495z;

    /* loaded from: classes2.dex */
    public enum ACTION {
        CLICK,
        FLING,
        DAGGLE
    }

    public WheelView(Context context) {
        this(context, null);
    }

    private String b(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof g.a) {
            return ((g.a) obj).a();
        }
        return obj.toString();
    }

    private int c(int i4) {
        if (i4 < 0) {
            return c(i4 + this.f4480k.a());
        }
        return i4 > this.f4480k.a() + (-1) ? c(i4 - this.f4480k.a()) : i4;
    }

    private void e(Context context) {
        this.f4471b = context;
        this.f4472c = new c(this);
        GestureDetector gestureDetector = new GestureDetector(context, new b(this));
        this.f4473d = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f4489t = false;
        this.f4493x = 0;
        this.f4494y = -1;
        f();
    }

    private void f() {
        Paint paint = new Paint();
        this.f4477h = paint;
        paint.setColor(this.f4486q);
        this.f4477h.setAntiAlias(true);
        this.f4477h.setTypeface(Typeface.MONOSPACE);
        this.f4477h.setTextSize(this.f4482m);
        Paint paint2 = new Paint();
        this.f4478i = paint2;
        paint2.setColor(this.f4487r);
        this.f4478i.setAntiAlias(true);
        this.f4478i.setTextScaleX(1.1f);
        this.f4478i.setTypeface(Typeface.MONOSPACE);
        this.f4478i.setTextSize(this.f4482m);
        Paint paint3 = new Paint();
        this.f4479j = paint3;
        paint3.setColor(this.f4488s);
        this.f4479j.setAntiAlias(true);
        if (Build.VERSION.SDK_INT >= 11) {
            setLayerType(1, null);
        }
    }

    private void g() {
        Rect rect = new Rect();
        for (int i4 = 0; i4 < this.f4480k.a(); i4++) {
            String b5 = b(this.f4480k.getItem(i4));
            this.f4478i.getTextBounds(b5, 0, b5.length(), rect);
            int width = rect.width();
            if (width > this.f4483n) {
                this.f4483n = width;
            }
            this.f4478i.getTextBounds("星期", 0, 2, rect);
            int height = rect.height();
            if (height > this.f4484o) {
                this.f4484o = height;
            }
        }
        this.f4485p = this.f4484o * O;
    }

    private void h(String str) {
        Rect rect = new Rect();
        this.f4478i.getTextBounds(str, 0, str.length(), rect);
        int i4 = this.L;
        if (i4 == 3) {
            this.M = 0;
        } else if (i4 == 5) {
            this.M = this.E - rect.width();
        } else if (i4 != 17) {
        } else {
            double width = this.E - rect.width();
            Double.isNaN(width);
            this.M = (int) (width * 0.5d);
        }
    }

    private void i(String str) {
        Rect rect = new Rect();
        this.f4477h.getTextBounds(str, 0, str.length(), rect);
        int i4 = this.L;
        if (i4 == 3) {
            this.N = 0;
        } else if (i4 == 5) {
            this.N = this.E - rect.width();
        } else if (i4 != 17) {
        } else {
            double width = this.E - rect.width();
            Double.isNaN(width);
            this.N = (int) (width * 0.5d);
        }
    }

    private void k() {
        if (this.f4480k == null) {
            return;
        }
        g();
        int i4 = (int) (this.f4485p * (this.C - 1));
        this.F = i4;
        double d5 = i4 * 2;
        Double.isNaN(d5);
        this.D = (int) (d5 / 3.141592653589793d);
        double d6 = i4;
        Double.isNaN(d6);
        this.G = (int) (d6 / 3.141592653589793d);
        this.E = View.MeasureSpec.getSize(this.K);
        int i5 = this.D;
        float f5 = this.f4485p;
        this.f4490u = (i5 - f5) / 2.0f;
        this.f4491v = (i5 + f5) / 2.0f;
        this.f4492w = ((i5 + this.f4484o) / 2.0f) - 6.0f;
        if (this.f4494y == -1) {
            if (this.f4489t) {
                this.f4494y = (this.f4480k.a() + 1) / 2;
            } else {
                this.f4494y = 0;
            }
        }
        this.A = this.f4494y;
    }

    public void a() {
        ScheduledFuture<?> scheduledFuture = this.f4476g;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        this.f4476g.cancel(true);
        this.f4476g = null;
    }

    public int d(Paint paint, String str) {
        if (str == null || str.length() <= 0) {
            return 0;
        }
        int length = str.length();
        float[] fArr = new float[length];
        paint.getTextWidths(str, fArr);
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            i4 += (int) Math.ceil(fArr[i5]);
        }
        return i4;
    }

    public final e.c getAdapter() {
        return this.f4480k;
    }

    public final int getCurrentItem() {
        return this.f4495z;
    }

    public int getItemsCount() {
        e.c cVar = this.f4480k;
        if (cVar != null) {
            return cVar.a();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j() {
        if (this.f4474e != null) {
            postDelayed(new d(this), 200L);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l(float f5) {
        a();
        this.f4476g = this.f4475f.scheduleWithFixedDelay(new a(this, f5), 0L, 5L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(ACTION action) {
        a();
        if (action == ACTION.FLING || action == ACTION.DAGGLE) {
            float f5 = this.f4485p;
            int i4 = (int) (((this.f4493x % f5) + f5) % f5);
            this.H = i4;
            if (i4 > f5 / 2.0f) {
                this.H = (int) (f5 - i4);
            } else {
                this.H = -i4;
            }
        }
        this.f4476g = this.f4475f.scheduleWithFixedDelay(new e(this, this.H), 0L, 10L, TimeUnit.MILLISECONDS);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        String str;
        int i4;
        e.c cVar = this.f4480k;
        if (cVar == null) {
            return;
        }
        Object[] objArr = new Object[this.C];
        int i5 = (int) (this.f4493x / this.f4485p);
        this.B = i5;
        try {
            this.A = this.f4494y + (i5 % cVar.a());
        } catch (ArithmeticException unused) {
            System.out.println("出错了！adapter.getItemsCount() == 0，联动数据不匹配");
        }
        if (!this.f4489t) {
            if (this.A < 0) {
                this.A = 0;
            }
            if (this.A > this.f4480k.a() - 1) {
                this.A = this.f4480k.a() - 1;
            }
        } else {
            if (this.A < 0) {
                this.A = this.f4480k.a() + this.A;
            }
            if (this.A > this.f4480k.a() - 1) {
                this.A -= this.f4480k.a();
            }
        }
        int i6 = (int) (this.f4493x % this.f4485p);
        int i7 = 0;
        while (true) {
            int i8 = this.C;
            if (i7 >= i8) {
                break;
            }
            int i9 = this.A - ((i8 / 2) - i7);
            if (this.f4489t) {
                objArr[i7] = this.f4480k.getItem(c(i9));
            } else if (i9 < 0) {
                objArr[i7] = "";
            } else if (i9 > this.f4480k.a() - 1) {
                objArr[i7] = "";
            } else {
                objArr[i7] = this.f4480k.getItem(i9);
            }
            i7++;
        }
        float f5 = this.f4490u;
        canvas.drawLine(0.0f, f5, this.E, f5, this.f4479j);
        float f6 = this.f4491v;
        canvas.drawLine(0.0f, f6, this.E, f6, this.f4479j);
        if (this.f4481l != null) {
            canvas.drawText(this.f4481l, (this.E - d(this.f4478i, str)) - 6.0f, this.f4492w, this.f4478i);
        }
        int i10 = 0;
        while (i10 < this.C) {
            canvas.save();
            float f7 = this.f4484o * O;
            double d5 = (i10 * f7) - i6;
            Double.isNaN(d5);
            double d6 = this.F;
            Double.isNaN(d6);
            double d7 = (d5 * 3.141592653589793d) / d6;
            float f8 = (float) (90.0d - ((d7 / 3.141592653589793d) * 180.0d));
            if (f8 < 90.0f && f8 > -90.0f) {
                String b5 = b(objArr[i10]);
                h(b5);
                i(b5);
                double d8 = this.G;
                double cos = Math.cos(d7);
                i4 = i6;
                double d9 = this.G;
                Double.isNaN(d9);
                Double.isNaN(d8);
                double d10 = d8 - (cos * d9);
                double sin = Math.sin(d7);
                double d11 = this.f4484o;
                Double.isNaN(d11);
                float f9 = (float) (d10 - ((sin * d11) / 2.0d));
                canvas.translate(0.0f, f9);
                canvas.scale(1.0f, (float) Math.sin(d7));
                float f10 = this.f4490u;
                if (f9 <= f10 && this.f4484o + f9 >= f10) {
                    canvas.save();
                    canvas.clipRect(0.0f, 0.0f, this.E, this.f4490u - f9);
                    canvas.scale(1.0f, ((float) Math.sin(d7)) * Q);
                    canvas.drawText(b5, this.N, this.f4484o, this.f4477h);
                    canvas.restore();
                    canvas.save();
                    canvas.clipRect(0.0f, this.f4490u - f9, this.E, (int) f7);
                    canvas.scale(1.0f, ((float) Math.sin(d7)) * 1.0f);
                    canvas.drawText(b5, this.M, this.f4484o - 6.0f, this.f4478i);
                    canvas.restore();
                } else {
                    float f11 = this.f4491v;
                    if (f9 <= f11 && this.f4484o + f9 >= f11) {
                        canvas.save();
                        canvas.clipRect(0.0f, 0.0f, this.E, this.f4491v - f9);
                        canvas.scale(1.0f, ((float) Math.sin(d7)) * 1.0f);
                        canvas.drawText(b5, this.M, this.f4484o - 6.0f, this.f4478i);
                        canvas.restore();
                        canvas.save();
                        canvas.clipRect(0.0f, this.f4491v - f9, this.E, (int) f7);
                        canvas.scale(1.0f, ((float) Math.sin(d7)) * Q);
                        canvas.drawText(b5, this.N, this.f4484o, this.f4477h);
                        canvas.restore();
                    } else if (f9 >= f10 && this.f4484o + f9 <= f11) {
                        canvas.clipRect(0, 0, this.E, (int) f7);
                        canvas.drawText(b5, this.M, this.f4484o - 6.0f, this.f4478i);
                        int indexOf = this.f4480k.indexOf(objArr[i10]);
                        if (indexOf != -1) {
                            this.f4495z = indexOf;
                        }
                    } else {
                        canvas.save();
                        canvas.clipRect(0, 0, this.E, (int) f7);
                        canvas.scale(1.0f, ((float) Math.sin(d7)) * Q);
                        canvas.drawText(b5, this.N, this.f4484o, this.f4477h);
                        canvas.restore();
                        canvas.restore();
                    }
                }
                canvas.restore();
            } else {
                i4 = i6;
                canvas.restore();
            }
            i10++;
            i6 = i4;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        this.K = i4;
        k();
        setMeasuredDimension(this.E, this.D);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        double d5;
        boolean onTouchEvent = this.f4473d.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.J = System.currentTimeMillis();
            a();
            this.I = motionEvent.getRawY();
        } else if (action == 2) {
            float rawY = this.I - motionEvent.getRawY();
            this.I = motionEvent.getRawY();
            this.f4493x = (int) (this.f4493x + rawY);
            if (!this.f4489t) {
                float f5 = (-this.f4494y) * this.f4485p;
                float f6 = this.f4485p;
                float a5 = ((this.f4480k.a() - 1) - this.f4494y) * f6;
                int i4 = this.f4493x;
                double d6 = i4;
                double d7 = f6;
                Double.isNaN(d7);
                Double.isNaN(d6);
                if (d6 - (d7 * 0.3d) < f5) {
                    f5 = i4 - rawY;
                } else {
                    double d8 = i4;
                    double d9 = f6;
                    Double.isNaN(d9);
                    Double.isNaN(d8);
                    if (d8 + (d9 * 0.3d) > a5) {
                        a5 = i4 - rawY;
                    }
                }
                if (i4 < f5) {
                    this.f4493x = (int) f5;
                } else if (i4 > a5) {
                    this.f4493x = (int) a5;
                }
            }
        } else if (!onTouchEvent) {
            float y2 = motionEvent.getY();
            int i5 = this.G;
            double acos = Math.acos((i5 - y2) / i5);
            double d10 = this.G;
            Double.isNaN(d10);
            double d11 = acos * d10;
            float f7 = this.f4485p;
            double d12 = f7 / 2.0f;
            Double.isNaN(d12);
            double d13 = d11 + d12;
            Double.isNaN(f7);
            this.H = (int) (((((int) (d13 / d5)) - (this.C / 2)) * f7) - (((this.f4493x % f7) + f7) % f7));
            if (System.currentTimeMillis() - this.J > 120) {
                m(ACTION.DAGGLE);
            } else {
                m(ACTION.CLICK);
            }
        }
        invalidate();
        return true;
    }

    public final void setAdapter(e.c cVar) {
        this.f4480k = cVar;
        k();
        invalidate();
    }

    public final void setCurrentItem(int i4) {
        this.f4494y = i4;
        this.f4493x = 0;
        invalidate();
    }

    public final void setCyclic(boolean z4) {
        this.f4489t = z4;
    }

    public void setGravity(int i4) {
        this.L = i4;
    }

    public void setLabel(String str) {
        this.f4481l = str;
    }

    public final void setOnItemSelectedListener(f.c cVar) {
        this.f4474e = cVar;
    }

    public final void setTextSize(float f5) {
        if (f5 > 0.0f) {
            int i4 = (int) (this.f4471b.getResources().getDisplayMetrics().density * f5);
            this.f4482m = i4;
            this.f4477h.setTextSize(i4);
            this.f4478i.setTextSize(this.f4482m);
        }
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4475f = Executors.newSingleThreadScheduledExecutor();
        this.C = 11;
        this.H = 0;
        this.I = 0.0f;
        this.J = 0L;
        this.L = 17;
        this.M = 0;
        this.N = 0;
        this.f4486q = getResources().getColor(R.color.pickerview_wheelview_textcolor_out);
        this.f4487r = getResources().getColor(R.color.pickerview_wheelview_textcolor_center);
        this.f4488s = getResources().getColor(R.color.pickerview_wheelview_textcolor_divider);
        this.f4482m = getResources().getDimensionPixelSize(R.dimen.pickerview_textsize);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PickerView_Library, 0, 0);
            this.L = obtainStyledAttributes.getInt(R.styleable.PickerView_Library_pickerview_gravity, 17);
            this.f4486q = obtainStyledAttributes.getColor(R.styleable.PickerView_Library_pickerview_textColorOut, this.f4486q);
            this.f4487r = obtainStyledAttributes.getColor(R.styleable.PickerView_Library_pickerview_textColorCenter, this.f4487r);
            this.f4488s = obtainStyledAttributes.getColor(R.styleable.PickerView_Library_pickerview_dividerColor, this.f4488s);
            this.f4482m = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.PickerView_Library_pickerview_textSize, this.f4482m);
            obtainStyledAttributes.recycle();
        }
        e(context);
    }
}
