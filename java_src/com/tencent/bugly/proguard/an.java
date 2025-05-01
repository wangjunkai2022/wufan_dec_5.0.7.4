package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class an extends k {

    /* renamed from: i  reason: collision with root package name */
    private static byte[] f62572i;

    /* renamed from: j  reason: collision with root package name */
    private static Map<String, String> f62573j;

    /* renamed from: a  reason: collision with root package name */
    public byte f62574a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f62575b = 0;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f62576c = null;

    /* renamed from: f  reason: collision with root package name */
    private String f62579f = "";

    /* renamed from: d  reason: collision with root package name */
    public long f62577d = 0;

    /* renamed from: g  reason: collision with root package name */
    private String f62580g = "";

    /* renamed from: e  reason: collision with root package name */
    public String f62578e = "";

    /* renamed from: h  reason: collision with root package name */
    private Map<String, String> f62581h = null;

    static {
        f62572i = r0;
        byte[] bArr = {0};
        HashMap hashMap = new HashMap();
        f62573j = hashMap;
        hashMap.put("", "");
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(j jVar) {
        jVar.a(this.f62574a, 0);
        jVar.a(this.f62575b, 1);
        byte[] bArr = this.f62576c;
        if (bArr != null) {
            jVar.a(bArr, 2);
        }
        String str = this.f62579f;
        if (str != null) {
            jVar.a(str, 3);
        }
        jVar.a(this.f62577d, 4);
        String str2 = this.f62580g;
        if (str2 != null) {
            jVar.a(str2, 5);
        }
        String str3 = this.f62578e;
        if (str3 != null) {
            jVar.a(str3, 6);
        }
        Map<String, String> map = this.f62581h;
        if (map != null) {
            jVar.a((Map) map, 7);
        }
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(i iVar) {
        this.f62574a = iVar.a(this.f62574a, 0, true);
        this.f62575b = iVar.a(this.f62575b, 1, true);
        this.f62576c = iVar.c(2, false);
        this.f62579f = iVar.b(3, false);
        this.f62577d = iVar.a(this.f62577d, 4, false);
        this.f62580g = iVar.b(5, false);
        this.f62578e = iVar.b(6, false);
        this.f62581h = (Map) iVar.a((i) f62573j, 7, false);
    }
}
