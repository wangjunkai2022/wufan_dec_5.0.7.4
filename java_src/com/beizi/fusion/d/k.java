package com.beizi.fusion.d;

import android.content.Context;
import com.beizi.fusion.BeiZis;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.av;
import com.qq.e.comm.managers.GDTAdSdk;
import com.qq.e.comm.managers.setting.GlobalSetting;
import com.qq.e.comm.pi.IBidding;
import java.util.HashMap;
/* compiled from: GDTAdManagerHolder.java */
/* loaded from: classes2.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f6745a;

    public static void a(Context context, String str) {
        try {
            if (BeiZis.getCustomController() != null) {
                boolean isCanUsePhoneState = BeiZis.getCustomController().isCanUsePhoneState();
                GlobalSetting.setAgreeReadAndroidId(isCanUsePhoneState);
                GlobalSetting.setAgreeReadDeviceId(isCanUsePhoneState);
            }
            if (BeiZis.isCloseShakeAd()) {
                HashMap hashMap = new HashMap();
                hashMap.put("shakable", "0");
                GlobalSetting.setExtraUserData(hashMap);
            }
            GDTAdSdk.initWithoutStart(context, str);
            GDTAdSdk.start(new GDTAdSdk.OnStartListener() { // from class: com.beizi.fusion.d.k.1
                @Override // com.qq.e.comm.managers.GDTAdSdk.OnStartListener
                public void onStartFailed(Exception exc) {
                    af.c("BeiZis", "GDTAdManagerHolder initWith() onStartFailed e : " + exc);
                }

                @Override // com.qq.e.comm.managers.GDTAdSdk.OnStartListener
                public void onStartSuccess() {
                    af.c("BeiZis", "GDTAdManagerHolder initWith() onStartSuccess ");
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void b(Context context, String str) {
        d(context, str);
    }

    public static String c(Context context, String str) {
        try {
            if (av.a("com.qq.e.comm.managers.GDTAdSdk")) {
                b(context, str);
                return GDTAdSdk.getGDTAdManger().getBuyerId(null);
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private static void d(Context context, String str) {
        if (f6745a) {
            return;
        }
        try {
            a(context, str);
            f6745a = true;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void b(IBidding iBidding, int i4) {
        HashMap hashMap = new HashMap();
        hashMap.put(IBidding.LOSS_REASON, Integer.valueOf(i4));
        hashMap.put(IBidding.ADN_ID, 3);
        iBidding.sendWinNotification(hashMap);
    }

    public static String a(Context context, String str, String str2) {
        try {
            if (av.a("com.qq.e.comm.managers.GDTAdSdk")) {
                b(context, str);
                return GDTAdSdk.getGDTAdManger().getSDKInfo(str2);
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static void a(IBidding iBidding, int i4) {
        HashMap hashMap = new HashMap();
        hashMap.put(IBidding.EXPECT_COST_PRICE, Integer.valueOf(i4));
        hashMap.put(IBidding.HIGHEST_LOSS_PRICE, Integer.valueOf(i4 - 1));
        iBidding.sendWinNotification(hashMap);
    }
}
