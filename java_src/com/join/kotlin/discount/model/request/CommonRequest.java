package com.join.kotlin.discount.model.request;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CommonRequest.kt */
/* loaded from: classes3.dex */
public final class CommonRequest {
    @Nullable
    private String gameId;
    private int page;

    public CommonRequest(@Nullable String str, int i4) {
        this.gameId = str;
        this.page = i4;
    }

    public static /* synthetic */ CommonRequest copy$default(CommonRequest commonRequest, String str, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = commonRequest.gameId;
        }
        if ((i5 & 2) != 0) {
            i4 = commonRequest.page;
        }
        return commonRequest.copy(str, i4);
    }

    @Nullable
    public final String component1() {
        return this.gameId;
    }

    public final int component2() {
        return this.page;
    }

    @NotNull
    public final CommonRequest copy(@Nullable String str, int i4) {
        return new CommonRequest(str, i4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommonRequest) {
            CommonRequest commonRequest = (CommonRequest) obj;
            return Intrinsics.areEqual(this.gameId, commonRequest.gameId) && this.page == commonRequest.page;
        }
        return false;
    }

    @Nullable
    public final String getGameId() {
        return this.gameId;
    }

    public final int getPage() {
        return this.page;
    }

    public int hashCode() {
        String str = this.gameId;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.page;
    }

    public final void setGameId(@Nullable String str) {
        this.gameId = str;
    }

    public final void setPage(int i4) {
        this.page = i4;
    }

    @NotNull
    public String toString() {
        return "CommonRequest(gameId=" + this.gameId + ", page=" + this.page + ')';
    }
}
