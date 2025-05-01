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
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.ui.cloudarchive.data.ArchiveData;
import com.join.kotlin.ui.cloudarchive.dialog.ChoiceArchiveDialogViewModle;
import com.join.kotlin.ui.cloudarchive.dialog.DialogData;
import java.util.List;
/* loaded from: classes3.dex */
public class ModChoiceArchiveDialogBindingImpl extends ModChoiceArchiveDialogBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f24885l = null;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private static final SparseIntArray f24886m;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    private final ConstraintLayout f24887h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    private final TextView f24888i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private final View.OnClickListener f24889j;

    /* renamed from: k  reason: collision with root package name */
    private long f24890k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f24886m = sparseIntArray;
        sparseIntArray.put(R.id.main, 4);
    }

    public ModChoiceArchiveDialogBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f24885l, f24886m));
    }

    private boolean k(MutableLiveData<List<ArchiveData>> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f24890k |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean l(MutableLiveData<DialogData> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f24890k |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        View.OnClickListener onClickListener = this.f24883f;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
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
            long r2 = r1.f24890k     // Catch: java.lang.Throwable -> L8c
            r4 = 0
            r1.f24890k = r4     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L8c
            com.join.kotlin.ui.cloudarchive.dialog.ChoiceArchiveDialogViewModle r0 = r1.f24882e
            androidx.recyclerview.widget.RecyclerView$Adapter<androidx.recyclerview.widget.RecyclerView$ViewHolder> r6 = r1.f24884g
            r7 = 39
            long r7 = r7 & r2
            r9 = 38
            r11 = 37
            r13 = 0
            int r14 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r14 == 0) goto L5c
            long r7 = r2 & r11
            int r14 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r14 == 0) goto L3d
            if (r0 == 0) goto L27
            androidx.lifecycle.MutableLiveData r7 = r0.getDialogData()
            goto L28
        L27:
            r7 = r13
        L28:
            r8 = 0
            r1.updateLiveDataRegistration(r8, r7)
            if (r7 == 0) goto L35
            java.lang.Object r7 = r7.getValue()
            com.join.kotlin.ui.cloudarchive.dialog.DialogData r7 = (com.join.kotlin.ui.cloudarchive.dialog.DialogData) r7
            goto L36
        L35:
            r7 = r13
        L36:
            if (r7 == 0) goto L3d
            java.lang.String r7 = r7.getTitle()
            goto L3e
        L3d:
            r7 = r13
        L3e:
            long r14 = r2 & r9
            int r8 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r8 == 0) goto L59
            if (r0 == 0) goto L4b
            androidx.lifecycle.MutableLiveData r0 = r0.getArchiveList()
            goto L4c
        L4b:
            r0 = r13
        L4c:
            r8 = 1
            r1.updateLiveDataRegistration(r8, r0)
            if (r0 == 0) goto L59
            java.lang.Object r0 = r0.getValue()
            r13 = r0
            java.util.List r13 = (java.util.List) r13
        L59:
            r0 = r13
            r13 = r7
            goto L5d
        L5c:
            r0 = r13
        L5d:
            r7 = 40
            long r7 = r7 & r2
            r14 = 32
            long r14 = r14 & r2
            int r16 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r16 == 0) goto L6e
            android.widget.ImageView r14 = r1.f24879b
            android.view.View$OnClickListener r15 = r1.f24889j
            r14.setOnClickListener(r15)
        L6e:
            long r11 = r11 & r2
            int r14 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r14 == 0) goto L78
            android.widget.TextView r11 = r1.f24888i
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r11, r13)
        L78:
            int r11 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r11 == 0) goto L81
            androidx.recyclerview.widget.RecyclerView r7 = r1.f24881d
            r7.setAdapter(r6)
        L81:
            long r2 = r2 & r9
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L8b
            androidx.recyclerview.widget.RecyclerView r2 = r1.f24881d
            com.join.kotlin.bindingadapter.ViewbindingRecycleviewAdapterKt.recycleviewdataBinding(r2, r0)
        L8b:
            return
        L8c:
            r0 = move-exception
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L8c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.ModChoiceArchiveDialogBindingImpl.executeBindings():void");
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModChoiceArchiveDialogBinding
    public void h(@Nullable RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
        this.f24884g = adapter;
        synchronized (this) {
            this.f24890k |= 8;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f24890k != 0;
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModChoiceArchiveDialogBinding
    public void i(@Nullable View.OnClickListener onClickListener) {
        this.f24883f = onClickListener;
        synchronized (this) {
            this.f24890k |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f24890k = 32L;
        }
        requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModChoiceArchiveDialogBinding
    public void j(@Nullable ChoiceArchiveDialogViewModle choiceArchiveDialogViewModle) {
        this.f24882e = choiceArchiveDialogViewModle;
        synchronized (this) {
            this.f24890k |= 4;
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
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (34 == i4) {
            j((ChoiceArchiveDialogViewModle) obj);
            return true;
        } else if (1 == i4) {
            h((RecyclerView.Adapter) obj);
            return true;
        } else if (7 == i4) {
            i((View.OnClickListener) obj);
            return true;
        } else {
            return false;
        }
    }

    private ModChoiceArchiveDialogBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (ImageView) objArr[3], (LinearLayout) objArr[4], (RecyclerView) objArr[2]);
        this.f24890k = -1L;
        this.f24879b.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f24887h = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f24888i = textView;
        textView.setTag(null);
        this.f24881d.setTag(null);
        setRootTag(view);
        this.f24889j = new a(this, 1);
        invalidateAll();
    }
}
