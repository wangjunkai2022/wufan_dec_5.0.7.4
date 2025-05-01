package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.quark.model.bean.SourceListItemBean;
import com.join.kotlin.quark.proxy.SourceSaveClickProxy;
import com.join.kotlin.quark.viewmodel.SourceSaveViewModel;
/* loaded from: classes3.dex */
public class ActivitySourceSaveBindingImpl extends ActivitySourceSaveBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f17029o = null;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    private static final SparseIntArray f17030p;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    private final LinearLayout f17031k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    private final TextView f17032l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private final View.OnClickListener f17033m;

    /* renamed from: n  reason: collision with root package name */
    private long f17034n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f17030p = sparseIntArray;
        sparseIntArray.put(R.id.cl_content, 7);
        sparseIntArray.put(R.id.tv_label1, 8);
    }

    public ActivitySourceSaveBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, f17029o, f17030p));
    }

    private boolean i(MutableLiveData<SourceListItemBean> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f17034n |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        SourceSaveClickProxy sourceSaveClickProxy = this.f17028j;
        if (sourceSaveClickProxy != null) {
            sourceSaveClickProxy.onSaveClick();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            r14 = this;
            monitor-enter(r14)
            long r0 = r14.f17034n     // Catch: java.lang.Throwable -> L70
            r2 = 0
            r14.f17034n = r2     // Catch: java.lang.Throwable -> L70
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L70
            com.join.kotlin.quark.viewmodel.SourceSaveViewModel r4 = r14.f17027i
            r5 = 11
            long r5 = r5 & r0
            r7 = 0
            r8 = 0
            int r9 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r9 == 0) goto L3f
            if (r4 == 0) goto L1a
            androidx.lifecycle.MutableLiveData r4 = r4.getItemBean()
            goto L1b
        L1a:
            r4 = r8
        L1b:
            r14.updateLiveDataRegistration(r7, r4)
            if (r4 == 0) goto L27
            java.lang.Object r4 = r4.getValue()
            com.join.kotlin.quark.model.bean.SourceListItemBean r4 = (com.join.kotlin.quark.model.bean.SourceListItemBean) r4
            goto L28
        L27:
            r4 = r8
        L28:
            if (r4 == 0) goto L3f
            java.lang.String r9 = r4.getNickname()
            java.lang.String r10 = r4.getIcon()
            java.lang.String r11 = r4.getIntro()
            java.lang.String r12 = r4.getAvatar()
            java.lang.String r4 = r4.getTitle()
            goto L44
        L3f:
            r4 = r8
            r9 = r4
            r10 = r9
            r11 = r10
            r12 = r11
        L44:
            int r13 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r13 == 0) goto L61
            android.widget.TextView r5 = r14.f17032l
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r5, r11)
            com.facebook.drawee.view.SimpleDraweeView r5 = r14.f17021c
            com.join.kotlin.bindingadapter.SimpleDrawableViewKt.loadUrl(r5, r12, r8, r7)
            com.facebook.drawee.view.SimpleDraweeView r5 = r14.f17022d
            com.join.kotlin.bindingadapter.SimpleDrawableViewKt.loadUrl(r5, r10, r8, r7)
            android.widget.TextView r5 = r14.f17023e
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r5, r9)
            android.widget.TextView r5 = r14.f17026h
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r5, r4)
        L61:
            r4 = 8
            long r0 = r0 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L6f
            android.widget.TextView r0 = r14.f17025g
            android.view.View$OnClickListener r1 = r14.f17033m
            r0.setOnClickListener(r1)
        L6f:
            return
        L70:
            r0 = move-exception
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L70
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.ActivitySourceSaveBindingImpl.executeBindings():void");
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivitySourceSaveBinding
    public void g(@Nullable SourceSaveClickProxy sourceSaveClickProxy) {
        this.f17028j = sourceSaveClickProxy;
        synchronized (this) {
            this.f17034n |= 4;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivitySourceSaveBinding
    public void h(@Nullable SourceSaveViewModel sourceSaveViewModel) {
        this.f17027i = sourceSaveViewModel;
        synchronized (this) {
            this.f17034n |= 2;
        }
        notifyPropertyChanged(36);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f17034n != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f17034n = 8L;
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
        if (36 == i4) {
            h((SourceSaveViewModel) obj);
        } else if (7 != i4) {
            return false;
        } else {
            g((SourceSaveClickProxy) obj);
        }
        return true;
    }

    private ActivitySourceSaveBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (ConstraintLayout) objArr[7], (SimpleDraweeView) objArr[5], (SimpleDraweeView) objArr[1], (TextView) objArr[6], (TextView) objArr[8], (TextView) objArr[4], (TextView) objArr[2]);
        this.f17034n = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f17031k = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.f17032l = textView;
        textView.setTag(null);
        this.f17021c.setTag(null);
        this.f17022d.setTag(null);
        this.f17023e.setTag(null);
        this.f17025g.setTag(null);
        this.f17026h.setTag(null);
        setRootTag(view);
        this.f17033m = new a(this, 1);
        invalidateAll();
    }
}
