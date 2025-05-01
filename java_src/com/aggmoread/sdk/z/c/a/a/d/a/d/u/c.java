package com.aggmoread.sdk.z.c.a.a.d.a.d.u;

import com.aggmoread.sdk.z.c.a.a.e.e;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsScene;
import com.kwad.sdk.api.model.SplashAdExtraData;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/* loaded from: classes2.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    private static c f3171b;

    /* renamed from: a  reason: collision with root package name */
    private boolean f3172a = false;

    /* loaded from: classes2.dex */
    static class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f3173a;

        a(b bVar) {
            this.f3173a = bVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if ("onSuccess".equals(method.getName())) {
                e.b("AMHTAGKS", "onSuccess enter");
                this.f3173a.b();
                return null;
            } else if ("onFail".equals(method.getName())) {
                e.b("AMHTAGKS", "onFail enter code : " + objArr[0] + " , msg " + objArr[1]);
                this.f3173a.a();
                return null;
            } else {
                return null;
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();

        void b();
    }

    private c() {
    }

    public static synchronized c a() {
        c cVar;
        synchronized (c.class) {
            if (f3171b == null) {
                synchronized (c.class) {
                    if (f3171b == null) {
                        f3171b = new c();
                    }
                }
            }
            cVar = f3171b;
        }
        return cVar;
    }

    private static Object a(Class<?> cls, Object obj, String str, Class<?>[] clsArr, Object... objArr) {
        try {
            e.b("AMHTAGKS", "method " + str);
            return cls.getMethod(str, clsArr).invoke(obj, objArr);
        } catch (Exception e5) {
            e.b("AMHTAGKS", "find method err " + e5);
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x0005
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static void a(com.kwad.sdk.api.SdkConfig.Builder r7, com.aggmoread.sdk.z.c.a.a.d.a.d.u.c.b r8) {
        /*
            java.lang.String r0 = "AMHTAGKS"
            java.lang.Class<com.kwad.sdk.api.KsInitCallback> r1 = com.kwad.sdk.api.KsInitCallback.class
            goto La
        L5:
            r1 = move-exception
            r1.printStackTrace()
            r1 = 0
        La:
            if (r1 == 0) goto L5e
            java.lang.ClassLoader r2 = r1.getClassLoader()     // Catch: java.lang.Exception -> L49
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L49
            r5 = 0
            r4[r5] = r1     // Catch: java.lang.Exception -> L49
            com.aggmoread.sdk.z.c.a.a.d.a.d.u.c$a r6 = new com.aggmoread.sdk.z.c.a.a.d.a.d.u.c$a     // Catch: java.lang.Exception -> L49
            r6.<init>(r8)     // Catch: java.lang.Exception -> L49
            java.lang.Object r8 = java.lang.reflect.Proxy.newProxyInstance(r2, r4, r6)     // Catch: java.lang.Exception -> L49
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L49
            r2.<init>()     // Catch: java.lang.Exception -> L49
            java.lang.String r4 = "set reward listener "
            r2.append(r4)     // Catch: java.lang.Exception -> L49
            r2.append(r1)     // Catch: java.lang.Exception -> L49
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L49
            com.aggmoread.sdk.z.c.a.a.e.e.b(r0, r2)     // Catch: java.lang.Exception -> L49
            java.lang.Class r2 = r7.getClass()     // Catch: java.lang.Exception -> L49
            java.lang.String r4 = "setStartCallback"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L49
            r6[r5] = r1     // Catch: java.lang.Exception -> L49
            java.lang.reflect.Method r1 = r2.getMethod(r4, r6)     // Catch: java.lang.Exception -> L49
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L49
            r2[r5] = r8     // Catch: java.lang.Exception -> L49
            r1.invoke(r7, r2)     // Catch: java.lang.Exception -> L49
            goto L5e
        L49:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "err "
            r8.append(r1)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.aggmoread.sdk.z.c.a.a.e.e.b(r0, r7)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aggmoread.sdk.z.c.a.a.d.a.d.u.c.a(com.kwad.sdk.api.SdkConfig$Builder, com.aggmoread.sdk.z.c.a.a.d.a.d.u.c$b):void");
    }

    public static void a(boolean z4) {
        e.b("AMHTAGKS", "pr " + z4);
        try {
            KsAdSDK.setPersonalRecommend(z4);
        } catch (Exception e5) {
            e.b("AMHTAGKS", "pr e" + e5);
        }
    }

    public static void c() {
        a(KsAdSDK.class, null, "start", null, new Object[0]);
    }

    public KsScene.Builder a(KsScene.Builder builder) {
        if (builder != null) {
            try {
                Object newInstance = SplashAdExtraData.class.newInstance();
                a(SplashAdExtraData.class, newInstance, "setDisableShakeStatus", new Class[]{Boolean.TYPE}, Boolean.valueOf(b()));
                a(builder.getClass(), builder, "setSplashExtraData", new Class[]{SplashAdExtraData.class}, newInstance);
            } catch (Exception e5) {
                e.b("AMHTAGKS", "fill splash extra err " + e5);
            }
        }
        return builder;
    }

    public void b(boolean z4) {
        this.f3172a = z4;
    }

    public boolean b() {
        return this.f3172a;
    }
}
