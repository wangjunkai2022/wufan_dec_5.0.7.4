package com.join.kotlin.quark.model.request;

import com.join.kotlin.quark.model.bean.Page;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SourceListRequest.kt */
/* loaded from: classes3.dex */
public final class SourceListRequest {
    @Nullable
    private final Page page;
    @Nullable
    private final Integer tabId;
    @Nullable
    private final String token;
    @Nullable
    private final String uid;

    public SourceListRequest(@Nullable Page page, @Nullable Integer num, @Nullable String str, @Nullable String str2) {
        this.page = page;
        this.tabId = num;
        this.token = str;
        this.uid = str2;
    }

    public static /* synthetic */ SourceListRequest copy$default(SourceListRequest sourceListRequest, Page page, Integer num, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            page = sourceListRequest.page;
        }
        if ((i4 & 2) != 0) {
            num = sourceListRequest.tabId;
        }
        if ((i4 & 4) != 0) {
            str = sourceListRequest.token;
        }
        if ((i4 & 8) != 0) {
            str2 = sourceListRequest.uid;
        }
        return sourceListRequest.copy(page, num, str, str2);
    }

    @Nullable
    public final Page component1() {
        return this.page;
    }

    @Nullable
    public final Integer component2() {
        return this.tabId;
    }

    @Nullable
    public final String component3() {
        return this.token;
    }

    @Nullable
    public final String component4() {
        return this.uid;
    }

    @NotNull
    public final SourceListRequest copy(@Nullable Page page, @Nullable Integer num, @Nullable String str, @Nullable String str2) {
        return new SourceListRequest(page, num, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SourceListRequest) {
            SourceListRequest sourceListRequest = (SourceListRequest) obj;
            return Intrinsics.areEqual(this.page, sourceListRequest.page) && Intrinsics.areEqual(this.tabId, sourceListRequest.tabId) && Intrinsics.areEqual(this.token, sourceListRequest.token) && Intrinsics.areEqual(this.uid, sourceListRequest.uid);
        }
        return false;
    }

    @Nullable
    public final Page getPage() {
        return this.page;
    }

    @Nullable
    public final Integer getTabId() {
        return this.tabId;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    @Nullable
    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        Page page = this.page;
        int hashCode = (page == null ? 0 : page.hashCode()) * 31;
        Integer num = this.tabId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.token;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.uid;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SourceListRequest(page=" + this.page + ", tabId=" + this.tabId + ", token=" + this.token + ", uid=" + this.uid + ')';
    }
}
