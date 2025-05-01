package com.join.mgps.zxing.camera;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.view.SurfaceHolder;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
/* compiled from: CameraManager.java */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: k  reason: collision with root package name */
    private static final String f55039k = "c";

    /* renamed from: l  reason: collision with root package name */
    private static final int f55040l = 420;

    /* renamed from: m  reason: collision with root package name */
    private static final int f55041m = 420;

    /* renamed from: n  reason: collision with root package name */
    private static final int f55042n = 800;

    /* renamed from: o  reason: collision with root package name */
    private static final int f55043o = 480;

    /* renamed from: p  reason: collision with root package name */
    private static c f55044p;

    /* renamed from: q  reason: collision with root package name */
    static final int f55045q;

    /* renamed from: a  reason: collision with root package name */
    private final Context f55046a;

    /* renamed from: b  reason: collision with root package name */
    private final b f55047b;

    /* renamed from: c  reason: collision with root package name */
    private Camera f55048c;

    /* renamed from: d  reason: collision with root package name */
    private Rect f55049d;

    /* renamed from: e  reason: collision with root package name */
    private Rect f55050e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f55051f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f55052g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f55053h;

    /* renamed from: i  reason: collision with root package name */
    private final g f55054i;

    /* renamed from: j  reason: collision with root package name */
    private final a f55055j;

    static {
        int i4;
        try {
            i4 = Integer.parseInt(Build.VERSION.SDK);
        } catch (NumberFormatException unused) {
            i4 = 10000;
        }
        f55045q = i4;
    }

    private c(Context context) {
        this.f55046a = context;
        b bVar = new b(context);
        this.f55047b = bVar;
        boolean z4 = Integer.parseInt(Build.VERSION.SDK) > 3;
        this.f55053h = z4;
        this.f55054i = new g(bVar, z4);
        this.f55055j = new a();
    }

    public static c c() {
        return f55044p;
    }

    public static void g(Context context) {
        if (f55044p == null) {
            f55044p = new c(context);
        }
    }

    public f a(byte[] bArr, int i4, int i5) {
        Rect f5 = f();
        int f6 = this.f55047b.f();
        String g4 = this.f55047b.g();
        if (f6 != 16 && f6 != 17) {
            if ("yuv420p".equals(g4)) {
                return new f(bArr, i4, i5, f5.left, f5.top, f5.width(), f5.height());
            }
            throw new IllegalArgumentException("Unsupported picture format: " + f6 + '/' + g4);
        }
        return new f(bArr, i4, i5, f5.left, f5.top, f5.width(), f5.height());
    }

    public void b() {
        if (this.f55048c != null) {
            d.a();
            this.f55048c.release();
            this.f55048c = null;
        }
    }

    public Rect d() {
        Point h4 = this.f55047b.h();
        if (this.f55049d == null) {
            if (this.f55048c == null) {
                return null;
            }
            int i4 = h4 != null ? (h4.x * 3) / 4 : 0;
            int i5 = TypedValues.CycleType.TYPE_EASING;
            if (i4 < 420) {
                i4 = TypedValues.CycleType.TYPE_EASING;
            } else if (i4 > 800) {
                i4 = 800;
            }
            int i6 = h4 != null ? (h4.y * 3) / 4 : 0;
            if (i6 >= 420) {
                i5 = i6 > f55043o ? f55043o : i6;
            }
            int i7 = h4 != null ? (h4.x - i4) / 2 : 0;
            int i8 = h4 != null ? (h4.y - i5) / 2 : 0;
            if (this.f55046a.getResources().getConfiguration().orientation == 1) {
                this.f55049d = new Rect(0, i8, i7 + i7 + i4, i5 + i8);
            } else {
                this.f55049d = new Rect(i7, i8, i4 + i7, i5 + i8);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Calculated framing rect: ");
            sb.append(this.f55049d);
        }
        return this.f55049d;
    }

    public Rect e() {
        float f5 = this.f55046a.getResources().getDisplayMetrics().density;
        int i4 = (int) (360.0f * f5);
        int i5 = (int) (f5 * 240.0f);
        Point h4 = this.f55047b.h();
        if (this.f55049d == null) {
            if (this.f55048c == null) {
                return null;
            }
            int i6 = h4.x;
            int i7 = (i6 * 3) / 4;
            if (i7 < 240) {
                i4 = 240;
            } else if (i7 <= i4) {
                i4 = i7;
            }
            int i8 = h4.y;
            int i9 = (i8 * 3) / 4;
            if (i9 < 240) {
                i5 = 240;
            } else if (i9 <= i5) {
                i5 = i9;
            }
            int i10 = (i6 - i4) / 2;
            int i11 = (i8 - i5) / 2;
            this.f55049d = new Rect(i10, i11, i4 + i10, i5 + i11);
            StringBuilder sb = new StringBuilder();
            sb.append("Calculated framing rect: ");
            sb.append(this.f55049d);
        }
        return this.f55049d;
    }

    public Rect f() {
        if (this.f55050e == null) {
            Rect rect = new Rect(d());
            Point c5 = this.f55047b.c();
            Point h4 = this.f55047b.h();
            if (this.f55046a.getResources().getConfiguration().orientation == 1) {
                int i4 = rect.left;
                int i5 = c5.y;
                int i6 = h4.x;
                rect.left = (i4 * i5) / i6;
                rect.right = (rect.right * i5) / i6;
                int i7 = rect.top;
                int i8 = c5.x;
                int i9 = h4.y;
                rect.top = (i7 * i8) / i9;
                rect.bottom = (rect.bottom * i8) / i9;
            } else if (h4 != null) {
                int i10 = rect.left;
                int i11 = c5.x;
                int i12 = h4.x;
                rect.left = (i10 * i11) / i12;
                rect.right = (rect.right * i11) / i12;
                int i13 = rect.top;
                int i14 = c5.y;
                int i15 = h4.y;
                rect.top = (i13 * i14) / i15;
                rect.bottom = (rect.bottom * i14) / i15;
            } else {
                int i16 = rect.left;
                int i17 = c5.x;
                rect.left = i16 * i17;
                rect.right *= i17;
                int i18 = rect.top;
                int i19 = c5.y;
                rect.top = i18 * i19;
                rect.bottom *= i19;
            }
            this.f55050e = rect;
        }
        return this.f55050e;
    }

    public Context getContext() {
        return this.f55046a;
    }

    public void h(SurfaceHolder surfaceHolder) throws IOException {
        if (this.f55048c == null) {
            Camera open = Camera.open();
            this.f55048c = open;
            if (open != null) {
                open.setPreviewDisplay(surfaceHolder);
                if (!this.f55051f) {
                    this.f55051f = true;
                    this.f55047b.i(this.f55048c);
                }
                this.f55047b.j(this.f55048c);
                d.b();
                return;
            }
            throw new IOException();
        }
    }

    public void i(SurfaceHolder surfaceHolder, int i4) throws IOException {
        if (this.f55048c == null) {
            Camera open = Camera.open();
            this.f55048c = open;
            if (open != null) {
                open.setPreviewDisplay(surfaceHolder);
                try {
                    this.f55048c.getParameters().setFocusMode("continuous-picture");
                } catch (Exception unused) {
                }
                if (!this.f55051f) {
                    this.f55051f = true;
                    this.f55047b.i(this.f55048c);
                }
                this.f55047b.k(this.f55048c, i4);
                d.b();
                return;
            }
            throw new IOException();
        }
    }

    public void j(Handler handler, int i4) {
        if (this.f55048c == null || !this.f55052g) {
            return;
        }
        this.f55055j.a(handler, i4);
        this.f55048c.autoFocus(this.f55055j);
    }

    public void k(Handler handler, int i4) {
        if (this.f55048c == null || !this.f55052g) {
            return;
        }
        this.f55054i.a(handler, i4);
        if (this.f55053h) {
            this.f55048c.setOneShotPreviewCallback(this.f55054i);
        } else {
            this.f55048c.setPreviewCallback(this.f55054i);
        }
    }

    public void l() {
        Camera camera = this.f55048c;
        if (camera == null || this.f55052g) {
            return;
        }
        camera.startPreview();
        this.f55052g = true;
    }

    public void m() {
        Camera camera = this.f55048c;
        if (camera == null || !this.f55052g) {
            return;
        }
        if (!this.f55053h) {
            camera.setPreviewCallback(null);
        }
        this.f55048c.stopPreview();
        this.f55054i.a(null, 0);
        this.f55055j.a(null, 0);
        this.f55052g = false;
    }
}
