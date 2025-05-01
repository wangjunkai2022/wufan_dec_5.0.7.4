package com.join.mgps.customview.popwindow.view;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
/* loaded from: classes4.dex */
public class PopWindowView extends RelativeLayout {

    /* renamed from: t  reason: collision with root package name */
    public static int f48623t = 1879048192;

    /* renamed from: u  reason: collision with root package name */
    public static int f48624u = 10;

    /* renamed from: v  reason: collision with root package name */
    public static int f48625v;

    /* renamed from: w  reason: collision with root package name */
    public static int f48626w;

    /* renamed from: b  reason: collision with root package name */
    c f48627b;

    /* renamed from: c  reason: collision with root package name */
    private int f48628c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f48629d;

    /* renamed from: e  reason: collision with root package name */
    private com.join.mgps.customview.popwindow.shape.a f48630e;

    /* renamed from: f  reason: collision with root package name */
    private y1.a f48631f;

    /* renamed from: g  reason: collision with root package name */
    private Paint f48632g;

    /* renamed from: h  reason: collision with root package name */
    private Bitmap f48633h;

    /* renamed from: i  reason: collision with root package name */
    private Canvas f48634i;

    /* renamed from: j  reason: collision with root package name */
    private int f48635j;

    /* renamed from: k  reason: collision with root package name */
    private int f48636k;

    /* renamed from: l  reason: collision with root package name */
    private int f48637l;

    /* renamed from: m  reason: collision with root package name */
    private View f48638m;

    /* renamed from: n  reason: collision with root package name */
    private int f48639n;

    /* renamed from: o  reason: collision with root package name */
    private int f48640o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f48641p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f48642q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f48643r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f48644s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            PopWindowView.this.f48630e.e();
            if (PopWindowView.this.f48630e == null || PopWindowView.this.f48630e.c().y == 0 || PopWindowView.this.f48642q) {
                return;
            }
            PopWindowView.s(PopWindowView.this, this);
        }
    }

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private PopWindowView f48646a;

        /* renamed from: b  reason: collision with root package name */
        private Activity f48647b;

        public b(Activity activity) {
            this.f48647b = activity;
            this.f48646a = new PopWindowView(activity);
        }

        public PopWindowView a() {
            if (this.f48646a.f48644s) {
                return this.f48646a;
            }
            this.f48646a.setShape(new com.join.mgps.customview.popwindow.shape.b(this.f48646a.f48631f, this.f48646a.f48635j, this.f48646a.f48636k, this.f48646a.f48637l));
            return this.f48646a;
        }

        public b b(boolean z4) {
            this.f48646a.setDismissOnTouch(z4);
            return this;
        }

        public b c(boolean z4) {
            this.f48646a.setPerformClick(z4);
            return this;
        }

        public b d(com.join.mgps.customview.popwindow.shape.a aVar) {
            this.f48646a.f48644s = true;
            this.f48646a.setShape(aVar);
            return this;
        }

        public b e(int i4) {
            this.f48646a.setDropDownHeight(i4);
            return this;
        }

        public b f(View view) {
            this.f48646a.setDropDownView(view);
            return this;
        }

        public b g(int i4) {
            this.f48646a.setMaskColor(i4);
            return this;
        }

        public b h(c cVar) {
            this.f48646a.setOnDismissListener(cVar);
            return this;
        }

        public b i(View view) {
            this.f48646a.setTarget(new y1.b(view));
            return this;
        }

        public b j(int i4) {
            this.f48646a.setPadding(i4);
            return this;
        }

        public b k(int i4) {
            this.f48646a.setRadius(i4);
            return this;
        }

        public PopWindowView l() {
            a().t(this.f48647b);
            return this.f48646a;
        }
    }

    /* loaded from: classes4.dex */
    public interface c {
        void onDismiss();
    }

    public PopWindowView(Context context) {
        super(context);
        this.f48644s = false;
        q(context);
    }

    private void q(Context context) {
        setWillNotDraw(false);
        setVisibility(4);
        this.f48628c = f48623t;
        this.f48635j = f48624u;
        this.f48636k = f48625v;
        this.f48637l = f48626w;
        this.f48629d = false;
        this.f48641p = false;
        this.f48642q = false;
        this.f48643r = false;
        Paint paint = new Paint();
        this.f48632g = paint;
        paint.setColor(-1);
        this.f48632g.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f48632g.setFlags(1);
        getViewTreeObserver().addOnGlobalLayoutListener(new a());
    }

    private void r() {
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    @TargetApi(16)
    public static void s(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (Build.VERSION.SDK_INT < 16) {
            view.getViewTreeObserver().removeGlobalOnLayoutListener(onGlobalLayoutListener);
        } else {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDismissOnTouch(boolean z4) {
        this.f48641p = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaskColor(int i4) {
        this.f48628c = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPadding(int i4) {
        this.f48635j = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPerformClick(boolean z4) {
        this.f48643r = z4;
    }

    private void setReady(boolean z4) {
        this.f48629d = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShape(com.join.mgps.customview.popwindow.shape.a aVar) {
        this.f48630e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTarget(y1.a aVar) {
        this.f48631f = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(Activity activity) {
        if (this.f48638m != null) {
            Rect b5 = this.f48631f.b();
            CardView cardView = new CardView(activity);
            cardView.setCardBackgroundColor(0);
            cardView.setCardElevation(0.0f);
            cardView.setRadius(this.f48636k);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b5.width(), this.f48631f.getHeight() + this.f48637l);
            int i4 = b5.left;
            layoutParams.leftMargin = i4;
            layoutParams.topMargin = b5.top;
            layoutParams.rightMargin = i4;
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(b5.width(), this.f48631f.getHeight() + this.f48637l);
            layoutParams2.topMargin = this.f48631f.getHeight();
            cardView.addView(this.f48638m, layoutParams2);
            addView(cardView, layoutParams);
        }
        ((ViewGroup) activity.getWindow().getDecorView()).addView(this);
        setReady(true);
        setVisibility(0);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f48629d) {
            if (this.f48633h == null || canvas == null) {
                this.f48633h = Bitmap.createBitmap(this.f48639n, this.f48640o, Bitmap.Config.ARGB_8888);
                this.f48634i = new Canvas(this.f48633h);
            }
            this.f48634i.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f48634i.drawColor(this.f48628c);
            this.f48630e.a(this.f48634i, this.f48632g, this.f48635j, this.f48636k);
            canvas.drawBitmap(this.f48633h, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        this.f48639n = getMeasuredWidth();
        this.f48640o = getMeasuredHeight();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean d5 = this.f48630e.d(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        if (action == 0) {
            if (d5 && this.f48643r) {
                this.f48631f.getView().setPressed(true);
                this.f48631f.getView().invalidate();
            }
            return true;
        } else if (action != 1) {
            return super.onTouchEvent(motionEvent);
        } else {
            if (d5 || this.f48641p) {
                p();
            }
            if (d5 && this.f48643r) {
                this.f48631f.getView().setPressed(false);
                this.f48631f.getView().invalidate();
            }
            return true;
        }
    }

    public void p() {
        setVisibility(8);
        r();
        Bitmap bitmap = this.f48633h;
        if (bitmap != null) {
            bitmap.recycle();
        }
        if (this.f48634i != null) {
            this.f48634i = null;
        }
        c cVar = this.f48627b;
        if (cVar != null) {
            cVar.onDismiss();
        }
    }

    public void setDropDownHeight(int i4) {
        this.f48637l = i4;
    }

    public void setDropDownView(View view) {
        this.f48638m = view;
    }

    public void setOnDismissListener(c cVar) {
        this.f48627b = cVar;
    }

    public void setRadius(int i4) {
        this.f48636k = i4;
    }

    public PopWindowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48644s = false;
        q(context);
    }

    public PopWindowView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f48644s = false;
        q(context);
    }
}
