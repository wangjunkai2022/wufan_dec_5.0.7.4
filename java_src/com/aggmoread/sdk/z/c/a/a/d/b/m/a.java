package com.aggmoread.sdk.z.c.a.a.d.b.m;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
/* loaded from: classes2.dex */
public class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public float f3462a;

    /* renamed from: b  reason: collision with root package name */
    public float f3463b;

    /* renamed from: c  reason: collision with root package name */
    public long f3464c;

    /* renamed from: d  reason: collision with root package name */
    public int f3465d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3466e;

    public a(@NonNull Context context) {
        super(context);
        this.f3465d = com.aggmoread.sdk.z.c.a.a.e.c.u();
        this.f3466e = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r2 != 2) goto L13;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            boolean r0 = r6.f3466e
            r1 = 1
            if (r0 != 0) goto L7
            r0 = 1
            goto Lf
        L7:
            java.lang.String r0 = "xxxx"
            java.lang.String r2 = "onInterceptTouchEvent return false "
            com.aggmoread.sdk.z.c.a.a.e.e.b(r0, r2)
            r0 = 0
        Lf:
            int r2 = r7.getAction()
            if (r2 == 0) goto L43
            if (r2 == r1) goto L1b
            r1 = 2
            if (r2 == r1) goto L29
            goto L55
        L1b:
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r6.f3464c
            long r1 = r1 - r3
            r3 = 2
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L29
            return r0
        L29:
            float r1 = r7.getX()
            float r2 = r6.f3462a
            float r1 = r1 - r2
            int r1 = (int) r1
            float r2 = r7.getY()
            float r3 = r6.f3463b
            float r2 = r2 - r3
            int r2 = (int) r2
            int r1 = r1 * r1
            int r2 = r2 * r2
            int r1 = r1 + r2
            int r2 = r6.f3465d
            if (r1 < r2) goto L55
            return r0
        L43:
            float r0 = r7.getX()
            r6.f3462a = r0
            float r0 = r7.getY()
            r6.f3463b = r0
            long r0 = java.lang.System.currentTimeMillis()
            r6.f3464c = r0
        L55:
            boolean r7 = super.onInterceptTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aggmoread.sdk.z.c.a.a.d.b.m.a.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }
}
