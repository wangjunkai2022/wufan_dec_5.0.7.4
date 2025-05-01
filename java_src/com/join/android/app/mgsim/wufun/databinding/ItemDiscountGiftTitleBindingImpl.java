package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
/* loaded from: classes3.dex */
public class ItemDiscountGiftTitleBindingImpl extends ItemDiscountGiftTitleBinding {
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f21987f = null;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private static final SparseIntArray f21988g = null;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    private final ConstraintLayout f21989d;

    /* renamed from: e  reason: collision with root package name */
    private long f21990e;

    public ItemDiscountGiftTitleBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f21987f, f21988g));
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemDiscountGiftTitleBinding
    public void e(@Nullable String str) {
        this.f21986c = str;
        synchronized (this) {
            this.f21990e |= 1;
        }
        notifyPropertyChanged(30);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        synchronized (this) {
            j4 = this.f21990e;
            this.f21990e = 0L;
        }
        String str = this.f21986c;
        if ((j4 & 3) != 0) {
            TextViewBindingAdapter.setText(this.f21985b, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f21990e != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f21990e = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (30 == i4) {
            e((String) obj);
            return true;
        }
        return false;
    }

    private ItemDiscountGiftTitleBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[1]);
        this.f21990e = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21989d = constraintLayout;
        constraintLayout.setTag(null);
        this.f21985b.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
