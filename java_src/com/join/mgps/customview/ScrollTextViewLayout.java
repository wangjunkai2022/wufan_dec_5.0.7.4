package com.join.mgps.customview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class ScrollTextViewLayout extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    private String[] f47636b;

    /* renamed from: c  reason: collision with root package name */
    private int f47637c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f47638d;

    /* renamed from: e  reason: collision with root package name */
    private int f47639e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f47640f;

    /* renamed from: g  reason: collision with root package name */
    private int f47641g;

    /* renamed from: h  reason: collision with root package name */
    private Drawable f47642h;

    /* renamed from: i  reason: collision with root package name */
    private Handler f47643i;

    /* renamed from: j  reason: collision with root package name */
    Runnable f47644j;

    /* renamed from: k  reason: collision with root package name */
    Runnable f47645k;

    /* loaded from: classes4.dex */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i4 = message.arg1;
            if (i4 == 1) {
                ScrollTextViewLayout.this.l();
            } else if (i4 != 2) {
            } else {
                ScrollTextViewLayout.this.k();
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {

        /* loaded from: classes4.dex */
        class a implements Animation.AnimationListener {
            a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                ScrollTextViewLayout.this.f47643i.postDelayed(ScrollTextViewLayout.this.f47645k, 0L);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                if (ScrollTextViewLayout.this.f47641g == ScrollTextViewLayout.this.f47636b.length) {
                    ScrollTextViewLayout.this.f47640f = true;
                }
                ScrollTextViewLayout.this.f47641g %= ScrollTextViewLayout.this.f47636b.length;
                if (ScrollTextViewLayout.this.f47636b[ScrollTextViewLayout.this.f47641g].length() == 0) {
                    if (ScrollTextViewLayout.this.f47642h == null) {
                        return;
                    }
                    ScrollTextViewLayout.this.f47642h.setBounds(0, 0, ScrollTextViewLayout.this.f47642h.getMinimumWidth(), ScrollTextViewLayout.this.f47642h.getMinimumHeight());
                    ScrollTextViewLayout.this.f47638d.setCompoundDrawables(null, null, null, ScrollTextViewLayout.this.f47642h);
                    ScrollTextViewLayout.this.f47638d.setText("");
                } else {
                    ScrollTextViewLayout.this.f47638d.setCompoundDrawables(null, null, null, null);
                    int S = p1.f.K().S();
                    if (S == 0) {
                        ScrollTextViewLayout.this.p();
                        S = 1;
                    }
                    ScrollTextViewLayout.this.f47638d.setText(S + "");
                }
                ScrollTextViewLayout.this.f47638d.setVisibility(0);
                ScrollTextViewLayout.i(ScrollTextViewLayout.this, 1);
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ScrollTextViewLayout.this.f47640f) {
                if (ScrollTextViewLayout.this.f47642h != null) {
                    ScrollTextViewLayout.this.f47642h.setBounds(0, 0, ScrollTextViewLayout.this.f47642h.getMinimumWidth(), ScrollTextViewLayout.this.f47642h.getMinimumHeight());
                }
                ScrollTextViewLayout.this.f47638d.setCompoundDrawables(null, null, null, ScrollTextViewLayout.this.f47642h);
                ScrollTextViewLayout.this.f47638d.setText("");
                return;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0, ScrollTextViewLayout.this.f47639e);
            translateAnimation.setDuration(1000L);
            translateAnimation.setAnimationListener(new a());
            ScrollTextViewLayout.this.startAnimation(translateAnimation);
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* loaded from: classes4.dex */
        class a implements Animation.AnimationListener {
            a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                ScrollTextViewLayout.this.f47643i.postDelayed(ScrollTextViewLayout.this.f47644j, 0L);
                ScrollTextViewLayout.this.f47638d.setVisibility(4);
            }
        }

        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ScrollTextViewLayout.this.f47640f) {
                if (ScrollTextViewLayout.this.f47642h != null) {
                    ScrollTextViewLayout.this.f47642h.setBounds(0, 0, ScrollTextViewLayout.this.f47642h.getMinimumWidth(), ScrollTextViewLayout.this.f47642h.getMinimumHeight());
                }
                ScrollTextViewLayout.this.f47638d.setCompoundDrawables(null, null, null, ScrollTextViewLayout.this.f47642h);
                ScrollTextViewLayout.this.f47638d.setText("");
                return;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, ScrollTextViewLayout.this.f47639e * (-1), ScrollTextViewLayout.this.f47639e);
            translateAnimation.setDuration(1000L);
            translateAnimation.setAnimationListener(new a());
            ScrollTextViewLayout.this.startAnimation(translateAnimation);
        }
    }

    public ScrollTextViewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47637c = 500;
        this.f47640f = true;
        this.f47641g = 0;
        this.f47643i = new a();
        this.f47644j = new b();
        this.f47645k = new c();
        this.f47637c = context.obtainStyledAttributes(attributeSet, R.styleable.scrollText).getInteger(0, 500);
    }

    static /* synthetic */ int i(ScrollTextViewLayout scrollTextViewLayout, int i4) {
        int i5 = scrollTextViewLayout.f47641g + i4;
        scrollTextViewLayout.f47641g = i5;
        return i5;
    }

    public Drawable getDrawable() {
        return this.f47642h;
    }

    public int getDuration() {
        return this.f47637c;
    }

    public String[] getTextArray() {
        return this.f47636b;
    }

    protected void k() {
        post(this.f47645k);
    }

    protected void l() {
        post(this.f47644j);
    }

    public boolean m() {
        return this.f47640f;
    }

    public void n() {
        this.f47640f = false;
        this.f47641g = 0;
        this.f47643i.postDelayed(this.f47644j, this.f47637c);
    }

    public void o() {
        this.f47640f = false;
        this.f47643i.postDelayed(this.f47644j, this.f47637c);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f47638d = (TextView) getChildAt(0);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        this.f47639e = getHeight();
    }

    public void p() {
        this.f47640f = true;
    }

    public void setDrawable(Drawable drawable) {
        this.f47642h = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        this.f47638d.setCompoundDrawables(null, null, null, drawable);
    }

    public void setDuration(int i4) {
        this.f47637c = i4;
    }

    public void setIsStop(boolean z4) {
        this.f47640f = z4;
    }

    public void setTextArray(String[] strArr) {
        this.f47636b = strArr;
    }

    public void setDrawable(Drawable drawable, int i4) {
        this.f47642h = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        this.f47638d.setCompoundDrawables(null, null, null, drawable);
        this.f47638d.setTextColor(i4);
        this.f47638d.setText("");
    }
}
