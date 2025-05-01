package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.discount.viewmodel.CommentStatisticDataViewModel;
/* loaded from: classes3.dex */
public abstract class FragmentCommentStatisticDataBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView f19677b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19678c;
    @Bindable

    /* renamed from: d  reason: collision with root package name */
    protected CommentStatisticDataViewModel f19679d;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentCommentStatisticDataBinding(Object obj, View view, int i4, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i4);
        this.f19677b = recyclerView;
        this.f19678c = textView;
    }

    @Deprecated
    public static FragmentCommentStatisticDataBinding b(@NonNull View view, @Nullable Object obj) {
        return (FragmentCommentStatisticDataBinding) ViewDataBinding.bind(obj, view, R.layout.fragment_comment_statistic_data);
    }

    public static FragmentCommentStatisticDataBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentCommentStatisticDataBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (FragmentCommentStatisticDataBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_comment_statistic_data, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static FragmentCommentStatisticDataBinding e(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentCommentStatisticDataBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_comment_statistic_data, null, false, obj);
    }

    @NonNull
    public static FragmentCommentStatisticDataBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return d(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public CommentStatisticDataViewModel c() {
        return this.f19679d;
    }

    public abstract void f(@Nullable CommentStatisticDataViewModel commentStatisticDataViewModel);

    @NonNull
    public static FragmentCommentStatisticDataBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
