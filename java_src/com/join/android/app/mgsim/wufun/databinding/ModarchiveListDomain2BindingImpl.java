package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.ui.cloudarchive.adapter.OnClickArchiveListener;
import com.join.mgps.dto.DomainInfoBean;
/* loaded from: classes3.dex */
public class ModarchiveListDomain2BindingImpl extends ModarchiveListDomain2Binding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f25027j = null;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private static final SparseIntArray f25028k = null;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private final View.OnClickListener f25029g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private final View.OnClickListener f25030h;

    /* renamed from: i  reason: collision with root package name */
    private long f25031i;

    public ModarchiveListDomain2BindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f25027j, f25028k));
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 == 1) {
            DomainInfoBean domainInfoBean = this.f25025e;
            OnClickArchiveListener onClickArchiveListener = this.f25026f;
            if (onClickArchiveListener != null) {
                onClickArchiveListener.onClickDomain(domainInfoBean);
            }
        } else if (i4 != 2) {
        } else {
            DomainInfoBean domainInfoBean2 = this.f25025e;
            OnClickArchiveListener onClickArchiveListener2 = this.f25026f;
            if (onClickArchiveListener2 != null) {
                onClickArchiveListener2.onClickDomain(domainInfoBean2);
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        synchronized (this) {
            j4 = this.f25031i;
            this.f25031i = 0L;
        }
        if ((j4 & 4) != 0) {
            this.f25022b.setOnClickListener(this.f25030h);
            this.f25024d.setOnClickListener(this.f25029g);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModarchiveListDomain2Binding
    public void g(@Nullable OnClickArchiveListener onClickArchiveListener) {
        this.f25026f = onClickArchiveListener;
        synchronized (this) {
            this.f25031i |= 2;
        }
        notifyPropertyChanged(8);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModarchiveListDomain2Binding
    public void h(@Nullable DomainInfoBean domainInfoBean) {
        this.f25025e = domainInfoBean;
        synchronized (this) {
            this.f25031i |= 1;
        }
        notifyPropertyChanged(18);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f25031i != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f25031i = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (18 == i4) {
            h((DomainInfoBean) obj);
        } else if (8 != i4) {
            return false;
        } else {
            g((OnClickArchiveListener) obj);
        }
        return true;
    }

    private ModarchiveListDomain2BindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (SimpleDraweeView) objArr[1], (CardView) objArr[0], (TextView) objArr[2]);
        this.f25031i = -1L;
        this.f25022b.setTag(null);
        this.f25023c.setTag(null);
        this.f25024d.setTag(null);
        setRootTag(view);
        this.f25029g = new a(this, 2);
        this.f25030h = new a(this, 1);
        invalidateAll();
    }
}
