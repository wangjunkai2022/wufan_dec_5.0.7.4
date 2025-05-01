package com.beizi.fusion.d;

import android.content.Context;
import com.beizi.fusion.BeiZis;
import com.beizi.fusion.g.at;
import com.jd.ad.sdk.bl.initsdk.JADPrivateController;
import com.jd.ad.sdk.bl.initsdk.JADYunSdk;
import com.jd.ad.sdk.bl.initsdk.JADYunSdkConfig;
/* compiled from: JadYunAdManagerHolder.java */
/* loaded from: classes2.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f6748a;

    public static void a(Context context, String str) {
        b(context, str);
    }

    private static void b(Context context, String str) {
        if (f6748a) {
            return;
        }
        try {
            JADYunSdk.init(context, new JADYunSdkConfig.Builder().setAppId(str).setEnableLog(true).setPrivateController(a(context)).build());
            f6748a = true;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private static JADPrivateController a(final Context context) {
        return new JADPrivateController() { // from class: com.beizi.fusion.d.m.1
            public String getIP() {
                return "";
            }

            public String getImei() {
                return "";
            }

            public String getOaid() {
                return (String) at.b(context, "__OAID__", "");
            }

            public boolean isCanUseIP() {
                return super.isCanUseIP();
            }

            public boolean isCanUseLocation() {
                if (BeiZis.getCustomController() != null) {
                    return BeiZis.getCustomController().isCanUseLocation();
                }
                return super.isCanUseLocation();
            }

            public boolean isCanUsePhoneState() {
                if (BeiZis.getCustomController() != null) {
                    return BeiZis.getCustomController().isCanUsePhoneState();
                }
                return super.isCanUsePhoneState();
            }
        };
    }
}
