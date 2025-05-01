package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import com.join.kotlin.discount.proxy.GameDetailGiftClickProxy;
import com.join.kotlin.discount.viewmodel.GameDetailGiftViewModel;
/* loaded from: classes3.dex */
public abstract class ActivityDiscountGameDetailGiftBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f15948b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f15949c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final XQuickRecyclerView f15950d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f15951e;
    @Bindable

    /* renamed from: f  reason: collision with root package name */
    protected GameDetailGiftViewModel f15952f;
    @Bindable

    /* renamed from: g  reason: collision with root package name */
    protected GameDetailGiftClickProxy f15953g;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityDiscountGameDetailGiftBinding(Object obj, View view, int i4, ImageView imageView, ConstraintLayout constraintLayout, XQuickRecyclerView xQuickRecyclerView, TextView textView) {
        super(obj, view, i4);
        this.f15948b = imageView;
        this.f15949c = constraintLayout;
        this.f15950d = xQuickRecyclerView;
        this.f15951e = textView;
    }

    @Deprecated
    public static ActivityDiscountGameDetailGiftBinding b(@NonNull View view, @Nullable Object obj) {
        return (ActivityDiscountGameDetailGiftBinding) ViewDataBinding.bind(obj, view, R.layout.activity_discount_game_detail_gift);
    }

    public static ActivityDiscountGameDetailGiftBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityDiscountGameDetailGiftBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ActivityDiscountGameDetailGiftBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_discount_game_detail_gift, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ActivityDiscountGameDetailGiftBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityDiscountGameDetailGiftBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_discount_game_detail_gift, null, false, obj);
    }

    @NonNull
    public static ActivityDiscountGameDetailGiftBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public GameDetailGiftClickProxy c() {
        return this.f15953g;
    }

    @Nullable
    public GameDetailGiftViewModel d() {
        return this.f15952f;
    }

    public abstract void g(@Nullable GameDetailGiftClickProxy gameDetailGiftClickProxy);

    public abstract void h(@Nullable GameDetailGiftViewModel gameDetailGiftViewModel);

    @NonNull
    public static ActivityDiscountGameDetailGiftBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
