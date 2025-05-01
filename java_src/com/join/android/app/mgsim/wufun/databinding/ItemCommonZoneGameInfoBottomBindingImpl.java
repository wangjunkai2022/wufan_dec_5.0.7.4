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
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.bindingadapter.SimpleDrawableViewKt;
import com.join.mgps.dto.CommonGameInfoBean;
/* loaded from: classes3.dex */
public class ItemCommonZoneGameInfoBottomBindingImpl extends ItemCommonZoneGameInfoBottomBinding {
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f21780h = null;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private static final SparseIntArray f21781i;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    private final ConstraintLayout f21782f;

    /* renamed from: g  reason: collision with root package name */
    private long f21783g;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21781i = sparseIntArray;
        sparseIntArray.put(R.id.tv_label, 3);
    }

    public ItemCommonZoneGameInfoBottomBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, f21780h, f21781i));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        String str;
        String str2;
        synchronized (this) {
            j4 = this.f21783g;
            this.f21783g = 0L;
        }
        CommonGameInfoBean commonGameInfoBean = this.f21779e;
        long j5 = j4 & 3;
        if (j5 == 0 || commonGameInfoBean == null) {
            str = null;
            str2 = null;
        } else {
            str2 = commonGameInfoBean.getShowName();
            str = commonGameInfoBean.getCoverPicUrl();
        }
        if (j5 != 0) {
            SimpleDrawableViewKt.loadUrl(this.f21776b, str, null, 0);
            TextViewBindingAdapter.setText(this.f21777c, str2);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemCommonZoneGameInfoBottomBinding
    public void f(@Nullable CommonGameInfoBean commonGameInfoBean) {
        this.f21779e = commonGameInfoBean;
        synchronized (this) {
            this.f21783g |= 1;
        }
        notifyPropertyChanged(18);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f21783g != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f21783g = 2L;
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
            f((CommonGameInfoBean) obj);
            return true;
        }
        return false;
    }

    private ItemCommonZoneGameInfoBottomBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (SimpleDraweeView) objArr[1], (TextView) objArr[2], (TextView) objArr[3]);
        this.f21783g = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21782f = constraintLayout;
        constraintLayout.setTag(null);
        this.f21776b.setTag(null);
        this.f21777c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
