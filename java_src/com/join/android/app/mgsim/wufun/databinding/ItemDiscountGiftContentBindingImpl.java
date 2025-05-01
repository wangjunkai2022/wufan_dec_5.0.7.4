package com.join.android.app.mgsim.wufun.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.discount.model.bean.GiftItemBean;
import com.join.kotlin.discount.proxy.GameDetailGiftClickProxy;
/* loaded from: classes3.dex */
public class ItemDiscountGiftContentBindingImpl extends ItemDiscountGiftContentBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f21979l = null;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private static final SparseIntArray f21980m = null;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    private final ConstraintLayout f21981h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private final View.OnClickListener f21982i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private final View.OnClickListener f21983j;

    /* renamed from: k  reason: collision with root package name */
    private long f21984k;

    public ItemDiscountGiftContentBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f21979l, f21980m));
    }

    private boolean i(GiftItemBean giftItemBean, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f21984k |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 == 1) {
            GiftItemBean giftItemBean = this.f21977f;
            GameDetailGiftClickProxy gameDetailGiftClickProxy = this.f21978g;
            if (gameDetailGiftClickProxy != null) {
                gameDetailGiftClickProxy.goGiftDetail(giftItemBean);
            }
        } else if (i4 != 2) {
        } else {
            GiftItemBean giftItemBean2 = this.f21977f;
            GameDetailGiftClickProxy gameDetailGiftClickProxy2 = this.f21978g;
            if (gameDetailGiftClickProxy2 != null) {
                gameDetailGiftClickProxy2.receiveGift(giftItemBean2);
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        String str;
        String str2;
        int i4;
        String str3;
        boolean z4;
        String str4;
        long j5;
        boolean z5;
        long j6;
        Drawable drawable;
        String str5;
        Integer num;
        String str6;
        synchronized (this) {
            j4 = this.f21984k;
            this.f21984k = 0L;
        }
        GiftItemBean giftItemBean = this.f21977f;
        long j7 = j4 & 5;
        if (j7 != 0) {
            if (giftItemBean != null) {
                str4 = giftItemBean.btnText();
                String surplusPercent = giftItemBean.getSurplusPercent();
                num = giftItemBean.getRecStatus();
                str6 = giftItemBean.getTitle();
                str = giftItemBean.getContent();
                str5 = surplusPercent;
            } else {
                str = null;
                str5 = null;
                str4 = null;
                num = null;
                str6 = null;
            }
            str2 = "剩余：" + str5;
            i4 = ViewDataBinding.safeUnbox(num);
            z4 = i4 == -1;
            if (j7 != 0) {
                j4 = z4 ? j4 | 64 : j4 | 32;
            }
            str3 = str6;
        } else {
            str = null;
            str2 = null;
            i4 = 0;
            str3 = null;
            z4 = false;
            str4 = null;
        }
        if ((32 & j4) != 0) {
            z5 = i4 == 1;
            j5 = 5;
        } else {
            j5 = 5;
            z5 = false;
        }
        long j8 = j4 & j5;
        if (j8 != 0) {
            boolean z6 = z4 ? true : z5;
            if (j8 != 0) {
                j4 |= z6 ? 16L : 8L;
            }
            drawable = AppCompatResources.getDrawable(this.f21976e.getContext(), z6 ? R.drawable.shape_discount_f95a5a_r40 : R.drawable.shape_discount_dfdfdf_r40);
            j6 = 5;
        } else {
            j6 = 5;
            drawable = null;
        }
        if ((j6 & j4) != 0) {
            TextViewBindingAdapter.setText(this.f21973b, str);
            TextViewBindingAdapter.setText(this.f21974c, str3);
            TextViewBindingAdapter.setText(this.f21975d, str2);
            ViewBindingAdapter.setBackground(this.f21976e, drawable);
            TextViewBindingAdapter.setText(this.f21976e, str4);
        }
        if ((j4 & 4) != 0) {
            this.f21981h.setOnClickListener(this.f21982i);
            this.f21976e.setOnClickListener(this.f21983j);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemDiscountGiftContentBinding
    public void g(@Nullable GameDetailGiftClickProxy gameDetailGiftClickProxy) {
        this.f21978g = gameDetailGiftClickProxy;
        synchronized (this) {
            this.f21984k |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemDiscountGiftContentBinding
    public void h(@Nullable GiftItemBean giftItemBean) {
        updateRegistration(0, giftItemBean);
        this.f21977f = giftItemBean;
        synchronized (this) {
            this.f21984k |= 1;
        }
        notifyPropertyChanged(18);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f21984k != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f21984k = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        if (i4 != 0) {
            return false;
        }
        return i((GiftItemBean) obj, i5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (18 == i4) {
            h((GiftItemBean) obj);
        } else if (7 != i4) {
            return false;
        } else {
            g((GameDetailGiftClickProxy) obj);
        }
        return true;
    }

    private ItemDiscountGiftContentBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (TextView) objArr[2], (TextView) objArr[1], (TextView) objArr[3], (TextView) objArr[4]);
        this.f21984k = -1L;
        this.f21973b.setTag(null);
        this.f21974c.setTag(null);
        this.f21975d.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21981h = constraintLayout;
        constraintLayout.setTag(null);
        this.f21976e.setTag(null);
        setRootTag(view);
        this.f21982i = new a(this, 1);
        this.f21983j = new a(this, 2);
        invalidateAll();
    }
}
