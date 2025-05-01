package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public class c extends a {

    /* renamed from: d  reason: collision with root package name */
    protected HashMap<String, byte[]> f62615d = null;

    /* renamed from: e  reason: collision with root package name */
    private HashMap<String, Object> f62616e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private i f62617f = new i();

    @Override // com.tencent.bugly.proguard.a
    public final /* bridge */ /* synthetic */ void a(String str) {
        super.a(str);
    }

    public final <T> T b(String str, T t4) throws b {
        HashMap<String, byte[]> hashMap = this.f62615d;
        if (hashMap != null) {
            if (hashMap.containsKey(str)) {
                if (this.f62616e.containsKey(str)) {
                    return (T) this.f62616e.get(str);
                }
                try {
                    this.f62617f.a(this.f62615d.get(str));
                    this.f62617f.a(this.f62492b);
                    T t5 = (T) this.f62617f.a((i) t4, 0, true);
                    if (t5 != null) {
                        this.f62616e.put(str, t5);
                    }
                    return t5;
                } catch (Exception e5) {
                    throw new b(e5);
                }
            }
            return null;
        } else if (this.f62491a.containsKey(str)) {
            if (this.f62616e.containsKey(str)) {
                return (T) this.f62616e.get(str);
            }
            byte[] bArr = new byte[0];
            Iterator<Map.Entry<String, byte[]>> it2 = this.f62491a.get(str).entrySet().iterator();
            if (it2.hasNext()) {
                Map.Entry<String, byte[]> next = it2.next();
                next.getKey();
                bArr = next.getValue();
            }
            try {
                this.f62617f.a(bArr);
                this.f62617f.a(this.f62492b);
                T t6 = (T) this.f62617f.a((i) t4, 0, true);
                this.f62616e.put(str, t6);
                return t6;
            } catch (Exception e6) {
                throw new b(e6);
            }
        } else {
            return null;
        }
    }

    public void c() {
        this.f62615d = new HashMap<>();
    }

    @Override // com.tencent.bugly.proguard.a
    public <T> void a(String str, T t4) {
        if (this.f62615d == null) {
            super.a(str, (String) t4);
        } else if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        } else {
            if (t4 != null) {
                if (!(t4 instanceof Set)) {
                    j jVar = new j();
                    jVar.a(this.f62492b);
                    jVar.a(t4, 0);
                    this.f62615d.put(str, l.a(jVar.a()));
                    return;
                }
                throw new IllegalArgumentException("can not support Set");
            }
            throw new IllegalArgumentException("put value can not is null");
        }
    }

    @Override // com.tencent.bugly.proguard.a
    public byte[] a() {
        if (this.f62615d != null) {
            j jVar = new j(0);
            jVar.a(this.f62492b);
            jVar.a((Map) this.f62615d, 0);
            return l.a(jVar.a());
        }
        return super.a();
    }

    @Override // com.tencent.bugly.proguard.a
    public void a(byte[] bArr) {
        try {
            super.a(bArr);
        } catch (Exception unused) {
            this.f62617f.a(bArr);
            this.f62617f.a(this.f62492b);
            HashMap hashMap = new HashMap(1);
            hashMap.put("", new byte[0]);
            this.f62615d = this.f62617f.a((Map) hashMap, 0, false);
        }
    }
}
