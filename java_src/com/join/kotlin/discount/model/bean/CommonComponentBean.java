package com.join.kotlin.discount.model.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CommonComponentBean.kt */
/* loaded from: classes3.dex */
public final class CommonComponentBean {
    @Nullable
    private String adPosition;
    @Nullable
    private String fromLocal;
    @Nullable
    private String id;
    @Nullable
    private Integer num;
    @Nullable
    private String pic;
    @Nullable
    private Integer selected;
    @Nullable
    private Integer show;
    @Nullable
    private String sub_title;
    @Nullable
    private String title;
    private int type;

    public CommonComponentBean() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public CommonComponentBean(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2, @Nullable String str3, @Nullable String str4, @Nullable Integer num3) {
        this.id = str;
        this.pic = str2;
        this.selected = num;
        this.show = num2;
        this.sub_title = str3;
        this.title = str4;
        this.num = num3;
    }

    public static /* synthetic */ CommonComponentBean copy$default(CommonComponentBean commonComponentBean, String str, String str2, Integer num, Integer num2, String str3, String str4, Integer num3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = commonComponentBean.id;
        }
        if ((i4 & 2) != 0) {
            str2 = commonComponentBean.pic;
        }
        String str5 = str2;
        if ((i4 & 4) != 0) {
            num = commonComponentBean.selected;
        }
        Integer num4 = num;
        if ((i4 & 8) != 0) {
            num2 = commonComponentBean.show;
        }
        Integer num5 = num2;
        if ((i4 & 16) != 0) {
            str3 = commonComponentBean.sub_title;
        }
        String str6 = str3;
        if ((i4 & 32) != 0) {
            str4 = commonComponentBean.title;
        }
        String str7 = str4;
        if ((i4 & 64) != 0) {
            num3 = commonComponentBean.num;
        }
        return commonComponentBean.copy(str, str5, num4, num5, str6, str7, num3);
    }

    @Nullable
    public final String component1() {
        return this.id;
    }

    @Nullable
    public final String component2() {
        return this.pic;
    }

    @Nullable
    public final Integer component3() {
        return this.selected;
    }

    @Nullable
    public final Integer component4() {
        return this.show;
    }

    @Nullable
    public final String component5() {
        return this.sub_title;
    }

    @Nullable
    public final String component6() {
        return this.title;
    }

    @Nullable
    public final Integer component7() {
        return this.num;
    }

    @NotNull
    public final CommonComponentBean copy(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2, @Nullable String str3, @Nullable String str4, @Nullable Integer num3) {
        return new CommonComponentBean(str, str2, num, num2, str3, str4, num3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommonComponentBean) {
            CommonComponentBean commonComponentBean = (CommonComponentBean) obj;
            return Intrinsics.areEqual(this.id, commonComponentBean.id) && Intrinsics.areEqual(this.pic, commonComponentBean.pic) && Intrinsics.areEqual(this.selected, commonComponentBean.selected) && Intrinsics.areEqual(this.show, commonComponentBean.show) && Intrinsics.areEqual(this.sub_title, commonComponentBean.sub_title) && Intrinsics.areEqual(this.title, commonComponentBean.title) && Intrinsics.areEqual(this.num, commonComponentBean.num);
        }
        return false;
    }

    @Nullable
    public final String getAdPosition() {
        return this.adPosition;
    }

    @Nullable
    public final String getFromLocal() {
        return this.fromLocal;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Integer getNum() {
        return this.num;
    }

    @Nullable
    public final String getPic() {
        return this.pic;
    }

    @Nullable
    public final Integer getSelected() {
        return this.selected;
    }

    @Nullable
    public final Integer getShow() {
        return this.show;
    }

    @Nullable
    public final String getSub_title() {
        return this.sub_title;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pic;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.selected;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.show;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.sub_title;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.num;
        return hashCode6 + (num3 != null ? num3.hashCode() : 0);
    }

    public final void setAdPosition(@Nullable String str) {
        this.adPosition = str;
    }

    public final void setFromLocal(@Nullable String str) {
        this.fromLocal = str;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setNum(@Nullable Integer num) {
        this.num = num;
    }

    public final void setPic(@Nullable String str) {
        this.pic = str;
    }

    public final void setSelected(@Nullable Integer num) {
        this.selected = num;
    }

    public final void setShow(@Nullable Integer num) {
        this.show = num;
    }

    public final void setSub_title(@Nullable String str) {
        this.sub_title = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setType(int i4) {
        this.type = i4;
    }

    public final boolean showGiftSubTitle() {
        String str = this.sub_title;
        return ((str == null || str.length() == 0) || Intrinsics.areEqual(this.sub_title, "0")) ? false : true;
    }

    public final boolean showSubTitle() {
        Integer num = this.num;
        return (num != null ? num.intValue() : 0) > 0;
    }

    @Nullable
    public final String subTitleWithDefault(@Nullable String str) {
        String str2 = this.sub_title;
        return str2 == null || str2.length() == 0 ? str : this.sub_title;
    }

    @NotNull
    public String toString() {
        return "CommonComponentBean(id=" + this.id + ", pic=" + this.pic + ", selected=" + this.selected + ", show=" + this.show + ", sub_title=" + this.sub_title + ", title=" + this.title + ", num=" + this.num + ')';
    }

    public /* synthetic */ CommonComponentBean(String str, String str2, Integer num, Integer num2, String str3, String str4, Integer num3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? 0 : num, (i4 & 8) != 0 ? 0 : num2, (i4 & 16) != 0 ? "" : str3, (i4 & 32) == 0 ? str4 : "", (i4 & 64) != 0 ? 0 : num3);
    }
}
