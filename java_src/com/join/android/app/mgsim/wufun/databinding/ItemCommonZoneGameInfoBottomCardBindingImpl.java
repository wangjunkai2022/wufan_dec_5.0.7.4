package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
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
import com.join.mgps.dto.CommonGameInfoBean;
/* loaded from: classes3.dex */
public class ItemCommonZoneGameInfoBottomCardBindingImpl extends ItemCommonZoneGameInfoBottomCardBinding {
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f21790j = null;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private static final SparseIntArray f21791k;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    private final CardView f21792h;

    /* renamed from: i  reason: collision with root package name */
    private long f21793i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21791k = sparseIntArray;
        sparseIntArray.put(R.id.ll_tags, 4);
        sparseIntArray.put(R.id.v_score, 5);
    }

    public ItemCommonZoneGameInfoBottomCardBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f21790j, f21791k));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        String str;
        String str2;
        String str3;
        synchronized (this) {
            j4 = this.f21793i;
            this.f21793i = 0L;
        }
        CommonGameInfoBean commonGameInfoBean = this.f21789g;
        long j5 = j4 & 3;
        if (j5 == 0 || commonGameInfoBean == null) {
            str = null;
            str2 = null;
            str3 = null;
        } else {
            str2 = commonGameInfoBean.getShowName();
            str3 = commonGameInfoBean.getCoverPicUrl();
            str = commonGameInfoBean.getShowScore();
        }
        if (j5 != 0) {
            SimpleDrawableViewKt.loadUrl(this.f21785c, null, str3, 0);
            TextViewBindingAdapter.setText(this.f21786d, str2);
            TextViewBindingAdapter.setText(this.f21787e, str);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemCommonZoneGameInfoBottomCardBinding
    public void f(@Nullable CommonGameInfoBean commonGameInfoBean) {
        this.f21789g = commonGameInfoBean;
        synchronized (this) {
            this.f21793i |= 1;
        }
        notifyPropertyChanged(18);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f21793i != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f21793i = 2L;
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

    private ItemCommonZoneGameInfoBottomCardBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[4], (SimpleDraweeView) objArr[1], (TextView) objArr[2], (TextView) objArr[3], (View) objArr[5]);
        this.f21793i = -1L;
        CardView cardView = (CardView) objArr[0];
        this.f21792h = cardView;
        cardView.setTag(null);
        this.f21785c.setTag(null);
        this.f21786d.setTag(null);
        this.f21787e.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
