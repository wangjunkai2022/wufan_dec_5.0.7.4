package com.alipay.android.phone.mrpc.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;
/* loaded from: classes2.dex */
public final class c0 extends d {

    /* renamed from: c  reason: collision with root package name */
    String f4541c;

    /* renamed from: d  reason: collision with root package name */
    byte[] f4542d;

    /* renamed from: h  reason: collision with root package name */
    boolean f4546h;

    /* renamed from: f  reason: collision with root package name */
    ArrayList<Header> f4544f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private Map<String, String> f4545g = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    String f4543e = "application/x-www-form-urlencoded";

    public c0(String str) {
        this.f4541c = str;
    }

    private void g(boolean z4) {
        this.f4546h = z4;
    }

    private void h(byte[] bArr) {
        this.f4542d = bArr;
    }

    private String i() {
        return this.f4541c;
    }

    private void j(String str) {
        this.f4543e = str;
    }

    private byte[] k() {
        return this.f4542d;
    }

    private String l() {
        return this.f4543e;
    }

    private ArrayList<Header> m() {
        return this.f4544f;
    }

    private boolean n() {
        return this.f4546h;
    }

    public final String d(String str) {
        Map<String, String> map = this.f4545g;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public final void e(String str, String str2) {
        if (this.f4545g == null) {
            this.f4545g = new HashMap();
        }
        this.f4545g.put(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            byte[] bArr = this.f4542d;
            if (bArr == null) {
                if (c0Var.f4542d != null) {
                    return false;
                }
            } else if (!bArr.equals(c0Var.f4542d)) {
                return false;
            }
            String str = this.f4541c;
            String str2 = c0Var.f4541c;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void f(Header header) {
        this.f4544f.add(header);
    }

    public final int hashCode() {
        Map<String, String> map = this.f4545g;
        int hashCode = ((map == null || !map.containsKey("id")) ? 1 : this.f4545g.get("id").hashCode() + 31) * 31;
        String str = this.f4541c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return String.format("Url : %s,HttpHeader: %s", this.f4541c, this.f4544f);
    }
}
