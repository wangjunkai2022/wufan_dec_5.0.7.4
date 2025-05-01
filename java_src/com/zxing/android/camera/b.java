package com.zxing.android.camera;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.hardware.Camera;
import android.preference.PreferenceManager;
import android.view.Display;
import android.view.WindowManager;
import java.util.Collection;
import java.util.Iterator;
import kotlinx.coroutines.s0;
/* compiled from: CameraConfigurationManager.java */
/* loaded from: classes6.dex */
final class b {

    /* renamed from: d  reason: collision with root package name */
    private static final String f68694d = "CameraConfiguration";

    /* renamed from: e  reason: collision with root package name */
    private static final int f68695e = 76800;

    /* renamed from: f  reason: collision with root package name */
    private static final int f68696f = 384000;

    /* renamed from: g  reason: collision with root package name */
    public static final String f68697g = "preferences_front_light";

    /* renamed from: a  reason: collision with root package name */
    private final Context f68698a;

    /* renamed from: b  reason: collision with root package name */
    private Point f68699b;

    /* renamed from: c  reason: collision with root package name */
    private Point f68700c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context) {
        this.f68698a = context;
    }

    private static void a(Camera.Parameters parameters, boolean z4) {
        String c5;
        if (z4) {
            c5 = c(parameters.getSupportedFlashModes(), "torch", s0.f71246d);
        } else {
            c5 = c(parameters.getSupportedFlashModes(), s0.f71247e);
        }
        if (c5 != null) {
            parameters.setFlashMode(c5);
        }
    }

    private static Point b(Camera.Parameters parameters, Point point, boolean z4) {
        Iterator<Camera.Size> it2 = parameters.getSupportedPreviewSizes().iterator();
        Point point2 = null;
        int i4 = Integer.MAX_VALUE;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Camera.Size next = it2.next();
            int i5 = next.height;
            int i6 = next.width;
            int i7 = i5 * i6;
            if (i7 >= f68695e && i7 <= f68696f) {
                int i8 = z4 ? i5 : i6;
                if (z4) {
                    i5 = i6;
                }
                int abs = Math.abs((point.x * i5) - (point.y * i8));
                if (abs == 0) {
                    point2 = new Point(i8, i5);
                    break;
                } else if (abs < i4) {
                    point2 = new Point(i8, i5);
                    i4 = abs;
                }
            }
        }
        if (point2 == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            return new Point(previewSize.width, previewSize.height);
        }
        return point2;
    }

    private static String c(Collection<String> collection, String... strArr) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Supported values: ");
        sb.append(collection);
        if (collection != null) {
            int length = strArr.length;
            for (int i4 = 0; i4 < length; i4++) {
                str = strArr[i4];
                if (collection.contains(str)) {
                    break;
                }
            }
        }
        str = null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Settable value: ");
        sb2.append(str);
        return str;
    }

    private static void g(Camera.Parameters parameters, SharedPreferences sharedPreferences) {
        a(parameters, sharedPreferences.getBoolean(f68697g, false));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Point d() {
        return this.f68700c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Point e() {
        return this.f68699b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        Display defaultDisplay = ((WindowManager) this.f68698a.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        if (width >= height) {
            width = height;
            height = width;
        }
        this.f68699b = new Point(width, height);
        StringBuilder sb = new StringBuilder();
        sb.append("Screen resolution: ");
        sb.append(this.f68699b);
        this.f68700c = b(parameters, new Point(height, width), false);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Camera resolution: ");
        sb2.append(this.f68700c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        if (parameters == null) {
            return;
        }
        g(parameters, PreferenceManager.getDefaultSharedPreferences(this.f68698a));
        String c5 = c(parameters.getSupportedFocusModes(), s0.f71245c, "macro");
        if (c5 != null) {
            parameters.setFocusMode(c5);
        }
        Point point = this.f68700c;
        parameters.setPreviewSize(point.x, point.y);
        camera.setDisplayOrientation(90);
        camera.setParameters(parameters);
    }

    void i(Camera camera, boolean z4) {
        Camera.Parameters parameters = camera.getParameters();
        a(parameters, z4);
        camera.setParameters(parameters);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f68698a);
        if (defaultSharedPreferences.getBoolean(f68697g, false) != z4) {
            SharedPreferences.Editor edit = defaultSharedPreferences.edit();
            edit.putBoolean(f68697g, z4);
            edit.commit();
        }
    }
}
