package com.join.kotlin.quark.model.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: JumpModelEntityListItemBean.kt */
/* loaded from: classes3.dex */
public final class JumpModelEntityListItemBean {
    @Nullable
    private final Integer adSwitch;
    @Nullable
    private final String bgColor;
    @Nullable
    private final String bigPic;
    @Nullable
    private final String bigPicH;
    @Nullable
    private final String description;
    @Nullable
    private final GameInfo gameInfo;
    @Nullable
    private final String hadPic;
    @Nullable
    private final String hadVideoUrl;
    @Nullable
    private final JpInfo jpInfo;
    @Nullable
    private final String label;
    @Nullable
    private final Integer position;
    @Nullable
    private final Integer quitSwitch;
    @Nullable
    private final Integer showIndex;
    @Nullable
    private final Statistics statistics;
    @Nullable
    private final String subTitle;
    @Nullable
    private final String title;
    @Nullable
    private final String vadPic;
    @Nullable
    private final String vadVideoUrl;
    @Nullable
    private final String vurl;

    public JumpModelEntityListItemBean(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable GameInfo gameInfo, @Nullable String str5, @Nullable String str6, @Nullable JpInfo jpInfo, @Nullable String str7, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Statistics statistics, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12) {
        this.adSwitch = num;
        this.bgColor = str;
        this.bigPic = str2;
        this.bigPicH = str3;
        this.description = str4;
        this.gameInfo = gameInfo;
        this.hadPic = str5;
        this.hadVideoUrl = str6;
        this.jpInfo = jpInfo;
        this.label = str7;
        this.position = num2;
        this.quitSwitch = num3;
        this.showIndex = num4;
        this.statistics = statistics;
        this.subTitle = str8;
        this.title = str9;
        this.vadPic = str10;
        this.vadVideoUrl = str11;
        this.vurl = str12;
    }

    @Nullable
    public final Integer component1() {
        return this.adSwitch;
    }

    @Nullable
    public final String component10() {
        return this.label;
    }

    @Nullable
    public final Integer component11() {
        return this.position;
    }

    @Nullable
    public final Integer component12() {
        return this.quitSwitch;
    }

    @Nullable
    public final Integer component13() {
        return this.showIndex;
    }

    @Nullable
    public final Statistics component14() {
        return this.statistics;
    }

    @Nullable
    public final String component15() {
        return this.subTitle;
    }

    @Nullable
    public final String component16() {
        return this.title;
    }

    @Nullable
    public final String component17() {
        return this.vadPic;
    }

    @Nullable
    public final String component18() {
        return this.vadVideoUrl;
    }

    @Nullable
    public final String component19() {
        return this.vurl;
    }

    @Nullable
    public final String component2() {
        return this.bgColor;
    }

    @Nullable
    public final String component3() {
        return this.bigPic;
    }

    @Nullable
    public final String component4() {
        return this.bigPicH;
    }

    @Nullable
    public final String component5() {
        return this.description;
    }

    @Nullable
    public final GameInfo component6() {
        return this.gameInfo;
    }

    @Nullable
    public final String component7() {
        return this.hadPic;
    }

    @Nullable
    public final String component8() {
        return this.hadVideoUrl;
    }

    @Nullable
    public final JpInfo component9() {
        return this.jpInfo;
    }

    @NotNull
    public final JumpModelEntityListItemBean copy(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable GameInfo gameInfo, @Nullable String str5, @Nullable String str6, @Nullable JpInfo jpInfo, @Nullable String str7, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Statistics statistics, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12) {
        return new JumpModelEntityListItemBean(num, str, str2, str3, str4, gameInfo, str5, str6, jpInfo, str7, num2, num3, num4, statistics, str8, str9, str10, str11, str12);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JumpModelEntityListItemBean) {
            JumpModelEntityListItemBean jumpModelEntityListItemBean = (JumpModelEntityListItemBean) obj;
            return Intrinsics.areEqual(this.adSwitch, jumpModelEntityListItemBean.adSwitch) && Intrinsics.areEqual(this.bgColor, jumpModelEntityListItemBean.bgColor) && Intrinsics.areEqual(this.bigPic, jumpModelEntityListItemBean.bigPic) && Intrinsics.areEqual(this.bigPicH, jumpModelEntityListItemBean.bigPicH) && Intrinsics.areEqual(this.description, jumpModelEntityListItemBean.description) && Intrinsics.areEqual(this.gameInfo, jumpModelEntityListItemBean.gameInfo) && Intrinsics.areEqual(this.hadPic, jumpModelEntityListItemBean.hadPic) && Intrinsics.areEqual(this.hadVideoUrl, jumpModelEntityListItemBean.hadVideoUrl) && Intrinsics.areEqual(this.jpInfo, jumpModelEntityListItemBean.jpInfo) && Intrinsics.areEqual(this.label, jumpModelEntityListItemBean.label) && Intrinsics.areEqual(this.position, jumpModelEntityListItemBean.position) && Intrinsics.areEqual(this.quitSwitch, jumpModelEntityListItemBean.quitSwitch) && Intrinsics.areEqual(this.showIndex, jumpModelEntityListItemBean.showIndex) && Intrinsics.areEqual(this.statistics, jumpModelEntityListItemBean.statistics) && Intrinsics.areEqual(this.subTitle, jumpModelEntityListItemBean.subTitle) && Intrinsics.areEqual(this.title, jumpModelEntityListItemBean.title) && Intrinsics.areEqual(this.vadPic, jumpModelEntityListItemBean.vadPic) && Intrinsics.areEqual(this.vadVideoUrl, jumpModelEntityListItemBean.vadVideoUrl) && Intrinsics.areEqual(this.vurl, jumpModelEntityListItemBean.vurl);
        }
        return false;
    }

    @Nullable
    public final Integer getAdSwitch() {
        return this.adSwitch;
    }

    @Nullable
    public final String getBgColor() {
        return this.bgColor;
    }

    @Nullable
    public final String getBigPic() {
        return this.bigPic;
    }

    @Nullable
    public final String getBigPicH() {
        return this.bigPicH;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final GameInfo getGameInfo() {
        return this.gameInfo;
    }

    @Nullable
    public final String getHadPic() {
        return this.hadPic;
    }

    @Nullable
    public final String getHadVideoUrl() {
        return this.hadVideoUrl;
    }

    @Nullable
    public final JpInfo getJpInfo() {
        return this.jpInfo;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final Integer getPosition() {
        return this.position;
    }

    @Nullable
    public final Integer getQuitSwitch() {
        return this.quitSwitch;
    }

    @Nullable
    public final Integer getShowIndex() {
        return this.showIndex;
    }

    @Nullable
    public final Statistics getStatistics() {
        return this.statistics;
    }

    @Nullable
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getVadPic() {
        return this.vadPic;
    }

    @Nullable
    public final String getVadVideoUrl() {
        return this.vadVideoUrl;
    }

    @Nullable
    public final String getVurl() {
        return this.vurl;
    }

    public int hashCode() {
        Integer num = this.adSwitch;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.bgColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bigPic;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bigPicH;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        GameInfo gameInfo = this.gameInfo;
        int hashCode6 = (hashCode5 + (gameInfo == null ? 0 : gameInfo.hashCode())) * 31;
        String str5 = this.hadPic;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.hadVideoUrl;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        JpInfo jpInfo = this.jpInfo;
        int hashCode9 = (hashCode8 + (jpInfo == null ? 0 : jpInfo.hashCode())) * 31;
        String str7 = this.label;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num2 = this.position;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.quitSwitch;
        int hashCode12 = (hashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.showIndex;
        int hashCode13 = (hashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Statistics statistics = this.statistics;
        int hashCode14 = (hashCode13 + (statistics == null ? 0 : statistics.hashCode())) * 31;
        String str8 = this.subTitle;
        int hashCode15 = (hashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.title;
        int hashCode16 = (hashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.vadPic;
        int hashCode17 = (hashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.vadVideoUrl;
        int hashCode18 = (hashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.vurl;
        return hashCode18 + (str12 != null ? str12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "JumpModelEntityListItemBean(adSwitch=" + this.adSwitch + ", bgColor=" + this.bgColor + ", bigPic=" + this.bigPic + ", bigPicH=" + this.bigPicH + ", description=" + this.description + ", gameInfo=" + this.gameInfo + ", hadPic=" + this.hadPic + ", hadVideoUrl=" + this.hadVideoUrl + ", jpInfo=" + this.jpInfo + ", label=" + this.label + ", position=" + this.position + ", quitSwitch=" + this.quitSwitch + ", showIndex=" + this.showIndex + ", statistics=" + this.statistics + ", subTitle=" + this.subTitle + ", title=" + this.title + ", vadPic=" + this.vadPic + ", vadVideoUrl=" + this.vadVideoUrl + ", vurl=" + this.vurl + ')';
    }
}
