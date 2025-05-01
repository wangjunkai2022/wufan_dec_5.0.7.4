package com.googlecode.mp4parser.h264.model;
/* compiled from: ChromaFormat.java */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: d  reason: collision with root package name */
    public static c f14097d = new c(0, 0, 0);

    /* renamed from: e  reason: collision with root package name */
    public static c f14098e = new c(1, 2, 2);

    /* renamed from: f  reason: collision with root package name */
    public static c f14099f = new c(2, 2, 1);

    /* renamed from: g  reason: collision with root package name */
    public static c f14100g = new c(3, 1, 1);

    /* renamed from: a  reason: collision with root package name */
    private int f14101a;

    /* renamed from: b  reason: collision with root package name */
    private int f14102b;

    /* renamed from: c  reason: collision with root package name */
    private int f14103c;

    public c(int i4, int i5, int i6) {
        this.f14101a = i4;
        this.f14102b = i5;
        this.f14103c = i6;
    }

    public static c a(int i4) {
        c cVar = f14097d;
        if (i4 == cVar.f14101a) {
            return cVar;
        }
        c cVar2 = f14098e;
        if (i4 == cVar2.f14101a) {
            return cVar2;
        }
        c cVar3 = f14099f;
        if (i4 == cVar3.f14101a) {
            return cVar3;
        }
        c cVar4 = f14100g;
        if (i4 == cVar4.f14101a) {
            return cVar4;
        }
        return null;
    }

    public int b() {
        return this.f14101a;
    }

    public int c() {
        return this.f14103c;
    }

    public int d() {
        return this.f14102b;
    }

    public String toString() {
        return "ChromaFormat{\nid=" + this.f14101a + ",\n subWidth=" + this.f14102b + ",\n subHeight=" + this.f14103c + '}';
    }
}
