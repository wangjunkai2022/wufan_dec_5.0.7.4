package com.aggmoread.sdk.z.a.s;

import android.content.Context;
import android.view.OrientationEventListener;
/* loaded from: classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private Context f2554a;

    /* renamed from: b  reason: collision with root package name */
    private OrientationEventListener f2555b;

    /* renamed from: c  reason: collision with root package name */
    private int f2556c = 20;

    /* renamed from: d  reason: collision with root package name */
    private long f2557d = 0;

    /* renamed from: e  reason: collision with root package name */
    private long f2558e = 0;

    /* renamed from: f  reason: collision with root package name */
    private b f2559f = b.f2563b;

    /* renamed from: g  reason: collision with root package name */
    private int f2560g = 1;

    /* renamed from: h  reason: collision with root package name */
    private c f2561h;

    /* loaded from: classes2.dex */
    class a extends OrientationEventListener {
        a(Context context, int i4) {
            super(context, i4);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i4) {
            b a5 = e.this.a(i4);
            if (a5 == null) {
                return;
            }
            int i5 = 0;
            if (a5 != e.this.f2559f) {
                e.this.d();
                e.this.f2559f = a5;
                String.format("方向改变, 开始计时, 当前是方向为%s", a5);
                return;
            }
            e.this.a();
            if (e.this.f2557d > 1500) {
                if (a5 == b.f2565d) {
                    if (e.this.f2560g == 0) {
                        return;
                    }
                    e.this.f2560g = 0;
                    if (e.this.f2561h == null) {
                        return;
                    }
                } else if (a5 == b.f2563b) {
                    if (e.this.f2560g != 1) {
                        e.this.f2560g = 1;
                        if (e.this.f2561h != null) {
                            e.this.f2561h.a(1, a5);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (a5 == b.f2564c) {
                    i5 = 9;
                    if (e.this.f2560g == 9) {
                        return;
                    }
                    e.this.f2560g = 9;
                    if (e.this.f2561h == null) {
                        return;
                    }
                } else if (a5 != b.f2566e) {
                    return;
                } else {
                    i5 = 8;
                    if (e.this.f2560g == 8) {
                        return;
                    }
                    e.this.f2560g = 8;
                    if (e.this.f2561h == null) {
                        return;
                    }
                }
                e.this.f2561h.a(i5, a5);
            }
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: b  reason: collision with root package name */
        public static final b f2563b = new b("PORTRAIT", 0);

        /* renamed from: c  reason: collision with root package name */
        public static final b f2564c = new b("REVERSE_PORTRAIT", 1);

        /* renamed from: d  reason: collision with root package name */
        public static final b f2565d = new b("LANDSCAPE", 2);

        /* renamed from: e  reason: collision with root package name */
        public static final b f2566e = new b("REVERSE_LANDSCAPE", 3);

        private b(String str, int i4) {
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a(int i4, b bVar);
    }

    public e(Context context) {
        this.f2554a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b a(int i4) {
        int i5 = this.f2556c;
        if (i4 <= i5 || i4 >= 360 - i5) {
            return b.f2563b;
        }
        if (Math.abs(i4 - 180) <= this.f2556c) {
            return b.f2564c;
        }
        if (Math.abs(i4 - 90) <= this.f2556c) {
            return b.f2566e;
        }
        if (Math.abs(i4 - 270) <= this.f2556c) {
            return b.f2565d;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f2558e == 0) {
            this.f2558e = currentTimeMillis;
        }
        this.f2557d += currentTimeMillis - this.f2558e;
        this.f2558e = currentTimeMillis;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f2558e = 0L;
        this.f2557d = 0L;
    }

    public void a(c cVar) {
        this.f2561h = cVar;
    }

    public void b() {
        OrientationEventListener orientationEventListener = this.f2555b;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
    }

    public void c() {
        if (this.f2555b == null) {
            this.f2555b = new a(this.f2554a, 2);
        }
        this.f2555b.enable();
    }
}
