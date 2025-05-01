package com.efs.sdk.net.a;

import java.util.HashMap;
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    private static a f10567c;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, c> f10568a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap<String, d> f10569b;

    private a() {
        b();
    }

    public static a a() {
        if (f10567c == null) {
            f10567c = new a();
        }
        return f10567c;
    }

    private void b() {
        if (this.f10568a == null) {
            this.f10568a = new HashMap<>();
        }
        this.f10568a.clear();
    }

    public final d c(String str) {
        if (this.f10569b == null) {
            this.f10569b = new HashMap<>();
        }
        if (this.f10569b.containsKey(str)) {
            return this.f10569b.get(str);
        }
        d dVar = new d();
        dVar.A = str;
        dVar.D = System.currentTimeMillis();
        this.f10569b.put(str, dVar);
        return dVar;
    }

    public final void d(String str) {
        HashMap<String, d> hashMap = this.f10569b;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return;
        }
        this.f10569b.remove(str);
    }

    public final c a(String str) {
        if (this.f10568a == null) {
            b();
        }
        c cVar = this.f10568a.get(str);
        if (cVar == null) {
            c cVar2 = new c();
            cVar2.f10591a = str;
            cVar2.f10592b = System.currentTimeMillis();
            this.f10568a.put(str, cVar2);
            return cVar2;
        }
        return cVar;
    }

    public final void b(String str) {
        HashMap<String, c> hashMap = this.f10568a;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return;
        }
        this.f10568a.remove(str);
    }
}
