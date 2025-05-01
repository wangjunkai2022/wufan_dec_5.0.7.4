package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.BannerBean;
/* loaded from: classes3.dex */
public abstract class DatabindingHtaglistItemBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final SimpleDraweeView f18330b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f18331c;
    @Bindable

    /* renamed from: d  reason: collision with root package name */
    protected BannerBean f18332d;

    /* JADX INFO: Access modifiers changed from: protected */
    public DatabindingHtaglistItemBinding(Object obj, View view, int i4, SimpleDraweeView simpleDraweeView, LinearLayout linearLayout) {
        super(obj, view, i4);
        this.f18330b = simpleDraweeView;
        this.f18331c = linearLayout;
    }

    @Deprecated
    public static DatabindingHtaglistItemBinding b(@NonNull View view, @Nullable Object obj) {
        return (DatabindingHtaglistItemBinding) ViewDataBinding.bind(obj, view, R.layout.databinding_htaglist_item);
    }

    public static DatabindingHtaglistItemBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static DatabindingHtaglistItemBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (DatabindingHtaglistItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.databinding_htaglist_item, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static DatabindingHtaglistItemBinding e(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (DatabindingHtaglistItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.databinding_htaglist_item, null, false, obj);
    }

    @NonNull
    public static DatabindingHtaglistItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return d(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public BannerBean c() {
        return this.f18332d;
    }

    public abstract void f(@Nullable BannerBean bannerBean);

    @NonNull
    public static DatabindingHtaglistItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
