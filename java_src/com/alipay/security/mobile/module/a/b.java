package com.alipay.security.mobile.module.a;

import android.content.Context;
import com.alipay.android.phone.mrpc.core.g;
import com.alipay.android.phone.mrpc.core.l;
import com.alipay.android.phone.mrpc.core.v;
import com.alipay.tscenter.biz.rpc.vkeydfp.request.AppListCmdRequest;
import com.alipay.tscenter.biz.rpc.vkeydfp.request.DeviceDataReportRequest;
import com.alipay.tscenter.biz.rpc.vkeydfp.result.AppListResult;
import com.alipay.tscenter.biz.rpc.vkeydfp.result.DeviceDataReportResult;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class b implements a {

    /* renamed from: f  reason: collision with root package name */
    private static b f4981f;

    /* renamed from: g  reason: collision with root package name */
    private static DeviceDataReportResult f4982g;

    /* renamed from: a  reason: collision with root package name */
    private Context f4983a;

    /* renamed from: b  reason: collision with root package name */
    private g f4984b;

    /* renamed from: c  reason: collision with root package name */
    private u.a f4985c;

    /* renamed from: d  reason: collision with root package name */
    private v.b f4986d;

    /* renamed from: e  reason: collision with root package name */
    private v.a f4987e;

    private b(Context context) {
        this.f4983a = null;
        this.f4984b = null;
        this.f4985c = null;
        this.f4986d = null;
        this.f4987e = null;
        this.f4983a = context;
        try {
            l lVar = new l();
            lVar.f4591a = com.alipay.security.mobile.module.a.a.a.a();
            v vVar = new v(context);
            this.f4984b = vVar;
            this.f4985c = (u.a) vVar.a(u.a.class, lVar);
            this.f4986d = (v.b) this.f4984b.a(v.b.class, lVar);
            this.f4987e = (v.a) this.f4984b.a(v.a.class, lVar);
        } catch (Exception e5) {
            com.alipay.security.mobile.module.commonutils.d.c(e5);
        }
    }

    public static synchronized b b(Context context) {
        b bVar;
        synchronized (b.class) {
            if (f4981f == null) {
                f4981f = new b(context);
            }
            bVar = f4981f;
        }
        return bVar;
    }

    @Override // com.alipay.security.mobile.module.a.a
    public final AppListResult a(String str, String str2, String str3, String str4) {
        try {
            AppListCmdRequest appListCmdRequest = new AppListCmdRequest();
            appListCmdRequest.f5032b = str;
            appListCmdRequest.f5034d = str4;
            appListCmdRequest.f5033c = str2;
            appListCmdRequest.f5035e = str3;
            return this.f4987e.a(appListCmdRequest);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.alipay.security.mobile.module.a.a
    public final DeviceDataReportResult a(DeviceDataReportRequest deviceDataReportRequest) {
        if (this.f4986d != null) {
            try {
                f4982g = null;
                new Thread(new c(this, deviceDataReportRequest)).start();
                for (int i4 = 300000; f4982g == null && i4 >= 0; i4 -= 50) {
                    Thread.sleep(50L);
                }
            } catch (Exception e5) {
                com.alipay.security.mobile.module.commonutils.d.c(e5);
            }
        }
        return f4982g;
    }

    @Override // com.alipay.security.mobile.module.a.a
    public final boolean a(String str) {
        u.a aVar;
        if (com.alipay.security.mobile.module.commonutils.a.b(str) || (aVar = this.f4985c) == null) {
            return false;
        }
        String str2 = null;
        try {
            str2 = aVar.a(com.alipay.security.mobile.module.commonutils.a.h(str));
        } catch (Exception unused) {
        }
        if (com.alipay.security.mobile.module.commonutils.a.b(str2)) {
            return false;
        }
        try {
            return ((Boolean) new JSONObject(str2).get("success")).booleanValue();
        } catch (JSONException e5) {
            com.alipay.security.mobile.module.commonutils.d.c(e5);
            return false;
        }
    }
}
