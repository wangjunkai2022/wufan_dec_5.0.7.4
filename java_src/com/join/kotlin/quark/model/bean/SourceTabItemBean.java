package com.join.kotlin.quark.model.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SourceTabItemBean.kt */
/* loaded from: classes3.dex */
public final class SourceTabItemBean {
    @Nullable
    private Boolean active;
    @Nullable
    private final String name;
    @Nullable
    private final Integer tab_id;

    public SourceTabItemBean(@Nullable Boolean bool, @Nullable String str, @Nullable Integer num) {
        this.active = bool;
        this.name = str;
        this.tab_id = num;
    }

    public static /* synthetic */ SourceTabItemBean copy$default(SourceTabItemBean sourceTabItemBean, Boolean bool, String str, Integer num, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            bool = sourceTabItemBean.active;
        }
        if ((i4 & 2) != 0) {
            str = sourceTabItemBean.name;
        }
        if ((i4 & 4) != 0) {
            num = sourceTabItemBean.tab_id;
        }
        return sourceTabItemBean.copy(bool, str, num);
    }

    @Nullable
    public final Boolean component1() {
        return this.active;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final Integer component3() {
        return this.tab_id;
    }

    @NotNull
    public final SourceTabItemBean copy(@Nullable Boolean bool, @Nullable String str, @Nullable Integer num) {
        return new SourceTabItemBean(bool, str, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SourceTabItemBean) {
            SourceTabItemBean sourceTabItemBean = (SourceTabItemBean) obj;
            return Intrinsics.areEqual(this.active, sourceTabItemBean.active) && Intrinsics.areEqual(this.name, sourceTabItemBean.name) && Intrinsics.areEqual(this.tab_id, sourceTabItemBean.tab_id);
        }
        return false;
    }

    @Nullable
    public final Boolean getActive() {
        return this.active;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getTab_id() {
        return this.tab_id;
    }

    public int hashCode() {
        Boolean bool = this.active;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.tab_id;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final void setActive(@Nullable Boolean bool) {
        this.active = bool;
    }

    @NotNull
    public String toString() {
        return "SourceTabItemBean(active=" + this.active + ", name=" + this.name + ", tab_id=" + this.tab_id + ')';
    }
}
