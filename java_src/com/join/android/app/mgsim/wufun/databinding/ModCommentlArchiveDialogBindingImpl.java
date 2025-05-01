package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
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
public class ModCommentlArchiveDialogBindingImpl extends ModCommentlArchiveDialogBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: t  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f24910t = null;
    @Nullable

    /* renamed from: u  reason: collision with root package name */
    private static final SparseIntArray f24911u;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    private final ConstraintLayout f24912n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private final View.OnClickListener f24913o;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    private final View.OnClickListener f24914p;
    @Nullable

    /* renamed from: q  reason: collision with root package name */
    private final View.OnClickListener f24915q;
    @Nullable

    /* renamed from: r  reason: collision with root package name */
    private final View.OnClickListener f24916r;

    /* renamed from: s  reason: collision with root package name */
    private long f24917s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f24911u = sparseIntArray;
        sparseIntArray.put(R.id.main, 6);
        sparseIntArray.put(R.id.imageView631, 7);
        sparseIntArray.put(R.id.imageView632, 8);
        sparseIntArray.put(R.id.imageView633, 9);
        sparseIntArray.put(R.id.textView109, 10);
    }

    public ModCommentlArchiveDialogBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, f24910t, f24911u));
    }

    private boolean i(MutableLiveData<DialogData> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f24917s |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean j(MutableLiveData<Boolean> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f24917s |= 2;
            }
            return true;
        }
        return false;
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 == 1) {
            View.OnClickListener onClickListener = this.f24909m;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        } else if (i4 == 2) {
            View.OnClickListener onClickListener2 = this.f24909m;
            if (onClickListener2 != null) {
                onClickListener2.onClick(view);
            }
        } else if (i4 == 3) {
            View.OnClickListener onClickListener3 = this.f24909m;
            if (onClickListener3 != null) {
                onClickListener3.onClick(view);
            }
        } else if (i4 != 4) {
        } else {
            View.OnClickListener onClickListener4 = this.f24909m;
            if (onClickListener4 != null) {
                onClickListener4.onClick(view);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            r15 = this;
            monitor-enter(r15)
            long r0 = r15.f24917s     // Catch: java.lang.Throwable -> L97
            r2 = 0
            r15.f24917s = r2     // Catch: java.lang.Throwable -> L97
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L97
            com.join.kotlin.ui.cloudarchive.DelArchiveDialogViewModle r4 = r15.f24908l
            r5 = 23
            long r5 = r5 & r0
            r7 = 22
            r9 = 21
            r11 = 0
            r12 = 0
            int r13 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r13 == 0) goto L63
            long r5 = r0 & r9
            int r13 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r13 == 0) goto L39
            if (r4 == 0) goto L24
            androidx.lifecycle.MutableLiveData r5 = r4.getDialogData()
            goto L25
        L24:
            r5 = r12
        L25:
            r15.updateLiveDataRegistration(r11, r5)
            if (r5 == 0) goto L31
            java.lang.Object r5 = r5.getValue()
            com.join.kotlin.ui.cloudarchive.dialog.DialogData r5 = (com.join.kotlin.ui.cloudarchive.dialog.DialogData) r5
            goto L32
        L31:
            r5 = r12
        L32:
            if (r5 == 0) goto L39
            java.lang.String r5 = r5.getTitle()
            goto L3a
        L39:
            r5 = r12
        L3a:
            long r13 = r0 & r7
            int r6 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r6 == 0) goto L62
            if (r4 == 0) goto L47
            androidx.lifecycle.MutableLiveData r4 = r4.isCommitLoding()
            goto L48
        L47:
            r4 = r12
        L48:
            r6 = 1
            r15.updateLiveDataRegistration(r6, r4)
            if (r4 == 0) goto L55
            java.lang.Object r4 = r4.getValue()
            r12 = r4
            java.lang.Boolean r12 = (java.lang.Boolean) r12
        L55:
            boolean r4 = androidx.databinding.ViewDataBinding.safeUnbox(r12)
            r4 = r4 ^ r6
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r11 = androidx.databinding.ViewDataBinding.safeUnbox(r4)
        L62:
            r12 = r5
        L63:
            r4 = 16
            long r4 = r4 & r0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L71
            android.widget.ImageView r4 = r15.f24898b
            android.view.View$OnClickListener r5 = r15.f24916r
            r4.setOnClickListener(r5)
        L71:
            long r4 = r0 & r7
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L8c
            androidx.constraintlayout.widget.ConstraintLayout r4 = r15.f24903g
            android.view.View$OnClickListener r5 = r15.f24913o
            androidx.databinding.adapters.ViewBindingAdapter.setOnClick(r4, r5, r11)
            androidx.constraintlayout.widget.ConstraintLayout r4 = r15.f24904h
            android.view.View$OnClickListener r5 = r15.f24914p
            androidx.databinding.adapters.ViewBindingAdapter.setOnClick(r4, r5, r11)
            androidx.constraintlayout.widget.ConstraintLayout r4 = r15.f24907k
            android.view.View$OnClickListener r5 = r15.f24915q
            androidx.databinding.adapters.ViewBindingAdapter.setOnClick(r4, r5, r11)
        L8c:
            long r0 = r0 & r9
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L96
            android.widget.TextView r0 = r15.f24905i
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r12)
        L96:
            return
        L97:
            r0 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L97
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.ModCommentlArchiveDialogBindingImpl.executeBindings():void");
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModCommentlArchiveDialogBinding
    public void g(@Nullable View.OnClickListener onClickListener) {
        this.f24909m = onClickListener;
        synchronized (this) {
            this.f24917s |= 8;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModCommentlArchiveDialogBinding
    public void h(@Nullable DelArchiveDialogViewModle delArchiveDialogViewModle) {
        this.f24908l = delArchiveDialogViewModle;
        synchronized (this) {
            this.f24917s |= 4;
        }
        notifyPropertyChanged(34);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f24917s != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f24917s = 16L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        if (i4 != 0) {
            if (i4 != 1) {
                return false;
            }
            return j((MutableLiveData) obj, i5);
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

    private ModCommentlArchiveDialogBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (ImageView) objArr[2], (ImageView) objArr[7], (ImageView) objArr[8], (ImageView) objArr[9], (ConstraintLayout) objArr[6], (ConstraintLayout) objArr[5], (ConstraintLayout) objArr[3], (TextView) objArr[1], (TextView) objArr[10], (ConstraintLayout) objArr[4]);
        this.f24917s = -1L;
        this.f24898b.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f24912n = constraintLayout;
        constraintLayout.setTag(null);
        this.f24903g.setTag(null);
        this.f24904h.setTag(null);
        this.f24905i.setTag(null);
        this.f24907k.setTag(null);
        setRootTag(view);
        this.f24913o = new a(this, 4);
        this.f24914p = new a(this, 2);
        this.f24915q = new a(this, 3);
        this.f24916r = new a(this, 1);
        invalidateAll();
    }
}
