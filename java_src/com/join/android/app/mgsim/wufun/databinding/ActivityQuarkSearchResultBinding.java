package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import com.join.kotlin.quark.proxy.QuarkSearchClickProxy;
import com.join.kotlin.quark.viewmodel.QuarkSearchViewModel;
/* loaded from: classes3.dex */
public abstract class ActivityQuarkSearchResultBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f16895b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f16896c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final XQuickRecyclerView f16897d;
    @Bindable

    /* renamed from: e  reason: collision with root package name */
    protected QuarkSearchViewModel f16898e;
    @Bindable

    /* renamed from: f  reason: collision with root package name */
    protected QuarkSearchClickProxy f16899f;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityQuarkSearchResultBinding(Object obj, View view, int i4, ImageView imageView, TextView textView, XQuickRecyclerView xQuickRecyclerView) {
        super(obj, view, i4);
        this.f16895b = imageView;
        this.f16896c = textView;
        this.f16897d = xQuickRecyclerView;
    }

    @Deprecated
    public static ActivityQuarkSearchResultBinding b(@NonNull View view, @Nullable Object obj) {
        return (ActivityQuarkSearchResultBinding) ViewDataBinding.bind(obj, view, R.layout.activity_quark_search_result);
    }

    public static ActivityQuarkSearchResultBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityQuarkSearchResultBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ActivityQuarkSearchResultBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_quark_search_result, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ActivityQuarkSearchResultBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityQuarkSearchResultBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_quark_search_result, null, false, obj);
    }

    @NonNull
    public static ActivityQuarkSearchResultBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public QuarkSearchClickProxy c() {
        return this.f16899f;
    }

    @Nullable
    public QuarkSearchViewModel d() {
        return this.f16898e;
    }

    public abstract void g(@Nullable QuarkSearchClickProxy quarkSearchClickProxy);

    public abstract void h(@Nullable QuarkSearchViewModel quarkSearchViewModel);

    @NonNull
    public static ActivityQuarkSearchResultBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
