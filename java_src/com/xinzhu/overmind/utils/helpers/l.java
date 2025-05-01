package com.xinzhu.overmind.utils.helpers;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
/* compiled from: StartActivityHelper.java */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private static int f68336a;

    /* renamed from: b  reason: collision with root package name */
    private static int f68337b;

    /* renamed from: c  reason: collision with root package name */
    private static int f68338c;

    /* renamed from: d  reason: collision with root package name */
    private static int f68339d;

    /* renamed from: e  reason: collision with root package name */
    private static int f68340e;

    /* renamed from: f  reason: collision with root package name */
    private static int f68341f;

    /* renamed from: g  reason: collision with root package name */
    private static int f68342g;

    /* renamed from: h  reason: collision with root package name */
    private static int f68343h;

    /* renamed from: i  reason: collision with root package name */
    private static int f68344i;

    /* renamed from: j  reason: collision with root package name */
    private static int f68345j;

    /* renamed from: k  reason: collision with root package name */
    private static int f68346k;

    /* renamed from: l  reason: collision with root package name */
    private static int f68347l;

    static {
        if (com.xinzhu.overmind.utils.e.g()) {
            int i4 = f68336a;
            int i5 = i4 + 1;
            f68336a = i5;
            f68337b = i4;
            int i6 = i5 + 1;
            f68336a = i6;
            f68338c = i5;
            int i7 = i6 + 1;
            f68336a = i7;
            f68339d = i6;
            int i8 = i7 + 1;
            f68336a = i8;
            f68340e = i7;
            int i9 = i8 + 1;
            f68336a = i9;
            f68341f = i8;
            int i10 = i9 + 1;
            f68336a = i10;
            f68342g = i9;
            int i11 = i10 + 1;
            f68336a = i11;
            f68343h = i10;
            int i12 = i11 + 1;
            f68336a = i12;
            f68344i = i11;
            int i13 = i12 + 1;
            f68336a = i13;
            f68345j = i12;
            int i14 = i13 + 1;
            f68336a = i14;
            f68346k = i13;
            f68336a = i14 + 1;
            f68347l = i14;
            return;
        }
        int i15 = f68336a;
        int i16 = i15 + 1;
        f68336a = i16;
        f68337b = i15;
        int i17 = i16 + 1;
        f68336a = i17;
        f68338c = i16;
        int i18 = i17 + 1;
        f68336a = i18;
        f68340e = i17;
        int i19 = i18 + 1;
        f68336a = i19;
        f68341f = i18;
        int i20 = i19 + 1;
        f68336a = i20;
        f68342g = i19;
        int i21 = i20 + 1;
        f68336a = i21;
        f68343h = i20;
        int i22 = i21 + 1;
        f68336a = i22;
        f68344i = i21;
        int i23 = i22 + 1;
        f68336a = i23;
        f68345j = i22;
        int i24 = i23 + 1;
        f68336a = i24;
        f68346k = i23;
        f68336a = i24 + 1;
        f68347l = i24;
    }

    public static void A(int i4) {
        f68344i = i4;
    }

    public static void B(int i4) {
        f68341f = i4;
    }

    public static void C(int i4) {
        f68342g = i4;
    }

    public static void D(int i4) {
        f68343h = i4;
    }

    public static int a() {
        return f68337b;
    }

    public static String b(Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i4 = f68338c;
            if (length < i4) {
                return null;
            }
            return (String) objArr[i4];
        }
        return null;
    }

    public static int c() {
        return f68338c;
    }

    public static int d(Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i4 = f68345j;
            if (length < i4) {
                return -1;
            }
            return ((Integer) objArr[i4]).intValue();
        }
        return -1;
    }

    public static int e() {
        return f68345j;
    }

    public static Object f(Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i4 = f68337b;
            if (length < i4) {
                return null;
            }
            return objArr[i4];
        }
        return null;
    }

    public static Intent g(Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i4 = f68340e;
            if (length < i4) {
                return null;
            }
            return (Intent) objArr[i4];
        }
        return null;
    }

    public static int h() {
        return f68340e;
    }

    public static Bundle i(Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i4 = f68347l;
            if (length < i4) {
                return null;
            }
            return (Bundle) objArr[i4];
        }
        return null;
    }

    public static int j() {
        return f68347l;
    }

    public static Object k(Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i4 = f68346k;
            if (length < i4) {
                return null;
            }
            return objArr[i4];
        }
        return null;
    }

    public static int l() {
        return f68346k;
    }

    public static int m(Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i4 = f68344i;
            if (length < i4) {
                return -1;
            }
            return ((Integer) objArr[i4]).intValue();
        }
        return -1;
    }

    public static int n() {
        return f68344i;
    }

    public static String o(Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i4 = f68341f;
            if (length < i4) {
                return null;
            }
            return (String) objArr[i4];
        }
        return null;
    }

    public static int p() {
        return f68341f;
    }

    public static IBinder q(Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i4 = f68342g;
            if (length < i4) {
                return null;
            }
            return (IBinder) objArr[i4];
        }
        return null;
    }

    public static int r() {
        return f68342g;
    }

    public static String s(Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i4 = f68343h;
            if (length < i4) {
                return null;
            }
            return (String) objArr[i4];
        }
        return null;
    }

    public static int t() {
        return f68343h;
    }

    public static void u(int i4) {
        f68337b = i4;
    }

    public static void v(int i4) {
        f68338c = i4;
    }

    public static void w(int i4) {
        f68345j = i4;
    }

    public static void x(int i4) {
        f68340e = i4;
    }

    public static void y(int i4) {
        f68347l = i4;
    }

    public static void z(int i4) {
        f68346k = i4;
    }
}
