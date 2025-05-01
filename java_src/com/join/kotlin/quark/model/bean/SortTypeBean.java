package com.join.kotlin.quark.model.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SortTypeBean.kt */
/* loaded from: classes3.dex */
public final class SortTypeBean {
    private final int type;
    @NotNull
    private final String typeName;

    public SortTypeBean(int i4, @NotNull String typeName) {
        Intrinsics.checkNotNullParameter(typeName, "typeName");
        this.type = i4;
        this.typeName = typeName;
    }

    public static /* synthetic */ SortTypeBean copy$default(SortTypeBean sortTypeBean, int i4, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = sortTypeBean.type;
        }
        if ((i5 & 2) != 0) {
            str = sortTypeBean.typeName;
        }
        return sortTypeBean.copy(i4, str);
    }

    public final int component1() {
        return this.type;
    }

    @NotNull
    public final String component2() {
        return this.typeName;
    }

    @NotNull
    public final SortTypeBean copy(int i4, @NotNull String typeName) {
        Intrinsics.checkNotNullParameter(typeName, "typeName");
        return new SortTypeBean(i4, typeName);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SortTypeBean) {
            SortTypeBean sortTypeBean = (SortTypeBean) obj;
            return this.type == sortTypeBean.type && Intrinsics.areEqual(this.typeName, sortTypeBean.typeName);
        }
        return false;
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final String getTypeName() {
        return this.typeName;
    }

    public int hashCode() {
        return (this.type * 31) + this.typeName.hashCode();
    }

    @NotNull
    public String toString() {
        return "SortTypeBean(type=" + this.type + ", typeName=" + this.typeName + ')';
    }
}
