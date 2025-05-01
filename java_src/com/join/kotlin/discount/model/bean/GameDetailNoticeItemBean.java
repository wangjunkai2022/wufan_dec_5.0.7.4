package com.join.kotlin.discount.model.bean;

import com.papa91.arc.ext.Log;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailNoticeItemBean.kt */
/* loaded from: classes3.dex */
public final class GameDetailNoticeItemBean {
    @Nullable
    private final String content;
    @Nullable
    private final String icon;
    @Nullable
    private final String id;
    @Nullable
    private final String jumpDetailUrl;
    @Nullable
    private final String jumpUrl;
    @Nullable
    private final Integer noticeCount;
    @Nullable
    private final String releaseTime;
    @Nullable
    private final String tag;
    @Nullable
    private final String tagBg;
    @Nullable
    private final String title;

    public GameDetailNoticeItemBean() {
        this(null, null, null, null, null, null, null, null, null, null, Log.LogWrapper.MAX_MSG_LEN, null);
    }

    public GameDetailNoticeItemBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.content = str;
        this.icon = str2;
        this.jumpDetailUrl = str3;
        this.jumpUrl = str4;
        this.noticeCount = num;
        this.releaseTime = str5;
        this.tag = str6;
        this.tagBg = str7;
        this.title = str8;
        this.id = str9;
    }

    @Nullable
    public final String component1() {
        return this.content;
    }

    @Nullable
    public final String component10() {
        return this.id;
    }

    @Nullable
    public final String component2() {
        return this.icon;
    }

    @Nullable
    public final String component3() {
        return this.jumpDetailUrl;
    }

    @Nullable
    public final String component4() {
        return this.jumpUrl;
    }

    @Nullable
    public final Integer component5() {
        return this.noticeCount;
    }

    @Nullable
    public final String component6() {
        return this.releaseTime;
    }

    @Nullable
    public final String component7() {
        return this.tag;
    }

    @Nullable
    public final String component8() {
        return this.tagBg;
    }

    @Nullable
    public final String component9() {
        return this.title;
    }

    @NotNull
    public final GameDetailNoticeItemBean copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        return new GameDetailNoticeItemBean(str, str2, str3, str4, num, str5, str6, str7, str8, str9);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GameDetailNoticeItemBean) {
            GameDetailNoticeItemBean gameDetailNoticeItemBean = (GameDetailNoticeItemBean) obj;
            return Intrinsics.areEqual(this.content, gameDetailNoticeItemBean.content) && Intrinsics.areEqual(this.icon, gameDetailNoticeItemBean.icon) && Intrinsics.areEqual(this.jumpDetailUrl, gameDetailNoticeItemBean.jumpDetailUrl) && Intrinsics.areEqual(this.jumpUrl, gameDetailNoticeItemBean.jumpUrl) && Intrinsics.areEqual(this.noticeCount, gameDetailNoticeItemBean.noticeCount) && Intrinsics.areEqual(this.releaseTime, gameDetailNoticeItemBean.releaseTime) && Intrinsics.areEqual(this.tag, gameDetailNoticeItemBean.tag) && Intrinsics.areEqual(this.tagBg, gameDetailNoticeItemBean.tagBg) && Intrinsics.areEqual(this.title, gameDetailNoticeItemBean.title) && Intrinsics.areEqual(this.id, gameDetailNoticeItemBean.id);
        }
        return false;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getJumpDetailUrl() {
        return this.jumpDetailUrl;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    public final Integer getNoticeCount() {
        return this.noticeCount;
    }

    @Nullable
    public final String getReleaseTime() {
        return this.releaseTime;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    public final String getTagBg() {
        return this.tagBg;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.content;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.icon;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.jumpDetailUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.jumpUrl;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.noticeCount;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.releaseTime;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.tag;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.tagBg;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.title;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.id;
        return hashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GameDetailNoticeItemBean(content=" + this.content + ", icon=" + this.icon + ", jumpDetailUrl=" + this.jumpDetailUrl + ", jumpUrl=" + this.jumpUrl + ", noticeCount=" + this.noticeCount + ", releaseTime=" + this.releaseTime + ", tag=" + this.tag + ", tagBg=" + this.tagBg + ", title=" + this.title + ", id=" + this.id + ')';
    }

    public /* synthetic */ GameDetailNoticeItemBean(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, String str9, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? "" : str4, (i4 & 16) != 0 ? 0 : num, (i4 & 32) != 0 ? "" : str5, (i4 & 64) != 0 ? "" : str6, (i4 & 128) != 0 ? "" : str7, (i4 & 256) != 0 ? "" : str8, (i4 & 512) == 0 ? str9 : "");
    }
}
