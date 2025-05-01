package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.domain.common.LoadBindClickProxy;
import com.join.kotlin.domain.common.LoadBindindData;
import com.join.kotlin.ui.cloudarchive.ModGameCloudViewModle;
import com.psk.kotlin.util.CommonListMainData;
import java.util.List;
/* loaded from: classes3.dex */
public class RecyclerviewLayoutDatabindingBindingImpl extends RecyclerviewLayoutDatabindingBinding {
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f26246i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private static final SparseIntArray f26247j;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    private final RelativeLayout f26248f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private final BinddingLoadLayoutIncludeBinding f26249g;

    /* renamed from: h  reason: collision with root package name */
    private long f26250h;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(3);
        f26246i = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"bindding_load_layout_include"}, new int[]{2}, new int[]{R.layout.bindding_load_layout_include});
        f26247j = null;
    }

    public RecyclerviewLayoutDatabindingBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f26246i, f26247j));
    }

    private boolean k(MutableLiveData<List<CommonListMainData>> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f26250h |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean l(MutableLiveData<LoadBindindData> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f26250h |= 1;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            r19 = this;
            r1 = r19
            monitor-enter(r19)
            long r2 = r1.f26250h     // Catch: java.lang.Throwable -> La3
            r4 = 0
            r1.f26250h = r4     // Catch: java.lang.Throwable -> La3
            monitor-exit(r19)     // Catch: java.lang.Throwable -> La3
            com.join.kotlin.ui.cloudarchive.ModGameCloudViewModle r0 = r1.f26243c
            com.join.kotlin.domain.common.LoadBindClickProxy r6 = r1.f26245e
            r7 = 39
            long r7 = r7 & r2
            r9 = 38
            r11 = 37
            r14 = 0
            int r15 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r15 == 0) goto L75
            long r7 = r2 & r11
            r15 = 1
            int r16 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r16 == 0) goto L57
            if (r0 == 0) goto L2a
            androidx.lifecycle.MutableLiveData r16 = r0.getLoadBindData()
            r13 = r16
            goto L2b
        L2a:
            r13 = 0
        L2b:
            r1.updateLiveDataRegistration(r14, r13)
            if (r13 == 0) goto L37
            java.lang.Object r13 = r13.getValue()
            com.join.kotlin.domain.common.LoadBindindData r13 = (com.join.kotlin.domain.common.LoadBindindData) r13
            goto L38
        L37:
            r13 = 0
        L38:
            if (r13 == 0) goto L40
            int r17 = r13.getShowStatus()
            r14 = r17
        L40:
            if (r14 != r15) goto L44
            r14 = 1
            goto L45
        L44:
            r14 = 0
        L45:
            int r18 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r18 == 0) goto L51
            if (r14 == 0) goto L4e
            r7 = 128(0x80, double:6.32E-322)
            goto L50
        L4e:
            r7 = 64
        L50:
            long r2 = r2 | r7
        L51:
            if (r14 == 0) goto L54
            goto L58
        L54:
            r14 = 8
            goto L59
        L57:
            r13 = 0
        L58:
            r14 = 0
        L59:
            long r7 = r2 & r9
            int r17 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r17 == 0) goto L73
            if (r0 == 0) goto L66
            androidx.lifecycle.MutableLiveData r0 = r0.getListArchive()
            goto L67
        L66:
            r0 = 0
        L67:
            r1.updateLiveDataRegistration(r15, r0)
            if (r0 == 0) goto L73
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            goto L78
        L73:
            r0 = 0
            goto L78
        L75:
            r0 = 0
            r13 = 0
            r14 = 0
        L78:
            r7 = 40
            long r7 = r7 & r2
            long r11 = r11 & r2
            int r15 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r15 == 0) goto L8a
            com.join.android.app.mgsim.wufun.databinding.BinddingLoadLayoutIncludeBinding r11 = r1.f26249g
            r11.g(r13)
            com.join.android.app.component.xrecyclerview.XRecyclerView r11 = r1.f26242b
            r11.setVisibility(r14)
        L8a:
            int r11 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r11 == 0) goto L93
            com.join.android.app.mgsim.wufun.databinding.BinddingLoadLayoutIncludeBinding r7 = r1.f26249g
            r7.h(r6)
        L93:
            long r2 = r2 & r9
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L9d
            com.join.android.app.component.xrecyclerview.XRecyclerView r2 = r1.f26242b
            com.join.kotlin.bindingadapter.ViewbindingRecycleviewAdapterKt.recycleviewdataBinding(r2, r0)
        L9d:
            com.join.android.app.mgsim.wufun.databinding.BinddingLoadLayoutIncludeBinding r0 = r1.f26249g
            androidx.databinding.ViewDataBinding.executeBindingsOn(r0)
            return
        La3:
            r0 = move-exception
            monitor-exit(r19)     // Catch: java.lang.Throwable -> La3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.RecyclerviewLayoutDatabindingBindingImpl.executeBindings():void");
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.RecyclerviewLayoutDatabindingBinding
    public void h(@Nullable RecyclerView.Adapter adapter) {
        this.f26244d = adapter;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.f26250h != 0) {
                return true;
            }
            return this.f26249g.hasPendingBindings();
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.RecyclerviewLayoutDatabindingBinding
    public void i(@Nullable LoadBindClickProxy loadBindClickProxy) {
        this.f26245e = loadBindClickProxy;
        synchronized (this) {
            this.f26250h |= 8;
        }
        notifyPropertyChanged(21);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f26250h = 32L;
        }
        this.f26249g.invalidateAll();
        requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.RecyclerviewLayoutDatabindingBinding
    public void j(@Nullable ModGameCloudViewModle modGameCloudViewModle) {
        this.f26243c = modGameCloudViewModle;
        synchronized (this) {
            this.f26250h |= 4;
        }
        notifyPropertyChanged(34);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        if (i4 != 0) {
            if (i4 != 1) {
                return false;
            }
            return k((MutableLiveData) obj, i5);
        }
        return l((MutableLiveData) obj, i5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f26249g.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (34 == i4) {
            j((ModGameCloudViewModle) obj);
            return true;
        } else if (21 == i4) {
            i((LoadBindClickProxy) obj);
            return true;
        } else if (1 == i4) {
            h((RecyclerView.Adapter) obj);
            return true;
        } else {
            return false;
        }
    }

    private RecyclerviewLayoutDatabindingBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (XRecyclerView) objArr[1]);
        this.f26250h = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f26248f = relativeLayout;
        relativeLayout.setTag(null);
        BinddingLoadLayoutIncludeBinding binddingLoadLayoutIncludeBinding = (BinddingLoadLayoutIncludeBinding) objArr[2];
        this.f26249g = binddingLoadLayoutIncludeBinding;
        setContainedBinding(binddingLoadLayoutIncludeBinding);
        this.f26242b.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
