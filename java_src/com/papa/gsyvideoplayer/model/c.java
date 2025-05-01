package com.papa.gsyvideoplayer.model;
/* compiled from: VideoOptionModel.java */
/* loaded from: classes5.dex */
public class c {

    /* renamed from: f  reason: collision with root package name */
    public static final int f58258f = 0;

    /* renamed from: g  reason: collision with root package name */
    public static final int f58259g = 1;

    /* renamed from: a  reason: collision with root package name */
    int f58260a;

    /* renamed from: b  reason: collision with root package name */
    int f58261b;

    /* renamed from: c  reason: collision with root package name */
    int f58262c;

    /* renamed from: d  reason: collision with root package name */
    String f58263d;

    /* renamed from: e  reason: collision with root package name */
    String f58264e;

    public c(int i4, String str, int i5) {
        this.f58260a = 0;
        this.f58261b = i4;
        this.f58263d = str;
        this.f58262c = i5;
        this.f58260a = 0;
    }

    public int a() {
        return this.f58261b;
    }

    public String b() {
        return this.f58263d;
    }

    public int c() {
        return this.f58262c;
    }

    public String d() {
        return this.f58264e;
    }

    public int e() {
        return this.f58260a;
    }

    public void f(int i4) {
        this.f58261b = i4;
    }

    public void g(String str) {
        this.f58263d = str;
    }

    public void h(int i4) {
        this.f58262c = i4;
        this.f58260a = 0;
    }

    public void i(String str) {
        this.f58264e = str;
        this.f58260a = 1;
    }

    public void j(int i4) {
        this.f58260a = i4;
    }

    public c(int i4, String str, String str2) {
        this.f58260a = 0;
        this.f58261b = i4;
        this.f58263d = str;
        this.f58264e = str2;
        this.f58260a = 1;
    }
}
