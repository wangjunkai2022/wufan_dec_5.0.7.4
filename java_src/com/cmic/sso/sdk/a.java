package com.cmic.sso.sdk;

import com.cmic.sso.sdk.a.a;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ConcurrentBundle.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f9093a;

    public a(int i4) {
        this.f9093a = new ConcurrentHashMap<>(i4);
    }

    public void a(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return;
        }
        this.f9093a.put(str, bArr);
    }

    public String b(String str) {
        return b(str, "");
    }

    public int c(String str) {
        return b(str, 0);
    }

    public byte[] a(String str) {
        if (str != null) {
            return (byte[]) this.f9093a.get(str);
        }
        return null;
    }

    public String b(String str, String str2) {
        return (str == null || !this.f9093a.containsKey(str)) ? str2 : (String) this.f9093a.get(str);
    }

    public void a(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        this.f9093a.put(str, str2);
    }

    public void a(String str, boolean z4) {
        if (str != null) {
            this.f9093a.put(str, Boolean.valueOf(z4));
        }
    }

    public boolean b(String str, boolean z4) {
        return (str == null || !this.f9093a.containsKey(str)) ? z4 : ((Boolean) this.f9093a.get(str)).booleanValue();
    }

    public void a(String str, int i4) {
        if (str != null) {
            this.f9093a.put(str, Integer.valueOf(i4));
        }
    }

    public void a(String str, long j4) {
        if (str != null) {
            this.f9093a.put(str, Long.valueOf(j4));
        }
    }

    public int b(String str, int i4) {
        return (str == null || !this.f9093a.containsKey(str)) ? i4 : ((Integer) this.f9093a.get(str)).intValue();
    }

    public void a(com.cmic.sso.sdk.d.b bVar) {
        if (bVar != null) {
            this.f9093a.put("logBean", bVar);
        }
    }

    public com.cmic.sso.sdk.d.b a() {
        com.cmic.sso.sdk.d.b bVar = (com.cmic.sso.sdk.d.b) this.f9093a.get("logBean");
        return bVar != null ? bVar : new com.cmic.sso.sdk.d.b();
    }

    public long b(String str, long j4) {
        return (str == null || !this.f9093a.containsKey(str)) ? j4 : ((Long) this.f9093a.get(str)).longValue();
    }

    public void a(com.cmic.sso.sdk.a.a aVar) {
        if (aVar != null) {
            this.f9093a.put("current_config", aVar);
        }
    }

    public com.cmic.sso.sdk.a.a b() {
        com.cmic.sso.sdk.a.a aVar = (com.cmic.sso.sdk.a.a) this.f9093a.get("current_config");
        if (aVar != null) {
            return aVar;
        }
        com.cmic.sso.sdk.e.c.a("UmcConfigBean为空", "请核查");
        return new a.C0235a().a();
    }
}
