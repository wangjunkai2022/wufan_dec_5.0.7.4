package com.switfpass.pay.activity.zxing.camera;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.view.SurfaceHolder;
import java.io.IOException;
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: k  reason: collision with root package name */
    private static final String f61618k = "a";

    /* renamed from: l  reason: collision with root package name */
    private static a f61619l;

    /* renamed from: m  reason: collision with root package name */
    static final int f61620m;

    /* renamed from: a  reason: collision with root package name */
    private final Context f61621a;

    /* renamed from: b  reason: collision with root package name */
    private final d f61622b;

    /* renamed from: c  reason: collision with root package name */
    private Camera f61623c;

    /* renamed from: d  reason: collision with root package name */
    private Rect f61624d;

    /* renamed from: e  reason: collision with root package name */
    private Rect f61625e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f61626f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f61627g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f61628h;

    /* renamed from: i  reason: collision with root package name */
    private final f f61629i;

    /* renamed from: j  reason: collision with root package name */
    private final c f61630j;

    static {
        int i4;
        try {
            i4 = Integer.parseInt(Build.VERSION.SDK);
        } catch (NumberFormatException unused) {
            i4 = 10000;
        }
        f61620m = i4;
    }

    private a(Context context) {
        this.f61621a = context;
        d dVar = new d(context);
        this.f61622b = dVar;
        boolean z4 = Integer.parseInt(Build.VERSION.SDK) > 3;
        this.f61628h = z4;
        this.f61629i = new f(dVar, z4);
        this.f61630j = new c();
    }

    public static a c() {
        return f61619l;
    }

    public static void f(Context context) {
        if (f61619l == null) {
            f61619l = new a(context);
        }
    }

    public final b a(byte[] bArr, int i4, int i5) {
        Rect e5 = e();
        int e6 = this.f61622b.e();
        String h4 = this.f61622b.h();
        if (e6 == 16 || e6 == 17) {
            return new b(bArr, i4, i5, e5.left, e5.top, e5.width(), e5.height());
        }
        if ("yuv420p".equals(h4)) {
            return new b(bArr, i4, i5, e5.left, e5.top, e5.width(), e5.height());
        }
        throw new IllegalArgumentException("Unsupported picture format: " + e6 + '/' + h4);
    }

    public final void b() {
        if (this.f61623c != null) {
            e.d();
            this.f61623c.release();
            this.f61623c = null;
        }
    }

    public final Rect d() {
        Point g4 = this.f61622b.g();
        if (this.f61624d == null) {
            if (this.f61623c == null) {
                return null;
            }
            double d5 = this.f61621a.getResources().getDisplayMetrics().widthPixels;
            Double.isNaN(d5);
            int i4 = (int) (d5 * 0.6d);
            double d6 = i4;
            Double.isNaN(d6);
            int i5 = (int) (d6 * 0.9d);
            int i6 = (g4.x - i4) / 2;
            int i7 = (g4.y - i5) / 4;
            this.f61624d = new Rect(i6, i7, i4 + i6 + 30, i5 + i7 + 50);
            new StringBuilder("Calculated framing rect: ").append(this.f61624d);
        }
        return this.f61624d;
    }

    public final Rect e() {
        if (this.f61625e == null) {
            Rect rect = new Rect(d());
            Point f5 = this.f61622b.f();
            Point g4 = this.f61622b.g();
            int i4 = rect.left;
            int i5 = f5.y;
            int i6 = g4.x;
            rect.left = (i4 * i5) / i6;
            rect.right = (rect.right * i5) / i6;
            int i7 = rect.top;
            int i8 = f5.x;
            int i9 = g4.y;
            rect.top = (i7 * i8) / i9;
            rect.bottom = (rect.bottom * i8) / i9;
            this.f61625e = rect;
        }
        return this.f61625e;
    }

    public final void g(SurfaceHolder surfaceHolder) {
        if (this.f61623c == null) {
            Camera open = Camera.open();
            this.f61623c = open;
            if (open == null) {
                throw new IOException();
            }
            open.setPreviewDisplay(surfaceHolder);
            if (!this.f61626f) {
                this.f61626f = true;
                this.f61622b.c(this.f61623c);
            }
            this.f61622b.d(this.f61623c);
        }
    }

    public final void h(Handler handler, int i4) {
        if (this.f61623c == null || !this.f61627g) {
            return;
        }
        this.f61630j.a(handler, i4);
        this.f61623c.autoFocus(this.f61630j);
    }

    public final void i(Handler handler, int i4) {
        if (this.f61623c == null || !this.f61627g) {
            return;
        }
        this.f61629i.a(handler, i4);
        if (this.f61628h) {
            this.f61623c.setOneShotPreviewCallback(this.f61629i);
        } else {
            this.f61623c.setPreviewCallback(this.f61629i);
        }
    }

    public final void j() {
        Camera camera = this.f61623c;
        if (camera == null || this.f61627g) {
            return;
        }
        camera.startPreview();
        this.f61627g = true;
    }

    public final void k() {
        Camera camera = this.f61623c;
        if (camera == null || !this.f61627g) {
            return;
        }
        if (!this.f61628h) {
            camera.setPreviewCallback(null);
        }
        this.f61623c.stopPreview();
        this.f61629i.a(null, 0);
        this.f61630j.a(null, 0);
        this.f61627g = false;
    }
}
