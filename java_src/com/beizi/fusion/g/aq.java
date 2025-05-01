package com.beizi.fusion.g;

import java.util.HashMap;
import java.util.Map;
/* compiled from: ShakeCoolConfig.java */
/* loaded from: classes2.dex */
public class aq {

    /* renamed from: a  reason: collision with root package name */
    private static volatile aq f6918a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, Long> f6919b = new HashMap();

    public static aq a() {
        if (f6918a == null) {
            synchronized (aq.class) {
                if (f6918a == null) {
                    f6918a = new aq();
                }
            }
        }
        return f6918a;
    }

    public long b(String str) {
        if (this.f6919b.containsKey(str)) {
            return this.f6919b.get(str).longValue();
        }
        return 0L;
    }

    public void a(String str, long j4) {
        this.f6919b.put(str, Long.valueOf(j4));
    }

    public void a(String str) {
        if (this.f6919b.containsKey(str)) {
            this.f6919b.remove(str);
        }
    }
}
