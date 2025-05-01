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
import com.join.kotlin.quark.proxy.SourceShareClickProxy;
import com.join.kotlin.quark.viewmodel.SourceShareListViewModel;
/* loaded from: classes3.dex */
public class FragmentSourceShareBindingImpl extends FragmentSourceShareBinding {
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f20138g = null;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private static final SparseIntArray f20139h;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    private final LinearLayout f20140e;

    /* renamed from: f  reason: collision with root package name */
    private long f20141f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20139h = sparseIntArray;
        sparseIntArray.put(R.id.xrv_list, 1);
    }

    public FragmentSourceShareBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f20138g, f20139h));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        synchronized (this) {
            this.f20141f = 0L;
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.FragmentSourceShareBinding
    public void g(@Nullable SourceShareClickProxy sourceShareClickProxy) {
        this.f20137d = sourceShareClickProxy;
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.FragmentSourceShareBinding
    public void h(@Nullable SourceShareListViewModel sourceShareListViewModel) {
        this.f20136c = sourceShareListViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f20141f != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f20141f = 4L;
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
            h((SourceShareListViewModel) obj);
        } else if (7 != i4) {
            return false;
        } else {
            g((SourceShareClickProxy) obj);
        }
        return true;
    }

    private FragmentSourceShareBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (XQuickRecyclerView) objArr[1]);
        this.f20141f = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f20140e = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
