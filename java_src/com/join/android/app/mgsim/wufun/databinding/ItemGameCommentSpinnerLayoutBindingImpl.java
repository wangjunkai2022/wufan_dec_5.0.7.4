package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public class ItemGameCommentSpinnerLayoutBindingImpl extends ItemGameCommentSpinnerLayoutBinding {
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f22181g = null;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private static final SparseIntArray f22182h;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    private final LinearLayout f22183e;

    /* renamed from: f  reason: collision with root package name */
    private long f22184f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22182h = sparseIntArray;
        sparseIntArray.put(R.id.divider, 2);
    }

    public ItemGameCommentSpinnerLayoutBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f22181g, f22182h));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        synchronized (this) {
            j4 = this.f22184f;
            this.f22184f = 0L;
        }
        String str = this.f22180d;
        if ((j4 & 3) != 0) {
            TextViewBindingAdapter.setText(this.f22179c, str);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemGameCommentSpinnerLayoutBinding
    public void f(@Nullable String str) {
        this.f22180d = str;
        synchronized (this) {
            this.f22184f |= 1;
        }
        notifyPropertyChanged(18);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f22184f != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f22184f = 2L;
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
            f((String) obj);
            return true;
        }
        return false;
    }

    private ItemGameCommentSpinnerLayoutBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (View) objArr[2], (TextView) objArr[1]);
        this.f22184f = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f22183e = linearLayout;
        linearLayout.setTag(null);
        this.f22179c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
