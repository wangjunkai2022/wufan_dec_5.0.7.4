package com.aggmoread.sdk.z.c.a.a.d.a.d.q;

import android.text.TextUtils;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<b, com.aggmoread.sdk.z.c.a.a.d.a.d.q.b<?>> f3037a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private static volatile d f3038b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3039a;

        static {
            int[] iArr = new int[com.aggmoread.sdk.z.c.a.a.c.i.values().length];
            f3039a = iArr;
            try {
                iArr[com.aggmoread.sdk.z.c.a.a.c.i.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3039a[com.aggmoread.sdk.z.c.a.a.c.i.SPLASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3039a[com.aggmoread.sdk.z.c.a.a.c.i.INTERSTITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3039a[com.aggmoread.sdk.z.c.a.a.c.i.REWARD_VIDEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3039a[com.aggmoread.sdk.z.c.a.a.c.i.INFORMATION_FLOW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3039a[com.aggmoread.sdk.z.c.a.a.c.i.FULL_SCREEN_VIDEO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3039a[com.aggmoread.sdk.z.c.a.a.c.i.DRAW.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: b  reason: collision with root package name */
        public static final b f3040b = new b("BANNER", 0, 1);

        /* renamed from: c  reason: collision with root package name */
        public static final b f3041c = new b("SPLASH", 1, 2);

        /* renamed from: d  reason: collision with root package name */
        public static final b f3042d = new b("INTERSTITIAL", 2, 3);

        /* renamed from: e  reason: collision with root package name */
        public static final b f3043e = new b("NATIVE_AD", 3, 4);

        /* renamed from: f  reason: collision with root package name */
        public static final b f3044f = new b("EXPRESS_AD", 4, 9);

        /* renamed from: g  reason: collision with root package name */
        public static final b f3045g = new b("REWARD_VIDEO", 5, 5);

        /* renamed from: h  reason: collision with root package name */
        public static final b f3046h = new b("DRAW", 6, 8);

        /* renamed from: i  reason: collision with root package name */
        public static final b f3047i = new b("FULL_SCREEN_VIDEO", 7, 7);

        private b(String str, int i4, int i5) {
        }
    }

    private d() {
        Map<b, com.aggmoread.sdk.z.c.a.a.d.a.d.q.b<?>> map = f3037a;
        map.put(b.f3043e, new m());
        map.put(b.f3044f, new g());
        map.put(b.f3041c, new l());
        map.put(b.f3045g, new k());
        map.put(b.f3042d, new i());
        map.put(b.f3047i, new h());
        map.put(b.f3040b, new com.aggmoread.sdk.z.c.a.a.d.a.d.q.a());
        map.put(b.f3046h, new f());
    }

    private com.aggmoread.sdk.z.c.a.a.d.a.d.q.b<?> a(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        Map<b, com.aggmoread.sdk.z.c.a.a.d.a.d.q.b<?>> map;
        b bVar;
        String c5 = eVar.f3309c.c(e.c.U);
        try {
            if (!TextUtils.isEmpty(c5)) {
                if (dVar.f3261e.a() == Integer.parseInt(c5)) {
                    switch (a.f3039a[dVar.f3261e.ordinal()]) {
                        case 1:
                            map = f3037a;
                            bVar = b.f3040b;
                            break;
                        case 2:
                            map = f3037a;
                            bVar = b.f3041c;
                            break;
                        case 3:
                            map = f3037a;
                            bVar = b.f3042d;
                            break;
                        case 4:
                            map = f3037a;
                            bVar = b.f3045g;
                            break;
                        case 5:
                            String a5 = eVar.f3309c.a(e.c.S, "2");
                            com.aggmoread.sdk.z.c.a.a.e.e.b("xxx", "v1 " + a5 + ", v2 " + dVar.f3262f);
                            if (!TextUtils.isEmpty(dVar.f3262f) && dVar.f3262f.equals(a5)) {
                                if (!a5.equalsIgnoreCase("2")) {
                                    map = f3037a;
                                    bVar = b.f3044f;
                                    break;
                                } else {
                                    map = f3037a;
                                    bVar = b.f3043e;
                                    break;
                                }
                            }
                            break;
                        case 6:
                            map = f3037a;
                            bVar = b.f3047i;
                            break;
                        case 7:
                            map = f3037a;
                            bVar = b.f3046h;
                            break;
                    }
                } else if (dVar.f3261e.a() == com.aggmoread.sdk.z.c.a.a.c.i.DRAW.a()) {
                    map = f3037a;
                    bVar = b.f3046h;
                }
                return map.get(bVar);
            }
        } catch (Exception e5) {
            com.aggmoread.sdk.z.c.a.a.e.e.a(e5.getMessage());
        }
        return null;
    }

    public static d a() {
        if (f3038b == null) {
            synchronized (d.class) {
                if (f3038b == null) {
                    f3038b = new d();
                }
            }
        }
        return f3038b;
    }

    public boolean b(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.q.b<?> a5 = a(dVar, eVar);
        if (a5 != null) {
            a5.a(dVar, eVar);
            return true;
        }
        com.aggmoread.sdk.z.c.a.a.e.e.b("ADCBH", "不支持的类型!");
        return false;
    }
}
