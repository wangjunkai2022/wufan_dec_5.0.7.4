package com.aggmoread.sdk.z.a.r;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
/* loaded from: classes2.dex */
public class a extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private View f2397a;

    /* renamed from: b  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.g.c f2398b;

    /* renamed from: c  reason: collision with root package name */
    private InterfaceC0072a f2399c;

    /* renamed from: d  reason: collision with root package name */
    private GestureDetector f2400d;

    /* renamed from: com.aggmoread.sdk.z.a.r.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0072a {
        void a(View view, com.aggmoread.sdk.z.a.g.c cVar);
    }

    public a(InterfaceC0072a interfaceC0072a) {
        this.f2399c = interfaceC0072a;
    }

    public static a a(View view, InterfaceC0072a interfaceC0072a) {
        a aVar = new a(interfaceC0072a);
        aVar.f2397a = view;
        aVar.f2398b = new com.aggmoread.sdk.z.a.g.c();
        aVar.f2400d = new GestureDetector(view.getContext(), aVar);
        view.setOnTouchListener(aVar);
        view.setFocusable(true);
        view.setClickable(true);
        return aVar;
    }

    private boolean b() {
        InterfaceC0072a interfaceC0072a = this.f2399c;
        if (interfaceC0072a != null) {
            interfaceC0072a.a(this.f2397a, this.f2398b);
            this.f2399c = null;
            return true;
        }
        return false;
    }

    public com.aggmoread.sdk.z.a.g.c a() {
        return this.f2398b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        b();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        com.aggmoread.sdk.z.a.d.c("AdTouchCollector", "onSingleTapUp enter");
        return b();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        StringBuilder sb;
        int i4;
        String sb2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f2398b.f2084a = (int) motionEvent.getX();
            this.f2398b.f2085b = (int) motionEvent.getY();
            this.f2398b.f2090g = System.currentTimeMillis();
            sb = new StringBuilder();
            sb.append("touch dx = ");
            sb.append(this.f2398b.f2084a);
            sb.append(" , dy = ");
            i4 = this.f2398b.f2085b;
        } else if (action != 1) {
            if (action == 2) {
                sb2 = "touch mx = " + ((int) motionEvent.getX()) + " , my = " + ((int) motionEvent.getY());
                com.aggmoread.sdk.z.a.d.c("AdTouchCollector", sb2);
            }
            this.f2400d.onTouchEvent(motionEvent);
            return false;
        } else {
            this.f2398b.f2086c = (int) motionEvent.getX();
            this.f2398b.f2087d = (int) motionEvent.getY();
            this.f2398b.f2091h = System.currentTimeMillis();
            this.f2398b.f2088e = this.f2397a.getWidth();
            this.f2398b.f2089f = this.f2397a.getHeight();
            sb = new StringBuilder();
            sb.append("touch ux = ");
            sb.append(this.f2398b.f2086c);
            sb.append(" , uy = ");
            i4 = this.f2398b.f2087d;
        }
        sb.append(i4);
        sb2 = sb.toString();
        com.aggmoread.sdk.z.a.d.c("AdTouchCollector", sb2);
        this.f2400d.onTouchEvent(motionEvent);
        return false;
    }
}
