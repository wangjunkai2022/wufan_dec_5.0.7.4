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
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.domain.adapter.BaseDataBindingAdapter;
import com.join.kotlin.domain.common.LoadBindClickProxy;
import com.join.kotlin.ui.modleregin.viewModle.MustPlayViewModle;
import com.join.kotlin.ui.notice.ClickProxy;
/* loaded from: classes3.dex */
public abstract class MustplayReginActivityBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f25197b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final XRecyclerView f25198c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25199d;
    @Bindable

    /* renamed from: e  reason: collision with root package name */
    protected MustPlayViewModle f25200e;
    @Bindable

    /* renamed from: f  reason: collision with root package name */
    protected BaseDataBindingAdapter<Object, ViewDataBinding> f25201f;
    @Bindable

    /* renamed from: g  reason: collision with root package name */
    protected ClickProxy f25202g;
    @Bindable

    /* renamed from: h  reason: collision with root package name */
    protected LoadBindClickProxy f25203h;
    @Bindable

    /* renamed from: i  reason: collision with root package name */
    protected XRecyclerView.f f25204i;

    /* JADX INFO: Access modifiers changed from: protected */
    public MustplayReginActivityBinding(Object obj, View view, int i4, ImageView imageView, XRecyclerView xRecyclerView, TextView textView) {
        super(obj, view, i4);
        this.f25197b = imageView;
        this.f25198c = xRecyclerView;
        this.f25199d = textView;
    }

    @Deprecated
    public static MustplayReginActivityBinding b(@NonNull View view, @Nullable Object obj) {
        return (MustplayReginActivityBinding) ViewDataBinding.bind(obj, view, R.layout.mustplay_regin_activity);
    }

    public static MustplayReginActivityBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static MustplayReginActivityBinding h(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (MustplayReginActivityBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.mustplay_regin_activity, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static MustplayReginActivityBinding i(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (MustplayReginActivityBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.mustplay_regin_activity, null, false, obj);
    }

    @NonNull
    public static MustplayReginActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return h(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public BaseDataBindingAdapter<Object, ViewDataBinding> c() {
        return this.f25201f;
    }

    @Nullable
    public ClickProxy d() {
        return this.f25202g;
    }

    @Nullable
    public LoadBindClickProxy e() {
        return this.f25203h;
    }

    @Nullable
    public XRecyclerView.f f() {
        return this.f25204i;
    }

    @Nullable
    public MustPlayViewModle g() {
        return this.f25200e;
    }

    public abstract void j(@Nullable BaseDataBindingAdapter<Object, ViewDataBinding> baseDataBindingAdapter);

    public abstract void k(@Nullable ClickProxy clickProxy);

    public abstract void l(@Nullable LoadBindClickProxy loadBindClickProxy);

    public abstract void m(@Nullable XRecyclerView.f fVar);

    public abstract void n(@Nullable MustPlayViewModle mustPlayViewModle);

    @NonNull
    public static MustplayReginActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return i(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
