package com.join.kotlin.discount.model.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailPicAndVideoInfoBean.kt */
/* loaded from: classes3.dex */
public final class GameDetailPicAndVideoInfoBean {
    @Nullable
    private Integer pic_position;
    @Nullable
    private List<String> pics;
    @Nullable
    private String top_pic;
    @Nullable
    private String video_cover;
    @Nullable
    private String video_url;

    public GameDetailPicAndVideoInfoBean() {
        this(null, null, null, null, null, 31, null);
    }

    public GameDetailPicAndVideoInfoBean(@Nullable List<String> list, @Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.pics = list;
        this.pic_position = num;
        this.top_pic = str;
        this.video_cover = str2;
        this.video_url = str3;
    }

    public static /* synthetic */ GameDetailPicAndVideoInfoBean copy$default(GameDetailPicAndVideoInfoBean gameDetailPicAndVideoInfoBean, List list, Integer num, String str, String str2, String str3, int i4, Object obj) {
        List<String> list2 = list;
        if ((i4 & 1) != 0) {
            list2 = gameDetailPicAndVideoInfoBean.pics;
        }
        if ((i4 & 2) != 0) {
            num = gameDetailPicAndVideoInfoBean.pic_position;
        }
        Integer num2 = num;
        if ((i4 & 4) != 0) {
            str = gameDetailPicAndVideoInfoBean.top_pic;
        }
        String str4 = str;
        if ((i4 & 8) != 0) {
            str2 = gameDetailPicAndVideoInfoBean.video_cover;
        }
        String str5 = str2;
        if ((i4 & 16) != 0) {
            str3 = gameDetailPicAndVideoInfoBean.video_url;
        }
        return gameDetailPicAndVideoInfoBean.copy(list2, num2, str4, str5, str3);
    }

    @Nullable
    public final List<String> component1() {
        return this.pics;
    }

    @Nullable
    public final Integer component2() {
        return this.pic_position;
    }

    @Nullable
    public final String component3() {
        return this.top_pic;
    }

    @Nullable
    public final String component4() {
        return this.video_cover;
    }

    @Nullable
    public final String component5() {
        return this.video_url;
    }

    @NotNull
    public final GameDetailPicAndVideoInfoBean copy(@Nullable List<String> list, @Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new GameDetailPicAndVideoInfoBean(list, num, str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GameDetailPicAndVideoInfoBean) {
            GameDetailPicAndVideoInfoBean gameDetailPicAndVideoInfoBean = (GameDetailPicAndVideoInfoBean) obj;
            return Intrinsics.areEqual(this.pics, gameDetailPicAndVideoInfoBean.pics) && Intrinsics.areEqual(this.pic_position, gameDetailPicAndVideoInfoBean.pic_position) && Intrinsics.areEqual(this.top_pic, gameDetailPicAndVideoInfoBean.top_pic) && Intrinsics.areEqual(this.video_cover, gameDetailPicAndVideoInfoBean.video_cover) && Intrinsics.areEqual(this.video_url, gameDetailPicAndVideoInfoBean.video_url);
        }
        return false;
    }

    @Nullable
    public final Integer getPic_position() {
        return this.pic_position;
    }

    @Nullable
    public final List<String> getPics() {
        return this.pics;
    }

    @Nullable
    public final String getTop_pic() {
        return this.top_pic;
    }

    @Nullable
    public final String getVideo_cover() {
        return this.video_cover;
    }

    @Nullable
    public final String getVideo_url() {
        return this.video_url;
    }

    public int hashCode() {
        List<String> list = this.pics;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.pic_position;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.top_pic;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.video_cover;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.video_url;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setPic_position(@Nullable Integer num) {
        this.pic_position = num;
    }

    public final void setPics(@Nullable List<String> list) {
        this.pics = list;
    }

    public final void setTop_pic(@Nullable String str) {
        this.top_pic = str;
    }

    public final void setVideo_cover(@Nullable String str) {
        this.video_cover = str;
    }

    public final void setVideo_url(@Nullable String str) {
        this.video_url = str;
    }

    @NotNull
    public String toString() {
        return "GameDetailPicAndVideoInfoBean(pics=" + this.pics + ", pic_position=" + this.pic_position + ", top_pic=" + this.top_pic + ", video_cover=" + this.video_cover + ", video_url=" + this.video_url + ')';
    }

    public /* synthetic */ GameDetailPicAndVideoInfoBean(List list, Integer num, String str, String str2, String str3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : list, (i4 & 2) != 0 ? 0 : num, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? "" : str2, (i4 & 16) == 0 ? str3 : "");
    }
}
