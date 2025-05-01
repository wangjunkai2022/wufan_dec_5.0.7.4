package com.airbnb.lottie.model;
/* compiled from: Marker.java */
/* loaded from: classes2.dex */
public class g {

    /* renamed from: d  reason: collision with root package name */
    private static final String f4047d = "\r";

    /* renamed from: a  reason: collision with root package name */
    private final String f4048a;

    /* renamed from: b  reason: collision with root package name */
    public final float f4049b;

    /* renamed from: c  reason: collision with root package name */
    public final float f4050c;

    public g(String str, float f5, float f6) {
        this.f4048a = str;
        this.f4050c = f6;
        this.f4049b = f5;
    }

    public float a() {
        return this.f4050c;
    }

    public String b() {
        return this.f4048a;
    }

    public float c() {
        return this.f4049b;
    }

    public boolean d(String str) {
        if (this.f4048a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f4048a.endsWith(f4047d)) {
            String str2 = this.f4048a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
