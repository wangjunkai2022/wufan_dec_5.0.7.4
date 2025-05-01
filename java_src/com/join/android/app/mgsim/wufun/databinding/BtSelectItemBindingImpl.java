package com.join.android.app.mgsim.wufun.databinding;

import android.content.Context;
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
import com.join.kotlin.ui.modleregin.modle.BtTagSelecterBean;
/* loaded from: classes3.dex */
public class BtSelectItemBindingImpl extends BtSelectItemBinding {
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f17625f = null;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private static final SparseIntArray f17626g = null;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    private final ConstraintLayout f17627c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    private final TextView f17628d;

    /* renamed from: e  reason: collision with root package name */
    private long f17629e;

    public BtSelectItemBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f17625f, f17626g));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        String str;
        long j5;
        long j6;
        synchronized (this) {
            j4 = this.f17629e;
            this.f17629e = 0L;
        }
        BtTagSelecterBean btTagSelecterBean = this.f17624b;
        long j7 = j4 & 3;
        int i4 = 0;
        boolean z4 = false;
        Drawable drawable = null;
        String str2 = null;
        if (j7 != 0) {
            if (btTagSelecterBean != null) {
                str2 = btTagSelecterBean.getTimeMessage();
                z4 = btTagSelecterBean.getStatus();
            }
            if (j7 != 0) {
                if (z4) {
                    j5 = j4 | 8;
                    j6 = 32;
                } else {
                    j5 = j4 | 4;
                    j6 = 16;
                }
                j4 = j5 | j6;
            }
            int colorFromResource = ViewDataBinding.getColorFromResource(this.f17628d, z4 ? R.color.white : R.color.home_gray);
            Context context = this.f17628d.getContext();
            int i5 = z4 ? R.drawable.bt_tag_selected : R.drawable.bt_tag_normal;
            i4 = colorFromResource;
            str = str2;
            drawable = AppCompatResources.getDrawable(context, i5);
        } else {
            str = null;
        }
        if ((j4 & 3) != 0) {
            this.f17628d.setTextColor(i4);
            ViewBindingAdapter.setBackground(this.f17628d, drawable);
            TextViewBindingAdapter.setText(this.f17628d, str);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.BtSelectItemBinding
    public void f(@Nullable BtTagSelecterBean btTagSelecterBean) {
        this.f17624b = btTagSelecterBean;
        synchronized (this) {
            this.f17629e |= 1;
        }
        notifyPropertyChanged(22);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f17629e != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f17629e = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (22 == i4) {
            f((BtTagSelecterBean) obj);
            return true;
        }
        return false;
    }

    private BtSelectItemBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.f17629e = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f17627c = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f17628d = textView;
        textView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
