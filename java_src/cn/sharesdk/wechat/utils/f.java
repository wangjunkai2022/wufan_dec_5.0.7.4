package cn.sharesdk.wechat.utils;

import android.os.Bundle;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.wechat.utils.WXMediaMessage;
/* compiled from: ShowMessageFromWechatResp.java */
/* loaded from: classes2.dex */
public class f extends m {

    /* renamed from: a  reason: collision with root package name */
    public WXMediaMessage f1319a;

    /* renamed from: b  reason: collision with root package name */
    public String f1320b;

    /* renamed from: c  reason: collision with root package name */
    public String f1321c;

    public f(Bundle bundle) {
        a(bundle);
    }

    @Override // cn.sharesdk.wechat.utils.m
    public int a() {
        return 4;
    }

    @Override // cn.sharesdk.wechat.utils.m
    public void a(Bundle bundle) {
        super.a(bundle);
        this.f1320b = bundle.getString("_wxapi_showmessage_req_lang");
        this.f1321c = bundle.getString("_wxapi_showmessage_req_country");
        this.f1319a = WXMediaMessage.a.a(bundle);
    }

    @Override // cn.sharesdk.wechat.utils.m
    public void b(Bundle bundle) {
        Bundle a5 = WXMediaMessage.a.a(this.f1319a);
        super.b(a5);
        bundle.putString("_wxapi_showmessage_req_lang", this.f1320b);
        bundle.putString("_wxapi_showmessage_req_country", this.f1321c);
        bundle.putAll(a5);
    }

    @Override // cn.sharesdk.wechat.utils.m
    public boolean b() {
        WXMediaMessage wXMediaMessage = this.f1319a;
        if (wXMediaMessage == null) {
            SSDKLog.b().a("checkArgs fail, message is null", new Object[0]);
            return false;
        }
        return wXMediaMessage.a();
    }
}
