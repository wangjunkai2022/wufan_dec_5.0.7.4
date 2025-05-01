package com.umeng.commonsdk.config;

import java.util.HashMap;
import java.util.Map;
/* compiled from: CollectController.java */
/* loaded from: classes6.dex */
public class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Boolean> f64104a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static Object f64105b = new Object();

    /* compiled from: CollectController.java */
    /* loaded from: classes6.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final b f64106a = new b();

        private a() {
        }
    }

    public static b b() {
        return a.f64106a;
    }

    public void a() {
        synchronized (f64105b) {
            f64104a.clear();
        }
    }

    private b() {
    }

    public static boolean a(String str) {
        if (d.a(str)) {
            synchronized (f64105b) {
                if (f64104a.containsKey(str)) {
                    return f64104a.get(str).booleanValue();
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.umeng.commonsdk.config.f
    public void a(String str, Boolean bool) {
        if (d.a(str)) {
            synchronized (f64105b) {
                Map<String, Boolean> map = f64104a;
                if (map != null) {
                    map.put(str, bool);
                }
            }
        }
    }
}
