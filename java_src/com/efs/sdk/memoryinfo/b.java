package com.efs.sdk.memoryinfo;

import android.content.Context;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
/* loaded from: classes2.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    final EfsReporter f10499a;

    /* renamed from: b  reason: collision with root package name */
    boolean f10500b = false;
    final Context mContext;

    public b(Context context, EfsReporter efsReporter) {
        this.mContext = context.getApplicationContext();
        this.f10499a = efsReporter;
    }

    static /* synthetic */ void a(b bVar, e eVar, String str) {
        c cVar = new c(bVar.mContext);
        EfsJSONLog efsJSONLog = new EfsJSONLog("memperf");
        efsJSONLog.put("w_pgid", str);
        efsJSONLog.put("crver", "0.0.4.umeng");
        efsJSONLog.put("k_st", cVar.bg);
        efsJSONLog.put("w_url", cVar.activity);
        efsJSONLog.put("wl_tpss", Long.valueOf(cVar.f10515n));
        efsJSONLog.put("wl_jpss", Long.valueOf(cVar.f10516o));
        efsJSONLog.put("wl_npss", Long.valueOf(cVar.f10517p));
        efsJSONLog.put("wl_heap", Long.valueOf(cVar.f10518q));
        efsJSONLog.put("wf_heap_used_rate", Float.valueOf(cVar.f10519r));
        efsJSONLog.put("wl_graphics", Long.valueOf(cVar.f10520s));
        efsJSONLog.put("wl_vmsize", Long.valueOf(cVar.f10521t));
        synchronized (e.class) {
            if (eVar.C) {
                eVar.a(efsJSONLog);
            } else {
                eVar.B.add(efsJSONLog);
            }
        }
    }
}
