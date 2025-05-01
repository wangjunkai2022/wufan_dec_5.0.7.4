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
import com.join.kotlin.discount.proxy.GameDetailFragmentClickProxy;
/* loaded from: classes3.dex */
public class ItemDiscountGameDetailBannerPicVBindingImpl extends ItemDiscountGameDetailBannerPicVBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f21914n = null;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private static final SparseIntArray f21915o = null;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    private final ConstraintLayout f21916f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    private final SimpleDraweeView f21917g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    private final SimpleDraweeView f21918h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    private final SimpleDraweeView f21919i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private final View.OnClickListener f21920j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private final View.OnClickListener f21921k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private final View.OnClickListener f21922l;

    /* renamed from: m  reason: collision with root package name */
    private long f21923m;

    public ItemDiscountGameDetailBannerPicVBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, f21914n, f21915o));
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 == 1) {
            String str = this.f21910b;
            GameDetailFragmentClickProxy gameDetailFragmentClickProxy = this.f21913e;
            if (gameDetailFragmentClickProxy != null) {
                gameDetailFragmentClickProxy.verticalPicClick(str);
            }
        } else if (i4 == 2) {
            String str2 = this.f21911c;
            GameDetailFragmentClickProxy gameDetailFragmentClickProxy2 = this.f21913e;
            if (gameDetailFragmentClickProxy2 != null) {
                gameDetailFragmentClickProxy2.verticalPicClick(str2);
            }
        } else if (i4 != 3) {
        } else {
            String str3 = this.f21912d;
            GameDetailFragmentClickProxy gameDetailFragmentClickProxy3 = this.f21913e;
            if (gameDetailFragmentClickProxy3 != null) {
                gameDetailFragmentClickProxy3.verticalPicClick(str3);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x00e9, code lost:
        if (r14 != false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f5  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.ItemDiscountGameDetailBannerPicVBindingImpl.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f21923m != 0;
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemDiscountGameDetailBannerPicVBinding
    public void i(@Nullable GameDetailFragmentClickProxy gameDetailFragmentClickProxy) {
        this.f21913e = gameDetailFragmentClickProxy;
        synchronized (this) {
            this.f21923m |= 8;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f21923m = 16L;
        }
        requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemDiscountGameDetailBannerPicVBinding
    public void j(@Nullable String str) {
        this.f21910b = str;
        synchronized (this) {
            this.f21923m |= 4;
        }
        notifyPropertyChanged(25);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemDiscountGameDetailBannerPicVBinding
    public void k(@Nullable String str) {
        this.f21911c = str;
        synchronized (this) {
            this.f21923m |= 1;
        }
        notifyPropertyChanged(26);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemDiscountGameDetailBannerPicVBinding
    public void l(@Nullable String str) {
        this.f21912d = str;
        synchronized (this) {
            this.f21923m |= 2;
        }
        notifyPropertyChanged(27);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (26 == i4) {
            k((String) obj);
        } else if (27 == i4) {
            l((String) obj);
        } else if (25 == i4) {
            j((String) obj);
        } else if (7 != i4) {
            return false;
        } else {
            i((GameDetailFragmentClickProxy) obj);
        }
        return true;
    }

    private ItemDiscountGameDetailBannerPicVBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.f21923m = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21916f = constraintLayout;
        constraintLayout.setTag(null);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) objArr[1];
        this.f21917g = simpleDraweeView;
        simpleDraweeView.setTag(null);
        SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) objArr[2];
        this.f21918h = simpleDraweeView2;
        simpleDraweeView2.setTag(null);
        SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) objArr[3];
        this.f21919i = simpleDraweeView3;
        simpleDraweeView3.setTag(null);
        setRootTag(view);
        this.f21920j = new a(this, 3);
        this.f21921k = new a(this, 1);
        this.f21922l = new a(this, 2);
        invalidateAll();
    }
}
