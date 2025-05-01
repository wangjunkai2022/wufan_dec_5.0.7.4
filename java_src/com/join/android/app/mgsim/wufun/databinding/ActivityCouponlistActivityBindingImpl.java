package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.domain.adapter.BaseDataBindingAdapter;
import com.join.kotlin.domain.common.LoadBindClickProxy;
import com.join.kotlin.domain.common.LoadBindindData;
import com.join.kotlin.ui.coupon.ClickProxy;
import com.join.kotlin.ui.coupon.CouponViewModle;
import com.join.mgps.dto.BTGameCouponBean;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public class ActivityCouponlistActivityBindingImpl extends ActivityCouponlistActivityBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f15828m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private static final SparseIntArray f15829n;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    private final LinearLayout f15830i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private final BinddingLoadLayoutIncludeBinding f15831j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private final View.OnClickListener f15832k;

    /* renamed from: l  reason: collision with root package name */
    private long f15833l;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(5);
        f15828m = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"bindding_load_layout_include"}, new int[]{4}, new int[]{R.layout.bindding_load_layout_include});
        f15829n = null;
    }

    public ActivityCouponlistActivityBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f15828m, f15829n));
    }

    private boolean m(MutableLiveData<ArrayList<BTGameCouponBean>> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f15833l |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean n(MutableLiveData<LoadBindindData> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f15833l |= 2;
            }
            return true;
        }
        return false;
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        ClickProxy clickProxy = this.f15826g;
        if (clickProxy != null) {
            clickProxy.onClickBack();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d2  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.ActivityCouponlistActivityBindingImpl.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.f15833l != 0) {
                return true;
            }
            return this.f15831j.hasPendingBindings();
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityCouponlistActivityBinding
    public void i(@Nullable BaseDataBindingAdapter baseDataBindingAdapter) {
        this.f15825f = baseDataBindingAdapter;
        synchronized (this) {
            this.f15833l |= 16;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f15833l = 64L;
        }
        this.f15831j.invalidateAll();
        requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityCouponlistActivityBinding
    public void j(@Nullable ClickProxy clickProxy) {
        this.f15826g = clickProxy;
        synchronized (this) {
            this.f15833l |= 32;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityCouponlistActivityBinding
    public void k(@Nullable LoadBindClickProxy loadBindClickProxy) {
        this.f15827h = loadBindClickProxy;
        synchronized (this) {
            this.f15833l |= 4;
        }
        notifyPropertyChanged(21);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityCouponlistActivityBinding
    public void l(@Nullable CouponViewModle couponViewModle) {
        this.f15824e = couponViewModle;
        synchronized (this) {
            this.f15833l |= 8;
        }
        notifyPropertyChanged(36);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        if (i4 != 0) {
            if (i4 != 1) {
                return false;
            }
            return n((MutableLiveData) obj, i5);
        }
        return m((MutableLiveData) obj, i5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f15831j.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (21 == i4) {
            k((LoadBindClickProxy) obj);
            return true;
        } else if (36 == i4) {
            l((CouponViewModle) obj);
            return true;
        } else if (1 == i4) {
            i((BaseDataBindingAdapter) obj);
            return true;
        } else if (7 == i4) {
            j((ClickProxy) obj);
            return true;
        } else {
            return false;
        }
    }

    private ActivityCouponlistActivityBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (ImageView) objArr[1], (RecyclerView) objArr[3], (TextView) objArr[2]);
        this.f15833l = -1L;
        this.f15821b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f15830i = linearLayout;
        linearLayout.setTag(null);
        BinddingLoadLayoutIncludeBinding binddingLoadLayoutIncludeBinding = (BinddingLoadLayoutIncludeBinding) objArr[4];
        this.f15831j = binddingLoadLayoutIncludeBinding;
        setContainedBinding(binddingLoadLayoutIncludeBinding);
        this.f15822c.setTag(null);
        this.f15823d.setTag(null);
        setRootTag(view);
        this.f15832k = new a(this, 1);
        invalidateAll();
    }
}
