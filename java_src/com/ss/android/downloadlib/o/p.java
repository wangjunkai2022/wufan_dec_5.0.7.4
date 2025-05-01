package com.ss.android.downloadlib.o;

import android.text.TextUtils;
import android.util.Log;
import com.ss.android.downloadlib.addownload.b;
import com.ss.android.downloadlib.n.jh;
import com.ss.android.socialbase.appdownloader.u.u;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class p implements com.ss.android.download.api.m.vv {

    /* loaded from: classes5.dex */
    private static class vv {
        private static p vv = new p();
    }

    public static p vv() {
        return vv.vv;
    }

    public void m(String str) {
        m(true, str);
    }

    public void m(boolean z4, String str) {
        if (m()) {
            return;
        }
        if (z4) {
            m(new RuntimeException(str));
        }
        JSONObject jSONObject = new JSONObject();
        jh.vv(jSONObject, "msg", str);
        jh.vv(jSONObject, "stack", vv(new Throwable()));
        b.qv();
    }

    @Override // com.ss.android.download.api.m.vv
    public void vv(Throwable th, String str) {
        vv(true, th, str);
    }

    public void vv(boolean z4, Throwable th, String str) {
        if (m()) {
            return;
        }
        if (th == null) {
            th = new Throwable();
        }
        if (z4) {
            m(th);
        }
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            str = th.getMessage();
        }
        jh.vv(jSONObject, "msg", str);
        jh.vv(jSONObject, "stack", Log.getStackTraceString(th));
        b.qv();
    }

    private void m(Throwable th) {
        if (u.m(b.getContext())) {
            throw new com.ss.android.downloadlib.o.vv(th);
        }
    }

    private boolean m() {
        return b.wv().optInt("enable_monitor", 1) != 1;
    }

    public void vv(String str) {
        vv(true, str);
    }

    public void vv(boolean z4, String str) {
        if (m()) {
            return;
        }
        if (z4) {
            m(new RuntimeException(str));
        }
        JSONObject jSONObject = new JSONObject();
        jh.vv(jSONObject, "msg", str);
        jh.vv(jSONObject, "stack", vv(new Throwable()));
        b.qv();
    }

    public static String vv(Throwable th) {
        try {
            return Log.getStackTraceString(th);
        } catch (Exception unused) {
            return null;
        }
    }
}
