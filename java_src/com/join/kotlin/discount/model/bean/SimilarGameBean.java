package com.join.kotlin.discount.model.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SimilarGameBean.kt */
/* loaded from: classes3.dex */
public final class SimilarGameBean {
    @Nullable
    private String game_icon;
    @Nullable
    private String game_id;
    @Nullable
    private String game_name;
    @Nullable
    private String game_pic_url;
    @Nullable
    private Integer play_count;

    public SimilarGameBean() {
        this(null, null, null, null, null, 31, null);
    }

    public SimilarGameBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num) {
        this.game_id = str;
        this.game_name = str2;
        this.game_icon = str3;
        this.game_pic_url = str4;
        this.play_count = num;
    }

    public static /* synthetic */ SimilarGameBean copy$default(SimilarGameBean similarGameBean, String str, String str2, String str3, String str4, Integer num, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = similarGameBean.game_id;
        }
        if ((i4 & 2) != 0) {
            str2 = similarGameBean.game_name;
        }
        String str5 = str2;
        if ((i4 & 4) != 0) {
            str3 = similarGameBean.game_icon;
        }
        String str6 = str3;
        if ((i4 & 8) != 0) {
            str4 = similarGameBean.game_pic_url;
        }
        String str7 = str4;
        if ((i4 & 16) != 0) {
            num = similarGameBean.play_count;
        }
        return similarGameBean.copy(str, str5, str6, str7, num);
    }

    @Nullable
    public final String component1() {
        return this.game_id;
    }

    @Nullable
    public final String component2() {
        return this.game_name;
    }

    @Nullable
    public final String component3() {
        return this.game_icon;
    }

    @Nullable
    public final String component4() {
        return this.game_pic_url;
    }

    @Nullable
    public final Integer component5() {
        return this.play_count;
    }

    @NotNull
    public final SimilarGameBean copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num) {
        return new SimilarGameBean(str, str2, str3, str4, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SimilarGameBean) {
            SimilarGameBean similarGameBean = (SimilarGameBean) obj;
            return Intrinsics.areEqual(this.game_id, similarGameBean.game_id) && Intrinsics.areEqual(this.game_name, similarGameBean.game_name) && Intrinsics.areEqual(this.game_icon, similarGameBean.game_icon) && Intrinsics.areEqual(this.game_pic_url, similarGameBean.game_pic_url) && Intrinsics.areEqual(this.play_count, similarGameBean.play_count);
        }
        return false;
    }

    @Nullable
    public final String getGame_icon() {
        return this.game_icon;
    }

    @Nullable
    public final String getGame_id() {
        return this.game_id;
    }

    @Nullable
    public final String getGame_name() {
        return this.game_name;
    }

    @Nullable
    public final String getGame_pic_url() {
        return this.game_pic_url;
    }

    @Nullable
    public final Integer getPlay_count() {
        return this.play_count;
    }

    public int hashCode() {
        String str = this.game_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.game_name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.game_icon;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.game_pic_url;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.play_count;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final void setGame_icon(@Nullable String str) {
        this.game_icon = str;
    }

    public final void setGame_id(@Nullable String str) {
        this.game_id = str;
    }

    public final void setGame_name(@Nullable String str) {
        this.game_name = str;
    }

    public final void setGame_pic_url(@Nullable String str) {
        this.game_pic_url = str;
    }

    public final void setPlay_count(@Nullable Integer num) {
        this.play_count = num;
    }

    @NotNull
    public String toString() {
        return "SimilarGameBean(game_id=" + this.game_id + ", game_name=" + this.game_name + ", game_icon=" + this.game_icon + ", game_pic_url=" + this.game_pic_url + ", play_count=" + this.play_count + ')';
    }

    public /* synthetic */ SimilarGameBean(String str, String str2, String str3, String str4, Integer num, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) == 0 ? str4 : "", (i4 & 16) != 0 ? 0 : num);
    }
}
