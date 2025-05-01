package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.discount.proxy.GameDetailClickProxy;
import com.join.kotlin.discount.viewmodel.GameDetailViewModel;
/* loaded from: classes3.dex */
public abstract class ActivityDiscountGameDetailBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f15926b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f15927c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TabLayout f15928d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ViewPager2 f15929e;
    @Bindable

    /* renamed from: f  reason: collision with root package name */
    protected GameDetailViewModel f15930f;
    @Bindable

    /* renamed from: g  reason: collision with root package name */
    protected GameDetailClickProxy f15931g;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityDiscountGameDetailBinding(Object obj, View view, int i4, ImageView imageView, ConstraintLayout constraintLayout, TabLayout tabLayout, ViewPager2 viewPager2) {
        super(obj, view, i4);
        this.f15926b = imageView;
        this.f15927c = constraintLayout;
        this.f15928d = tabLayout;
        this.f15929e = viewPager2;
    }

    @Deprecated
    public static ActivityDiscountGameDetailBinding b(@NonNull View view, @Nullable Object obj) {
        return (ActivityDiscountGameDetailBinding) ViewDataBinding.bind(obj, view, R.layout.activity_discount_game_detail);
    }

    public static ActivityDiscountGameDetailBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityDiscountGameDetailBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ActivityDiscountGameDetailBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_discount_game_detail, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ActivityDiscountGameDetailBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityDiscountGameDetailBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_discount_game_detail, null, false, obj);
    }

    @NonNull
    public static ActivityDiscountGameDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public GameDetailClickProxy c() {
        return this.f15931g;
    }

    @Nullable
    public GameDetailViewModel d() {
        return this.f15930f;
    }

    public abstract void g(@Nullable GameDetailClickProxy gameDetailClickProxy);

    public abstract void h(@Nullable GameDetailViewModel gameDetailViewModel);

    @NonNull
    public static ActivityDiscountGameDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
