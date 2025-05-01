package com.join.kotlin.ui.account.modle;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: UnThirdPartRequest.kt */
/* loaded from: classes3.dex */
public final class UnThirdPartRequest {
    @NotNull
    private String deviceId;
    @NotNull
    private String mac;
    @NotNull
    private String mobile;
    @NotNull
    private String packageName;
    @NotNull
    private String packageType;
    @NotNull
    private String platformType;
    @NotNull
    private String sign;
    @NotNull
    private String smsCode;
    private int uid;
    @NotNull
    private String userToken;
    @NotNull
    private String version;

    public UnThirdPartRequest(@NotNull String mobile, @NotNull String smsCode, @NotNull String sign, int i4, @NotNull String userToken, @NotNull String platformType) {
        Intrinsics.checkNotNullParameter(mobile, "mobile");
        Intrinsics.checkNotNullParameter(smsCode, "smsCode");
        Intrinsics.checkNotNullParameter(sign, "sign");
        Intrinsics.checkNotNullParameter(userToken, "userToken");
        Intrinsics.checkNotNullParameter(platformType, "platformType");
        this.mobile = mobile;
        this.smsCode = smsCode;
        this.sign = sign;
        this.uid = i4;
        this.userToken = userToken;
        this.platformType = platformType;
        this.deviceId = "";
        this.mac = "";
        this.packageName = "com.join.android.app.mgsim.wufun";
        this.packageType = "wufun";
        this.version = "417_5.0.7.4";
    }

    public static /* synthetic */ UnThirdPartRequest copy$default(UnThirdPartRequest unThirdPartRequest, String str, String str2, String str3, int i4, String str4, String str5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = unThirdPartRequest.mobile;
        }
        if ((i5 & 2) != 0) {
            str2 = unThirdPartRequest.smsCode;
        }
        String str6 = str2;
        if ((i5 & 4) != 0) {
            str3 = unThirdPartRequest.sign;
        }
        String str7 = str3;
        if ((i5 & 8) != 0) {
            i4 = unThirdPartRequest.uid;
        }
        int i6 = i4;
        if ((i5 & 16) != 0) {
            str4 = unThirdPartRequest.userToken;
        }
        String str8 = str4;
        if ((i5 & 32) != 0) {
            str5 = unThirdPartRequest.platformType;
        }
        return unThirdPartRequest.copy(str, str6, str7, i6, str8, str5);
    }

    @NotNull
    public final String component1() {
        return this.mobile;
    }

    @NotNull
    public final String component2() {
        return this.smsCode;
    }

    @NotNull
    public final String component3() {
        return this.sign;
    }

    public final int component4() {
        return this.uid;
    }

    @NotNull
    public final String component5() {
        return this.userToken;
    }

    @NotNull
    public final String component6() {
        return this.platformType;
    }

    @NotNull
    public final UnThirdPartRequest copy(@NotNull String mobile, @NotNull String smsCode, @NotNull String sign, int i4, @NotNull String userToken, @NotNull String platformType) {
        Intrinsics.checkNotNullParameter(mobile, "mobile");
        Intrinsics.checkNotNullParameter(smsCode, "smsCode");
        Intrinsics.checkNotNullParameter(sign, "sign");
        Intrinsics.checkNotNullParameter(userToken, "userToken");
        Intrinsics.checkNotNullParameter(platformType, "platformType");
        return new UnThirdPartRequest(mobile, smsCode, sign, i4, userToken, platformType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnThirdPartRequest) {
            UnThirdPartRequest unThirdPartRequest = (UnThirdPartRequest) obj;
            return Intrinsics.areEqual(this.mobile, unThirdPartRequest.mobile) && Intrinsics.areEqual(this.smsCode, unThirdPartRequest.smsCode) && Intrinsics.areEqual(this.sign, unThirdPartRequest.sign) && this.uid == unThirdPartRequest.uid && Intrinsics.areEqual(this.userToken, unThirdPartRequest.userToken) && Intrinsics.areEqual(this.platformType, unThirdPartRequest.platformType);
        }
        return false;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getMac() {
        return this.mac;
    }

    @NotNull
    public final String getMobile() {
        return this.mobile;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final String getPackageType() {
        return this.packageType;
    }

    @NotNull
    public final String getPlatformType() {
        return this.platformType;
    }

    @NotNull
    public final String getSign() {
        return this.sign;
    }

    @NotNull
    public final String getSmsCode() {
        return this.smsCode;
    }

    public final int getUid() {
        return this.uid;
    }

    @NotNull
    public final String getUserToken() {
        return this.userToken;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((this.mobile.hashCode() * 31) + this.smsCode.hashCode()) * 31) + this.sign.hashCode()) * 31) + this.uid) * 31) + this.userToken.hashCode()) * 31) + this.platformType.hashCode();
    }

    public final void setDeviceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceId = str;
    }

    public final void setMac(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mac = str;
    }

    public final void setMobile(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobile = str;
    }

    public final void setPackageName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageName = str;
    }

    public final void setPackageType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageType = str;
    }

    public final void setPlatformType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.platformType = str;
    }

    public final void setSign(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sign = str;
    }

    public final void setSmsCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.smsCode = str;
    }

    public final void setUid(int i4) {
        this.uid = i4;
    }

    public final void setUserToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userToken = str;
    }

    public final void setVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.version = str;
    }

    @NotNull
    public String toString() {
        return "UnThirdPartRequest(mobile=" + this.mobile + ", smsCode=" + this.smsCode + ", sign=" + this.sign + ", uid=" + this.uid + ", userToken=" + this.userToken + ", platformType=" + this.platformType + ')';
    }
}
