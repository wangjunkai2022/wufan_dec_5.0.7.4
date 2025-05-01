package com.join.kotlin.quark.model.request;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: AngelRequest.kt */
/* loaded from: classes3.dex */
public final class AngelRequest {
    @Nullable
    private final String diskUrl;
    @Nullable
    private final String uid;
    @Nullable
    private final Integer wishPoolId;

    public AngelRequest(@Nullable String str, @Nullable String str2, @Nullable Integer num) {
        this.diskUrl = str;
        this.uid = str2;
        this.wishPoolId = num;
    }

    public static /* synthetic */ AngelRequest copy$default(AngelRequest angelRequest, String str, String str2, Integer num, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = angelRequest.diskUrl;
        }
        if ((i4 & 2) != 0) {
            str2 = angelRequest.uid;
        }
        if ((i4 & 4) != 0) {
            num = angelRequest.wishPoolId;
        }
        return angelRequest.copy(str, str2, num);
    }

    @Nullable
    public final String component1() {
        return this.diskUrl;
    }

    @Nullable
    public final String component2() {
        return this.uid;
    }

    @Nullable
    public final Integer component3() {
        return this.wishPoolId;
    }

    @NotNull
    public final AngelRequest copy(@Nullable String str, @Nullable String str2, @Nullable Integer num) {
        return new AngelRequest(str, str2, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AngelRequest) {
            AngelRequest angelRequest = (AngelRequest) obj;
            return Intrinsics.areEqual(this.diskUrl, angelRequest.diskUrl) && Intrinsics.areEqual(this.uid, angelRequest.uid) && Intrinsics.areEqual(this.wishPoolId, angelRequest.wishPoolId);
        }
        return false;
    }

    @Nullable
    public final String getDiskUrl() {
        return this.diskUrl;
    }

    @Nullable
    public final String getUid() {
        return this.uid;
    }

    @Nullable
    public final Integer getWishPoolId() {
        return this.wishPoolId;
    }

    public int hashCode() {
        String str = this.diskUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.uid;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.wishPoolId;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AngelRequest(diskUrl=" + this.diskUrl + ", uid=" + this.uid + ", wishPoolId=" + this.wishPoolId + ')';
    }
}
