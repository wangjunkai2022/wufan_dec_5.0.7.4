package com.beizi.fusion.d;

import android.content.Context;
import com.baidu.mobads.sdk.api.BDAdConfig;
import com.baidu.mobads.sdk.api.BDDialogParams;
import com.baidu.mobads.sdk.api.MobadsPermissionSettings;
import com.beizi.fusion.BeiZis;
/* compiled from: BdAdManagerHolder.java */
/* loaded from: classes2.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f6727a;

    public static void a(Context context, String str) {
        b(context, str);
    }

    private static void b(Context context, String str) {
        if (f6727a) {
            return;
        }
        try {
            if (BeiZis.getCustomController() != null) {
                MobadsPermissionSettings.setPermissionReadDeviceID(BeiZis.getCustomController().isCanUsePhoneState());
                MobadsPermissionSettings.setPermissionLocation(BeiZis.getCustomController().isCanUseLocation());
            }
            new BDAdConfig.Builder().setAppsid(str).setDialogParams(new BDDialogParams.Builder().setDlDialogType(0).setDlDialogAnimStyle(0).build()).build(context).init();
            f6727a = true;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
