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
import com.join.kotlin.ui.modleregin.modle.BtTagSelecterBean;
import java.util.List;
/* loaded from: classes3.dex */
public class DatabBtHviewlistBindingImpl extends DatabBtHviewlistBinding {
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f18309g = null;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private static final SparseIntArray f18310h = null;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    private final ConstraintLayout f18311d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    private final RecyclerView f18312e;

    /* renamed from: f  reason: collision with root package name */
    private long f18313f;

    public DatabBtHviewlistBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f18309g, f18310h));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        synchronized (this) {
            j4 = this.f18313f;
            this.f18313f = 0L;
        }
        List<BtTagSelecterBean> list = this.f18307b;
        BaseDataBindingAdapter<Object, ViewDataBinding> baseDataBindingAdapter = this.f18308c;
        long j5 = 5 & j4;
        if ((j4 & 6) != 0) {
            this.f18312e.setAdapter(baseDataBindingAdapter);
        }
        if (j5 != 0) {
            ViewbindingRecycleviewAdapterKt.recycleviewdataBinding(this.f18312e, list);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.DatabBtHviewlistBinding
    public void g(@Nullable BaseDataBindingAdapter<Object, ViewDataBinding> baseDataBindingAdapter) {
        this.f18308c = baseDataBindingAdapter;
        synchronized (this) {
            this.f18313f |= 2;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.DatabBtHviewlistBinding
    public void h(@Nullable List<BtTagSelecterBean> list) {
        this.f18307b = list;
        synchronized (this) {
            this.f18313f |= 1;
        }
        notifyPropertyChanged(28);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f18313f != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f18313f = 4L;
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

    private DatabBtHviewlistBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.f18313f = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f18311d = constraintLayout;
        constraintLayout.setTag(null);
        RecyclerView recyclerView = (RecyclerView) objArr[1];
        this.f18312e = recyclerView;
        recyclerView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
