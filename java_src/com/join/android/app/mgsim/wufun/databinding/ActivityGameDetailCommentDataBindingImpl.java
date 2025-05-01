package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.discount.proxy.GameDetailCommentDataClickProxy;
import com.join.kotlin.discount.viewmodel.GameDetailCommentDataViewModel;
/* loaded from: classes3.dex */
public class ActivityGameDetailCommentDataBindingImpl extends ActivityGameDetailCommentDataBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f16234m = null;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private static final SparseIntArray f16235n;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    private final View f16236i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private final View.OnClickListener f16237j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private final View.OnClickListener f16238k;

    /* renamed from: l  reason: collision with root package name */
    private long f16239l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f16235n = sparseIntArray;
        sparseIntArray.put(R.id.cl_container, 3);
        sparseIntArray.put(R.id.tablayout, 4);
        sparseIntArray.put(R.id.viewpager, 5);
    }

    public ActivityGameDetailCommentDataBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f16234m, f16235n));
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 == 1) {
            GameDetailCommentDataClickProxy gameDetailCommentDataClickProxy = this.f16233h;
            if (gameDetailCommentDataClickProxy != null) {
                gameDetailCommentDataClickProxy.onBackClick();
            }
        } else if (i4 != 2) {
        } else {
            GameDetailCommentDataClickProxy gameDetailCommentDataClickProxy2 = this.f16233h;
            if (gameDetailCommentDataClickProxy2 != null) {
                gameDetailCommentDataClickProxy2.onBackClick();
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        synchronized (this) {
            j4 = this.f16239l;
            this.f16239l = 0L;
        }
        if ((j4 & 4) != 0) {
            this.f16227b.setOnClickListener(this.f16237j);
            this.f16236i.setOnClickListener(this.f16238k);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityGameDetailCommentDataBinding
    public void g(@Nullable GameDetailCommentDataClickProxy gameDetailCommentDataClickProxy) {
        this.f16233h = gameDetailCommentDataClickProxy;
        synchronized (this) {
            this.f16239l |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityGameDetailCommentDataBinding
    public void h(@Nullable GameDetailCommentDataViewModel gameDetailCommentDataViewModel) {
        this.f16232g = gameDetailCommentDataViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f16239l != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f16239l = 4L;
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
            h((GameDetailCommentDataViewModel) obj);
        } else if (7 != i4) {
            return false;
        } else {
            g((GameDetailCommentDataClickProxy) obj);
        }
        return true;
    }

    private ActivityGameDetailCommentDataBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[2], (ConstraintLayout) objArr[3], (ConstraintLayout) objArr[0], (TabLayout) objArr[4], (ViewPager2) objArr[5]);
        this.f16239l = -1L;
        this.f16227b.setTag(null);
        this.f16229d.setTag(null);
        View view2 = (View) objArr[1];
        this.f16236i = view2;
        view2.setTag(null);
        setRootTag(view);
        this.f16237j = new a(this, 2);
        this.f16238k = new a(this, 1);
        invalidateAll();
    }
}
