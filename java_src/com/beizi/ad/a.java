package com.beizi.ad;

import android.content.Context;
import android.util.TypedValue;
/* compiled from: AdSize.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5207a = new a(320, 50, "320x50_mb");

    /* renamed from: b  reason: collision with root package name */
    public static final a f5208b = new a(468, 60, "468x60_as");

    /* renamed from: c  reason: collision with root package name */
    public static final a f5209c = new a(320, 100, "320x100_as");

    /* renamed from: d  reason: collision with root package name */
    public static final a f5210d = new a(728, 90, "728x90_as");

    /* renamed from: e  reason: collision with root package name */
    public static final a f5211e = new a(300, 250, "300x250_as");

    /* renamed from: f  reason: collision with root package name */
    public static final a f5212f = new a(160, 600, "160x600_as");

    /* renamed from: g  reason: collision with root package name */
    public static final a f5213g = new a(-1, -2, "smart_banner");

    /* renamed from: h  reason: collision with root package name */
    public static final a f5214h = new a(-3, -4, "fluid");

    /* renamed from: i  reason: collision with root package name */
    public static final a f5215i = new a(-3, 0, "search_v2");

    /* renamed from: j  reason: collision with root package name */
    private final int f5216j;

    /* renamed from: k  reason: collision with root package name */
    private final int f5217k;

    /* renamed from: l  reason: collision with root package name */
    private final String f5218l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(int r3, int r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = -1
            if (r3 != r1) goto Lb
            java.lang.String r1 = "FULL"
            goto Lf
        Lb:
            java.lang.String r1 = java.lang.String.valueOf(r3)
        Lf:
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            r1 = -2
            if (r4 != r1) goto L1d
            java.lang.String r1 = "AUTO"
            goto L21
        L1d:
            java.lang.String r1 = java.lang.String.valueOf(r4)
        L21:
            r0.append(r1)
            java.lang.String r1 = "_as"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beizi.ad.a.<init>(int, int):void");
    }

    public int a() {
        return this.f5217k;
    }

    public int b() {
        return this.f5216j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f5216j == aVar.f5216j && this.f5217k == aVar.f5217k && this.f5218l.equals(aVar.f5218l);
        }
        return false;
    }

    public int hashCode() {
        return this.f5218l.hashCode();
    }

    public String toString() {
        return this.f5218l;
    }

    private a(int i4, int i5, String str) {
        if (i4 < 0 && i4 != -1 && i4 != -3) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + i4);
        } else if (i5 < 0 && i5 != -2 && i5 != -4) {
            throw new IllegalArgumentException("Invalid height for AdSize: " + i5);
        } else {
            this.f5216j = i4;
            this.f5217k = i5;
            this.f5218l = str;
        }
    }

    public int a(Context context) {
        int i4 = this.f5217k;
        if (i4 == -4 || i4 == -3) {
            return -1;
        }
        if (i4 != -2) {
            return (int) TypedValue.applyDimension(1, i4, context.getResources().getDisplayMetrics());
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public int b(Context context) {
        int i4 = this.f5216j;
        if (i4 == -4 || i4 == -3) {
            return -1;
        }
        if (i4 != -1) {
            return (int) TypedValue.applyDimension(1, i4, context.getResources().getDisplayMetrics());
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}
