package com.join.kotlin.ui.coupon;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.join.kotlin.domain.common.LoadBindindData;
import com.join.mgps.dto.BTGameCouponBean;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: CouponViewModle.kt */
/* loaded from: classes3.dex */
public final class CouponViewModle extends ViewModel {
    @NotNull
    private MutableLiveData<LoadBindindData> loadDataBinding;
    @NotNull
    private MutableLiveData<ArrayList<BTGameCouponBean>> datas = new MutableLiveData<>();
    @NotNull
    private String title = "代金券";
    @NotNull
    private com.join.kotlin.domain.request.CouponRequest request = new com.join.kotlin.domain.request.CouponRequest();

    public CouponViewModle() {
        MutableLiveData<LoadBindindData> mutableLiveData = new MutableLiveData<>();
        this.loadDataBinding = mutableLiveData;
        mutableLiveData.setValue(new LoadBindindData(2));
    }

    @NotNull
    public final MutableLiveData<ArrayList<BTGameCouponBean>> getDatas() {
        return this.datas;
    }

    @NotNull
    public final MutableLiveData<LoadBindindData> getLoadDataBinding() {
        return this.loadDataBinding;
    }

    @NotNull
    public final com.join.kotlin.domain.request.CouponRequest getRequest() {
        return this.request;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void setDatas(@NotNull MutableLiveData<ArrayList<BTGameCouponBean>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.datas = mutableLiveData;
    }

    public final void setLoadDataBinding(@NotNull MutableLiveData<LoadBindindData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.loadDataBinding = mutableLiveData;
    }

    public final void setRequest(@NotNull com.join.kotlin.domain.request.CouponRequest couponRequest) {
        Intrinsics.checkNotNullParameter(couponRequest, "<set-?>");
        this.request = couponRequest;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final void updateShowLoadUI(boolean z4) {
        if (this.datas.getValue() == null) {
            this.loadDataBinding.setValue(new LoadBindindData(2));
            return;
        }
        ArrayList<BTGameCouponBean> value = this.datas.getValue();
        Intrinsics.checkNotNull(value);
        if (value.size() != 0) {
            this.loadDataBinding.setValue(new LoadBindindData(1));
        } else if (z4) {
            this.loadDataBinding.setValue(new LoadBindindData(4));
        } else {
            this.loadDataBinding.setValue(new LoadBindindData(3));
        }
    }
}
