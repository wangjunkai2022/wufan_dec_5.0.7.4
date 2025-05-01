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
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import com.join.kotlin.domain.common.LoadBindClickProxy;
import com.join.kotlin.domain.common.LoadBindindData;
import com.join.kotlin.ui.notice.ClickProxy;
import com.join.kotlin.zone.viewmodel.CommonZoneViewModel;
/* loaded from: classes3.dex */
public class ActivityCommonZoneBindingImpl extends ActivityCommonZoneBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f15815l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private static final SparseIntArray f15816m;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    private final LinearLayout f15817h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private final BinddingLoadLayoutIncludeBinding f15818i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private final View.OnClickListener f15819j;

    /* renamed from: k  reason: collision with root package name */
    private long f15820k;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(5);
        f15815l = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"bindding_load_layout_include"}, new int[]{4}, new int[]{R.layout.bindding_load_layout_include});
        f15816m = null;
    }

    public ActivityCommonZoneBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f15815l, f15816m));
    }

    private boolean k(MutableLiveData<LoadBindindData> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f15820k |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean l(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f15820k |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        ClickProxy clickProxy = this.f15813f;
        if (clickProxy != null) {
            clickProxy.onClickBack();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            r17 = this;
            r1 = r17
            monitor-enter(r17)
            long r2 = r1.f15820k     // Catch: java.lang.Throwable -> Lab
            r4 = 0
            r1.f15820k = r4     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r17)     // Catch: java.lang.Throwable -> Lab
            com.join.kotlin.domain.common.LoadBindClickProxy r0 = r1.f15814g
            com.join.kotlin.zone.viewmodel.CommonZoneViewModel r6 = r1.f15812e
            r7 = 43
            long r7 = r7 & r2
            r9 = 42
            r11 = 41
            r13 = 0
            r14 = 0
            int r15 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r15 == 0) goto L71
            long r7 = r2 & r11
            int r15 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r15 == 0) goto L35
            if (r6 == 0) goto L28
            androidx.lifecycle.MutableLiveData r7 = r6.getTitle()
            goto L29
        L28:
            r7 = r13
        L29:
            r1.updateLiveDataRegistration(r14, r7)
            if (r7 == 0) goto L35
            java.lang.Object r7 = r7.getValue()
            java.lang.String r7 = (java.lang.String) r7
            goto L36
        L35:
            r7 = r13
        L36:
            long r15 = r2 & r9
            int r8 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r8 == 0) goto L72
            if (r6 == 0) goto L43
            androidx.lifecycle.MutableLiveData r6 = r6.getLoadBindData()
            goto L44
        L43:
            r6 = r13
        L44:
            r8 = 1
            r1.updateLiveDataRegistration(r8, r6)
            if (r6 == 0) goto L51
            java.lang.Object r6 = r6.getValue()
            r13 = r6
            com.join.kotlin.domain.common.LoadBindindData r13 = (com.join.kotlin.domain.common.LoadBindindData) r13
        L51:
            if (r13 == 0) goto L58
            int r6 = r13.getShowStatus()
            goto L59
        L58:
            r6 = 0
        L59:
            if (r6 != r8) goto L5c
            goto L5d
        L5c:
            r8 = 0
        L5d:
            int r6 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r6 == 0) goto L69
            if (r8 == 0) goto L66
            r15 = 128(0x80, double:6.32E-322)
            goto L68
        L66:
            r15 = 64
        L68:
            long r2 = r2 | r15
        L69:
            if (r8 == 0) goto L6c
            goto L72
        L6c:
            r6 = 8
            r14 = 8
            goto L72
        L71:
            r7 = r13
        L72:
            r15 = 32
            long r15 = r15 & r2
            int r6 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r6 == 0) goto L80
            android.widget.ImageView r6 = r1.f15809b
            android.view.View$OnClickListener r8 = r1.f15819j
            r6.setOnClickListener(r8)
        L80:
            long r9 = r9 & r2
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 == 0) goto L8f
            com.join.android.app.mgsim.wufun.databinding.BinddingLoadLayoutIncludeBinding r6 = r1.f15818i
            r6.g(r13)
            com.join.kotlin.base.widget.recycleview.XQuickRecyclerView r6 = r1.f15811d
            r6.setVisibility(r14)
        L8f:
            r8 = 36
            long r8 = r8 & r2
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L9b
            com.join.android.app.mgsim.wufun.databinding.BinddingLoadLayoutIncludeBinding r6 = r1.f15818i
            r6.h(r0)
        L9b:
            long r2 = r2 & r11
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto La5
            android.widget.TextView r0 = r1.f15810c
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r7)
        La5:
            com.join.android.app.mgsim.wufun.databinding.BinddingLoadLayoutIncludeBinding r0 = r1.f15818i
            androidx.databinding.ViewDataBinding.executeBindingsOn(r0)
            return
        Lab:
            r0 = move-exception
            monitor-exit(r17)     // Catch: java.lang.Throwable -> Lab
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.ActivityCommonZoneBindingImpl.executeBindings():void");
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityCommonZoneBinding
    public void h(@Nullable ClickProxy clickProxy) {
        this.f15813f = clickProxy;
        synchronized (this) {
            this.f15820k |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.f15820k != 0) {
                return true;
            }
            return this.f15818i.hasPendingBindings();
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityCommonZoneBinding
    public void i(@Nullable LoadBindClickProxy loadBindClickProxy) {
        this.f15814g = loadBindClickProxy;
        synchronized (this) {
            this.f15820k |= 4;
        }
        notifyPropertyChanged(21);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f15820k = 32L;
        }
        this.f15818i.invalidateAll();
        requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityCommonZoneBinding
    public void j(@Nullable CommonZoneViewModel commonZoneViewModel) {
        this.f15812e = commonZoneViewModel;
        synchronized (this) {
            this.f15820k |= 8;
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
            return k((MutableLiveData) obj, i5);
        }
        return l((MutableLiveData) obj, i5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f15818i.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (21 == i4) {
            i((LoadBindClickProxy) obj);
        } else if (36 == i4) {
            j((CommonZoneViewModel) obj);
        } else if (7 != i4) {
            return false;
        } else {
            h((ClickProxy) obj);
        }
        return true;
    }

    private ActivityCommonZoneBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (ImageView) objArr[1], (TextView) objArr[2], (XQuickRecyclerView) objArr[3]);
        this.f15820k = -1L;
        this.f15809b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f15817h = linearLayout;
        linearLayout.setTag(null);
        BinddingLoadLayoutIncludeBinding binddingLoadLayoutIncludeBinding = (BinddingLoadLayoutIncludeBinding) objArr[4];
        this.f15818i = binddingLoadLayoutIncludeBinding;
        setContainedBinding(binddingLoadLayoutIncludeBinding);
        this.f15810c.setTag(null);
        this.f15811d.setTag(null);
        setRootTag(view);
        this.f15819j = new a(this, 1);
        invalidateAll();
    }
}
