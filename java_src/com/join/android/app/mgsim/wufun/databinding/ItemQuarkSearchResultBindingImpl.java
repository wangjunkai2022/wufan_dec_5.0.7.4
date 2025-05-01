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
public class ItemQuarkSearchResultBindingImpl extends ItemQuarkSearchResultBinding {
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f22563i = null;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private static final SparseIntArray f22564j;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    private final CardView f22565f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    private final TextView f22566g;

    /* renamed from: h  reason: collision with root package name */
    private long f22567h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22564j = sparseIntArray;
        sparseIntArray.put(R.id.fl_label, 4);
    }

    public ItemQuarkSearchResultBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f22563i, f22564j));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        String str;
        String str2;
        String str3;
        String str4;
        synchronized (this) {
            j4 = this.f22567h;
            this.f22567h = 0L;
        }
        SourceListItemBean sourceListItemBean = this.f22562e;
        long j5 = j4 & 3;
        if (j5 != 0) {
            if (sourceListItemBean != null) {
                str4 = sourceListItemBean.getRelease_time();
                str3 = sourceListItemBean.getIcon();
                str = sourceListItemBean.getTitle();
            } else {
                str = null;
                str4 = null;
                str3 = null;
            }
            str2 = "时间：" + str4;
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        if (j5 != 0) {
            TextViewBindingAdapter.setText(this.f22566g, str2);
            SimpleDrawableViewKt.loadUrl(this.f22560c, str3, null, 0);
            TextViewBindingAdapter.setText(this.f22561d, str);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemQuarkSearchResultBinding
    public void f(@Nullable SourceListItemBean sourceListItemBean) {
        this.f22562e = sourceListItemBean;
        synchronized (this) {
            this.f22567h |= 1;
        }
        notifyPropertyChanged(18);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f22567h != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f22567h = 2L;
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

    private ItemQuarkSearchResultBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FlowLayout) objArr[4], (SimpleDraweeView) objArr[1], (TextView) objArr[2]);
        this.f22567h = -1L;
        CardView cardView = (CardView) objArr[0];
        this.f22565f = cardView;
        cardView.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.f22566g = textView;
        textView.setTag(null);
        this.f22560c.setTag(null);
        this.f22561d.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
