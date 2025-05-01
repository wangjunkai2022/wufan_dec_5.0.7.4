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
import androidx.lifecycle.MutableLiveData;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.quark.model.bean.SortTypeBean;
import com.join.kotlin.quark.proxy.SourceHopeClickProxy;
import com.join.kotlin.quark.viewmodel.SourceHopeViewModel;
/* loaded from: classes3.dex */
public class ActivityQuarkSourceHopeListBindingImpl extends ActivityQuarkSourceHopeListBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f16912o = null;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    private static final SparseIntArray f16913p;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    private final LinearLayout f16914i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    private final TextView f16915j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private final View.OnClickListener f16916k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private final View.OnClickListener f16917l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private final View.OnClickListener f16918m;

    /* renamed from: n  reason: collision with root package name */
    private long f16919n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f16913p = sparseIntArray;
        sparseIntArray.put(R.id.tabLayout, 5);
        sparseIntArray.put(R.id.viewPager, 6);
    }

    public ActivityQuarkSourceHopeListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f16912o, f16913p));
    }

    private boolean i(MutableLiveData<SortTypeBean> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f16919n |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean j(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f16919n |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 == 1) {
            SourceHopeClickProxy sourceHopeClickProxy = this.f16911h;
            if (sourceHopeClickProxy != null) {
                sourceHopeClickProxy.onBackClick();
            }
        } else if (i4 == 2) {
            SourceHopeClickProxy sourceHopeClickProxy2 = this.f16911h;
            if (sourceHopeClickProxy2 != null) {
                sourceHopeClickProxy2.onSortTypeClick();
            }
        } else if (i4 != 3) {
        } else {
            SourceHopeClickProxy sourceHopeClickProxy3 = this.f16911h;
            if (sourceHopeClickProxy3 != null) {
                sourceHopeClickProxy3.onWishCreateClick();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            r14 = this;
            monitor-enter(r14)
            long r0 = r14.f16919n     // Catch: java.lang.Throwable -> L8a
            r2 = 0
            r14.f16919n = r2     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L8a
            com.join.kotlin.quark.viewmodel.SourceHopeViewModel r4 = r14.f16910g
            r5 = 23
            long r5 = r5 & r0
            r7 = 22
            r9 = 21
            r11 = 0
            int r12 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r12 == 0) goto L57
            long r5 = r0 & r9
            int r12 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r12 == 0) goto L31
            if (r4 == 0) goto L23
            androidx.lifecycle.MutableLiveData r5 = r4.getTitle()
            goto L24
        L23:
            r5 = r11
        L24:
            r6 = 0
            r14.updateLiveDataRegistration(r6, r5)
            if (r5 == 0) goto L31
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            goto L32
        L31:
            r5 = r11
        L32:
            long r12 = r0 & r7
            int r6 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r6 == 0) goto L54
            if (r4 == 0) goto L3f
            androidx.lifecycle.MutableLiveData r4 = r4.getSortType()
            goto L40
        L3f:
            r4 = r11
        L40:
            r6 = 1
            r14.updateLiveDataRegistration(r6, r4)
            if (r4 == 0) goto L4d
            java.lang.Object r4 = r4.getValue()
            com.join.kotlin.quark.model.bean.SortTypeBean r4 = (com.join.kotlin.quark.model.bean.SortTypeBean) r4
            goto L4e
        L4d:
            r4 = r11
        L4e:
            if (r4 == 0) goto L54
            java.lang.String r11 = r4.getTypeName()
        L54:
            r4 = r11
            r11 = r5
            goto L58
        L57:
            r4 = r11
        L58:
            r5 = 16
            long r5 = r5 & r0
            int r12 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r12 == 0) goto L74
            android.widget.ImageView r5 = r14.f16905b
            android.view.View$OnClickListener r6 = r14.f16917l
            r5.setOnClickListener(r6)
            android.widget.TextView r5 = r14.f16915j
            android.view.View$OnClickListener r6 = r14.f16916k
            r5.setOnClickListener(r6)
            android.widget.TextView r5 = r14.f16908e
            android.view.View$OnClickListener r6 = r14.f16918m
            r5.setOnClickListener(r6)
        L74:
            long r5 = r0 & r9
            int r9 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r9 == 0) goto L7f
            android.widget.TextView r5 = r14.f16907d
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r5, r11)
        L7f:
            long r0 = r0 & r7
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L89
            android.widget.TextView r0 = r14.f16908e
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r4)
        L89:
            return
        L8a:
            r0 = move-exception
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L8a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.ActivityQuarkSourceHopeListBindingImpl.executeBindings():void");
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityQuarkSourceHopeListBinding
    public void g(@Nullable SourceHopeClickProxy sourceHopeClickProxy) {
        this.f16911h = sourceHopeClickProxy;
        synchronized (this) {
            this.f16919n |= 8;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityQuarkSourceHopeListBinding
    public void h(@Nullable SourceHopeViewModel sourceHopeViewModel) {
        this.f16910g = sourceHopeViewModel;
        synchronized (this) {
            this.f16919n |= 4;
        }
        notifyPropertyChanged(36);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f16919n != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f16919n = 16L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        if (i4 != 0) {
            if (i4 != 1) {
                return false;
            }
            return i((MutableLiveData) obj, i5);
        }
        return j((MutableLiveData) obj, i5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (36 == i4) {
            h((SourceHopeViewModel) obj);
        } else if (7 != i4) {
            return false;
        } else {
            g((SourceHopeClickProxy) obj);
        }
        return true;
    }

    private ActivityQuarkSourceHopeListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (ImageView) objArr[1], (TabLayout) objArr[5], (TextView) objArr[2], (TextView) objArr[3], (ViewPager) objArr[6]);
        this.f16919n = -1L;
        this.f16905b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f16914i = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[4];
        this.f16915j = textView;
        textView.setTag(null);
        this.f16907d.setTag(null);
        this.f16908e.setTag(null);
        setRootTag(view);
        this.f16916k = new a(this, 3);
        this.f16917l = new a(this, 1);
        this.f16918m = new a(this, 2);
        invalidateAll();
    }
}
