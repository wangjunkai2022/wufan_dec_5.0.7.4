package com.join.kotlin.quark.model.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: PageBean.kt */
/* loaded from: classes3.dex */
public final class Page {
    private final int limit;
    private int page;

    public Page(int i4, int i5) {
        this.page = i4;
        this.limit = i5;
    }

    public static /* synthetic */ Page copy$default(Page page, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = page.page;
        }
        if ((i6 & 2) != 0) {
            i5 = page.limit;
        }
        return page.copy(i4, i5);
    }

    public final int component1() {
        return this.page;
    }

    public final int component2() {
        return this.limit;
    }

    @NotNull
    public final Page copy(int i4, int i5) {
        return new Page(i4, i5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Page) {
            Page page = (Page) obj;
            return this.page == page.page && this.limit == page.limit;
        }
        return false;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final int getPage() {
        return this.page;
    }

    public int hashCode() {
        return (this.page * 31) + this.limit;
    }

    public final void setPage(int i4) {
        this.page = i4;
    }

    @NotNull
    public String toString() {
        return "Page(page=" + this.page + ", limit=" + this.limit + ')';
    }

    public /* synthetic */ Page(int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, (i6 & 2) != 0 ? 20 : i5);
    }
}
