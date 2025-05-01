package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import com.join.kotlin.discount.proxy.GameDetailCommentListClickProxy;
import com.join.kotlin.discount.viewmodel.GameDetailCommentListViewModel;
/* loaded from: classes3.dex */
public abstract class FragmentGameDetailCommentListBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final ConstraintLayout f19840b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f19841c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f19842d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final XQuickRecyclerView f19843e;
    @Bindable

    /* renamed from: f  reason: collision with root package name */
    protected GameDetailCommentListViewModel f19844f;
    @Bindable

    /* renamed from: g  reason: collision with root package name */
    protected GameDetailCommentListClickProxy f19845g;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentGameDetailCommentListBinding(Object obj, View view, int i4, ConstraintLayout constraintLayout, LinearLayout linearLayout, TextView textView, XQuickRecyclerView xQuickRecyclerView) {
        super(obj, view, i4);
        this.f19840b = constraintLayout;
        this.f19841c = linearLayout;
        this.f19842d = textView;
        this.f19843e = xQuickRecyclerView;
    }

    @Deprecated
    public static FragmentGameDetailCommentListBinding b(@NonNull View view, @Nullable Object obj) {
        return (FragmentGameDetailCommentListBinding) ViewDataBinding.bind(obj, view, R.layout.fragment_game_detail_comment_list);
    }

    public static FragmentGameDetailCommentListBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentGameDetailCommentListBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (FragmentGameDetailCommentListBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_game_detail_comment_list, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static FragmentGameDetailCommentListBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentGameDetailCommentListBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_game_detail_comment_list, null, false, obj);
    }

    @NonNull
    public static FragmentGameDetailCommentListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public GameDetailCommentListClickProxy c() {
        return this.f19845g;
    }

    @Nullable
    public GameDetailCommentListViewModel d() {
        return this.f19844f;
    }

    public abstract void g(@Nullable GameDetailCommentListClickProxy gameDetailCommentListClickProxy);

    public abstract void h(@Nullable GameDetailCommentListViewModel gameDetailCommentListViewModel);

    @NonNull
    public static FragmentGameDetailCommentListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
