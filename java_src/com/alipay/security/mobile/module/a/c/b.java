package com.alipay.security.mobile.module.a.c;

import android.content.Context;
import com.alipay.tscenter.biz.rpc.vkeydfp.request.DeviceDataReportRequest;
import com.alipay.tscenter.biz.rpc.vkeydfp.result.AppListResult;
import com.alipay.tscenter.biz.rpc.vkeydfp.result.DeviceDataReportResult;
import java.util.HashMap;
import java.util.Map;
import o.c;
import o.d;
/* loaded from: classes2.dex */
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private static a f4990a;

    /* renamed from: b  reason: collision with root package name */
    private static com.alipay.security.mobile.module.a.a f4991b;

    public static a b(Context context) {
        if (context == null) {
            return null;
        }
        if (f4990a == null) {
            f4991b = com.alipay.security.mobile.module.a.b.b(context);
            f4990a = new b();
        }
        return f4990a;
    }

    @Override // com.alipay.security.mobile.module.a.c.a
    public final o.a a(String str, String str2, String str3, String str4) {
        AppListResult a5 = f4991b.a(str, str2, str3, str4);
        if (a5 == null) {
            return null;
        }
        o.a aVar = new o.a(a5.f5048e, a5.f5047d);
        aVar.f71970a = a5.f5049b;
        aVar.f71971b = a5.f5050c;
        return aVar;
    }

    @Override // com.alipay.security.mobile.module.a.c.a
    public final c a(d dVar) {
        DeviceDataReportRequest deviceDataReportRequest = new DeviceDataReportRequest();
        deviceDataReportRequest.f5037b = com.alipay.security.mobile.module.commonutils.a.f(dVar.f71979a);
        deviceDataReportRequest.f5038c = com.alipay.security.mobile.module.commonutils.a.f(dVar.f71980b);
        deviceDataReportRequest.f5039d = com.alipay.security.mobile.module.commonutils.a.f(dVar.f71981c);
        deviceDataReportRequest.f5040e = com.alipay.security.mobile.module.commonutils.a.f(dVar.f71982d);
        deviceDataReportRequest.f5041f = com.alipay.security.mobile.module.commonutils.a.f(dVar.f71983e);
        deviceDataReportRequest.f5042g = com.alipay.security.mobile.module.commonutils.a.f(dVar.f71984f);
        deviceDataReportRequest.f5043h = com.alipay.security.mobile.module.commonutils.a.f(dVar.f71985g);
        deviceDataReportRequest.f5044i = com.alipay.security.mobile.module.commonutils.a.f(dVar.f71986h);
        Map<String, String> map = dVar.f71987i;
        if (map == null) {
            map = new HashMap<>();
        }
        deviceDataReportRequest.f5045j = map;
        DeviceDataReportResult a5 = f4991b.a(deviceDataReportRequest);
        c cVar = new c();
        if (a5 == null) {
            return null;
        }
        cVar.f71970a = a5.f5049b;
        cVar.f71971b = a5.f5050c;
        cVar.f71972c = a5.f5051d;
        cVar.f71973d = a5.f5052e;
        cVar.f71974e = a5.f5053f;
        cVar.f71975f = a5.f5054g;
        cVar.f71976g = a5.f5055h;
        cVar.f71977h = a5.f5056i;
        cVar.f71978i = a5.f5057j;
        return cVar;
    }

    @Override // com.alipay.security.mobile.module.a.c.a
    public final boolean a(String str) {
        return f4991b.a(str);
    }
}
