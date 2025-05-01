package com.umeng.analytics.pro;

import android.text.TextUtils;
import org.json.JSONObject;
/* compiled from: HttpPostDataThread.java */
/* loaded from: classes6.dex */
public class ap implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static final String f63340a = "https://aspect-upush.umeng.com/occa/v1/event/report";

    /* renamed from: b  reason: collision with root package name */
    private String f63341b;

    /* renamed from: c  reason: collision with root package name */
    private String f63342c;

    public ap(String str, JSONObject jSONObject) {
        this.f63341b = str;
        this.f63342c = jSONObject.toString();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (TextUtils.isEmpty(this.f63342c)) {
                return;
            }
            ao.b(this.f63341b, this.f63342c.getBytes());
        } catch (Throwable unused) {
        }
    }
}
