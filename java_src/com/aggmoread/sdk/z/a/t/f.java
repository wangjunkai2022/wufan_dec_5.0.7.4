package com.aggmoread.sdk.z.a.t;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* loaded from: classes2.dex */
public class f extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.s.d f2576a;

    /* renamed from: b  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.s.a f2577b;

    /* renamed from: c  reason: collision with root package name */
    private int f2578c;

    /* renamed from: d  reason: collision with root package name */
    private int f2579d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.d();
        }
    }

    public f(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        this.f2578c = com.aggmoread.sdk.z.a.m.b.a(context);
        this.f2579d = com.aggmoread.sdk.z.a.m.b.a(context, 200.0d);
        this.f2576a = new com.aggmoread.sdk.z.a.s.d(context);
        this.f2577b = new com.aggmoread.sdk.z.a.s.b(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.f2576a, layoutParams);
        this.f2576a.c(true);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        this.f2577b.setVisibility(8);
        addView(this.f2577b, layoutParams2);
        this.f2576a.a(this.f2577b);
        post(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            new Exception("test").printStackTrace();
            return;
        }
        boolean z4 = false;
        boolean z5 = true;
        if (layoutParams.height == -2) {
            layoutParams.height = this.f2579d;
            z4 = true;
        }
        if (layoutParams.width == -2) {
            layoutParams.width = this.f2578c;
        } else {
            z5 = z4;
        }
        if (z5) {
            StringBuilder sb = new StringBuilder();
            sb.append("updateLayoutParams width ");
            sb.append(layoutParams.width);
            sb.append(", height ");
            sb.append(layoutParams.height);
            postInvalidate();
        }
    }

    public com.aggmoread.sdk.z.a.s.a a() {
        return this.f2577b;
    }

    public com.aggmoread.sdk.z.a.s.d b() {
        return this.f2576a;
    }

    public void c() {
        com.aggmoread.sdk.z.a.s.d dVar = this.f2576a;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        if (this.f2576a != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("onWindowVisibilityChanged visibility ");
            sb.append(i4);
            if (i4 != 0) {
                c();
            }
        }
    }
}
