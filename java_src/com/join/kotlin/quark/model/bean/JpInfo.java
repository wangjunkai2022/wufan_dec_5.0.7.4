package com.join.kotlin.quark.model.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: JumpModelEntityListItemBean.kt */
/* loaded from: classes3.dex */
public final class JpInfo {
    @Nullable
    private final String crcLinkTypeVal;
    @Nullable
    private final Integer isMore;
    @Nullable
    private final Integer jumpType;
    @Nullable
    private final Integer linkType;
    @Nullable
    private final String linkTypeVal;
    @Nullable
    private final Integer thirdType;
    @Nullable
    private final Integer tplType;

    public JpInfo(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str2, @Nullable Integer num4, @Nullable Integer num5) {
        this.crcLinkTypeVal = str;
        this.isMore = num;
        this.jumpType = num2;
        this.linkType = num3;
        this.linkTypeVal = str2;
        this.thirdType = num4;
        this.tplType = num5;
    }

    public static /* synthetic */ JpInfo copy$default(JpInfo jpInfo, String str, Integer num, Integer num2, Integer num3, String str2, Integer num4, Integer num5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = jpInfo.crcLinkTypeVal;
        }
        if ((i4 & 2) != 0) {
            num = jpInfo.isMore;
        }
        Integer num6 = num;
        if ((i4 & 4) != 0) {
            num2 = jpInfo.jumpType;
        }
        Integer num7 = num2;
        if ((i4 & 8) != 0) {
            num3 = jpInfo.linkType;
        }
        Integer num8 = num3;
        if ((i4 & 16) != 0) {
            str2 = jpInfo.linkTypeVal;
        }
        String str3 = str2;
        if ((i4 & 32) != 0) {
            num4 = jpInfo.thirdType;
        }
        Integer num9 = num4;
        if ((i4 & 64) != 0) {
            num5 = jpInfo.tplType;
        }
        return jpInfo.copy(str, num6, num7, num8, str3, num9, num5);
    }

    @Nullable
    public final String component1() {
        return this.crcLinkTypeVal;
    }

    @Nullable
    public final Integer component2() {
        return this.isMore;
    }

    @Nullable
    public final Integer component3() {
        return this.jumpType;
    }

    @Nullable
    public final Integer component4() {
        return this.linkType;
    }

    @Nullable
    public final String component5() {
        return this.linkTypeVal;
    }

    @Nullable
    public final Integer component6() {
        return this.thirdType;
    }

    @Nullable
    public final Integer component7() {
        return this.tplType;
    }

    @NotNull
    public final JpInfo copy(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str2, @Nullable Integer num4, @Nullable Integer num5) {
        return new JpInfo(str, num, num2, num3, str2, num4, num5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JpInfo) {
            JpInfo jpInfo = (JpInfo) obj;
            return Intrinsics.areEqual(this.crcLinkTypeVal, jpInfo.crcLinkTypeVal) && Intrinsics.areEqual(this.isMore, jpInfo.isMore) && Intrinsics.areEqual(this.jumpType, jpInfo.jumpType) && Intrinsics.areEqual(this.linkType, jpInfo.linkType) && Intrinsics.areEqual(this.linkTypeVal, jpInfo.linkTypeVal) && Intrinsics.areEqual(this.thirdType, jpInfo.thirdType) && Intrinsics.areEqual(this.tplType, jpInfo.tplType);
        }
        return false;
    }

    @Nullable
    public final String getCrcLinkTypeVal() {
        return this.crcLinkTypeVal;
    }

    @Nullable
    public final Integer getJumpType() {
        return this.jumpType;
    }

    @Nullable
    public final Integer getLinkType() {
        return this.linkType;
    }

    @Nullable
    public final String getLinkTypeVal() {
        return this.linkTypeVal;
    }

    @Nullable
    public final Integer getThirdType() {
        return this.thirdType;
    }

    @Nullable
    public final Integer getTplType() {
        return this.tplType;
    }

    public int hashCode() {
        String str = this.crcLinkTypeVal;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.isMore;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.jumpType;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.linkType;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.linkTypeVal;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num4 = this.thirdType;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.tplType;
        return hashCode6 + (num5 != null ? num5.hashCode() : 0);
    }

    @Nullable
    public final Integer isMore() {
        return this.isMore;
    }

    @NotNull
    public String toString() {
        return "JpInfo(crcLinkTypeVal=" + this.crcLinkTypeVal + ", isMore=" + this.isMore + ", jumpType=" + this.jumpType + ", linkType=" + this.linkType + ", linkTypeVal=" + this.linkTypeVal + ", thirdType=" + this.thirdType + ", tplType=" + this.tplType + ')';
    }
}
