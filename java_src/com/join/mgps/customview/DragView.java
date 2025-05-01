package com.join.mgps.customview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class DragView extends ImageView implements View.OnTouchListener {

    /* renamed from: b  reason: collision with root package name */
    private int f46918b;

    /* renamed from: c  reason: collision with root package name */
    private int f46919c;

    /* renamed from: d  reason: collision with root package name */
    private Context f46920d;

    /* renamed from: e  reason: collision with root package name */
    private int f46921e;

    /* renamed from: f  reason: collision with root package name */
    private int f46922f;

    /* renamed from: g  reason: collision with root package name */
    private int f46923g;

    /* renamed from: h  reason: collision with root package name */
    private int f46924h;

    /* renamed from: i  reason: collision with root package name */
    private ViewGroup.MarginLayoutParams f46925i;

    /* renamed from: j  reason: collision with root package name */
    private int f46926j;

    /* renamed from: k  reason: collision with root package name */
    private int f46927k;

    /* renamed from: l  reason: collision with root package name */
    private int f46928l;

    /* renamed from: m  reason: collision with root package name */
    private int f46929m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f46930n;

    /* renamed from: o  reason: collision with root package name */
    private c f46931o;

    /* renamed from: p  reason: collision with root package name */
    private int f46932p;

    /* renamed from: q  reason: collision with root package name */
    private int f46933q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DragView dragView = DragView.this;
            dragView.f46925i = (ViewGroup.MarginLayoutParams) dragView.getLayoutParams();
            DragView.this.f46925i.topMargin = DragView.this.f46919c - (DragView.this.getHeight() * 2);
            DragView.this.f46925i.leftMargin = DragView.this.f46918b - DragView.this.getWidth();
            DragView dragView2 = DragView.this;
            dragView2.setLayoutParams(dragView2.f46925i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f46935b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f46936c;

        b(boolean z4, int i4) {
            this.f46935b = z4;
            this.f46936c = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (this.f46935b) {
                DragView.this.f46925i.leftMargin = (int) (this.f46936c * (1.0f - valueAnimator.getAnimatedFraction()));
            } else {
                DragView.this.f46925i.leftMargin = (int) (this.f46936c + (((DragView.this.f46918b - this.f46936c) - DragView.this.getWidth()) * valueAnimator.getAnimatedFraction()));
            }
            DragView dragView = DragView.this;
            dragView.setLayoutParams(dragView.f46925i);
        }
    }

    /* loaded from: classes4.dex */
    public interface c {
        void a();
    }

    public DragView(Context context) {
        this(context, null);
    }

    public void e() {
        setOnTouchListener(this);
        post(new a());
    }

    public void f(int i4, int i5, boolean z4) {
        ValueAnimator duration = ValueAnimator.ofFloat(i4, i5).setDuration(400L);
        duration.addUpdateListener(new b(z4, i4));
        duration.start();
    }

    public int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", q.a.f73126a);
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f46921e = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            this.f46922f = rawY;
            this.f46926j = this.f46921e;
            this.f46927k = rawY;
        } else if (action == 1) {
            if (this.f46930n) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                this.f46925i = marginLayoutParams;
                marginLayoutParams.topMargin = this.f46924h;
                setLayoutParams(marginLayoutParams);
            }
            this.f46928l = (int) motionEvent.getRawX();
            this.f46929m = (int) motionEvent.getRawY();
            if (Math.abs(this.f46926j - this.f46928l) < 6 && Math.abs(this.f46927k - this.f46929m) < 6) {
                return false;
            }
            int width = this.f46923g + (view.getWidth() / 2);
            int i4 = this.f46918b;
            if (width < i4 / 2) {
                f(this.f46923g, i4 / 2, true);
            } else {
                f(this.f46923g, i4 / 2, false);
            }
        } else if (action == 2) {
            this.f46930n = true;
            int rawX = ((int) motionEvent.getRawX()) - this.f46921e;
            int rawY2 = ((int) motionEvent.getRawY()) - this.f46922f;
            this.f46923g = view.getLeft() + rawX;
            this.f46924h = view.getTop() + rawY2;
            int right = view.getRight() + rawX;
            int bottom = view.getBottom() + rawY2;
            if (this.f46923g < 0) {
                this.f46923g = 0;
                right = 0 + view.getWidth();
            }
            int i5 = this.f46918b;
            if (right > i5) {
                this.f46923g = i5 - view.getWidth();
                right = i5;
            }
            int i6 = this.f46924h;
            int i7 = this.f46932p;
            if (i6 < i7) {
                this.f46924h = i7;
                bottom = view.getHeight() + i7;
            }
            int i8 = this.f46919c;
            if (bottom > i8) {
                this.f46924h = i8 - view.getHeight();
                bottom = i8;
            }
            view.layout(this.f46923g, this.f46924h, right, bottom);
            this.f46921e = (int) motionEvent.getRawX();
            this.f46922f = (int) motionEvent.getRawY();
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        StringBuilder sb = new StringBuilder();
        sb.append("onTouchEvent:");
        sb.append(motionEvent.getAction());
        if (this.f46931o != null && motionEvent.getAction() == 1) {
            this.f46931o.a();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(">>>>>>>>>onTouchEvent:");
            sb2.append(motionEvent.getAction());
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnDragViewClickListener(c cVar) {
        this.f46931o = cVar;
    }

    public DragView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46930n = false;
        this.f46920d = context;
        this.f46933q = getStatusBarHeight();
        this.f46932p = (int) getResources().getDimension(R.dimen.wdp172);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f46918b = displayMetrics.widthPixels;
        this.f46919c = (displayMetrics.heightPixels - this.f46933q) - ((int) getResources().getDimension(R.dimen.wdp100));
        e();
    }
}
