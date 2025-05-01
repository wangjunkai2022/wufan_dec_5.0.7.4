package com.switfpass.pay;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.switfpass.pay.utils.e;
/* loaded from: classes.dex */
public class MainApplication extends Application {

    /* renamed from: j  reason: collision with root package name */
    protected static MainApplication f61499j;

    /* renamed from: c  reason: collision with root package name */
    public static String f61492c = String.valueOf("https://pay.swiftpass.cn/") + "pay/unifiedsdkpay";

    /* renamed from: d  reason: collision with root package name */
    public static String f61493d = "https://statecheck.swiftpass.cn";

    /* renamed from: b  reason: collision with root package name */
    private static String f61491b = "https://pay.swiftpass.cn/";

    /* renamed from: e  reason: collision with root package name */
    public static String f61494e = String.valueOf(f61491b) + "pay/gateway";

    /* renamed from: f  reason: collision with root package name */
    public static String f61495f = String.valueOf(f61491b) + "pay/unifiedsdkpay";

    /* renamed from: g  reason: collision with root package name */
    public static String f61496g = String.valueOf(f61491b) + "pay/unifiedCheck";

    /* renamed from: h  reason: collision with root package name */
    public static String f61497h = String.valueOf(f61491b) + "pay/qqpay?token_id=";

    /* renamed from: i  reason: collision with root package name */
    public static String f61498i = "http://huangjun.dev.swiftpass.cn/";

    /* renamed from: k  reason: collision with root package name */
    public static String f61500k = "pay.tenpay.native";

    /* renamed from: l  reason: collision with root package name */
    public static String f61501l = "pay.weixin.native";

    /* renamed from: m  reason: collision with root package name */
    public static String f61502m = "pay.weixin.app";

    /* renamed from: n  reason: collision with root package name */
    public static String f61503n = "pay.alipay.native";

    /* renamed from: o  reason: collision with root package name */
    public static String f61504o = "pay.alipay.nativev2";

    /* renamed from: p  reason: collision with root package name */
    public static String f61505p = "pay.alipay.app";

    /* renamed from: q  reason: collision with root package name */
    public static String f61506q = "pay.qq.proxy.micropay";

    /* renamed from: r  reason: collision with root package name */
    public static String f61507r = "pay.qq.micropay";

    /* renamed from: s  reason: collision with root package name */
    public static String f61508s = "pay.weixin.micropay";

    /* renamed from: t  reason: collision with root package name */
    public static String f61509t = "pay.alipay.micropay";

    /* renamed from: u  reason: collision with root package name */
    public static String f61510u = "pay.tenpay.wappay";

    /* renamed from: v  reason: collision with root package name */
    public static String f61511v = "pay.weixin.wappay";

    /* renamed from: w  reason: collision with root package name */
    public static String f61512w = "pay.alipay.wappay";

    /* renamed from: x  reason: collision with root package name */
    public static String f61513x = "pay.alipay.native.towap";

    /* renamed from: y  reason: collision with root package name */
    public static String f61514y = e.f61875p;

    /* renamed from: z  reason: collision with root package name */
    public static String f61515z = "";
    public static String A = "";
    public static String B = "";
    public static String C = "";

    public MainApplication() {
        f61499j = this;
    }

    public static boolean a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting() && activeNetworkInfo.isConnected();
    }

    public static MainApplication getContext() {
        return f61499j;
    }
}
