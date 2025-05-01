package com.join.kotlin.discount.model.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailDialogInfoBean.kt */
/* loaded from: classes3.dex */
public final class GameDetailDialogInfoBean {
    @Nullable
    private String content;
    @Nullable
    private String title;

    public GameDetailDialogInfoBean() {
        this(null, null, 3, null);
    }

    public GameDetailDialogInfoBean(@Nullable String str, @Nullable String str2) {
        this.title = str;
        this.content = str2;
    }

    public static /* synthetic */ GameDetailDialogInfoBean copy$default(GameDetailDialogInfoBean gameDetailDialogInfoBean, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = gameDetailDialogInfoBean.title;
        }
        if ((i4 & 2) != 0) {
            str2 = gameDetailDialogInfoBean.content;
        }
        return gameDetailDialogInfoBean.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    @Nullable
    public final String component2() {
        return this.content;
    }

    @NotNull
    public final GameDetailDialogInfoBean copy(@Nullable String str, @Nullable String str2) {
        return new GameDetailDialogInfoBean(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GameDetailDialogInfoBean) {
            GameDetailDialogInfoBean gameDetailDialogInfoBean = (GameDetailDialogInfoBean) obj;
            return Intrinsics.areEqual(this.title, gameDetailDialogInfoBean.title) && Intrinsics.areEqual(this.content, gameDetailDialogInfoBean.content);
        }
        return false;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "GameDetailDialogInfoBean(title=" + this.title + ", content=" + this.content + ')';
    }

    public /* synthetic */ GameDetailDialogInfoBean(String str, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2);
    }
}
