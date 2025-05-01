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
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import com.join.kotlin.discount.proxy.GameDetailServerBookDialogClickProxy;
import com.join.kotlin.discount.viewmodel.GameDetailServerBookDialogViewModel;
/* loaded from: classes3.dex */
public abstract class ActivityDiscountGameDetailServerBookDialogBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final ConstraintLayout f15969b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f15970c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final XQuickRecyclerView f15971d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f15972e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f15973f;
    @Bindable

    /* renamed from: g  reason: collision with root package name */
    protected GameDetailServerBookDialogViewModel f15974g;
    @Bindable

    /* renamed from: h  reason: collision with root package name */
    protected GameDetailServerBookDialogClickProxy f15975h;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityDiscountGameDetailServerBookDialogBinding(Object obj, View view, int i4, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, XQuickRecyclerView xQuickRecyclerView, TextView textView, TextView textView2) {
        super(obj, view, i4);
        this.f15969b = constraintLayout;
        this.f15970c = constraintLayout2;
        this.f15971d = xQuickRecyclerView;
        this.f15972e = textView;
        this.f15973f = textView2;
    }

    @Deprecated
    public static ActivityDiscountGameDetailServerBookDialogBinding b(@NonNull View view, @Nullable Object obj) {
        return (ActivityDiscountGameDetailServerBookDialogBinding) ViewDataBinding.bind(obj, view, R.layout.activity_discount_game_detail_server_book_dialog);
    }

    public static ActivityDiscountGameDetailServerBookDialogBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityDiscountGameDetailServerBookDialogBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ActivityDiscountGameDetailServerBookDialogBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_discount_game_detail_server_book_dialog, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ActivityDiscountGameDetailServerBookDialogBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityDiscountGameDetailServerBookDialogBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_discount_game_detail_server_book_dialog, null, false, obj);
    }

    @NonNull
    public static ActivityDiscountGameDetailServerBookDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public GameDetailServerBookDialogClickProxy c() {
        return this.f15975h;
    }

    @Nullable
    public GameDetailServerBookDialogViewModel d() {
        return this.f15974g;
    }

    public abstract void g(@Nullable GameDetailServerBookDialogClickProxy gameDetailServerBookDialogClickProxy);

    public abstract void h(@Nullable GameDetailServerBookDialogViewModel gameDetailServerBookDialogViewModel);

    @NonNull
    public static ActivityDiscountGameDetailServerBookDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
