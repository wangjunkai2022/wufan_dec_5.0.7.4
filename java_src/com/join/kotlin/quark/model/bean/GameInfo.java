package com.join.kotlin.quark.model.bean;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: JumpModelEntityListItemBean.kt */
/* loaded from: classes3.dex */
public final class GameInfo {
    @Nullable
    private final String appSize;
    @Nullable
    private final Integer arm64;
    @Nullable
    private final Integer bespeakSwitch;
    @Nullable
    private final Integer commentScoreSwitch;
    @Nullable
    private final Integer downState;
    @Nullable
    private final Integer gameBook;
    @Nullable
    private final Integer gameId;
    @Nullable
    private final Integer gameInfoTplType;
    @Nullable
    private final String gameName;
    @Nullable
    private final String gifIco;
    @Nullable
    private final Integer giftPackageSwitch;
    @Nullable
    private final String ico;
    @Nullable
    private final String info;
    @Nullable
    private final Integer modGameId;
    @Nullable
    private final String modPackageName;
    @Nullable
    private final String packageName;
    @Nullable
    private final List<Object> picInfo;
    @Nullable
    private final Integer picPosition;
    @Nullable
    private final Integer pluginNum;
    @Nullable
    private final PositionPath positionPath;
    @Nullable
    private final Integer score;
    @Nullable
    private final SpTagInfo spTagInfo;
    @Nullable
    private final Integer spTplTwoPosition;
    @Nullable
    private final String syncMemory;
    @Nullable
    private final List<Object> tagId;
    @Nullable
    private final List<TagInfo> tagInfo;
    @Nullable
    private final String tagName;
    @Nullable
    private final String ver;
    @Nullable
    private final String verName;
    @Nullable
    private final WebDiskEntity webDiskEntity;

    public GameInfo(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable String str2, @Nullable String str3, @Nullable Integer num8, @Nullable String str4, @Nullable String str5, @Nullable Integer num9, @Nullable String str6, @Nullable String str7, @Nullable List<? extends Object> list, @Nullable Integer num10, @Nullable Integer num11, @Nullable PositionPath positionPath, @Nullable Integer num12, @Nullable SpTagInfo spTagInfo, @Nullable Integer num13, @Nullable String str8, @Nullable List<? extends Object> list2, @Nullable List<TagInfo> list3, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable WebDiskEntity webDiskEntity) {
        this.appSize = str;
        this.arm64 = num;
        this.bespeakSwitch = num2;
        this.commentScoreSwitch = num3;
        this.downState = num4;
        this.gameBook = num5;
        this.gameId = num6;
        this.gameInfoTplType = num7;
        this.gameName = str2;
        this.gifIco = str3;
        this.giftPackageSwitch = num8;
        this.ico = str4;
        this.info = str5;
        this.modGameId = num9;
        this.modPackageName = str6;
        this.packageName = str7;
        this.picInfo = list;
        this.picPosition = num10;
        this.pluginNum = num11;
        this.positionPath = positionPath;
        this.score = num12;
        this.spTagInfo = spTagInfo;
        this.spTplTwoPosition = num13;
        this.syncMemory = str8;
        this.tagId = list2;
        this.tagInfo = list3;
        this.tagName = str9;
        this.ver = str10;
        this.verName = str11;
        this.webDiskEntity = webDiskEntity;
    }

    @Nullable
    public final String component1() {
        return this.appSize;
    }

    @Nullable
    public final String component10() {
        return this.gifIco;
    }

    @Nullable
    public final Integer component11() {
        return this.giftPackageSwitch;
    }

    @Nullable
    public final String component12() {
        return this.ico;
    }

    @Nullable
    public final String component13() {
        return this.info;
    }

    @Nullable
    public final Integer component14() {
        return this.modGameId;
    }

    @Nullable
    public final String component15() {
        return this.modPackageName;
    }

    @Nullable
    public final String component16() {
        return this.packageName;
    }

    @Nullable
    public final List<Object> component17() {
        return this.picInfo;
    }

    @Nullable
    public final Integer component18() {
        return this.picPosition;
    }

    @Nullable
    public final Integer component19() {
        return this.pluginNum;
    }

    @Nullable
    public final Integer component2() {
        return this.arm64;
    }

    @Nullable
    public final PositionPath component20() {
        return this.positionPath;
    }

    @Nullable
    public final Integer component21() {
        return this.score;
    }

    @Nullable
    public final SpTagInfo component22() {
        return this.spTagInfo;
    }

    @Nullable
    public final Integer component23() {
        return this.spTplTwoPosition;
    }

    @Nullable
    public final String component24() {
        return this.syncMemory;
    }

    @Nullable
    public final List<Object> component25() {
        return this.tagId;
    }

    @Nullable
    public final List<TagInfo> component26() {
        return this.tagInfo;
    }

    @Nullable
    public final String component27() {
        return this.tagName;
    }

    @Nullable
    public final String component28() {
        return this.ver;
    }

    @Nullable
    public final String component29() {
        return this.verName;
    }

    @Nullable
    public final Integer component3() {
        return this.bespeakSwitch;
    }

    @Nullable
    public final WebDiskEntity component30() {
        return this.webDiskEntity;
    }

    @Nullable
    public final Integer component4() {
        return this.commentScoreSwitch;
    }

    @Nullable
    public final Integer component5() {
        return this.downState;
    }

    @Nullable
    public final Integer component6() {
        return this.gameBook;
    }

    @Nullable
    public final Integer component7() {
        return this.gameId;
    }

    @Nullable
    public final Integer component8() {
        return this.gameInfoTplType;
    }

    @Nullable
    public final String component9() {
        return this.gameName;
    }

    @NotNull
    public final GameInfo copy(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable String str2, @Nullable String str3, @Nullable Integer num8, @Nullable String str4, @Nullable String str5, @Nullable Integer num9, @Nullable String str6, @Nullable String str7, @Nullable List<? extends Object> list, @Nullable Integer num10, @Nullable Integer num11, @Nullable PositionPath positionPath, @Nullable Integer num12, @Nullable SpTagInfo spTagInfo, @Nullable Integer num13, @Nullable String str8, @Nullable List<? extends Object> list2, @Nullable List<TagInfo> list3, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable WebDiskEntity webDiskEntity) {
        return new GameInfo(str, num, num2, num3, num4, num5, num6, num7, str2, str3, num8, str4, str5, num9, str6, str7, list, num10, num11, positionPath, num12, spTagInfo, num13, str8, list2, list3, str9, str10, str11, webDiskEntity);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GameInfo) {
            GameInfo gameInfo = (GameInfo) obj;
            return Intrinsics.areEqual(this.appSize, gameInfo.appSize) && Intrinsics.areEqual(this.arm64, gameInfo.arm64) && Intrinsics.areEqual(this.bespeakSwitch, gameInfo.bespeakSwitch) && Intrinsics.areEqual(this.commentScoreSwitch, gameInfo.commentScoreSwitch) && Intrinsics.areEqual(this.downState, gameInfo.downState) && Intrinsics.areEqual(this.gameBook, gameInfo.gameBook) && Intrinsics.areEqual(this.gameId, gameInfo.gameId) && Intrinsics.areEqual(this.gameInfoTplType, gameInfo.gameInfoTplType) && Intrinsics.areEqual(this.gameName, gameInfo.gameName) && Intrinsics.areEqual(this.gifIco, gameInfo.gifIco) && Intrinsics.areEqual(this.giftPackageSwitch, gameInfo.giftPackageSwitch) && Intrinsics.areEqual(this.ico, gameInfo.ico) && Intrinsics.areEqual(this.info, gameInfo.info) && Intrinsics.areEqual(this.modGameId, gameInfo.modGameId) && Intrinsics.areEqual(this.modPackageName, gameInfo.modPackageName) && Intrinsics.areEqual(this.packageName, gameInfo.packageName) && Intrinsics.areEqual(this.picInfo, gameInfo.picInfo) && Intrinsics.areEqual(this.picPosition, gameInfo.picPosition) && Intrinsics.areEqual(this.pluginNum, gameInfo.pluginNum) && Intrinsics.areEqual(this.positionPath, gameInfo.positionPath) && Intrinsics.areEqual(this.score, gameInfo.score) && Intrinsics.areEqual(this.spTagInfo, gameInfo.spTagInfo) && Intrinsics.areEqual(this.spTplTwoPosition, gameInfo.spTplTwoPosition) && Intrinsics.areEqual(this.syncMemory, gameInfo.syncMemory) && Intrinsics.areEqual(this.tagId, gameInfo.tagId) && Intrinsics.areEqual(this.tagInfo, gameInfo.tagInfo) && Intrinsics.areEqual(this.tagName, gameInfo.tagName) && Intrinsics.areEqual(this.ver, gameInfo.ver) && Intrinsics.areEqual(this.verName, gameInfo.verName) && Intrinsics.areEqual(this.webDiskEntity, gameInfo.webDiskEntity);
        }
        return false;
    }

    @Nullable
    public final String getAppSize() {
        return this.appSize;
    }

    @Nullable
    public final Integer getArm64() {
        return this.arm64;
    }

    @Nullable
    public final Integer getBespeakSwitch() {
        return this.bespeakSwitch;
    }

    @Nullable
    public final Integer getCommentScoreSwitch() {
        return this.commentScoreSwitch;
    }

    @Nullable
    public final Integer getDownState() {
        return this.downState;
    }

    @Nullable
    public final Integer getGameBook() {
        return this.gameBook;
    }

    @Nullable
    public final Integer getGameId() {
        return this.gameId;
    }

    @Nullable
    public final Integer getGameInfoTplType() {
        return this.gameInfoTplType;
    }

    @Nullable
    public final String getGameName() {
        return this.gameName;
    }

    @Nullable
    public final String getGifIco() {
        return this.gifIco;
    }

    @Nullable
    public final Integer getGiftPackageSwitch() {
        return this.giftPackageSwitch;
    }

    @Nullable
    public final String getIco() {
        return this.ico;
    }

    @Nullable
    public final String getInfo() {
        return this.info;
    }

    @Nullable
    public final Integer getModGameId() {
        return this.modGameId;
    }

    @Nullable
    public final String getModPackageName() {
        return this.modPackageName;
    }

    @Nullable
    public final String getPackageName() {
        return this.packageName;
    }

    @Nullable
    public final List<Object> getPicInfo() {
        return this.picInfo;
    }

    @Nullable
    public final Integer getPicPosition() {
        return this.picPosition;
    }

    @Nullable
    public final Integer getPluginNum() {
        return this.pluginNum;
    }

    @Nullable
    public final PositionPath getPositionPath() {
        return this.positionPath;
    }

    @Nullable
    public final Integer getScore() {
        return this.score;
    }

    @Nullable
    public final SpTagInfo getSpTagInfo() {
        return this.spTagInfo;
    }

    @Nullable
    public final Integer getSpTplTwoPosition() {
        return this.spTplTwoPosition;
    }

    @Nullable
    public final String getSyncMemory() {
        return this.syncMemory;
    }

    @Nullable
    public final List<Object> getTagId() {
        return this.tagId;
    }

    @Nullable
    public final List<TagInfo> getTagInfo() {
        return this.tagInfo;
    }

    @Nullable
    public final String getTagName() {
        return this.tagName;
    }

    @Nullable
    public final String getVer() {
        return this.ver;
    }

    @Nullable
    public final String getVerName() {
        return this.verName;
    }

    @Nullable
    public final WebDiskEntity getWebDiskEntity() {
        return this.webDiskEntity;
    }

    public int hashCode() {
        String str = this.appSize;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.arm64;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.bespeakSwitch;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.commentScoreSwitch;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.downState;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.gameBook;
        int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.gameId;
        int hashCode7 = (hashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.gameInfoTplType;
        int hashCode8 = (hashCode7 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str2 = this.gameName;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.gifIco;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num8 = this.giftPackageSwitch;
        int hashCode11 = (hashCode10 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str4 = this.ico;
        int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.info;
        int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num9 = this.modGameId;
        int hashCode14 = (hashCode13 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str6 = this.modPackageName;
        int hashCode15 = (hashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.packageName;
        int hashCode16 = (hashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<Object> list = this.picInfo;
        int hashCode17 = (hashCode16 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num10 = this.picPosition;
        int hashCode18 = (hashCode17 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.pluginNum;
        int hashCode19 = (hashCode18 + (num11 == null ? 0 : num11.hashCode())) * 31;
        PositionPath positionPath = this.positionPath;
        int hashCode20 = (hashCode19 + (positionPath == null ? 0 : positionPath.hashCode())) * 31;
        Integer num12 = this.score;
        int hashCode21 = (hashCode20 + (num12 == null ? 0 : num12.hashCode())) * 31;
        SpTagInfo spTagInfo = this.spTagInfo;
        int hashCode22 = (hashCode21 + (spTagInfo == null ? 0 : spTagInfo.hashCode())) * 31;
        Integer num13 = this.spTplTwoPosition;
        int hashCode23 = (hashCode22 + (num13 == null ? 0 : num13.hashCode())) * 31;
        String str8 = this.syncMemory;
        int hashCode24 = (hashCode23 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<Object> list2 = this.tagId;
        int hashCode25 = (hashCode24 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TagInfo> list3 = this.tagInfo;
        int hashCode26 = (hashCode25 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str9 = this.tagName;
        int hashCode27 = (hashCode26 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.ver;
        int hashCode28 = (hashCode27 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.verName;
        int hashCode29 = (hashCode28 + (str11 == null ? 0 : str11.hashCode())) * 31;
        WebDiskEntity webDiskEntity = this.webDiskEntity;
        return hashCode29 + (webDiskEntity != null ? webDiskEntity.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GameInfo(appSize=" + this.appSize + ", arm64=" + this.arm64 + ", bespeakSwitch=" + this.bespeakSwitch + ", commentScoreSwitch=" + this.commentScoreSwitch + ", downState=" + this.downState + ", gameBook=" + this.gameBook + ", gameId=" + this.gameId + ", gameInfoTplType=" + this.gameInfoTplType + ", gameName=" + this.gameName + ", gifIco=" + this.gifIco + ", giftPackageSwitch=" + this.giftPackageSwitch + ", ico=" + this.ico + ", info=" + this.info + ", modGameId=" + this.modGameId + ", modPackageName=" + this.modPackageName + ", packageName=" + this.packageName + ", picInfo=" + this.picInfo + ", picPosition=" + this.picPosition + ", pluginNum=" + this.pluginNum + ", positionPath=" + this.positionPath + ", score=" + this.score + ", spTagInfo=" + this.spTagInfo + ", spTplTwoPosition=" + this.spTplTwoPosition + ", syncMemory=" + this.syncMemory + ", tagId=" + this.tagId + ", tagInfo=" + this.tagInfo + ", tagName=" + this.tagName + ", ver=" + this.ver + ", verName=" + this.verName + ", webDiskEntity=" + this.webDiskEntity + ')';
    }
}
