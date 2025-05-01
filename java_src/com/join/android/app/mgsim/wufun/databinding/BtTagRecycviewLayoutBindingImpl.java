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
import com.join.mgps.dto.BannerBean;
import java.util.List;
/* loaded from: classes3.dex */
public class BtTagRecycviewLayoutBindingImpl extends BtTagRecycviewLayoutBinding {
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f17634g = null;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private static final SparseIntArray f17635h = null;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    private final ConstraintLayout f17636d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    private final RecyclerView f17637e;

    /* renamed from: f  reason: collision with root package name */
    private long f17638f;

    public BtTagRecycviewLayoutBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f17634g, f17635h));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        synchronized (this) {
            j4 = this.f17638f;
            this.f17638f = 0L;
        }
        List<BannerBean> list = this.f17632b;
        BaseDataBindingAdapter<Object, ViewDataBinding> baseDataBindingAdapter = this.f17633c;
        long j5 = 5 & j4;
        if ((j4 & 6) != 0) {
            this.f17637e.setAdapter(baseDataBindingAdapter);
        }
        if (j5 != 0) {
            ViewbindingRecycleviewAdapterKt.recycleviewdataBinding(this.f17637e, list);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.BtTagRecycviewLayoutBinding
    public void g(@Nullable BaseDataBindingAdapter<Object, ViewDataBinding> baseDataBindingAdapter) {
        this.f17633c = baseDataBindingAdapter;
        synchronized (this) {
            this.f17638f |= 2;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.BtTagRecycviewLayoutBinding
    public void h(@Nullable List<BannerBean> list) {
        this.f17632b = list;
        synchronized (this) {
            this.f17638f |= 1;
        }
        notifyPropertyChanged(28);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f17638f != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f17638f = 4L;
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

    private BtTagRecycviewLayoutBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.f17638f = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f17636d = constraintLayout;
        constraintLayout.setTag(null);
        RecyclerView recyclerView = (RecyclerView) objArr[1];
        this.f17637e = recyclerView;
        recyclerView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
