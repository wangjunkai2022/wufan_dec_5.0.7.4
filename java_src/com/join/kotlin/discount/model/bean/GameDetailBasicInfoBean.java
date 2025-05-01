package com.join.kotlin.discount.model.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailBasicInfoBean.kt */
@SourceDebugExtension({"SMAP\nGameDetailBasicInfoBean.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailBasicInfoBean.kt\ncom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,58:1\n1549#2:59\n1620#2,3:60\n1549#2:63\n1620#2,3:64\n384#3,4:67\n*S KotlinDebug\n*F\n+ 1 GameDetailBasicInfoBean.kt\ncom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean\n*L\n28#1:59\n28#1:60,3\n30#1:63\n30#1:64,3\n36#1:67,4\n*E\n"})
/* loaded from: classes3.dex */
public final class GameDetailBasicInfoBean {
    @Nullable
    private Long app_size;
    @Nullable
    private String company_name;
    @Nullable
    private Double discount;
    @Nullable
    private String discount_name;
    @Nullable
    private Integer down_count;
    @Nullable
    private String down_url;
    @Nullable
    private String download_btn_pic;
    @Nullable
    private String fit_age;
    @Nullable
    private String info;
    @Nullable
    private Integer is_refund;
    @Nullable
    private Long latest_server_time;
    @Nullable
    private Integer on_off;
    @Nullable
    private String package_name;
    @Nullable
    private List<GameDetailDialogInfoBean> permissions;
    @Nullable
    private Integer play_count;
    @Nullable
    private String refund_pic;
    @Nullable
    private List<String> sp_tag_name;
    @Nullable
    private List<TagBean> tags;
    @Nullable
    private Integer ver;
    @Nullable
    private String ver_name;

    public GameDetailBasicInfoBean() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public GameDetailBasicInfoBean(@Nullable Long l4, @Nullable String str, @Nullable Double d5, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Long l5, @Nullable String str6, @Nullable Integer num2, @Nullable List<String> list, @Nullable List<TagBean> list2, @Nullable Integer num3, @Nullable String str7, @Nullable List<GameDetailDialogInfoBean> list3, @Nullable Integer num4, @Nullable String str8, @Nullable Integer num5, @Nullable String str9) {
        this.app_size = l4;
        this.company_name = str;
        this.discount = d5;
        this.discount_name = str2;
        this.down_count = num;
        this.down_url = str3;
        this.fit_age = str4;
        this.info = str5;
        this.latest_server_time = l5;
        this.package_name = str6;
        this.play_count = num2;
        this.sp_tag_name = list;
        this.tags = list2;
        this.ver = num3;
        this.ver_name = str7;
        this.permissions = list3;
        this.is_refund = num4;
        this.refund_pic = str8;
        this.on_off = num5;
        this.download_btn_pic = str9;
    }

    @Nullable
    public final Long component1() {
        return this.app_size;
    }

    @Nullable
    public final String component10() {
        return this.package_name;
    }

    @Nullable
    public final Integer component11() {
        return this.play_count;
    }

    @Nullable
    public final List<String> component12() {
        return this.sp_tag_name;
    }

    @Nullable
    public final List<TagBean> component13() {
        return this.tags;
    }

    @Nullable
    public final Integer component14() {
        return this.ver;
    }

    @Nullable
    public final String component15() {
        return this.ver_name;
    }

    @Nullable
    public final List<GameDetailDialogInfoBean> component16() {
        return this.permissions;
    }

    @Nullable
    public final Integer component17() {
        return this.is_refund;
    }

    @Nullable
    public final String component18() {
        return this.refund_pic;
    }

    @Nullable
    public final Integer component19() {
        return this.on_off;
    }

    @Nullable
    public final String component2() {
        return this.company_name;
    }

    @Nullable
    public final String component20() {
        return this.download_btn_pic;
    }

    @Nullable
    public final Double component3() {
        return this.discount;
    }

    @Nullable
    public final String component4() {
        return this.discount_name;
    }

    @Nullable
    public final Integer component5() {
        return this.down_count;
    }

    @Nullable
    public final String component6() {
        return this.down_url;
    }

    @Nullable
    public final String component7() {
        return this.fit_age;
    }

    @Nullable
    public final String component8() {
        return this.info;
    }

    @Nullable
    public final Long component9() {
        return this.latest_server_time;
    }

    @NotNull
    public final GameDetailBasicInfoBean copy(@Nullable Long l4, @Nullable String str, @Nullable Double d5, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Long l5, @Nullable String str6, @Nullable Integer num2, @Nullable List<String> list, @Nullable List<TagBean> list2, @Nullable Integer num3, @Nullable String str7, @Nullable List<GameDetailDialogInfoBean> list3, @Nullable Integer num4, @Nullable String str8, @Nullable Integer num5, @Nullable String str9) {
        return new GameDetailBasicInfoBean(l4, str, d5, str2, num, str3, str4, str5, l5, str6, num2, list, list2, num3, str7, list3, num4, str8, num5, str9);
    }

    @NotNull
    public final String discountStr() {
        int lastIndex;
        String str;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        Double d5 = this.discount;
        double doubleValue = d5 != null ? d5.doubleValue() : 0.0d;
        double d6 = 10.0f;
        Double.isNaN(d6);
        objArr[0] = Double.valueOf(doubleValue / d6);
        String format = String.format("%.2f", Arrays.copyOf(objArr, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
        lastIndex = StringsKt__StringsKt.getLastIndex(format);
        while (true) {
            if (-1 >= lastIndex) {
                str = "";
                break;
            }
            if (!(format.charAt(lastIndex) == '0')) {
                str = format.substring(0, lastIndex + 1);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
                break;
            }
            lastIndex--;
        }
        sb.append(str);
        sb.append((char) 25240);
        return sb.toString();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GameDetailBasicInfoBean) {
            GameDetailBasicInfoBean gameDetailBasicInfoBean = (GameDetailBasicInfoBean) obj;
            return Intrinsics.areEqual(this.app_size, gameDetailBasicInfoBean.app_size) && Intrinsics.areEqual(this.company_name, gameDetailBasicInfoBean.company_name) && Intrinsics.areEqual((Object) this.discount, (Object) gameDetailBasicInfoBean.discount) && Intrinsics.areEqual(this.discount_name, gameDetailBasicInfoBean.discount_name) && Intrinsics.areEqual(this.down_count, gameDetailBasicInfoBean.down_count) && Intrinsics.areEqual(this.down_url, gameDetailBasicInfoBean.down_url) && Intrinsics.areEqual(this.fit_age, gameDetailBasicInfoBean.fit_age) && Intrinsics.areEqual(this.info, gameDetailBasicInfoBean.info) && Intrinsics.areEqual(this.latest_server_time, gameDetailBasicInfoBean.latest_server_time) && Intrinsics.areEqual(this.package_name, gameDetailBasicInfoBean.package_name) && Intrinsics.areEqual(this.play_count, gameDetailBasicInfoBean.play_count) && Intrinsics.areEqual(this.sp_tag_name, gameDetailBasicInfoBean.sp_tag_name) && Intrinsics.areEqual(this.tags, gameDetailBasicInfoBean.tags) && Intrinsics.areEqual(this.ver, gameDetailBasicInfoBean.ver) && Intrinsics.areEqual(this.ver_name, gameDetailBasicInfoBean.ver_name) && Intrinsics.areEqual(this.permissions, gameDetailBasicInfoBean.permissions) && Intrinsics.areEqual(this.is_refund, gameDetailBasicInfoBean.is_refund) && Intrinsics.areEqual(this.refund_pic, gameDetailBasicInfoBean.refund_pic) && Intrinsics.areEqual(this.on_off, gameDetailBasicInfoBean.on_off) && Intrinsics.areEqual(this.download_btn_pic, gameDetailBasicInfoBean.download_btn_pic);
        }
        return false;
    }

    @Nullable
    public final Long getApp_size() {
        return this.app_size;
    }

    @Nullable
    public final String getCompany_name() {
        return this.company_name;
    }

    @Nullable
    public final Double getDiscount() {
        return this.discount;
    }

    @Nullable
    public final String getDiscount_name() {
        return this.discount_name;
    }

    @Nullable
    public final Integer getDown_count() {
        return this.down_count;
    }

    @Nullable
    public final String getDown_url() {
        return this.down_url;
    }

    @Nullable
    public final String getDownload_btn_pic() {
        return this.download_btn_pic;
    }

    @Nullable
    public final String getFit_age() {
        return this.fit_age;
    }

    @Nullable
    public final String getInfo() {
        return this.info;
    }

    @Nullable
    public final Long getLatest_server_time() {
        return this.latest_server_time;
    }

    @Nullable
    public final Integer getOn_off() {
        return this.on_off;
    }

    @Nullable
    public final String getPackage_name() {
        return this.package_name;
    }

    @Nullable
    public final List<GameDetailDialogInfoBean> getPermissions() {
        return this.permissions;
    }

    @Nullable
    public final Integer getPlay_count() {
        return this.play_count;
    }

    @Nullable
    public final String getRefund_pic() {
        return this.refund_pic;
    }

    @Nullable
    public final List<String> getSp_tag_name() {
        return this.sp_tag_name;
    }

    @Nullable
    public final List<TagBean> getTags() {
        return this.tags;
    }

    @Nullable
    public final Integer getVer() {
        return this.ver;
    }

    @Nullable
    public final String getVer_name() {
        return this.ver_name;
    }

    public int hashCode() {
        Long l4 = this.app_size;
        int hashCode = (l4 == null ? 0 : l4.hashCode()) * 31;
        String str = this.company_name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d5 = this.discount;
        int hashCode3 = (hashCode2 + (d5 == null ? 0 : d5.hashCode())) * 31;
        String str2 = this.discount_name;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.down_count;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.down_url;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fit_age;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.info;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l5 = this.latest_server_time;
        int hashCode9 = (hashCode8 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str6 = this.package_name;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.play_count;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<String> list = this.sp_tag_name;
        int hashCode12 = (hashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        List<TagBean> list2 = this.tags;
        int hashCode13 = (hashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num3 = this.ver;
        int hashCode14 = (hashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str7 = this.ver_name;
        int hashCode15 = (hashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<GameDetailDialogInfoBean> list3 = this.permissions;
        int hashCode16 = (hashCode15 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num4 = this.is_refund;
        int hashCode17 = (hashCode16 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str8 = this.refund_pic;
        int hashCode18 = (hashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num5 = this.on_off;
        int hashCode19 = (hashCode18 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str9 = this.download_btn_pic;
        return hashCode19 + (str9 != null ? str9.hashCode() : 0);
    }

    @Nullable
    public final Integer is_refund() {
        return this.is_refund;
    }

    public final void setApp_size(@Nullable Long l4) {
        this.app_size = l4;
    }

    public final void setCompany_name(@Nullable String str) {
        this.company_name = str;
    }

    public final void setDiscount(@Nullable Double d5) {
        this.discount = d5;
    }

    public final void setDiscount_name(@Nullable String str) {
        this.discount_name = str;
    }

    public final void setDown_count(@Nullable Integer num) {
        this.down_count = num;
    }

    public final void setDown_url(@Nullable String str) {
        this.down_url = str;
    }

    public final void setDownload_btn_pic(@Nullable String str) {
        this.download_btn_pic = str;
    }

    public final void setFit_age(@Nullable String str) {
        this.fit_age = str;
    }

    public final void setInfo(@Nullable String str) {
        this.info = str;
    }

    public final void setLatest_server_time(@Nullable Long l4) {
        this.latest_server_time = l4;
    }

    public final void setOn_off(@Nullable Integer num) {
        this.on_off = num;
    }

    public final void setPackage_name(@Nullable String str) {
        this.package_name = str;
    }

    public final void setPermissions(@Nullable List<GameDetailDialogInfoBean> list) {
        this.permissions = list;
    }

    public final void setPlay_count(@Nullable Integer num) {
        this.play_count = num;
    }

    public final void setRefund_pic(@Nullable String str) {
        this.refund_pic = str;
    }

    public final void setSp_tag_name(@Nullable List<String> list) {
        this.sp_tag_name = list;
    }

    public final void setTags(@Nullable List<TagBean> list) {
        this.tags = list;
    }

    public final void setVer(@Nullable Integer num) {
        this.ver = num;
    }

    public final void setVer_name(@Nullable String str) {
        this.ver_name = str;
    }

    public final void set_refund(@Nullable Integer num) {
        this.is_refund = num;
    }

    public final boolean showSpTag() {
        List<String> list = this.sp_tag_name;
        if (!(list == null || list.isEmpty())) {
            List<String> list2 = this.sp_tag_name;
            Intrinsics.checkNotNull(list2);
            if (list2.size() > 0) {
                List<String> list3 = this.sp_tag_name;
                Intrinsics.checkNotNull(list3);
                String str = list3.get(0);
                if (!(str == null || str.length() == 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    @NotNull
    public final String sizeText() {
        Long l4 = this.app_size;
        if (l4 != null) {
            long longValue = l4.longValue();
            if (longValue < 1024) {
                StringBuilder sb = new StringBuilder();
                sb.append(longValue);
                sb.append('B');
                return sb.toString();
            } else if (longValue < 1048576) {
                StringBuilder sb2 = new StringBuilder();
                String format = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf((((float) longValue) * 1.0f) / 1024)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
                sb2.append(format);
                sb2.append('K');
                return sb2.toString();
            } else if (longValue < 1073741824) {
                StringBuilder sb3 = new StringBuilder();
                String format2 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf((((float) longValue) * 1.0f) / 1048576)}, 1));
                Intrinsics.checkNotNullExpressionValue(format2, "format(this, *args)");
                sb3.append(format2);
                sb3.append('M');
                return sb3.toString();
            } else {
                StringBuilder sb4 = new StringBuilder();
                String format3 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf((((float) longValue) * 1.0f) / 1073741824)}, 1));
                Intrinsics.checkNotNullExpressionValue(format3, "format(this, *args)");
                sb4.append(format3);
                sb4.append('G');
                return sb4.toString();
            }
        }
        return "";
    }

    @NotNull
    public final String tagStr() {
        int collectionSizeOrDefault;
        String joinToString$default;
        String replace$default;
        int collectionSizeOrDefault2;
        String joinToString$default2;
        List<TagBean> list = this.tags;
        if (list != null) {
            if (list.size() > 2) {
                List<TagBean> subList = list.subList(0, 2);
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(subList, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault2);
                for (TagBean tagBean : subList) {
                    arrayList.add(tagBean != null ? tagBean.getName() : null);
                }
                joinToString$default2 = CollectionsKt___CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, null, 63, null);
                StringsKt__StringsJVMKt.replace$default(joinToString$default2, ", ", "·", false, 4, (Object) null);
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (TagBean tagBean2 : list) {
                arrayList2.add(tagBean2 != null ? tagBean2.getName() : null);
            }
            joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList2, null, null, null, 0, null, null, 63, null);
            replace$default = StringsKt__StringsJVMKt.replace$default(joinToString$default, ", ", "·", false, 4, (Object) null);
            return replace$default;
        }
        return "";
    }

    @NotNull
    public String toString() {
        return "GameDetailBasicInfoBean(app_size=" + this.app_size + ", company_name=" + this.company_name + ", discount=" + this.discount + ", discount_name=" + this.discount_name + ", down_count=" + this.down_count + ", down_url=" + this.down_url + ", fit_age=" + this.fit_age + ", info=" + this.info + ", latest_server_time=" + this.latest_server_time + ", package_name=" + this.package_name + ", play_count=" + this.play_count + ", sp_tag_name=" + this.sp_tag_name + ", tags=" + this.tags + ", ver=" + this.ver + ", ver_name=" + this.ver_name + ", permissions=" + this.permissions + ", is_refund=" + this.is_refund + ", refund_pic=" + this.refund_pic + ", on_off=" + this.on_off + ", download_btn_pic=" + this.download_btn_pic + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ GameDetailBasicInfoBean(java.lang.Long r22, java.lang.String r23, java.lang.Double r24, java.lang.String r25, java.lang.Integer r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.Long r30, java.lang.String r31, java.lang.Integer r32, java.util.List r33, java.util.List r34, java.lang.Integer r35, java.lang.String r36, java.util.List r37, java.lang.Integer r38, java.lang.String r39, java.lang.Integer r40, java.lang.String r41, int r42, kotlin.jvm.internal.DefaultConstructorMarker r43) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.kotlin.discount.model.bean.GameDetailBasicInfoBean.<init>(java.lang.Long, java.lang.String, java.lang.Double, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.Integer, java.util.List, java.util.List, java.lang.Integer, java.lang.String, java.util.List, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
