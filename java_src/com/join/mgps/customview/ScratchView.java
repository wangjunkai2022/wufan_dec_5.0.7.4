package com.join.mgps.customview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.l2;
/* loaded from: classes4.dex */
public class ScratchView extends View {

    /* renamed from: w  reason: collision with root package name */
    private static Bitmap f47612w;

    /* renamed from: x  reason: collision with root package name */
    private static Bitmap f47613x;

    /* renamed from: b  reason: collision with root package name */
    public final int f47614b;

    /* renamed from: c  reason: collision with root package name */
    public final int f47615c;

    /* renamed from: d  reason: collision with root package name */
    private final int f47616d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f47617e;

    /* renamed from: f  reason: collision with root package name */
    private Path f47618f;

    /* renamed from: g  reason: collision with root package name */
    private Canvas f47619g;

    /* renamed from: h  reason: collision with root package name */
    private int f47620h;

    /* renamed from: i  reason: collision with root package name */
    private int f47621i;

    /* renamed from: j  reason: collision with root package name */
    private Paint f47622j;

    /* renamed from: k  reason: collision with root package name */
    private int f47623k;

    /* renamed from: l  reason: collision with root package name */
    private int f47624l;

    /* renamed from: m  reason: collision with root package name */
    private b f47625m;

    /* renamed from: n  reason: collision with root package name */
    private c f47626n;

    /* renamed from: o  reason: collision with root package name */
    private int f47627o;

    /* renamed from: p  reason: collision with root package name */
    private int f47628p;

    /* renamed from: q  reason: collision with root package name */
    private volatile boolean f47629q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f47630r;

    /* renamed from: s  reason: collision with root package name */
    private Runnable f47631s;

    /* renamed from: t  reason: collision with root package name */
    private Bitmap f47632t;

    /* renamed from: u  reason: collision with root package name */
    boolean f47633u;

    /* renamed from: v  reason: collision with root package name */
    int f47634v;

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                int width = ScratchView.this.getWidth();
                int height = ScratchView.this.getHeight();
                int i4 = width * height;
                float f5 = i4;
                int[] iArr = new int[i4];
                ScratchView.f47613x.getPixels(iArr, 0, width, 0, 0, width, height);
                float f6 = 0.0f;
                for (int i5 = 0; i5 < width; i5++) {
                    for (int i6 = 0; i6 < height; i6++) {
                        if (iArr[(i6 * width) + i5] == 0) {
                            f6 += 1.0f;
                        }
                    }
                }
                if (f6 <= 0.0f || f5 <= 0.0f || ((int) ((f6 * 100.0f) / f5)) <= ScratchView.this.f47624l) {
                    return;
                }
                ScratchView.this.f47629q = true;
                ScratchView.this.f47630r = false;
                ScratchView.this.postInvalidate();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void complete();
    }

    /* loaded from: classes4.dex */
    public interface c {
        void onScratch();
    }

    public ScratchView(Context context) {
        this(context, null);
    }

    public static int e(BitmapFactory.Options options, int i4, int i5) {
        double ceil;
        int i6 = options.outHeight;
        int i7 = options.outWidth;
        if (i6 > i5 || i7 > i4) {
            if (i7 > i6) {
                ceil = Math.ceil(i6 / i5);
            } else {
                ceil = Math.ceil(i7 / i4);
            }
            return (int) ceil;
        }
        return 1;
    }

    public static Bitmap f(Resources resources, int i4, int i5, int i6) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(resources, i4, options);
        options.inSampleSize = e(options, i5, i6);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(resources, i4, options);
    }

    private void g() {
        this.f47617e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f47619g.drawPath(this.f47618f, this.f47617e);
    }

    private void h() {
        if (f47612w == null) {
            f47612w = f(getResources(), this.f47616d, this.f47627o, this.f47628p);
        }
        if (f47613x == null) {
            f47613x = Bitmap.createBitmap(this.f47627o, this.f47628p, Bitmap.Config.ARGB_4444);
        }
        if (this.f47619g == null) {
            this.f47619g = new Canvas(f47613x);
        }
        m();
        l();
        this.f47619g.drawBitmap(f47612w, (Rect) null, new Rect(0, 0, this.f47627o, this.f47628p), this.f47622j);
    }

    private void i() {
        this.f47617e = new Paint();
        this.f47622j = new Paint();
        this.f47618f = new Path();
        this.f47623k = getResources().getDimensionPixelOffset(R.dimen.wdp100);
        this.f47624l = 50;
    }

    private void l() {
        this.f47622j.setColor(Color.parseColor("#c3c3c3"));
        this.f47622j.setAntiAlias(true);
        this.f47622j.setDither(true);
        this.f47622j.setStrokeJoin(Paint.Join.ROUND);
        this.f47622j.setStrokeCap(Paint.Cap.ROUND);
        this.f47622j.setStyle(Paint.Style.FILL);
        this.f47622j.setStrokeWidth(20.0f);
    }

    private void m() {
        this.f47617e.setColor(Color.parseColor("#c3c3c3"));
        this.f47617e.setAntiAlias(true);
        this.f47617e.setDither(true);
        this.f47617e.setStrokeJoin(Paint.Join.ROUND);
        this.f47617e.setStrokeCap(Paint.Cap.ROUND);
        this.f47617e.setStyle(Paint.Style.STROKE);
        this.f47617e.setStrokeWidth(this.f47623k);
    }

    public void j() {
        Bitmap bitmap = f47613x;
        if (bitmap != null) {
            bitmap.recycle();
        }
        Bitmap bitmap2 = f47612w;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
    }

    public void k() {
        i();
        h();
        this.f47629q = false;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        b bVar;
        if (this.f47629q && (bVar = this.f47625m) != null) {
            bVar.complete();
        }
        if (this.f47629q) {
            return;
        }
        g();
        canvas.drawBitmap(f47613x, 0.0f, 0.0f, (Paint) null);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        this.f47627o = getMeasuredWidth();
        this.f47628p = getMeasuredHeight();
        h();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f47633u && !this.f47630r) {
            if (this.f47634v <= 0) {
                l2.a(getContext()).b("已经没有次数了！");
            }
            return true;
        }
        int action = motionEvent.getAction();
        int x4 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        if (action == 0) {
            this.f47630r = true;
            this.f47620h = x4;
            this.f47621i = y2;
            this.f47618f.moveTo(x4, y2);
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2) {
            getParent().requestDisallowInterceptTouchEvent(true);
            int abs = Math.abs(x4 - this.f47620h);
            int abs2 = Math.abs(y2 - this.f47621i);
            if (abs > 3 || abs2 > 3) {
                this.f47618f.lineTo(x4, y2);
                c cVar = this.f47626n;
                if (cVar != null) {
                    cVar.onScratch();
                }
            }
            this.f47620h = x4;
            this.f47621i = y2;
            post(this.f47631s);
        }
        invalidate();
        return true;
    }

    public void setCanCratch(boolean z4) {
        this.f47633u = z4;
    }

    public void setCompletePercentage(int i4) {
        this.f47624l = i4;
    }

    public void setNumber(int i4) {
        this.f47634v = i4;
    }

    public void setOnCompleteListener(b bVar) {
        this.f47625m = bVar;
    }

    public void setOnScratchListener(c cVar) {
        this.f47626n = cVar;
    }

    public ScratchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScratchView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47614b = 70;
        this.f47615c = 50;
        this.f47629q = false;
        this.f47630r = false;
        this.f47631s = new a();
        this.f47633u = true;
        this.f47634v = 1;
        this.f47616d = context.obtainStyledAttributes(attributeSet, R.styleable.scratchView).getResourceId(0, 0);
        i();
    }
}
