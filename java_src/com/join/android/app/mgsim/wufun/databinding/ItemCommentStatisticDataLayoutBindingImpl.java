package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.discount.model.bean.CommentDataProgressBean;
import com.join.mgps.customview.MStarBar;
/* loaded from: classes3.dex */
public class ItemCommentStatisticDataLayoutBindingImpl extends ItemCommentStatisticDataLayoutBinding {
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f21758k = null;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private static final SparseIntArray f21759l;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    private final ConstraintLayout f21760e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    private final TextView f21761f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    private final FrameLayout f21762g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    private final ProgressBar f21763h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    private final TextView f21764i;

    /* renamed from: j  reason: collision with root package name */
    private long f21765j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21759l = sparseIntArray;
        sparseIntArray.put(R.id.container, 6);
    }

    public ItemCommentStatisticDataLayoutBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f21758k, f21759l));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String str2;
        int i9;
        int i10;
        int i11;
        synchronized (this) {
            j4 = this.f21765j;
            this.f21765j = 0L;
        }
        CommentDataProgressBean commentDataProgressBean = this.f21757d;
        long j5 = j4 & 3;
        String str3 = null;
        if (j5 != 0) {
            if (commentDataProgressBean != null) {
                i10 = commentDataProgressBean.getStarCount();
                i8 = commentDataProgressBean.getProgress();
                str2 = commentDataProgressBean.getTitle();
                str = commentDataProgressBean.getUserPercent();
                i11 = commentDataProgressBean.getType();
                i9 = commentDataProgressBean.getMax();
            } else {
                str2 = null;
                str = null;
                i9 = 0;
                i10 = 0;
                i8 = 0;
                i11 = 0;
            }
            boolean z4 = i11 == 1;
            boolean z5 = i11 == 2;
            if (j5 != 0) {
                j4 |= z4 ? 8L : 4L;
            }
            if ((j4 & 3) != 0) {
                j4 |= z5 ? 32L : 16L;
            }
            i6 = z4 ? 0 : 8;
            i5 = i9;
            i4 = z5 ? 0 : 8;
            i7 = i10;
            str3 = str2;
        } else {
            str = null;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if ((j4 & 3) != 0) {
            this.f21756c.setStarCount(i7);
            TextViewBindingAdapter.setText(this.f21761f, str3);
            this.f21761f.setVisibility(i6);
            this.f21762g.setVisibility(i4);
            this.f21763h.setMax(i5);
            this.f21763h.setProgress(i8);
            TextViewBindingAdapter.setText(this.f21764i, str);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemCommentStatisticDataLayoutBinding
    public void f(@Nullable CommentDataProgressBean commentDataProgressBean) {
        this.f21757d = commentDataProgressBean;
        synchronized (this) {
            this.f21765j |= 1;
        }
        notifyPropertyChanged(18);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f21765j != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f21765j = 2L;
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
            f((CommentDataProgressBean) obj);
            return true;
        }
        return false;
    }

    private ItemCommentStatisticDataLayoutBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[6], (MStarBar) objArr[3]);
        this.f21765j = -1L;
        this.f21756c.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21760e = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f21761f = textView;
        textView.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[2];
        this.f21762g = frameLayout;
        frameLayout.setTag(null);
        ProgressBar progressBar = (ProgressBar) objArr[4];
        this.f21763h = progressBar;
        progressBar.setTag(null);
        TextView textView2 = (TextView) objArr[5];
        this.f21764i = textView2;
        textView2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
