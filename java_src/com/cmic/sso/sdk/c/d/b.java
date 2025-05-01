package com.cmic.sso.sdk.c.d;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: HttpSuccessResponse.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private int f9285a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, List<String>> f9286b;

    /* renamed from: c  reason: collision with root package name */
    private String f9287c;

    public b(int i4, Map<String, List<String>> map, String str) {
        this.f9285a = i4;
        this.f9286b = map;
        this.f9287c = str;
    }

    public int a() {
        return this.f9285a;
    }

    public Map<String, List<String>> b() {
        Map<String, List<String>> map = this.f9286b;
        return map == null ? new HashMap() : map;
    }

    public String c() {
        String str = this.f9287c;
        return str == null ? "" : str;
    }

    public boolean d() {
        int i4 = this.f9285a;
        return i4 == 302 || i4 == 301;
    }
}
