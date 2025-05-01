package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.discount.proxy.GameDetailInfoBottomDialogClickProxy;
import com.join.kotlin.discount.viewmodel.GameDetailInfoBottomDialogViewModel;
/* loaded from: classes3.dex */
public class ActivityDiscountGameDetailInfoBottomDialogBindingImpl extends ActivityDiscountGameDetailInfoBottomDialogBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f15964k = null;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private static final SparseIntArray f15965l;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    private final TextView f15966h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private final View.OnClickListener f15967i;

    /* renamed from: j  reason: collision with root package name */
    private long f15968j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f15965l = sparseIntArray;
        sparseIntArray.put(R.id.cl_container, 3);
        sparseIntArray.put(R.id.recyclerview, 4);
    }

    public ActivityDiscountGameDetailInfoBottomDialogBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f15964k, f15965l));
    }

    private boolean i(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f15968j |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean j(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f15968j |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        GameDetailInfoBottomDialogClickProxy gameDetailInfoBottomDialogClickProxy = this.f15963g;
        if (gameDetailInfoBottomDialogClickProxy != null) {
            gameDetailInfoBottomDialogClickProxy.onConfirmClick();
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
            long r0 = r14.f15968j     // Catch: java.lang.Throwable -> L72
            r2 = 0
            r14.f15968j = r2     // Catch: java.lang.Throwable -> L72
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L72
            com.join.kotlin.discount.viewmodel.GameDetailInfoBottomDialogViewModel r4 = r14.f15962f
            r5 = 23
            long r5 = r5 & r0
            r7 = 22
            r9 = 21
            r11 = 0
            int r12 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r12 == 0) goto L4e
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
            if (r6 == 0) goto L4f
            if (r4 == 0) goto L3f
            androidx.lifecycle.MutableLiveData r4 = r4.getBtnText()
            goto L40
        L3f:
            r4 = r11
        L40:
            r6 = 1
            r14.updateLiveDataRegistration(r6, r4)
            if (r4 == 0) goto L4f
            java.lang.Object r4 = r4.getValue()
            r11 = r4
            java.lang.String r11 = (java.lang.String) r11
            goto L4f
        L4e:
            r5 = r11
        L4f:
            r12 = 16
            long r12 = r12 & r0
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 == 0) goto L5d
            android.widget.TextView r4 = r14.f15966h
            android.view.View$OnClickListener r6 = r14.f15967i
            r4.setOnClickListener(r6)
        L5d:
            long r7 = r7 & r0
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 == 0) goto L67
            android.widget.TextView r4 = r14.f15966h
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r11)
        L67:
            long r0 = r0 & r9
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L71
            android.widget.TextView r0 = r14.f15961e
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r5)
        L71:
            return
        L72:
            r0 = move-exception
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L72
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.ActivityDiscountGameDetailInfoBottomDialogBindingImpl.executeBindings():void");
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityDiscountGameDetailInfoBottomDialogBinding
    public void g(@Nullable GameDetailInfoBottomDialogClickProxy gameDetailInfoBottomDialogClickProxy) {
        this.f15963g = gameDetailInfoBottomDialogClickProxy;
        synchronized (this) {
            this.f15968j |= 8;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityDiscountGameDetailInfoBottomDialogBinding
    public void h(@Nullable GameDetailInfoBottomDialogViewModel gameDetailInfoBottomDialogViewModel) {
        this.f15962f = gameDetailInfoBottomDialogViewModel;
        synchronized (this) {
            this.f15968j |= 4;
        }
        notifyPropertyChanged(36);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f15968j != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f15968j = 16L;
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
            h((GameDetailInfoBottomDialogViewModel) obj);
        } else if (7 != i4) {
            return false;
        } else {
            g((GameDetailInfoBottomDialogClickProxy) obj);
        }
        return true;
    }

    private ActivityDiscountGameDetailInfoBottomDialogBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (ConstraintLayout) objArr[3], (ConstraintLayout) objArr[0], (RecyclerView) objArr[4], (TextView) objArr[1]);
        this.f15968j = -1L;
        this.f15959c.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f15966h = textView;
        textView.setTag(null);
        this.f15961e.setTag(null);
        setRootTag(view);
        this.f15967i = new a(this, 1);
        invalidateAll();
    }
}
