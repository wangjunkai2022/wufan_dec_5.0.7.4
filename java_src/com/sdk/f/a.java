package com.sdk.f;

import android.content.Context;
import com.sdk.Unicorn.base.framework.bean.AInfo;
import com.sdk.Unicorn.base.framework.bean.PInfo;
import com.sdk.Unicorn.base.framework.bean.SInfo;
import com.sdk.Unicorn.base.framework.utils.app.AppUtils;
import com.sdk.Unicorn.base.module.config.BaseConfig;
import java.util.ArrayList;
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f60038a = false;

    /* renamed from: b  reason: collision with root package name */
    public static String f60039b = "";

    /* renamed from: c  reason: collision with root package name */
    public static String f60040c = "";

    public static AInfo a(Context context) {
        String appMd5;
        AInfo aInfo = new AInfo();
        aInfo.setN(AppUtils.getAppLable(context));
        aInfo.setC(AppUtils.getVersionCode(context));
        aInfo.setV(AppUtils.getVersionName(context));
        if (f60038a) {
            aInfo.setPk(f60040c);
            appMd5 = f60039b;
        } else {
            aInfo.setPk(AppUtils.getPackageName(context));
            appMd5 = AppUtils.getAppMd5(context);
        }
        aInfo.setMd5(appMd5);
        return aInfo;
    }

    public static ArrayList a() {
        return new ArrayList();
    }

    public static PInfo b() {
        PInfo pInfo = new PInfo();
        pInfo.setOs("Android");
        return pInfo;
    }

    public static SInfo c() {
        SInfo sInfo = new SInfo();
        sInfo.setN(BaseConfig.f59912n);
        sInfo.setC(BaseConfig.f59911c);
        sInfo.setV(BaseConfig.f59913v);
        sInfo.setCm(BaseConfig.cm);
        return sInfo;
    }
}
