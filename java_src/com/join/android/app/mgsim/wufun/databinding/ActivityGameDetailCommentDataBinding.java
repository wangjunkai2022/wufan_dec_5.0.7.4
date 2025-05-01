package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.discount.proxy.GameDetailCommentDataClickProxy;
import com.join.kotlin.discount.viewmodel.GameDetailCommentDataViewModel;
/* loaded from: classes3.dex */
public abstract class ActivityGameDetailCommentDataBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final TextView f16227b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f16228c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ConstraintLayout f16229d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TabLayout f16230e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ViewPager2 f16231f;
    @Bindable

    /* renamed from: g  reason: collision with root package name */
    protected GameDetailCommentDataViewModel f16232g;
    @Bindable

    /* renamed from: h  reason: collision with root package name */
    protected GameDetailCommentDataClickProxy f16233h;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityGameDetailCommentDataBinding(Object obj, View view, int i4, TextView textView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TabLayout tabLayout, ViewPager2 viewPager2) {
        super(obj, view, i4);
        this.f16227b = textView;
        this.f16228c = constraintLayout;
        this.f16229d = constraintLayout2;
        this.f16230e = tabLayout;
        this.f16231f = viewPager2;
    }

    @Deprecated
    public static ActivityGameDetailCommentDataBinding b(@NonNull View view, @Nullable Object obj) {
        return (ActivityGameDetailCommentDataBinding) ViewDataBinding.bind(obj, view, R.layout.activity_game_detail_comment_data);
    }

    public static ActivityGameDetailCommentDataBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityGameDetailCommentDataBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ActivityGameDetailCommentDataBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_game_detail_comment_data, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ActivityGameDetailCommentDataBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityGameDetailCommentDataBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_game_detail_comment_data, null, false, obj);
    }

    @NonNull
    public static ActivityGameDetailCommentDataBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public GameDetailCommentDataClickProxy c() {
        return this.f16233h;
    }

    @Nullable
    public GameDetailCommentDataViewModel d() {
        return this.f16232g;
    }

    public abstract void g(@Nullable GameDetailCommentDataClickProxy gameDetailCommentDataClickProxy);

    public abstract void h(@Nullable GameDetailCommentDataViewModel gameDetailCommentDataViewModel);

    @NonNull
    public static ActivityGameDetailCommentDataBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
