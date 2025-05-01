package com.join.kotlin.discount.proxy;

import com.join.kotlin.discount.model.bean.CouponItemBean;
import com.join.kotlin.discount.model.bean.CouponUseTip;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CouponListClickProxy.kt */
/* loaded from: classes3.dex */
public interface CouponListClickProxy {
    void onDetailClick(@NotNull CouponItemBean couponItemBean);

    void onReceiveClick(@NotNull CouponItemBean couponItemBean);

    void onUnSupportClick(@NotNull CouponItemBean couponItemBean);

    void onUseClick(@NotNull CouponItemBean couponItemBean);

    void showUseTip(@Nullable CouponUseTip couponUseTip);
}
