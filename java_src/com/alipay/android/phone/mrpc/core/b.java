package com.alipay.android.phone.mrpc.core;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class b implements Serializable {

    /* renamed from: c  reason: collision with root package name */
    private static final long f4534c = -6098125857367743614L;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f4535b = new HashMap();

    private Map<String, String> b() {
        return this.f4535b;
    }

    private void d(Map<String, String> map) {
        this.f4535b = map;
    }

    public final String a(String str) {
        return this.f4535b.get(str);
    }

    public final void c(String str, String str2) {
        this.f4535b.put(str, str2);
    }
}
