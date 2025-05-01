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
import com.join.android.app.component.video.MultiStandVideo;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.CommonGameInfoBean;
/* loaded from: classes3.dex */
public class ItemCommonZoneGameInfoBottomCardVideoBindingImpl extends ItemCommonZoneGameInfoBottomCardVideoBinding {
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f21800j = null;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private static final SparseIntArray f21801k;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    private final CardView f21802h;

    /* renamed from: i  reason: collision with root package name */
    private long f21803i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21801k = sparseIntArray;
        sparseIntArray.put(R.id.wf_video, 3);
        sparseIntArray.put(R.id.ll_tags, 4);
        sparseIntArray.put(R.id.v_score, 5);
    }

    public ItemCommonZoneGameInfoBottomCardVideoBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f21800j, f21801k));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        String str;
        synchronized (this) {
            j4 = this.f21803i;
            this.f21803i = 0L;
        }
        CommonGameInfoBean commonGameInfoBean = this.f21799g;
        long j5 = j4 & 3;
        String str2 = null;
        if (j5 == 0 || commonGameInfoBean == null) {
            str = null;
        } else {
            str2 = commonGameInfoBean.getShowName();
            str = commonGameInfoBean.getShowScore();
        }
        if (j5 != 0) {
            TextViewBindingAdapter.setText(this.f21795c, str2);
            TextViewBindingAdapter.setText(this.f21796d, str);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemCommonZoneGameInfoBottomCardVideoBinding
    public void f(@Nullable CommonGameInfoBean commonGameInfoBean) {
        this.f21799g = commonGameInfoBean;
        synchronized (this) {
            this.f21803i |= 1;
        }
        notifyPropertyChanged(18);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f21803i != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f21803i = 2L;
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

    private ItemCommonZoneGameInfoBottomCardVideoBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[4], (TextView) objArr[1], (TextView) objArr[2], (View) objArr[5], (MultiStandVideo) objArr[3]);
        this.f21803i = -1L;
        CardView cardView = (CardView) objArr[0];
        this.f21802h = cardView;
        cardView.setTag(null);
        this.f21795c.setTag(null);
        this.f21796d.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
