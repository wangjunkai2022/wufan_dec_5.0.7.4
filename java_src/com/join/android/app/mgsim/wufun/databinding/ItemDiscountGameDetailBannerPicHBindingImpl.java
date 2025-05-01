package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.bindingadapter.SimpleDrawableViewKt;
import com.join.kotlin.discount.proxy.GameDetailFragmentClickProxy;
/* loaded from: classes3.dex */
public class ItemDiscountGameDetailBannerPicHBindingImpl extends ItemDiscountGameDetailBannerPicHBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f21904h = null;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private static final SparseIntArray f21905i = null;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    private final ConstraintLayout f21906d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    private final SimpleDraweeView f21907e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private final View.OnClickListener f21908f;

    /* renamed from: g  reason: collision with root package name */
    private long f21909g;

    public ItemDiscountGameDetailBannerPicHBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f21904h, f21905i));
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        String str = this.f21902b;
        GameDetailFragmentClickProxy gameDetailFragmentClickProxy = this.f21903c;
        if (gameDetailFragmentClickProxy != null) {
            gameDetailFragmentClickProxy.horizontalPicClick(str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        synchronized (this) {
            j4 = this.f21909g;
            this.f21909g = 0L;
        }
        String str = this.f21902b;
        long j5 = 5 & j4;
        if ((j4 & 4) != 0) {
            this.f21907e.setOnClickListener(this.f21908f);
        }
        if (j5 != 0) {
            SimpleDrawableViewKt.loadUrl(this.f21907e, str, null, 0);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemDiscountGameDetailBannerPicHBinding
    public void g(@Nullable GameDetailFragmentClickProxy gameDetailFragmentClickProxy) {
        this.f21903c = gameDetailFragmentClickProxy;
        synchronized (this) {
            this.f21909g |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemDiscountGameDetailBannerPicHBinding
    public void h(@Nullable String str) {
        this.f21902b = str;
        synchronized (this) {
            this.f21909g |= 1;
        }
        notifyPropertyChanged(24);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f21909g != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f21909g = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (24 == i4) {
            h((String) obj);
        } else if (7 != i4) {
            return false;
        } else {
            g((GameDetailFragmentClickProxy) obj);
        }
        return true;
    }

    private ItemDiscountGameDetailBannerPicHBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.f21909g = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21906d = constraintLayout;
        constraintLayout.setTag(null);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) objArr[1];
        this.f21907e = simpleDraweeView;
        simpleDraweeView.setTag(null);
        setRootTag(view);
        this.f21908f = new a(this, 1);
        invalidateAll();
    }
}
