package com.kwad.components.offline.api.core.adlive;

import com.kwad.components.offline.api.core.adlive.listener.AdLiveCallerContextListener;
import com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener;
import com.kwad.components.offline.api.core.adlive.listener.OnAdLiveResumeInterceptor;
import com.kwad.components.offline.api.core.adlive.model.LiveShopItemInfo;
/* loaded from: classes5.dex */
public interface IAdLivePlayModule {
    void addInterceptor(OnAdLiveResumeInterceptor onAdLiveResumeInterceptor);

    LiveShopItemInfo getCurrentShowShopItemInfo();

    long getPlayDuration();

    void onDestroy();

    void onPause();

    void onResume();

    void pause();

    void registerAdLiveCallerContextListener(AdLiveCallerContextListener adLiveCallerContextListener);

    void registerAdLivePlayStateListener(AdLivePlayStateListener adLivePlayStateListener);

    void release();

    void removeInterceptor(OnAdLiveResumeInterceptor onAdLiveResumeInterceptor);

    void resume();

    void setAudioEnabled(boolean z4, boolean z5);

    void setForceGetAudioFocus(boolean z4);

    void skipToEnd();

    void unRegisterAdLiveCallerContextListener(AdLiveCallerContextListener adLiveCallerContextListener);

    void unRegisterAdLivePlayStateListener(AdLivePlayStateListener adLivePlayStateListener);
}
