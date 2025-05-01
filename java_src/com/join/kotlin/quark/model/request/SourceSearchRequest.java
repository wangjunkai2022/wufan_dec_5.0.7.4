package com.join.kotlin.quark.model.request;

import com.join.kotlin.quark.model.bean.Page;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SourceSearchRequest.kt */
/* loaded from: classes3.dex */
public final class SourceSearchRequest {
    @Nullable
    private final String keywords;
    @Nullable
    private final Page page;

    public SourceSearchRequest(@Nullable String str, @Nullable Page page) {
        this.keywords = str;
        this.page = page;
    }

    public static /* synthetic */ SourceSearchRequest copy$default(SourceSearchRequest sourceSearchRequest, String str, Page page, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = sourceSearchRequest.keywords;
        }
        if ((i4 & 2) != 0) {
            page = sourceSearchRequest.page;
        }
        return sourceSearchRequest.copy(str, page);
    }

    @Nullable
    public final String component1() {
        return this.keywords;
    }

    @Nullable
    public final Page component2() {
        return this.page;
    }

    @NotNull
    public final SourceSearchRequest copy(@Nullable String str, @Nullable Page page) {
        return new SourceSearchRequest(str, page);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SourceSearchRequest) {
            SourceSearchRequest sourceSearchRequest = (SourceSearchRequest) obj;
            return Intrinsics.areEqual(this.keywords, sourceSearchRequest.keywords) && Intrinsics.areEqual(this.page, sourceSearchRequest.page);
        }
        return false;
    }

    @Nullable
    public final String getKeywords() {
        return this.keywords;
    }

    @Nullable
    public final Page getPage() {
        return this.page;
    }

    public int hashCode() {
        String str = this.keywords;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Page page = this.page;
        return hashCode + (page != null ? page.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SourceSearchRequest(keywords=" + this.keywords + ", page=" + this.page + ')';
    }
}
