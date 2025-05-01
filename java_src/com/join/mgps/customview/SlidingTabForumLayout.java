package com.join.mgps.customview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.join.mgps.Util.w0;
import com.join.mgps.dto.ForumBean;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class SlidingTabForumLayout extends SlidingTabLayout1 {
    private List<ForumBean.ForumTabBean> K;
    private e L;
    private Handler M;
    private f N;
    private int O;
    private ScrollType P;
    private int Q;
    private Runnable R;

    /* loaded from: classes4.dex */
    enum ScrollType {
        IDLE,
        TOUCH_SCROLL,
        FLING
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements f {
        a() {
        }

        @Override // com.join.mgps.customview.SlidingTabForumLayout.f
        public void a(ScrollType scrollType) {
            SlidingTabForumLayout.this.t();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        @SuppressLint({"NewApi"})
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 16) {
                SlidingTabForumLayout.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            } else {
                SlidingTabForumLayout.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            SlidingTabForumLayout slidingTabForumLayout = SlidingTabForumLayout.this;
            slidingTabForumLayout.h(slidingTabForumLayout.f47794i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f47768b;

        c(int i4) {
            this.f47768b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SlidingTabForumLayout.this.h(this.f47768b, 0);
            if (SlidingTabForumLayout.this.L != null) {
                SlidingTabForumLayout.this.L.onItemClick(this.f47768b);
            }
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SlidingTabForumLayout.this.getScrollX() == SlidingTabForumLayout.this.O) {
                w0.e("scrollRunnable", "停止滚动");
                SlidingTabForumLayout.this.P = ScrollType.IDLE;
                if (SlidingTabForumLayout.this.N != null) {
                    SlidingTabForumLayout.this.N.a(SlidingTabForumLayout.this.P);
                }
                if (SlidingTabForumLayout.this.M != null) {
                    SlidingTabForumLayout.this.M.removeCallbacks(this);
                    return;
                }
                return;
            }
            w0.e("scrollRunnable", "Fling...");
            SlidingTabForumLayout.this.P = ScrollType.FLING;
            if (SlidingTabForumLayout.this.N != null) {
                SlidingTabForumLayout.this.N.a(SlidingTabForumLayout.this.P);
            }
            SlidingTabForumLayout slidingTabForumLayout = SlidingTabForumLayout.this;
            slidingTabForumLayout.O = slidingTabForumLayout.getScrollX();
            if (SlidingTabForumLayout.this.M != null) {
                SlidingTabForumLayout.this.M.postDelayed(this, SlidingTabForumLayout.this.Q);
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface e {
        void a(int i4, int i5, int i6);

        void onItemClick(int i4);
    }

    /* loaded from: classes4.dex */
    public interface f {
        void a(ScrollType scrollType);
    }

    public SlidingTabForumLayout(Context context) {
        super(context);
        this.O = -9999999;
        this.P = ScrollType.IDLE;
        this.Q = 50;
        this.R = new d();
        s(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        e eVar = this.L;
        if (eVar != null) {
            eVar.a(getCurrentPosition(), getScrollOffset(), getScrollX());
        }
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
        view.setOnClickListener(new c(i4));
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
        this.f47791f.removeAllViews();
        List<ForumBean.ForumTabBean> list = this.K;
        this.f47793h = list == null ? 0 : list.size();
        for (int i4 = 0; i4 < this.f47793h; i4++) {
            d(i4, this.K.get(i4).getTab_name().toString());
        }
        i();
        getViewTreeObserver().addOnGlobalLayoutListener(new b());
    }

    public int getCurrentPosition() {
        return this.f47794i;
    }

    @Override // com.join.mgps.customview.SlidingTabLayout1
    public void h(int i4, int i5) {
        this.f47794i = i4;
        this.f47795j = 0.0f;
        if (this.f47791f.getChildAt(i4) != null) {
            int i6 = this.f47794i;
            super.h(i6, (int) (this.f47795j * this.f47791f.getChildAt(i6).getWidth()));
        }
        t();
        invalidate();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1) {
            Handler handler = this.M;
            if (handler != null) {
                handler.post(this.R);
            }
        } else if (action == 2) {
            ScrollType scrollType = ScrollType.TOUCH_SCROLL;
            this.P = scrollType;
            f fVar = this.N;
            if (fVar != null) {
                fVar.a(scrollType);
            }
            Handler handler2 = this.M;
            if (handler2 != null) {
                handler2.removeCallbacks(this.R);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    void s(Context context) {
        this.f47798m = -756480;
        setHandler(new Handler());
        setOnScrollStateChangedListener(new a());
    }

    public void setCurrentPosition(int i4) {
        this.f47794i = i4;
    }

    public void setHandler(Handler handler) {
        this.M = handler;
    }

    public void setItem(List<ForumBean.ForumTabBean> list) {
        List<ForumBean.ForumTabBean> list2 = this.K;
        if (list2 != null) {
            list2.clear();
        }
        if (this.K == null) {
            this.K = new ArrayList();
        }
        if (list == null || list.size() == 0) {
            return;
        }
        this.K.addAll(list);
        g();
    }

    public void setOnForumSlidingTabListener(e eVar) {
        this.L = eVar;
    }

    @Override // com.join.mgps.customview.SlidingTabLayout1
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f47790e = onPageChangeListener;
    }

    public void setOnScrollStateChangedListener(f fVar) {
        this.N = fVar;
    }

    public SlidingTabForumLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.O = -9999999;
        this.P = ScrollType.IDLE;
        this.Q = 50;
        this.R = new d();
        s(context);
    }

    public SlidingTabForumLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.O = -9999999;
        this.P = ScrollType.IDLE;
        this.Q = 50;
        this.R = new d();
        s(context);
    }
}
