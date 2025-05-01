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
import com.join.kotlin.discount.model.bean.GameDetailDialogInfoBean;
/* loaded from: classes3.dex */
public class ItemDiscountGameDetailDialogInfoListBindingImpl extends ItemDiscountGameDetailDialogInfoListBinding {
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f21943g = null;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private static final SparseIntArray f21944h = null;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    private final ConstraintLayout f21945d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    private final TextView f21946e;

    /* renamed from: f  reason: collision with root package name */
    private long f21947f;

    public ItemDiscountGameDetailDialogInfoListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f21943g, f21944h));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        String str;
        synchronized (this) {
            j4 = this.f21947f;
            this.f21947f = 0L;
        }
        GameDetailDialogInfoBean gameDetailDialogInfoBean = this.f21942c;
        long j5 = j4 & 3;
        String str2 = null;
        if (j5 == 0 || gameDetailDialogInfoBean == null) {
            str = null;
        } else {
            String title = gameDetailDialogInfoBean.getTitle();
            str2 = gameDetailDialogInfoBean.getContent();
            str = title;
        }
        if (j5 != 0) {
            TextViewBindingAdapter.setText(this.f21946e, str2);
            TextViewBindingAdapter.setText(this.f21941b, str);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemDiscountGameDetailDialogInfoListBinding
    public void f(@Nullable GameDetailDialogInfoBean gameDetailDialogInfoBean) {
        this.f21942c = gameDetailDialogInfoBean;
        synchronized (this) {
            this.f21947f |= 1;
        }
        notifyPropertyChanged(18);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f21947f != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f21947f = 2L;
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
            f((GameDetailDialogInfoBean) obj);
            return true;
        }
        return false;
    }

    private ItemDiscountGameDetailDialogInfoListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[1]);
        this.f21947f = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21945d = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f21946e = textView;
        textView.setTag(null);
        this.f21941b.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
