package com.join.android.app.component.album.lib;

import java.util.List;
import net.lingala.zip4j.util.e;
/* compiled from: ImageFolder.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private String f15113a;

    /* renamed from: b  reason: collision with root package name */
    private String f15114b;

    /* renamed from: c  reason: collision with root package name */
    private String f15115c;

    /* renamed from: d  reason: collision with root package name */
    private String f15116d;

    /* renamed from: e  reason: collision with root package name */
    private int f15117e;

    /* renamed from: f  reason: collision with root package name */
    private List<String> f15118f;

    public List<String> a() {
        return this.f15118f;
    }

    public String b() {
        return this.f15116d;
    }

    public int c() {
        return this.f15117e;
    }

    public String d() {
        return this.f15113a;
    }

    public String e() {
        return this.f15114b;
    }

    public String f() {
        return this.f15115c;
    }

    public void g(List<String> list) {
        this.f15118f = list;
    }

    public void h(String str) {
        this.f15116d = str;
    }

    public void i(int i4) {
        this.f15117e = i4;
    }

    public void j(String str) {
        this.f15113a = str;
        this.f15115c = this.f15113a.substring(str.lastIndexOf(e.F0) + 1);
    }

    public void k(String str) {
        this.f15114b = str;
    }

    public void l(String str) {
        this.f15115c = str;
    }

    public String toString() {
        return "ImageFolder{dir='" + this.f15113a + "', firstImagePath='" + this.f15114b + "', name='" + this.f15115c + "', count=" + this.f15117e + '}';
    }
}
