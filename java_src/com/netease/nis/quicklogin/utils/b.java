package com.netease.nis.quicklogin.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.coremedia.iso.boxes.k1;
import com.netease.nis.basesdk.Logger;
import com.netease.nis.basesdk.crash.BaseJavaCrashHandler;
import com.qq.e.comm.pi.ACTD;
import com.uc.crashsdk.export.LogType;
import com.umeng.analytics.pro.bm;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: CrashHandler.java */
/* loaded from: classes5.dex */
public final class b extends BaseJavaCrashHandler {

    /* renamed from: d  reason: collision with root package name */
    private static boolean f57608d;

    /* renamed from: a  reason: collision with root package name */
    private String f57609a;

    /* renamed from: b  reason: collision with root package name */
    private String f57610b;

    /* renamed from: c  reason: collision with root package name */
    private long f57611c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CrashHandler.java */
    /* renamed from: com.netease.nis.quicklogin.utils.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0573b {
        @SuppressLint({"StaticFieldLeak"})

        /* renamed from: a  reason: collision with root package name */
        private static final b f57612a = new b();
    }

    private String b() {
        if (Build.VERSION.SDK_INT >= 21) {
            return TextUtils.join(",", Build.SUPPORTED_ABIS);
        }
        String str = Build.CPU_ABI;
        String str2 = Build.CPU_ABI2;
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str + "," + str2;
    }

    public static b c() {
        return C0573b.f57612a;
    }

    public void a(String str, Context context) {
        if (f57608d) {
            return;
        }
        this.f57609a = str;
        this.f57610b = a(context);
        this.f57611c = System.currentTimeMillis();
        if (context.getExternalFilesDir("qCrash") != null) {
            super.initialize(context.getExternalFilesDir("qCrash").toString());
        } else {
            super.initialize(context.getFilesDir().toString());
        }
        f57608d = true;
    }

    @Override // com.netease.nis.basesdk.crash.BaseJavaCrashHandler
    protected Map<String, String> buildCrashInfo(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        try {
            jSONObject.put("version", "1.0.1");
            jSONObject.put(ACTD.APPID_KEY, "A006669459");
            jSONObject.put("uploadtime", System.currentTimeMillis());
            jSONObject.put("isencoded", 0);
            jSONObject2.put("appname", "网易易盾号码认证SDK");
            jSONObject2.put("version", "3.2.5");
            jSONObject2.put("packagename", "com.netease.nis.quicklogin");
            jSONObject2.put("tag", LogType.JAVA_TYPE);
            jSONObject2.put("exceptiontype", "exception");
            jSONObject2.put("crashinfo", str);
            jSONObject3.put("OS", Build.VERSION.CODENAME);
            jSONObject3.put("OSVERSION", Build.VERSION.RELEASE);
            jSONObject3.put("STARTTIME", this.f57611c);
            jSONObject3.put("CRASHTIME", System.currentTimeMillis());
            jSONObject3.put("DEVICEID", this.f57610b);
            jSONObject3.put("FINGERPRINT", Build.FINGERPRINT);
            jSONObject3.put("MANUFACTURER", Build.MANUFACTURER);
            jSONObject3.put("DEVICE", Build.DEVICE);
            jSONObject3.put("MODEL", Build.MODEL);
            jSONObject3.put("CPU_ABI", b());
            jSONObject2.put("machineInfo", jSONObject3.toString());
            jSONObject4.put("UserId", TextUtils.isEmpty(this.f57609a) ? "" : this.f57609a);
            jSONObject2.put(MediationConstant.KEY_EXTRA_INFO, jSONObject4.toString());
        } catch (JSONException e5) {
            Logger.e(e5.getMessage());
        }
        HashMap hashMap = new HashMap();
        hashMap.put("head", jSONObject.toString());
        hashMap.put("data", jSONObject2.toString());
        return hashMap;
    }

    @Override // com.netease.nis.basesdk.crash.BaseJavaCrashHandler
    protected Map<String, String> buildStartInfo() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("version", "1.0.1");
            jSONObject.put(ACTD.APPID_KEY, "A006669459");
            jSONObject.put("uploadtime", System.currentTimeMillis());
            jSONObject.put("isencoded", 0);
            jSONObject2.put("appname", "网易易盾号码认证SDK");
            jSONObject2.put("appver", "3.2.5");
            jSONObject2.put("packagename", "com.netease.nis.quicklogin");
            jSONObject2.put("open_udid", this.f57610b);
            jSONObject2.put(bm.f63463x, Build.VERSION.CODENAME);
            jSONObject2.put("osVersion", Build.VERSION.RELEASE);
            jSONObject2.put(com.alipay.sdk.packet.d.f4907p, Build.DEVICE);
            jSONObject2.put("model", Build.MODEL);
        } catch (JSONException e5) {
            Logger.e(e5.getMessage());
        }
        HashMap hashMap = new HashMap();
        hashMap.put("head", jSONObject.toString());
        hashMap.put("data", jSONObject2.toString());
        return hashMap;
    }

    @Override // com.netease.nis.basesdk.crash.BaseJavaCrashHandler
    protected boolean interceptHandleException(Throwable th) {
        String stackTraceString = Log.getStackTraceString(th);
        return (stackTraceString == null || stackTraceString.contains("com.netease.nis.quicklogin.")) ? false : true;
    }

    private b() {
    }

    private String a(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (defaultSharedPreferences.contains(k1.f9761p)) {
            return defaultSharedPreferences.getString(k1.f9761p, "");
        }
        String uuid = UUID.randomUUID().toString();
        defaultSharedPreferences.edit().putString(k1.f9761p, uuid).apply();
        return uuid;
    }
}
