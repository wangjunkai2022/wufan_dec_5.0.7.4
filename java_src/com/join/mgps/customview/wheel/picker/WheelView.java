package com.join.mgps.customview.wheel.picker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.core.view.GravityCompat;
import com.google.android.material.timepicker.TimeModel;
import com.join.mgps.customview.wheel.picker.entity.WheelItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes4.dex */
public class WheelView extends View {
    public static final float A1 = 2.0f;
    public static final int B1 = 3;
    private static final float C1 = 13.0f;
    private static final int D1 = 1;
    private static final int E1 = 2;
    private static final int F1 = 3;
    private static final int G1 = 5;
    private static final float H1 = 0.8f;
    public static final float T = 2.0f;
    public static final int U = -1;
    public static final int V = 16;
    public static final int W = -16611122;

    /* renamed from: p0  reason: collision with root package name */
    public static final int f48848p0 = -4473925;

    /* renamed from: p1  reason: collision with root package name */
    public static final int f48849p1 = -8139290;

    /* renamed from: v1  reason: collision with root package name */
    public static final int f48850v1 = 220;
    private float A;
    private float B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private float K;
    private long L;
    private int M;
    private int N;
    private int O;
    private int P;
    private float Q;
    private boolean R;
    private boolean S;

    /* renamed from: b  reason: collision with root package name */
    private f f48851b;

    /* renamed from: c  reason: collision with root package name */
    private GestureDetector f48852c;

    /* renamed from: d  reason: collision with root package name */
    private g f48853d;

    /* renamed from: e  reason: collision with root package name */
    private h f48854e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f48855f;

    /* renamed from: g  reason: collision with root package name */
    private ScheduledFuture<?> f48856g;

    /* renamed from: h  reason: collision with root package name */
    private Paint f48857h;

    /* renamed from: i  reason: collision with root package name */
    private Paint f48858i;

    /* renamed from: j  reason: collision with root package name */
    private Paint f48859j;

    /* renamed from: k  reason: collision with root package name */
    private Paint f48860k;

    /* renamed from: l  reason: collision with root package name */
    private List<WheelItem> f48861l;

    /* renamed from: m  reason: collision with root package name */
    private String f48862m;

    /* renamed from: n  reason: collision with root package name */
    private int f48863n;

    /* renamed from: o  reason: collision with root package name */
    private int f48864o;

    /* renamed from: p  reason: collision with root package name */
    private int f48865p;

    /* renamed from: q  reason: collision with root package name */
    private int f48866q;

    /* renamed from: r  reason: collision with root package name */
    private float f48867r;

    /* renamed from: s  reason: collision with root package name */
    private Typeface f48868s;

    /* renamed from: t  reason: collision with root package name */
    private int f48869t;

    /* renamed from: u  reason: collision with root package name */
    private int f48870u;

    /* renamed from: v  reason: collision with root package name */
    private c f48871v;

    /* renamed from: w  reason: collision with root package name */
    private float f48872w;

    /* renamed from: x  reason: collision with root package name */
    private int f48873x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f48874y;

    /* renamed from: z  reason: collision with root package name */
    private float f48875z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class StringItem implements WheelItem {

        /* renamed from: b  reason: collision with root package name */
        private String f48876b;

        /* synthetic */ StringItem(String str, a aVar) {
            this(str);
        }

        @Override // com.join.mgps.customview.wheel.picker.entity.WheelItem
        public String getName() {
            return this.f48876b;
        }

        private StringItem(String str) {
            this.f48876b = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends GestureDetector.SimpleOnGestureListener {
        a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
            WheelView.this.C(f6);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (WheelView.this.f48853d != null) {
                WheelView.this.f48853d.onSelected(WheelView.this.D);
            }
            if (WheelView.this.f48854e != null) {
                WheelView.this.f48854e.a(true, WheelView.this.D, ((WheelItem) WheelView.this.f48861l.get(WheelView.this.D)).getName());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class d extends TimerTask {

        /* renamed from: b  reason: collision with root package name */
        float f48889b = 2.14748365E9f;

        /* renamed from: c  reason: collision with root package name */
        final float f48890c;

        /* renamed from: d  reason: collision with root package name */
        final WheelView f48891d;

        d(WheelView wheelView, float f5) {
            this.f48891d = wheelView;
            this.f48890c = f5;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            if (this.f48889b == 2.14748365E9f) {
                if (Math.abs(this.f48890c) > 2000.0f) {
                    if (this.f48890c > 0.0f) {
                        this.f48889b = 2000.0f;
                    } else {
                        this.f48889b = -2000.0f;
                    }
                } else {
                    this.f48889b = this.f48890c;
                }
            }
            if (Math.abs(this.f48889b) >= 0.0f && Math.abs(this.f48889b) <= 20.0f) {
                this.f48891d.o();
                this.f48891d.f48851b.sendEmptyMessage(2000);
                return;
            }
            WheelView wheelView = this.f48891d;
            float f5 = (int) ((this.f48889b * 10.0f) / 1000.0f);
            wheelView.B -= f5;
            if (!this.f48891d.f48874y) {
                float f6 = this.f48891d.f48867r;
                float f7 = (-this.f48891d.C) * f6;
                float itemCount = ((this.f48891d.getItemCount() - 1) - this.f48891d.C) * f6;
                double d5 = this.f48891d.B;
                double d6 = f6;
                Double.isNaN(d6);
                double d7 = d6 * 0.25d;
                Double.isNaN(d5);
                if (d5 - d7 < f7) {
                    f7 = this.f48891d.B + f5;
                } else {
                    double d8 = this.f48891d.B;
                    Double.isNaN(d8);
                    if (d8 + d7 > itemCount) {
                        itemCount = this.f48891d.B + f5;
                    }
                }
                if (this.f48891d.B > f7) {
                    if (this.f48891d.B >= itemCount) {
                        this.f48891d.B = (int) itemCount;
                        this.f48889b = -40.0f;
                    }
                } else {
                    this.f48889b = 40.0f;
                    this.f48891d.B = (int) f7;
                }
            }
            float f8 = this.f48889b;
            if (f8 < 0.0f) {
                this.f48889b = f8 + 20.0f;
            } else {
                this.f48889b = f8 - 20.0f;
            }
            this.f48891d.f48851b.sendEmptyMessage(1000);
        }
    }

    @Deprecated
    /* loaded from: classes4.dex */
    public static class e extends c {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class f extends Handler {

        /* renamed from: b  reason: collision with root package name */
        static final int f48892b = 1000;

        /* renamed from: c  reason: collision with root package name */
        static final int f48893c = 2000;

        /* renamed from: d  reason: collision with root package name */
        static final int f48894d = 3000;

        /* renamed from: a  reason: collision with root package name */
        final WheelView f48895a;

        f(WheelView wheelView) {
            this.f48895a = wheelView;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 1000) {
                this.f48895a.invalidate();
            } else if (i4 == 2000) {
                this.f48895a.D(2);
            } else if (i4 != 3000) {
            } else {
                this.f48895a.t();
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface g {
        void onSelected(int i4);
    }

    @Deprecated
    /* loaded from: classes4.dex */
    public interface h {
        void a(boolean z4, int i4, String str);
    }

    @Deprecated
    /* loaded from: classes4.dex */
    public interface i extends h {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class j extends TimerTask {

        /* renamed from: b  reason: collision with root package name */
        int f48896b = Integer.MAX_VALUE;

        /* renamed from: c  reason: collision with root package name */
        int f48897c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f48898d;

        /* renamed from: e  reason: collision with root package name */
        final WheelView f48899e;

        j(WheelView wheelView, int i4) {
            this.f48899e = wheelView;
            this.f48898d = i4;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (this.f48896b == Integer.MAX_VALUE) {
                this.f48896b = this.f48898d;
            }
            int i4 = this.f48896b;
            int i5 = (int) (i4 * 0.1f);
            this.f48897c = i5;
            if (i5 == 0) {
                if (i4 < 0) {
                    this.f48897c = -1;
                } else {
                    this.f48897c = 1;
                }
            }
            if (Math.abs(i4) <= 1) {
                this.f48899e.o();
                this.f48899e.f48851b.sendEmptyMessage(3000);
                return;
            }
            this.f48899e.B += this.f48897c;
            if (!this.f48899e.f48874y) {
                float f5 = this.f48899e.f48867r;
                float itemCount = ((this.f48899e.getItemCount() - 1) - this.f48899e.C) * f5;
                if (this.f48899e.B <= (-this.f48899e.C) * f5 || this.f48899e.B >= itemCount) {
                    this.f48899e.B -= this.f48897c;
                    this.f48899e.o();
                    this.f48899e.f48851b.sendEmptyMessage(3000);
                    return;
                }
            }
            this.f48899e.f48851b.sendEmptyMessage(1000);
            this.f48896b -= this.f48897c;
        }
    }

    public WheelView(Context context) {
        this(context, null);
    }

    private void A() {
        int i4;
        if (this.f48861l == null) {
            return;
        }
        v();
        int i5 = (int) (this.f48867r * (this.F - 1));
        double d5 = i5 * 2;
        Double.isNaN(d5);
        this.G = (int) (d5 / 3.141592653589793d);
        double d6 = i5;
        Double.isNaN(d6);
        this.I = (int) (d6 / 3.141592653589793d);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (this.R) {
            this.H = View.MeasureSpec.getSize(this.M);
        } else if (layoutParams != null && (i4 = layoutParams.width) > 0) {
            this.H = i4;
        } else {
            this.H = this.f48863n;
            if (this.f48873x < 0) {
                this.f48873x = a2.a.H(getContext(), C1);
            }
            this.H += this.f48873x * 2;
            if (!TextUtils.isEmpty(this.f48862m)) {
                this.H += z(this.f48858i, this.f48862m);
            }
        }
        int i6 = this.G;
        float f5 = this.f48867r;
        this.f48875z = (i6 - f5) / 2.0f;
        this.A = (i6 + f5) / 2.0f;
        if (this.C == -1) {
            if (this.f48874y) {
                this.C = (this.f48861l.size() + 1) / 2;
            } else {
                this.C = 0;
            }
        }
        this.E = this.C;
    }

    private void B(String str) {
        Rect rect = new Rect();
        this.f48858i.getTextBounds(str, 0, str.length(), rect);
        int i4 = this.f48866q;
        for (int width = rect.width(); width > this.H; width = rect.width()) {
            i4--;
            this.f48858i.setTextSize(i4);
            this.f48858i.getTextBounds(str, 0, str.length(), rect);
        }
        this.f48857h.setTextSize(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(float f5) {
        o();
        this.f48856g = Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay(new d(this, f5), 0L, 5L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(int i4) {
        o();
        if (i4 == 2 || i4 == 3) {
            float f5 = this.B;
            float f6 = this.f48867r;
            int i5 = (int) (((f5 % f6) + f6) % f6);
            this.J = i5;
            if (i5 > f6 / 2.0f) {
                this.J = (int) (f6 - i5);
            } else {
                this.J = -i5;
            }
        }
        this.f48856g = Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay(new j(this, this.J), 0L, 10L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        ScheduledFuture<?> scheduledFuture = this.f48856g;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        this.f48856g.cancel(true);
        this.f48856g = null;
    }

    private int p(int i4) {
        if (i4 < 0) {
            return p(i4 + this.f48861l.size());
        }
        return i4 > this.f48861l.size() + (-1) ? p(i4 - this.f48861l.size()) : i4;
    }

    private void q() {
        if (isInEditMode()) {
            setItems(new String[]{"李玉江", "男", "贵州", "穿青人"});
        }
    }

    private void r() {
        Paint paint = new Paint();
        this.f48857h = paint;
        paint.setAntiAlias(true);
        this.f48857h.setColor(this.f48869t);
        this.f48857h.setTypeface(this.f48868s);
        this.f48857h.setTextSize(this.f48866q);
        Paint paint2 = new Paint();
        this.f48858i = paint2;
        paint2.setAntiAlias(true);
        this.f48858i.setColor(this.f48870u);
        this.f48858i.setTextScaleX(1.0f);
        this.f48858i.setTypeface(this.f48868s);
        this.f48858i.setTextSize(this.f48866q);
        Paint paint3 = new Paint();
        this.f48859j = paint3;
        paint3.setAntiAlias(true);
        this.f48859j.setColor(this.f48871v.f48883c);
        this.f48859j.setStrokeWidth(this.f48871v.f48888h);
        this.f48859j.setAlpha(this.f48871v.f48886f);
        Paint paint4 = new Paint();
        this.f48860k = paint4;
        paint4.setAntiAlias(true);
        this.f48860k.setColor(this.f48871v.f48884d);
        this.f48860k.setAlpha(this.f48871v.f48885e);
        setLayerType(1, null);
    }

    private void s(Context context) {
        this.f48851b = new f(this);
        GestureDetector gestureDetector = new GestureDetector(context, new a());
        this.f48852c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        r();
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (this.f48853d == null && this.f48854e == null) {
            return;
        }
        postDelayed(new b(), 200L);
    }

    private void u() {
        float f5 = this.f48872w;
        if (f5 < 1.5f) {
            this.f48872w = 1.5f;
        } else if (f5 > 4.0f) {
            this.f48872w = 4.0f;
        }
    }

    private void v() {
        Rect rect = new Rect();
        for (int i4 = 0; i4 < this.f48861l.size(); i4++) {
            String y2 = y(this.f48861l.get(i4));
            this.f48858i.getTextBounds(y2, 0, y2.length(), rect);
            int width = rect.width();
            if (width > this.f48863n) {
                this.f48863n = width;
            }
            this.f48858i.getTextBounds("测试", 0, 2, rect);
            this.f48864o = rect.height() + 2;
        }
        this.f48867r = this.f48872w * this.f48864o;
    }

    private void w(String str) {
        Rect rect = new Rect();
        this.f48858i.getTextBounds(str, 0, str.length(), rect);
        int i4 = this.N;
        if (i4 == 3) {
            this.O = a2.a.H(getContext(), 8.0f);
        } else if (i4 == 5) {
            this.O = (this.H - rect.width()) - ((int) this.Q);
        } else if (i4 != 17) {
        } else {
            double width = this.H - rect.width();
            Double.isNaN(width);
            this.O = (int) (width * 0.5d);
        }
    }

    private void x(String str) {
        Rect rect = new Rect();
        this.f48857h.getTextBounds(str, 0, str.length(), rect);
        int i4 = this.N;
        if (i4 == 3) {
            this.P = a2.a.H(getContext(), 8.0f);
        } else if (i4 == 5) {
            this.P = (this.H - rect.width()) - ((int) this.Q);
        } else if (i4 != 17) {
        } else {
            double width = this.H - rect.width();
            Double.isNaN(width);
            this.P = (int) (width * 0.5d);
        }
    }

    private String y(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof WheelItem) {
            return ((WheelItem) obj).getName();
        }
        return obj instanceof Integer ? String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(((Integer) obj).intValue())) : obj.toString();
    }

    private int z(Paint paint, String str) {
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

    protected int getItemCount() {
        List<WheelItem> list = this.f48861l;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final int getSelectedIndex() {
        return this.D;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        List<WheelItem> list = this.f48861l;
        if (list == null || list.size() == 0) {
            return;
        }
        String[] strArr = new String[this.F];
        int size = this.C + (((int) (this.B / this.f48867r)) % this.f48861l.size());
        this.E = size;
        if (!this.f48874y) {
            if (size < 0) {
                this.E = 0;
            }
            if (this.E > this.f48861l.size() - 1) {
                this.E = this.f48861l.size() - 1;
            }
        } else {
            if (size < 0) {
                this.E = this.f48861l.size() + this.E;
            }
            if (this.E > this.f48861l.size() - 1) {
                this.E -= this.f48861l.size();
            }
        }
        float f5 = this.B % this.f48867r;
        int i4 = 0;
        while (true) {
            int i5 = this.F;
            if (i4 >= i5) {
                break;
            }
            int i6 = this.E - ((i5 / 2) - i4);
            if (this.f48874y) {
                strArr[i4] = this.f48861l.get(p(i6)).getName();
            } else if (i6 < 0) {
                strArr[i4] = "";
            } else if (i6 > this.f48861l.size() - 1) {
                strArr[i4] = "";
            } else {
                strArr[i4] = this.f48861l.get(i6).getName();
            }
            i4++;
        }
        c cVar = this.f48871v;
        if (cVar.f48881a) {
            float f6 = cVar.f48887g;
            int i7 = this.H;
            float f7 = this.f48875z;
            float f8 = 1.0f - f6;
            canvas.drawLine(i7 * f6, f7, i7 * f8, f7, this.f48859j);
            int i8 = this.H;
            float f9 = this.A;
            canvas.drawLine(i8 * f6, f9, i8 * f8, f9, this.f48859j);
        }
        c cVar2 = this.f48871v;
        if (cVar2.f48882b) {
            this.f48860k.setColor(cVar2.f48884d);
            this.f48860k.setAlpha(this.f48871v.f48885e);
            canvas.drawRect(0.0f, this.f48875z, this.H, this.A, this.f48860k);
        }
        for (int i9 = 0; i9 < this.F; i9++) {
            canvas.save();
            double d5 = ((this.f48867r * i9) - f5) / this.I;
            Double.isNaN(d5);
            float f10 = (float) (90.0d - ((d5 / 3.141592653589793d) * 180.0d));
            if (f10 < 90.0f && f10 > -90.0f) {
                String y2 = y(strArr[i9]);
                String str = (this.f48855f || TextUtils.isEmpty(this.f48862m) || TextUtils.isEmpty(y2)) ? y2 : y2 + this.f48862m;
                if (this.S) {
                    B(str);
                    this.N = 17;
                } else {
                    this.N = GravityCompat.START;
                }
                w(str);
                x(str);
                double d6 = this.I;
                double cos = Math.cos(d5);
                String str2 = y2;
                double d7 = this.I;
                Double.isNaN(d7);
                Double.isNaN(d6);
                double sin = Math.sin(d5);
                double d8 = this.f48864o;
                Double.isNaN(d8);
                float f11 = (float) ((d6 - (cos * d7)) - ((sin * d8) / 2.0d));
                canvas.translate(0.0f, f11);
                float f12 = this.f48875z;
                if (f11 <= f12 && this.f48864o + f11 >= f12) {
                    canvas.save();
                    canvas.clipRect(0.0f, 0.0f, this.H, this.f48875z - f11);
                    canvas.scale(1.0f, ((float) Math.sin(d5)) * H1);
                    canvas.drawText(str, this.P, this.f48864o, this.f48857h);
                    canvas.restore();
                    canvas.save();
                    canvas.clipRect(0.0f, this.f48875z - f11, this.H, (int) this.f48867r);
                    canvas.scale(1.0f, ((float) Math.sin(d5)) * 1.0f);
                    canvas.drawText(str, this.O, this.f48864o - this.Q, this.f48858i);
                    canvas.restore();
                } else {
                    float f13 = this.A;
                    if (f11 <= f13 && this.f48864o + f11 >= f13) {
                        canvas.save();
                        canvas.clipRect(0.0f, 0.0f, this.H, this.A - f11);
                        canvas.scale(1.0f, ((float) Math.sin(d5)) * 1.0f);
                        canvas.drawText(str, this.O, this.f48864o - this.Q, this.f48858i);
                        canvas.restore();
                        canvas.save();
                        canvas.clipRect(0.0f, this.A - f11, this.H, (int) this.f48867r);
                        canvas.scale(1.0f, ((float) Math.sin(d5)) * H1);
                        canvas.drawText(str, this.P, this.f48864o, this.f48857h);
                        canvas.restore();
                    } else {
                        if (f11 >= f12) {
                            int i10 = this.f48864o;
                            if (i10 + f11 <= f13) {
                                canvas.clipRect(0, 0, this.H, i10);
                                float f14 = this.f48864o - this.Q;
                                Iterator<WheelItem> it2 = this.f48861l.iterator();
                                int i11 = 0;
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    String str3 = str2;
                                    if (it2.next().getName().equals(str3)) {
                                        this.D = i11;
                                        break;
                                    } else {
                                        i11++;
                                        str2 = str3;
                                    }
                                }
                                if (this.f48855f && !TextUtils.isEmpty(this.f48862m)) {
                                    str = str + this.f48862m;
                                }
                                canvas.drawText(str, this.O, f14, this.f48858i);
                                canvas.restore();
                                this.f48858i.setTextSize(this.f48866q);
                            }
                        }
                        canvas.save();
                        canvas.clipRect(0.0f, 0.0f, this.H, this.f48867r);
                        canvas.scale(1.0f, ((float) Math.sin(d5)) * H1);
                        float pow = (float) Math.pow(Math.abs(f10) / 90.0f, 2.2d);
                        int i12 = this.f48865p;
                        if (i12 != 0) {
                            this.f48857h.setTextSkewX((i12 > 0 ? 1 : -1) * (f10 <= 0.0f ? 1 : -1) * 0.5f * pow);
                            this.f48857h.setAlpha((int) ((1.0f - pow) * 255.0f));
                        }
                        canvas.drawText(str, this.P + (this.f48865p * pow), this.f48864o, this.f48857h);
                        canvas.restore();
                        canvas.restore();
                        this.f48858i.setTextSize(this.f48866q);
                    }
                }
                canvas.restore();
                this.f48858i.setTextSize(this.f48866q);
            } else {
                canvas.restore();
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        this.M = i4;
        A();
        setMeasuredDimension(this.H, this.G);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        double d5;
        boolean onTouchEvent = this.f48852c.onTouchEvent(motionEvent);
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.L = System.currentTimeMillis();
            o();
            this.K = motionEvent.getRawY();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        } else if (action != 2) {
            if (!onTouchEvent) {
                float y2 = motionEvent.getY();
                int i4 = this.I;
                double acos = Math.acos((i4 - y2) / i4);
                double d6 = this.I;
                Double.isNaN(d6);
                double d7 = acos * d6;
                float f5 = this.f48867r;
                double d8 = f5 / 2.0f;
                Double.isNaN(d8);
                double d9 = d7 + d8;
                Double.isNaN(f5);
                this.J = (int) (((((int) (d9 / d5)) - (this.F / 2)) * f5) - (((this.B % f5) + f5) % f5));
                if (System.currentTimeMillis() - this.L > 120) {
                    D(3);
                } else {
                    D(1);
                }
            }
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        } else {
            float rawY = this.K - motionEvent.getRawY();
            this.K = motionEvent.getRawY();
            this.B += rawY;
            if (!this.f48874y) {
                float f6 = (-this.C) * this.f48867r;
                float f7 = this.f48867r;
                float size = ((this.f48861l.size() - 1) - this.C) * f7;
                float f8 = this.B;
                double d10 = f8;
                double d11 = f7;
                Double.isNaN(d11);
                Double.isNaN(d10);
                if (d10 - (d11 * 0.25d) < f6) {
                    f6 = f8 - rawY;
                } else {
                    double d12 = f8;
                    double d13 = f7;
                    Double.isNaN(d13);
                    Double.isNaN(d12);
                    if (d12 + (d13 * 0.25d) > size) {
                        size = f8 - rawY;
                    }
                }
                if (f8 < f6) {
                    this.B = (int) f6;
                } else if (f8 > size) {
                    this.B = (int) size;
                }
            }
        }
        if (motionEvent.getAction() != 0) {
            invalidate();
        }
        return true;
    }

    public final void setCycleDisable(boolean z4) {
        this.f48874y = !z4;
    }

    public void setDividerColor(@ColorInt int i4) {
        this.f48871v.b(i4);
        this.f48859j.setColor(i4);
    }

    public void setDividerConfig(c cVar) {
        if (cVar == null) {
            this.f48871v.h(false);
            this.f48871v.f(false);
            return;
        }
        this.f48871v = cVar;
        this.f48859j.setColor(cVar.f48883c);
        this.f48859j.setStrokeWidth(cVar.f48888h);
        this.f48859j.setAlpha(cVar.f48886f);
        this.f48860k.setColor(cVar.f48884d);
        this.f48860k.setAlpha(cVar.f48885e);
    }

    public final void setGravity(int i4) {
        this.N = i4;
    }

    public final void setItems(List<?> list) {
        this.f48861l.clear();
        for (Object obj : list) {
            if (obj instanceof WheelItem) {
                this.f48861l.add((WheelItem) obj);
            } else if (!(obj instanceof CharSequence) && !(obj instanceof Number)) {
                throw new IllegalArgumentException("please implements " + WheelItem.class.getName());
            } else {
                this.f48861l.add(new StringItem(obj.toString(), null));
            }
        }
        A();
        invalidate();
    }

    public final void setLabel(String str, boolean z4) {
        this.f48862m = str;
        this.f48855f = z4;
    }

    @Deprecated
    public void setLineConfig(c cVar) {
        setDividerConfig(cVar);
    }

    public final void setLineSpaceMultiplier(@FloatRange(from = 2.0d, to = 4.0d) float f5) {
        this.f48872w = f5;
        u();
    }

    public final void setOffset(@IntRange(from = 1, to = 5) int i4) {
        if (i4 >= 1 && i4 <= 5) {
            int i5 = (i4 * 2) + 1;
            if (i4 % 2 != 0) {
                i4--;
            }
            setVisibleItemCount(i5 + i4);
            return;
        }
        throw new IllegalArgumentException("must between 1 and 5");
    }

    public final void setOnItemSelectListener(g gVar) {
        this.f48853d = gVar;
    }

    @Deprecated
    public final void setOnWheelListener(h hVar) {
        this.f48854e = hVar;
    }

    @Deprecated
    public void setPadding(int i4) {
        setTextPadding(i4);
    }

    public final void setSelectedIndex(int i4) {
        List<WheelItem> list = this.f48861l;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f48861l.size();
        if (i4 == 0 || (i4 > 0 && i4 < size && i4 != this.D)) {
            this.C = i4;
            this.B = 0.0f;
            this.J = 0;
            invalidate();
        }
    }

    public void setTextColor(@ColorInt int i4, @ColorInt int i5) {
        this.f48869t = i4;
        this.f48870u = i5;
        this.f48857h.setColor(i4);
        this.f48858i.setColor(i5);
    }

    public void setTextPadding(int i4) {
        this.f48873x = a2.a.H(getContext(), i4);
    }

    public final void setTextSize(float f5) {
        if (f5 > 0.0f) {
            int i4 = (int) (getContext().getResources().getDisplayMetrics().density * f5);
            this.f48866q = i4;
            this.f48857h.setTextSize(i4);
            this.f48858i.setTextSize(this.f48866q);
        }
    }

    public void setTextSizeAutoFit(boolean z4) {
        this.S = z4;
    }

    public void setTextSkewXOffset(int i4) {
        this.f48865p = i4;
        if (i4 != 0) {
            this.f48858i.setTextScaleX(1.0f);
        }
    }

    public final void setTypeface(Typeface typeface) {
        this.f48868s = typeface;
        this.f48857h.setTypeface(typeface);
        this.f48858i.setTypeface(this.f48868s);
    }

    public void setUseWeight(boolean z4) {
        this.R = z4;
    }

    public final void setVisibleItemCount(int i4) {
        if (i4 % 2 != 0) {
            if (i4 != this.F) {
                this.F = i4;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("must be odd");
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48855f = true;
        this.f48861l = new ArrayList();
        this.f48865p = 0;
        this.f48866q = 16;
        this.f48868s = Typeface.DEFAULT;
        this.f48869t = f48848p0;
        this.f48870u = W;
        this.f48871v = new c();
        this.f48872w = 2.0f;
        this.f48873x = -1;
        this.f48874y = true;
        this.B = 0.0f;
        this.C = -1;
        this.F = 7;
        this.J = 0;
        this.K = 0.0f;
        this.L = 0L;
        this.N = 17;
        this.O = 0;
        this.P = 0;
        this.R = false;
        this.S = true;
        float f5 = getResources().getDisplayMetrics().density;
        if (f5 < 1.0f) {
            this.Q = 2.4f;
        } else if (1.0f <= f5 && f5 < 2.0f) {
            this.Q = 3.6f;
        } else if (1.0f <= f5 && f5 < 2.0f) {
            this.Q = 4.5f;
        } else if (2.0f <= f5 && f5 < 3.0f) {
            this.Q = 6.0f;
        } else if (f5 >= 3.0f) {
            this.Q = f5 * 2.5f;
        }
        u();
        s(context);
    }

    public final void setLabel(String str) {
        setLabel(str, true);
    }

    public void setTextColor(@ColorInt int i4) {
        this.f48869t = i4;
        this.f48870u = i4;
        this.f48857h.setColor(i4);
        this.f48858i.setColor(i4);
    }

    /* loaded from: classes4.dex */
    public static class c {

        /* renamed from: i  reason: collision with root package name */
        public static final float f48879i = 0.0f;

        /* renamed from: j  reason: collision with root package name */
        public static final float f48880j = 1.0f;

        /* renamed from: a  reason: collision with root package name */
        protected boolean f48881a;

        /* renamed from: b  reason: collision with root package name */
        protected boolean f48882b;

        /* renamed from: c  reason: collision with root package name */
        protected int f48883c;

        /* renamed from: d  reason: collision with root package name */
        protected int f48884d;

        /* renamed from: e  reason: collision with root package name */
        protected int f48885e;

        /* renamed from: f  reason: collision with root package name */
        protected int f48886f;

        /* renamed from: g  reason: collision with root package name */
        protected float f48887g;

        /* renamed from: h  reason: collision with root package name */
        protected float f48888h;

        public c() {
            this.f48881a = true;
            this.f48882b = false;
            this.f48883c = WheelView.f48849p1;
            this.f48884d = WheelView.f48848p0;
            this.f48885e = 100;
            this.f48886f = 220;
            this.f48887g = 0.1f;
            this.f48888h = 2.0f;
        }

        public c a(@IntRange(from = 1, to = 255) int i4) {
            this.f48886f = i4;
            return this;
        }

        public c b(@ColorInt int i4) {
            this.f48883c = i4;
            return this;
        }

        public c c(@FloatRange(from = 0.0d, to = 1.0d) float f5) {
            this.f48887g = f5;
            return this;
        }

        public c d(@IntRange(from = 1, to = 255) int i4) {
            this.f48885e = i4;
            return this;
        }

        public c e(@ColorInt int i4) {
            this.f48882b = true;
            this.f48884d = i4;
            return this;
        }

        public c f(boolean z4) {
            this.f48882b = z4;
            if (z4 && this.f48883c == -8139290) {
                this.f48883c = this.f48884d;
                this.f48886f = 255;
            }
            return this;
        }

        public c g(float f5) {
            this.f48888h = f5;
            return this;
        }

        public c h(boolean z4) {
            this.f48881a = z4;
            return this;
        }

        public String toString() {
            return "visible=" + this.f48881a + ",color=" + this.f48883c + ",alpha=" + this.f48886f + ",thick=" + this.f48888h;
        }

        public c(@FloatRange(from = 0.0d, to = 1.0d) float f5) {
            this.f48881a = true;
            this.f48882b = false;
            this.f48883c = WheelView.f48849p1;
            this.f48884d = WheelView.f48848p0;
            this.f48885e = 100;
            this.f48886f = 220;
            this.f48887g = 0.1f;
            this.f48888h = 2.0f;
            this.f48887g = f5;
        }
    }

    public final void setItems(List<?> list, int i4) {
        setItems(list);
        setSelectedIndex(i4);
    }

    public final void setItems(String[] strArr) {
        setItems(Arrays.asList(strArr));
    }

    public final void setItems(List<String> list, String str) {
        int indexOf = list.indexOf(str);
        if (indexOf == -1) {
            indexOf = 0;
        }
        setItems(list, indexOf);
    }

    public final void setItems(String[] strArr, int i4) {
        setItems(Arrays.asList(strArr), i4);
    }

    public final void setItems(String[] strArr, String str) {
        setItems(Arrays.asList(strArr), str);
    }
}
