package cn.sharesdk.wechat.utils;

import android.os.Bundle;
import cn.sharesdk.framework.utils.SSDKLog;
/* compiled from: AuthReq.java */
/* loaded from: classes2.dex */
public class b extends m {

    /* renamed from: a  reason: collision with root package name */
    public String f1308a;

    /* renamed from: b  reason: collision with root package name */
    public String f1309b;

    /* renamed from: c  reason: collision with root package name */
    public String f1310c;

    /* renamed from: d  reason: collision with root package name */
    public a f1311d;

    @Override // cn.sharesdk.wechat.utils.m
    public int a() {
        return 1;
    }

    @Override // cn.sharesdk.wechat.utils.m
    public void a(Bundle bundle) {
        super.a(bundle);
        this.f1308a = bundle.getString("_wxapi_sendauth_req_scope");
        this.f1309b = bundle.getString("_wxapi_sendauth_req_state");
        this.f1310c = bundle.getString("_wxapi_sendauth_req_ext_data");
        a aVar = new a();
        this.f1311d = aVar;
        aVar.b(bundle);
    }

    @Override // cn.sharesdk.wechat.utils.m
    public void b(Bundle bundle) {
        super.b(bundle);
        bundle.putString("_wxapi_sendauth_req_scope", this.f1308a);
        bundle.putString("_wxapi_sendauth_req_state", this.f1309b);
        bundle.putString("_wxapi_sendauth_req_ext_data", this.f1310c);
        a aVar = this.f1311d;
        if (aVar != null) {
            aVar.a(bundle);
        }
    }

    @Override // cn.sharesdk.wechat.utils.m
    public boolean b() {
        String str = this.f1308a;
        if (str != null && str.length() != 0 && this.f1308a.length() <= 1024) {
            String str2 = this.f1309b;
            if (str2 == null || str2.length() <= 1024) {
                return true;
            }
            SSDKLog.b().a("MicroMsg.SDK.SendAuth.Req", "checkArgs fail, state is invalid");
            return false;
        }
        SSDKLog.b().a("MicroMsg.SDK.SendAuth.Req", "checkArgs fail, scope is invalid");
        return false;
    }
}
