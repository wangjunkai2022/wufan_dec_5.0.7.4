package com.ss.android.downloadlib.addownload.compliance;

import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class n {
    public static void m(String str, long j4) {
        vv(str, null, j4);
    }

    public static void vv(String str, long j4) {
        com.ss.android.downloadlib.addownload.m.o o4 = com.ss.android.downloadlib.addownload.m.u.vv().o(j4);
        if (o4.l()) {
            return;
        }
        o4.f60512p.setRefer(str);
        com.ss.android.downloadlib.i.vv.vv().m("lp_app_dialog_click", o4);
    }

    public static void vv(String str, JSONObject jSONObject, long j4) {
        com.ss.android.downloadlib.i.vv.vv().m(str, jSONObject, com.ss.android.downloadlib.addownload.m.u.vv().o(j4));
    }

    public static void vv(String str, com.ss.android.downloadlib.addownload.m.o oVar) {
        com.ss.android.downloadlib.i.vv.vv().m(str, oVar);
    }

    public static void vv(int i4, com.ss.android.downloadlib.addownload.m.o oVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("error_code", Integer.valueOf(i4));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        com.ss.android.downloadlib.i.vv.vv().m("lp_compliance_error", jSONObject, oVar);
    }

    public static void vv(int i4, long j4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("error_code", Integer.valueOf(i4));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        com.ss.android.downloadlib.i.vv.vv().m("lp_compliance_error", jSONObject, com.ss.android.downloadlib.addownload.m.u.vv().o(j4));
    }
}
