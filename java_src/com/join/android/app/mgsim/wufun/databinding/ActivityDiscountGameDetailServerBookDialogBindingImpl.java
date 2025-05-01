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
import com.join.kotlin.discount.proxy.GameDetailServerBookDialogClickProxy;
import com.join.kotlin.discount.viewmodel.GameDetailServerBookDialogViewModel;
/* loaded from: classes3.dex */
public class ActivityDiscountGameDetailServerBookDialogBindingImpl extends ActivityDiscountGameDetailServerBookDialogBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f15976l = null;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private static final SparseIntArray f15977m;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    private final ImageView f15978i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private final View.OnClickListener f15979j;

    /* renamed from: k  reason: collision with root package name */
    private long f15980k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f15977m = sparseIntArray;
        sparseIntArray.put(R.id.cl_container, 2);
        sparseIntArray.put(R.id.recyclerview, 3);
        sparseIntArray.put(R.id.tvTitle, 4);
        sparseIntArray.put(R.id.subTitle, 5);
    }

    public ActivityDiscountGameDetailServerBookDialogBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f15976l, f15977m));
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        GameDetailServerBookDialogClickProxy gameDetailServerBookDialogClickProxy = this.f15975h;
        if (gameDetailServerBookDialogClickProxy != null) {
            gameDetailServerBookDialogClickProxy.onBackClick();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        synchronized (this) {
            j4 = this.f15980k;
            this.f15980k = 0L;
        }
        if ((j4 & 4) != 0) {
            this.f15978i.setOnClickListener(this.f15979j);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityDiscountGameDetailServerBookDialogBinding
    public void g(@Nullable GameDetailServerBookDialogClickProxy gameDetailServerBookDialogClickProxy) {
        this.f15975h = gameDetailServerBookDialogClickProxy;
        synchronized (this) {
            this.f15980k |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityDiscountGameDetailServerBookDialogBinding
    public void h(@Nullable GameDetailServerBookDialogViewModel gameDetailServerBookDialogViewModel) {
        this.f15974g = gameDetailServerBookDialogViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f15980k != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f15980k = 4L;
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
            h((GameDetailServerBookDialogViewModel) obj);
        } else if (7 != i4) {
            return false;
        } else {
            g((GameDetailServerBookDialogClickProxy) obj);
        }
        return true;
    }

    private ActivityDiscountGameDetailServerBookDialogBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[2], (ConstraintLayout) objArr[0], (XQuickRecyclerView) objArr[3], (TextView) objArr[5], (TextView) objArr[4]);
        this.f15980k = -1L;
        this.f15970c.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.f15978i = imageView;
        imageView.setTag(null);
        setRootTag(view);
        this.f15979j = new a(this, 1);
        invalidateAll();
    }
}
