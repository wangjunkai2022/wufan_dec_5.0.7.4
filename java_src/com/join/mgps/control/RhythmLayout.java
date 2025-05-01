package com.join.mgps.control;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes4.dex */
public class RhythmLayout extends HorizontalScrollView {

    /* renamed from: b  reason: collision with root package name */
    private Context f46287b;

    /* renamed from: c  reason: collision with root package name */
    private com.join.mgps.control.b f46288c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f46289d;

    /* renamed from: e  reason: collision with root package name */
    private b f46290e;

    /* renamed from: f  reason: collision with root package name */
    private com.join.mgps.control.a f46291f;

    /* renamed from: g  reason: collision with root package name */
    private LinearLayout f46292g;

    /* renamed from: h  reason: collision with root package name */
    private float f46293h;

    /* renamed from: i  reason: collision with root package name */
    private int f46294i;

    /* renamed from: j  reason: collision with root package name */
    private int f46295j;

    /* renamed from: k  reason: collision with root package name */
    private int f46296k;

    /* renamed from: l  reason: collision with root package name */
    private int f46297l;

    /* renamed from: m  reason: collision with root package name */
    private int f46298m;

    /* renamed from: n  reason: collision with root package name */
    private long f46299n;

    /* renamed from: o  reason: collision with root package name */
    private int f46300o;

    /* renamed from: p  reason: collision with root package name */
    private int f46301p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f46302b;

        a(List list) {
            this.f46302b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i4 = 0; i4 < this.f46302b.size(); i4++) {
                RhythmLayout.this.v((View) this.f46302b.get(i4), true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends Timer {

        /* renamed from: a  reason: collision with root package name */
        private TimerTask f46304a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f46305b = false;

        /* renamed from: c  reason: collision with root package name */
        private float f46306c;

        /* renamed from: d  reason: collision with root package name */
        private float f46307d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a extends TimerTask {

            /* renamed from: com.join.mgps.control.RhythmLayout$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            class RunnableC0350a implements Runnable {

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ List f46310b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ int f46311c;

                RunnableC0350a(List list, int i4) {
                    this.f46310b = list;
                    this.f46311c = i4;
                }

                @Override // java.lang.Runnable
                public void run() {
                    RhythmLayout rhythmLayout = RhythmLayout.this;
                    rhythmLayout.r(rhythmLayout.f46296k, this.f46310b);
                    RhythmLayout.this.s(this.f46311c, 500, 0, true);
                    RhythmLayout.this.A(10L);
                }
            }

            a() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                int i4;
                long currentTimeMillis = System.currentTimeMillis() - RhythmLayout.this.f46299n;
                if (!b.this.f46305b || currentTimeMillis <= 1000) {
                    return;
                }
                int firstVisibleItemPosition = RhythmLayout.this.getFirstVisibleItemPosition();
                boolean z4 = true;
                boolean z5 = false;
                if (b.this.f46306c > RhythmLayout.this.f46297l || b.this.f46306c < 0.0f) {
                    if (b.this.f46306c > RhythmLayout.this.f46298m - RhythmLayout.this.f46297l && RhythmLayout.this.getSize() >= firstVisibleItemPosition + 7 + 1) {
                        RhythmLayout.this.f46296k = 7;
                        i4 = firstVisibleItemPosition + 1;
                        z4 = false;
                        z5 = true;
                    }
                    i4 = 0;
                    z4 = false;
                } else {
                    i4 = firstVisibleItemPosition - 1;
                    if (i4 >= 0) {
                        RhythmLayout.this.f46296k = 0;
                    }
                    i4 = 0;
                    z4 = false;
                }
                if (z4 || z5) {
                    RhythmLayout.this.f46289d.post(new RunnableC0350a(RhythmLayout.this.o(z4, z5), i4));
                }
            }
        }

        b() {
        }

        void c(float f5, float f6) {
            this.f46306c = f5;
            this.f46307d = f6;
            if (f5 >= 0.0f && ((f5 <= RhythmLayout.this.f46297l || f5 >= RhythmLayout.this.f46298m - RhythmLayout.this.f46297l) && f6 >= 0.0f)) {
                this.f46305b = true;
                return;
            }
            RhythmLayout.this.f46299n = System.currentTimeMillis();
            this.f46305b = false;
        }

        void d() {
            if (this.f46304a == null) {
                this.f46304a = new a();
            }
            schedule(this.f46304a, 300L, 250L);
        }
    }

    public RhythmLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(long j4) {
    }

    private List<View> getVisibleViews() {
        ArrayList arrayList = new ArrayList();
        if (this.f46292g == null) {
            return arrayList;
        }
        int firstVisibleItemPosition = getFirstVisibleItemPosition();
        int i4 = firstVisibleItemPosition + 7;
        if (this.f46292g.getChildCount() < 7) {
            i4 = this.f46292g.getChildCount();
        }
        while (firstVisibleItemPosition < i4) {
            arrayList.add(this.f46292g.getChildAt(firstVisibleItemPosition));
            firstVisibleItemPosition++;
        }
        return arrayList;
    }

    private void k() {
        this.f46290e.c(-1.0f, -1.0f);
        if (this.f46296k < 0) {
            return;
        }
        int firstVisibleItemPosition = getFirstVisibleItemPosition();
        int i4 = this.f46296k + firstVisibleItemPosition;
        List<View> visibleViews = getVisibleViews();
        int size = visibleViews.size();
        int i5 = this.f46296k;
        if (size > i5) {
            visibleViews.remove(i5);
        }
        int i6 = firstVisibleItemPosition - 1;
        if (i6 >= 0) {
            visibleViews.add(this.f46292g.getChildAt(i6));
        }
        int i7 = i4 + 1;
        if (i7 <= this.f46292g.getChildCount()) {
            visibleViews.add(this.f46292g.getChildAt(i7));
        }
        this.f46289d.postDelayed(new a(visibleViews), 200L);
        com.join.mgps.control.a aVar = this.f46291f;
        if (aVar != null) {
            aVar.onSelected(i4);
        }
        this.f46296k = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<View> o(boolean z4, boolean z5) {
        ArrayList arrayList = new ArrayList();
        if (this.f46292g == null) {
            return arrayList;
        }
        int firstVisibleItemPosition = getFirstVisibleItemPosition();
        int i4 = firstVisibleItemPosition + 7;
        if (this.f46292g.getChildCount() < 7) {
            i4 = this.f46292g.getChildCount();
        }
        if (z4 && firstVisibleItemPosition > 0) {
            firstVisibleItemPosition--;
        }
        if (z5 && i4 < this.f46292g.getChildCount()) {
            i4++;
        }
        while (firstVisibleItemPosition < i4) {
            arrayList.add(this.f46292g.getChildAt(firstVisibleItemPosition));
            firstVisibleItemPosition++;
        }
        return arrayList;
    }

    private void p() {
        int dimensionPixelSize = h.e(this.f46287b).widthPixels - getResources().getDimensionPixelSize(R.dimen.topic_margin);
        this.f46298m = dimensionPixelSize;
        float f5 = dimensionPixelSize / 7;
        this.f46293h = f5;
        int i4 = (int) f5;
        this.f46294i = i4;
        this.f46295j = i4 / 6;
        this.f46297l = getResources().getDimensionPixelSize(R.dimen.rhythm_edge_size_for_shift);
        this.f46296k = -1;
        this.f46301p = -1;
        this.f46300o = 0;
        this.f46299n = 0L;
        this.f46289d = new Handler();
        b bVar = new b();
        this.f46290e = bVar;
        bVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(int i4, List<View> list) {
        if (i4 >= list.size()) {
            return;
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            z(list.get(i5), Math.min(Math.max(Math.abs(i4 - i5) * this.f46295j, 10), this.f46294i));
        }
    }

    private Animator x(int i4, int i5, int i6, boolean z4) {
        return com.join.mgps.Util.c.i(this, i4, i5, i6, z4);
    }

    private void y(float f5) {
        List<View> visibleViews = getVisibleViews();
        int i4 = (int) (f5 / this.f46293h);
        if (i4 == this.f46296k || i4 >= this.f46292g.getChildCount()) {
            return;
        }
        this.f46296k = i4;
        r(i4, visibleViews);
    }

    private void z(View view, int i4) {
        if (view != null) {
            com.join.mgps.Util.c.l(view, i4, 100, true, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f46290e.c(motionEvent.getX(), motionEvent.getY());
            this.f46299n = System.currentTimeMillis();
            y(motionEvent.getX() - 40.0f);
            com.join.mgps.control.a aVar = this.f46291f;
            if (aVar != null) {
                aVar.a();
            }
        } else if (action == 1) {
            k();
        } else if (action == 2) {
            this.f46290e.c(motionEvent.getX(), motionEvent.getY());
            y(motionEvent.getX());
        }
        return true;
    }

    public int getFirstVisibleItemPosition() {
        LinearLayout linearLayout = this.f46292g;
        if (linearLayout == null) {
            return 0;
        }
        int childCount = linearLayout.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            if (getScrollX() < this.f46292g.getChildAt(i4).getX() + (this.f46293h / 2.0f)) {
                return i4;
            }
        }
        return 0;
    }

    public float getRhythmItemWidth() {
        return this.f46293h;
    }

    public int getSize() {
        LinearLayout linearLayout = this.f46292g;
        if (linearLayout == null) {
            return 0;
        }
        return linearLayout.getChildCount();
    }

    public Animator l(int i4, boolean z4) {
        if (i4 >= 0) {
            return m(n(i4), z4);
        }
        return null;
    }

    public Animator m(View view, boolean z4) {
        if (view != null) {
            return com.join.mgps.Util.c.l(view, 10, 350, z4, true);
        }
        return null;
    }

    public View n(int i4) {
        return this.f46292g.getChildAt(i4);
    }

    public void q() {
        int childCount = this.f46292g.getChildCount();
        if (childCount < this.f46288c.getCount()) {
            while (childCount < this.f46288c.getCount()) {
                this.f46292g.addView(this.f46288c.getView(childCount, null, null));
                childCount++;
            }
        }
    }

    public Animator s(int i4, int i5, int i6, boolean z4) {
        return x((int) n(i4).getX(), i5, i6, z4);
    }

    public void setAdapter(com.join.mgps.control.b bVar) {
        this.f46288c = bVar;
        if (this.f46292g == null) {
            this.f46292g = (LinearLayout) getChildAt(0);
        }
        this.f46288c.d(this.f46293h);
        for (int i4 = 0; i4 < this.f46288c.getCount(); i4++) {
            this.f46292g.addView(this.f46288c.getView(i4, null, null));
        }
    }

    public void setRhythmListener(com.join.mgps.control.a aVar) {
        this.f46291f = aVar;
    }

    public void setScrollRhythmStartDelayTime(int i4) {
        this.f46300o = i4;
    }

    public Animator t(int i4, int i5, boolean z4) {
        int x4 = (int) n(i4).getX();
        if (x4 == 0) {
            x4 = (int) (this.f46293h * i4);
        }
        return x(x4, 300, i5, z4);
    }

    public Animator u(int i4, boolean z4) {
        if (i4 < 0 || this.f46292g == null || getSize() <= i4) {
            return null;
        }
        return v(n(i4), z4);
    }

    public Animator v(View view, boolean z4) {
        if (view != null) {
            return com.join.mgps.Util.c.l(view, this.f46294i, 350, z4, true);
        }
        return null;
    }

    public void w(int i4) {
        Animator t4;
        StringBuilder sb = new StringBuilder();
        sb.append("showRhythmAtPosition: ");
        sb.append(i4);
        int i5 = this.f46301p;
        if (i5 == i4) {
            return;
        }
        if (i5 >= 0 && this.f46288c.getCount() > 7 && i4 > 3) {
            if (this.f46288c.getCount() - i4 <= 3) {
                t4 = t(this.f46288c.getCount() - 7, this.f46300o, false);
            } else {
                t4 = t(i4 - 3, this.f46300o, false);
            }
        } else {
            t4 = t(0, this.f46300o, false);
        }
        Animator l4 = l(i4, false);
        Animator u4 = u(this.f46301p, false);
        AnimatorSet animatorSet = new AnimatorSet();
        if (l4 != null) {
            animatorSet.playTogether(l4);
        }
        if (u4 != null) {
            animatorSet.playTogether(u4);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(t4, animatorSet);
        animatorSet2.start();
        this.f46301p = i4;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("showRhythmAtPosition: ");
        sb2.append(i4);
    }

    public RhythmLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46287b = context;
        p();
    }
}
