package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.kotlin.bindingadapter.SimpleDrawableViewKt;
import com.join.mgps.dto.CommonGameInfoBean;
/* loaded from: classes3.dex */
public class ItemCommonZoneAdBindingImpl extends ItemCommonZoneAdBinding {
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f21768f = null;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private static final SparseIntArray f21769g = null;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    private final ConstraintLayout f21770d;

    /* renamed from: e  reason: collision with root package name */
    private long f21771e;

    public ItemCommonZoneAdBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f21768f, f21769g));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        synchronized (this) {
            j4 = this.f21771e;
            this.f21771e = 0L;
        }
        CommonGameInfoBean commonGameInfoBean = this.f21767c;
        long j5 = j4 & 3;
        String coverPicUrl = (j5 == 0 || commonGameInfoBean == null) ? null : commonGameInfoBean.getCoverPicUrl();
        if (j5 != 0) {
            SimpleDrawableViewKt.loadUrl(this.f21766b, null, coverPicUrl, 0);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemCommonZoneAdBinding
    public void f(@Nullable CommonGameInfoBean commonGameInfoBean) {
        this.f21767c = commonGameInfoBean;
        synchronized (this) {
            this.f21771e |= 1;
        }
        notifyPropertyChanged(18);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f21771e != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f21771e = 2L;
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
            f((CommonGameInfoBean) obj);
            return true;
        }
        return false;
    }

    private ItemCommonZoneAdBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (SimpleDraweeView) objArr[1]);
        this.f21771e = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21770d = constraintLayout;
        constraintLayout.setTag(null);
        this.f21766b.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
