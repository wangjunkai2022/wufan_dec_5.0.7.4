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
public class ItemDiscountGameDetailBannerPicVSingleBindingImpl extends ItemDiscountGameDetailBannerPicVSingleBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f21926h = null;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private static final SparseIntArray f21927i = null;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    private final ConstraintLayout f21928d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    private final SimpleDraweeView f21929e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private final View.OnClickListener f21930f;

    /* renamed from: g  reason: collision with root package name */
    private long f21931g;

    public ItemDiscountGameDetailBannerPicVSingleBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f21926h, f21927i));
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        String str = this.f21924b;
        GameDetailFragmentClickProxy gameDetailFragmentClickProxy = this.f21925c;
        if (gameDetailFragmentClickProxy != null) {
            gameDetailFragmentClickProxy.horizontalPicClick(str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        synchronized (this) {
            j4 = this.f21931g;
            this.f21931g = 0L;
        }
        String str = this.f21924b;
        long j5 = 5 & j4;
        if ((j4 & 4) != 0) {
            this.f21929e.setOnClickListener(this.f21930f);
        }
        if (j5 != 0) {
            SimpleDrawableViewKt.loadUrl(this.f21929e, str, null, 0);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemDiscountGameDetailBannerPicVSingleBinding
    public void g(@Nullable GameDetailFragmentClickProxy gameDetailFragmentClickProxy) {
        this.f21925c = gameDetailFragmentClickProxy;
        synchronized (this) {
            this.f21931g |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemDiscountGameDetailBannerPicVSingleBinding
    public void h(@Nullable String str) {
        this.f21924b = str;
        synchronized (this) {
            this.f21931g |= 1;
        }
        notifyPropertyChanged(24);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f21931g != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f21931g = 4L;
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

    private ItemDiscountGameDetailBannerPicVSingleBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.f21931g = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21928d = constraintLayout;
        constraintLayout.setTag(null);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) objArr[1];
        this.f21929e = simpleDraweeView;
        simpleDraweeView.setTag(null);
        setRootTag(view);
        this.f21930f = new a(this, 1);
        invalidateAll();
    }
}
