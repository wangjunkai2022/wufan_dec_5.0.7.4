package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class ar extends k implements Cloneable {

    /* renamed from: f  reason: collision with root package name */
    private static ArrayList<aq> f62608f;

    /* renamed from: g  reason: collision with root package name */
    private static Map<String, String> f62609g;

    /* renamed from: a  reason: collision with root package name */
    public byte f62610a = 0;

    /* renamed from: b  reason: collision with root package name */
    public String f62611b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f62612c = "";

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<aq> f62613d = null;

    /* renamed from: e  reason: collision with root package name */
    public Map<String, String> f62614e = null;

    @Override // com.tencent.bugly.proguard.k
    public final void a(j jVar) {
        jVar.a(this.f62610a, 0);
        String str = this.f62611b;
        if (str != null) {
            jVar.a(str, 1);
        }
        String str2 = this.f62612c;
        if (str2 != null) {
            jVar.a(str2, 2);
        }
        ArrayList<aq> arrayList = this.f62613d;
        if (arrayList != null) {
            jVar.a((Collection) arrayList, 3);
        }
        Map<String, String> map = this.f62614e;
        if (map != null) {
            jVar.a((Map) map, 4);
        }
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(StringBuilder sb, int i4) {
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(i iVar) {
        this.f62610a = iVar.a(this.f62610a, 0, true);
        this.f62611b = iVar.b(1, false);
        this.f62612c = iVar.b(2, false);
        if (f62608f == null) {
            f62608f = new ArrayList<>();
            f62608f.add(new aq());
        }
        this.f62613d = (ArrayList) iVar.a((i) f62608f, 3, false);
        if (f62609g == null) {
            HashMap hashMap = new HashMap();
            f62609g = hashMap;
            hashMap.put("", "");
        }
        this.f62614e = (Map) iVar.a((i) f62609g, 4, false);
    }
}
