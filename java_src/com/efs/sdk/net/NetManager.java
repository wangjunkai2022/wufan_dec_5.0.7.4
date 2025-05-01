package com.efs.sdk.net;

import android.content.Context;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.util.Log;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.Map;
import m.a;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
/* loaded from: classes2.dex */
public class NetManager {
    private static final String TAG = "OkHttpManager";
    private static NetConfigManager mNetConfigManager;
    private static EfsReporter mReporter;

    public static void get(String str, Callback callback) {
        new OkHttpClient.Builder().eventListenerFactory(OkHttpListener.get()).addNetworkInterceptor(new OkHttpInterceptor()).build().newCall(new Request.Builder().url(str).build()).enqueue(callback);
    }

    public static NetConfigManager getNetConfigManager() {
        return mNetConfigManager;
    }

    public static EfsReporter getReporter() {
        return mReporter;
    }

    public static void init(Context context, EfsReporter efsReporter) {
        if (context != null && efsReporter != null) {
            mReporter = efsReporter;
            mNetConfigManager = new NetConfigManager(context, efsReporter);
            return;
        }
        Log.e(TAG, "init net manager error! parameter is null!");
    }

    public static void post(String str, Map<String, Object> map, Callback callback) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : map.keySet()) {
            sb.append(str2);
            sb.append(SimpleComparison.EQUAL_TO_OPERATION);
            sb.append(map.get(str2));
            sb.append(a.f71490d);
        }
        new OkHttpClient.Builder().eventListenerFactory(OkHttpListener.get()).addNetworkInterceptor(new OkHttpInterceptor()).build().newCall(new Request.Builder().url(str).post(RequestBody.create(MediaType.parse("application/x-www-form-urlencoded"), sb.toString())).build()).enqueue(callback);
    }

    public static void postJson(String str, String str2, Callback callback) {
        new OkHttpClient.Builder().eventListenerFactory(OkHttpListener.get()).addNetworkInterceptor(new OkHttpInterceptor()).build().newCall(new Request.Builder().url(str).post(RequestBody.create(str2, MediaType.parse("application/json;charset=utf-8"))).build()).enqueue(callback);
    }
}
