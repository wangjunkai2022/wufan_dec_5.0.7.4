package com.join.kotlin.discount.model.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CommentTagBean.kt */
/* loaded from: classes3.dex */
public final class CommentTagBean {
    @Nullable
    private String text;
    @Nullable
    private Integer type;

    public CommentTagBean() {
        this(null, null, 3, null);
    }

    public CommentTagBean(@Nullable Integer num, @Nullable String str) {
        this.type = num;
        this.text = str;
    }

    public static /* synthetic */ CommentTagBean copy$default(CommentTagBean commentTagBean, Integer num, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            num = commentTagBean.type;
        }
        if ((i4 & 2) != 0) {
            str = commentTagBean.text;
        }
        return commentTagBean.copy(num, str);
    }

    @Nullable
    public final Integer component1() {
        return this.type;
    }

    @Nullable
    public final String component2() {
        return this.text;
    }

    @NotNull
    public final CommentTagBean copy(@Nullable Integer num, @Nullable String str) {
        return new CommentTagBean(num, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommentTagBean) {
            CommentTagBean commentTagBean = (CommentTagBean) obj;
            return Intrinsics.areEqual(this.type, commentTagBean.type) && Intrinsics.areEqual(this.text, commentTagBean.text);
        }
        return false;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        Integer num = this.type;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.text;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }

    @NotNull
    public String toString() {
        return "CommentTagBean(type=" + this.type + ", text=" + this.text + ')';
    }

    public /* synthetic */ CommentTagBean(Integer num, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 1 : num, (i4 & 2) != 0 ? "" : str);
    }
}
