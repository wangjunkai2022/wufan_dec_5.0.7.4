package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.ui.cloudarchive.DelArchiveDialogViewModle;
import com.join.kotlin.ui.cloudarchive.dialog.DialogData;
/* loaded from: classes3.dex */
public class ModDelArchiveDialogBindingImpl extends ModDelArchiveDialogBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f24924o = null;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    private static final SparseIntArray f24925p;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    private final ConstraintLayout f24926h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    private final TextView f24927i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    private final TextView f24928j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private final View.OnClickListener f24929k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private final View.OnClickListener f24930l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private final View.OnClickListener f24931m;

    /* renamed from: n  reason: collision with root package name */
    private long f24932n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f24925p = sparseIntArray;
        sparseIntArray.put(R.id.main, 6);
    }

    public ModDelArchiveDialogBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f24924o, f24925p));
    }

    private boolean i(MutableLiveData<DialogData> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f24932n |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 == 1) {
            View.OnClickListener onClickListener = this.f24923g;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        } else if (i4 == 2) {
            View.OnClickListener onClickListener2 = this.f24923g;
            if (onClickListener2 != null) {
                onClickListener2.onClick(view);
            }
        } else if (i4 != 3) {
        } else {
            View.OnClickListener onClickListener3 = this.f24923g;
            if (onClickListener3 != null) {
                onClickListener3.onClick(view);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            r13 = this;
            monitor-enter(r13)
            long r0 = r13.f24932n     // Catch: java.lang.Throwable -> L76
            r2 = 0
            r13.f24932n = r2     // Catch: java.lang.Throwable -> L76
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L76
            com.join.kotlin.ui.cloudarchive.DelArchiveDialogViewModle r4 = r13.f24922f
            r5 = 11
            long r5 = r5 & r0
            r7 = 0
            int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r8 == 0) goto L3e
            if (r4 == 0) goto L19
            androidx.lifecycle.MutableLiveData r4 = r4.getDialogData()
            goto L1a
        L19:
            r4 = r7
        L1a:
            r8 = 0
            r13.updateLiveDataRegistration(r8, r4)
            if (r4 == 0) goto L27
            java.lang.Object r4 = r4.getValue()
            com.join.kotlin.ui.cloudarchive.dialog.DialogData r4 = (com.join.kotlin.ui.cloudarchive.dialog.DialogData) r4
            goto L28
        L27:
            r4 = r7
        L28:
            if (r4 == 0) goto L3e
            java.lang.String r7 = r4.getContent()
            java.lang.String r8 = r4.getOkButn()
            java.lang.String r9 = r4.getTitle()
            java.lang.String r4 = r4.getCancleButn()
            r12 = r7
            r7 = r4
            r4 = r12
            goto L41
        L3e:
            r4 = r7
            r8 = r4
            r9 = r8
        L41:
            r10 = 8
            long r0 = r0 & r10
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L5d
            android.widget.TextView r0 = r13.f24918b
            android.view.View$OnClickListener r1 = r13.f24929k
            r0.setOnClickListener(r1)
            android.widget.ImageView r0 = r13.f24919c
            android.view.View$OnClickListener r1 = r13.f24931m
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r13.f24921e
            android.view.View$OnClickListener r1 = r13.f24930l
            r0.setOnClickListener(r1)
        L5d:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L75
            android.widget.TextView r0 = r13.f24918b
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r7)
            android.widget.TextView r0 = r13.f24927i
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r9)
            android.widget.TextView r0 = r13.f24928j
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r4)
            android.widget.TextView r0 = r13.f24921e
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r8)
        L75:
            return
        L76:
            r0 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L76
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.ModDelArchiveDialogBindingImpl.executeBindings():void");
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModDelArchiveDialogBinding
    public void g(@Nullable View.OnClickListener onClickListener) {
        this.f24923g = onClickListener;
        synchronized (this) {
            this.f24932n |= 4;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModDelArchiveDialogBinding
    public void h(@Nullable DelArchiveDialogViewModle delArchiveDialogViewModle) {
        this.f24922f = delArchiveDialogViewModle;
        synchronized (this) {
            this.f24932n |= 2;
        }
        notifyPropertyChanged(34);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f24932n != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f24932n = 8L;
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
        if (34 == i4) {
            h((DelArchiveDialogViewModle) obj);
        } else if (7 != i4) {
            return false;
        } else {
            g((View.OnClickListener) obj);
        }
        return true;
    }

    private ModDelArchiveDialogBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (TextView) objArr[3], (ImageView) objArr[5], (LinearLayout) objArr[6], (TextView) objArr[4]);
        this.f24932n = -1L;
        this.f24918b.setTag(null);
        this.f24919c.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f24926h = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f24927i = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[2];
        this.f24928j = textView2;
        textView2.setTag(null);
        this.f24921e.setTag(null);
        setRootTag(view);
        this.f24929k = new a(this, 1);
        this.f24930l = new a(this, 2);
        this.f24931m = new a(this, 3);
        invalidateAll();
    }
}
