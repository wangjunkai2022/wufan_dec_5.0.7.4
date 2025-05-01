package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.join.kotlin.bindingadapter.ViewbindingRecycleviewAdapterKt;
import com.join.kotlin.domain.adapter.BaseDataBindingAdapter;
import com.join.mgps.business.CollectionBeanSubBusiness;
import java.util.List;
/* loaded from: classes3.dex */
public class BtHrecyclerviewGamelistLayoutBindingImpl extends BtHrecyclerviewGamelistLayoutBinding {
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f17588g = null;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private static final SparseIntArray f17589h = null;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    private final ConstraintLayout f17590e;

    /* renamed from: f  reason: collision with root package name */
    private long f17591f;

    public BtHrecyclerviewGamelistLayoutBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f17588g, f17589h));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        synchronized (this) {
            j4 = this.f17591f;
            this.f17591f = 0L;
        }
        List<CollectionBeanSubBusiness> list = this.f17586c;
        BaseDataBindingAdapter<Object, ViewDataBinding> baseDataBindingAdapter = this.f17587d;
        long j5 = 5 & j4;
        if ((j4 & 6) != 0) {
            this.f17585b.setAdapter(baseDataBindingAdapter);
        }
        if (j5 != 0) {
            ViewbindingRecycleviewAdapterKt.recycleviewdataBinding(this.f17585b, list);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.BtHrecyclerviewGamelistLayoutBinding
    public void g(@Nullable BaseDataBindingAdapter<Object, ViewDataBinding> baseDataBindingAdapter) {
        this.f17587d = baseDataBindingAdapter;
        synchronized (this) {
            this.f17591f |= 2;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.BtHrecyclerviewGamelistLayoutBinding
    public void h(@Nullable List<CollectionBeanSubBusiness> list) {
        this.f17586c = list;
        synchronized (this) {
            this.f17591f |= 1;
        }
        notifyPropertyChanged(28);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f17591f != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f17591f = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (28 == i4) {
            h((List) obj);
            return true;
        } else if (1 == i4) {
            g((BaseDataBindingAdapter) obj);
            return true;
        } else {
            return false;
        }
    }

    private BtHrecyclerviewGamelistLayoutBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RecyclerView) objArr[1]);
        this.f17591f = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f17590e = constraintLayout;
        constraintLayout.setTag(null);
        this.f17585b.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
