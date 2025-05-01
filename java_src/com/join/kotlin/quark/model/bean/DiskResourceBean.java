package com.join.kotlin.quark.model.bean;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: DiskResourceBean.kt */
/* loaded from: classes3.dex */
public final class DiskResourceBean implements Serializable {
    @Nullable
    private final String avatar;
    @Nullable
    private final String disk_url;
    @Nullable
    private final String icon;
    @Nullable
    private final Integer id;
    @Nullable
    private final String intro;
    @Nullable
    private final String nickname;
    @Nullable
    private final Integer priority;
    @Nullable
    private final Integer publisher;
    @Nullable
    private final Boolean recommend;
    @Nullable
    private final String release_time;
    @Nullable
    private final Integer status;
    @Nullable
    private final String tag;
    @Nullable
    private final String tips;
    @Nullable
    private final String title;
    @Nullable
    private final Integer type;

    public DiskResourceBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable String str5, @Nullable Integer num2, @Nullable Integer num3, @Nullable Boolean bool, @Nullable String str6, @Nullable Integer num4, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Integer num5) {
        this.avatar = str;
        this.disk_url = str2;
        this.icon = str3;
        this.id = num;
        this.intro = str4;
        this.nickname = str5;
        this.priority = num2;
        this.publisher = num3;
        this.recommend = bool;
        this.release_time = str6;
        this.status = num4;
        this.tag = str7;
        this.tips = str8;
        this.title = str9;
        this.type = num5;
    }

    @Nullable
    public final String component1() {
        return this.avatar;
    }

    @Nullable
    public final String component10() {
        return this.release_time;
    }

    @Nullable
    public final Integer component11() {
        return this.status;
    }

    @Nullable
    public final String component12() {
        return this.tag;
    }

    @Nullable
    public final String component13() {
        return this.tips;
    }

    @Nullable
    public final String component14() {
        return this.title;
    }

    @Nullable
    public final Integer component15() {
        return this.type;
    }

    @Nullable
    public final String component2() {
        return this.disk_url;
    }

    @Nullable
    public final String component3() {
        return this.icon;
    }

    @Nullable
    public final Integer component4() {
        return this.id;
    }

    @Nullable
    public final String component5() {
        return this.intro;
    }

    @Nullable
    public final String component6() {
        return this.nickname;
    }

    @Nullable
    public final Integer component7() {
        return this.priority;
    }

    @Nullable
    public final Integer component8() {
        return this.publisher;
    }

    @Nullable
    public final Boolean component9() {
        return this.recommend;
    }

    @NotNull
    public final DiskResourceBean copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable String str5, @Nullable Integer num2, @Nullable Integer num3, @Nullable Boolean bool, @Nullable String str6, @Nullable Integer num4, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Integer num5) {
        return new DiskResourceBean(str, str2, str3, num, str4, str5, num2, num3, bool, str6, num4, str7, str8, str9, num5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DiskResourceBean) {
            DiskResourceBean diskResourceBean = (DiskResourceBean) obj;
            return Intrinsics.areEqual(this.avatar, diskResourceBean.avatar) && Intrinsics.areEqual(this.disk_url, diskResourceBean.disk_url) && Intrinsics.areEqual(this.icon, diskResourceBean.icon) && Intrinsics.areEqual(this.id, diskResourceBean.id) && Intrinsics.areEqual(this.intro, diskResourceBean.intro) && Intrinsics.areEqual(this.nickname, diskResourceBean.nickname) && Intrinsics.areEqual(this.priority, diskResourceBean.priority) && Intrinsics.areEqual(this.publisher, diskResourceBean.publisher) && Intrinsics.areEqual(this.recommend, diskResourceBean.recommend) && Intrinsics.areEqual(this.release_time, diskResourceBean.release_time) && Intrinsics.areEqual(this.status, diskResourceBean.status) && Intrinsics.areEqual(this.tag, diskResourceBean.tag) && Intrinsics.areEqual(this.tips, diskResourceBean.tips) && Intrinsics.areEqual(this.title, diskResourceBean.title) && Intrinsics.areEqual(this.type, diskResourceBean.type);
        }
        return false;
    }

    @Nullable
    public final String getAvatar() {
        return this.avatar;
    }

    @Nullable
    public final String getDisk_url() {
        return this.disk_url;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final String getIntro() {
        return this.intro;
    }

    @Nullable
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    public final Integer getPriority() {
        return this.priority;
    }

    @Nullable
    public final Integer getPublisher() {
        return this.publisher;
    }

    @Nullable
    public final Boolean getRecommend() {
        return this.recommend;
    }

    @Nullable
    public final String getRelease_time() {
        return this.release_time;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    public final String getTips() {
        return this.tips;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.avatar;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.disk_url;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.icon;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.id;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.intro;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.nickname;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.priority;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.publisher;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.recommend;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.release_time;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num4 = this.status;
        int hashCode11 = (hashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str7 = this.tag;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.tips;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.title;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num5 = this.type;
        return hashCode14 + (num5 != null ? num5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DiskResourceBean(avatar=" + this.avatar + ", disk_url=" + this.disk_url + ", icon=" + this.icon + ", id=" + this.id + ", intro=" + this.intro + ", nickname=" + this.nickname + ", priority=" + this.priority + ", publisher=" + this.publisher + ", recommend=" + this.recommend + ", release_time=" + this.release_time + ", status=" + this.status + ", tag=" + this.tag + ", tips=" + this.tips + ", title=" + this.title + ", type=" + this.type + ')';
    }
}
