package com.switfpass.pay.activity.zxing.camera;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import java.util.regex.Pattern;
import kotlinx.coroutines.s0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: f  reason: collision with root package name */
    private static final String f61639f = "d";

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f61640g = Pattern.compile(",");

    /* renamed from: a  reason: collision with root package name */
    private final Context f61641a;

    /* renamed from: b  reason: collision with root package name */
    private Point f61642b;

    /* renamed from: c  reason: collision with root package name */
    private Point f61643c;

    /* renamed from: d  reason: collision with root package name */
    private int f61644d;

    /* renamed from: e  reason: collision with root package name */
    private String f61645e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context) {
        this.f61641a = context;
    }

    private static int a(CharSequence charSequence, int i4) {
        int i5 = 0;
        for (String str : f61640g.split(charSequence)) {
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
        StringBuilder sb;
        int parseInt;
        int parseInt2;
        int abs;
        String[] split = f61640g.split(charSequence);
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
                sb = new StringBuilder("Bad preview-size: ");
            } else {
                try {
                    parseInt = Integer.parseInt(trim.substring(0, indexOf));
                    parseInt2 = Integer.parseInt(trim.substring(indexOf + 1));
                    abs = Math.abs(parseInt - point.x) + Math.abs(parseInt2 - point.y);
                } catch (NumberFormatException unused) {
                    sb = new StringBuilder("Bad preview-size: ");
                }
                if (abs == 0) {
                    i7 = parseInt2;
                    i6 = parseInt;
                    break;
                }
                if (abs < i4) {
                    i7 = parseInt2;
                    i4 = abs;
                    i6 = parseInt;
                }
                i5++;
            }
            sb.append(trim);
            i5++;
        }
        if (i6 <= 0 || i7 <= 0) {
            return null;
        }
        return new Point(i6, i7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        this.f61644d = parameters.getPreviewFormat();
        this.f61645e = parameters.get("preview-format");
        StringBuilder sb = new StringBuilder("Default preview format: ");
        sb.append(this.f61644d);
        sb.append('/');
        sb.append(this.f61645e);
        Display defaultDisplay = ((WindowManager) this.f61641a.getSystemService("window")).getDefaultDisplay();
        this.f61642b = new Point(defaultDisplay.getWidth(), defaultDisplay.getHeight());
        new StringBuilder("Screen resolution: ").append(this.f61642b);
        Point point = this.f61642b;
        String str = parameters.get("preview-size-values");
        if (str == null) {
            str = parameters.get("preview-size-value");
        }
        Point point2 = null;
        if (str != null) {
            new StringBuilder("preview-size-values parameter: ").append(str);
            point2 = b(str, point);
        }
        if (point2 == null) {
            point2 = new Point((point.x >> 3) << 3, (point.y >> 3) << 3);
        }
        this.f61643c = point2;
        new StringBuilder("Camera resolution: ").append(this.f61642b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        new StringBuilder("Setting preview size: ").append(this.f61643c);
        Point point = this.f61643c;
        parameters.setPreviewSize(point.x, point.y);
        if (Build.MODEL.contains("Behold II") && a.f61620m == 3) {
            parameters.set("flash-value", 1);
        } else {
            parameters.set("flash-value", 2);
        }
        parameters.set("flash-mode", s0.f71247e);
        String str = parameters.get("zoom-supported");
        if (str == null || Boolean.parseBoolean(str)) {
            String str2 = parameters.get("max-zoom");
            int i4 = 27;
            if (str2 != null) {
                try {
                    int parseDouble = (int) (Double.parseDouble(str2) * 10.0d);
                    if (27 > parseDouble) {
                        i4 = parseDouble;
                    }
                } catch (NumberFormatException unused) {
                    new StringBuilder("Bad max-zoom: ").append(str2);
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
                    new StringBuilder("Bad taking-picture-zoom-max: ").append(str3);
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
        camera.setDisplayOrientation(90);
        camera.setParameters(parameters);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int e() {
        return this.f61644d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Point f() {
        return this.f61643c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Point g() {
        return this.f61642b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String h() {
        return this.f61645e;
    }
}
