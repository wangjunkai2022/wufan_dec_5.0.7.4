package com.efs.sdk.base.core.a;

import android.content.Context;
import android.text.TextUtils;
import com.efs.sdk.base.BuildConfig;
import com.efs.sdk.base.EfsConstant;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.PackageUtil;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.tencent.stat.DeviceInfo;
import com.umeng.analytics.pro.bm;
import io.netty.handler.codec.rtsp.RtspHeaders;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    String f10271a;

    /* renamed from: b  reason: collision with root package name */
    String f10272b;

    /* renamed from: c  reason: collision with root package name */
    String f10273c;

    /* renamed from: d  reason: collision with root package name */
    public String f10274d;

    /* renamed from: e  reason: collision with root package name */
    public int f10275e;

    /* renamed from: f  reason: collision with root package name */
    public String f10276f;

    /* renamed from: g  reason: collision with root package name */
    public byte f10277g;

    /* renamed from: h  reason: collision with root package name */
    public String f10278h;

    /* renamed from: i  reason: collision with root package name */
    String f10279i;

    /* renamed from: j  reason: collision with root package name */
    String f10280j;

    /* renamed from: k  reason: collision with root package name */
    String f10281k;

    /* renamed from: l  reason: collision with root package name */
    String f10282l;

    /* renamed from: m  reason: collision with root package name */
    public long f10283m = 0;

    public static c a() {
        c cVar = new c();
        cVar.f10271a = ControllerCenter.getGlobalEnvStruct().getAppid();
        cVar.f10272b = ControllerCenter.getGlobalEnvStruct().getSecret();
        cVar.f10282l = ControllerCenter.getGlobalEnvStruct().getUid();
        cVar.f10280j = BuildConfig.VERSION_NAME;
        cVar.f10273c = PackageUtil.getAppVersionName(ControllerCenter.getGlobalEnvStruct().mAppContext);
        cVar.f10279i = String.valueOf(com.efs.sdk.base.core.config.a.c.a().f10353d.f10341a);
        cVar.f10281k = EfsConstant.UM_SDK_VERSION;
        return cVar;
    }

    public final String b() {
        a.a();
        String valueOf = String.valueOf(a.b() / 1000);
        String a5 = com.efs.sdk.base.core.util.b.b.a(com.efs.sdk.base.core.util.b.a.a(this.f10282l + valueOf, this.f10272b));
        TreeMap treeMap = new TreeMap();
        treeMap.put("app", this.f10271a);
        treeMap.put("sd", a5);
        String a6 = a(ControllerCenter.getGlobalEnvStruct().mAppContext);
        if (!TextUtils.isEmpty(a6)) {
            treeMap.put("wl_dd", com.efs.sdk.base.core.util.b.b.a(com.efs.sdk.base.core.util.b.a.a(a6 + "_" + valueOf, this.f10272b)));
        }
        if (!TextUtils.isEmpty(this.f10274d)) {
            treeMap.put(com.alipay.sdk.app.statistic.c.f4730m, this.f10274d);
        }
        if (this.f10277g != 0) {
            treeMap.put("de", String.valueOf(this.f10275e));
            treeMap.put("type", this.f10278h);
            String str = this.f10276f;
            if (TextUtils.isEmpty(str)) {
                a.a();
                long b5 = a.b();
                str = String.format(Locale.SIMPLIFIED_CHINESE, "%d%04d", Long.valueOf(b5), Integer.valueOf(new Random(b5).nextInt(10000)));
            }
            treeMap.put(RtspHeaders.Values.SEQ, str);
        }
        treeMap.put("cver", this.f10279i);
        treeMap.put(bm.f63463x, q.a.f73126a);
        treeMap.put("sver", this.f10279i);
        treeMap.put("tm", valueOf);
        treeMap.put(DeviceInfo.TAG_VERSION, this.f10273c);
        treeMap.put("um_sdk_ver", this.f10281k);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : treeMap.entrySet()) {
            String str2 = ((String) entry.getKey()) + SimpleComparison.EQUAL_TO_OPERATION + ((String) entry.getValue());
            sb2.append(str2);
            sb.append(str2);
            sb.append(m.a.f71490d);
        }
        String a7 = com.efs.sdk.base.core.util.b.b.a(sb2.toString() + this.f10272b);
        sb.append("sign=");
        sb.append(a7);
        Log.d("efs.config", sb.toString());
        return com.efs.sdk.base.core.util.b.b.b(sb.toString());
    }

    private static String a(Context context) {
        Class<?> cls;
        Method method;
        if (context == null) {
            return null;
        }
        try {
            cls = Class.forName("com.umeng.commonsdk.UMConfigure");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                method = cls.getMethod("getUMIDString", Context.class);
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
}
