package com.aggmoread.sdk.client.feedlist;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.aggmoread.sdk.client.AMAdInterface;
import com.aggmoread.sdk.client.AMAdMediaListener;
import com.aggmoread.sdk.client.AMAdMediaView;
import com.aggmoread.sdk.client.AMAppInfo;
import java.util.List;
/* loaded from: classes2.dex */
public interface AMNativeAd extends AMAdInterface {
    View bindAdToView(@NonNull Context context, @NonNull View view, FrameLayout.LayoutParams layoutParams, List<View> list, View view2, @NonNull AMNativeInteractionListener aMNativeInteractionListener);

    void bindMediaAdToView(@NonNull AMAdMediaView aMAdMediaView, AMAdMediaListener aMAdMediaListener);

    @Override // com.aggmoread.sdk.client.AMAdInterface
    void destroy();

    int getAdPatternType();

    AMAppInfo getAppInfo();

    double getAppPrice();

    int getAppScore();

    int getAppStatus();

    String getDesc();

    long getDownloadCount();

    String getIconUrl();

    String getImageUrl();

    List<String> getImageUrlList();

    int getPictureHeight();

    int getPictureWidth();

    int getProgress();

    String getTitle();

    int getVideoCurrentPosition();

    int getVideoDuration();

    boolean isAppAd();

    boolean isVideoAd();

    void pauseVideo();

    void resume();

    void resumeVideo();

    void setVideoMute(boolean z4);

    void startVideo();

    void stopVideo();
}
