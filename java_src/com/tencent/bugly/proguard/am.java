package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class am extends k {

    /* renamed from: y  reason: collision with root package name */
    private static byte[] f62546y;

    /* renamed from: z  reason: collision with root package name */
    private static Map<String, String> f62547z;

    /* renamed from: a  reason: collision with root package name */
    public int f62548a = 0;

    /* renamed from: b  reason: collision with root package name */
    public String f62549b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f62550c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f62551d = "";

    /* renamed from: e  reason: collision with root package name */
    public String f62552e = "";

    /* renamed from: f  reason: collision with root package name */
    public String f62553f = "";

    /* renamed from: g  reason: collision with root package name */
    public int f62554g = 0;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f62555h = null;

    /* renamed from: i  reason: collision with root package name */
    public String f62556i = "";

    /* renamed from: j  reason: collision with root package name */
    public String f62557j = "";

    /* renamed from: k  reason: collision with root package name */
    public Map<String, String> f62558k = null;

    /* renamed from: l  reason: collision with root package name */
    public String f62559l = "";

    /* renamed from: m  reason: collision with root package name */
    public long f62560m = 0;

    /* renamed from: n  reason: collision with root package name */
    public String f62561n = "";

    /* renamed from: o  reason: collision with root package name */
    public String f62562o = "";

    /* renamed from: p  reason: collision with root package name */
    public String f62563p = "";

    /* renamed from: q  reason: collision with root package name */
    public long f62564q = 0;

    /* renamed from: u  reason: collision with root package name */
    private String f62568u = "";

    /* renamed from: r  reason: collision with root package name */
    public String f62565r = "";

    /* renamed from: v  reason: collision with root package name */
    private String f62569v = "";

    /* renamed from: w  reason: collision with root package name */
    private String f62570w = "";

    /* renamed from: s  reason: collision with root package name */
    public String f62566s = "";

    /* renamed from: t  reason: collision with root package name */
    public String f62567t = "";

    /* renamed from: x  reason: collision with root package name */
    private String f62571x = "";

    static {
        f62546y = r0;
        byte[] bArr = {0};
        HashMap hashMap = new HashMap();
        f62547z = hashMap;
        hashMap.put("", "");
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(j jVar) {
        jVar.a(this.f62548a, 0);
        jVar.a(this.f62549b, 1);
        jVar.a(this.f62550c, 2);
        jVar.a(this.f62551d, 3);
        String str = this.f62552e;
        if (str != null) {
            jVar.a(str, 4);
        }
        jVar.a(this.f62553f, 5);
        jVar.a(this.f62554g, 6);
        jVar.a(this.f62555h, 7);
        String str2 = this.f62556i;
        if (str2 != null) {
            jVar.a(str2, 8);
        }
        String str3 = this.f62557j;
        if (str3 != null) {
            jVar.a(str3, 9);
        }
        Map<String, String> map = this.f62558k;
        if (map != null) {
            jVar.a((Map) map, 10);
        }
        String str4 = this.f62559l;
        if (str4 != null) {
            jVar.a(str4, 11);
        }
        jVar.a(this.f62560m, 12);
        String str5 = this.f62561n;
        if (str5 != null) {
            jVar.a(str5, 13);
        }
        String str6 = this.f62562o;
        if (str6 != null) {
            jVar.a(str6, 14);
        }
        String str7 = this.f62563p;
        if (str7 != null) {
            jVar.a(str7, 15);
        }
        jVar.a(this.f62564q, 16);
        String str8 = this.f62568u;
        if (str8 != null) {
            jVar.a(str8, 17);
        }
        String str9 = this.f62565r;
        if (str9 != null) {
            jVar.a(str9, 18);
        }
        String str10 = this.f62569v;
        if (str10 != null) {
            jVar.a(str10, 19);
        }
        String str11 = this.f62570w;
        if (str11 != null) {
            jVar.a(str11, 20);
        }
        String str12 = this.f62566s;
        if (str12 != null) {
            jVar.a(str12, 21);
        }
        String str13 = this.f62567t;
        if (str13 != null) {
            jVar.a(str13, 22);
        }
        String str14 = this.f62571x;
        if (str14 != null) {
            jVar.a(str14, 23);
        }
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(i iVar) {
        this.f62548a = iVar.a(this.f62548a, 0, true);
        this.f62549b = iVar.b(1, true);
        this.f62550c = iVar.b(2, true);
        this.f62551d = iVar.b(3, true);
        this.f62552e = iVar.b(4, false);
        this.f62553f = iVar.b(5, true);
        this.f62554g = iVar.a(this.f62554g, 6, true);
        this.f62555h = iVar.c(7, true);
        this.f62556i = iVar.b(8, false);
        this.f62557j = iVar.b(9, false);
        this.f62558k = (Map) iVar.a((i) f62547z, 10, false);
        this.f62559l = iVar.b(11, false);
        this.f62560m = iVar.a(this.f62560m, 12, false);
        this.f62561n = iVar.b(13, false);
        this.f62562o = iVar.b(14, false);
        this.f62563p = iVar.b(15, false);
        this.f62564q = iVar.a(this.f62564q, 16, false);
        this.f62568u = iVar.b(17, false);
        this.f62565r = iVar.b(18, false);
        this.f62569v = iVar.b(19, false);
        this.f62570w = iVar.b(20, false);
        this.f62566s = iVar.b(21, false);
        this.f62567t = iVar.b(22, false);
        this.f62571x = iVar.b(23, false);
    }
}
