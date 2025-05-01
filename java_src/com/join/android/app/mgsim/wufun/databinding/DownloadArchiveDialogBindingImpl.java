package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.ui.cloudarchive.DownloadArchivDialogeViewModle;
/* loaded from: classes3.dex */
public class DownloadArchiveDialogBindingImpl extends DownloadArchiveDialogBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f19135k = null;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private static final SparseIntArray f19136l = null;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    private final ConstraintLayout f19137d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    private final TextView f19138e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    private final TextView f19139f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    private final ProgressBar f19140g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    private final TextView f19141h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private final View.OnClickListener f19142i;

    /* renamed from: j  reason: collision with root package name */
    private long f19143j;

    public DownloadArchiveDialogBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f19135k, f19136l));
    }

    private boolean i(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f19143j |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean j(MutableLiveData<Integer> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f19143j |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean k(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f19143j |= 4;
            }
            return true;
        }
        return false;
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        View.OnClickListener onClickListener = this.f19134c;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            r18 = this;
            r1 = r18
            monitor-enter(r18)
            long r2 = r1.f19143j     // Catch: java.lang.Throwable -> Laa
            r4 = 0
            r1.f19143j = r4     // Catch: java.lang.Throwable -> Laa
            monitor-exit(r18)     // Catch: java.lang.Throwable -> Laa
            com.join.kotlin.ui.cloudarchive.DownloadArchivDialogeViewModle r0 = r1.f19133b
            r6 = 47
            long r6 = r6 & r2
            r8 = 44
            r10 = 41
            r12 = 42
            r14 = 0
            r15 = 0
            int r16 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r16 == 0) goto L7b
            long r6 = r2 & r10
            int r16 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r16 == 0) goto L3b
            if (r0 == 0) goto L28
            androidx.lifecycle.MutableLiveData r6 = r0.getProgress()
            goto L29
        L28:
            r6 = r15
        L29:
            r1.updateLiveDataRegistration(r14, r6)
            if (r6 == 0) goto L35
            java.lang.Object r6 = r6.getValue()
            java.lang.Integer r6 = (java.lang.Integer) r6
            goto L36
        L35:
            r6 = r15
        L36:
            int r6 = androidx.databinding.ViewDataBinding.safeUnbox(r6)
            r14 = r6
        L3b:
            long r6 = r2 & r8
            int r16 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r16 == 0) goto L5e
            if (r0 == 0) goto L48
            com.join.kotlin.ui.cloudarchive.data.ModDataRequest r6 = r0.getRequest()
            goto L49
        L48:
            r6 = r15
        L49:
            if (r6 == 0) goto L50
            androidx.lifecycle.MutableLiveData r6 = r6.getProgressTextShow()
            goto L51
        L50:
            r6 = r15
        L51:
            r7 = 2
            r1.updateLiveDataRegistration(r7, r6)
            if (r6 == 0) goto L5e
            java.lang.Object r6 = r6.getValue()
            java.lang.String r6 = (java.lang.String) r6
            goto L5f
        L5e:
            r6 = r15
        L5f:
            long r16 = r2 & r12
            int r7 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r7 == 0) goto L7c
            if (r0 == 0) goto L6c
            androidx.lifecycle.MutableLiveData r0 = r0.getDialogTitle()
            goto L6d
        L6c:
            r0 = r15
        L6d:
            r7 = 1
            r1.updateLiveDataRegistration(r7, r0)
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r0.getValue()
            r15 = r0
            java.lang.String r15 = (java.lang.String) r15
            goto L7c
        L7b:
            r6 = r15
        L7c:
            long r12 = r12 & r2
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L86
            android.widget.TextView r0 = r1.f19138e
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r15)
        L86:
            long r8 = r8 & r2
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 == 0) goto L90
            android.widget.TextView r0 = r1.f19139f
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r6)
        L90:
            long r6 = r2 & r10
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L9b
            android.widget.ProgressBar r0 = r1.f19140g
            r0.setProgress(r14)
        L9b:
            r6 = 32
            long r2 = r2 & r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto La9
            android.widget.TextView r0 = r1.f19141h
            android.view.View$OnClickListener r2 = r1.f19142i
            r0.setOnClickListener(r2)
        La9:
            return
        Laa:
            r0 = move-exception
            monitor-exit(r18)     // Catch: java.lang.Throwable -> Laa
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.DownloadArchiveDialogBindingImpl.executeBindings():void");
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.DownloadArchiveDialogBinding
    public void g(@Nullable View.OnClickListener onClickListener) {
        this.f19134c = onClickListener;
        synchronized (this) {
            this.f19143j |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.DownloadArchiveDialogBinding
    public void h(@Nullable DownloadArchivDialogeViewModle downloadArchivDialogeViewModle) {
        this.f19133b = downloadArchivDialogeViewModle;
        synchronized (this) {
            this.f19143j |= 8;
        }
        notifyPropertyChanged(34);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f19143j != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f19143j = 32L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    return false;
                }
                return k((MutableLiveData) obj, i5);
            }
            return i((MutableLiveData) obj, i5);
        }
        return j((MutableLiveData) obj, i5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (34 == i4) {
            h((DownloadArchivDialogeViewModle) obj);
        } else if (7 != i4) {
            return false;
        } else {
            g((View.OnClickListener) obj);
        }
        return true;
    }

    private DownloadArchiveDialogBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3);
        this.f19143j = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f19137d = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f19138e = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[2];
        this.f19139f = textView2;
        textView2.setTag(null);
        ProgressBar progressBar = (ProgressBar) objArr[3];
        this.f19140g = progressBar;
        progressBar.setTag(null);
        TextView textView3 = (TextView) objArr[4];
        this.f19141h = textView3;
        textView3.setTag(null);
        setRootTag(view);
        this.f19142i = new a(this, 1);
        invalidateAll();
    }
}
