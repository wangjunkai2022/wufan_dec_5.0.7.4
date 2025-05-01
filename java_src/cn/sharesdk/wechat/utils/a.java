package cn.sharesdk.wechat.utils;

import android.os.Bundle;
/* compiled from: AuthOptions.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public String f1306a;

    /* renamed from: b  reason: collision with root package name */
    public int f1307b = -1;

    public void a(Bundle bundle) {
        bundle.putString("_wxapi_sendauth_options_callback_classname", this.f1306a);
        bundle.putInt("_wxapi_sendauth_options_callback_flags", this.f1307b);
    }

    public void b(Bundle bundle) {
        this.f1306a = n.a(bundle, "_wxapi_sendauth_options_callback_classname");
        this.f1307b = n.a(bundle, "_wxapi_sendauth_options_callback_flags", -1);
    }
}
