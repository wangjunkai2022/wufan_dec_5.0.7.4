package com.join.kotlin.discount.model.bean;

import androidx.databinding.BaseObservable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GiftItemBean.kt */
/* loaded from: classes3.dex */
public final class GiftItemBean extends BaseObservable {
    @Nullable
    private final String content;
    @Nullable
    private final String endTime;
    @Nullable
    private final String gameId;
    @Nullable
    private final String giftId;
    @Nullable
    private final String instruction;
    @Nullable
    private final String qq;
    @Nullable
    private final String recRuleIntro;
    @Nullable
    private Integer recStatus;
    @Nullable
    private final String recTip;
    @Nullable
    private final String ruleType;
    @Nullable
    private String sn;
    @Nullable
    private final String startTime;
    @Nullable
    private final Integer surplus;
    @Nullable
    private final String surplusPercent;
    @Nullable
    private final String title;
    @Nullable
    private final Integer total;
    @Nullable
    private final Integer type;
    @Nullable
    private final String useRange;

    public GiftItemBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Integer num, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable Integer num2, @Nullable String str11, @Nullable String str12, @Nullable Integer num3, @Nullable Integer num4, @Nullable String str13, @Nullable String str14) {
        this.content = str;
        this.endTime = str2;
        this.gameId = str3;
        this.giftId = str4;
        this.instruction = str5;
        this.qq = str6;
        this.recRuleIntro = str7;
        this.recStatus = num;
        this.recTip = str8;
        this.sn = str9;
        this.startTime = str10;
        this.surplus = num2;
        this.surplusPercent = str11;
        this.title = str12;
        this.total = num3;
        this.type = num4;
        this.useRange = str13;
        this.ruleType = str14;
    }

    @NotNull
    public final String btnText() {
        Integer num = this.recStatus;
        return (num != null && num.intValue() == 1) ? "复制礼包" : (num != null && num.intValue() == 0) ? "不可领取" : "领取";
    }

    @Nullable
    public final String component1() {
        return this.content;
    }

    @Nullable
    public final String component10() {
        return this.sn;
    }

    @Nullable
    public final String component11() {
        return this.startTime;
    }

    @Nullable
    public final Integer component12() {
        return this.surplus;
    }

    @Nullable
    public final String component13() {
        return this.surplusPercent;
    }

    @Nullable
    public final String component14() {
        return this.title;
    }

    @Nullable
    public final Integer component15() {
        return this.total;
    }

    @Nullable
    public final Integer component16() {
        return this.type;
    }

    @Nullable
    public final String component17() {
        return this.useRange;
    }

    @Nullable
    public final String component18() {
        return this.ruleType;
    }

    @Nullable
    public final String component2() {
        return this.endTime;
    }

    @Nullable
    public final String component3() {
        return this.gameId;
    }

    @Nullable
    public final String component4() {
        return this.giftId;
    }

    @Nullable
    public final String component5() {
        return this.instruction;
    }

    @Nullable
    public final String component6() {
        return this.qq;
    }

    @Nullable
    public final String component7() {
        return this.recRuleIntro;
    }

    @Nullable
    public final Integer component8() {
        return this.recStatus;
    }

    @Nullable
    public final String component9() {
        return this.recTip;
    }

    @NotNull
    public final GiftItemBean copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Integer num, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable Integer num2, @Nullable String str11, @Nullable String str12, @Nullable Integer num3, @Nullable Integer num4, @Nullable String str13, @Nullable String str14) {
        return new GiftItemBean(str, str2, str3, str4, str5, str6, str7, num, str8, str9, str10, num2, str11, str12, num3, num4, str13, str14);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftItemBean) {
            GiftItemBean giftItemBean = (GiftItemBean) obj;
            return Intrinsics.areEqual(this.content, giftItemBean.content) && Intrinsics.areEqual(this.endTime, giftItemBean.endTime) && Intrinsics.areEqual(this.gameId, giftItemBean.gameId) && Intrinsics.areEqual(this.giftId, giftItemBean.giftId) && Intrinsics.areEqual(this.instruction, giftItemBean.instruction) && Intrinsics.areEqual(this.qq, giftItemBean.qq) && Intrinsics.areEqual(this.recRuleIntro, giftItemBean.recRuleIntro) && Intrinsics.areEqual(this.recStatus, giftItemBean.recStatus) && Intrinsics.areEqual(this.recTip, giftItemBean.recTip) && Intrinsics.areEqual(this.sn, giftItemBean.sn) && Intrinsics.areEqual(this.startTime, giftItemBean.startTime) && Intrinsics.areEqual(this.surplus, giftItemBean.surplus) && Intrinsics.areEqual(this.surplusPercent, giftItemBean.surplusPercent) && Intrinsics.areEqual(this.title, giftItemBean.title) && Intrinsics.areEqual(this.total, giftItemBean.total) && Intrinsics.areEqual(this.type, giftItemBean.type) && Intrinsics.areEqual(this.useRange, giftItemBean.useRange) && Intrinsics.areEqual(this.ruleType, giftItemBean.ruleType);
        }
        return false;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final String getGameId() {
        return this.gameId;
    }

    @Nullable
    public final String getGiftId() {
        return this.giftId;
    }

    @Nullable
    public final String getInstruction() {
        return this.instruction;
    }

    @Nullable
    public final String getQq() {
        return this.qq;
    }

    @Nullable
    public final String getRecRuleIntro() {
        return this.recRuleIntro;
    }

    @Nullable
    public final Integer getRecStatus() {
        return this.recStatus;
    }

    @Nullable
    public final String getRecTip() {
        return this.recTip;
    }

    @Nullable
    public final String getRuleType() {
        return this.ruleType;
    }

    @Nullable
    public final String getSn() {
        return this.sn;
    }

    @Nullable
    public final String getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final Integer getSurplus() {
        return this.surplus;
    }

    @Nullable
    public final String getSurplusPercent() {
        return this.surplusPercent;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Integer getTotal() {
        return this.total;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    public final String getUseRange() {
        return this.useRange;
    }

    public int hashCode() {
        String str = this.content;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.endTime;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.gameId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.giftId;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.instruction;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.qq;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.recRuleIntro;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.recStatus;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str8 = this.recTip;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.sn;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.startTime;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num2 = this.surplus;
        int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str11 = this.surplusPercent;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.title;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num3 = this.total;
        int hashCode15 = (hashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.type;
        int hashCode16 = (hashCode15 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str13 = this.useRange;
        int hashCode17 = (hashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.ruleType;
        return hashCode17 + (str14 != null ? str14.hashCode() : 0);
    }

    public final void setRecStatus(@Nullable Integer num) {
        this.recStatus = num;
    }

    public final void setSn(@Nullable String str) {
        this.sn = str;
    }

    @NotNull
    public String toString() {
        return "GiftItemBean(content=" + this.content + ", endTime=" + this.endTime + ", gameId=" + this.gameId + ", giftId=" + this.giftId + ", instruction=" + this.instruction + ", qq=" + this.qq + ", recRuleIntro=" + this.recRuleIntro + ", recStatus=" + this.recStatus + ", recTip=" + this.recTip + ", sn=" + this.sn + ", startTime=" + this.startTime + ", surplus=" + this.surplus + ", surplusPercent=" + this.surplusPercent + ", title=" + this.title + ", total=" + this.total + ", type=" + this.type + ", useRange=" + this.useRange + ", ruleType=" + this.ruleType + ')';
    }
}
