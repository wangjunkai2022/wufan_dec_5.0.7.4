package com.airsaid.pickerviewlibrary.widget;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.airsaid.pickerviewlibrary.R;
/* compiled from: BasePickerView.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private Context f4424c;

    /* renamed from: d  reason: collision with root package name */
    protected ViewGroup f4425d;

    /* renamed from: e  reason: collision with root package name */
    private ViewGroup f4426e;

    /* renamed from: f  reason: collision with root package name */
    private ViewGroup f4427f;

    /* renamed from: g  reason: collision with root package name */
    private f.b f4428g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f4429h;

    /* renamed from: i  reason: collision with root package name */
    private Animation f4430i;

    /* renamed from: j  reason: collision with root package name */
    private Animation f4431j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f4432k;

    /* renamed from: m  reason: collision with root package name */
    private View f4434m;

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout.LayoutParams f4423b = new FrameLayout.LayoutParams(-1, -2, 80);

    /* renamed from: l  reason: collision with root package name */
    private int f4433l = 80;

    /* renamed from: n  reason: collision with root package name */
    private final View.OnTouchListener f4435n = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BasePickerView.java */
    /* renamed from: com.airsaid.pickerviewlibrary.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class animation.Animation$AnimationListenerC0153a implements Animation.AnimationListener {

        /* compiled from: BasePickerView.java */
        /* renamed from: com.airsaid.pickerviewlibrary.widget.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0154a implements Runnable {
            RunnableC0154a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.c();
            }
        }

        animation.Animation$AnimationListenerC0153a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            a.this.f4426e.post(new RunnableC0154a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: BasePickerView.java */
    /* loaded from: classes2.dex */
    class b implements View.OnTouchListener {
        b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                a.this.b();
                return false;
            }
            return false;
        }
    }

    public a(Context context) {
        this.f4424c = context;
        i();
        g();
        h();
    }

    private void k(View view) {
        this.f4426e.addView(view);
        this.f4425d.startAnimation(this.f4431j);
    }

    public void b() {
        if (this.f4429h) {
            return;
        }
        this.f4429h = true;
        this.f4430i.setAnimationListener(new animation.Animation$AnimationListenerC0153a());
        this.f4425d.startAnimation(this.f4430i);
    }

    public void c() {
        this.f4426e.removeView(this.f4427f);
        this.f4432k = false;
        this.f4429h = false;
        f.b bVar = this.f4428g;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public View d(int i4) {
        return this.f4425d.findViewById(i4);
    }

    public Animation e() {
        return AnimationUtils.loadAnimation(this.f4424c, h.a.a(this.f4433l, true));
    }

    public Animation f() {
        return AnimationUtils.loadAnimation(this.f4424c, h.a.a(this.f4433l, false));
    }

    protected void g() {
        this.f4431j = e();
        this.f4430i = f();
    }

    protected void h() {
    }

    protected void i() {
        LayoutInflater from = LayoutInflater.from(this.f4424c);
        ViewGroup viewGroup = (ViewGroup) ((Activity) this.f4424c).getWindow().getDecorView().findViewById(16908290);
        this.f4426e = viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) from.inflate(R.layout.layout_basepickerview, viewGroup, false);
        this.f4427f = viewGroup2;
        viewGroup2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        ViewGroup viewGroup3 = (ViewGroup) this.f4427f.findViewById(R.id.content_container);
        this.f4425d = viewGroup3;
        viewGroup3.setLayoutParams(this.f4423b);
        View findViewById = this.f4427f.findViewById(R.id.outmost_container);
        this.f4434m = findViewById;
        findViewById.setOnTouchListener(this.f4435n);
    }

    public boolean j() {
        return this.f4427f.getParent() != null || this.f4432k;
    }

    public a l(boolean z4) {
        this.f4434m.setOnTouchListener(z4 ? this.f4435n : null);
        return this;
    }

    public a m(f.b bVar) {
        this.f4428g = bVar;
        return this;
    }

    public void n() {
        if (j()) {
            return;
        }
        this.f4432k = true;
        k(this.f4427f);
    }
}
