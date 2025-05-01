package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.quark.proxy.QuarkInstallClickProxy;
import com.join.kotlin.quark.viewmodel.QuarkInstallViewModel;
/* loaded from: classes3.dex */
public class ActivityQuarkInstallBindingImpl extends ActivityQuarkInstallBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f16865n = null;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private static final SparseIntArray f16866o;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    private final LinearLayout f16867i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    private final ImageView f16868j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private final View.OnClickListener f16869k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private final View.OnClickListener f16870l;

    /* renamed from: m  reason: collision with root package name */
    private long f16871m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f16866o = sparseIntArray;
        sparseIntArray.put(R.id.tv_status, 3);
        sparseIntArray.put(R.id.iv_quark_logo, 4);
        sparseIntArray.put(R.id.tv_new_tip, 5);
        sparseIntArray.put(R.id.pb_progress, 6);
    }

    public ActivityQuarkInstallBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f16865n, f16866o));
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 == 1) {
            QuarkInstallClickProxy quarkInstallClickProxy = this.f16864h;
            if (quarkInstallClickProxy != null) {
                quarkInstallClickProxy.onInstallClick();
            }
        } else if (i4 != 2) {
        } else {
            QuarkInstallClickProxy quarkInstallClickProxy2 = this.f16864h;
            if (quarkInstallClickProxy2 != null) {
                quarkInstallClickProxy2.onCloseClick();
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        synchronized (this) {
            j4 = this.f16871m;
            this.f16871m = 0L;
        }
        if ((j4 & 4) != 0) {
            this.f16868j.setOnClickListener(this.f16870l);
            this.f16861e.setOnClickListener(this.f16869k);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityQuarkInstallBinding
    public void g(@Nullable QuarkInstallClickProxy quarkInstallClickProxy) {
        this.f16864h = quarkInstallClickProxy;
        synchronized (this) {
            this.f16871m |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityQuarkInstallBinding
    public void h(@Nullable QuarkInstallViewModel quarkInstallViewModel) {
        this.f16863g = quarkInstallViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f16871m != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f16871m = 4L;
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
            h((QuarkInstallViewModel) obj);
        } else if (7 != i4) {
            return false;
        } else {
            g((QuarkInstallClickProxy) obj);
        }
        return true;
    }

    private ActivityQuarkInstallBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[4], (ProgressBar) objArr[6], (TextView) objArr[5], (TextView) objArr[1], (TextView) objArr[3]);
        this.f16871m = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f16867i = linearLayout;
        linearLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[2];
        this.f16868j = imageView;
        imageView.setTag(null);
        this.f16861e.setTag(null);
        setRootTag(view);
        this.f16869k = new a(this, 1);
        this.f16870l = new a(this, 2);
        invalidateAll();
    }
}
