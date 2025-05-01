package com.efs.sdk.base.core.config;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.efs.sdk.base.BuildConfig;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.efs.sdk.base.core.util.PackageUtil;
import com.efs.sdk.base.core.util.ProcessUtil;
import com.efs.sdk.base.core.util.d;
import com.join.mgps.activity.ForumPostsTagSelectActivity_;
import com.qq.e.comm.pi.ACTD;
import com.tencent.stat.DeviceInfo;
import com.umeng.umcrash.UMCrash;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.TimeZone;
/* loaded from: classes2.dex */
public class GlobalInfoManager {

    /* renamed from: a  reason: collision with root package name */
    private GlobalInfo f10337a;

    /* renamed from: b  reason: collision with root package name */
    private Context f10338b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final GlobalInfoManager f10339a = new GlobalInfoManager((byte) 0);
    }

    /* synthetic */ GlobalInfoManager(byte b5) {
        this();
    }

    private static String a(Context context) {
        Class<?> cls;
        Method method;
        if (context == null) {
            return null;
        }
        try {
            cls = Class.forName("com.umeng.commonsdk.statistics.common.DeviceConfig");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                method = cls.getMethod("getSid", Context.class);
            } catch (NoSuchMethodException unused2) {
                method = null;
            }
            if (method != null) {
                try {
                    Object invoke = method.invoke(null, context);
                    if (invoke != null) {
                        return invoke.toString();
                    }
                    return null;
                } catch (IllegalAccessException | InvocationTargetException unused3) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public static GlobalInfoManager getInstance() {
        return a.f10339a;
    }

    public GlobalInfo getGlobalInfo() {
        try {
            String a5 = a(this.f10338b);
            if (!TextUtils.isEmpty(a5)) {
                this.f10337a.a(UMCrash.KEY_CALLBACK_SESSION_ID, a5);
            }
        } catch (Throwable th) {
            Log.d("efs.info.manager", "refreshSessionId caused error: " + th.getMessage());
        }
        return this.f10337a;
    }

    public String getNetStatus() {
        return this.f10337a.b("net", NetworkUtil.NETWORK_CLASS_DISCONNECTED).toString();
    }

    public void initGlobalInfo() {
        Log.e("ballack", "initGlobalInfo called once.");
        GlobalInfo globalInfo = new GlobalInfo();
        this.f10337a = globalInfo;
        globalInfo.a(ACTD.APPID_KEY, ControllerCenter.getGlobalEnvStruct().getAppid());
        int myPid = ProcessUtil.myPid();
        this.f10337a.a(ForumPostsTagSelectActivity_.f30896z, Integer.valueOf(myPid));
        this.f10337a.a("ps", ProcessUtil.getProcessName(myPid));
        String a5 = d.a(this.f10338b);
        this.f10337a.a("wid", a5);
        if (TextUtils.isEmpty(ControllerCenter.getGlobalEnvStruct().getUid())) {
            this.f10337a.a("uid", a5);
        } else {
            this.f10337a.a("uid", ControllerCenter.getGlobalEnvStruct().getUid());
        }
        GlobalInfo globalInfo2 = this.f10337a;
        com.efs.sdk.base.core.a.a.a();
        globalInfo2.a("stime", Long.valueOf(com.efs.sdk.base.core.a.a.b() - Process.getElapsedCpuTime()));
        this.f10337a.a("pkg", PackageUtil.getPackageName(this.f10338b));
        this.f10337a.a(DeviceInfo.TAG_VERSION, PackageUtil.getAppVersionName(this.f10338b));
        this.f10337a.a("vcode", PackageUtil.getAppVersionCode(this.f10338b));
        this.f10337a.a("sdk_ver", BuildConfig.VERSION_NAME);
        this.f10337a.a("brand", Build.BRAND.toLowerCase());
        GlobalInfo globalInfo3 = this.f10337a;
        String str = Build.MODEL;
        globalInfo3.a("model", str == null ? "unknown" : str.replace(" ", "-").replace("_", "-").toLowerCase());
        this.f10337a.a("build_model", str);
        DisplayMetrics displayMetrics = this.f10338b.getResources().getDisplayMetrics();
        this.f10337a.a("dsp_w", Integer.valueOf(displayMetrics.widthPixels));
        this.f10337a.a("dsp_h", Integer.valueOf(displayMetrics.heightPixels));
        this.f10337a.a("fr", q.a.f73126a);
        this.f10337a.a("rom", Build.VERSION.RELEASE);
        this.f10337a.a(com.umeng.ccg.a.f64025r, Integer.valueOf(Build.VERSION.SDK_INT));
        this.f10337a.a("lang", Locale.getDefault().getLanguage());
        this.f10337a.a("tzone", TimeZone.getDefault().getID());
        this.f10337a.a("net", NetworkUtil.getNetworkType(this.f10338b));
        try {
            String[] networkAccessMode = NetworkUtil.getNetworkAccessMode(this.f10338b);
            if ("Wi-Fi".equals(networkAccessMode[0])) {
                this.f10337a.a(UMCrash.KEY_HEADER_ACCESS, NetworkUtil.NETWORK_TYPE_WIFI);
            } else if ("2G/3G".equals(networkAccessMode[0])) {
                this.f10337a.a(UMCrash.KEY_HEADER_ACCESS, "2G/3G");
            } else {
                this.f10337a.a(UMCrash.KEY_HEADER_ACCESS, "unknow");
            }
            if (!"".equals(networkAccessMode[1])) {
                this.f10337a.a(UMCrash.KEY_HEADER_ACCESS_SUBTYPE, networkAccessMode[1]);
            }
            this.f10337a.a(UMCrash.KEY_HEADER_NETWORK_TYPE, Integer.valueOf(NetworkUtil.getNetworkTypeUmeng(this.f10338b)));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void refreshNetStatus() {
        String networkType = NetworkUtil.getNetworkType(ControllerCenter.getGlobalEnvStruct().mAppContext);
        Log.w("efs.info.manager", "network change: ".concat(String.valueOf(networkType)));
        this.f10337a.a("net", networkType);
    }

    private GlobalInfoManager() {
        this.f10338b = ControllerCenter.getGlobalEnvStruct().mAppContext;
    }
}
