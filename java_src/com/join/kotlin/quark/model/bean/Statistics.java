package com.join.kotlin.quark.model.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: JumpModelEntityListItemBean.kt */
/* loaded from: classes3.dex */
public final class Statistics {
    @Nullable
    private final Integer minGameSearchSource;

    public Statistics(@Nullable Integer num) {
        this.minGameSearchSource = num;
    }

    public static /* synthetic */ Statistics copy$default(Statistics statistics, Integer num, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            num = statistics.minGameSearchSource;
        }
        return statistics.copy(num);
    }

    @Nullable
    public final Integer component1() {
        return this.minGameSearchSource;
    }

    @NotNull
    public final Statistics copy(@Nullable Integer num) {
        return new Statistics(num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Statistics) && Intrinsics.areEqual(this.minGameSearchSource, ((Statistics) obj).minGameSearchSource);
    }

    @Nullable
    public final Integer getMinGameSearchSource() {
        return this.minGameSearchSource;
    }

    public int hashCode() {
        Integer num = this.minGameSearchSource;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @NotNull
    public String toString() {
        return "Statistics(minGameSearchSource=" + this.minGameSearchSource + ')';
    }
}
