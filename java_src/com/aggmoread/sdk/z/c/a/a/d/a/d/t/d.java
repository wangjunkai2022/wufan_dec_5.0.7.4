package com.aggmoread.sdk.z.c.a.a.d.a.d.t;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.e.m;
import com.qq.e.ads.banner2.UnifiedBannerADListener;
import com.qq.e.ads.banner2.UnifiedBannerView;
import com.qq.e.ads.interstitial2.UnifiedInterstitialAD;
import com.qq.e.ads.interstitial2.UnifiedInterstitialADListener;
import com.qq.e.ads.nativ.ADSize;
import com.qq.e.ads.nativ.NativeADUnifiedListener;
import com.qq.e.ads.nativ.NativeExpressAD;
import com.qq.e.ads.nativ.NativeUnifiedAD;
import com.qq.e.ads.rewardvideo.RewardVideoAD;
import com.qq.e.ads.rewardvideo.RewardVideoADListener;
import com.qq.e.ads.rewardvideo.ServerSideVerificationOptions;
import com.qq.e.ads.splash.SplashAD;
import com.qq.e.ads.splash.SplashADListener;
import com.qq.e.comm.pi.IBidding;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InterfaceC0124d f3090a;

        a(InterfaceC0124d interfaceC0124d) {
            this.f3090a = interfaceC0124d;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if ("onReward".equals(method.getName())) {
                com.aggmoread.sdk.z.c.a.a.e.e.b("GDT_PAH_TAG", "onReward enter");
                if (objArr[0] instanceof Map) {
                    this.f3090a.onReward((Map) objArr[0]);
                    return null;
                }
                return null;
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    static class b implements InterfaceC0124d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.d f3091a;

        b(com.aggmoread.sdk.z.c.a.a.d.b.d dVar) {
            this.f3091a = dVar;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.InterfaceC0124d
        public void onReward(Map<String, Object> map) {
            if (this.f3091a.f3272p.b() != null) {
                this.f3091a.f3272p.b().onReward(map);
            }
        }
    }

    /* loaded from: classes2.dex */
    static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3092a;

        static {
            int[] iArr = new int[e.values().length];
            f3092a = iArr;
            try {
                iArr[e.SPLASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3092a[e.UNIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3092a[e.EXPRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3092a[e.REWARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3092a[e.INTERSTITIAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3092a[e.FULLSCREEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3092a[e.BANNER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.t.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0124d {
        void onReward(Map<String, Object> map);
    }

    /* loaded from: classes2.dex */
    public enum e {
        SPLASH(SplashAD.class),
        UNIFIED(NativeUnifiedAD.class),
        EXPRESS(NativeExpressAD.class),
        INTERSTITIAL(UnifiedInterstitialAD.class),
        REWARD(RewardVideoAD.class),
        FULLSCREEN(UnifiedInterstitialAD.class),
        BANNER(UnifiedBannerView.class);
        

        /* renamed from: b  reason: collision with root package name */
        private Class f3101b;

        e(Class cls) {
            this.f3101b = cls;
        }

        public Class a() {
            return this.f3101b;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "AD_TYPE{cls=" + this.f3101b + '}';
        }
    }

    public static int a(Object obj) {
        int i4;
        Object a5;
        try {
            a5 = a(obj.getClass(), "getECPM", obj);
        } catch (Exception unused) {
        }
        if (a5 instanceof Integer) {
            i4 = ((Integer) a5).intValue();
            com.aggmoread.sdk.z.c.a.a.e.e.b("xxx", "gdt get ecpm " + i4);
            return i4;
        }
        i4 = -1;
        com.aggmoread.sdk.z.c.a.a.e.e.b("xxx", "gdt get ecpm " + i4);
        return i4;
    }

    public static Object a(Context context, String str, String str2, e eVar, String str3, Object obj, Object... objArr) {
        Object obj2;
        Object a5;
        try {
            com.aggmoread.sdk.z.c.a.a.e.e.b("GDT_PAH_TAG", "entity token " + str3);
            if (TextUtils.isEmpty(str3) || !m.a("4.430")) {
                boolean a6 = m.a("4.440");
                com.aggmoread.sdk.z.c.a.a.e.e.b("GDT_PAH_TAG", "isConstructorNoAppId = " + a6 + ", type: " + eVar);
                if (a6) {
                    switch (c.f3092a[eVar.ordinal()]) {
                        case 1:
                            return new SplashAD(context, str2, (SplashADListener) obj, ((Integer) objArr[1]).intValue());
                        case 2:
                            return new NativeUnifiedAD(context, str2, (NativeADUnifiedListener) obj);
                        case 3:
                            return new NativeExpressAD(context, (ADSize) objArr[0], str2, (NativeExpressAD.NativeExpressADListener) obj);
                        case 4:
                            return new RewardVideoAD(context, str2, (RewardVideoADListener) obj, ((Boolean) objArr[0]).booleanValue());
                        case 5:
                        case 6:
                            return new UnifiedInterstitialAD(com.aggmoread.sdk.z.c.a.a.d.a.d.m.a(context), str2, (UnifiedInterstitialADListener) obj);
                        case 7:
                            return new UnifiedBannerView(com.aggmoread.sdk.z.c.a.a.d.a.d.m.a(context), str2, (UnifiedBannerADListener) obj);
                    }
                }
                Class a7 = eVar.a();
                switch (c.f3092a[eVar.ordinal()]) {
                    case 1:
                        return a7.getConstructor(Context.class, View.class, String.class, String.class, SplashADListener.class, Integer.TYPE).newInstance(context, objArr[0], str, str2, obj, objArr[1]);
                    case 2:
                        return a7.getConstructor(Context.class, String.class, String.class, NativeADUnifiedListener.class).newInstance(context, str, str2, obj);
                    case 3:
                        return a7.getConstructor(Context.class, ADSize.class, String.class, String.class, NativeExpressAD.NativeExpressADListener.class).newInstance(context, objArr[0], str, str2, obj);
                    case 4:
                        return a7.getConstructor(Context.class, String.class, String.class, RewardVideoADListener.class, Boolean.TYPE).newInstance(context, str, str2, obj, objArr[0]);
                    case 5:
                    case 6:
                        return a7.getConstructor(Activity.class, String.class, String.class, UnifiedInterstitialADListener.class).newInstance(com.aggmoread.sdk.z.c.a.a.d.a.d.m.a(context), str, str2, obj);
                    case 7:
                        return a7.getConstructor(Activity.class, String.class, String.class, UnifiedBannerADListener.class).newInstance(com.aggmoread.sdk.z.c.a.a.d.a.d.m.a(context), str, str2, obj);
                }
                return null;
            }
            Class a8 = eVar.a();
            switch (c.f3092a[eVar.ordinal()]) {
                case 1:
                    if (!TextUtils.isEmpty(str3)) {
                        Class cls = Integer.TYPE;
                        Object a9 = a(a8, new Class[]{Context.class, String.class, SplashADListener.class, cls, Map.class, View.class, String.class}, context, str2, (SplashADListener) obj, Integer.valueOf(((Integer) objArr[1]).intValue()), null, null, str3);
                        if (a9 != null) {
                            obj2 = a9;
                            break;
                        } else {
                            a5 = a(a8, new Class[]{Context.class, String.class, SplashADListener.class, cls, String.class}, context, str2, (SplashADListener) obj, Integer.valueOf(((Integer) objArr[1]).intValue()), str3);
                            obj2 = a5;
                            break;
                        }
                    }
                    obj2 = null;
                    break;
                case 2:
                    if (!TextUtils.isEmpty(str3)) {
                        a5 = a(a8, new Class[]{Context.class, String.class, NativeADUnifiedListener.class, String.class}, context, str2, (NativeADUnifiedListener) obj, str3);
                        obj2 = a5;
                        break;
                    }
                    obj2 = null;
                    break;
                case 3:
                    if (!TextUtils.isEmpty(str3)) {
                        a5 = a(a8, new Class[]{Context.class, ADSize.class, String.class, NativeExpressAD.NativeExpressADListener.class, String.class}, context, (ADSize) objArr[0], str2, (NativeExpressAD.NativeExpressADListener) obj, str3);
                        obj2 = a5;
                        break;
                    }
                    obj2 = null;
                    break;
                case 4:
                    if (!TextUtils.isEmpty(str3)) {
                        a5 = a(a8, new Class[]{Context.class, String.class, RewardVideoADListener.class, Boolean.TYPE, String.class}, context, str2, (RewardVideoADListener) obj, Boolean.valueOf(((Boolean) objArr[0]).booleanValue()), str3);
                        obj2 = a5;
                        break;
                    }
                    obj2 = null;
                    break;
                case 5:
                case 6:
                    if (!TextUtils.isEmpty(str3)) {
                        a5 = a(a8, new Class[]{Activity.class, String.class, UnifiedInterstitialADListener.class, Map.class, String.class}, com.aggmoread.sdk.z.c.a.a.d.a.d.m.a(context), str2, (UnifiedInterstitialADListener) obj, null, str3);
                        obj2 = a5;
                        break;
                    }
                    obj2 = null;
                    break;
                case 7:
                    if (!TextUtils.isEmpty(str3)) {
                        a5 = a(a8, new Class[]{Activity.class, String.class, UnifiedBannerADListener.class, Map.class, String.class}, com.aggmoread.sdk.z.c.a.a.d.a.d.m.a(context), str2, (UnifiedBannerADListener) obj, null, str3);
                        obj2 = a5;
                        break;
                    }
                    obj2 = null;
                    break;
                default:
                    obj2 = null;
                    break;
            }
            com.aggmoread.sdk.z.c.a.a.e.e.b("GDT_PAH_TAG", "entity  " + obj2);
            return obj2;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static Object a(Class<?> cls, String str, Object obj) {
        return a(cls, str, null, obj, new Object[0]);
    }

    public static Object a(Class<?> cls, String str, Class<?>[] clsArr, Object obj, Object... objArr) {
        try {
            com.aggmoread.sdk.z.c.a.a.e.e.b("GDT_PAH_TAG", "obj: " + obj + ", cls " + cls);
            return cls.getMethod(str, clsArr).invoke(obj, objArr);
        } catch (Exception e5) {
            e5.printStackTrace();
            com.aggmoread.sdk.z.c.a.a.e.e.b("GDT_PAH_TAG", "err " + e5.getMessage());
            return null;
        }
    }

    private static <T> T a(Class<T> cls, Class<?>[] clsArr, Object... objArr) {
        try {
            T newInstance = cls.getConstructor(clsArr).newInstance(objArr);
            com.aggmoread.sdk.z.c.a.a.e.e.a("new instance success " + newInstance);
            return newInstance;
        } catch (Exception e5) {
            com.aggmoread.sdk.z.c.a.a.e.e.a("new instance fail " + e5.getMessage());
            return null;
        }
    }

    public static void a(Object obj, int i4) {
        com.aggmoread.sdk.z.c.a.a.e.e.a("GDT_PAH_TAG", "s win s = %s, p = %s", obj, Integer.valueOf(i4));
        Class<?> cls = obj.getClass();
        try {
            Method method = cls.getMethod("sendWinNotification", Map.class);
            Object obj2 = IBidding.class.getField("EXPECT_COST_PRICE").get(null);
            HashMap hashMap = new HashMap();
            if (obj2 instanceof String) {
                com.aggmoread.sdk.z.c.a.a.e.e.b("GDT_PAH_TAG", "key_cost " + obj2);
                hashMap.put((String) obj2, Integer.valueOf(i4));
            }
            method.invoke(obj, hashMap);
        } catch (Exception e5) {
            com.aggmoread.sdk.z.c.a.a.e.e.a("GDT_PAH_TAG", "send map method err  = %s", e5);
            try {
                cls.getMethod("sendWinNotification", Integer.TYPE).invoke(obj, Integer.valueOf(i4));
            } catch (Exception e6) {
                com.aggmoread.sdk.z.c.a.a.e.e.a("GDT_PAH_TAG", "send method err  = %s", e6);
            }
        }
    }

    public static void a(Object obj, int i4, int i5, String str) {
        String str2 = str;
        com.aggmoread.sdk.z.c.a.a.e.e.a("GDT_PAH_TAG", "s los s = %s,p = %s,r = %s, ad = %s", obj, Integer.valueOf(i4), Integer.valueOf(i5), str2);
        Class<?> cls = obj.getClass();
        try {
            Method method = cls.getMethod("sendLossNotification", Map.class);
            HashMap hashMap = new HashMap();
            Field field = IBidding.class.getField("LOSS_REASON");
            Field field2 = IBidding.class.getField("WIN_PRICE");
            Field field3 = IBidding.class.getField("ADN_ID");
            Object obj2 = field.get(null);
            Object obj3 = field2.get(null);
            Object obj4 = field3.get(null);
            if (obj2 instanceof String) {
                com.aggmoread.sdk.z.c.a.a.e.e.b("GDT_PAH_TAG", "key_cost " + obj2);
                hashMap.put((String) obj2, Integer.valueOf(i5));
            }
            if (obj3 instanceof String) {
                com.aggmoread.sdk.z.c.a.a.e.e.b("GDT_PAH_TAG", "key_price " + obj3);
                hashMap.put((String) obj3, Integer.valueOf(i4));
            }
            if (obj4 instanceof String) {
                com.aggmoread.sdk.z.c.a.a.e.e.b("GDT_PAH_TAG", "key_adn " + obj4);
                hashMap.put((String) obj4, str2);
            }
            method.invoke(obj, hashMap);
        } catch (Exception e5) {
            com.aggmoread.sdk.z.c.a.a.e.e.a("GDT_PAH_TAG", "send map method err  = %s", e5);
            try {
                Class<?> cls2 = Integer.TYPE;
                Method method2 = cls.getMethod("sendLossNotification", cls2, cls2, String.class);
                Object[] objArr = new Object[3];
                objArr[0] = Integer.valueOf(i4);
                objArr[1] = Integer.valueOf(i5);
                if (str2 == null) {
                    str2 = "";
                }
                objArr[2] = str2;
                method2.invoke(obj, objArr);
            } catch (Exception e6) {
                com.aggmoread.sdk.z.c.a.a.e.e.a("GDT_PAH_TAG", "err  = %s", e6);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x0005
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static void a(java.lang.Object r7, com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.InterfaceC0124d r8) {
        /*
            java.lang.String r0 = "GDT_PAH_TAG"
            java.lang.Class<com.qq.e.comm.listeners.ADRewardListener> r1 = com.qq.e.comm.listeners.ADRewardListener.class
            goto Ld
        L5:
            java.lang.Class<com.qq.e.ads.interstitial2.ADRewardListener> r1 = com.qq.e.ads.interstitial2.ADRewardListener.class
            goto Ld
        L8:
            r1 = move-exception
            r1.printStackTrace()
            r1 = 0
        Ld:
            if (r1 == 0) goto L61
            java.lang.ClassLoader r2 = r1.getClassLoader()     // Catch: java.lang.Exception -> L4c
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L4c
            r5 = 0
            r4[r5] = r1     // Catch: java.lang.Exception -> L4c
            com.aggmoread.sdk.z.c.a.a.d.a.d.t.d$a r6 = new com.aggmoread.sdk.z.c.a.a.d.a.d.t.d$a     // Catch: java.lang.Exception -> L4c
            r6.<init>(r8)     // Catch: java.lang.Exception -> L4c
            java.lang.Object r8 = java.lang.reflect.Proxy.newProxyInstance(r2, r4, r6)     // Catch: java.lang.Exception -> L4c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4c
            r2.<init>()     // Catch: java.lang.Exception -> L4c
            java.lang.String r4 = "set reward listener "
            r2.append(r4)     // Catch: java.lang.Exception -> L4c
            r2.append(r1)     // Catch: java.lang.Exception -> L4c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L4c
            com.aggmoread.sdk.z.c.a.a.e.e.b(r0, r2)     // Catch: java.lang.Exception -> L4c
            java.lang.Class r2 = r7.getClass()     // Catch: java.lang.Exception -> L4c
            java.lang.String r4 = "setRewardListener"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L4c
            r6[r5] = r1     // Catch: java.lang.Exception -> L4c
            java.lang.reflect.Method r1 = r2.getMethod(r4, r6)     // Catch: java.lang.Exception -> L4c
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L4c
            r2[r5] = r8     // Catch: java.lang.Exception -> L4c
            r1.invoke(r7, r2)     // Catch: java.lang.Exception -> L4c
            goto L61
        L4c:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "err "
            r8.append(r1)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.aggmoread.sdk.z.c.a.a.e.e.b(r0, r7)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.a(java.lang.Object, com.aggmoread.sdk.z.c.a.a.d.a.d.t.d$d):void");
    }

    public static void a(Object obj, com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        try {
            String c5 = dVar.f3272p.c();
            String a5 = dVar.f3272p.a();
            com.aggmoread.sdk.z.c.a.a.e.e.b("GDT_PAH_TAG", "u = " + c5 + ", cd = " + a5);
            String a6 = m.a(a5, eVar.f3309c.c(e.c.T));
            StringBuilder sb = new StringBuilder();
            sb.append(" _extrasInfo = ");
            sb.append(a6);
            com.aggmoread.sdk.z.c.a.a.e.e.b("GDT_PAH_TAG", sb.toString());
            obj.getClass().getMethod("setServerSideVerificationOptions", ServerSideVerificationOptions.class).invoke(obj, new ServerSideVerificationOptions.Builder().setUserId(c5).setCustomData(a6).build());
        } catch (Exception e5) {
            com.aggmoread.sdk.z.c.a.a.e.e.b("xxx", "set ss ver err " + e5);
        }
    }

    public static void a(String str) {
        com.aggmoread.sdk.z.c.a.a.e.e.b("shakable " + str);
        HashMap hashMap = new HashMap();
        hashMap.put("shakable", str);
        a("setExtraUserData", new Class[]{Map.class}, hashMap);
    }

    private static void a(String str, Class<?>[] clsArr, Object... objArr) {
        try {
            a(Class.forName("com.qq.e.comm.managers.setting.GlobalSetting"), str, clsArr, null, objArr);
            com.aggmoread.sdk.z.c.a.a.e.e.b("invoke");
        } catch (Exception e5) {
            com.aggmoread.sdk.z.c.a.a.e.e.b("e " + e5.getMessage());
        }
    }

    public static void a(boolean z4) {
        com.aggmoread.sdk.z.c.a.a.e.e.b("isAgreePrivacy " + z4);
        a("setAgreePrivacyStrategy", new Class[]{Boolean.TYPE}, Boolean.valueOf(z4));
    }

    public static void b(Object obj, com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        com.aggmoread.sdk.z.c.a.a.c.r.c cVar;
        if (dVar == null || (cVar = dVar.f3272p) == null || cVar.b() == null) {
            return;
        }
        a(obj, dVar, eVar);
        a(obj, new b(dVar));
    }
}
