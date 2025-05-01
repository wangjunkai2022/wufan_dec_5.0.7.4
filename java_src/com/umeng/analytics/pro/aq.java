package com.umeng.analytics.pro;

import com.umeng.commonsdk.service.UMGlobalContext;
import org.json.JSONObject;
/* compiled from: HttpPostThread.java */
/* loaded from: classes6.dex */
public class aq implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static final String f63343a = "https://ucc.umeng.com/v2/inn/fetch";

    /* renamed from: b  reason: collision with root package name */
    private String f63344b;

    /* renamed from: c  reason: collision with root package name */
    private String f63345c;

    /* renamed from: d  reason: collision with root package name */
    private String f63346d;

    public aq(String str, JSONObject jSONObject, String str2) {
        this.f63344b = str;
        this.f63345c = jSONObject.toString();
        this.f63346d = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONObject jSONObject = null;
        try {
            byte[] a5 = ao.a(this.f63344b, this.f63345c);
            if (a5 != null) {
                JSONObject jSONObject2 = new JSONObject(new String(a5));
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("sourceIucc", this.f63346d);
                    jSONObject3.put("config", jSONObject2);
                } catch (Throwable unused) {
                }
                jSONObject = jSONObject3;
            }
        } catch (Throwable unused2) {
        }
        com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 102, com.umeng.ccg.d.a(), jSONObject);
    }
}
