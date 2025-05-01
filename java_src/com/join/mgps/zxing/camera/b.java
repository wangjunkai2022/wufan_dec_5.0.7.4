package com.join.mgps.zxing.camera;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlinx.coroutines.s0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CameraConfigurationManager.java */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: f  reason: collision with root package name */
    private static final String f55030f = "b";

    /* renamed from: g  reason: collision with root package name */
    private static final int f55031g = 27;

    /* renamed from: h  reason: collision with root package name */
    private static final int f55032h = 30;

    /* renamed from: i  reason: collision with root package name */
    private static final Pattern f55033i = Pattern.compile(",");

    /* renamed from: a  reason: collision with root package name */
    private final Context f55034a;

    /* renamed from: b  reason: collision with root package name */
    private Point f55035b;

    /* renamed from: c  reason: collision with root package name */
    private Point f55036c;

    /* renamed from: d  reason: collision with root package name */
    private int f55037d;

    /* renamed from: e  reason: collision with root package name */
    private String f55038e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context) {
        this.f55034a = context;
    }

    private static int a(CharSequence charSequence, int i4) {
        int i5 = 0;
        for (String str : f55033i.split(charSequence)) {
            try {
                double parseDouble = Double.parseDouble(str.trim());
                int i6 = (int) (10.0d * parseDouble);
                double d5 = i4;
                Double.isNaN(d5);
                if (Math.abs(d5 - parseDouble) < Math.abs(i4 - i5)) {
                    i5 = i6;
                }
            } catch (NumberFormatException unused) {
                return i4;
            }
        }
        return i5;
    }

    private static Point b(CharSequence charSequence, Point point) {
        String[] split = f55033i.split(charSequence);
        int length = split.length;
        int i4 = Integer.MAX_VALUE;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i5 >= length) {
                break;
            }
            String trim = split[i5].trim();
            int indexOf = trim.indexOf(120);
            if (indexOf < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bad preview-size: ");
                sb.append(trim);
            } else {
                try {
                    int parseInt = Integer.parseInt(trim.substring(0, indexOf));
                    int parseInt2 = Integer.parseInt(trim.substring(indexOf + 1));
                    int abs = Math.abs(parseInt - point.x) + Math.abs(parseInt2 - point.y);
                    if (abs == 0) {
                        i7 = parseInt2;
                        i6 = parseInt;
                        break;
                    } else if (abs < i4) {
                        i7 = parseInt2;
                        i4 = abs;
                        i6 = parseInt;
                    }
                } catch (NumberFormatException unused) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Bad preview-size: ");
                    sb2.append(trim);
                }
            }
            i5++;
        }
        if (i6 <= 0 || i7 <= 0) {
            return null;
        }
        return new Point(i6, i7);
    }

    private static Point d(Camera.Parameters parameters, Point point) {
        String str = parameters.get("preview-size-values");
        if (str == null) {
            str = parameters.get("preview-size-value");
        }
        Point point2 = null;
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("preview-size-values parameter: ");
            sb.append(str);
            point2 = b(str, point);
        }
        return point2 == null ? new Point((point.x >> 3) << 3, (point.y >> 3) << 3) : point2;
    }

    public static int e() {
        return 30;
    }

    private void m(Camera.Parameters parameters) {
        if (Build.MODEL.contains("Behold II") && c.f55045q == 3) {
            parameters.set("flash-value", 1);
        } else {
            parameters.set("flash-value", 2);
        }
        parameters.set("flash-mode", s0.f71247e);
    }

    private void n(Camera.Parameters parameters) {
        String str = parameters.get("zoom-supported");
        if (str == null || Boolean.parseBoolean(str)) {
            int i4 = 27;
            String str2 = parameters.get("max-zoom");
            if (str2 != null) {
                try {
                    int parseDouble = (int) (Double.parseDouble(str2) * 10.0d);
                    if (27 > parseDouble) {
                        i4 = parseDouble;
                    }
                } catch (NumberFormatException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Bad max-zoom: ");
                    sb.append(str2);
                }
            }
            String str3 = parameters.get("taking-picture-zoom-max");
            if (str3 != null) {
                try {
                    int parseInt = Integer.parseInt(str3);
                    if (i4 > parseInt) {
                        i4 = parseInt;
                    }
                } catch (NumberFormatException unused2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Bad taking-picture-zoom-max: ");
                    sb2.append(str3);
                }
            }
            String str4 = parameters.get("mot-zoom-values");
            if (str4 != null) {
                i4 = a(str4, i4);
            }
            String str5 = parameters.get("mot-zoom-step");
            if (str5 != null) {
                try {
                    int parseDouble2 = (int) (Double.parseDouble(str5.trim()) * 10.0d);
                    if (parseDouble2 > 1) {
                        i4 -= i4 % parseDouble2;
                    }
                } catch (NumberFormatException unused3) {
                }
            }
            if (str2 != null || str4 != null) {
                double d5 = i4;
                Double.isNaN(d5);
                parameters.set("zoom", String.valueOf(d5 / 10.0d));
            }
            if (str3 != null) {
                parameters.set("taking-picture-zoom", i4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Point c() {
        return this.f55036c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f55037d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String g() {
        return this.f55038e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Point h() {
        return this.f55035b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        this.f55037d = parameters.getPreviewFormat();
        this.f55038e = parameters.get("preview-format");
        Display defaultDisplay = ((WindowManager) this.f55034a.getSystemService("window")).getDefaultDisplay();
        this.f55035b = new Point(defaultDisplay.getWidth(), defaultDisplay.getHeight());
        Point point = new Point();
        Point point2 = this.f55035b;
        point.x = point2.x;
        point.y = point2.y;
        int i4 = point2.x;
        int i5 = point2.y;
        if (i4 < i5) {
            point.x = i5;
            point.y = point2.x;
        }
        this.f55036c = d(parameters, point);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(Camera camera) {
        int size;
        Camera.Parameters parameters = camera.getParameters();
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes.size() > 2) {
            size = (supportedPreviewSizes.size() / 2) + 1;
        } else {
            size = supportedPreviewSizes.size() / 2;
        }
        int i4 = supportedPreviewSizes.get(size).width;
        int i5 = supportedPreviewSizes.get(size).height;
        Point point = this.f55036c;
        point.x = i4;
        point.y = i5;
        parameters.setPreviewSize(i4, i5);
        m(parameters);
        n(parameters);
        camera.setParameters(parameters);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(Camera camera, int i4) {
        Camera.Parameters parameters = camera.getParameters();
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        Point point = this.f55036c;
        int i5 = point.x;
        int i6 = point.y;
        Iterator<Camera.Size> it2 = supportedPreviewSizes.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Camera.Size next = it2.next();
            if (next.height == 480 && next.width == 800) {
                i6 = 480;
                i5 = 800;
                break;
            }
        }
        Point point2 = this.f55036c;
        point2.x = i5;
        point2.y = i6;
        StringBuilder sb = new StringBuilder();
        sb.append("Setting preview size: ");
        sb.append(this.f55036c);
        Point point3 = this.f55036c;
        parameters.setPreviewSize(point3.x, point3.y);
        m(parameters);
        n(parameters);
        l(camera, i4);
        camera.setParameters(parameters);
    }

    protected void l(Camera camera, int i4) {
        try {
            Method method = camera.getClass().getMethod("setDisplayOrientation", Integer.TYPE);
            if (method != null) {
                method.invoke(camera, Integer.valueOf(i4));
            }
        } catch (Exception unused) {
        }
    }
}
