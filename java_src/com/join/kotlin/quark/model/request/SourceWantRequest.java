package com.join.kotlin.quark.model.request;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SourceWantRequest.kt */
/* loaded from: classes3.dex */
public final class SourceWantRequest {
    @Nullable
    private final String uid;
    @Nullable
    private final Integer wishPoolId;

    public SourceWantRequest(@Nullable String str, @Nullable Integer num) {
        this.uid = str;
        this.wishPoolId = num;
    }

    public static /* synthetic */ SourceWantRequest copy$default(SourceWantRequest sourceWantRequest, String str, Integer num, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = sourceWantRequest.uid;
        }
        if ((i4 & 2) != 0) {
            num = sourceWantRequest.wishPoolId;
        }
        return sourceWantRequest.copy(str, num);
    }

    @Nullable
    public final String component1() {
        return this.uid;
    }

    @Nullable
    public final Integer component2() {
        return this.wishPoolId;
    }

    @NotNull
    public final SourceWantRequest copy(@Nullable String str, @Nullable Integer num) {
        return new SourceWantRequest(str, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SourceWantRequest) {
            SourceWantRequest sourceWantRequest = (SourceWantRequest) obj;
            return Intrinsics.areEqual(this.uid, sourceWantRequest.uid) && Intrinsics.areEqual(this.wishPoolId, sourceWantRequest.wishPoolId);
        }
        return false;
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
        String str = this.uid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.wishPoolId;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SourceWantRequest(uid=" + this.uid + ", wishPoolId=" + this.wishPoolId + ')';
    }
}
