package com.join.kotlin.quark.model.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: JumpModelEntityListItemBean.kt */
/* loaded from: classes3.dex */
public final class PositionPath {
    @Nullable
    private final String reqId;
    @Nullable
    private final String scm;
    @Nullable
    private final String transData;

    public PositionPath(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.reqId = str;
        this.scm = str2;
        this.transData = str3;
    }

    public static /* synthetic */ PositionPath copy$default(PositionPath positionPath, String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = positionPath.reqId;
        }
        if ((i4 & 2) != 0) {
            str2 = positionPath.scm;
        }
        if ((i4 & 4) != 0) {
            str3 = positionPath.transData;
        }
        return positionPath.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.reqId;
    }

    @Nullable
    public final String component2() {
        return this.scm;
    }

    @Nullable
    public final String component3() {
        return this.transData;
    }

    @NotNull
    public final PositionPath copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new PositionPath(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PositionPath) {
            PositionPath positionPath = (PositionPath) obj;
            return Intrinsics.areEqual(this.reqId, positionPath.reqId) && Intrinsics.areEqual(this.scm, positionPath.scm) && Intrinsics.areEqual(this.transData, positionPath.transData);
        }
        return false;
    }

    @Nullable
    public final String getReqId() {
        return this.reqId;
    }

    @Nullable
    public final String getScm() {
        return this.scm;
    }

    @Nullable
    public final String getTransData() {
        return this.transData;
    }

    public int hashCode() {
        String str = this.reqId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.scm;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.transData;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PositionPath(reqId=" + this.reqId + ", scm=" + this.scm + ", transData=" + this.transData + ')';
    }
}
