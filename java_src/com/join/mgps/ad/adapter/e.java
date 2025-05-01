package com.join.mgps.ad.adapter;

import android.content.Context;
import android.graphics.Point;
import com.bytedance.sdk.openadsdk.TTAdConfig;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.join.mgps.activity.login.AbScreenUtils;
/* compiled from: TTInit.java */
/* loaded from: classes4.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f39666a = "TTInit";

    /* renamed from: b  reason: collision with root package name */
    public static boolean f39667b;

    /* renamed from: c  reason: collision with root package name */
    private static Point f39668c;

    /* renamed from: d  reason: collision with root package name */
    private static Point f39669d;

    /* compiled from: TTInit.java */
    /* loaded from: classes4.dex */
    class a implements TTAdSdk.Callback {
        a() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdSdk.InitCallback
        public void fail(int i4, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("fail:  code = ");
            sb.append(i4);
            sb.append(" msg = ");
            sb.append(str);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdSdk.InitCallback
        public void success() {
            StringBuilder sb = new StringBuilder();
            sb.append("success: ");
            sb.append(TTAdSdk.isInitSuccess());
        }
    }

    private static TTAdConfig a(String str) {
        return new TTAdConfig.Builder().appId(str).appName("悟饭游戏厅_android").titleBarTheme(-1).directDownloadNetworkType(4, 3, 5).debug(false).supportMultiProcess(true).useMediation(true).allowShowNotify(true).build();
    }

    public static Point b() {
        return f39668c;
    }

    public static Point c() {
        return f39669d;
    }

    public static void d(Context context, String str, s1.a aVar) {
        if (!f39667b) {
            f39668c = AbScreenUtils.getScreenSize(context, true);
            f39669d = AbScreenUtils.getScreenSize(context, false);
            TTAdSdk.init(context, a(str));
            TTAdSdk.start(new a());
            f39667b = true;
        }
        if (aVar != null) {
            aVar.a();
        }
    }
}
