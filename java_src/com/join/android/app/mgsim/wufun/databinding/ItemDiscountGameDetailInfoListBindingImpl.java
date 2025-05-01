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
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.kotlin.bindingadapter.SimpleDrawableViewKt;
import com.join.kotlin.discount.model.bean.GameDetailInfoItemBean;
/* loaded from: classes3.dex */
public class ItemDiscountGameDetailInfoListBindingImpl extends ItemDiscountGameDetailInfoListBinding {
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f21951i = null;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private static final SparseIntArray f21952j = null;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    private final ConstraintLayout f21953e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    private final SimpleDraweeView f21954f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    private final TextView f21955g;

    /* renamed from: h  reason: collision with root package name */
    private long f21956h;

    public ItemDiscountGameDetailInfoListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f21951i, f21952j));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        String str;
        Integer num;
        String str2;
        synchronized (this) {
            j4 = this.f21956h;
            this.f21956h = 0L;
        }
        GameDetailInfoItemBean gameDetailInfoItemBean = this.f21950d;
        long j5 = j4 & 3;
        String str3 = null;
        Boolean bool = null;
        if (j5 != 0) {
            if (gameDetailInfoItemBean != null) {
                bool = gameDetailInfoItemBean.getShowArrow();
                num = gameDetailInfoItemBean.getIconRes();
                str2 = gameDetailInfoItemBean.getTitle();
                str = gameDetailInfoItemBean.getValue();
            } else {
                str = null;
                num = null;
                str2 = null;
            }
            boolean safeUnbox = ViewDataBinding.safeUnbox(bool);
            if (j5 != 0) {
                j4 |= safeUnbox ? 8L : 4L;
            }
            r9 = safeUnbox ? 0 : 8;
            str3 = str2;
        } else {
            str = null;
            num = null;
        }
        if ((j4 & 3) != 0) {
            this.f21948b.setVisibility(r9);
            TextViewBindingAdapter.setText(this.f21949c, str3);
            SimpleDrawableViewKt.loadResId(this.f21954f, num);
            TextViewBindingAdapter.setText(this.f21955g, str);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemDiscountGameDetailInfoListBinding
    public void f(@Nullable GameDetailInfoItemBean gameDetailInfoItemBean) {
        this.f21950d = gameDetailInfoItemBean;
        synchronized (this) {
            this.f21956h |= 1;
        }
        notifyPropertyChanged(18);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f21956h != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f21956h = 2L;
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
            f((GameDetailInfoItemBean) obj);
            return true;
        }
        return false;
    }

    private ItemDiscountGameDetailInfoListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[3], (TextView) objArr[2]);
        this.f21956h = -1L;
        this.f21948b.setTag(null);
        this.f21949c.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21953e = constraintLayout;
        constraintLayout.setTag(null);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) objArr[1];
        this.f21954f = simpleDraweeView;
        simpleDraweeView.setTag(null);
        TextView textView = (TextView) objArr[4];
        this.f21955g = textView;
        textView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
