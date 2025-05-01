package com.beizi.fusion.g;

import android.content.Context;
/* compiled from: EmulatorCheckUtil.java */
/* loaded from: classes2.dex */
public class w {

    /* compiled from: EmulatorCheckUtil.java */
    /* loaded from: classes2.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final w f7037a = new w();
    }

    public static final w a() {
        return a.f7037a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
        if (r0.equals("cancro") == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int b() {
        /*
            r6 = this;
            java.lang.String r0 = "ro.hardware"
            java.lang.String r0 = r6.a(r0)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            java.lang.String r0 = r0.toLowerCase()
            r0.hashCode()
            r2 = -1
            int r3 = r0.hashCode()
            r4 = 2
            r5 = 1
            switch(r3) {
                case -1367724016: goto L5f;
                case -822798509: goto L54;
                case 109271: goto L49;
                case 3570999: goto L3e;
                case 3613077: goto L33;
                case 100361430: goto L28;
                case 937844646: goto L1d;
                default: goto L1b;
            }
        L1b:
            r1 = -1
            goto L68
        L1d:
            java.lang.String r1 = "android_x86"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L26
            goto L1b
        L26:
            r1 = 6
            goto L68
        L28:
            java.lang.String r1 = "intel"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L31
            goto L1b
        L31:
            r1 = 5
            goto L68
        L33:
            java.lang.String r1 = "vbox"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3c
            goto L1b
        L3c:
            r1 = 4
            goto L68
        L3e:
            java.lang.String r1 = "ttvm"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L47
            goto L1b
        L47:
            r1 = 3
            goto L68
        L49:
            java.lang.String r1 = "nox"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L52
            goto L1b
        L52:
            r1 = 2
            goto L68
        L54:
            java.lang.String r1 = "vbox86"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5d
            goto L1b
        L5d:
            r1 = 1
            goto L68
        L5f:
            java.lang.String r3 = "cancro"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L68
            goto L1b
        L68:
            switch(r1) {
                case 0: goto L6c;
                case 1: goto L6c;
                case 2: goto L6c;
                case 3: goto L6c;
                case 4: goto L6c;
                case 5: goto L6c;
                case 6: goto L6c;
                default: goto L6b;
            }
        L6b:
            goto L6d
        L6c:
            r4 = 1
        L6d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beizi.fusion.g.w.b():int");
    }

    private int c() {
        String a5 = a("ro.build.flavor");
        if (a5 == null) {
            return 0;
        }
        String lowerCase = a5.toLowerCase();
        return (lowerCase.contains("vbox") || lowerCase.contains("sdk_gphone")) ? 1 : 2;
    }

    private int d() {
        String a5 = a("ro.product.model");
        if (a5 == null) {
            return 0;
        }
        String lowerCase = a5.toLowerCase();
        return (lowerCase.contains("google_sdk") || lowerCase.contains("emulator") || lowerCase.contains("android sdk built for x86")) ? 1 : 2;
    }

    private int e() {
        String a5 = a("ro.product.manufacturer");
        if (a5 == null) {
            return 0;
        }
        String lowerCase = a5.toLowerCase();
        return (lowerCase.contains("genymotion") || lowerCase.contains("netease")) ? 1 : 2;
    }

    private int f() {
        String a5 = a("ro.product.board");
        if (a5 == null) {
            return 0;
        }
        String lowerCase = a5.toLowerCase();
        return (lowerCase.contains(q.a.f73126a) || lowerCase.contains("goldfish")) ? 1 : 2;
    }

    private int g() {
        String a5 = a("ro.board.platform");
        if (a5 == null) {
            return 0;
        }
        return a5.toLowerCase().contains(q.a.f73126a) ? 1 : 2;
    }

    private int h() {
        String a5 = a("gsm.version.baseband");
        if (a5 == null) {
            return 0;
        }
        return a5.contains(f.a("MS4wLjAuMA==")) ? 1 : 2;
    }

    private w() {
    }

    public boolean a(Context context) {
        int i4;
        if (context == null) {
            return true;
        }
        int b5 = b();
        if (b5 == 0) {
            i4 = 1;
        } else if (b5 == 1) {
            return true;
        } else {
            i4 = 0;
        }
        int c5 = c();
        if (c5 == 0) {
            i4++;
        } else if (c5 == 1) {
            return true;
        }
        int d5 = d();
        if (d5 == 0) {
            i4++;
        } else if (d5 == 1) {
            return true;
        }
        int e5 = e();
        if (e5 == 0) {
            i4++;
        } else if (e5 == 1) {
            return true;
        }
        int f5 = f();
        if (f5 == 0) {
            i4++;
        } else if (f5 == 1) {
            return true;
        }
        int g4 = g();
        if (g4 == 0) {
            i4++;
        } else if (g4 == 1) {
            return true;
        }
        int h4 = h();
        if (h4 == 0) {
            i4 += 2;
        } else if (h4 == 1) {
            return true;
        }
        if (!c(context)) {
            i4++;
        }
        if (!b(context)) {
            i4++;
        }
        if (!d(context)) {
            i4++;
        }
        return i4 > 3;
    }

    private boolean b(Context context) {
        try {
            return context.getPackageManager().hasSystemFeature("android.hardware.camera");
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    private boolean c(Context context) {
        try {
            return context.getPackageManager().hasSystemFeature("android.hardware.camera.flash");
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    private boolean d(Context context) {
        try {
            return context.getPackageManager().hasSystemFeature("android.hardware.bluetooth");
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    private String a(String str) {
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            if (invoke != null) {
                return (String) invoke;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
