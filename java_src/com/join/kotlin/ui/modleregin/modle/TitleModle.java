package com.join.kotlin.ui.modleregin.modle;

import com.join.mgps.Util.IntentDateBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: TitleModle.kt */
/* loaded from: classes3.dex */
public final class TitleModle {
    @Nullable
    private final IntentDateBean intentDateBean;
    @Nullable
    private final Boolean showWhiteBack;
    @Nullable
    private final String subTitle;
    @NotNull
    private final String title;

    public TitleModle(@NotNull String title, @Nullable String str, @Nullable IntentDateBean intentDateBean, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subTitle = str;
        this.intentDateBean = intentDateBean;
        this.showWhiteBack = bool;
    }

    public static /* synthetic */ TitleModle copy$default(TitleModle titleModle, String str, String str2, IntentDateBean intentDateBean, Boolean bool, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = titleModle.title;
        }
        if ((i4 & 2) != 0) {
            str2 = titleModle.subTitle;
        }
        if ((i4 & 4) != 0) {
            intentDateBean = titleModle.intentDateBean;
        }
        if ((i4 & 8) != 0) {
            bool = titleModle.showWhiteBack;
        }
        return titleModle.copy(str, str2, intentDateBean, bool);
    }

    @NotNull
    public final String component1() {
        return this.title;
    }

    @Nullable
    public final String component2() {
        return this.subTitle;
    }

    @Nullable
    public final IntentDateBean component3() {
        return this.intentDateBean;
    }

    @Nullable
    public final Boolean component4() {
        return this.showWhiteBack;
    }

    @NotNull
    public final TitleModle copy(@NotNull String title, @Nullable String str, @Nullable IntentDateBean intentDateBean, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new TitleModle(title, str, intentDateBean, bool);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TitleModle) {
            TitleModle titleModle = (TitleModle) obj;
            return Intrinsics.areEqual(this.title, titleModle.title) && Intrinsics.areEqual(this.subTitle, titleModle.subTitle) && Intrinsics.areEqual(this.intentDateBean, titleModle.intentDateBean) && Intrinsics.areEqual(this.showWhiteBack, titleModle.showWhiteBack);
        }
        return false;
    }

    @Nullable
    public final IntentDateBean getIntentDateBean() {
        return this.intentDateBean;
    }

    @Nullable
    public final Boolean getShowWhiteBack() {
        return this.showWhiteBack;
    }

    @Nullable
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        IntentDateBean intentDateBean = this.intentDateBean;
        int hashCode3 = (hashCode2 + (intentDateBean == null ? 0 : intentDateBean.hashCode())) * 31;
        Boolean bool = this.showWhiteBack;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TitleModle(title=" + this.title + ", subTitle=" + this.subTitle + ", intentDateBean=" + this.intentDateBean + ", showWhiteBack=" + this.showWhiteBack + ')';
    }

    public /* synthetic */ TitleModle(String str, String str2, IntentDateBean intentDateBean, Boolean bool, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, intentDateBean, (i4 & 8) != 0 ? Boolean.FALSE : bool);
    }
}
