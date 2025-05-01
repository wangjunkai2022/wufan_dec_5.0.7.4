package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.bindingadapter.SimpleDrawableViewKt;
import com.join.kotlin.quark.model.bean.SourceListItemBean;
import com.join.mgps.customview.FlowLayout;
/* loaded from: classes3.dex */
public class ItemSourceShareBindingImpl extends ItemSourceShareBinding {
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f22831h = null;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private static final SparseIntArray f22832i;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    private final CardView f22833f;

    /* renamed from: g  reason: collision with root package name */
    private long f22834g;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22832i = sparseIntArray;
        sparseIntArray.put(R.id.fl_label, 3);
    }

    public ItemSourceShareBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, f22831h, f22832i));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        String str;
        String str2;
        synchronized (this) {
            j4 = this.f22834g;
            this.f22834g = 0L;
        }
        SourceListItemBean sourceListItemBean = this.f22830e;
        long j5 = j4 & 3;
        if (j5 == 0 || sourceListItemBean == null) {
            str = null;
            str2 = null;
        } else {
            str2 = sourceListItemBean.getIcon();
            str = sourceListItemBean.getTitle();
        }
        if (j5 != 0) {
            SimpleDrawableViewKt.loadUrl(this.f22828c, str2, null, 0);
            TextViewBindingAdapter.setText(this.f22829d, str);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemSourceShareBinding
    public void f(@Nullable SourceListItemBean sourceListItemBean) {
        this.f22830e = sourceListItemBean;
        synchronized (this) {
            this.f22834g |= 1;
        }
        notifyPropertyChanged(18);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f22834g != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f22834g = 2L;
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
            f((SourceListItemBean) obj);
            return true;
        }
        return false;
    }

    private ItemSourceShareBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FlowLayout) objArr[3], (SimpleDraweeView) objArr[1], (TextView) objArr[2]);
        this.f22834g = -1L;
        CardView cardView = (CardView) objArr[0];
        this.f22833f = cardView;
        cardView.setTag(null);
        this.f22828c.setTag(null);
        this.f22829d.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
