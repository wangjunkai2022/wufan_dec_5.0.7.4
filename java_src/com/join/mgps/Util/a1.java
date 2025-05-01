package com.join.mgps.Util;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.download.api.constant.BaseConstants;
/* compiled from: MarketUtil.java */
/* loaded from: classes3.dex */
public class a1 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f27654a = "MarketUtil";

    public static String a(Context context, Intent intent) {
        if (intent == null || intent.getData() == null) {
            return "";
        }
        try {
            Uri data = intent.getData();
            String scheme = data.getScheme();
            String host = data.getHost();
            String queryParameter = data.getQueryParameter("id");
            StringBuilder sb = new StringBuilder();
            sb.append(((("" + data.getScheme()) + "//:") + data.getHost()) + "?id=");
            sb.append(data.getQueryParameter("id"));
            return (TextUtils.isEmpty(scheme) || !scheme.equals("market") || TextUtils.isEmpty(host) || !host.equals(BaseConstants.MARKET_URI_AUTHORITY_DETAIL)) ? "" : !TextUtils.isEmpty(queryParameter) ? queryParameter : "";
        } catch (Exception e5) {
            e5.printStackTrace();
            return "";
        }
    }

    public static void c(Context context, String str) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)));
        } catch (ActivityNotFoundException e5) {
            e5.printStackTrace();
        }
    }

    public static void d(Context context, String str) {
        Uri parse = Uri.parse("http://www.samsungapps.com/appquery/appDetail.as?appId=" + str);
        Intent intent = new Intent();
        intent.setClassName("com.sec.android.app.samsungapps", "com.sec.android.app.samsungapps.Main");
        intent.setData(parse);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e5) {
            e5.printStackTrace();
        }
    }

    public static void e(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str));
        try {
            intent.setClassName("com.tencent.android.qqdownloader", "com.tencent.pangu.link.LinkProxyActivity");
            context.startActivity(intent);
        } catch (ActivityNotFoundException e5) {
            e5.printStackTrace();
        }
    }

    void b(Context context, String str) {
        Intent intent = new Intent();
        intent.setClassName("com.letv.app.appstore", "com.letv.app.appstore.appmodule.details.DetailsActivity");
        intent.setAction("com.letv.app.appstore.appdetailactivity");
        intent.putExtra("packageName", str);
        context.startActivity(intent);
    }
}
