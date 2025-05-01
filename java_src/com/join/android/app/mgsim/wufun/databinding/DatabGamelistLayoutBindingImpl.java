package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.kotlin.domain.adapter.BaseDataBindingAdapter;
import com.join.kotlin.ui.modleregin.viewModle.GameListViewModle;
import com.psk.kotlin.util.CommonListMainData;
import java.util.List;
/* loaded from: classes3.dex */
public class DatabGamelistLayoutBindingImpl extends DatabGamelistLayoutBinding {
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f18318h = null;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private static final SparseIntArray f18319i = null;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    private final ConstraintLayout f18320f;

    /* renamed from: g  reason: collision with root package name */
    private long f18321g;

    public DatabGamelistLayoutBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f18318h, f18319i));
    }

    private boolean k(MutableLiveData<List<CommonListMainData>> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f18321g |= 1;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            r8 = this;
            monitor-enter(r8)
            long r0 = r8.f18321g     // Catch: java.lang.Throwable -> L34
            r2 = 0
            r8.f18321g = r2     // Catch: java.lang.Throwable -> L34
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L34
            com.join.kotlin.domain.adapter.BaseDataBindingAdapter<java.lang.Object, androidx.databinding.ViewDataBinding> r4 = r8.f18316d
            com.join.kotlin.ui.modleregin.viewModle.GameListViewModle r5 = r8.f18317e
            r6 = 29
            long r0 = r0 & r6
            r6 = 0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 == 0) goto L29
            if (r5 == 0) goto L1b
            androidx.lifecycle.MutableLiveData r5 = r5.getShowDatas()
            goto L1c
        L1b:
            r5 = r6
        L1c:
            r7 = 0
            r8.updateLiveDataRegistration(r7, r5)
            if (r5 == 0) goto L29
            java.lang.Object r5 = r5.getValue()
            java.util.List r5 = (java.util.List) r5
            goto L2a
        L29:
            r5 = r6
        L2a:
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 == 0) goto L33
            com.join.android.app.component.xrecyclerview.XRecyclerView r0 = r8.f18314b
            com.join.kotlin.bindingadapter.ViewbindingRecycleviewAdapterKt.xrecycleviewadapterBinding(r0, r5, r4, r6, r6)
        L33:
            return
        L34:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L34
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.DatabGamelistLayoutBindingImpl.executeBindings():void");
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.DatabGamelistLayoutBinding
    public void h(@Nullable BaseDataBindingAdapter<Object, ViewDataBinding> baseDataBindingAdapter) {
        this.f18316d = baseDataBindingAdapter;
        synchronized (this) {
            this.f18321g |= 4;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f18321g != 0;
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.DatabGamelistLayoutBinding
    public void i(@Nullable XRecyclerView.f fVar) {
        this.f18315c = fVar;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f18321g = 16L;
        }
        requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.DatabGamelistLayoutBinding
    public void j(@Nullable GameListViewModle gameListViewModle) {
        this.f18317e = gameListViewModle;
        synchronized (this) {
            this.f18321g |= 8;
        }
        notifyPropertyChanged(34);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        if (i4 != 0) {
            return false;
        }
        return k((MutableLiveData) obj, i5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (29 == i4) {
            i((XRecyclerView.f) obj);
            return true;
        } else if (1 == i4) {
            h((BaseDataBindingAdapter) obj);
            return true;
        } else if (34 == i4) {
            j((GameListViewModle) obj);
            return true;
        } else {
            return false;
        }
    }

    private DatabGamelistLayoutBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (XRecyclerView) objArr[1]);
        this.f18321g = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f18320f = constraintLayout;
        constraintLayout.setTag(null);
        this.f18314b.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
