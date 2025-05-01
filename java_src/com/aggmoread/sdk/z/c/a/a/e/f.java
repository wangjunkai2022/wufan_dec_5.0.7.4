package com.aggmoread.sdk.z.c.a.a.e;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public Map<Object, Object> f3494a;

    public f(Map<Object, Object> map) {
        this.f3494a = map;
        if (map == null) {
            this.f3494a = new HashMap();
        }
    }

    public double a(Object obj) {
        return a(obj, 0.0d);
    }

    public double a(Object obj, double d5) {
        Object obj2 = this.f3494a.get(obj);
        if (obj2 != null && (obj2 instanceof double[])) {
            try {
                try {
                    return ((double[]) obj2)[0];
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                if (obj2 instanceof int[]) {
                    return ((int[]) obj2)[0];
                }
                if (obj2 instanceof long[]) {
                    return ((long[]) obj2)[0];
                }
            }
        }
        return d5;
    }

    public int a(Object obj, int i4) {
        Object obj2 = this.f3494a.get(obj);
        if (obj2 != null && (obj2 instanceof int[])) {
            try {
                return ((int[]) obj2)[0];
            } catch (Exception unused) {
            }
        }
        return i4;
    }

    public String a(Object obj, String str) {
        Object obj2 = this.f3494a.get(obj);
        return (obj2 == null || !(obj2 instanceof String)) ? str : (String) obj2;
    }

    public void a(Object obj, long j4) {
        this.f3494a.put(obj, new long[]{j4});
    }

    public boolean a(Object obj, boolean z4) {
        Object obj2 = this.f3494a.get(obj);
        if (obj2 != null && (obj2 instanceof boolean[])) {
            try {
                return ((boolean[]) obj2)[0];
            } catch (Exception unused) {
            }
        }
        return z4;
    }

    public int b(Object obj) {
        return a(obj, 0);
    }

    public void b(Object obj, double d5) {
        this.f3494a.put(obj, new double[]{d5});
    }

    public void b(Object obj, int i4) {
        this.f3494a.put(obj, new int[]{i4});
    }

    public void b(Object obj, String str) {
        this.f3494a.put(obj, str);
    }

    public void b(Object obj, boolean z4) {
        this.f3494a.put(obj, new boolean[]{z4});
    }

    public String c(Object obj) {
        Object obj2 = this.f3494a.get(obj);
        if (obj2 == null || !(obj2 instanceof String)) {
            return null;
        }
        return (String) obj2;
    }
}
