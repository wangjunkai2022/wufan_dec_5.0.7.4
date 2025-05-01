package com.aggmoread.sdk.z.c.a.a.d.a.d.p;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import com.aggmoread.sdk.z.c.a.a.d.a.d.l;
import com.aggmoread.sdk.z.c.a.a.d.a.d.n;
import com.aggmoread.sdk.z.c.a.a.d.b.d;
import com.aggmoread.sdk.z.c.a.a.e.e;
import com.aggmoread.sdk.z.c.a.a.e.j;
import com.aggmoread.sdk.z.c.a.a.e.m;
import com.aggmoread.sdk.z.c.a.a.e.q.f;
import com.baidu.mobads.sdk.api.AdSettings;
import com.baidu.mobads.sdk.api.BDAdConfig;
import com.baidu.mobads.sdk.api.ExpressInterstitialAd;
import com.baidu.mobads.sdk.api.ExpressResponse;
import com.baidu.mobads.sdk.api.FullScreenVideoAd;
import com.baidu.mobads.sdk.api.IAdInterListener;
import com.baidu.mobads.sdk.api.MobadsPermissionSettings;
import com.baidu.mobads.sdk.api.RequestParameters;
import com.baidu.mobads.sdk.api.RewardVideoAd;
import com.baidu.mobads.sdk.api.SplashAd;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.umeng.analytics.pro.bm;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class a extends l {

    /* renamed from: a  reason: collision with root package name */
    private static a f2935a;

    /* renamed from: b  reason: collision with root package name */
    static AtomicBoolean f2936b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private static AtomicBoolean f2937c = new AtomicBoolean();

    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.p.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static class C0105a implements InvocationHandler {
        C0105a() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            return null;
        }
    }

    /* loaded from: classes2.dex */
    static class b implements InvocationHandler {
        b() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            return null;
        }
    }

    private a() {
    }

    private static int a(com.aggmoread.sdk.z.c.a.a.a aVar, String str, int i4) {
        if (aVar == null || !aVar.a(str)) {
            return -1;
        }
        return aVar.a(str, i4);
    }

    public static int a(Object obj) {
        Exception e5;
        int i4;
        String str;
        int i5 = -1;
        try {
            Method method = obj.getClass().getMethod("getECPMLevel", new Class[0]);
            method.setAccessible(true);
            str = (String) method.invoke(obj, new Object[0]);
        } catch (Exception e6) {
            e5 = e6;
            i4 = -1;
        }
        if (!TextUtils.isEmpty(str)) {
            i4 = Integer.valueOf(str).intValue();
            if (i4 <= 0) {
                try {
                    e.a("bd c -1 ");
                } catch (Exception e7) {
                    e5 = e7;
                    e5.printStackTrace();
                    e.a("bd ecpm err " + e5.getMessage());
                    i5 = i4;
                    e.a("bd ecpm " + i5);
                    return i5;
                }
            }
            i5 = i4;
        }
        e.a("bd ecpm " + i5);
        return i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context] */
    public static Context a(d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar, f fVar) {
        ContextWrapper contextWrapper;
        ?? r02 = dVar.f3260d;
        try {
            boolean a5 = fVar.a(eVar);
            e.a("isHack " + a5);
            contextWrapper = r02;
            if (a5) {
                com.aggmoread.sdk.z.c.a.a.e.q.d dVar2 = dVar.f3260d instanceof Activity ? new com.aggmoread.sdk.z.c.a.a.e.q.d((Activity) dVar.f3260d) : new com.aggmoread.sdk.z.c.a.a.e.q.e(dVar.f3260d);
                fVar.a(dVar2, eVar, new Object[0]);
                contextWrapper = dVar2;
            }
        } catch (Exception e5) {
            e.a("hack err " + e5.getMessage());
            contextWrapper = dVar.f3260d;
        }
        e.a("getAdContext " + contextWrapper);
        return contextWrapper;
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (f2935a == null) {
                synchronized (a.class) {
                    if (f2935a == null) {
                        f2935a = new a();
                    }
                }
            }
            aVar = f2935a;
        }
        return aVar;
    }

    private String a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("req_id")) {
                String optString = jSONObject.optString("req_id");
                e.b("XXXXX", "req_id " + optString);
            }
            if (jSONObject.has(bm.aA)) {
                JSONObject jSONObject2 = jSONObject.optJSONArray(bm.aA).getJSONObject(0);
                if (jSONObject2 == null || !jSONObject2.keys().hasNext()) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = new ArrayList();
                if (jSONObject2.has("appname")) {
                    String optString2 = jSONObject2.optString("appname");
                    if (!TextUtils.isEmpty(optString2)) {
                        arrayList.add(optString2);
                    }
                }
                if (jSONObject2.has("tit")) {
                    String optString3 = jSONObject2.optString("tit");
                    if (!TextUtils.isEmpty(optString3) && !arrayList.contains(optString3)) {
                        arrayList.add(optString3);
                    }
                }
                if (jSONObject2.has("desc")) {
                    String optString4 = jSONObject2.optString("desc");
                    if (!TextUtils.isEmpty(optString4) && !arrayList.contains(optString4)) {
                        arrayList.add(optString4);
                    }
                }
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if (i4 != 0) {
                        sb.append("#");
                    }
                    sb.append((String) arrayList.get(i4));
                }
                if (sb.length() > 0) {
                    return sb.toString();
                }
                return null;
            }
            return null;
        } catch (Exception e5) {
            e.b("XXXXX", "err " + e5);
            return null;
        }
    }

    public static void a(Context context, String str) {
        int i4;
        if (context == null || TextUtils.isEmpty(str)) {
            e.b("BDAdSDK", "Context或APP_ID为空，初始化失败!");
            return;
        }
        if (f2937c.compareAndSet(false, true) && (i4 = n.f2904a) != -1) {
            c.a(i4 == 1);
        }
        try {
            if (f2936b.compareAndSet(false, true)) {
                new BDAdConfig.Builder().setAppName("union_sdk").setAppsid(str).build(context).init();
                MobadsPermissionSettings.setPermissionLocation(false);
            }
        } catch (Exception unused) {
            f2936b.set(false);
        }
    }

    public static void a(RequestParameters.Builder builder, d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        if (builder != null) {
            int a5 = a(dVar.f3277u, "com.sdk.key.BID_DSP", 5);
            int a6 = a(dVar.f3277u, "com.sdk.key.BID_PRICE", -1);
            e.a("supplement d " + a5 + ",p " + a6);
            if (a5 < 1 || a5 > 5 || a6 < 0) {
                return;
            }
            j.a(builder, "addCustExt", new Class[]{String.class, String.class}, "A", "" + a5);
            j.a(builder, "addCustExt", new Class[]{String.class, String.class}, "B", "" + a6);
            int a7 = a(dVar.f3277u, "com.sdk.key.BID_EXPOSED", 0);
            e.a("supplement e " + a7);
            if (a7 < 0 || a7 > 1) {
                return;
            }
            j.a(builder, "addCustExt", new Class[]{String.class, String.class}, "C", "" + a7);
        }
    }

    public static void a(Object obj, int i4) {
        try {
            Method a5 = j.a(obj, "biddingSuccess", String.class);
            if (a5 != null) {
                a5.invoke(obj, String.valueOf(i4));
            } else {
                Class<?> cls = Class.forName("com.baidu.mobads.sdk.api.BiddingListener");
                Method a6 = j.a(obj, "biddingSuccess", LinkedHashMap.class, cls);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(MediationConstant.KEY_ECPM, String.valueOf(i4));
                a6.invoke(obj, linkedHashMap, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new b()));
            }
            e.a("bd send sus " + i4);
        } catch (Exception e5) {
            e.a("bd send sus err " + e5);
        }
    }

    public static void a(Object obj, RequestParameters requestParameters) {
        j.a(obj, "setRequestParameters", new Class[]{RequestParameters.class}, requestParameters);
    }

    public static void a(Object obj, String str) {
        try {
            Method a5 = j.a(obj, "biddingFail", String.class);
            if (a5 != null) {
                a5.invoke(obj, str);
            } else {
                Class<?> cls = Class.forName("com.baidu.mobads.sdk.api.BiddingListener");
                Method a6 = j.a(obj, "biddingSuccess", LinkedHashMap.class, cls);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(MediationConstant.KEY_REASON, 203);
                a6.invoke(obj, linkedHashMap, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C0105a()));
            }
            e.a("bd send fail " + str);
        } catch (Exception e5) {
            e.a("bd send fail err " + e5);
        }
    }

    public static boolean a(com.aggmoread.sdk.z.c.a.a.d.b.e eVar, int i4) {
        return m.a(eVar, i4);
    }

    public static String b() {
        String sDKVersion = AdSettings.getSDKVersion();
        e.a("bd: sdkVersion " + sDKVersion);
        return sDKVersion;
    }

    private String b(Object obj) {
        Field[] fieldArr;
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = "v1 ";
        String str6 = ", field ";
        String str7 = "adProdTemplate";
        if (obj != null) {
            try {
                Object a5 = j.a(obj, IAdInterListener.class);
                if (a5 != null) {
                    Class<?> cls = a5.getClass();
                    e.b("XXXXX", "preload k = " + cls);
                    Object b5 = j.b(j.a(a5, "adProdTemplate"), com.xinzhu.overmind.utils.helpers.f.f68332a);
                    j.a(b5, "com.baidu.mobads.container.adrequest.s", "first template");
                    String obj2 = j.a(b5, "p").toString();
                    e.b("XXXXX", "jsonStr " + obj2);
                    try {
                        if (TextUtils.isEmpty(obj2)) {
                            Field[] declaredFields = cls.getDeclaredFields();
                            int length = declaredFields.length;
                            int i4 = 0;
                            while (i4 < length) {
                                Field field = declaredFields[i4];
                                field.setAccessible(true);
                                Object obj3 = field.get(a5);
                                e.b("XXXXX", "field " + field.getName() + str6 + obj3);
                                if (obj3 != null && obj3.getClass().getName().contains("com.baidu.mobads.container.adrequest")) {
                                    Field[] declaredFields2 = obj3.getClass().getDeclaredFields();
                                    int length2 = declaredFields2.length;
                                    int i5 = 0;
                                    while (i5 < length2) {
                                        Field field2 = declaredFields2[i5];
                                        field2.setAccessible(true);
                                        Object obj4 = field2.get(obj3);
                                        e.b("XXXXX", "field_ " + field2.getName() + str6 + obj4);
                                        if (obj4 == null || !obj4.getClass().getName().equals("com.baidu.mobads.container.adrequest.ProdAdRequestInfo")) {
                                            fieldArr = declaredFields2;
                                            str = str5;
                                            str2 = str6;
                                            str3 = str7;
                                            j.b(obj4, "com.baidu.mobads.container.adrequest.ProdAdRequestInfo", field2.getName() + ",ProdAdRequestInfo");
                                            j.b(obj4, "com.baidu.mobads.container.adrequest", field2.getName() + ", adreuqest");
                                        } else {
                                            Field field3 = obj4.getClass().getField(str7);
                                            field3.setAccessible(true);
                                            Object obj5 = field3.get(obj4);
                                            if (com.aggmoread.sdk.z.c.a.a.d.b.j.f3430r.booleanValue()) {
                                                e.b("XXXXX", str5 + obj5);
                                                j.b(obj5, "com.baidu.mobads.container.adrequest", str5);
                                            }
                                            if (obj5 != null) {
                                                Field[] fields = obj5.getClass().getFields();
                                                int length3 = fields.length;
                                                int i6 = 0;
                                                while (i6 < length3) {
                                                    Field[] fieldArr2 = declaredFields2;
                                                    Field field4 = fields[i6];
                                                    String str8 = str5;
                                                    field4.setAccessible(true);
                                                    Object obj6 = field4.get(obj5);
                                                    String str9 = str6;
                                                    if (obj6 != null) {
                                                        StringBuilder sb = new StringBuilder();
                                                        str4 = str7;
                                                        sb.append("vvv filed name ");
                                                        sb.append(field4.getName());
                                                        e.b("XXXXX", sb.toString());
                                                        if (obj6.getClass().getName().contains("com.baidu.mobads.container.adrequest.s")) {
                                                            Field declaredField = obj6.getClass().getDeclaredField("p");
                                                            declaredField.setAccessible(true);
                                                            String obj7 = declaredField.get(obj6).toString();
                                                            e.b("XXXXX", "final json = " + obj7);
                                                            if (!TextUtils.isEmpty(obj7)) {
                                                                return null;
                                                            }
                                                        }
                                                    } else {
                                                        str4 = str7;
                                                    }
                                                    j.a(obj6, "com.baidu.mobads.container.adrequest.s", "s_tag");
                                                    i6++;
                                                    declaredFields2 = fieldArr2;
                                                    str5 = str8;
                                                    str6 = str9;
                                                    str7 = str4;
                                                }
                                            }
                                            fieldArr = declaredFields2;
                                            str = str5;
                                            str2 = str6;
                                            str3 = str7;
                                        }
                                        i5++;
                                        declaredFields2 = fieldArr;
                                        str5 = str;
                                        str6 = str2;
                                        str7 = str3;
                                    }
                                    return null;
                                }
                                i4++;
                                str5 = str5;
                                str6 = str6;
                                str7 = str7;
                            }
                            return null;
                        }
                        return a(obj2);
                    } catch (Exception e5) {
                        e = e5;
                        e.printStackTrace();
                        return null;
                    }
                }
            } catch (Exception e6) {
                e = e6;
            }
        }
        return null;
    }

    public static void b(Map<String, Object> map, int i4, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        a().a(map, i4, eVar);
    }

    public String a(ExpressInterstitialAd expressInterstitialAd) {
        return b(j.a(expressInterstitialAd, "mNativeInterstitialAdProd"));
    }

    public String a(ExpressResponse expressResponse) {
        return b(j.a(expressResponse, com.xinzhu.overmind.utils.helpers.f.f68332a));
    }

    public String a(FullScreenVideoAd fullScreenVideoAd) {
        return b(j.a(fullScreenVideoAd, "mAdProd"));
    }

    public String a(RewardVideoAd rewardVideoAd) {
        return b(j.a(rewardVideoAd, "mAdProd"));
    }

    public String a(SplashAd splashAd) {
        return b(j.a(splashAd, "mAdProd"));
    }
}
