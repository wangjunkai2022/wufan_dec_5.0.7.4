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
import com.join.kotlin.discount.proxy.GameDetailGiftClickProxy;
import com.join.kotlin.discount.viewmodel.GameDetailGiftViewModel;
/* loaded from: classes3.dex */
public class ActivityDiscountGameDetailGiftBindingImpl extends ActivityDiscountGameDetailGiftBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f15954j = null;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private static final SparseIntArray f15955k;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private final View.OnClickListener f15956h;

    /* renamed from: i  reason: collision with root package name */
    private long f15957i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f15955k = sparseIntArray;
        sparseIntArray.put(R.id.title, 2);
        sparseIntArray.put(R.id.rvGift, 3);
    }

    public ActivityDiscountGameDetailGiftBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, f15954j, f15955k));
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        GameDetailGiftClickProxy gameDetailGiftClickProxy = this.f15953g;
        if (gameDetailGiftClickProxy != null) {
            gameDetailGiftClickProxy.onBackClick();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        synchronized (this) {
            j4 = this.f15957i;
            this.f15957i = 0L;
        }
        if ((j4 & 4) != 0) {
            this.f15948b.setOnClickListener(this.f15956h);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityDiscountGameDetailGiftBinding
    public void g(@Nullable GameDetailGiftClickProxy gameDetailGiftClickProxy) {
        this.f15953g = gameDetailGiftClickProxy;
        synchronized (this) {
            this.f15957i |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityDiscountGameDetailGiftBinding
    public void h(@Nullable GameDetailGiftViewModel gameDetailGiftViewModel) {
        this.f15952f = gameDetailGiftViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f15957i != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f15957i = 4L;
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
            h((GameDetailGiftViewModel) obj);
        } else if (7 != i4) {
            return false;
        } else {
            g((GameDetailGiftClickProxy) obj);
        }
        return true;
    }

    private ActivityDiscountGameDetailGiftBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[1], (ConstraintLayout) objArr[0], (XQuickRecyclerView) objArr[3], (TextView) objArr[2]);
        this.f15957i = -1L;
        this.f15948b.setTag(null);
        this.f15949c.setTag(null);
        setRootTag(view);
        this.f15956h = new a(this, 1);
        invalidateAll();
    }
}
