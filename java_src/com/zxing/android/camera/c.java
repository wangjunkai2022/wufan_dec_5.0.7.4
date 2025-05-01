package com.zxing.android.camera;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.SurfaceHolder;
import com.facebook.common.statfs.StatFsHelper;
import java.io.IOException;
import kotlinx.coroutines.s0;
/* compiled from: CameraManager.java */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: m  reason: collision with root package name */
    private static final String f68701m = "c";

    /* renamed from: n  reason: collision with root package name */
    private static final int f68702n = 240;

    /* renamed from: o  reason: collision with root package name */
    private static final int f68703o = 240;

    /* renamed from: p  reason: collision with root package name */
    private static final int f68704p = 400;

    /* renamed from: q  reason: collision with root package name */
    private static final int f68705q = 400;

    /* renamed from: r  reason: collision with root package name */
    public static final String f68706r = "preferences_reverse_image";

    /* renamed from: a  reason: collision with root package name */
    private final Context f68707a;

    /* renamed from: b  reason: collision with root package name */
    private final b f68708b;

    /* renamed from: c  reason: collision with root package name */
    private Camera f68709c;

    /* renamed from: d  reason: collision with root package name */
    private Rect f68710d;

    /* renamed from: e  reason: collision with root package name */
    private Rect f68711e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f68712f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f68713g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f68714h;

    /* renamed from: i  reason: collision with root package name */
    private int f68715i;

    /* renamed from: j  reason: collision with root package name */
    private int f68716j;

    /* renamed from: k  reason: collision with root package name */
    private final f f68717k;

    /* renamed from: l  reason: collision with root package name */
    private final a f68718l;

    public c(Context context) {
        this.f68707a = context;
        b bVar = new b(context);
        this.f68708b = bVar;
        this.f68717k = new f(bVar);
        this.f68718l = new a();
    }

    public e a(byte[] bArr, int i4, int i5) {
        Rect d5 = d();
        if (d5 == null) {
            return null;
        }
        return new e(bArr, i4, i5, d5.left, d5.top, d5.width(), d5.height(), this.f68714h);
    }

    public void b() {
        Camera camera = this.f68709c;
        if (camera != null) {
            camera.release();
            this.f68709c = null;
            this.f68710d = null;
            this.f68711e = null;
        }
    }

    public Rect c() {
        if (this.f68710d == null) {
            if (this.f68709c == null) {
                return null;
            }
            Point e5 = this.f68708b.e();
            int i4 = e5.x;
            int i5 = (i4 * 3) / 4;
            int i6 = StatFsHelper.f10899h;
            if (i5 < 240) {
                i5 = 240;
            } else if (i5 > 400) {
                i5 = StatFsHelper.f10899h;
            }
            int i7 = e5.y;
            int i8 = (i7 * 3) / 4;
            if (i8 < 240) {
                i6 = 240;
            } else if (i8 <= 400) {
                i6 = i8;
            }
            int i9 = (i4 - i5) / 2;
            int i10 = ((i7 - i6) * 2) / 5;
            this.f68710d = new Rect(i9, i10, i5 + i9, i6 + i10);
            StringBuilder sb = new StringBuilder();
            sb.append("Calculated framing rect: ");
            sb.append(this.f68710d);
        }
        return this.f68710d;
    }

    public Rect d() {
        if (this.f68711e == null) {
            Rect c5 = c();
            if (c5 == null) {
                return null;
            }
            Rect rect = new Rect(c5);
            Point d5 = this.f68708b.d();
            Point e5 = this.f68708b.e();
            int i4 = rect.left;
            int i5 = d5.y;
            int i6 = e5.x;
            rect.left = (i4 * i5) / i6;
            rect.right = (rect.right * i5) / i6;
            int i7 = rect.top;
            int i8 = d5.x;
            int i9 = e5.y;
            rect.top = (i7 * i8) / i9;
            rect.bottom = (rect.bottom * i8) / i9;
            this.f68711e = rect;
        }
        return this.f68711e;
    }

    public void e() {
        Camera camera = this.f68709c;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            parameters.setFlashMode(s0.f71247e);
            this.f68709c.setParameters(parameters);
        }
    }

    public void f(SurfaceHolder surfaceHolder) throws IOException {
        int i4;
        Camera camera = this.f68709c;
        if (camera == null) {
            camera = Camera.open();
            if (camera != null) {
                this.f68709c = camera;
            } else {
                throw new IOException();
            }
        }
        camera.setPreviewDisplay(surfaceHolder);
        if (!this.f68712f) {
            this.f68712f = true;
            this.f68708b.f(camera);
            int i5 = this.f68715i;
            if (i5 > 0 && (i4 = this.f68716j) > 0) {
                j(i5, i4);
                this.f68715i = 0;
                this.f68716j = 0;
            }
        }
        this.f68708b.h(camera);
        this.f68714h = PreferenceManager.getDefaultSharedPreferences(this.f68707a).getBoolean(f68706r, false);
    }

    public void g() {
        Camera camera = this.f68709c;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            parameters.setFlashMode("torch");
            this.f68709c.setParameters(parameters);
        }
    }

    public void h(Handler handler, int i4) {
        if (this.f68709c == null || !this.f68713g) {
            return;
        }
        this.f68718l.a(handler, i4);
        try {
            this.f68709c.autoFocus(this.f68718l);
        } catch (RuntimeException unused) {
        }
    }

    public void i(Handler handler, int i4) {
        Camera camera = this.f68709c;
        if (camera == null || !this.f68713g) {
            return;
        }
        this.f68717k.a(handler, i4);
        camera.setOneShotPreviewCallback(this.f68717k);
    }

    public void j(int i4, int i5) {
        if (this.f68712f) {
            Point e5 = this.f68708b.e();
            int i6 = e5.x;
            if (i4 > i6) {
                i4 = i6;
            }
            int i7 = e5.y;
            if (i5 > i7) {
                i5 = i7;
            }
            int i8 = (i6 - i4) / 2;
            int i9 = (i7 - i5) / 2;
            this.f68710d = new Rect(i8, i9, i4 + i8, i5 + i9);
            StringBuilder sb = new StringBuilder();
            sb.append("Calculated manual framing rect: ");
            sb.append(this.f68710d);
            this.f68711e = null;
            return;
        }
        this.f68715i = i4;
        this.f68716j = i5;
    }

    public void k() {
        Camera camera = this.f68709c;
        if (camera == null || this.f68713g) {
            return;
        }
        camera.startPreview();
        this.f68713g = true;
    }

    public void l() {
        Camera camera = this.f68709c;
        if (camera == null || !this.f68713g) {
            return;
        }
        camera.stopPreview();
        this.f68717k.a(null, 0);
        this.f68718l.a(null, 0);
        this.f68713g = false;
    }

    public void m() {
        Camera camera = this.f68709c;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            if (parameters.getFlashMode().equals("torch")) {
                parameters.setFlashMode(s0.f71247e);
            } else {
                parameters.setFlashMode("torch");
            }
            this.f68709c.setParameters(parameters);
        }
    }
}
