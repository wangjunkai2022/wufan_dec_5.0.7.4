package com.join.kotlin.discount.model.bean;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CommentDetailBean.kt */
/* loaded from: classes3.dex */
public final class CommentDetailBean {
    @Nullable
    private final String avatar;
    @Nullable
    private final String comment_id;
    @Nullable
    private final String content;
    @Nullable
    private Integer like;
    @Nullable
    private Boolean my_like;
    @Nullable
    private final String nickname;
    @Nullable
    private final String show_time;
    @Nullable
    private final List<CommentTagBean> tags;
    @Nullable
    private final String uid;

    public CommentDetailBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Boolean bool, @Nullable String str4, @Nullable String str5, @Nullable List<CommentTagBean> list, @Nullable String str6) {
        this.avatar = str;
        this.comment_id = str2;
        this.content = str3;
        this.like = num;
        this.my_like = bool;
        this.nickname = str4;
        this.show_time = str5;
        this.tags = list;
        this.uid = str6;
    }

    @Nullable
    public final String component1() {
        return this.avatar;
    }

    @Nullable
    public final String component2() {
        return this.comment_id;
    }

    @Nullable
    public final String component3() {
        return this.content;
    }

    @Nullable
    public final Integer component4() {
        return this.like;
    }

    @Nullable
    public final Boolean component5() {
        return this.my_like;
    }

    @Nullable
    public final String component6() {
        return this.nickname;
    }

    @Nullable
    public final String component7() {
        return this.show_time;
    }

    @Nullable
    public final List<CommentTagBean> component8() {
        return this.tags;
    }

    @Nullable
    public final String component9() {
        return this.uid;
    }

    @NotNull
    public final CommentDetailBean copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Boolean bool, @Nullable String str4, @Nullable String str5, @Nullable List<CommentTagBean> list, @Nullable String str6) {
        return new CommentDetailBean(str, str2, str3, num, bool, str4, str5, list, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommentDetailBean) {
            CommentDetailBean commentDetailBean = (CommentDetailBean) obj;
            return Intrinsics.areEqual(this.avatar, commentDetailBean.avatar) && Intrinsics.areEqual(this.comment_id, commentDetailBean.comment_id) && Intrinsics.areEqual(this.content, commentDetailBean.content) && Intrinsics.areEqual(this.like, commentDetailBean.like) && Intrinsics.areEqual(this.my_like, commentDetailBean.my_like) && Intrinsics.areEqual(this.nickname, commentDetailBean.nickname) && Intrinsics.areEqual(this.show_time, commentDetailBean.show_time) && Intrinsics.areEqual(this.tags, commentDetailBean.tags) && Intrinsics.areEqual(this.uid, commentDetailBean.uid);
        }
        return false;
    }

    @Nullable
    public final String getAvatar() {
        return this.avatar;
    }

    @Nullable
    public final String getComment_id() {
        return this.comment_id;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final Integer getLike() {
        return this.like;
    }

    @Nullable
    public final Boolean getMy_like() {
        return this.my_like;
    }

    @Nullable
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    public final String getShow_time() {
        return this.show_time;
    }

    @Nullable
    public final List<CommentTagBean> getTags() {
        return this.tags;
    }

    @Nullable
    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        String str = this.avatar;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.comment_id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.content;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.like;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.my_like;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.nickname;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.show_time;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<CommentTagBean> list = this.tags;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.uid;
        return hashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setLike(@Nullable Integer num) {
        this.like = num;
    }

    public final void setMy_like(@Nullable Boolean bool) {
        this.my_like = bool;
    }

    @NotNull
    public String toString() {
        return "CommentDetailBean(avatar=" + this.avatar + ", comment_id=" + this.comment_id + ", content=" + this.content + ", like=" + this.like + ", my_like=" + this.my_like + ", nickname=" + this.nickname + ", show_time=" + this.show_time + ", tags=" + this.tags + ", uid=" + this.uid + ')';
    }
}
