package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import com.join.kotlin.discount.proxy.GameDetailCouponClickProxy;
import com.join.kotlin.discount.viewmodel.GameDetailCouponViewModel;
/* loaded from: classes3.dex */
public class ActivityDiscountGameDetailCouponBindingImpl extends ActivityDiscountGameDetailCouponBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f15943l = null;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private static final SparseIntArray f15944m;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    private final ConstraintLayout f15945i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private final View.OnClickListener f15946j;

    /* renamed from: k  reason: collision with root package name */
    private long f15947k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f15944m = sparseIntArray;
        sparseIntArray.put(R.id.title, 2);
        sparseIntArray.put(R.id.cl_container, 3);
        sparseIntArray.put(R.id.titleDivider, 4);
        sparseIntArray.put(R.id.rvCoupon, 5);
    }

    public ActivityDiscountGameDetailCouponBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f15943l, f15944m));
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        GameDetailCouponClickProxy gameDetailCouponClickProxy = this.f15942h;
        if (gameDetailCouponClickProxy != null) {
            gameDetailCouponClickProxy.onBackClick();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        synchronized (this) {
            j4 = this.f15947k;
            this.f15947k = 0L;
        }
        if ((j4 & 4) != 0) {
            this.f15936b.setOnClickListener(this.f15946j);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityDiscountGameDetailCouponBinding
    public void g(@Nullable GameDetailCouponClickProxy gameDetailCouponClickProxy) {
        this.f15942h = gameDetailCouponClickProxy;
        synchronized (this) {
            this.f15947k |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityDiscountGameDetailCouponBinding
    public void h(@Nullable GameDetailCouponViewModel gameDetailCouponViewModel) {
        this.f15941g = gameDetailCouponViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f15947k != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f15947k = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (36 == i4) {
            h((GameDetailCouponViewModel) obj);
        } else if (7 != i4) {
            return false;
        } else {
            g((GameDetailCouponClickProxy) obj);
        }
        return true;
    }

    private ActivityDiscountGameDetailCouponBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[1], (ConstraintLayout) objArr[3], (XQuickRecyclerView) objArr[5], (TextView) objArr[2], (TextView) objArr[4]);
        this.f15947k = -1L;
        this.f15936b.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f15945i = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        this.f15946j = new a(this, 1);
        invalidateAll();
    }
}
