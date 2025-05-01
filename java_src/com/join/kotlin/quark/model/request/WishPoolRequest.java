package com.join.kotlin.quark.model.request;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: WishPoolRequest.kt */
/* loaded from: classes3.dex */
public final class WishPoolRequest {
    @Nullable
    private final String keyword;
    @Nullable
    private final Integer location;
    @Nullable
    private final Integer page;
    @Nullable
    private final Integer sortType;
    @Nullable
    private final Integer status;
    @Nullable
    private final Integer type;
    @Nullable
    private final String uid;

    public WishPoolRequest(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable String str2) {
        this.keyword = str;
        this.location = num;
        this.page = num2;
        this.sortType = num3;
        this.status = num4;
        this.type = num5;
        this.uid = str2;
    }

    public static /* synthetic */ WishPoolRequest copy$default(WishPoolRequest wishPoolRequest, String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = wishPoolRequest.keyword;
        }
        if ((i4 & 2) != 0) {
            num = wishPoolRequest.location;
        }
        Integer num6 = num;
        if ((i4 & 4) != 0) {
            num2 = wishPoolRequest.page;
        }
        Integer num7 = num2;
        if ((i4 & 8) != 0) {
            num3 = wishPoolRequest.sortType;
        }
        Integer num8 = num3;
        if ((i4 & 16) != 0) {
            num4 = wishPoolRequest.status;
        }
        Integer num9 = num4;
        if ((i4 & 32) != 0) {
            num5 = wishPoolRequest.type;
        }
        Integer num10 = num5;
        if ((i4 & 64) != 0) {
            str2 = wishPoolRequest.uid;
        }
        return wishPoolRequest.copy(str, num6, num7, num8, num9, num10, str2);
    }

    @Nullable
    public final String component1() {
        return this.keyword;
    }

    @Nullable
    public final Integer component2() {
        return this.location;
    }

    @Nullable
    public final Integer component3() {
        return this.page;
    }

    @Nullable
    public final Integer component4() {
        return this.sortType;
    }

    @Nullable
    public final Integer component5() {
        return this.status;
    }

    @Nullable
    public final Integer component6() {
        return this.type;
    }

    @Nullable
    public final String component7() {
        return this.uid;
    }

    @NotNull
    public final WishPoolRequest copy(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable String str2) {
        return new WishPoolRequest(str, num, num2, num3, num4, num5, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WishPoolRequest) {
            WishPoolRequest wishPoolRequest = (WishPoolRequest) obj;
            return Intrinsics.areEqual(this.keyword, wishPoolRequest.keyword) && Intrinsics.areEqual(this.location, wishPoolRequest.location) && Intrinsics.areEqual(this.page, wishPoolRequest.page) && Intrinsics.areEqual(this.sortType, wishPoolRequest.sortType) && Intrinsics.areEqual(this.status, wishPoolRequest.status) && Intrinsics.areEqual(this.type, wishPoolRequest.type) && Intrinsics.areEqual(this.uid, wishPoolRequest.uid);
        }
        return false;
    }

    @Nullable
    public final String getKeyword() {
        return this.keyword;
    }

    @Nullable
    public final Integer getLocation() {
        return this.location;
    }

    @Nullable
    public final Integer getPage() {
        return this.page;
    }

    @Nullable
    public final Integer getSortType() {
        return this.sortType;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        String str = this.keyword;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.location;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.page;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.sortType;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.status;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.type;
        int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str2 = this.uid;
        return hashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WishPoolRequest(keyword=" + this.keyword + ", location=" + this.location + ", page=" + this.page + ", sortType=" + this.sortType + ", status=" + this.status + ", type=" + this.type + ", uid=" + this.uid + ')';
    }
}
