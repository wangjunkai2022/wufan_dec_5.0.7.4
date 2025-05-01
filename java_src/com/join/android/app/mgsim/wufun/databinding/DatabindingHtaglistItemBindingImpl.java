package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.kotlin.bindingadapter.SimpleDrawableViewKt;
import com.join.mgps.dto.BannerBean;
/* loaded from: classes3.dex */
public class DatabindingHtaglistItemBindingImpl extends DatabindingHtaglistItemBinding {
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f18333f = null;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private static final SparseIntArray f18334g = null;

    /* renamed from: e  reason: collision with root package name */
    private long f18335e;

    public DatabindingHtaglistItemBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f18333f, f18334g));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        synchronized (this) {
            j4 = this.f18335e;
            this.f18335e = 0L;
        }
        BannerBean bannerBean = this.f18332d;
        long j5 = j4 & 3;
        String pic_remote = (j5 == 0 || bannerBean == null) ? null : bannerBean.getPic_remote();
        if (j5 != 0) {
            SimpleDrawableViewKt.loadUrl(this.f18330b, pic_remote, null, 0);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.DatabindingHtaglistItemBinding
    public void f(@Nullable BannerBean bannerBean) {
        this.f18332d = bannerBean;
        synchronized (this) {
            this.f18335e |= 1;
        }
        notifyPropertyChanged(9);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f18335e != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f18335e = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (9 == i4) {
            f((BannerBean) obj);
            return true;
        }
        return false;
    }

    private DatabindingHtaglistItemBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (SimpleDraweeView) objArr[1], (LinearLayout) objArr[0]);
        this.f18335e = -1L;
        this.f18330b.setTag(null);
        this.f18331c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
