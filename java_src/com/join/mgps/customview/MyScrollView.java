package com.join.mgps.customview;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
/* loaded from: classes4.dex */
public class MyScrollView extends ScrollView {

    /* renamed from: b  reason: collision with root package name */
    private b f47431b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f47432c;

    /* renamed from: d  reason: collision with root package name */
    private c f47433d;

    /* renamed from: e  reason: collision with root package name */
    private int f47434e;

    /* renamed from: f  reason: collision with root package name */
    private GestureDetector f47435f;

    /* renamed from: g  reason: collision with root package name */
    View.OnTouchListener f47436g;

    /* renamed from: h  reason: collision with root package name */
    private Handler f47437h;

    /* loaded from: classes4.dex */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int scrollY = MyScrollView.this.getScrollY();
            if (MyScrollView.this.f47434e != scrollY) {
                MyScrollView.this.f47434e = scrollY;
                MyScrollView.this.f47437h.sendMessageDelayed(MyScrollView.this.f47437h.obtainMessage(), 20L);
            }
            if (MyScrollView.this.f47431b != null) {
                MyScrollView.this.f47431b.a(scrollY);
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a(int i4);
    }

    /* loaded from: classes4.dex */
    public interface c {
        void a();
    }

    /* loaded from: classes4.dex */
    class d extends GestureDetector.SimpleOnGestureListener {
        d() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
            return Math.abs(f6) > Math.abs(f5);
        }
    }

    public MyScrollView(Context context) {
        super(context, null);
        this.f47432c = true;
        this.f47437h = new a();
    }

    public boolean e() {
        return this.f47432c;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 11) {
            return super.onInterceptTouchEvent(motionEvent) && this.f47432c;
        } else if (this.f47435f.onTouchEvent(motionEvent)) {
            return true;
        } else {
            return super.onInterceptTouchEvent(motionEvent) && this.f47432c;
        }
    }

    @Override // android.view.View
    protected void onScrollChanged(int i4, int i5, int i6, int i7) {
        if (i5 + getHeight() >= computeVerticalScrollRange()) {
            this.f47433d.a();
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar = this.f47431b;
        if (bVar != null) {
            this.f47432c = true;
            int scrollY = getScrollY();
            this.f47434e = scrollY;
            bVar.a(scrollY);
        }
        if (motionEvent.getAction() == 1) {
            Handler handler = this.f47437h;
            handler.sendMessageDelayed(handler.obtainMessage(), 20L);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnScrollListener(b bVar) {
        this.f47431b = bVar;
    }

    public void setOtherTouchEvent(boolean z4) {
        this.f47432c = z4;
    }

    public void setScrollBottomListener(c cVar) {
        this.f47433d = cVar;
    }

    public MyScrollView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47432c = true;
        this.f47437h = new a();
    }

    public MyScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47432c = true;
        this.f47437h = new a();
        if (Build.VERSION.SDK_INT >= 11) {
            this.f47435f = new GestureDetector(new d());
        }
    }
}
