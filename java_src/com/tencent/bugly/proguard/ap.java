package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class ap extends k implements Cloneable {

    /* renamed from: n  reason: collision with root package name */
    private static Map<String, String> f62585n;

    /* renamed from: o  reason: collision with root package name */
    private static /* synthetic */ boolean f62586o = true;

    /* renamed from: m  reason: collision with root package name */
    private static ao f62584m = new ao();

    /* renamed from: a  reason: collision with root package name */
    public boolean f62587a = true;

    /* renamed from: b  reason: collision with root package name */
    public boolean f62588b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f62589c = true;

    /* renamed from: d  reason: collision with root package name */
    public String f62590d = "";

    /* renamed from: e  reason: collision with root package name */
    public String f62591e = "";

    /* renamed from: f  reason: collision with root package name */
    public ao f62592f = null;

    /* renamed from: g  reason: collision with root package name */
    public Map<String, String> f62593g = null;

    /* renamed from: h  reason: collision with root package name */
    public long f62594h = 0;

    /* renamed from: j  reason: collision with root package name */
    private String f62596j = "";

    /* renamed from: k  reason: collision with root package name */
    private String f62597k = "";

    /* renamed from: l  reason: collision with root package name */
    private int f62598l = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f62595i = 0;

    static {
        HashMap hashMap = new HashMap();
        f62585n = hashMap;
        hashMap.put("", "");
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(j jVar) {
        jVar.a(this.f62587a, 0);
        jVar.a(this.f62588b, 1);
        jVar.a(this.f62589c, 2);
        String str = this.f62590d;
        if (str != null) {
            jVar.a(str, 3);
        }
        String str2 = this.f62591e;
        if (str2 != null) {
            jVar.a(str2, 4);
        }
        ao aoVar = this.f62592f;
        if (aoVar != null) {
            jVar.a((k) aoVar, 5);
        }
        Map<String, String> map = this.f62593g;
        if (map != null) {
            jVar.a((Map) map, 6);
        }
        jVar.a(this.f62594h, 7);
        String str3 = this.f62596j;
        if (str3 != null) {
            jVar.a(str3, 8);
        }
        String str4 = this.f62597k;
        if (str4 != null) {
            jVar.a(str4, 9);
        }
        jVar.a(this.f62598l, 10);
        jVar.a(this.f62595i, 11);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f62586o) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        ap apVar = (ap) obj;
        return l.a(this.f62587a, apVar.f62587a) && l.a(this.f62588b, apVar.f62588b) && l.a(this.f62589c, apVar.f62589c) && l.a(this.f62590d, apVar.f62590d) && l.a(this.f62591e, apVar.f62591e) && l.a(this.f62592f, apVar.f62592f) && l.a(this.f62593g, apVar.f62593g) && l.a(this.f62594h, apVar.f62594h) && l.a(this.f62596j, apVar.f62596j) && l.a(this.f62597k, apVar.f62597k) && l.a(this.f62598l, apVar.f62598l) && l.a(this.f62595i, apVar.f62595i);
    }

    public final int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(i iVar) {
        this.f62587a = iVar.a(0, true);
        this.f62588b = iVar.a(1, true);
        this.f62589c = iVar.a(2, true);
        this.f62590d = iVar.b(3, false);
        this.f62591e = iVar.b(4, false);
        this.f62592f = (ao) iVar.a((k) f62584m, 5, false);
        this.f62593g = (Map) iVar.a((i) f62585n, 6, false);
        this.f62594h = iVar.a(this.f62594h, 7, false);
        this.f62596j = iVar.b(8, false);
        this.f62597k = iVar.b(9, false);
        this.f62598l = iVar.a(this.f62598l, 10, false);
        this.f62595i = iVar.a(this.f62595i, 11, false);
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(StringBuilder sb, int i4) {
        h hVar = new h(sb, i4);
        hVar.a(this.f62587a, "enable");
        hVar.a(this.f62588b, "enableUserInfo");
        hVar.a(this.f62589c, "enableQuery");
        hVar.a(this.f62590d, "url");
        hVar.a(this.f62591e, "expUrl");
        hVar.a((k) this.f62592f, "security");
        hVar.a((Map) this.f62593g, "valueMap");
        hVar.a(this.f62594h, "strategylastUpdateTime");
        hVar.a(this.f62596j, "httpsUrl");
        hVar.a(this.f62597k, "httpsExpUrl");
        hVar.a(this.f62598l, "eventRecordCount");
        hVar.a(this.f62595i, "eventTimeInterval");
    }
}
