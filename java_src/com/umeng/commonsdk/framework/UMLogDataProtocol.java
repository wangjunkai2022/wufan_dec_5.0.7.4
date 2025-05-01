package com.umeng.commonsdk.framework;

import org.json.JSONObject;
/* loaded from: classes6.dex */
public interface UMLogDataProtocol {

    /* loaded from: classes6.dex */
    public enum UMBusinessType {
        U_APP,
        U_INTERNAL,
        U_ZeroEnv,
        U_Silent
    }

    void removeCacheData(Object obj);

    JSONObject setupReportData(long j4);

    void workEvent(Object obj, int i4);
}
