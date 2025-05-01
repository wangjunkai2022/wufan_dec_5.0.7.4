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
import com.join.kotlin.ui.modleregin.viewModle.BtReginModle;
import com.join.kotlin.ui.notice.ClickProxy;
/* loaded from: classes3.dex */
public abstract class BtReginActivityBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f17610b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final XRecyclerView f17611c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f17612d;
    @Bindable

    /* renamed from: e  reason: collision with root package name */
    protected BtReginModle f17613e;
    @Bindable

    /* renamed from: f  reason: collision with root package name */
    protected BaseDataBindingAdapter<Object, ViewDataBinding> f17614f;
    @Bindable

    /* renamed from: g  reason: collision with root package name */
    protected ClickProxy f17615g;
    @Bindable

    /* renamed from: h  reason: collision with root package name */
    protected LoadBindClickProxy f17616h;
    @Bindable

    /* renamed from: i  reason: collision with root package name */
    protected XRecyclerView.f f17617i;

    /* JADX INFO: Access modifiers changed from: protected */
    public BtReginActivityBinding(Object obj, View view, int i4, ImageView imageView, XRecyclerView xRecyclerView, TextView textView) {
        super(obj, view, i4);
        this.f17610b = imageView;
        this.f17611c = xRecyclerView;
        this.f17612d = textView;
    }

    @Deprecated
    public static BtReginActivityBinding b(@NonNull View view, @Nullable Object obj) {
        return (BtReginActivityBinding) ViewDataBinding.bind(obj, view, R.layout.bt_regin_activity);
    }

    public static BtReginActivityBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static BtReginActivityBinding h(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (BtReginActivityBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.bt_regin_activity, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static BtReginActivityBinding i(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (BtReginActivityBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.bt_regin_activity, null, false, obj);
    }

    @NonNull
    public static BtReginActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return h(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public BaseDataBindingAdapter<Object, ViewDataBinding> c() {
        return this.f17614f;
    }

    @Nullable
    public ClickProxy d() {
        return this.f17615g;
    }

    @Nullable
    public LoadBindClickProxy e() {
        return this.f17616h;
    }

    @Nullable
    public XRecyclerView.f f() {
        return this.f17617i;
    }

    @Nullable
    public BtReginModle g() {
        return this.f17613e;
    }

    public abstract void j(@Nullable BaseDataBindingAdapter<Object, ViewDataBinding> baseDataBindingAdapter);

    public abstract void k(@Nullable ClickProxy clickProxy);

    public abstract void l(@Nullable LoadBindClickProxy loadBindClickProxy);

    public abstract void m(@Nullable XRecyclerView.f fVar);

    public abstract void n(@Nullable BtReginModle btReginModle);

    @NonNull
    public static BtReginActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return i(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
