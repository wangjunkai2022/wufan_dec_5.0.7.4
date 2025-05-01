package com.join.kotlin.ui.modleregin.modle;

import com.join.mgps.business.CollectionBeanSubBusiness;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: MustplayItemBean.kt */
/* loaded from: classes3.dex */
public final class MustplayItemBean {
    @NotNull
    private final String gameName;
    @Nullable
    private final String game_info_top_video_url;
    @NotNull
    private final CollectionBeanSubBusiness gameinfo;
    @NotNull
    private final String info;
    private final int position;
    @Nullable
    private final Boolean showWhiteBack;
    @NotNull
    private final List<String> tags;
    @Nullable
    private final String tip;
    @NotNull
    private final String videoCover;
    @Nullable
    private final String videoUrl;

    public MustplayItemBean(int i4, @Nullable String str, @NotNull String videoCover, @Nullable String str2, @NotNull List<String> tags, @NotNull String gameName, @NotNull String info, @NotNull CollectionBeanSubBusiness gameinfo, @Nullable String str3, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(videoCover, "videoCover");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(gameName, "gameName");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(gameinfo, "gameinfo");
        this.position = i4;
        this.videoUrl = str;
        this.videoCover = videoCover;
        this.game_info_top_video_url = str2;
        this.tags = tags;
        this.gameName = gameName;
        this.info = info;
        this.gameinfo = gameinfo;
        this.tip = str3;
        this.showWhiteBack = bool;
    }

    public final int component1() {
        return this.position;
    }

    @Nullable
    public final Boolean component10() {
        return this.showWhiteBack;
    }

    @Nullable
    public final String component2() {
        return this.videoUrl;
    }

    @NotNull
    public final String component3() {
        return this.videoCover;
    }

    @Nullable
    public final String component4() {
        return this.game_info_top_video_url;
    }

    @NotNull
    public final List<String> component5() {
        return this.tags;
    }

    @NotNull
    public final String component6() {
        return this.gameName;
    }

    @NotNull
    public final String component7() {
        return this.info;
    }

    @NotNull
    public final CollectionBeanSubBusiness component8() {
        return this.gameinfo;
    }

    @Nullable
    public final String component9() {
        return this.tip;
    }

    @NotNull
    public final MustplayItemBean copy(int i4, @Nullable String str, @NotNull String videoCover, @Nullable String str2, @NotNull List<String> tags, @NotNull String gameName, @NotNull String info, @NotNull CollectionBeanSubBusiness gameinfo, @Nullable String str3, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(videoCover, "videoCover");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(gameName, "gameName");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(gameinfo, "gameinfo");
        return new MustplayItemBean(i4, str, videoCover, str2, tags, gameName, info, gameinfo, str3, bool);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MustplayItemBean) {
            MustplayItemBean mustplayItemBean = (MustplayItemBean) obj;
            return this.position == mustplayItemBean.position && Intrinsics.areEqual(this.videoUrl, mustplayItemBean.videoUrl) && Intrinsics.areEqual(this.videoCover, mustplayItemBean.videoCover) && Intrinsics.areEqual(this.game_info_top_video_url, mustplayItemBean.game_info_top_video_url) && Intrinsics.areEqual(this.tags, mustplayItemBean.tags) && Intrinsics.areEqual(this.gameName, mustplayItemBean.gameName) && Intrinsics.areEqual(this.info, mustplayItemBean.info) && Intrinsics.areEqual(this.gameinfo, mustplayItemBean.gameinfo) && Intrinsics.areEqual(this.tip, mustplayItemBean.tip) && Intrinsics.areEqual(this.showWhiteBack, mustplayItemBean.showWhiteBack);
        }
        return false;
    }

    @NotNull
    public final String getGameName() {
        return this.gameName;
    }

    @Nullable
    public final String getGame_info_top_video_url() {
        return this.game_info_top_video_url;
    }

    @NotNull
    public final CollectionBeanSubBusiness getGameinfo() {
        return this.gameinfo;
    }

    @NotNull
    public final String getInfo() {
        return this.info;
    }

    public final int getPosition() {
        return this.position;
    }

    @Nullable
    public final Boolean getShowWhiteBack() {
        return this.showWhiteBack;
    }

    @NotNull
    public final List<String> getTags() {
        return this.tags;
    }

    @Nullable
    public final String getTip() {
        return this.tip;
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
        int hashCode = (((i4 + (str == null ? 0 : str.hashCode())) * 31) + this.videoCover.hashCode()) * 31;
        String str2 = this.game_info_top_video_url;
        int hashCode2 = (((((((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.tags.hashCode()) * 31) + this.gameName.hashCode()) * 31) + this.info.hashCode()) * 31) + this.gameinfo.hashCode()) * 31;
        String str3 = this.tip;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.showWhiteBack;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MustplayItemBean(position=" + this.position + ", videoUrl=" + this.videoUrl + ", videoCover=" + this.videoCover + ", game_info_top_video_url=" + this.game_info_top_video_url + ", tags=" + this.tags + ", gameName=" + this.gameName + ", info=" + this.info + ", gameinfo=" + this.gameinfo + ", tip=" + this.tip + ", showWhiteBack=" + this.showWhiteBack + ')';
    }

    public /* synthetic */ MustplayItemBean(int i4, String str, String str2, String str3, List list, String str4, String str5, CollectionBeanSubBusiness collectionBeanSubBusiness, String str6, Boolean bool, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, str, str2, str3, list, str4, str5, collectionBeanSubBusiness, (i5 & 256) != 0 ? "" : str6, (i5 & 512) != 0 ? Boolean.FALSE : bool);
    }
}
