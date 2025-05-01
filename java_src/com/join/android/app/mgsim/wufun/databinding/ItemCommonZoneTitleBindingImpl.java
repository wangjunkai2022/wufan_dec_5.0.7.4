package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
/* loaded from: classes3.dex */
public class ItemCommonZoneTitleBindingImpl extends ItemCommonZoneTitleBinding {
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f21816e = null;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private static final SparseIntArray f21817f = null;

    /* renamed from: d  reason: collision with root package name */
    private long f21818d;

    public ItemCommonZoneTitleBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 1, f21816e, f21817f));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        synchronized (this) {
            j4 = this.f21818d;
            this.f21818d = 0L;
        }
        String str = this.f21815c;
        if ((j4 & 3) != 0) {
            TextViewBindingAdapter.setText(this.f21814b, str);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemCommonZoneTitleBinding
    public void f(@Nullable String str) {
        this.f21815c = str;
        synchronized (this) {
            this.f21818d |= 1;
        }
        notifyPropertyChanged(18);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f21818d != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f21818d = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (18 == i4) {
            f((String) obj);
            return true;
        }
        return false;
    }

    private ItemCommonZoneTitleBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[0]);
        this.f21818d = -1L;
        this.f21814b.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
