package com.aggmoread.sdk.client;
/* loaded from: classes2.dex */
public interface AMAdInterface {
    void destroy();

    AMAdExtras getAdExtras();

    String getID();

    void notifyBidFail(int i4, int i5, String str);

    void notifyBidSuccess(int i4);

    void setDownloadConfirmListener(AMAdDownloadConfirmListener aMAdDownloadConfirmListener);
}
