package com.netease.nis.basesdk.crash;

import android.text.TextUtils;
import com.netease.nis.basesdk.HttpUtil;
import java.util.Map;
/* loaded from: classes5.dex */
public class StartReportRunnable implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final String f57368a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f57369b;

    /* renamed from: c  reason: collision with root package name */
    private final HttpUtil.ResponseCallBack f57370c;

    /* loaded from: classes5.dex */
    class a implements HttpUtil.ResponseCallBack {
        a() {
        }

        @Override // com.netease.nis.basesdk.HttpUtil.ResponseCallBack
        public void onError(int i4, String str) {
            StartReportRunnable.this.f57370c.onError(i4, str);
        }

        @Override // com.netease.nis.basesdk.HttpUtil.ResponseCallBack
        public void onSuccess(String str) {
            StartReportRunnable.this.f57370c.onSuccess(str);
        }
    }

    public StartReportRunnable(Map<String, String> map, String str, HttpUtil.ResponseCallBack responseCallBack) {
        this.f57369b = map;
        this.f57368a = str;
        this.f57370c = responseCallBack;
    }

    @Override // java.lang.Runnable
    public void run() {
        Map<String, String> map;
        if (TextUtils.isEmpty(this.f57368a) || (map = this.f57369b) == null || this.f57370c == null) {
            return;
        }
        HttpUtil.doPostRequestByForm(this.f57368a, map, null, new a());
    }
}
