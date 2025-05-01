package com.join.kotlin.ui.modleregin.modle;

import com.join.mgps.Util.IntentDateBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: VideoModle.kt */
/* loaded from: classes3.dex */
public final class VideoModle {
    @Nullable
    private final IntentDateBean intentData;
    private final int position;
    @NotNull
    private final String videoCover;
    @Nullable
    private final String videoUrl;

    public VideoModle(int i4, @Nullable String str, @Nullable IntentDateBean intentDateBean, @NotNull String videoCover) {
        Intrinsics.checkNotNullParameter(videoCover, "videoCover");
        this.position = i4;
        this.videoUrl = str;
        this.intentData = intentDateBean;
        this.videoCover = videoCover;
    }

    public static /* synthetic */ VideoModle copy$default(VideoModle videoModle, int i4, String str, IntentDateBean intentDateBean, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = videoModle.position;
        }
        if ((i5 & 2) != 0) {
            str = videoModle.videoUrl;
        }
        if ((i5 & 4) != 0) {
            intentDateBean = videoModle.intentData;
        }
        if ((i5 & 8) != 0) {
            str2 = videoModle.videoCover;
        }
        return videoModle.copy(i4, str, intentDateBean, str2);
    }

    public final int component1() {
        return this.position;
    }

    @Nullable
    public final String component2() {
        return this.videoUrl;
    }

    @Nullable
    public final IntentDateBean component3() {
        return this.intentData;
    }

    @NotNull
    public final String component4() {
        return this.videoCover;
    }

    @NotNull
    public final VideoModle copy(int i4, @Nullable String str, @Nullable IntentDateBean intentDateBean, @NotNull String videoCover) {
        Intrinsics.checkNotNullParameter(videoCover, "videoCover");
        return new VideoModle(i4, str, intentDateBean, videoCover);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoModle) {
            VideoModle videoModle = (VideoModle) obj;
            return this.position == videoModle.position && Intrinsics.areEqual(this.videoUrl, videoModle.videoUrl) && Intrinsics.areEqual(this.intentData, videoModle.intentData) && Intrinsics.areEqual(this.videoCover, videoModle.videoCover);
        }
        return false;
    }

    @Nullable
    public final IntentDateBean getIntentData() {
        return this.intentData;
    }

    public final int getPosition() {
        return this.position;
    }

    @NotNull
    public final String getVideoCover() {
        return this.videoCover;
    }

    @Nullable
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public int hashCode() {
        int i4 = this.position * 31;
        String str = this.videoUrl;
        int hashCode = (i4 + (str == null ? 0 : str.hashCode())) * 31;
        IntentDateBean intentDateBean = this.intentData;
        return ((hashCode + (intentDateBean != null ? intentDateBean.hashCode() : 0)) * 31) + this.videoCover.hashCode();
    }

    @NotNull
    public String toString() {
        return "VideoModle(position=" + this.position + ", videoUrl=" + this.videoUrl + ", intentData=" + this.intentData + ", videoCover=" + this.videoCover + ')';
    }
}
