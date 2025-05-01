package com.join.mgps.customview;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
/* loaded from: classes4.dex */
public class ReboundFrameLayout extends FrameLayout implements View.OnTouchListener, com.facebook.rebound.m {

    /* renamed from: b  reason: collision with root package name */
    private int f47583b;

    /* renamed from: c  reason: collision with root package name */
    private int f47584c;

    /* renamed from: d  reason: collision with root package name */
    private com.facebook.rebound.i f47585d;

    /* renamed from: e  reason: collision with root package name */
    private com.facebook.rebound.o f47586e;

    /* renamed from: f  reason: collision with root package name */
    private Handler f47587f;

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ReboundFrameLayout.this.performClick();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ReboundFrameLayout.this.performClick();
        }
    }

    public ReboundFrameLayout(Context context) {
        super(context);
        this.f47583b = 100;
        this.f47584c = 10;
        this.f47587f = new Handler();
        e();
    }

    private void e() {
        com.facebook.rebound.o m4 = com.facebook.rebound.o.m();
        this.f47586e = m4;
        com.facebook.rebound.i d5 = m4.d();
        this.f47585d = d5;
        d5.a(this);
        setOnTouchListener(this);
        this.f47585d.x(0.0d);
    }

    @Override // com.facebook.rebound.m
    public void a(com.facebook.rebound.i iVar) {
        float f5 = 1.0f - (((float) iVar.f()) * 0.3f);
        setScaleX(f5);
        setScaleY(f5);
    }

    @Override // com.facebook.rebound.m
    public void b(com.facebook.rebound.i iVar) {
    }

    @Override // com.facebook.rebound.m
    public void c(com.facebook.rebound.i iVar) {
    }

    @Override // com.facebook.rebound.m
    public void d(com.facebook.rebound.i iVar) {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f47585d.x(1.0d);
            return true;
        } else if (action == 1) {
            this.f47585d.x(0.0d);
            this.f47587f.postDelayed(new a(), 200L);
            return true;
        } else if (action != 3) {
            return false;
        } else {
            this.f47585d.x(0.0d);
            this.f47587f.postDelayed(new b(), 200L);
            return true;
        }
    }

    public ReboundFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47583b = 100;
        this.f47584c = 10;
        this.f47587f = new Handler();
        e();
    }

    public ReboundFrameLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47583b = 100;
        this.f47584c = 10;
        this.f47587f = new Handler();
        e();
    }

    public ReboundFrameLayout(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f47583b = 100;
        this.f47584c = 10;
        this.f47587f = new Handler();
        e();
    }
}
