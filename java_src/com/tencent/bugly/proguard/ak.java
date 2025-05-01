package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class ak extends k {
    private static ArrayList<aj> A;
    private static Map<String, String> B;
    private static Map<String, String> C;

    /* renamed from: v  reason: collision with root package name */
    private static Map<String, String> f62518v;

    /* renamed from: w  reason: collision with root package name */
    private static ai f62519w;

    /* renamed from: x  reason: collision with root package name */
    private static ah f62520x;

    /* renamed from: y  reason: collision with root package name */
    private static ArrayList<ah> f62521y;

    /* renamed from: z  reason: collision with root package name */
    private static ArrayList<ah> f62522z;

    /* renamed from: a  reason: collision with root package name */
    public String f62523a = "";

    /* renamed from: b  reason: collision with root package name */
    public long f62524b = 0;

    /* renamed from: c  reason: collision with root package name */
    public String f62525c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f62526d = "";

    /* renamed from: e  reason: collision with root package name */
    public String f62527e = "";

    /* renamed from: f  reason: collision with root package name */
    public String f62528f = "";

    /* renamed from: g  reason: collision with root package name */
    public String f62529g = "";

    /* renamed from: h  reason: collision with root package name */
    public Map<String, String> f62530h = null;

    /* renamed from: i  reason: collision with root package name */
    public String f62531i = "";

    /* renamed from: j  reason: collision with root package name */
    public ai f62532j = null;

    /* renamed from: k  reason: collision with root package name */
    public int f62533k = 0;

    /* renamed from: l  reason: collision with root package name */
    public String f62534l = "";

    /* renamed from: m  reason: collision with root package name */
    public String f62535m = "";

    /* renamed from: n  reason: collision with root package name */
    public ah f62536n = null;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<ah> f62537o = null;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList<ah> f62538p = null;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<aj> f62539q = null;

    /* renamed from: r  reason: collision with root package name */
    public Map<String, String> f62540r = null;

    /* renamed from: s  reason: collision with root package name */
    public Map<String, String> f62541s = null;

    /* renamed from: t  reason: collision with root package name */
    private String f62542t = "";

    /* renamed from: u  reason: collision with root package name */
    private boolean f62543u = true;

    static {
        HashMap hashMap = new HashMap();
        f62518v = hashMap;
        hashMap.put("", "");
        f62519w = new ai();
        f62520x = new ah();
        f62521y = new ArrayList<>();
        f62521y.add(new ah());
        f62522z = new ArrayList<>();
        f62522z.add(new ah());
        A = new ArrayList<>();
        A.add(new aj());
        HashMap hashMap2 = new HashMap();
        B = hashMap2;
        hashMap2.put("", "");
        HashMap hashMap3 = new HashMap();
        C = hashMap3;
        hashMap3.put("", "");
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(j jVar) {
        jVar.a(this.f62523a, 0);
        jVar.a(this.f62524b, 1);
        jVar.a(this.f62525c, 2);
        String str = this.f62526d;
        if (str != null) {
            jVar.a(str, 3);
        }
        String str2 = this.f62527e;
        if (str2 != null) {
            jVar.a(str2, 4);
        }
        String str3 = this.f62528f;
        if (str3 != null) {
            jVar.a(str3, 5);
        }
        String str4 = this.f62529g;
        if (str4 != null) {
            jVar.a(str4, 6);
        }
        Map<String, String> map = this.f62530h;
        if (map != null) {
            jVar.a((Map) map, 7);
        }
        String str5 = this.f62531i;
        if (str5 != null) {
            jVar.a(str5, 8);
        }
        ai aiVar = this.f62532j;
        if (aiVar != null) {
            jVar.a((k) aiVar, 9);
        }
        jVar.a(this.f62533k, 10);
        String str6 = this.f62534l;
        if (str6 != null) {
            jVar.a(str6, 11);
        }
        String str7 = this.f62535m;
        if (str7 != null) {
            jVar.a(str7, 12);
        }
        ah ahVar = this.f62536n;
        if (ahVar != null) {
            jVar.a((k) ahVar, 13);
        }
        ArrayList<ah> arrayList = this.f62537o;
        if (arrayList != null) {
            jVar.a((Collection) arrayList, 14);
        }
        ArrayList<ah> arrayList2 = this.f62538p;
        if (arrayList2 != null) {
            jVar.a((Collection) arrayList2, 15);
        }
        ArrayList<aj> arrayList3 = this.f62539q;
        if (arrayList3 != null) {
            jVar.a((Collection) arrayList3, 16);
        }
        Map<String, String> map2 = this.f62540r;
        if (map2 != null) {
            jVar.a((Map) map2, 17);
        }
        Map<String, String> map3 = this.f62541s;
        if (map3 != null) {
            jVar.a((Map) map3, 18);
        }
        String str8 = this.f62542t;
        if (str8 != null) {
            jVar.a(str8, 19);
        }
        jVar.a(this.f62543u, 20);
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(i iVar) {
        this.f62523a = iVar.b(0, true);
        this.f62524b = iVar.a(this.f62524b, 1, true);
        this.f62525c = iVar.b(2, true);
        this.f62526d = iVar.b(3, false);
        this.f62527e = iVar.b(4, false);
        this.f62528f = iVar.b(5, false);
        this.f62529g = iVar.b(6, false);
        this.f62530h = (Map) iVar.a((i) f62518v, 7, false);
        this.f62531i = iVar.b(8, false);
        this.f62532j = (ai) iVar.a((k) f62519w, 9, false);
        this.f62533k = iVar.a(this.f62533k, 10, false);
        this.f62534l = iVar.b(11, false);
        this.f62535m = iVar.b(12, false);
        this.f62536n = (ah) iVar.a((k) f62520x, 13, false);
        this.f62537o = (ArrayList) iVar.a((i) f62521y, 14, false);
        this.f62538p = (ArrayList) iVar.a((i) f62522z, 15, false);
        this.f62539q = (ArrayList) iVar.a((i) A, 16, false);
        this.f62540r = (Map) iVar.a((i) B, 17, false);
        this.f62541s = (Map) iVar.a((i) C, 18, false);
        this.f62542t = iVar.b(19, false);
        this.f62543u = iVar.a(20, false);
    }
}
