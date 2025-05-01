package com.qq.e.comm.pi;

import com.qq.e.ads.cfg.VideoOption;
import com.qq.e.ads.rewardvideo.ServerSideVerificationOptions;
import com.qq.e.comm.constants.LoadAdParams;
/* loaded from: classes5.dex */
public interface NEADI {
    String getAdNetWorkName();

    void loadAd(int i4);

    void loadAd(int i4, LoadAdParams loadAdParams);

    void setMaxVideoDuration(int i4);

    void setMinVideoDuration(int i4);

    void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions);

    void setVideoOption(VideoOption videoOption);
}
