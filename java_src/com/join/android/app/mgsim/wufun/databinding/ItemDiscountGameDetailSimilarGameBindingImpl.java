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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.kotlin.bindingadapter.SimpleDrawableViewKt;
import com.join.mgps.dto.CollectionBeanSub;
/* loaded from: classes3.dex */
public class ItemDiscountGameDetailSimilarGameBindingImpl extends ItemDiscountGameDetailSimilarGameBinding {
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f21967g = null;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private static final SparseIntArray f21968h = null;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    private final ConstraintLayout f21969c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    private final SimpleDraweeView f21970d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    private final TextView f21971e;

    /* renamed from: f  reason: collision with root package name */
    private long f21972f;

    public ItemDiscountGameDetailSimilarGameBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f21967g, f21968h));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        String str;
        String str2;
        synchronized (this) {
            j4 = this.f21972f;
            this.f21972f = 0L;
        }
        CollectionBeanSub collectionBeanSub = this.f21966b;
        long j5 = j4 & 3;
        if (j5 == 0 || collectionBeanSub == null) {
            str = null;
            str2 = null;
        } else {
            str2 = collectionBeanSub.getGame_name();
            str = collectionBeanSub.getIco_remote();
        }
        if (j5 != 0) {
            SimpleDrawableViewKt.loadUrl(this.f21970d, str, null, 0);
            TextViewBindingAdapter.setText(this.f21971e, str2);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemDiscountGameDetailSimilarGameBinding
    public void f(@Nullable CollectionBeanSub collectionBeanSub) {
        this.f21966b = collectionBeanSub;
        synchronized (this) {
            this.f21972f |= 1;
        }
        notifyPropertyChanged(18);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f21972f != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f21972f = 2L;
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
            f((CollectionBeanSub) obj);
            return true;
        }
        return false;
    }

    private ItemDiscountGameDetailSimilarGameBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.f21972f = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21969c = constraintLayout;
        constraintLayout.setTag(null);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) objArr[1];
        this.f21970d = simpleDraweeView;
        simpleDraweeView.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f21971e = textView;
        textView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
