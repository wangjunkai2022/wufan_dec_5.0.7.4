package com.join.kotlin.ui.coupon;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.join.mgps.dto.BTGameCouponBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: CouponListViewModle.kt */
/* loaded from: classes3.dex */
public final class CouponListViewModle extends ViewModel {
    @NotNull
    private MutableLiveData<BTGameCouponBean> item = new MutableLiveData<>();

    @NotNull
    public final MutableLiveData<BTGameCouponBean> getItem() {
        return this.item;
    }

    public final void setItem(@NotNull MutableLiveData<BTGameCouponBean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.item = mutableLiveData;
    }
}
