package com.join.mgps.customview;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;
/* loaded from: classes4.dex */
public class MyParentScrollView extends ScrollView {

    /* renamed from: b  reason: collision with root package name */
    private b f47407b;

    /* renamed from: c  reason: collision with root package name */
    private int f47408c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f47409d;

    /* renamed from: e  reason: collision with root package name */
    private Handler f47410e;

    /* renamed from: f  reason: collision with root package name */
    private float f47411f;

    /* renamed from: g  reason: collision with root package name */
    private float f47412g;

    /* renamed from: h  reason: collision with root package name */
    private float f47413h;

    /* renamed from: i  reason: collision with root package name */
    private float f47414i;

    /* loaded from: classes4.dex */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int scrollY = MyParentScrollView.this.getScrollY();
            if (MyParentScrollView.this.f47408c != scrollY) {
                MyParentScrollView.this.f47408c = scrollY;
                MyParentScrollView.this.f47410e.sendMessageDelayed(MyParentScrollView.this.f47410e.obtainMessage(), 20L);
            }
            if (MyParentScrollView.this.f47407b != null) {
                MyParentScrollView.this.f47407b.a(scrollY);
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a(int i4);
    }

    public MyParentScrollView(Context context) {
        super(context, null);
        this.f47410e = new a();
    }

    public boolean e() {
        return this.f47409d;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f47412g = 0.0f;
            this.f47411f = 0.0f;
            this.f47413h = motionEvent.getX();
            this.f47414i = motionEvent.getY();
        } else if (action == 2) {
            float x4 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.f47411f += Math.abs(x4 - this.f47413h);
            float abs = this.f47412g + Math.abs(y2 - this.f47414i);
            this.f47412g = abs;
            this.f47413h = x4;
            this.f47414i = y2;
            if (this.f47411f > abs) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar = this.f47407b;
        if (bVar != null) {
            int scrollY = getScrollY();
            this.f47408c = scrollY;
            bVar.a(scrollY);
        }
        if (motionEvent.getAction() == 1) {
            Handler handler = this.f47410e;
            handler.sendMessageDelayed(handler.obtainMessage(), 20L);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setIsInnerScroll(boolean z4) {
        this.f47409d = z4;
    }

    public void setOnScrollListener(b bVar) {
        this.f47407b = bVar;
    }

    public MyParentScrollView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47410e = new a();
    }

    public MyParentScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47410e = new a();
    }
}
