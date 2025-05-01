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
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import com.join.kotlin.quark.proxy.QuarkSearchClickProxy;
import com.join.kotlin.quark.viewmodel.QuarkSearchViewModel;
/* loaded from: classes3.dex */
public class ActivityQuarkSearchResultBindingImpl extends ActivityQuarkSearchResultBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f16900j = null;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private static final SparseIntArray f16901k;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    private final LinearLayout f16902g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private final View.OnClickListener f16903h;

    /* renamed from: i  reason: collision with root package name */
    private long f16904i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f16901k = sparseIntArray;
        sparseIntArray.put(R.id.xrv_list, 3);
    }

    public ActivityQuarkSearchResultBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, f16900j, f16901k));
    }

    private boolean i(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f16904i |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        QuarkSearchClickProxy quarkSearchClickProxy = this.f16899f;
        if (quarkSearchClickProxy != null) {
            quarkSearchClickProxy.onBackClick();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        synchronized (this) {
            j4 = this.f16904i;
            this.f16904i = 0L;
        }
        QuarkSearchViewModel quarkSearchViewModel = this.f16898e;
        long j5 = 11 & j4;
        String str = null;
        if (j5 != 0) {
            MutableLiveData<String> title = quarkSearchViewModel != null ? quarkSearchViewModel.getTitle() : null;
            updateLiveDataRegistration(0, title);
            if (title != null) {
                str = title.getValue();
            }
        }
        if ((j4 & 8) != 0) {
            this.f16895b.setOnClickListener(this.f16903h);
        }
        if (j5 != 0) {
            TextViewBindingAdapter.setText(this.f16896c, str);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityQuarkSearchResultBinding
    public void g(@Nullable QuarkSearchClickProxy quarkSearchClickProxy) {
        this.f16899f = quarkSearchClickProxy;
        synchronized (this) {
            this.f16904i |= 4;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityQuarkSearchResultBinding
    public void h(@Nullable QuarkSearchViewModel quarkSearchViewModel) {
        this.f16898e = quarkSearchViewModel;
        synchronized (this) {
            this.f16904i |= 2;
        }
        notifyPropertyChanged(36);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f16904i != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f16904i = 8L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        if (i4 != 0) {
            return false;
        }
        return i((MutableLiveData) obj, i5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (36 == i4) {
            h((QuarkSearchViewModel) obj);
        } else if (7 != i4) {
            return false;
        } else {
            g((QuarkSearchClickProxy) obj);
        }
        return true;
    }

    private ActivityQuarkSearchResultBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (ImageView) objArr[1], (TextView) objArr[2], (XQuickRecyclerView) objArr[3]);
        this.f16904i = -1L;
        this.f16895b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f16902g = linearLayout;
        linearLayout.setTag(null);
        this.f16896c.setTag(null);
        setRootTag(view);
        this.f16903h = new a(this, 1);
        invalidateAll();
    }
}
