package com.netease.nis.basesdk.crash;

import android.text.TextUtils;
import com.netease.nis.basesdk.HttpUtil;
import com.netease.nis.basesdk.Logger;
import java.io.UnsupportedEncodingException;
import java.util.Map;
/* loaded from: classes5.dex */
public class CrashReportRunnable implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final String f57362a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f57363b;

    /* renamed from: c  reason: collision with root package name */
    private final HttpUtil.ResponseCallBack f57364c;

    /* loaded from: classes5.dex */
    class a implements HttpUtil.ResponseCallBack {
        a() {
        }

        @Override // com.netease.nis.basesdk.HttpUtil.ResponseCallBack
        public void onError(int i4, String str) {
            CrashReportRunnable.this.f57364c.onError(i4, str);
        }

        @Override // com.netease.nis.basesdk.HttpUtil.ResponseCallBack
        public void onSuccess(String str) {
            CrashReportRunnable.this.f57364c.onSuccess(str);
        }
    }

    public CrashReportRunnable(Map<String, String> map, String str, HttpUtil.ResponseCallBack responseCallBack) {
        this.f57363b = map;
        this.f57362a = str;
        this.f57364c = responseCallBack;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (TextUtils.isEmpty(this.f57362a) || this.f57363b == null || this.f57364c == null || Thread.currentThread().isInterrupted()) {
            return;
        }
        try {
            HttpUtil.doHttpRequest(this.f57362a, true, false, HttpUtil.map2Form(this.f57363b, "utf-8"), null, null, new a());
        } catch (UnsupportedEncodingException e5) {
            Logger.e("EncodingException" + e5.getMessage());
        }
    }
}
