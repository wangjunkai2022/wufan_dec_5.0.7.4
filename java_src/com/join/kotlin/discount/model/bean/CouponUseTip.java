package com.join.kotlin.discount.model.bean;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CouponUseTip.kt */
/* loaded from: classes3.dex */
public final class CouponUseTip implements Serializable {
    @Nullable
    private final String content;
    @Nullable
    private final String title;

    public CouponUseTip(@Nullable String str, @Nullable String str2) {
        this.title = str;
        this.content = str2;
    }

    public static /* synthetic */ CouponUseTip copy$default(CouponUseTip couponUseTip, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = couponUseTip.title;
        }
        if ((i4 & 2) != 0) {
            str2 = couponUseTip.content;
        }
        return couponUseTip.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    @Nullable
    public final String component2() {
        return this.content;
    }

    @NotNull
    public final CouponUseTip copy(@Nullable String str, @Nullable String str2) {
        return new CouponUseTip(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CouponUseTip) {
            CouponUseTip couponUseTip = (CouponUseTip) obj;
            return Intrinsics.areEqual(this.title, couponUseTip.title) && Intrinsics.areEqual(this.content, couponUseTip.content);
        }
        return false;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CouponUseTip(title=" + this.title + ", content=" + this.content + ')';
    }
}
