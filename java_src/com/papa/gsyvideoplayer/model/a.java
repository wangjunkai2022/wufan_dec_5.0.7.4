package com.papa.gsyvideoplayer.model;

import java.io.File;
import java.util.Map;
/* compiled from: GSYModel.java */
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    String f58249a;

    /* renamed from: b  reason: collision with root package name */
    File f58250b;

    /* renamed from: c  reason: collision with root package name */
    Map<String, String> f58251c;

    /* renamed from: d  reason: collision with root package name */
    float f58252d;

    /* renamed from: e  reason: collision with root package name */
    boolean f58253e;

    /* renamed from: f  reason: collision with root package name */
    boolean f58254f;

    /* renamed from: g  reason: collision with root package name */
    String f58255g;

    public a(String str, Map<String, String> map, boolean z4, float f5, boolean z5, File file, String str2) {
        this.f58252d = 1.0f;
        this.f58249a = str;
        this.f58251c = map;
        this.f58253e = z4;
        this.f58252d = f5;
        this.f58254f = z5;
        this.f58250b = file;
        this.f58255g = str2;
    }

    public File a() {
        return this.f58250b;
    }

    public Map<String, String> b() {
        return this.f58251c;
    }

    public String c() {
        return this.f58255g;
    }

    public float d() {
        return this.f58252d;
    }

    public String e() {
        return this.f58249a;
    }

    public boolean f() {
        return this.f58254f;
    }

    public boolean g() {
        return this.f58253e;
    }

    public void h(boolean z4) {
        this.f58254f = z4;
    }

    public void i(File file) {
        this.f58250b = file;
    }

    public void j(boolean z4) {
        this.f58253e = z4;
    }

    public void k(Map<String, String> map) {
        this.f58251c = map;
    }

    public void l(String str) {
        this.f58255g = str;
    }

    public void m(float f5) {
        this.f58252d = f5;
    }

    public void n(String str) {
        this.f58249a = str;
    }
}
