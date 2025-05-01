package com.join.mgps.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.w0;
/* loaded from: classes4.dex */
public class SlidingTabLayout5 extends SlidingTabLayout1 {
    private int K;
    private int L;
    private int M;
    private int N;
    private Handler O;
    private c P;
    private int Q;
    private ScrollType R;
    private int S;
    private Runnable T;

    /* loaded from: classes4.dex */
    enum ScrollType {
        IDLE,
        TOUCH_SCROLL,
        FLING
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f47866b;

        a(int i4) {
            this.f47866b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SlidingTabLayout5.this.h(this.f47866b, 0);
            ViewPager viewPager = SlidingTabLayout5.this.f47792g;
            if (viewPager != null) {
                viewPager.setCurrentItem(this.f47866b);
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SlidingTabLayout5.this.getScrollX() == SlidingTabLayout5.this.Q) {
                w0.e("scrollRunnable", "停止滚动");
                SlidingTabLayout5.this.R = ScrollType.IDLE;
                if (SlidingTabLayout5.this.P != null) {
                    SlidingTabLayout5.this.P.a(SlidingTabLayout5.this.R);
                }
                if (SlidingTabLayout5.this.O != null) {
                    SlidingTabLayout5.this.O.removeCallbacks(this);
                    return;
                }
                return;
            }
            w0.e("scrollRunnable", "Fling...");
            SlidingTabLayout5.this.R = ScrollType.FLING;
            if (SlidingTabLayout5.this.P != null) {
                SlidingTabLayout5.this.P.a(SlidingTabLayout5.this.R);
            }
            SlidingTabLayout5 slidingTabLayout5 = SlidingTabLayout5.this;
            slidingTabLayout5.Q = slidingTabLayout5.getScrollX();
            if (SlidingTabLayout5.this.O != null) {
                SlidingTabLayout5.this.O.postDelayed(this, SlidingTabLayout5.this.S);
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface c {
        void a(ScrollType scrollType);
    }

    public SlidingTabLayout5(Context context) {
        super(context);
        this.Q = -9999999;
        this.R = ScrollType.IDLE;
        this.S = 50;
        this.T = new b();
        q(context);
    }

    @Override // com.join.mgps.customview.SlidingTabLayout1
    protected void b(int i4, int i5) {
        ImageButton imageButton = new ImageButton(getContext());
        imageButton.setImageResource(i5);
        c(i4, imageButton);
    }

    @Override // com.join.mgps.customview.SlidingTabLayout1
    protected void c(int i4, View view) {
        view.setFocusable(true);
        view.setOnClickListener(new a(i4));
        int i5 = this.f47808w;
        view.setPadding(i5, 0, i5, 0);
        this.f47791f.addView(view, i4, this.f47801p ? this.f47788c : this.f47787b);
    }

    @Override // com.join.mgps.customview.SlidingTabLayout1
    protected void d(int i4, String str) {
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(17);
        textView.setSingleLine();
        textView.setTypeface(Typeface.DEFAULT, 1);
        textView.setTextSize(getContext().getResources().getDimensionPixelSize(R.dimen.wdp30));
        c(i4, textView);
    }

    @Override // com.join.mgps.customview.SlidingTabLayout1
    protected void e(Canvas canvas) {
        View childAt;
        int i4;
        int i5;
        if (isInEditMode() || this.f47793h == 0) {
            return;
        }
        int height = getHeight();
        this.f47796k.setColor(this.f47798m);
        float left = childAt.getLeft() * 1.0f;
        float right = this.f47791f.getChildAt(this.f47794i).getRight();
        if (this.f47795j > 0.0f && (i5 = this.f47794i) < this.f47793h - 1) {
            View childAt2 = this.f47791f.getChildAt(i5 + 1);
            float f5 = this.f47795j;
            left = (childAt2.getLeft() * f5) + ((1.0f - f5) * left);
            right = (childAt2.getRight() * f5) + ((1.0f - f5) * right);
        }
        int i6 = (int) (((right - left) - this.K) / 2.0f);
        int i7 = (height - this.L) - this.M;
        if (Build.VERSION.SDK_INT >= 21) {
            float f6 = i6;
            int i8 = this.N;
            canvas.drawRoundRect(left + f6, i7, right - f6, i7 + i4, i8, i8, this.f47796k);
        } else {
            float f7 = i6;
            RectF rectF = new RectF(left + f7, i7, right - f7, i7 + this.L);
            int i9 = this.N;
            canvas.drawRoundRect(rectF, i9, i9, this.f47796k);
        }
        this.f47796k.setColor(this.f47799n);
        canvas.drawRect(0.0f, height - this.f47806u, this.f47791f.getWidth(), height, this.f47796k);
        this.f47797l.setColor(this.f47800o);
        for (int i10 = 0; i10 < this.f47793h - 1; i10++) {
            View childAt3 = this.f47791f.getChildAt(i10);
            canvas.drawLine(childAt3.getRight(), this.f47807v, childAt3.getRight(), height - this.f47807v, this.f47797l);
        }
    }

    @Override // com.join.mgps.customview.SlidingTabLayout1
    public void g() {
        super.g();
        if (this.f47792g.getAdapter().getCount() <= 4) {
            setShouldExpand(true);
        } else {
            setShouldExpand(false);
        }
    }

    public int getCurrentPosition() {
        return this.f47794i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.customview.SlidingTabLayout1
    public void i() {
        for (int i4 = 0; i4 < this.f47793h; i4++) {
            View childAt = this.f47791f.getChildAt(i4);
            childAt.setBackgroundResource(this.F);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                textView.setTextSize(0, this.f47810y);
                textView.setTextColor(this.A);
                ViewPager viewPager = this.f47792g;
                if (viewPager != null && i4 == viewPager.getCurrentItem()) {
                    textView.setTextColor(this.B);
                    textView.setTypeface(this.C, 1);
                } else {
                    textView.setTypeface(this.C, 0);
                }
                if (this.f47802q) {
                    if (Build.VERSION.SDK_INT >= 14) {
                        textView.setAllCaps(true);
                    } else {
                        textView.setText(textView.getText().toString().toUpperCase(this.G));
                    }
                }
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1) {
            Handler handler = this.O;
            if (handler != null) {
                handler.post(this.T);
            }
        } else if (action == 2) {
            ScrollType scrollType = ScrollType.TOUCH_SCROLL;
            this.R = scrollType;
            c cVar = this.P;
            if (cVar != null) {
                cVar.a(scrollType);
            }
            Handler handler2 = this.O;
            if (handler2 != null) {
                handler2.removeCallbacks(this.T);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    void q(Context context) {
        this.f47801p = true;
        this.f47798m = -756480;
        this.A = -5723992;
        this.B = -16777216;
        this.f47808w = 0;
        setHandler(new Handler());
        this.f47810y = getContext().getResources().getDimensionPixelOffset(R.dimen.wdp30);
        this.K = getContext().getResources().getDimensionPixelOffset(R.dimen.wdp20);
        this.L = getContext().getResources().getDimensionPixelOffset(R.dimen.wdp6);
        this.M = getContext().getResources().getDimensionPixelOffset(R.dimen.wdp9);
        this.N = getContext().getResources().getDimensionPixelOffset(R.dimen.wdp3);
        this.f47806u = 0;
    }

    public void setCurrentPosition(int i4) {
        this.f47794i = i4;
    }

    public void setHandler(Handler handler) {
        this.O = handler;
    }

    @Override // com.join.mgps.customview.SlidingTabLayout1
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f47790e = onPageChangeListener;
    }

    public void setOnScrollStateChangedListener(c cVar) {
        this.P = cVar;
    }

    public SlidingTabLayout5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Q = -9999999;
        this.R = ScrollType.IDLE;
        this.S = 50;
        this.T = new b();
        q(context);
    }

    public SlidingTabLayout5(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.Q = -9999999;
        this.R = ScrollType.IDLE;
        this.S = 50;
        this.T = new b();
        q(context);
    }
}
