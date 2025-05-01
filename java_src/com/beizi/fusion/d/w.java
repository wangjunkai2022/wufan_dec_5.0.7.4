package com.beizi.fusion.d;

import android.content.Context;
import android.text.TextUtils;
import com.beizi.ad.BeiZi;
import com.beizi.ad.BeiZiAdSdkController;
import com.beizi.fusion.BeiZis;
import com.beizi.fusion.g.aj;
import com.beizi.fusion.g.au;
import com.beizi.fusion.g.av;
import com.beizi.fusion.model.AdPlusConfig;
import com.beizi.fusion.model.IncentiveConfig;
import com.beizi.fusion.model.RequestInfo;
import com.beizi.fusion.model.ResponseInfo;
import java.util.HashMap;
/* compiled from: selfAdManagerHolder.java */
/* loaded from: classes2.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f6764a;

    public static void a(Context context, String str) {
        try {
            b(context.getApplicationContext(), str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void b(final Context context, String str) {
        if (f6764a) {
            return;
        }
        try {
            a(context);
            BeiZi.init(context, str, new BeiZiAdSdkController() { // from class: com.beizi.fusion.d.w.1
                @Override // com.beizi.ad.BeiZiAdSdkController
                public String getDevOaid() {
                    try {
                        if (RequestInfo.getInstance(context).getDevInfo() != null) {
                            String oaid = RequestInfo.getInstance(context).getDevInfo().getOaid();
                            if (!TextUtils.isEmpty(oaid)) {
                                return oaid;
                            }
                            String customOaid = RequestInfo.getInstance(context).getCustomOaid();
                            if (!TextUtils.isEmpty(customOaid)) {
                                return customOaid;
                            }
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    return super.getDevOaid();
                }

                @Override // com.beizi.ad.BeiZiAdSdkController
                public boolean isCanUseGaid() {
                    if (BeiZis.getCustomController() != null) {
                        return !aj.a() && BeiZis.getCustomController().isCanUseGaid();
                    }
                    return super.isCanUseGaid();
                }

                @Override // com.beizi.ad.BeiZiAdSdkController
                public boolean isCanUseLocation() {
                    if (BeiZis.getCustomController() != null) {
                        return BeiZis.getCustomController().isCanUseLocation();
                    }
                    return super.isCanUseLocation();
                }

                @Override // com.beizi.ad.BeiZiAdSdkController
                public boolean isCanUseOaid() {
                    if (BeiZis.getCustomController() != null) {
                        return !aj.a() && BeiZis.getCustomController().isCanUseOaid();
                    }
                    return super.isCanUseOaid();
                }

                @Override // com.beizi.ad.BeiZiAdSdkController
                public boolean isCanUsePhoneState() {
                    if (BeiZis.getCustomController() != null) {
                        return BeiZis.getCustomController().isCanUsePhoneState();
                    }
                    return super.isCanUsePhoneState();
                }

                @Override // com.beizi.ad.BeiZiAdSdkController
                public boolean isCanUseWifiState() {
                    if (BeiZis.getCustomController() != null) {
                        return BeiZis.getCustomController().isCanUseWifiState();
                    }
                    return super.isCanUseWifiState();
                }
            });
            f6764a = true;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void a(Context context) {
        String a5;
        try {
            if (av.a("com.beizi.ad.BeiZi")) {
                AdPlusConfig adPlusConfig = ResponseInfo.getInstance(context).getAdPlusConfig();
                if (adPlusConfig != null && !TextUtils.isEmpty(adPlusConfig.getAdUrl()) && adPlusConfig.getAdUrl().startsWith(com.facebook.common.util.f.f10923a)) {
                    a5 = adPlusConfig.getAdUrl();
                } else {
                    a5 = com.beizi.fusion.g.f.a(BeiZis.getTransferProtocol() ? "aHR0cHM6Ly9hcGktaHRwLmJlaXppLmJpei9tYi9zZGswL2pzb24=" : "aHR0cDovL2FwaS5odHAuYWQtc2NvcGUuY29tLmNuOjQ1NjAwL21iL3NkazAvanNvbg==");
                    if (TextUtils.isEmpty(a5)) {
                        return;
                    }
                }
                if (TextUtils.isEmpty(a5)) {
                    return;
                }
                BeiZi.setAdRequestUrl(a5);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void a(Context context, IncentiveConfig incentiveConfig) {
        if (incentiveConfig != null) {
            HashMap hashMap = new HashMap();
            String a5 = au.a(context, incentiveConfig.getMacro());
            hashMap.put("configVersion", incentiveConfig.getConfigVersion());
            hashMap.put("macro", a5);
            hashMap.put("rtaUrl", incentiveConfig.getRtaUrl());
            hashMap.put("userInfoUrl", incentiveConfig.getUserInfoUrl());
            hashMap.put("authUrl", incentiveConfig.getAuthUrl());
            hashMap.put("transferUrl", incentiveConfig.getTransferUrl());
            hashMap.put("appId", b.a().b());
            BeiZi.setIncentiveConfig(hashMap);
        }
    }
}
