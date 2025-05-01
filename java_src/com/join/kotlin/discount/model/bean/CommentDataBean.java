package com.join.kotlin.discount.model.bean;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CommentDataBean.kt */
/* loaded from: classes3.dex */
public final class CommentDataBean {
    @Nullable
    private List<CommentDetailBean> commentList;
    @Nullable
    private CommentStatisticDataBean commentScores;

    public CommentDataBean(@Nullable List<CommentDetailBean> list, @Nullable CommentStatisticDataBean commentStatisticDataBean) {
        this.commentList = list;
        this.commentScores = commentStatisticDataBean;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommentDataBean copy$default(CommentDataBean commentDataBean, List list, CommentStatisticDataBean commentStatisticDataBean, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = commentDataBean.commentList;
        }
        if ((i4 & 2) != 0) {
            commentStatisticDataBean = commentDataBean.commentScores;
        }
        return commentDataBean.copy(list, commentStatisticDataBean);
    }

    @Nullable
    public final List<CommentDetailBean> component1() {
        return this.commentList;
    }

    @Nullable
    public final CommentStatisticDataBean component2() {
        return this.commentScores;
    }

    @NotNull
    public final CommentDataBean copy(@Nullable List<CommentDetailBean> list, @Nullable CommentStatisticDataBean commentStatisticDataBean) {
        return new CommentDataBean(list, commentStatisticDataBean);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommentDataBean) {
            CommentDataBean commentDataBean = (CommentDataBean) obj;
            return Intrinsics.areEqual(this.commentList, commentDataBean.commentList) && Intrinsics.areEqual(this.commentScores, commentDataBean.commentScores);
        }
        return false;
    }

    @Nullable
    public final List<CommentDetailBean> getCommentList() {
        return this.commentList;
    }

    @Nullable
    public final CommentStatisticDataBean getCommentScores() {
        return this.commentScores;
    }

    public int hashCode() {
        List<CommentDetailBean> list = this.commentList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        CommentStatisticDataBean commentStatisticDataBean = this.commentScores;
        return hashCode + (commentStatisticDataBean != null ? commentStatisticDataBean.hashCode() : 0);
    }

    public final void setCommentList(@Nullable List<CommentDetailBean> list) {
        this.commentList = list;
    }

    public final void setCommentScores(@Nullable CommentStatisticDataBean commentStatisticDataBean) {
        this.commentScores = commentStatisticDataBean;
    }

    @NotNull
    public String toString() {
        return "CommentDataBean(commentList=" + this.commentList + ", commentScores=" + this.commentScores + ')';
    }
}
