package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
/* loaded from: classes3.dex */
public class ItemDetailBannerIndicatorBindingImpl extends ItemDetailBannerIndicatorBinding {
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f21876g = null;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private static final SparseIntArray f21877h = null;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    private final FrameLayout f21878c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    private final View f21879d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    private final View f21880e;

    /* renamed from: f  reason: collision with root package name */
    private long f21881f;

    public ItemDetailBannerIndicatorBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f21876g, f21877h));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        int i4;
        long j5;
        long j6;
        synchronized (this) {
            j4 = this.f21881f;
            this.f21881f = 0L;
        }
        Boolean bool = this.f21875b;
        long j7 = j4 & 3;
        int i5 = 0;
        if (j7 != 0) {
            boolean safeUnbox = ViewDataBinding.safeUnbox(bool);
            if (j7 != 0) {
                if (safeUnbox) {
                    j5 = j4 | 8;
                    j6 = 32;
                } else {
                    j5 = j4 | 4;
                    j6 = 16;
                }
                j4 = j5 | j6;
            }
            i4 = safeUnbox ? 0 : 8;
            if (safeUnbox) {
                i5 = 8;
            }
        } else {
            i4 = 0;
        }
        if ((j4 & 3) != 0) {
            this.f21879d.setVisibility(i5);
            this.f21880e.setVisibility(i4);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemDetailBannerIndicatorBinding
    public void f(@Nullable Boolean bool) {
        this.f21875b = bool;
        synchronized (this) {
            this.f21881f |= 1;
        }
        notifyPropertyChanged(14);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f21881f != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f21881f = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (14 == i4) {
            f((Boolean) obj);
            return true;
        }
        return false;
    }

    private ItemDetailBannerIndicatorBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.f21881f = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f21878c = frameLayout;
        frameLayout.setTag(null);
        View view2 = (View) objArr[1];
        this.f21879d = view2;
        view2.setTag(null);
        View view3 = (View) objArr[2];
        this.f21880e = view3;
        view3.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
