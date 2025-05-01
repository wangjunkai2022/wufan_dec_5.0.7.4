package com.aggmoread.sdk.z.c.a.a.d.a.d.u;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.location.Location;
import android.text.TextUtils;
import com.aggmoread.sdk.z.c.a.a.c.j;
import com.aggmoread.sdk.z.c.a.a.d.a.d.l;
import com.aggmoread.sdk.z.c.a.a.d.a.d.n;
import com.aggmoread.sdk.z.c.a.a.d.a.d.u.c;
import com.aggmoread.sdk.z.c.a.a.d.b.g;
import com.aggmoread.sdk.z.c.a.a.e.e;
import com.aggmoread.sdk.z.c.a.a.e.m;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsCustomController;
import com.kwad.sdk.api.KsDrawAd;
import com.kwad.sdk.api.KsFeedAd;
import com.kwad.sdk.api.KsFullScreenVideoAd;
import com.kwad.sdk.api.KsInterstitialAd;
import com.kwad.sdk.api.KsRewardVideoAd;
import com.kwad.sdk.api.KsSplashScreenAd;
import com.kwad.sdk.api.SdkConfig;
import com.kwad.sdk.api.model.AdExposureFailedReason;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class b extends l {

    /* renamed from: a  reason: collision with root package name */
    private static b f3168a;

    /* renamed from: b  reason: collision with root package name */
    private static AtomicBoolean f3169b = new AtomicBoolean();

    /* loaded from: classes2.dex */
    static class a extends KsCustomController {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f3170a;

        a(j jVar) {
            this.f3170a = jVar;
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public boolean canReadInstalledPackages() {
            return this.f3170a.a();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public boolean canReadLocation() {
            return this.f3170a.b();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public boolean canUseMacAddress() {
            return this.f3170a.c();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public boolean canUseNetworkState() {
            return this.f3170a.d();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public boolean canUseOaid() {
            return this.f3170a.e();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public boolean canUsePhoneState() {
            return this.f3170a.f();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public boolean canUseStoragePermission() {
            return this.f3170a.g();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public String getAndroidId() {
            return this.f3170a.h();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public String getImei() {
            return this.f3170a.j();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public String[] getImeis() {
            return this.f3170a.k();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public List<String> getInstalledPackages() {
            ArrayList arrayList = new ArrayList();
            List<PackageInfo> l4 = this.f3170a.l();
            if (l4 != null) {
                for (PackageInfo packageInfo : l4) {
                    arrayList.add(packageInfo.packageName);
                }
            }
            return arrayList;
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public Location getLocation() {
            return this.f3170a.m();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public String getMacAddress() {
            return this.f3170a.n();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public String getOaid() {
            return this.f3170a.o();
        }
    }

    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.u.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static class C0133b implements c.b {
        C0133b() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.u.c.b
        public void a() {
            e.b("KSAdSDK", "ks start fail  ");
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.u.c.b
        public void b() {
            e.b("KSAdSDK", "ks start success  ");
        }
    }

    private b() {
    }

    public static int a(Object obj) {
        Exception e5;
        int i4;
        try {
            Method method = obj.getClass().getMethod("getECPM", new Class[0]);
            method.setAccessible(true);
            i4 = ((Integer) method.invoke(obj, new Object[0])).intValue();
            if (i4 <= 0) {
                try {
                    e.a("c -1 ");
                    return -1;
                } catch (Exception e6) {
                    e5 = e6;
                    e5.printStackTrace();
                    e.a("ks ecpm err " + e5.getMessage());
                    return i4;
                }
            }
        } catch (Exception e7) {
            e5 = e7;
            i4 = -1;
        }
        return i4;
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (f3168a == null) {
                synchronized (b.class) {
                    if (f3168a == null) {
                        f3168a = new b();
                    }
                }
            }
            bVar = f3168a;
        }
        return bVar;
    }

    private static Object a(Object obj, String str, Object[] objArr, Class... clsArr) {
        if (obj != null) {
            try {
                Method method = obj.getClass().getMethod(str, clsArr);
                method.setAccessible(true);
                return method.invoke(obj, objArr);
            } catch (Exception e5) {
                e.a("ks invoke method failed,  method " + str + ", err " + e5.getMessage());
                return null;
            }
        }
        return null;
    }

    private String a(AdInfo adInfo) {
        if (adInfo != null) {
            try {
                StringBuilder sb = new StringBuilder();
                AdInfo.AdBaseInfo adBaseInfo = adInfo.adBaseInfo;
                e.b("XXXXX", "adBaseInfo = [ appCategory " + adBaseInfo.appCategory + ", appName " + adBaseInfo.appName + ", adDescription " + adBaseInfo.adDescription + ", productName " + adBaseInfo.productName + "]");
                if (!TextUtils.isEmpty(adBaseInfo.appCategory)) {
                    sb.append(adBaseInfo.appCategory);
                }
                if (!TextUtils.isEmpty(adBaseInfo.appName)) {
                    if (!TextUtils.isEmpty(sb.toString())) {
                        sb.append("#");
                    }
                    sb.append(adBaseInfo.appName);
                }
                String sb2 = sb.toString();
                if (TextUtils.isEmpty(sb2)) {
                    sb.delete(0, sb.length());
                    String str = adBaseInfo.adDescription;
                    if (!TextUtils.isEmpty(str)) {
                        sb.append(str);
                    }
                    String str2 = adBaseInfo.productName;
                    if (!TextUtils.isEmpty(str2)) {
                        sb.append("#");
                        sb.append(str2);
                    }
                    return sb.toString();
                }
                return sb2;
            } catch (Exception e5) {
                e5.printStackTrace();
                e.b("XXXXX", "getAdInfoStr err " + e5.getMessage());
                return null;
            }
        }
        return null;
    }

    private String a(AdTemplate adTemplate) {
        List<AdInfo> list;
        if (adTemplate == null || (list = adTemplate.adInfoList) == null || list.size() <= 0) {
            return null;
        }
        return a(list.get(0));
    }

    private List<Object> a(Object obj, Class cls) {
        ArrayList arrayList = new ArrayList();
        try {
            Class<?> cls2 = obj.getClass();
            e.b("XXXXX", "getFieldValueByClassName ");
            Field[] declaredFields = cls2.getDeclaredFields();
            if (declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    e.b("XXXXX", "field name " + field.getName() + ", value " + obj2);
                    if (obj2 != null && obj2.getClass() == cls) {
                        arrayList.add(obj2);
                    }
                }
            }
        } catch (Exception e5) {
            e.b("XXXXX", "get field value err " + e5.getMessage());
        }
        return arrayList;
    }

    public static void a(Object obj, int i4) {
        try {
            Object obj2 = Class.forName("com.kwad.sdk.api.model.AdExposureFailureCode").getDeclaredField("BID_FAILED").get(null);
            Object newInstance = AdExposureFailedReason.class.getConstructor(new Class[0]).newInstance(new Object[0]);
            AdExposureFailedReason.class.getField("winEcpm").setInt(newInstance, i4);
            a(obj, "reportAdExposureFailed", new Object[]{obj2, newInstance}, Integer.TYPE, AdExposureFailedReason.class);
            e.a("ks send failed end");
        } catch (Exception e5) {
            e.a("ks send failed err " + e5.getMessage());
        }
    }

    public static boolean a(Context context, String str) {
        String appId = KsAdSDK.getAppId();
        boolean z4 = true;
        if (TextUtils.isEmpty(appId) || !appId.equals(str)) {
            if (context == null || TextUtils.isEmpty(str)) {
                e.b("KSAdSDK", "Context或APP_ID为空，初始化失败!");
                return false;
            }
            e.b("KSAdSDK", "ks init appId " + str);
            if (f3169b.compareAndSet(false, true)) {
                int i4 = n.f2904a;
                if (i4 != -1) {
                    c.a(i4 == 1);
                }
                if (n.f2905b != -1) {
                    c.a().b(n.f2905b == 0);
                }
            }
            SdkConfig.Builder debug = new SdkConfig.Builder().appId(str).showNotification(true).debug(com.aggmoread.sdk.z.c.a.a.d.b.j.f3430r.booleanValue());
            j b5 = g.a().b();
            if (b5 != null) {
                debug.customController(new a(b5));
            }
            c.a(debug, new C0133b());
            boolean init = KsAdSDK.init(context.getApplicationContext(), debug.build());
            String appId2 = KsAdSDK.getAppId();
            c.c();
            z4 = (init && !TextUtils.isEmpty(appId2) && appId2.equals(str)) ? false : false;
            e.b("KSAdSDK", "ks init result  " + z4);
            return z4;
        }
        return true;
    }

    public static boolean a(com.aggmoread.sdk.z.c.a.a.d.b.e eVar, int i4) {
        return m.a(eVar, i4);
    }

    public static String b() {
        return KsAdSDK.getSDKVersion();
    }

    public static void b(Object obj, int i4) {
        a(obj, "setBidEcpm", new Object[]{Integer.valueOf(i4)}, Integer.TYPE);
        e.a("ks send success end");
    }

    public static void b(Map<String, Object> map, int i4, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        a().a(map, i4, eVar);
    }

    public String a(KsDrawAd ksDrawAd) {
        if (ksDrawAd != null) {
            List<Object> a5 = a(ksDrawAd, AdInfo.class);
            if (a5.size() > 0) {
                Object obj = a5.get(0);
                if (obj instanceof AdInfo) {
                    return a((AdInfo) obj);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public String a(KsFeedAd ksFeedAd) {
        if (ksFeedAd != null) {
            List<Object> a5 = a(ksFeedAd, AdInfo.class);
            if (a5.size() > 0) {
                Object obj = a5.get(0);
                if (obj instanceof AdInfo) {
                    return a((AdInfo) obj);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public String a(KsFullScreenVideoAd ksFullScreenVideoAd) {
        if (ksFullScreenVideoAd != null) {
            List<Object> a5 = a(ksFullScreenVideoAd, AdInfo.class);
            if (a5.size() > 0) {
                Object obj = a5.get(0);
                if (obj instanceof AdInfo) {
                    return a((AdInfo) obj);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public String a(KsInterstitialAd ksInterstitialAd) {
        if (ksInterstitialAd != null) {
            List<Object> a5 = a(ksInterstitialAd, AdTemplate.class);
            if (a5.size() > 0) {
                Object obj = a5.get(0);
                if (obj instanceof AdTemplate) {
                    return a((AdTemplate) obj);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public String a(KsRewardVideoAd ksRewardVideoAd) {
        if (ksRewardVideoAd != null) {
            List<Object> a5 = a(ksRewardVideoAd, AdInfo.class);
            if (a5.size() > 0) {
                Object obj = a5.get(0);
                if (obj instanceof AdInfo) {
                    return a((AdInfo) obj);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public String a(KsSplashScreenAd ksSplashScreenAd) {
        List<AdInfo> list;
        if (ksSplashScreenAd != null) {
            List<Object> a5 = a(ksSplashScreenAd, AdTemplate.class);
            if (a5.size() > 0) {
                Object obj = a5.get(0);
                if (!(obj instanceof AdTemplate) || (list = ((AdTemplate) obj).adInfoList) == null || list.size() <= 0) {
                    return null;
                }
                return a(list.get(0));
            }
            return null;
        }
        return null;
    }
}
