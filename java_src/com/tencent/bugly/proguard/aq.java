package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class aq extends k {

    /* renamed from: i  reason: collision with root package name */
    private static Map<String, String> f62599i;

    /* renamed from: a  reason: collision with root package name */
    public long f62600a = 0;

    /* renamed from: b  reason: collision with root package name */
    public byte f62601b = 0;

    /* renamed from: c  reason: collision with root package name */
    public String f62602c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f62603d = "";

    /* renamed from: e  reason: collision with root package name */
    public String f62604e = "";

    /* renamed from: f  reason: collision with root package name */
    public Map<String, String> f62605f = null;

    /* renamed from: h  reason: collision with root package name */
    private String f62607h = "";

    /* renamed from: g  reason: collision with root package name */
    public boolean f62606g = true;

    static {
        HashMap hashMap = new HashMap();
        f62599i = hashMap;
        hashMap.put("", "");
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(j jVar) {
        jVar.a(this.f62600a, 0);
        jVar.a(this.f62601b, 1);
        String str = this.f62602c;
        if (str != null) {
            jVar.a(str, 2);
        }
        String str2 = this.f62603d;
        if (str2 != null) {
            jVar.a(str2, 3);
        }
        String str3 = this.f62604e;
        if (str3 != null) {
            jVar.a(str3, 4);
        }
        Map<String, String> map = this.f62605f;
        if (map != null) {
            jVar.a((Map) map, 5);
        }
        String str4 = this.f62607h;
        if (str4 != null) {
            jVar.a(str4, 6);
        }
        jVar.a(this.f62606g, 7);
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(i iVar) {
        this.f62600a = iVar.a(this.f62600a, 0, true);
        this.f62601b = iVar.a(this.f62601b, 1, true);
        this.f62602c = iVar.b(2, false);
        this.f62603d = iVar.b(3, false);
        this.f62604e = iVar.b(4, false);
        this.f62605f = (Map) iVar.a((i) f62599i, 5, false);
        this.f62607h = iVar.b(6, false);
        this.f62606g = iVar.a(7, false);
    }
}
