package com.join.kotlin.discount.model.bean;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GiftItemTypeBean.kt */
/* loaded from: classes3.dex */
public final class GiftItemTypeBean {
    @Nullable
    private final List<GiftItemBean> gifts;
    @Nullable
    private final Integer type;
    @Nullable
    private final String typeName;

    public GiftItemTypeBean(@Nullable List<GiftItemBean> list, @Nullable Integer num, @Nullable String str) {
        this.gifts = list;
        this.type = num;
        this.typeName = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GiftItemTypeBean copy$default(GiftItemTypeBean giftItemTypeBean, List list, Integer num, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = giftItemTypeBean.gifts;
        }
        if ((i4 & 2) != 0) {
            num = giftItemTypeBean.type;
        }
        if ((i4 & 4) != 0) {
            str = giftItemTypeBean.typeName;
        }
        return giftItemTypeBean.copy(list, num, str);
    }

    @Nullable
    public final List<GiftItemBean> component1() {
        return this.gifts;
    }

    @Nullable
    public final Integer component2() {
        return this.type;
    }

    @Nullable
    public final String component3() {
        return this.typeName;
    }

    @NotNull
    public final GiftItemTypeBean copy(@Nullable List<GiftItemBean> list, @Nullable Integer num, @Nullable String str) {
        return new GiftItemTypeBean(list, num, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftItemTypeBean) {
            GiftItemTypeBean giftItemTypeBean = (GiftItemTypeBean) obj;
            return Intrinsics.areEqual(this.gifts, giftItemTypeBean.gifts) && Intrinsics.areEqual(this.type, giftItemTypeBean.type) && Intrinsics.areEqual(this.typeName, giftItemTypeBean.typeName);
        }
        return false;
    }

    @Nullable
    public final List<GiftItemBean> getGifts() {
        return this.gifts;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    public final String getTypeName() {
        return this.typeName;
    }

    public int hashCode() {
        List<GiftItemBean> list = this.gifts;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.type;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.typeName;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GiftItemTypeBean(gifts=" + this.gifts + ", type=" + this.type + ", typeName=" + this.typeName + ')';
    }
}
