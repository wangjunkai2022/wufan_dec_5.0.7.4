package com.join.kotlin.quark.model.request;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: AngelCreateRequest.kt */
/* loaded from: classes3.dex */
public final class AngelCreateRequest {
    @Nullable
    private final String diskUrl;
    @Nullable
    private final String info;
    @Nullable
    private final Integer type;
    @Nullable
    private final String uid;

    public AngelCreateRequest(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3) {
        this.diskUrl = str;
        this.info = str2;
        this.type = num;
        this.uid = str3;
    }

    public static /* synthetic */ AngelCreateRequest copy$default(AngelCreateRequest angelCreateRequest, String str, String str2, Integer num, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = angelCreateRequest.diskUrl;
        }
        if ((i4 & 2) != 0) {
            str2 = angelCreateRequest.info;
        }
        if ((i4 & 4) != 0) {
            num = angelCreateRequest.type;
        }
        if ((i4 & 8) != 0) {
            str3 = angelCreateRequest.uid;
        }
        return angelCreateRequest.copy(str, str2, num, str3);
    }

    @Nullable
    public final String component1() {
        return this.diskUrl;
    }

    @Nullable
    public final String component2() {
        return this.info;
    }

    @Nullable
    public final Integer component3() {
        return this.type;
    }

    @Nullable
    public final String component4() {
        return this.uid;
    }

    @NotNull
    public final AngelCreateRequest copy(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3) {
        return new AngelCreateRequest(str, str2, num, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AngelCreateRequest) {
            AngelCreateRequest angelCreateRequest = (AngelCreateRequest) obj;
            return Intrinsics.areEqual(this.diskUrl, angelCreateRequest.diskUrl) && Intrinsics.areEqual(this.info, angelCreateRequest.info) && Intrinsics.areEqual(this.type, angelCreateRequest.type) && Intrinsics.areEqual(this.uid, angelCreateRequest.uid);
        }
        return false;
    }

    @Nullable
    public final String getDiskUrl() {
        return this.diskUrl;
    }

    @Nullable
    public final String getInfo() {
        return this.info;
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
        String str = this.diskUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.info;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.type;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.uid;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AngelCreateRequest(diskUrl=" + this.diskUrl + ", info=" + this.info + ", type=" + this.type + ", uid=" + this.uid + ')';
    }
}
