package com.join.kotlin.quark.model.bean;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SourceListItemBean.kt */
/* loaded from: classes3.dex */
public final class SourceListItemBean implements Serializable {
    @Nullable
    private final String avatar;
    @Nullable
    private DiskResourceBean diskResource;
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
    @Nullable
    private final String typeColor;
    @Nullable
    private final String typeName;
    @Nullable
    private final Integer uid;
    @Nullable
    private final Integer uploaded;
    @Nullable
    private Integer wanted;
    @Nullable
    private Integer wanters;

    public SourceListItemBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable String str5, @Nullable Integer num2, @Nullable Integer num3, @Nullable Boolean bool, @Nullable String str6, @Nullable Integer num4, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable DiskResourceBean diskResourceBean) {
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
        this.typeName = str10;
        this.typeColor = str11;
        this.type = num5;
        this.uid = num6;
        this.uploaded = num7;
        this.wanted = num8;
        this.wanters = num9;
        this.diskResource = diskResourceBean;
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
    public final String component15() {
        return this.typeName;
    }

    @Nullable
    public final String component16() {
        return this.typeColor;
    }

    @Nullable
    public final Integer component17() {
        return this.type;
    }

    @Nullable
    public final Integer component18() {
        return this.uid;
    }

    @Nullable
    public final Integer component19() {
        return this.uploaded;
    }

    @Nullable
    public final String component2() {
        return this.disk_url;
    }

    @Nullable
    public final Integer component20() {
        return this.wanted;
    }

    @Nullable
    public final Integer component21() {
        return this.wanters;
    }

    @Nullable
    public final DiskResourceBean component22() {
        return this.diskResource;
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
    public final SourceListItemBean copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable String str5, @Nullable Integer num2, @Nullable Integer num3, @Nullable Boolean bool, @Nullable String str6, @Nullable Integer num4, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable DiskResourceBean diskResourceBean) {
        return new SourceListItemBean(str, str2, str3, num, str4, str5, num2, num3, bool, str6, num4, str7, str8, str9, str10, str11, num5, num6, num7, num8, num9, diskResourceBean);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SourceListItemBean) {
            SourceListItemBean sourceListItemBean = (SourceListItemBean) obj;
            return Intrinsics.areEqual(this.avatar, sourceListItemBean.avatar) && Intrinsics.areEqual(this.disk_url, sourceListItemBean.disk_url) && Intrinsics.areEqual(this.icon, sourceListItemBean.icon) && Intrinsics.areEqual(this.id, sourceListItemBean.id) && Intrinsics.areEqual(this.intro, sourceListItemBean.intro) && Intrinsics.areEqual(this.nickname, sourceListItemBean.nickname) && Intrinsics.areEqual(this.priority, sourceListItemBean.priority) && Intrinsics.areEqual(this.publisher, sourceListItemBean.publisher) && Intrinsics.areEqual(this.recommend, sourceListItemBean.recommend) && Intrinsics.areEqual(this.release_time, sourceListItemBean.release_time) && Intrinsics.areEqual(this.status, sourceListItemBean.status) && Intrinsics.areEqual(this.tag, sourceListItemBean.tag) && Intrinsics.areEqual(this.tips, sourceListItemBean.tips) && Intrinsics.areEqual(this.title, sourceListItemBean.title) && Intrinsics.areEqual(this.typeName, sourceListItemBean.typeName) && Intrinsics.areEqual(this.typeColor, sourceListItemBean.typeColor) && Intrinsics.areEqual(this.type, sourceListItemBean.type) && Intrinsics.areEqual(this.uid, sourceListItemBean.uid) && Intrinsics.areEqual(this.uploaded, sourceListItemBean.uploaded) && Intrinsics.areEqual(this.wanted, sourceListItemBean.wanted) && Intrinsics.areEqual(this.wanters, sourceListItemBean.wanters) && Intrinsics.areEqual(this.diskResource, sourceListItemBean.diskResource);
        }
        return false;
    }

    @NotNull
    public final String getAuthorName() {
        return this.nickname + this.typeName + "分享";
    }

    @Nullable
    public final String getAvatar() {
        return this.avatar;
    }

    @Nullable
    public final DiskResourceBean getDiskResource() {
        return this.diskResource;
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

    @Nullable
    public final String getTypeColor() {
        return this.typeColor;
    }

    @Nullable
    public final String getTypeName() {
        return this.typeName;
    }

    @Nullable
    public final Integer getUid() {
        return this.uid;
    }

    @Nullable
    public final Integer getUploaded() {
        return this.uploaded;
    }

    @Nullable
    public final Integer getWanted() {
        return this.wanted;
    }

    @Nullable
    public final Integer getWanters() {
        return this.wanters;
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
        String str10 = this.typeName;
        int hashCode15 = (hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.typeColor;
        int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num5 = this.type;
        int hashCode17 = (hashCode16 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.uid;
        int hashCode18 = (hashCode17 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.uploaded;
        int hashCode19 = (hashCode18 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.wanted;
        int hashCode20 = (hashCode19 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.wanters;
        int hashCode21 = (hashCode20 + (num9 == null ? 0 : num9.hashCode())) * 31;
        DiskResourceBean diskResourceBean = this.diskResource;
        return hashCode21 + (diskResourceBean != null ? diskResourceBean.hashCode() : 0);
    }

    public final boolean hideUploadView() {
        Integer num = this.uploaded;
        if (num != null && num.intValue() == 1) {
            return true;
        }
        Integer num2 = this.status;
        return num2 != null && num2.intValue() == 1;
    }

    @Nullable
    public final String iconUrl() {
        DiskResourceBean diskResourceBean;
        String str = this.icon;
        if (str != null || (diskResourceBean = this.diskResource) == null) {
            return str;
        }
        if (diskResourceBean != null) {
            return diskResourceBean.getIcon();
        }
        return null;
    }

    @Nullable
    public final String introText() {
        DiskResourceBean diskResourceBean;
        String str = this.intro;
        if (str != null || (diskResourceBean = this.diskResource) == null) {
            return str;
        }
        if (diskResourceBean != null) {
            return diskResourceBean.getIntro();
        }
        return null;
    }

    public final void setDiskResource(@Nullable DiskResourceBean diskResourceBean) {
        this.diskResource = diskResourceBean;
    }

    public final void setWanted(@Nullable Integer num) {
        this.wanted = num;
    }

    public final void setWanters(@Nullable Integer num) {
        this.wanters = num;
    }

    @NotNull
    public String toString() {
        return "SourceListItemBean(avatar=" + this.avatar + ", disk_url=" + this.disk_url + ", icon=" + this.icon + ", id=" + this.id + ", intro=" + this.intro + ", nickname=" + this.nickname + ", priority=" + this.priority + ", publisher=" + this.publisher + ", recommend=" + this.recommend + ", release_time=" + this.release_time + ", status=" + this.status + ", tag=" + this.tag + ", tips=" + this.tips + ", title=" + this.title + ", typeName=" + this.typeName + ", typeColor=" + this.typeColor + ", type=" + this.type + ", uid=" + this.uid + ", uploaded=" + this.uploaded + ", wanted=" + this.wanted + ", wanters=" + this.wanters + ", diskResource=" + this.diskResource + ')';
    }

    public final boolean wantVisible() {
        Integer num = this.wanters;
        if ((num != null ? num.intValue() : 0) > 0) {
            Integer num2 = this.wanted;
            return (num2 != null ? num2.intValue() : 0) == 0;
        }
        return false;
    }

    public final boolean withWant() {
        Integer num = this.wanters;
        if ((num != null ? num.intValue() : 0) <= 0) {
            Integer num2 = this.wanted;
            return (num2 != null ? num2.intValue() : 0) == 0;
        }
        return false;
    }

    public /* synthetic */ SourceListItemBean(String str, String str2, String str3, Integer num, String str4, String str5, Integer num2, Integer num3, Boolean bool, String str6, Integer num4, String str7, String str8, String str9, String str10, String str11, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, DiskResourceBean diskResourceBean, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, num, str4, str5, num2, num3, bool, str6, (i4 & 1024) != 0 ? 0 : num4, str7, str8, str9, str10, (i4 & 32768) != 0 ? "#000000" : str11, num5, num6, num7, num8, num9, diskResourceBean);
    }
}
