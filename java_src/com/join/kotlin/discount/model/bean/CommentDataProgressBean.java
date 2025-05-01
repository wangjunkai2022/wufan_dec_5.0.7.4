package com.join.kotlin.discount.model.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CommentDataProgressBean.kt */
/* loaded from: classes3.dex */
public final class CommentDataProgressBean {
    private int max;
    private int progress;
    private int starCount;
    @Nullable
    private String title;
    private int type;
    @Nullable
    private String userPercent;

    public CommentDataProgressBean(int i4, int i5, int i6, @Nullable String str, int i7, @Nullable String str2) {
        this.progress = i4;
        this.max = i5;
        this.starCount = i6;
        this.title = str;
        this.type = i7;
        this.userPercent = str2;
    }

    public static /* synthetic */ CommentDataProgressBean copy$default(CommentDataProgressBean commentDataProgressBean, int i4, int i5, int i6, String str, int i7, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i4 = commentDataProgressBean.progress;
        }
        if ((i8 & 2) != 0) {
            i5 = commentDataProgressBean.max;
        }
        int i9 = i5;
        if ((i8 & 4) != 0) {
            i6 = commentDataProgressBean.starCount;
        }
        int i10 = i6;
        if ((i8 & 8) != 0) {
            str = commentDataProgressBean.title;
        }
        String str3 = str;
        if ((i8 & 16) != 0) {
            i7 = commentDataProgressBean.type;
        }
        int i11 = i7;
        if ((i8 & 32) != 0) {
            str2 = commentDataProgressBean.userPercent;
        }
        return commentDataProgressBean.copy(i4, i9, i10, str3, i11, str2);
    }

    public final int component1() {
        return this.progress;
    }

    public final int component2() {
        return this.max;
    }

    public final int component3() {
        return this.starCount;
    }

    @Nullable
    public final String component4() {
        return this.title;
    }

    public final int component5() {
        return this.type;
    }

    @Nullable
    public final String component6() {
        return this.userPercent;
    }

    @NotNull
    public final CommentDataProgressBean copy(int i4, int i5, int i6, @Nullable String str, int i7, @Nullable String str2) {
        return new CommentDataProgressBean(i4, i5, i6, str, i7, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommentDataProgressBean) {
            CommentDataProgressBean commentDataProgressBean = (CommentDataProgressBean) obj;
            return this.progress == commentDataProgressBean.progress && this.max == commentDataProgressBean.max && this.starCount == commentDataProgressBean.starCount && Intrinsics.areEqual(this.title, commentDataProgressBean.title) && this.type == commentDataProgressBean.type && Intrinsics.areEqual(this.userPercent, commentDataProgressBean.userPercent);
        }
        return false;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final int getStarCount() {
        return this.starCount;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final String getUserPercent() {
        return this.userPercent;
    }

    public int hashCode() {
        int i4 = ((((this.progress * 31) + this.max) * 31) + this.starCount) * 31;
        String str = this.title;
        int hashCode = (((i4 + (str == null ? 0 : str.hashCode())) * 31) + this.type) * 31;
        String str2 = this.userPercent;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setMax(int i4) {
        this.max = i4;
    }

    public final void setProgress(int i4) {
        this.progress = i4;
    }

    public final void setStarCount(int i4) {
        this.starCount = i4;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setType(int i4) {
        this.type = i4;
    }

    public final void setUserPercent(@Nullable String str) {
        this.userPercent = str;
    }

    @NotNull
    public String toString() {
        return "CommentDataProgressBean(progress=" + this.progress + ", max=" + this.max + ", starCount=" + this.starCount + ", title=" + this.title + ", type=" + this.type + ", userPercent=" + this.userPercent + ')';
    }

    public /* synthetic */ CommentDataProgressBean(int i4, int i5, int i6, String str, int i7, String str2, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i4, (i8 & 2) != 0 ? 100 : i5, (i8 & 4) != 0 ? 1 : i6, (i8 & 8) != 0 ? "" : str, (i8 & 16) != 0 ? 1 : i7, str2);
    }
}
