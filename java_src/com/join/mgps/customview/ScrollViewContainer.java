package com.join.mgps.customview;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes4.dex */
public class ScrollViewContainer extends RelativeLayout {

    /* renamed from: s  reason: collision with root package name */
    public static final int f47651s = 0;

    /* renamed from: t  reason: collision with root package name */
    public static final int f47652t = 1;

    /* renamed from: u  reason: collision with root package name */
    public static final int f47653u = 2;

    /* renamed from: v  reason: collision with root package name */
    public static final float f47654v = 6.5f;

    /* renamed from: b  reason: collision with root package name */
    private boolean f47655b;

    /* renamed from: c  reason: collision with root package name */
    private VelocityTracker f47656c;

    /* renamed from: d  reason: collision with root package name */
    private int f47657d;

    /* renamed from: e  reason: collision with root package name */
    private int f47658e;

    /* renamed from: f  reason: collision with root package name */
    private View f47659f;

    /* renamed from: g  reason: collision with root package name */
    private View f47660g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f47661h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f47662i;

    /* renamed from: j  reason: collision with root package name */
    private int f47663j;

    /* renamed from: k  reason: collision with root package name */
    private int f47664k;

    /* renamed from: l  reason: collision with root package name */
    private float f47665l;

    /* renamed from: m  reason: collision with root package name */
    private d f47666m;

    /* renamed from: n  reason: collision with root package name */
    private float f47667n;

    /* renamed from: o  reason: collision with root package name */
    private int f47668o;

    /* renamed from: p  reason: collision with root package name */
    private Handler f47669p;

    /* renamed from: q  reason: collision with root package name */
    private View.OnTouchListener f47670q;

    /* renamed from: r  reason: collision with root package name */
    private View.OnTouchListener f47671r;

    /* loaded from: classes4.dex */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (ScrollViewContainer.this.f47665l != 0.0f) {
                if (ScrollViewContainer.this.f47663j != 0) {
                    if (ScrollViewContainer.this.f47663j != 1) {
                        ScrollViewContainer.this.f47666m.a();
                    } else {
                        ScrollViewContainer.c(ScrollViewContainer.this, 6.5f);
                        if (ScrollViewContainer.this.f47665l >= 0.0f) {
                            ScrollViewContainer.this.f47665l = 0.0f;
                            ScrollViewContainer.this.f47663j = 2;
                            ScrollViewContainer.this.f47664k = 0;
                        }
                    }
                } else {
                    ScrollViewContainer.d(ScrollViewContainer.this, 6.5f);
                    if (ScrollViewContainer.this.f47665l <= (-ScrollViewContainer.this.f47657d)) {
                        ScrollViewContainer scrollViewContainer = ScrollViewContainer.this;
                        scrollViewContainer.f47665l = -scrollViewContainer.f47657d;
                        ScrollViewContainer.this.f47663j = 2;
                        ScrollViewContainer.this.f47664k = 1;
                    }
                }
            }
            ScrollViewContainer.this.requestLayout();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnTouchListener {
        b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            ScrollView scrollView = (ScrollView) view;
            ScrollViewContainer.this.f47662i = scrollView.getScrollY() == scrollView.getChildAt(0).getMeasuredHeight() - scrollView.getMeasuredHeight() && ScrollViewContainer.this.f47664k == 0;
            return false;
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnTouchListener {
        c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z4 = true;
            ScrollViewContainer.this.f47661h = (((ScrollView) view).getScrollY() == 0 && ScrollViewContainer.this.f47664k == 1) ? false : false;
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        private Handler f47675a;

        /* renamed from: b  reason: collision with root package name */
        private Timer f47676b = new Timer();

        /* renamed from: c  reason: collision with root package name */
        private a f47677c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a extends TimerTask {

            /* renamed from: b  reason: collision with root package name */
            private Handler f47679b;

            public a(Handler handler) {
                this.f47679b = handler;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                this.f47679b.obtainMessage().sendToTarget();
            }
        }

        public d(Handler handler) {
            this.f47675a = handler;
        }

        public void a() {
            a aVar = this.f47677c;
            if (aVar != null) {
                aVar.cancel();
                this.f47677c = null;
            }
        }

        public void b(long j4) {
            a aVar = this.f47677c;
            if (aVar != null) {
                aVar.cancel();
                this.f47677c = null;
            }
            a aVar2 = new a(this.f47675a);
            this.f47677c = aVar2;
            this.f47676b.schedule(aVar2, 0L, j4);
        }
    }

    public ScrollViewContainer(Context context) {
        super(context);
        this.f47655b = false;
        this.f47663j = 2;
        this.f47664k = 0;
        this.f47669p = new a();
        this.f47670q = new b();
        this.f47671r = new c();
        m();
    }

    static /* synthetic */ float c(ScrollViewContainer scrollViewContainer, float f5) {
        float f6 = scrollViewContainer.f47665l + f5;
        scrollViewContainer.f47665l = f6;
        return f6;
    }

    static /* synthetic */ float d(ScrollViewContainer scrollViewContainer, float f5) {
        float f6 = scrollViewContainer.f47665l - f5;
        scrollViewContainer.f47665l = f6;
        return f6;
    }

    private void m() {
        this.f47666m = new d(this.f47669p);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            VelocityTracker velocityTracker = this.f47656c;
            if (velocityTracker == null) {
                this.f47656c = VelocityTracker.obtain();
            } else {
                velocityTracker.clear();
            }
            this.f47667n = motionEvent.getY();
            this.f47656c.addMovement(motionEvent);
            this.f47668o = 0;
        } else if (actionMasked == 1) {
            this.f47667n = motionEvent.getY();
            this.f47656c.addMovement(motionEvent);
            this.f47656c.computeCurrentVelocity(700);
            float yVelocity = this.f47656c.getYVelocity();
            float f5 = this.f47665l;
            if (f5 != 0.0f && f5 != (-this.f47657d)) {
                if (Math.abs(yVelocity) < 500.0f) {
                    float f6 = this.f47665l;
                    int i4 = this.f47657d;
                    if (f6 <= (-i4) / 2) {
                        this.f47663j = 0;
                    } else if (f6 > (-i4) / 2) {
                        this.f47663j = 1;
                    }
                } else if (yVelocity < 0.0f) {
                    this.f47663j = 0;
                } else {
                    this.f47663j = 1;
                }
                this.f47666m.b(2L);
                try {
                    this.f47656c.recycle();
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        } else if (actionMasked == 2) {
            this.f47656c.addMovement(motionEvent);
            if (this.f47662i && this.f47664k == 0 && this.f47668o == 0) {
                float y2 = this.f47665l + (motionEvent.getY() - this.f47667n);
                this.f47665l = y2;
                if (y2 > 0.0f) {
                    this.f47665l = 0.0f;
                    this.f47664k = 0;
                } else {
                    int i5 = this.f47657d;
                    if (y2 < (-i5)) {
                        this.f47665l = -i5;
                        this.f47664k = 1;
                    }
                }
                if (this.f47665l < -8.0f) {
                    motionEvent.setAction(3);
                }
            } else if (this.f47661h && this.f47664k == 1 && this.f47668o == 0) {
                float y4 = this.f47665l + (motionEvent.getY() - this.f47667n);
                this.f47665l = y4;
                int i6 = this.f47657d;
                if (y4 < (-i6)) {
                    this.f47665l = -i6;
                    this.f47664k = 1;
                } else if (y4 > 0.0f) {
                    this.f47665l = 0.0f;
                    this.f47664k = 0;
                }
                if (this.f47665l > 8 - i6) {
                    motionEvent.setAction(3);
                }
            } else {
                this.f47668o++;
            }
            this.f47667n = motionEvent.getY();
            requestLayout();
        } else if (actionMasked == 5 || actionMasked == 6) {
            this.f47668o = -1;
        }
        try {
            super.dispatchTouchEvent(motionEvent);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        View view = this.f47659f;
        view.layout(0, (int) this.f47665l, this.f47658e, view.getMeasuredHeight() + ((int) this.f47665l));
        this.f47660g.layout(0, this.f47659f.getMeasuredHeight() + ((int) this.f47665l), this.f47658e, this.f47659f.getMeasuredHeight() + ((int) this.f47665l) + this.f47660g.getMeasuredHeight() + 100);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f47655b) {
            return;
        }
        this.f47655b = true;
        this.f47657d = getMeasuredHeight();
        this.f47658e = getMeasuredWidth();
        this.f47659f = getChildAt(0);
        View childAt = getChildAt(1);
        this.f47660g = childAt;
        childAt.setOnTouchListener(this.f47671r);
        this.f47659f.setOnTouchListener(this.f47670q);
    }

    public ScrollViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47655b = false;
        this.f47663j = 2;
        this.f47664k = 0;
        this.f47669p = new a();
        this.f47670q = new b();
        this.f47671r = new c();
        m();
    }

    public ScrollViewContainer(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47655b = false;
        this.f47663j = 2;
        this.f47664k = 0;
        this.f47669p = new a();
        this.f47670q = new b();
        this.f47671r = new c();
        m();
    }
}
