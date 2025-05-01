package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.domain.adapter.BaseDataBindingAdapter;
import com.join.kotlin.ui.userrecom.RecomViewModle;
import com.psk.kotlin.util.CommonListMainData;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public class ActivityUserrecomActivityBindingImpl extends ActivityUserrecomActivityBinding {
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f17223l = null;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private static final SparseIntArray f17224m;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    private final LinearLayout f17225h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    private final ImageView f17226i;

    /* renamed from: j  reason: collision with root package name */
    private a f17227j;

    /* renamed from: k  reason: collision with root package name */
    private long f17228k;

    /* loaded from: classes3.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        private View.OnClickListener f17229b;

        public a a(View.OnClickListener onClickListener) {
            this.f17229b = onClickListener;
            if (onClickListener == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f17229b.onClick(view);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f17224m = sparseIntArray;
        sparseIntArray.put(R.id.toplayout, 4);
    }

    public ActivityUserrecomActivityBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f17223l, f17224m));
    }

    private boolean k(MutableLiveData<ArrayList<CommonListMainData>> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f17228k |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean l(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f17228k |= 2;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
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
            long r2 = r1.f17228k     // Catch: java.lang.Throwable -> L9b
            r4 = 0
            r1.f17228k = r4     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r19)     // Catch: java.lang.Throwable -> L9b
            com.join.kotlin.ui.userrecom.RecomViewModle r0 = r1.f17220e
            com.join.kotlin.domain.adapter.BaseDataBindingAdapter r6 = r1.f17221f
            android.view.View$OnClickListener r7 = r1.f17222g
            r8 = 39
            long r8 = r8 & r2
            r10 = 38
            r12 = 37
            r14 = 0
            int r15 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r15 == 0) goto L55
            long r8 = r2 & r12
            int r15 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r15 == 0) goto L37
            if (r0 == 0) goto L29
            androidx.lifecycle.MutableLiveData r8 = r0.getShowDataList()
            goto L2a
        L29:
            r8 = r14
        L2a:
            r9 = 0
            r1.updateLiveDataRegistration(r9, r8)
            if (r8 == 0) goto L37
            java.lang.Object r8 = r8.getValue()
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            goto L38
        L37:
            r8 = r14
        L38:
            long r15 = r2 & r10
            int r9 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r9 == 0) goto L53
            if (r0 == 0) goto L45
            androidx.lifecycle.MutableLiveData r0 = r0.getTitleMessage()
            goto L46
        L45:
            r0 = r14
        L46:
            r9 = 1
            r1.updateLiveDataRegistration(r9, r0)
            if (r0 == 0) goto L53
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            goto L57
        L53:
            r0 = r14
            goto L57
        L55:
            r0 = r14
            r8 = r0
        L57:
            r15 = 40
            long r15 = r15 & r2
            r17 = 48
            long r17 = r2 & r17
            int r9 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r9 == 0) goto L73
            if (r7 == 0) goto L73
            com.join.android.app.mgsim.wufun.databinding.ActivityUserrecomActivityBindingImpl$a r9 = r1.f17227j
            if (r9 != 0) goto L6f
            com.join.android.app.mgsim.wufun.databinding.ActivityUserrecomActivityBindingImpl$a r9 = new com.join.android.app.mgsim.wufun.databinding.ActivityUserrecomActivityBindingImpl$a
            r9.<init>()
            r1.f17227j = r9
        L6f:
            com.join.android.app.mgsim.wufun.databinding.ActivityUserrecomActivityBindingImpl$a r14 = r9.a(r7)
        L73:
            int r7 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r7 == 0) goto L7c
            android.widget.ImageView r7 = r1.f17226i
            r7.setOnClickListener(r14)
        L7c:
            int r7 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r7 == 0) goto L85
            androidx.recyclerview.widget.RecyclerView r7 = r1.f17217b
            r7.setAdapter(r6)
        L85:
            long r6 = r2 & r12
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 == 0) goto L90
            androidx.recyclerview.widget.RecyclerView r6 = r1.f17217b
            com.join.kotlin.bindingadapter.ViewbindingRecycleviewAdapterKt.recycleviewdataBinding(r6, r8)
        L90:
            long r2 = r2 & r10
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L9a
            android.widget.TextView r2 = r1.f17218c
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r2, r0)
        L9a:
            return
        L9b:
            r0 = move-exception
            monitor-exit(r19)     // Catch: java.lang.Throwable -> L9b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.ActivityUserrecomActivityBindingImpl.executeBindings():void");
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityUserrecomActivityBinding
    public void h(@Nullable BaseDataBindingAdapter baseDataBindingAdapter) {
        this.f17221f = baseDataBindingAdapter;
        synchronized (this) {
            this.f17228k |= 8;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f17228k != 0;
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityUserrecomActivityBinding
    public void i(@Nullable View.OnClickListener onClickListener) {
        this.f17222g = onClickListener;
        synchronized (this) {
            this.f17228k |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f17228k = 32L;
        }
        requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityUserrecomActivityBinding
    public void j(@Nullable RecomViewModle recomViewModle) {
        this.f17220e = recomViewModle;
        synchronized (this) {
            this.f17228k |= 4;
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
            return l((MutableLiveData) obj, i5);
        }
        return k((MutableLiveData) obj, i5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (36 == i4) {
            j((RecomViewModle) obj);
            return true;
        } else if (1 == i4) {
            h((BaseDataBindingAdapter) obj);
            return true;
        } else if (7 == i4) {
            i((View.OnClickListener) obj);
            return true;
        } else {
            return false;
        }
    }

    private ActivityUserrecomActivityBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (RecyclerView) objArr[3], (TextView) objArr[1], (RelativeLayout) objArr[4]);
        this.f17228k = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f17225h = linearLayout;
        linearLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[2];
        this.f17226i = imageView;
        imageView.setTag(null);
        this.f17217b.setTag(null);
        this.f17218c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
