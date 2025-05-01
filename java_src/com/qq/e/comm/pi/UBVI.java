package com.qq.e.comm.pi;

import com.qq.e.ads.rewardvideo.ServerSideVerificationOptions;
import com.qq.e.comm.constants.LoadAdParams;
/* loaded from: classes5.dex */
public interface UBVI extends LADI {
    void destroy();

    void fetchAd();

    String getAdNetWorkName();

    void onWindowFocusChanged(boolean z4);

    void setLoadAdParams(LoadAdParams loadAdParams);

    void setRefresh(int i4);

    void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions);
}
