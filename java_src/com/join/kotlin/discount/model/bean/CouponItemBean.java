package com.join.kotlin.discount.model.bean;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CouponItemBean.kt */
/* loaded from: classes3.dex */
public final class CouponItemBean implements Serializable {
    @Nullable
    private Integer aid;
    @Nullable
    private final String amount;
    @Nullable
    private String amount_text;
    @Nullable
    private final String balance;
    @Nullable
    private final String code;
    @NotNull
    private String coupon_name;
    @Nullable
    private final Integer coupon_type;
    @Nullable
    private final String discount;
    @Nullable
    private final Boolean effective;
    @Nullable
    private final List<String> game_ids;
    @Nullable
    private final String game_names;
    @Nullable
    private String issueType;
    @Nullable
    private final Integer range_op;
    @Nullable
    private String receive_time_text;
    @Nullable
    private final Boolean repeatable;
    @Nullable
    private final Integer state;
    @Nullable
    private final String threshold;
    @Nullable
    private String threshold_text;
    @Nullable
    private String threshold_text2;
    @Nullable
    private Integer tpl_id;
    @Nullable
    private final String unusable_reason;
    @Nullable
    private String use_range_text;
    @Nullable
    private String use_time_text;
    @Nullable
    private final CouponUseTip use_tip;
    @Nullable
    private final String validateText;

    public CouponItemBean(@Nullable Integer num, @Nullable String str, @Nullable Integer num2, @NotNull String coupon_name, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Integer num3, @Nullable String str10, @Nullable List<String> list, @Nullable Integer num4, @Nullable Boolean bool, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable CouponUseTip couponUseTip, @Nullable String str14, @Nullable Integer num5, @Nullable String str15, @Nullable Boolean bool2) {
        Intrinsics.checkNotNullParameter(coupon_name, "coupon_name");
        this.aid = num;
        this.issueType = str;
        this.tpl_id = num2;
        this.coupon_name = coupon_name;
        this.amount_text = str2;
        this.threshold_text = str3;
        this.threshold_text2 = str4;
        this.use_range_text = str5;
        this.use_time_text = str6;
        this.amount = str7;
        this.balance = str8;
        this.code = str9;
        this.coupon_type = num3;
        this.discount = str10;
        this.game_ids = list;
        this.range_op = num4;
        this.repeatable = bool;
        this.threshold = str11;
        this.unusable_reason = str12;
        this.receive_time_text = str13;
        this.use_tip = couponUseTip;
        this.game_names = str14;
        this.state = num5;
        this.validateText = str15;
        this.effective = bool2;
    }

    @Nullable
    public final Integer component1() {
        return this.aid;
    }

    @Nullable
    public final String component10() {
        return this.amount;
    }

    @Nullable
    public final String component11() {
        return this.balance;
    }

    @Nullable
    public final String component12() {
        return this.code;
    }

    @Nullable
    public final Integer component13() {
        return this.coupon_type;
    }

    @Nullable
    public final String component14() {
        return this.discount;
    }

    @Nullable
    public final List<String> component15() {
        return this.game_ids;
    }

    @Nullable
    public final Integer component16() {
        return this.range_op;
    }

    @Nullable
    public final Boolean component17() {
        return this.repeatable;
    }

    @Nullable
    public final String component18() {
        return this.threshold;
    }

    @Nullable
    public final String component19() {
        return this.unusable_reason;
    }

    @Nullable
    public final String component2() {
        return this.issueType;
    }

    @Nullable
    public final String component20() {
        return this.receive_time_text;
    }

    @Nullable
    public final CouponUseTip component21() {
        return this.use_tip;
    }

    @Nullable
    public final String component22() {
        return this.game_names;
    }

    @Nullable
    public final Integer component23() {
        return this.state;
    }

    @Nullable
    public final String component24() {
        return this.validateText;
    }

    @Nullable
    public final Boolean component25() {
        return this.effective;
    }

    @Nullable
    public final Integer component3() {
        return this.tpl_id;
    }

    @NotNull
    public final String component4() {
        return this.coupon_name;
    }

    @Nullable
    public final String component5() {
        return this.amount_text;
    }

    @Nullable
    public final String component6() {
        return this.threshold_text;
    }

    @Nullable
    public final String component7() {
        return this.threshold_text2;
    }

    @Nullable
    public final String component8() {
        return this.use_range_text;
    }

    @Nullable
    public final String component9() {
        return this.use_time_text;
    }

    @NotNull
    public final CouponItemBean copy(@Nullable Integer num, @Nullable String str, @Nullable Integer num2, @NotNull String coupon_name, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Integer num3, @Nullable String str10, @Nullable List<String> list, @Nullable Integer num4, @Nullable Boolean bool, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable CouponUseTip couponUseTip, @Nullable String str14, @Nullable Integer num5, @Nullable String str15, @Nullable Boolean bool2) {
        Intrinsics.checkNotNullParameter(coupon_name, "coupon_name");
        return new CouponItemBean(num, str, num2, coupon_name, str2, str3, str4, str5, str6, str7, str8, str9, num3, str10, list, num4, bool, str11, str12, str13, couponUseTip, str14, num5, str15, bool2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CouponItemBean) {
            CouponItemBean couponItemBean = (CouponItemBean) obj;
            return Intrinsics.areEqual(this.aid, couponItemBean.aid) && Intrinsics.areEqual(this.issueType, couponItemBean.issueType) && Intrinsics.areEqual(this.tpl_id, couponItemBean.tpl_id) && Intrinsics.areEqual(this.coupon_name, couponItemBean.coupon_name) && Intrinsics.areEqual(this.amount_text, couponItemBean.amount_text) && Intrinsics.areEqual(this.threshold_text, couponItemBean.threshold_text) && Intrinsics.areEqual(this.threshold_text2, couponItemBean.threshold_text2) && Intrinsics.areEqual(this.use_range_text, couponItemBean.use_range_text) && Intrinsics.areEqual(this.use_time_text, couponItemBean.use_time_text) && Intrinsics.areEqual(this.amount, couponItemBean.amount) && Intrinsics.areEqual(this.balance, couponItemBean.balance) && Intrinsics.areEqual(this.code, couponItemBean.code) && Intrinsics.areEqual(this.coupon_type, couponItemBean.coupon_type) && Intrinsics.areEqual(this.discount, couponItemBean.discount) && Intrinsics.areEqual(this.game_ids, couponItemBean.game_ids) && Intrinsics.areEqual(this.range_op, couponItemBean.range_op) && Intrinsics.areEqual(this.repeatable, couponItemBean.repeatable) && Intrinsics.areEqual(this.threshold, couponItemBean.threshold) && Intrinsics.areEqual(this.unusable_reason, couponItemBean.unusable_reason) && Intrinsics.areEqual(this.receive_time_text, couponItemBean.receive_time_text) && Intrinsics.areEqual(this.use_tip, couponItemBean.use_tip) && Intrinsics.areEqual(this.game_names, couponItemBean.game_names) && Intrinsics.areEqual(this.state, couponItemBean.state) && Intrinsics.areEqual(this.validateText, couponItemBean.validateText) && Intrinsics.areEqual(this.effective, couponItemBean.effective);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.SpannableStringBuilder formatBalance() {
        /*
            r11 = this;
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            java.lang.String r1 = r11.balance
            if (r1 != 0) goto L8
            java.lang.String r1 = ""
        L8:
            r0.<init>(r1)
            java.lang.String r1 = r11.balance
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1d
            r4 = 2
            r5 = 0
            java.lang.String r6 = "."
            boolean r1 = kotlin.text.StringsKt.contains$default(r1, r6, r3, r4, r5)
            if (r1 != r2) goto L1d
            r1 = 1
            goto L1e
        L1d:
            r1 = 0
        L1e:
            if (r1 == 0) goto L51
            android.text.style.AbsoluteSizeSpan r1 = new android.text.style.AbsoluteSizeSpan
            com.MApplication r4 = com.MApplication.f1497x
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131169824(0x7f071220, float:1.7953989E38)
            float r4 = r4.getDimension(r5)
            int r4 = (int) r4
            r1.<init>(r4)
            java.lang.String r5 = r11.balance
            if (r5 == 0) goto L42
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            java.lang.String r6 = "."
            int r4 = kotlin.text.StringsKt.indexOf$default(r5, r6, r7, r8, r9, r10)
            goto L43
        L42:
            r4 = 0
        L43:
            int r4 = r4 + r2
            java.lang.String r2 = r11.balance
            if (r2 == 0) goto L4c
            int r3 = r2.length()
        L4c:
            r2 = 34
            r0.setSpan(r1, r4, r3, r2)
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.kotlin.discount.model.bean.CouponItemBean.formatBalance():android.text.SpannableStringBuilder");
    }

    @Nullable
    public final Integer getAid() {
        return this.aid;
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getAmount_text() {
        return this.amount_text;
    }

    @Nullable
    public final String getBalance() {
        return this.balance;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getCoupon_name() {
        return this.coupon_name;
    }

    @Nullable
    public final Integer getCoupon_type() {
        return this.coupon_type;
    }

    @Nullable
    public final String getDiscount() {
        return this.discount;
    }

    @Nullable
    public final Boolean getEffective() {
        return this.effective;
    }

    @Nullable
    public final List<String> getGame_ids() {
        return this.game_ids;
    }

    @Nullable
    public final String getGame_names() {
        return this.game_names;
    }

    @Nullable
    public final String getIssueType() {
        return this.issueType;
    }

    @Nullable
    public final Integer getRange_op() {
        return this.range_op;
    }

    @Nullable
    public final String getReceive_time_text() {
        return this.receive_time_text;
    }

    @Nullable
    public final Boolean getRepeatable() {
        return this.repeatable;
    }

    @Nullable
    public final Integer getState() {
        return this.state;
    }

    @Nullable
    public final String getThreshold() {
        return this.threshold;
    }

    @Nullable
    public final String getThreshold_text() {
        return this.threshold_text;
    }

    @Nullable
    public final String getThreshold_text2() {
        return this.threshold_text2;
    }

    @Nullable
    public final Integer getTpl_id() {
        return this.tpl_id;
    }

    @Nullable
    public final String getUnusable_reason() {
        return this.unusable_reason;
    }

    @Nullable
    public final String getUse_range_text() {
        return this.use_range_text;
    }

    @Nullable
    public final String getUse_time_text() {
        return this.use_time_text;
    }

    @Nullable
    public final CouponUseTip getUse_tip() {
        return this.use_tip;
    }

    @Nullable
    public final String getValidateText() {
        return this.validateText;
    }

    public int hashCode() {
        Integer num = this.aid;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.issueType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.tpl_id;
        int hashCode3 = (((hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.coupon_name.hashCode()) * 31;
        String str2 = this.amount_text;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.threshold_text;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.threshold_text2;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.use_range_text;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.use_time_text;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.amount;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.balance;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.code;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num3 = this.coupon_type;
        int hashCode12 = (hashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str10 = this.discount;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<String> list = this.game_ids;
        int hashCode14 = (hashCode13 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num4 = this.range_op;
        int hashCode15 = (hashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.repeatable;
        int hashCode16 = (hashCode15 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str11 = this.threshold;
        int hashCode17 = (hashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.unusable_reason;
        int hashCode18 = (hashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.receive_time_text;
        int hashCode19 = (hashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        CouponUseTip couponUseTip = this.use_tip;
        int hashCode20 = (hashCode19 + (couponUseTip == null ? 0 : couponUseTip.hashCode())) * 31;
        String str14 = this.game_names;
        int hashCode21 = (hashCode20 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Integer num5 = this.state;
        int hashCode22 = (hashCode21 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str15 = this.validateText;
        int hashCode23 = (hashCode22 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Boolean bool2 = this.effective;
        return hashCode23 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final boolean is648() {
        return Intrinsics.areEqual(this.issueType, "self.648");
    }

    @NotNull
    public final String receiveBtnText() {
        Integer num = this.state;
        return (num != null && num.intValue() == 0) ? "不\n可\n领\n取" : (num != null && num.intValue() == 1) ? "已\n领\n取" : "领\n取";
    }

    @NotNull
    public final String receiveBtnText2() {
        Integer num = this.state;
        return (num != null && num.intValue() == 0) ? "不可领取" : (num != null && num.intValue() == 1) ? "已领取" : "去领取";
    }

    @NotNull
    public final String receiveBtnTextColor() {
        Integer num = this.state;
        return (num != null && num.intValue() == -1) ? "#F6593A" : "#B8B8B8";
    }

    public final void setAid(@Nullable Integer num) {
        this.aid = num;
    }

    public final void setAmount_text(@Nullable String str) {
        this.amount_text = str;
    }

    public final void setCoupon_name(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.coupon_name = str;
    }

    public final void setIssueType(@Nullable String str) {
        this.issueType = str;
    }

    public final void setReceive_time_text(@Nullable String str) {
        this.receive_time_text = str;
    }

    public final void setThreshold_text(@Nullable String str) {
        this.threshold_text = str;
    }

    public final void setThreshold_text2(@Nullable String str) {
        this.threshold_text2 = str;
    }

    public final void setTpl_id(@Nullable Integer num) {
        this.tpl_id = num;
    }

    public final void setUse_range_text(@Nullable String str) {
        this.use_range_text = str;
    }

    public final void setUse_time_text(@Nullable String str) {
        this.use_time_text = str;
    }

    @NotNull
    public String toString() {
        return "CouponItemBean(aid=" + this.aid + ", issueType=" + this.issueType + ", tpl_id=" + this.tpl_id + ", coupon_name=" + this.coupon_name + ", amount_text=" + this.amount_text + ", threshold_text=" + this.threshold_text + ", threshold_text2=" + this.threshold_text2 + ", use_range_text=" + this.use_range_text + ", use_time_text=" + this.use_time_text + ", amount=" + this.amount + ", balance=" + this.balance + ", code=" + this.code + ", coupon_type=" + this.coupon_type + ", discount=" + this.discount + ", game_ids=" + this.game_ids + ", range_op=" + this.range_op + ", repeatable=" + this.repeatable + ", threshold=" + this.threshold + ", unusable_reason=" + this.unusable_reason + ", receive_time_text=" + this.receive_time_text + ", use_tip=" + this.use_tip + ", game_names=" + this.game_names + ", state=" + this.state + ", validateText=" + this.validateText + ", effective=" + this.effective + ')';
    }

    public /* synthetic */ CouponItemBean(Integer num, String str, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num3, String str11, List list, Integer num4, Boolean bool, String str12, String str13, String str14, CouponUseTip couponUseTip, String str15, Integer num5, String str16, Boolean bool2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, num2, str2, str3, str4, str5, str6, str7, str8, str9, str10, num3, str11, list, num4, bool, str12, str13, str14, couponUseTip, str15, (i4 & 4194304) != 0 ? -1 : num5, str16, bool2);
    }
}
