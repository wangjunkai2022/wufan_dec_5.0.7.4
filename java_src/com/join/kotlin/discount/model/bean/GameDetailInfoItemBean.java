package com.join.kotlin.discount.model.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailInfoItemBean.kt */
/* loaded from: classes3.dex */
public final class GameDetailInfoItemBean {
    @Nullable
    private Integer iconRes;
    @Nullable
    private Boolean showArrow;
    @Nullable
    private String title;
    @Nullable
    private String value;

    public GameDetailInfoItemBean(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
        this.iconRes = num;
        this.title = str;
        this.value = str2;
        this.showArrow = bool;
    }

    public static /* synthetic */ GameDetailInfoItemBean copy$default(GameDetailInfoItemBean gameDetailInfoItemBean, Integer num, String str, String str2, Boolean bool, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            num = gameDetailInfoItemBean.iconRes;
        }
        if ((i4 & 2) != 0) {
            str = gameDetailInfoItemBean.title;
        }
        if ((i4 & 4) != 0) {
            str2 = gameDetailInfoItemBean.value;
        }
        if ((i4 & 8) != 0) {
            bool = gameDetailInfoItemBean.showArrow;
        }
        return gameDetailInfoItemBean.copy(num, str, str2, bool);
    }

    @Nullable
    public final Integer component1() {
        return this.iconRes;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    @Nullable
    public final String component3() {
        return this.value;
    }

    @Nullable
    public final Boolean component4() {
        return this.showArrow;
    }

    @NotNull
    public final GameDetailInfoItemBean copy(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
        return new GameDetailInfoItemBean(num, str, str2, bool);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GameDetailInfoItemBean) {
            GameDetailInfoItemBean gameDetailInfoItemBean = (GameDetailInfoItemBean) obj;
            return Intrinsics.areEqual(this.iconRes, gameDetailInfoItemBean.iconRes) && Intrinsics.areEqual(this.title, gameDetailInfoItemBean.title) && Intrinsics.areEqual(this.value, gameDetailInfoItemBean.value) && Intrinsics.areEqual(this.showArrow, gameDetailInfoItemBean.showArrow);
        }
        return false;
    }

    @Nullable
    public final Integer getIconRes() {
        return this.iconRes;
    }

    @Nullable
    public final Boolean getShowArrow() {
        return this.showArrow;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        Integer num = this.iconRes;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.value;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.showArrow;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setIconRes(@Nullable Integer num) {
        this.iconRes = num;
    }

    public final void setShowArrow(@Nullable Boolean bool) {
        this.showArrow = bool;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setValue(@Nullable String str) {
        this.value = str;
    }

    @NotNull
    public String toString() {
        return "GameDetailInfoItemBean(iconRes=" + this.iconRes + ", title=" + this.title + ", value=" + this.value + ", showArrow=" + this.showArrow + ')';
    }

    public /* synthetic */ GameDetailInfoItemBean(Integer num, String str, String str2, Boolean bool, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, str2, (i4 & 8) != 0 ? Boolean.TRUE : bool);
    }
}
