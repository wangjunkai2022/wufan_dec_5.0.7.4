package com.join.kotlin.discount.model.bean;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CommentStatisticDataBean.kt */
/* loaded from: classes3.dex */
public final class CommentStatisticDataBean {
    @Nullable
    private final String avg_duration;
    @Nullable
    private final String avg_score;
    @Nullable
    private final List<Double> duration;
    @Nullable
    private final String good_rate;
    @Nullable
    private final List<Double> score;

    public CommentStatisticDataBean(@Nullable String str, @Nullable String str2, @Nullable List<Double> list, @Nullable String str3, @Nullable List<Double> list2) {
        this.avg_duration = str;
        this.avg_score = str2;
        this.duration = list;
        this.good_rate = str3;
        this.score = list2;
    }

    public static /* synthetic */ CommentStatisticDataBean copy$default(CommentStatisticDataBean commentStatisticDataBean, String str, String str2, List list, String str3, List list2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = commentStatisticDataBean.avg_duration;
        }
        if ((i4 & 2) != 0) {
            str2 = commentStatisticDataBean.avg_score;
        }
        String str4 = str2;
        List<Double> list3 = list;
        if ((i4 & 4) != 0) {
            list3 = commentStatisticDataBean.duration;
        }
        List list4 = list3;
        if ((i4 & 8) != 0) {
            str3 = commentStatisticDataBean.good_rate;
        }
        String str5 = str3;
        List<Double> list5 = list2;
        if ((i4 & 16) != 0) {
            list5 = commentStatisticDataBean.score;
        }
        return commentStatisticDataBean.copy(str, str4, list4, str5, list5);
    }

    @Nullable
    public final String component1() {
        return this.avg_duration;
    }

    @Nullable
    public final String component2() {
        return this.avg_score;
    }

    @Nullable
    public final List<Double> component3() {
        return this.duration;
    }

    @Nullable
    public final String component4() {
        return this.good_rate;
    }

    @Nullable
    public final List<Double> component5() {
        return this.score;
    }

    @NotNull
    public final CommentStatisticDataBean copy(@Nullable String str, @Nullable String str2, @Nullable List<Double> list, @Nullable String str3, @Nullable List<Double> list2) {
        return new CommentStatisticDataBean(str, str2, list, str3, list2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommentStatisticDataBean) {
            CommentStatisticDataBean commentStatisticDataBean = (CommentStatisticDataBean) obj;
            return Intrinsics.areEqual(this.avg_duration, commentStatisticDataBean.avg_duration) && Intrinsics.areEqual(this.avg_score, commentStatisticDataBean.avg_score) && Intrinsics.areEqual(this.duration, commentStatisticDataBean.duration) && Intrinsics.areEqual(this.good_rate, commentStatisticDataBean.good_rate) && Intrinsics.areEqual(this.score, commentStatisticDataBean.score);
        }
        return false;
    }

    @Nullable
    public final String getAvg_duration() {
        return this.avg_duration;
    }

    @Nullable
    public final String getAvg_score() {
        return this.avg_score;
    }

    @Nullable
    public final List<Double> getDuration() {
        return this.duration;
    }

    @Nullable
    public final String getGood_rate() {
        return this.good_rate;
    }

    @Nullable
    public final List<Double> getScore() {
        return this.score;
    }

    public int hashCode() {
        String str = this.avg_duration;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.avg_score;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Double> list = this.duration;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.good_rate;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Double> list2 = this.score;
        return hashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CommentStatisticDataBean(avg_duration=" + this.avg_duration + ", avg_score=" + this.avg_score + ", duration=" + this.duration + ", good_rate=" + this.good_rate + ", score=" + this.score + ')';
    }
}
