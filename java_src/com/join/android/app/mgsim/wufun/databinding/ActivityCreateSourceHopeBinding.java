package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import com.join.kotlin.quark.proxy.CreateSourceHopeClickProxy;
import com.join.kotlin.quark.viewmodel.CreateSourceHopeViewModel;
/* loaded from: classes3.dex */
public abstract class ActivityCreateSourceHopeBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final AppBarLayout f15869b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f15870c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final CollapsingToolbarLayout f15871d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final EditText f15872e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final CoordinatorLayout f15873f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RecyclerView f15874g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f15875h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f15876i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final XQuickRecyclerView f15877j;
    @Bindable

    /* renamed from: k  reason: collision with root package name */
    protected CreateSourceHopeViewModel f15878k;
    @Bindable

    /* renamed from: l  reason: collision with root package name */
    protected CreateSourceHopeClickProxy f15879l;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityCreateSourceHopeBinding(Object obj, View view, int i4, AppBarLayout appBarLayout, ImageView imageView, CollapsingToolbarLayout collapsingToolbarLayout, EditText editText, CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, TextView textView, TextView textView2, XQuickRecyclerView xQuickRecyclerView) {
        super(obj, view, i4);
        this.f15869b = appBarLayout;
        this.f15870c = imageView;
        this.f15871d = collapsingToolbarLayout;
        this.f15872e = editText;
        this.f15873f = coordinatorLayout;
        this.f15874g = recyclerView;
        this.f15875h = textView;
        this.f15876i = textView2;
        this.f15877j = xQuickRecyclerView;
    }

    @Deprecated
    public static ActivityCreateSourceHopeBinding b(@NonNull View view, @Nullable Object obj) {
        return (ActivityCreateSourceHopeBinding) ViewDataBinding.bind(obj, view, R.layout.activity_create_source_hope);
    }

    public static ActivityCreateSourceHopeBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityCreateSourceHopeBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ActivityCreateSourceHopeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_create_source_hope, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ActivityCreateSourceHopeBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityCreateSourceHopeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_create_source_hope, null, false, obj);
    }

    @NonNull
    public static ActivityCreateSourceHopeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public CreateSourceHopeClickProxy c() {
        return this.f15879l;
    }

    @Nullable
    public CreateSourceHopeViewModel d() {
        return this.f15878k;
    }

    public abstract void g(@Nullable CreateSourceHopeClickProxy createSourceHopeClickProxy);

    public abstract void h(@Nullable CreateSourceHopeViewModel createSourceHopeViewModel);

    @NonNull
    public static ActivityCreateSourceHopeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
