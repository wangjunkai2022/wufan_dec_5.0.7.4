package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import com.join.kotlin.quark.viewmodel.SourceHopeListViewModel;
/* loaded from: classes3.dex */
public class FragmentSourceHopeBindingImpl extends FragmentSourceHopeBinding {
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f20131f = null;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private static final SparseIntArray f20132g;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    private final LinearLayout f20133d;

    /* renamed from: e  reason: collision with root package name */
    private long f20134e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20132g = sparseIntArray;
        sparseIntArray.put(R.id.xrv_list, 1);
    }

    public FragmentSourceHopeBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f20131f, f20132g));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        synchronized (this) {
            this.f20134e = 0L;
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.FragmentSourceHopeBinding
    public void f(@Nullable SourceHopeListViewModel sourceHopeListViewModel) {
        this.f20130c = sourceHopeListViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f20134e != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f20134e = 2L;
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
            f((SourceHopeListViewModel) obj);
            return true;
        }
        return false;
    }

    private FragmentSourceHopeBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (XQuickRecyclerView) objArr[1]);
        this.f20134e = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f20133d = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
