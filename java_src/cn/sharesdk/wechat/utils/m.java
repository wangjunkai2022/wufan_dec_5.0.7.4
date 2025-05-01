package cn.sharesdk.wechat.utils;

import android.os.Bundle;
/* compiled from: WechatReq.java */
/* loaded from: classes2.dex */
public abstract class m {

    /* renamed from: e  reason: collision with root package name */
    public String f1414e;

    /* renamed from: f  reason: collision with root package name */
    public String f1415f;

    public abstract int a();

    public void a(Bundle bundle) {
        this.f1414e = n.a(bundle, "_wxapi_basereq_transaction");
        this.f1415f = n.a(bundle, "_wxapi_basereq_openid");
    }

    public void b(Bundle bundle) {
        bundle.putInt("_wxapi_command_type", a());
        bundle.putString("_wxapi_basereq_transaction", this.f1414e);
        bundle.putString("_wxapi_basereq_openid", this.f1415f);
    }

    public abstract boolean b();
}
