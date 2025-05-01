package com.kwad.components.ad.splashscreen;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.AnyThread;
import com.ksad.json.annotation.KsJson;
import com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo;
import com.kwad.components.core.video.j;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.network.a.a;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdResultData;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.ah;
import com.kwad.sdk.utils.i;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class SplashPreloadManager {
    private HashMap<String, PreLoadItem> Cn;
    private List<String> Co;
    private volatile SharedPreferences Cp;
    private final Object mLock;

    @KsJson
    /* loaded from: classes5.dex */
    public static class PreLoadItem extends com.kwad.sdk.core.response.a.a implements Serializable {
        public long cacheTime;
        public long expiredTime;
        public String preloadId;
    }

    /* loaded from: classes5.dex */
    static class a {
        private static final SplashPreloadManager Cq = new SplashPreloadManager((byte) 0);
    }

    /* synthetic */ SplashPreloadManager(byte b5) {
        this();
    }

    public static File U(String str) {
        if (str != null) {
            com.kwad.sdk.core.e.c.d("PreloadManager", "getVideoFile preloadId " + str + "  url " + str);
            File bZ = com.kwad.sdk.core.diskcache.b.a.DM().bZ(str);
            if (bZ == null || !bZ.exists()) {
                return null;
            }
            return bZ;
        }
        return null;
    }

    @AnyThread
    public static boolean f(AdResultData adResultData) {
        if (!adResultData.getAdTemplateList().isEmpty()) {
            AdTemplate adTemplate = adResultData.getAdTemplateList().get(0);
            if (!adTemplate.adInfoList.isEmpty()) {
                return com.kwad.sdk.core.response.b.a.bc(adTemplate.adInfoList.get(0));
            }
        }
        return false;
    }

    @AnyThread
    public static boolean g(AdResultData adResultData) {
        if (!adResultData.getAdTemplateList().isEmpty()) {
            AdTemplate adTemplate = adResultData.getAdTemplateList().get(0);
            if (!adTemplate.adInfoList.isEmpty()) {
                return com.kwad.sdk.core.response.b.a.bb(adTemplate.adInfoList.get(0));
            }
        }
        return false;
    }

    private void init() {
        Context context = ServiceProvider.getContext();
        if (context != null) {
            this.Cp = context.getSharedPreferences("ksadsdk_splash_preload_id_list", 0);
            initData();
        }
    }

    private void initData() {
        Map<String, ?> all = this.Cp.getAll();
        ArrayList<String> arrayList = new ArrayList();
        for (String str : all.keySet()) {
            PreLoadItem preLoadItem = new PreLoadItem();
            try {
                Object obj = all.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!TextUtils.isEmpty(str2)) {
                        preLoadItem.parseJson(new JSONObject(str2));
                        if (!TextUtils.isEmpty(preLoadItem.preloadId)) {
                            File bZ = com.kwad.sdk.core.diskcache.b.a.DM().bZ(preLoadItem.preloadId);
                            if (bZ != null && bZ.exists()) {
                                synchronized (this.mLock) {
                                    this.Cn.put(str, preLoadItem);
                                    if (!this.Co.contains(str)) {
                                        this.Co.add(str);
                                    }
                                }
                            } else {
                                arrayList.add(preLoadItem.preloadId);
                                com.kwad.sdk.core.e.c.d("PreloadManager", "Remove null file list " + preLoadItem.preloadId);
                            }
                        }
                    }
                }
            } catch (Exception e5) {
                com.kwad.sdk.core.e.c.printStackTrace(e5);
            }
        }
        SharedPreferences.Editor edit = this.Cp.edit();
        for (String str3 : arrayList) {
            edit.remove(str3);
        }
        edit.apply();
    }

    private void ky() {
        int size;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.mLock) {
            ArrayList<String> arrayList = new ArrayList();
            for (String str : this.Cn.keySet()) {
                PreLoadItem preLoadItem = this.Cn.get(str);
                if (preLoadItem != null && preLoadItem.expiredTime < currentTimeMillis) {
                    arrayList.add(str);
                }
            }
            SharedPreferences.Editor edit = this.Cp.edit();
            for (String str2 : arrayList) {
                this.Co.remove(str2);
                this.Cn.remove(str2);
                edit.remove(str2);
                com.kwad.sdk.core.diskcache.b.a.DM().remove(str2);
            }
            edit.apply();
            size = this.Co.size();
        }
        if (size > 30) {
            com.kwad.sdk.core.e.c.d("PreloadManager", "大于 30 按失效日期远近顺序移除");
            int i4 = size - 15;
            for (int i5 = 0; i5 < i4; i5++) {
                long j4 = Long.MAX_VALUE;
                String str3 = "";
                synchronized (this.mLock) {
                    for (PreLoadItem preLoadItem2 : this.Cn.values()) {
                        long j5 = preLoadItem2.expiredTime;
                        if (j5 < j4) {
                            str3 = preLoadItem2.preloadId;
                            j4 = j5;
                        }
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        this.Co.remove(str3);
                        this.Cn.remove(str3);
                        this.Cp.edit().remove(str3).apply();
                        com.kwad.sdk.core.e.c.d("PreloadManager", "移除 preloadId = " + str3 + " expiredTime =  " + j4);
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    com.kwad.sdk.core.diskcache.b.a.DM().remove(str3);
                }
            }
        }
    }

    @AnyThread
    public static SplashPreloadManager kz() {
        SplashPreloadManager splashPreloadManager = a.Cq;
        if (splashPreloadManager.Cp == null) {
            splashPreloadManager.init();
        }
        return splashPreloadManager;
    }

    @AnyThread
    private void o(AdInfo adInfo) {
        PreLoadItem preLoadItem = new PreLoadItem();
        preLoadItem.cacheTime = System.currentTimeMillis();
        preLoadItem.expiredTime = System.currentTimeMillis() + (adInfo.adPreloadInfo.validityPeriod * 1000);
        preLoadItem.preloadId = com.kwad.sdk.core.response.b.a.aY(adInfo);
        synchronized (this.mLock) {
            this.Cn.put(adInfo.adPreloadInfo.preloadId, preLoadItem);
            if (!this.Co.contains(adInfo.adPreloadInfo.preloadId)) {
                this.Co.add(adInfo.adPreloadInfo.preloadId);
            }
        }
        if (this.Cp != null) {
            SharedPreferences.Editor edit = this.Cp.edit();
            edit.putString(adInfo.adPreloadInfo.preloadId, preLoadItem.toJson().toString());
            edit.apply();
        }
    }

    private static boolean p(AdInfo adInfo) {
        return com.kwad.sdk.core.config.d.a(com.kwad.components.ad.splashscreen.b.a.CS) && com.kwad.sdk.core.response.b.a.bc(adInfo);
    }

    @AnyThread
    private boolean q(AdInfo adInfo) {
        if (p(adInfo)) {
            return KSImageLoader.isImageExist(com.kwad.sdk.core.response.b.a.aT(adInfo).materialUrl);
        }
        String str = adInfo.adPreloadInfo.preloadId;
        if (str != null) {
            File bZ = com.kwad.sdk.core.diskcache.b.a.DM().bZ(str);
            StringBuilder sb = new StringBuilder("check preloadId ");
            sb.append(str);
            sb.append(" file exists ");
            sb.append(bZ == null ? "null" : Boolean.valueOf(bZ.exists()));
            com.kwad.sdk.core.e.c.d("PreloadManager", sb.toString());
            if (bZ != null && bZ.exists()) {
                return true;
            }
        }
        return false;
    }

    public final List<String> R() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mLock) {
            com.kwad.sdk.core.e.c.d("PreloadManager", "getPreloadIdList start ");
            for (int i4 = 0; i4 < this.Co.size(); i4++) {
                String str = this.Co.get(i4);
                File bZ = com.kwad.sdk.core.diskcache.b.a.DM().bZ(str);
                if (bZ != null && bZ.exists()) {
                    arrayList.add(str);
                }
            }
            com.kwad.sdk.core.e.c.d("PreloadManager", "getPreloadIdList end ");
        }
        com.kwad.sdk.core.e.c.d("PreloadManager", "getPreloadIdList " + this.Co.size());
        return arrayList;
    }

    @AnyThread
    public final int b(AdResultData adResultData, boolean z4) {
        String str;
        boolean a5;
        Iterator<AdTemplate> it2 = adResultData.getAdTemplateList().iterator();
        com.kwad.components.ad.splashscreen.monitor.b.kW();
        com.kwad.components.ad.splashscreen.monitor.b.h(adResultData);
        int i4 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            AdTemplate next = it2.next();
            if (next != null) {
                for (AdInfo adInfo : next.adInfoList) {
                    if (adInfo.adPreloadInfo != null && this.Cp != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (!q(adInfo)) {
                            if (com.kwad.sdk.core.response.b.a.bb(adInfo)) {
                                str = com.kwad.sdk.core.response.b.a.K(adInfo);
                            } else {
                                str = com.kwad.sdk.core.response.b.a.bc(adInfo) ? com.kwad.sdk.core.response.b.a.aT(adInfo).materialUrl : null;
                            }
                            if (!TextUtils.isEmpty(str)) {
                                String aY = com.kwad.sdk.core.response.b.a.aY(adInfo);
                                if (adInfo.adPreloadInfo.preloadType != 1 || ah.isWifiConnected(ServiceProvider.getContext()) || z4) {
                                    com.kwad.sdk.core.e.c.d("PreloadManager", "start Download preloadId " + aY + " true url " + str);
                                    ky();
                                    a.C0525a c0525a = new a.C0525a();
                                    if (p(adInfo)) {
                                        a5 = KSImageLoader.loadImageSync(str) != null;
                                    } else {
                                        a5 = j.a(str, aY, c0525a);
                                    }
                                    if (a5) {
                                        o(adInfo);
                                        i4++;
                                        com.kwad.components.ad.splashscreen.monitor.b.kW();
                                        com.kwad.components.ad.splashscreen.monitor.b.a(next, SystemClock.elapsedRealtime() - elapsedRealtime, 1);
                                    } else {
                                        com.kwad.components.ad.splashscreen.monitor.b.kW();
                                        com.kwad.components.ad.splashscreen.monitor.b.d(next, 4, c0525a.msg);
                                        com.kwad.components.core.o.a.qI().f(next, 1, c0525a.msg);
                                    }
                                } else {
                                    com.kwad.components.ad.splashscreen.monitor.b.kW();
                                    com.kwad.components.ad.splashscreen.monitor.b.d(next, 1, SplashMonitorInfo.ERROR_NET_MSG);
                                }
                            } else {
                                com.kwad.components.ad.splashscreen.monitor.b.kW();
                                com.kwad.components.ad.splashscreen.monitor.b.d(next, 2, SplashMonitorInfo.ERROR_URL_INVALID_MSG);
                            }
                        } else {
                            com.kwad.components.ad.splashscreen.monitor.b.kW();
                            com.kwad.components.ad.splashscreen.monitor.b.a(next, SystemClock.elapsedRealtime() - elapsedRealtime, 2);
                            o(adInfo);
                            i4++;
                        }
                    } else {
                        com.kwad.components.ad.splashscreen.monitor.b.kW();
                        com.kwad.components.ad.splashscreen.monitor.b.d(next, 3, SplashMonitorInfo.ERROR_PRELOAD_ID_INVALID_MSG);
                    }
                }
            }
        }
        AdTemplate adTemplate = adResultData.getAdTemplateList().size() > 0 ? adResultData.getAdTemplateList().get(0) : null;
        if (i4 > 0) {
            i.ao("splashAd_", "onSplashVideoAdCacheSuccess");
            com.kwad.components.core.o.a.qI().e(adTemplate, i4);
        } else {
            i.ao("splashAd_", "onSplashVideoAdCacheFailed");
        }
        return i4;
    }

    @AnyThread
    public final boolean e(AdResultData adResultData) {
        if (!adResultData.getAdTemplateList().isEmpty()) {
            AdTemplate adTemplate = adResultData.getAdTemplateList().get(0);
            if (!adTemplate.adInfoList.isEmpty()) {
                AdInfo adInfo = adTemplate.adInfoList.get(0);
                if (adInfo.adPreloadInfo != null) {
                    if (p(adInfo)) {
                        return KSImageLoader.isImageExist(com.kwad.sdk.core.response.b.a.aT(adInfo).materialUrl);
                    }
                    return q(adInfo);
                }
            }
        }
        return false;
    }

    private SplashPreloadManager() {
        this.mLock = new Object();
        this.Cn = new HashMap<>();
        this.Co = new ArrayList();
        init();
    }
}
