package com.beizi.fusion.g;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.mobads.sdk.api.MobadsPermissionSettings;
import com.beizi.ad.BeiZi;
import com.beizi.fusion.BeiZis;
import com.beizi.fusion.model.Manager;
import com.beizi.fusion.model.RequestInfo;
import com.beizi.fusion.model.ResponseInfo;
import com.kwad.sdk.api.KsAdSDK;
import com.qq.e.comm.managers.setting.GlobalSetting;
/* compiled from: PersonalizedUtil.java */
/* loaded from: classes2.dex */
public class aj {
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007c -> B:28:0x007f). Please submit an issue!!! */
    public static void a(boolean z4) {
        try {
            if (!z4) {
                try {
                    GlobalSetting.setPersonalizedState(1);
                } catch (Throwable unused) {
                }
                try {
                    com.beizi.fusion.d.u.a(true);
                } catch (Throwable unused2) {
                }
                try {
                    KsAdSDK.setPersonalRecommend(false);
                } catch (Throwable unused3) {
                }
                try {
                    MobadsPermissionSettings.setLimitPersonalAds(true);
                } catch (Throwable unused4) {
                }
                try {
                    BeiZi.setLimitPersonalAds(true);
                } catch (Throwable unused5) {
                }
                BeiZis.setLimitPersonalAds(true);
                if (com.beizi.fusion.d.b.a().e() == null || !b() || RequestInfo.getInstance(com.beizi.fusion.d.b.a().e()).getDevInfo() == null || TextUtils.isEmpty(RequestInfo.getInstance(com.beizi.fusion.d.b.a().e()).getDevInfo().getOaid())) {
                    return;
                }
                RequestInfo.getInstance(com.beizi.fusion.d.b.a().e()).getDevInfo().setOaid("");
                return;
            }
            try {
                GlobalSetting.setPersonalizedState(0);
            } catch (Throwable unused6) {
            }
            try {
                com.beizi.fusion.d.u.a(false);
            } catch (Throwable unused7) {
            }
            try {
                KsAdSDK.setPersonalRecommend(true);
            } catch (Throwable unused8) {
            }
            try {
                MobadsPermissionSettings.setLimitPersonalAds(false);
            } catch (Throwable unused9) {
            }
            try {
                BeiZi.setLimitPersonalAds(false);
            } catch (Throwable unused10) {
            }
            BeiZis.setLimitPersonalAds(false);
        } catch (Throwable th) {
            while (true) {
                th.printStackTrace();
                return;
            }
        }
    }

    public static boolean b() {
        int c5 = c();
        return c5 == 0 || c5 == 2;
    }

    private static int c() {
        Context e5 = com.beizi.fusion.d.b.a().e();
        if (e5 != null) {
            if (!ResponseInfo.getInstance(e5).isInit()) {
                ResponseInfo.getInstance(e5).init();
            }
            Manager manager = ResponseInfo.getInstance(e5).getManager();
            if (manager != null) {
                return manager.getPersonalRecommend();
            }
        }
        return 0;
    }

    public static boolean a() {
        int c5 = c();
        boolean isLimitPersonalAds = BeiZis.isLimitPersonalAds();
        if (c5 == 0 || c5 == 2) {
            return isLimitPersonalAds;
        }
        return false;
    }
}
