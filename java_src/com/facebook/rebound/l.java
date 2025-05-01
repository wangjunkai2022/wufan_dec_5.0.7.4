package com.facebook.rebound;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: SpringConfigRegistry.java */
/* loaded from: classes2.dex */
public class l {

    /* renamed from: b  reason: collision with root package name */
    private static final l f12628b = new l(true);

    /* renamed from: a  reason: collision with root package name */
    private final Map<k, String> f12629a = new HashMap();

    l(boolean z4) {
        if (z4) {
            a(k.f12625c, "default config");
        }
    }

    public static l c() {
        return f12628b;
    }

    public boolean a(k kVar, String str) {
        if (kVar != null) {
            if (str != null) {
                if (this.f12629a.containsKey(kVar)) {
                    return false;
                }
                this.f12629a.put(kVar, str);
                return true;
            }
            throw new IllegalArgumentException("configName is required");
        }
        throw new IllegalArgumentException("springConfig is required");
    }

    public Map<k, String> b() {
        return Collections.unmodifiableMap(this.f12629a);
    }

    public void d() {
        this.f12629a.clear();
    }

    public boolean e(k kVar) {
        if (kVar != null) {
            return this.f12629a.remove(kVar) != null;
        }
        throw new IllegalArgumentException("springConfig is required");
    }
}
