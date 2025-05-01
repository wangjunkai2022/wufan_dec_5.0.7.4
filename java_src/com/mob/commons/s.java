package com.mob.commons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes5.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private static s f56474a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap<String, Object> f56475b;

    private s() {
        HashMap<String, Object> c5 = c();
        this.f56475b = c5;
        if (c5 == null) {
            this.f56475b = new HashMap<>();
        }
        ArrayList<MobProduct> b5 = aa.b();
        if (b5 == null || b5.isEmpty()) {
            return;
        }
        Iterator<MobProduct> it2 = b5.iterator();
        while (it2.hasNext()) {
            MobProduct next = it2.next();
            if (!this.f56475b.containsKey(next.getProductTag())) {
                this.f56475b.put(next.getProductTag(), 0);
            }
        }
    }

    public static s a() {
        if (f56474a == null) {
            synchronized (s.class) {
                if (f56474a == null) {
                    f56474a = new s();
                }
            }
        }
        return f56474a;
    }

    private HashMap<String, Object> c() {
        try {
            return ab.a().g();
        } catch (Throwable unused) {
            return null;
        }
    }

    public HashMap<String, Object> b() {
        return this.f56475b;
    }

    public void a(MobProduct mobProduct, int i4) {
        if (mobProduct != null) {
            this.f56475b.put(mobProduct.getProductTag(), Integer.valueOf(i4));
            a(this.f56475b);
        }
    }

    private void a(HashMap<String, Object> hashMap) {
        try {
            ab.a().b(hashMap);
        } catch (Throwable unused) {
        }
    }

    public static String a(String str) {
        return v.a(str, 99);
    }
}
