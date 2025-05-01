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
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.discount.proxy.GameDetailInfoBottomDialogClickProxy;
import com.join.kotlin.discount.viewmodel.GameDetailInfoBottomDialogViewModel;
/* loaded from: classes3.dex */
public abstract class ActivityDiscountGameDetailInfoBottomDialogBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final ConstraintLayout f15958b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f15959c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f15960d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f15961e;
    @Bindable

    /* renamed from: f  reason: collision with root package name */
    protected GameDetailInfoBottomDialogViewModel f15962f;
    @Bindable

    /* renamed from: g  reason: collision with root package name */
    protected GameDetailInfoBottomDialogClickProxy f15963g;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityDiscountGameDetailInfoBottomDialogBinding(Object obj, View view, int i4, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i4);
        this.f15958b = constraintLayout;
        this.f15959c = constraintLayout2;
        this.f15960d = recyclerView;
        this.f15961e = textView;
    }

    @Deprecated
    public static ActivityDiscountGameDetailInfoBottomDialogBinding b(@NonNull View view, @Nullable Object obj) {
        return (ActivityDiscountGameDetailInfoBottomDialogBinding) ViewDataBinding.bind(obj, view, R.layout.activity_discount_game_detail_info_bottom_dialog);
    }

    public static ActivityDiscountGameDetailInfoBottomDialogBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityDiscountGameDetailInfoBottomDialogBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ActivityDiscountGameDetailInfoBottomDialogBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_discount_game_detail_info_bottom_dialog, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ActivityDiscountGameDetailInfoBottomDialogBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityDiscountGameDetailInfoBottomDialogBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_discount_game_detail_info_bottom_dialog, null, false, obj);
    }

    @NonNull
    public static ActivityDiscountGameDetailInfoBottomDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public GameDetailInfoBottomDialogClickProxy c() {
        return this.f15963g;
    }

    @Nullable
    public GameDetailInfoBottomDialogViewModel d() {
        return this.f15962f;
    }

    public abstract void g(@Nullable GameDetailInfoBottomDialogClickProxy gameDetailInfoBottomDialogClickProxy);

    public abstract void h(@Nullable GameDetailInfoBottomDialogViewModel gameDetailInfoBottomDialogViewModel);

    @NonNull
    public static ActivityDiscountGameDetailInfoBottomDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
