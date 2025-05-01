package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.discount.viewmodel.CommentStatisticDataViewModel;
/* loaded from: classes3.dex */
public class FragmentCommentStatisticDataBindingImpl extends FragmentCommentStatisticDataBinding {
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f19680g = null;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private static final SparseIntArray f19681h;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    private final ConstraintLayout f19682e;

    /* renamed from: f  reason: collision with root package name */
    private long f19683f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19681h = sparseIntArray;
        sparseIntArray.put(R.id.title, 1);
        sparseIntArray.put(R.id.rvList, 2);
    }

    public FragmentCommentStatisticDataBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f19680g, f19681h));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        synchronized (this) {
            this.f19683f = 0L;
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.FragmentCommentStatisticDataBinding
    public void f(@Nullable CommentStatisticDataViewModel commentStatisticDataViewModel) {
        this.f19679d = commentStatisticDataViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f19683f != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f19683f = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (36 == i4) {
            f((CommentStatisticDataViewModel) obj);
            return true;
        }
        return false;
    }

    private FragmentCommentStatisticDataBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RecyclerView) objArr[2], (TextView) objArr[1]);
        this.f19683f = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f19682e = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
