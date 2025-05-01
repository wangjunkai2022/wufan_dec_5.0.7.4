package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.domain.adapter.BaseDataBindingAdapter;
import com.join.kotlin.ui.userrecom.RecomViewModle;
/* loaded from: classes3.dex */
public abstract class ActivityUserrecomActivityBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView f17217b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f17218c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RelativeLayout f17219d;
    @Bindable

    /* renamed from: e  reason: collision with root package name */
    protected RecomViewModle f17220e;
    @Bindable

    /* renamed from: f  reason: collision with root package name */
    protected BaseDataBindingAdapter f17221f;
    @Bindable

    /* renamed from: g  reason: collision with root package name */
    protected View.OnClickListener f17222g;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityUserrecomActivityBinding(Object obj, View view, int i4, RecyclerView recyclerView, TextView textView, RelativeLayout relativeLayout) {
        super(obj, view, i4);
        this.f17217b = recyclerView;
        this.f17218c = textView;
        this.f17219d = relativeLayout;
    }

    @Deprecated
    public static ActivityUserrecomActivityBinding b(@NonNull View view, @Nullable Object obj) {
        return (ActivityUserrecomActivityBinding) ViewDataBinding.bind(obj, view, R.layout.activity_userrecom_activity);
    }

    public static ActivityUserrecomActivityBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityUserrecomActivityBinding f(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ActivityUserrecomActivityBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_userrecom_activity, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ActivityUserrecomActivityBinding g(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityUserrecomActivityBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_userrecom_activity, null, false, obj);
    }

    @NonNull
    public static ActivityUserrecomActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return f(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public BaseDataBindingAdapter c() {
        return this.f17221f;
    }

    @Nullable
    public View.OnClickListener d() {
        return this.f17222g;
    }

    @Nullable
    public RecomViewModle e() {
        return this.f17220e;
    }

    public abstract void h(@Nullable BaseDataBindingAdapter baseDataBindingAdapter);

    public abstract void i(@Nullable View.OnClickListener onClickListener);

    public abstract void j(@Nullable RecomViewModle recomViewModle);

    @NonNull
    public static ActivityUserrecomActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return g(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
