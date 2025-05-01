package com.join.mgps.customview;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.join.mgps.Util.w0;
/* loaded from: classes4.dex */
public class SlidingTabLayout4 extends SlidingTabLayout1 {
    private Handler K;
    private c L;
    private int M;
    private ScrollType N;
    private int O;
    private Runnable P;

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
        final /* synthetic */ int f47863b;

        a(int i4) {
            this.f47863b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SlidingTabLayout4.this.h(this.f47863b, 0);
            ViewPager viewPager = SlidingTabLayout4.this.f47792g;
            if (viewPager != null) {
                viewPager.setCurrentItem(this.f47863b);
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SlidingTabLayout4.this.getScrollX() == SlidingTabLayout4.this.M) {
                w0.e("scrollRunnable", "停止滚动");
                SlidingTabLayout4.this.N = ScrollType.IDLE;
                if (SlidingTabLayout4.this.L != null) {
                    SlidingTabLayout4.this.L.a(SlidingTabLayout4.this.N);
                }
                if (SlidingTabLayout4.this.K != null) {
                    SlidingTabLayout4.this.K.removeCallbacks(this);
                    return;
                }
                return;
            }
            w0.e("scrollRunnable", "Fling...");
            SlidingTabLayout4.this.N = ScrollType.FLING;
            if (SlidingTabLayout4.this.L != null) {
                SlidingTabLayout4.this.L.a(SlidingTabLayout4.this.N);
            }
            SlidingTabLayout4 slidingTabLayout4 = SlidingTabLayout4.this;
            slidingTabLayout4.M = slidingTabLayout4.getScrollX();
            if (SlidingTabLayout4.this.K != null) {
                SlidingTabLayout4.this.K.postDelayed(this, SlidingTabLayout4.this.O);
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface c {
        void a(ScrollType scrollType);
    }

    public SlidingTabLayout4(Context context) {
        super(context);
        this.M = -9999999;
        this.N = ScrollType.IDLE;
        this.O = 50;
        this.P = new b();
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
        c(i4, textView);
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

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1) {
            Handler handler = this.K;
            if (handler != null) {
                handler.post(this.P);
            }
        } else if (action == 2) {
            ScrollType scrollType = ScrollType.TOUCH_SCROLL;
            this.N = scrollType;
            c cVar = this.L;
            if (cVar != null) {
                cVar.a(scrollType);
            }
            Handler handler2 = this.K;
            if (handler2 != null) {
                handler2.removeCallbacks(this.P);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    void q(Context context) {
        this.f47798m = -756480;
        setHandler(new Handler());
        this.f47806u = 0;
        this.f47808w = (int) TypedValue.applyDimension(1, 22.0f, getResources().getDisplayMetrics());
    }

    public void setCurrentPosition(int i4) {
        this.f47794i = i4;
    }

    public void setHandler(Handler handler) {
        this.K = handler;
    }

    @Override // com.join.mgps.customview.SlidingTabLayout1
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f47790e = onPageChangeListener;
    }

    public void setOnScrollStateChangedListener(c cVar) {
        this.L = cVar;
    }

    public SlidingTabLayout4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M = -9999999;
        this.N = ScrollType.IDLE;
        this.O = 50;
        this.P = new b();
        q(context);
    }

    public SlidingTabLayout4(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.M = -9999999;
        this.N = ScrollType.IDLE;
        this.O = 50;
        this.P = new b();
        q(context);
    }
}
