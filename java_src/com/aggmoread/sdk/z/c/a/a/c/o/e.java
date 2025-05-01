package com.aggmoread.sdk.z.c.a.a.c.o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import java.util.List;
/* loaded from: classes2.dex */
public interface e extends com.aggmoread.sdk.z.c.a.a.c.a {

    /* loaded from: classes2.dex */
    public interface a extends com.aggmoread.sdk.z.c.a.a.c.f {
        void onAdClicked();

        void onAdExposed();
    }

    /* loaded from: classes2.dex */
    public interface b extends a {
        void onADStatusChanged(int i4);

        void onLoadApkProgress(int i4);
    }

    View a(@NonNull Context context, @NonNull View view, FrameLayout.LayoutParams layoutParams, List<View> list, View view2, @NonNull a aVar);

    void a(@NonNull ViewGroup viewGroup, com.aggmoread.sdk.z.c.a.a.c.t.a aVar);

    void destroy();

    int f();

    com.aggmoread.sdk.z.c.a.a.c.c g();

    int getAdPatternType();

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

    boolean isAppAd();

    boolean isVideoAd();

    void pauseVideo();

    void resume();

    void resumeVideo();

    void setVideoMute(boolean z4);

    void startVideo();

    void stopVideo();
}
