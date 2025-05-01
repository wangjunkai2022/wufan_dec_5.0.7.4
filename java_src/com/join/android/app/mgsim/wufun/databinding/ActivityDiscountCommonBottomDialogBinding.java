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
import com.join.kotlin.discount.proxy.CommonBottomDialogClickProxy;
import com.join.kotlin.discount.viewmodel.CommonBottomDialogViewModel;
/* loaded from: classes3.dex */
public abstract class ActivityDiscountCommonBottomDialogBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final TextView f15913b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f15914c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ConstraintLayout f15915d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f15916e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f15917f;
    @Bindable

    /* renamed from: g  reason: collision with root package name */
    protected CommonBottomDialogViewModel f15918g;
    @Bindable

    /* renamed from: h  reason: collision with root package name */
    protected CommonBottomDialogClickProxy f15919h;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityDiscountCommonBottomDialogBinding(Object obj, View view, int i4, TextView textView, LinearLayout linearLayout, ConstraintLayout constraintLayout, TextView textView2, TextView textView3) {
        super(obj, view, i4);
        this.f15913b = textView;
        this.f15914c = linearLayout;
        this.f15915d = constraintLayout;
        this.f15916e = textView2;
        this.f15917f = textView3;
    }

    @Deprecated
    public static ActivityDiscountCommonBottomDialogBinding b(@NonNull View view, @Nullable Object obj) {
        return (ActivityDiscountCommonBottomDialogBinding) ViewDataBinding.bind(obj, view, R.layout.activity_discount_common_bottom_dialog);
    }

    public static ActivityDiscountCommonBottomDialogBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityDiscountCommonBottomDialogBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ActivityDiscountCommonBottomDialogBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_discount_common_bottom_dialog, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ActivityDiscountCommonBottomDialogBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityDiscountCommonBottomDialogBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_discount_common_bottom_dialog, null, false, obj);
    }

    @NonNull
    public static ActivityDiscountCommonBottomDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public CommonBottomDialogClickProxy c() {
        return this.f15919h;
    }

    @Nullable
    public CommonBottomDialogViewModel d() {
        return this.f15918g;
    }

    public abstract void g(@Nullable CommonBottomDialogClickProxy commonBottomDialogClickProxy);

    public abstract void h(@Nullable CommonBottomDialogViewModel commonBottomDialogViewModel);

    @NonNull
    public static ActivityDiscountCommonBottomDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
