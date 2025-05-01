package cn.sharesdk.wechat.utils;

import android.os.Bundle;
/* compiled from: AuthResp.java */
/* loaded from: classes2.dex */
public class c extends WechatResp {

    /* renamed from: a  reason: collision with root package name */
    public String f1312a;

    /* renamed from: b  reason: collision with root package name */
    public String f1313b;

    /* renamed from: c  reason: collision with root package name */
    public String f1314c;

    /* renamed from: d  reason: collision with root package name */
    public String f1315d;

    /* renamed from: e  reason: collision with root package name */
    public String f1316e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1317f = false;

    public c(Bundle bundle) {
        a(bundle);
    }

    @Override // cn.sharesdk.wechat.utils.WechatResp
    public int a() {
        return 1;
    }

    @Override // cn.sharesdk.wechat.utils.WechatResp
    public void a(Bundle bundle) {
        super.a(bundle);
        this.f1312a = bundle.getString("_wxapi_sendauth_resp_token");
        this.f1313b = bundle.getString("_wxapi_sendauth_resp_state");
        this.f1314c = bundle.getString("_wxapi_sendauth_resp_url");
        this.f1315d = bundle.getString("_wxapi_sendauth_resp_lang");
        this.f1316e = bundle.getString("_wxapi_sendauth_resp_country");
        this.f1317f = bundle.getBoolean("_wxapi_sendauth_resp_auth_result");
    }

    @Override // cn.sharesdk.wechat.utils.WechatResp
    public void b(Bundle bundle) {
        super.b(bundle);
        bundle.putString("_wxapi_sendauth_resp_token", this.f1312a);
        bundle.putString("_wxapi_sendauth_resp_state", this.f1313b);
        bundle.putString("_wxapi_sendauth_resp_url", this.f1314c);
        bundle.putString("_wxapi_sendauth_resp_lang", this.f1315d);
        bundle.putString("_wxapi_sendauth_resp_country", this.f1316e);
        bundle.putBoolean("_wxapi_sendauth_resp_auth_result", this.f1317f);
    }
}
