package com.googlecode.mp4parser.h264.model;
/* compiled from: AspectRatio.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f14095b = new a(255);

    /* renamed from: a  reason: collision with root package name */
    private int f14096a;

    private a(int i4) {
        this.f14096a = i4;
    }

    public static a a(int i4) {
        a aVar = f14095b;
        return i4 == aVar.f14096a ? aVar : new a(i4);
    }

    public int b() {
        return this.f14096a;
    }

    public String toString() {
        return "AspectRatio{value=" + this.f14096a + '}';
    }
}
