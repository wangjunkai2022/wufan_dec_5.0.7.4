package com.psk.kotlin.util;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CommonListMainData.kt */
/* loaded from: classes5.dex */
public final class CommonListMainData {
    @NotNull
    private final Object any;
    private boolean hasExposured;
    @NotNull
    private String id;
    @NotNull
    private String reMarks;
    private final int type;

    public CommonListMainData(int i4, @NotNull Object any, @NotNull String reMarks, @NotNull String id) {
        Intrinsics.checkNotNullParameter(any, "any");
        Intrinsics.checkNotNullParameter(reMarks, "reMarks");
        Intrinsics.checkNotNullParameter(id, "id");
        this.type = i4;
        this.any = any;
        this.reMarks = reMarks;
        this.id = id;
    }

    public static /* synthetic */ CommonListMainData copy$default(CommonListMainData commonListMainData, int i4, Object obj, String str, String str2, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            i4 = commonListMainData.type;
        }
        if ((i5 & 2) != 0) {
            obj = commonListMainData.any;
        }
        if ((i5 & 4) != 0) {
            str = commonListMainData.reMarks;
        }
        if ((i5 & 8) != 0) {
            str2 = commonListMainData.id;
        }
        return commonListMainData.copy(i4, obj, str, str2);
    }

    public final int component1() {
        return this.type;
    }

    @NotNull
    public final Object component2() {
        return this.any;
    }

    @NotNull
    public final String component3() {
        return this.reMarks;
    }

    @NotNull
    public final String component4() {
        return this.id;
    }

    @NotNull
    public final CommonListMainData copy(int i4, @NotNull Object any, @NotNull String reMarks, @NotNull String id) {
        Intrinsics.checkNotNullParameter(any, "any");
        Intrinsics.checkNotNullParameter(reMarks, "reMarks");
        Intrinsics.checkNotNullParameter(id, "id");
        return new CommonListMainData(i4, any, reMarks, id);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommonListMainData) {
            CommonListMainData commonListMainData = (CommonListMainData) obj;
            return this.type == commonListMainData.type && Intrinsics.areEqual(this.any, commonListMainData.any) && Intrinsics.areEqual(this.reMarks, commonListMainData.reMarks) && Intrinsics.areEqual(this.id, commonListMainData.id);
        }
        return false;
    }

    @NotNull
    public final Object getAny() {
        return this.any;
    }

    public final boolean getHasExposured() {
        return this.hasExposured;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getReMarks() {
        return this.reMarks;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.type * 31) + this.any.hashCode()) * 31) + this.reMarks.hashCode()) * 31) + this.id.hashCode();
    }

    public final void setHasExposured(boolean z4) {
        this.hasExposured = z4;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setReMarks(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reMarks = str;
    }

    @NotNull
    public String toString() {
        return "CommonListMainData(type=" + this.type + ", any=" + this.any + ", reMarks=" + this.reMarks + ", id=" + this.id + ')';
    }

    public /* synthetic */ CommonListMainData(int i4, Object obj, String str, String str2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, obj, (i5 & 4) != 0 ? "" : str, (i5 & 8) != 0 ? "" : str2);
    }
}
