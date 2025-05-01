package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.discount.model.bean.CommentDataProgressBean;
import com.join.mgps.customview.MStarBar;
/* loaded from: classes3.dex */
public abstract class ItemCommentStatisticDataLayoutBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f21755b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final MStarBar f21756c;
    @Bindable

    /* renamed from: d  reason: collision with root package name */
    protected CommentDataProgressBean f21757d;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemCommentStatisticDataLayoutBinding(Object obj, View view, int i4, LinearLayout linearLayout, MStarBar mStarBar) {
        super(obj, view, i4);
        this.f21755b = linearLayout;
        this.f21756c = mStarBar;
    }

    @Deprecated
    public static ItemCommentStatisticDataLayoutBinding b(@NonNull View view, @Nullable Object obj) {
        return (ItemCommentStatisticDataLayoutBinding) ViewDataBinding.bind(obj, view, R.layout.item_comment_statistic_data_layout);
    }

    public static ItemCommentStatisticDataLayoutBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemCommentStatisticDataLayoutBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ItemCommentStatisticDataLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_comment_statistic_data_layout, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ItemCommentStatisticDataLayoutBinding e(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemCommentStatisticDataLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_comment_statistic_data_layout, null, false, obj);
    }

    @NonNull
    public static ItemCommentStatisticDataLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return d(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public CommentDataProgressBean c() {
        return this.f21757d;
    }

    public abstract void f(@Nullable CommentDataProgressBean commentDataProgressBean);

    @NonNull
    public static ItemCommentStatisticDataLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
