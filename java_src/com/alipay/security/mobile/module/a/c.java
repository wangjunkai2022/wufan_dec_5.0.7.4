package com.alipay.security.mobile.module.a;

import com.alipay.tscenter.biz.rpc.vkeydfp.request.DeviceDataReportRequest;
import com.alipay.tscenter.biz.rpc.vkeydfp.result.DeviceDataReportResult;
/* loaded from: classes2.dex */
final class c implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DeviceDataReportRequest f4988b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ b f4989c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(b bVar, DeviceDataReportRequest deviceDataReportRequest) {
        this.f4989c = bVar;
        this.f4988b = deviceDataReportRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DeviceDataReportResult deviceDataReportResult;
        DeviceDataReportResult deviceDataReportResult2;
        v.b bVar;
        try {
            bVar = this.f4989c.f4986d;
            DeviceDataReportResult unused = b.f4982g = bVar.b(this.f4988b);
        } catch (Throwable th) {
            DeviceDataReportResult unused2 = b.f4982g = new DeviceDataReportResult();
            deviceDataReportResult = b.f4982g;
            deviceDataReportResult.f5049b = false;
            deviceDataReportResult2 = b.f4982g;
            deviceDataReportResult2.f5050c = "static data rpc upload error, " + com.alipay.security.mobile.module.commonutils.d.e(th);
            com.alipay.security.mobile.module.commonutils.d.e(th);
        }
    }
}
