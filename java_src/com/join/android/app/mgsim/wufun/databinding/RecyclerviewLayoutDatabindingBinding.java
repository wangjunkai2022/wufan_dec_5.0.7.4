package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.domain.common.LoadBindClickProxy;
import com.join.kotlin.ui.cloudarchive.ModGameCloudViewModle;
/* loaded from: classes3.dex */
public abstract class RecyclerviewLayoutDatabindingBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final XRecyclerView f26242b;
    @Bindable

    /* renamed from: c  reason: collision with root package name */
    protected ModGameCloudViewModle f26243c;
    @Bindable

    /* renamed from: d  reason: collision with root package name */
    protected RecyclerView.Adapter f26244d;
    @Bindable

    /* renamed from: e  reason: collision with root package name */
    protected LoadBindClickProxy f26245e;

    /* JADX INFO: Access modifiers changed from: protected */
    public RecyclerviewLayoutDatabindingBinding(Object obj, View view, int i4, XRecyclerView xRecyclerView) {
        super(obj, view, i4);
        this.f26242b = xRecyclerView;
    }

    @Deprecated
    public static RecyclerviewLayoutDatabindingBinding b(@NonNull View view, @Nullable Object obj) {
        return (RecyclerviewLayoutDatabindingBinding) ViewDataBinding.bind(obj, view, R.layout.recyclerview_layout_databinding);
    }

    public static RecyclerviewLayoutDatabindingBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static RecyclerviewLayoutDatabindingBinding f(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (RecyclerviewLayoutDatabindingBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.recyclerview_layout_databinding, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static RecyclerviewLayoutDatabindingBinding g(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (RecyclerviewLayoutDatabindingBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.recyclerview_layout_databinding, null, false, obj);
    }

    @NonNull
    public static RecyclerviewLayoutDatabindingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return f(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public RecyclerView.Adapter c() {
        return this.f26244d;
    }

    @Nullable
    public LoadBindClickProxy d() {
        return this.f26245e;
    }

    @Nullable
    public ModGameCloudViewModle e() {
        return this.f26243c;
    }

    public abstract void h(@Nullable RecyclerView.Adapter adapter);

    public abstract void i(@Nullable LoadBindClickProxy loadBindClickProxy);

    public abstract void j(@Nullable ModGameCloudViewModle modGameCloudViewModle);

    @NonNull
    public static RecyclerviewLayoutDatabindingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return g(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
