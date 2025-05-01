package com.qq.e.mediation.interfaces;

import java.util.Map;
/* loaded from: classes5.dex */
public interface IBaseAd {
    int getECPM();

    Map<String, Object> getExtraInfo();

    String getReqId();

    void sendLossNotification(int i4, int i5, String str);

    void sendWinNotification(int i4);

    void setBidECPM(int i4);

    void setPayload(String str);
}
