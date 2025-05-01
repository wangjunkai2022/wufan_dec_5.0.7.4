package com.beizi.fusion.d;

import android.content.Context;
import com.beizi.fusion.BeiZis;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.av;
import com.beizi.fusion.model.AdSpacesBean;
import com.bytedance.sdk.openadsdk.TTAdConfig;
import com.bytedance.sdk.openadsdk.TTAdManager;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTCustomController;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: TTAdManagerHolder.java */
/* loaded from: classes2.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f6761a;

    /* renamed from: b  reason: collision with root package name */
    private static ConcurrentHashMap<String, com.beizi.fusion.work.a> f6762b;

    public static TTAdManager a() {
        if (!TTAdSdk.isSdkReady()) {
            af.c("BeiZis", "TTAdSdk is not init or init fail, please check.");
        }
        return TTAdSdk.getAdManager();
    }

    private static String c() {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", "personal_ads_type");
            if (f6761a) {
                jSONObject.put("value", "0");
            } else {
                jSONObject.put("value", "1");
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", "is_shake_ads");
            if (BeiZis.isCloseShakeAd()) {
                jSONObject2.put("value", "0");
            } else {
                jSONObject2.put("value", "1");
            }
            jSONArray.put(jSONObject);
            jSONArray.put(jSONObject2);
            return jSONArray.toString();
        } catch (Exception e5) {
            e5.printStackTrace();
            return "";
        }
    }

    public static void b(com.beizi.fusion.work.a aVar, Context context, String str, int i4) {
        a(aVar, context, str, i4, true);
    }

    private static String b(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", "personal_ads_type");
            jSONObject.put("value", str);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", "is_shake_ads");
            if (BeiZis.isCloseShakeAd()) {
                jSONObject2.put("value", "0");
            } else {
                jSONObject2.put("value", "1");
            }
            jSONArray.put(jSONObject2);
            return jSONArray.toString();
        } catch (Exception e5) {
            e5.printStackTrace();
            return "";
        }
    }

    public static void a(com.beizi.fusion.work.a aVar, Context context, String str, int i4) {
        a(aVar, context, str, i4, false);
    }

    private static void a(com.beizi.fusion.work.a aVar, Context context, String str, int i4, boolean z4) {
        try {
            if (TTAdSdk.isSdkReady()) {
                if (aVar != null) {
                    af.b("BeiZis", "TTAdManagerHolder.isInitSuccess success ");
                    aVar.ay();
                    return;
                }
                return;
            }
            if (f6762b == null) {
                f6762b = new ConcurrentHashMap<>();
            }
            if (aVar != null) {
                AdSpacesBean.BuyerBean k4 = aVar.k();
                f6762b.put(k4 != null ? k4.getSpaceId() : null, aVar);
            }
            TTAdSdk.init(context, a(context, str, i4, z4));
            TTAdSdk.start(new TTAdSdk.Callback() { // from class: com.beizi.fusion.d.u.1
                @Override // com.bytedance.sdk.openadsdk.TTAdSdk.InitCallback
                public void fail(int i5, String str2) {
                    try {
                        for (com.beizi.fusion.work.a aVar2 : u.f6762b.values()) {
                            aVar2.ax();
                            String str3 = null;
                            AdSpacesBean.BuyerBean k5 = aVar2.k();
                            if (k5 != null) {
                                str3 = k5.getSpaceId();
                            }
                            u.f6762b.remove(str3);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("TTAdManagerHolder.doInit().init() i:");
                    sb.append(i5);
                    sb.append(" s:");
                    sb.append(str2);
                }

                @Override // com.bytedance.sdk.openadsdk.TTAdSdk.InitCallback
                public void success() {
                    af.c("BeiZis", "TTAdManagerHolder.doInit().init() success ");
                    synchronized (this) {
                        try {
                            for (com.beizi.fusion.work.a aVar2 : u.f6762b.values()) {
                                aVar2.ay();
                                String str2 = null;
                                AdSpacesBean.BuyerBean k5 = aVar2.k();
                                if (k5 != null) {
                                    str2 = k5.getSpaceId();
                                }
                                u.f6762b.remove(str2);
                            }
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static TTAdConfig a(Context context, String str, int i4, boolean z4) {
        try {
            return new TTAdConfig.Builder().appId(str).useTextureView(true).appName(av.f(context)).titleBarTheme(1).allowShowNotify(true).data(c()).useMediation(z4).customController(new TTCustomController() { // from class: com.beizi.fusion.d.u.2
                @Override // com.bytedance.sdk.openadsdk.TTCustomController
                public boolean isCanUseLocation() {
                    if (BeiZis.getCustomController() != null) {
                        return BeiZis.getCustomController().isCanUseLocation();
                    }
                    return super.isCanUseLocation();
                }

                @Override // com.bytedance.sdk.openadsdk.TTCustomController
                public boolean isCanUsePhoneState() {
                    if (BeiZis.getCustomController() != null) {
                        return BeiZis.getCustomController().isCanUsePhoneState();
                    }
                    return super.isCanUsePhoneState();
                }

                @Override // com.bytedance.sdk.openadsdk.TTCustomController
                public boolean isCanUseWifiState() {
                    if (BeiZis.getCustomController() != null) {
                        return BeiZis.getCustomController().isCanUseWifiState();
                    }
                    return super.isCanUseWifiState();
                }
            }).build();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static void a(boolean z4) {
        f6761a = z4;
        if (z4) {
            a("0");
        } else {
            a("1");
        }
    }

    private static void a(String str) {
        TTAdSdk.updateAdConfig(new TTAdConfig.Builder().data(b(str)).build());
    }
}
