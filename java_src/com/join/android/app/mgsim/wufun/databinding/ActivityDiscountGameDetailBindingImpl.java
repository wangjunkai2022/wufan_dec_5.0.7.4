package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.discount.proxy.GameDetailClickProxy;
import com.join.kotlin.discount.viewmodel.GameDetailViewModel;
/* loaded from: classes3.dex */
public class ActivityDiscountGameDetailBindingImpl extends ActivityDiscountGameDetailBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f15932j = null;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private static final SparseIntArray f15933k;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private final View.OnClickListener f15934h;

    /* renamed from: i  reason: collision with root package name */
    private long f15935i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f15933k = sparseIntArray;
        sparseIntArray.put(R.id.viewpager, 2);
        sparseIntArray.put(R.id.tablayout, 3);
    }

    public ActivityDiscountGameDetailBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, f15932j, f15933k));
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        GameDetailClickProxy gameDetailClickProxy = this.f15931g;
        if (gameDetailClickProxy != null) {
            gameDetailClickProxy.onBackClick();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        synchronized (this) {
            j4 = this.f15935i;
            this.f15935i = 0L;
        }
        if ((j4 & 4) != 0) {
            this.f15926b.setOnClickListener(this.f15934h);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityDiscountGameDetailBinding
    public void g(@Nullable GameDetailClickProxy gameDetailClickProxy) {
        this.f15931g = gameDetailClickProxy;
        synchronized (this) {
            this.f15935i |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityDiscountGameDetailBinding
    public void h(@Nullable GameDetailViewModel gameDetailViewModel) {
        this.f15930f = gameDetailViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f15935i != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f15935i = 4L;
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
            h((GameDetailViewModel) obj);
        } else if (7 != i4) {
            return false;
        } else {
            g((GameDetailClickProxy) obj);
        }
        return true;
    }

    private ActivityDiscountGameDetailBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[1], (ConstraintLayout) objArr[0], (TabLayout) objArr[3], (ViewPager2) objArr[2]);
        this.f15935i = -1L;
        this.f15926b.setTag(null);
        this.f15927c.setTag(null);
        setRootTag(view);
        this.f15934h = new a(this, 1);
        invalidateAll();
    }
}
