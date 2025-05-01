package com.umeng.commonsdk.statistics.idtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* compiled from: AbstractIdTracker.java */
/* loaded from: classes6.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final int f64415a = 10;

    /* renamed from: b  reason: collision with root package name */
    private final int f64416b = 100;

    /* renamed from: c  reason: collision with root package name */
    private final String f64417c;

    /* renamed from: d  reason: collision with root package name */
    private List<com.umeng.commonsdk.statistics.proto.a> f64418d;

    /* renamed from: e  reason: collision with root package name */
    private com.umeng.commonsdk.statistics.proto.b f64419e;

    public a(String str) {
        this.f64417c = str;
    }

    private boolean g() {
        com.umeng.commonsdk.statistics.proto.b bVar = this.f64419e;
        String b5 = bVar == null ? null : bVar.b();
        int h4 = bVar == null ? 0 : bVar.h();
        String a5 = a(f());
        if (a5 == null || a5.equals(b5)) {
            return false;
        }
        if (bVar == null) {
            bVar = new com.umeng.commonsdk.statistics.proto.b();
        }
        bVar.a(a5);
        bVar.a(System.currentTimeMillis());
        bVar.a(h4 + 1);
        com.umeng.commonsdk.statistics.proto.a aVar = new com.umeng.commonsdk.statistics.proto.a();
        aVar.a(this.f64417c);
        aVar.c(a5);
        aVar.b(b5);
        aVar.a(bVar.e());
        if (this.f64418d == null) {
            this.f64418d = new ArrayList(2);
        }
        this.f64418d.add(aVar);
        if (this.f64418d.size() > 10) {
            this.f64418d.remove(0);
        }
        this.f64419e = bVar;
        return true;
    }

    public boolean a() {
        return g();
    }

    public String b() {
        return this.f64417c;
    }

    public boolean c() {
        com.umeng.commonsdk.statistics.proto.b bVar = this.f64419e;
        return bVar == null || bVar.h() <= 100;
    }

    public com.umeng.commonsdk.statistics.proto.b d() {
        return this.f64419e;
    }

    public List<com.umeng.commonsdk.statistics.proto.a> e() {
        return this.f64418d;
    }

    public abstract String f();

    public void a(com.umeng.commonsdk.statistics.proto.b bVar) {
        this.f64419e = bVar;
    }

    public void a(List<com.umeng.commonsdk.statistics.proto.a> list) {
        this.f64418d = list;
    }

    public String a(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() == 0 || "0".equals(trim) || "unknown".equals(trim.toLowerCase(Locale.US))) {
            return null;
        }
        return trim;
    }

    public void a(com.umeng.commonsdk.statistics.proto.c cVar) {
        this.f64419e = cVar.c().get(this.f64417c);
        List<com.umeng.commonsdk.statistics.proto.a> h4 = cVar.h();
        if (h4 == null || h4.size() <= 0) {
            return;
        }
        if (this.f64418d == null) {
            this.f64418d = new ArrayList();
        }
        for (com.umeng.commonsdk.statistics.proto.a aVar : h4) {
            if (this.f64417c.equals(aVar.f64485a)) {
                this.f64418d.add(aVar);
            }
        }
    }
}
