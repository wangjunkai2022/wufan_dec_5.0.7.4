package com.aggmoread.sdk.z.c.a.a.d.a.d.t;

import android.content.Context;
import android.text.TextUtils;
import com.aggmoread.sdk.z.c.a.a.d.a.d.l;
import com.aggmoread.sdk.z.c.a.a.d.a.d.n;
import com.aggmoread.sdk.z.c.a.a.d.b.j;
import com.aggmoread.sdk.z.c.a.a.e.e;
import com.aggmoread.sdk.z.c.a.a.e.m;
import com.qq.e.comm.managers.GDTAdSdk;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class b extends l {

    /* renamed from: a  reason: collision with root package name */
    private static b f3087a;

    /* renamed from: b  reason: collision with root package name */
    static AtomicBoolean f3088b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    static AtomicBoolean f3089c = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a implements InvocationHandler {
        a() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String str;
            try {
                if ("onStartSuccess".equals(method.getName())) {
                    str = "init success";
                } else if (!"onStartFailed".equals(method.getName())) {
                    return null;
                } else {
                    str = "init fail " + objArr[0];
                }
                e.b("gdt_ad", str);
                return null;
            } catch (Exception e5) {
                e5.printStackTrace();
                return null;
            }
        }
    }

    private b() {
    }

    public static int a(Object obj) {
        return d.a(obj);
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (f3087a == null) {
                synchronized (b.class) {
                    if (f3087a == null) {
                        f3087a = new b();
                    }
                }
            }
            bVar = f3087a;
        }
        return bVar;
    }

    public static void a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            e.b("gdt_ad", "Context或APP_ID为空，初始化失败!");
            return;
        }
        if (f3089c.compareAndSet(false, true)) {
            if (n.f2904a != -1) {
                e.b("gdt_ad", "set global agreePrivacy");
                d.a(n.f2904a == 1);
            }
            if (n.f2905b != -1) {
                e.b("gdt_ad", "set global shakable");
                d.a(String.valueOf(n.f2905b));
            }
        }
        if (m.a("4.380") && f3088b.compareAndSet(false, true)) {
            try {
                Method declaredMethod = GDTAdSdk.class.getDeclaredMethod("initWithoutStart", Context.class, String.class);
                Method declaredMethod2 = GDTAdSdk.class.getDeclaredMethod("start", GDTAdSdk.OnStartListener.class);
                declaredMethod.invoke(GDTAdSdk.class, context, str);
                declaredMethod2.invoke(GDTAdSdk.class, Proxy.newProxyInstance(GDTAdSdk.OnStartListener.class.getClassLoader(), new Class[]{GDTAdSdk.OnStartListener.class}, new a()));
            } catch (Exception e5) {
                try {
                    e5.printStackTrace();
                    e.b("gdt_ad", "e " + e5.getLocalizedMessage());
                    try {
                        Method declaredMethod3 = GDTAdSdk.class.getDeclaredMethod("init", Context.class, String.class);
                        if (declaredMethod3 != null) {
                            declaredMethod3.invoke(GDTAdSdk.class, context, str);
                        }
                    } catch (Exception e6) {
                        e.b("gdt_ad", "err " + e6.getLocalizedMessage());
                        Class<?> cls = Class.forName("com.qq.e.comm.managers.GDTADManager");
                        cls.getMethod("initWith", Context.class, String.class).invoke(cls.getDeclaredMethod("getInstance", new Class[0]).invoke(cls, new Object[0]), context, str);
                    }
                } catch (Exception e7) {
                    e.b("gdt_ad", "err " + e7.getLocalizedMessage());
                    f3088b.set(false);
                }
            }
        }
    }

    public static void a(Map<String, Object> map, Object obj, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        if (map != null) {
            String a5 = com.aggmoread.sdk.z.c.a.a.d.a.d.t.a.a(obj);
            e.b("AMHTAGGDT", "apkInfo " + a5);
            map.put("ext_APP_INFOURL", a5);
            a().a(map, a(obj), eVar);
        }
    }

    public static boolean a(com.aggmoread.sdk.z.c.a.a.d.b.e eVar, int i4) {
        return m.a(eVar, i4);
    }

    public static boolean a(com.aggmoread.sdk.z.c.a.a.d.b.e eVar, Object obj) {
        return a(eVar, a(obj));
    }

    public static String b() {
        return m.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(com.aggmoread.sdk.z.c.a.a.d.b.d r6) {
        /*
            r5 = this;
            java.util.Map r6 = com.aggmoread.sdk.z.c.a.a.d.b.l.a(r6)
            if (r6 == 0) goto L64
            java.lang.String r0 = "txt"
            java.lang.Object r0 = r6.get(r0)
            java.lang.String r1 = "desc"
            java.lang.Object r6 = r6.get(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "t: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = "\t d: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.aggmoread.sdk.z.c.a.a.e.e.a(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            boolean r3 = r0 instanceof java.lang.String
            r4 = 1
            if (r3 == 0) goto L45
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L45
            r1.append(r0)
            r2 = 1
        L45:
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L5c
            java.lang.String r6 = (java.lang.String) r6
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L5c
            if (r2 == 0) goto L58
            java.lang.String r0 = "#"
            r1.append(r0)
        L58:
            r1.append(r6)
            goto L5d
        L5c:
            r4 = r2
        L5d:
            if (r4 == 0) goto L64
            java.lang.String r6 = r1.toString()
            return r6
        L64:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aggmoread.sdk.z.c.a.a.d.a.d.t.b.a(com.aggmoread.sdk.z.c.a.a.d.b.d):java.lang.String");
    }

    public String a(String str, String str2) {
        a(j.f3429q, str2);
        return GDTAdSdk.getGDTAdManger().getSDKInfo(str);
    }

    public String a(Map<String, Object> map, String str) {
        a(j.f3429q, str);
        try {
            try {
                Method declaredMethod = GDTAdSdk.getGDTAdManger().getClass().getDeclaredMethod("getBuyerId", Map.class);
                declaredMethod.setAccessible(true);
                return (String) declaredMethod.invoke(GDTAdSdk.getGDTAdManger(), map);
            } catch (Exception unused) {
                Method declaredMethod2 = GDTAdSdk.getGDTAdManger().getClass().getDeclaredMethod("getBuyerId", new Class[0]);
                declaredMethod2.setAccessible(true);
                return (String) declaredMethod2.invoke(GDTAdSdk.getGDTAdManger(), new Object[0]);
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public void a(com.aggmoread.sdk.z.c.a.a.d.b.e eVar, com.aggmoread.sdk.z.c.a.a.d.b.d dVar) {
    }
}
