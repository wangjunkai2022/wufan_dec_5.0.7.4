package com.aggmoread.sdk.z.a.t;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
/* loaded from: classes2.dex */
public class c extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private GestureDetector f2570a;

    /* renamed from: b  reason: collision with root package name */
    private ViewTreeObserver.OnScrollChangedListener f2571b;

    /* renamed from: c  reason: collision with root package name */
    public com.aggmoread.sdk.z.a.g.c f2572c;

    /* renamed from: d  reason: collision with root package name */
    private InterfaceC0082c f2573d;

    /* loaded from: classes2.dex */
    class a implements ViewTreeObserver.OnScrollChangedListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            if (c.this.f2573d != null) {
                c.this.f2573d.onScrollChanged();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            com.aggmoread.sdk.z.a.d.c("ApiViewStatusLayout", "onSingleTapUp enter , viewStatusLis = " + c.this.f2573d);
            if (c.this.f2573d != null) {
                c.this.f2573d.onClick(c.this);
                c.this.f2573d = null;
            }
            return super.onSingleTapUp(motionEvent);
        }
    }

    /* renamed from: com.aggmoread.sdk.z.a.t.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0082c {
        void a(int i4);

        void c();

        void onClick(View view);

        void onScrollChanged();
    }

    public c(Context context) {
        super(context);
        this.f2571b = new a();
        this.f2572c = new com.aggmoread.sdk.z.a.g.c();
        b(context);
    }

    private GestureDetector a(Context context) {
        if (this.f2570a == null) {
            this.f2570a = new GestureDetector(context, new b());
        }
        return this.f2570a;
    }

    private void b(Context context) {
        setFocusable(true);
        setClickable(true);
    }

    public void a() {
        if (this.f2571b != null) {
            getViewTreeObserver().removeOnScrollChangedListener(this.f2571b);
        }
    }

    public void a(InterfaceC0082c interfaceC0082c) {
        this.f2573d = interfaceC0082c;
        getViewTreeObserver().addOnScrollChangedListener(this.f2571b);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        InterfaceC0082c interfaceC0082c = this.f2573d;
        if (interfaceC0082c != null) {
            interfaceC0082c.c();
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        StringBuilder sb;
        int i4;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.f2572c.f2086c = (int) motionEvent.getX();
                this.f2572c.f2087d = (int) motionEvent.getY();
                this.f2572c.f2091h = System.currentTimeMillis();
                this.f2572c.f2088e = getWidth();
                this.f2572c.f2089f = getHeight();
                sb = new StringBuilder();
                sb.append("touch ux = ");
                sb.append(this.f2572c.f2086c);
                sb.append(" , uy = ");
                i4 = this.f2572c.f2087d;
            }
            a(getContext()).onTouchEvent(motionEvent);
            return super.dispatchTouchEvent(motionEvent);
        }
        com.aggmoread.sdk.z.a.g.c cVar = this.f2572c;
        cVar.f2084a = (int) motionEvent.getX();
        cVar.f2085b = (int) motionEvent.getY();
        cVar.f2090g = System.currentTimeMillis();
        sb = new StringBuilder();
        sb.append("touch dx = ");
        sb.append(this.f2572c.f2084a);
        sb.append(" , dy = ");
        i4 = this.f2572c.f2085b;
        sb.append(i4);
        com.aggmoread.sdk.z.a.d.c("ApiViewStatusLayout", sb.toString());
        a(getContext()).onTouchEvent(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i4) {
        InterfaceC0082c interfaceC0082c = this.f2573d;
        if (interfaceC0082c != null) {
            interfaceC0082c.a(i4);
        }
        super.onWindowVisibilityChanged(i4);
    }
}
