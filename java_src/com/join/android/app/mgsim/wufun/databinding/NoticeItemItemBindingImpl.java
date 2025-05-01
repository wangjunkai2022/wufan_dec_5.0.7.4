package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.join.kotlin.ui.notice.ClickProxy;
import com.join.mgps.dto.BTActivityBean;
/* loaded from: classes3.dex */
public class NoticeItemItemBindingImpl extends NoticeItemItemBinding {
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f25535i = null;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private static final SparseIntArray f25536j = null;

    /* renamed from: h  reason: collision with root package name */
    private long f25537h;

    public NoticeItemItemBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, f25535i, f25536j));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        String str;
        String str2;
        synchronized (this) {
            j4 = this.f25537h;
            this.f25537h = 0L;
        }
        BTActivityBean bTActivityBean = this.f25533f;
        long j5 = j4 & 5;
        String str3 = null;
        if (j5 == 0 || bTActivityBean == null) {
            str = null;
            str2 = null;
        } else {
            str3 = bTActivityBean.getSub_head();
            str2 = bTActivityBean.getTitle();
            str = bTActivityBean.getType();
        }
        if (j5 != 0) {
            TextViewBindingAdapter.setText(this.f25530c, str3);
            TextViewBindingAdapter.setText(this.f25531d, str);
            TextViewBindingAdapter.setText(this.f25532e, str2);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.NoticeItemItemBinding
    public void g(@Nullable BTActivityBean bTActivityBean) {
        this.f25533f = bTActivityBean;
        synchronized (this) {
            this.f25537h |= 1;
        }
        notifyPropertyChanged(3);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.NoticeItemItemBinding
    public void h(@Nullable ClickProxy clickProxy) {
        this.f25534g = clickProxy;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f25537h != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f25537h = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (3 == i4) {
            g((BTActivityBean) obj);
        } else if (7 != i4) {
            return false;
        } else {
            h((ClickProxy) obj);
        }
        return true;
    }

    private NoticeItemItemBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[0], (TextView) objArr[3], (TextView) objArr[1], (TextView) objArr[2]);
        this.f25537h = -1L;
        this.f25529b.setTag(null);
        this.f25530c.setTag(null);
        this.f25531d.setTag(null);
        this.f25532e.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
