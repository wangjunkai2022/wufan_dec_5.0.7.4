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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.quark.model.bean.SourceListItemBean;
import com.join.kotlin.quark.proxy.SourceHopeItemClickProxy;
/* loaded from: classes3.dex */
public abstract class ItemQuarkSourceHopeBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final SimpleDraweeView f22568b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f22569c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f22570d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f22571e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f22572f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f22573g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f22574h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f22575i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final View f22576j;
    @Bindable

    /* renamed from: k  reason: collision with root package name */
    protected SourceListItemBean f22577k;
    @Bindable

    /* renamed from: l  reason: collision with root package name */
    protected SourceHopeItemClickProxy f22578l;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemQuarkSourceHopeBinding(Object obj, View view, int i4, SimpleDraweeView simpleDraweeView, TextView textView, TextView textView2, ImageView imageView, TextView textView3, TextView textView4, TextView textView5, TextView textView6, View view2) {
        super(obj, view, i4);
        this.f22568b = simpleDraweeView;
        this.f22569c = textView;
        this.f22570d = textView2;
        this.f22571e = imageView;
        this.f22572f = textView3;
        this.f22573g = textView4;
        this.f22574h = textView5;
        this.f22575i = textView6;
        this.f22576j = view2;
    }

    @Deprecated
    public static ItemQuarkSourceHopeBinding b(@NonNull View view, @Nullable Object obj) {
        return (ItemQuarkSourceHopeBinding) ViewDataBinding.bind(obj, view, R.layout.item_quark_source_hope);
    }

    public static ItemQuarkSourceHopeBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemQuarkSourceHopeBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ItemQuarkSourceHopeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_quark_source_hope, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ItemQuarkSourceHopeBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemQuarkSourceHopeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_quark_source_hope, null, false, obj);
    }

    @NonNull
    public static ItemQuarkSourceHopeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public SourceHopeItemClickProxy c() {
        return this.f22578l;
    }

    @Nullable
    public SourceListItemBean d() {
        return this.f22577k;
    }

    public abstract void g(@Nullable SourceHopeItemClickProxy sourceHopeItemClickProxy);

    public abstract void h(@Nullable SourceListItemBean sourceListItemBean);

    @NonNull
    public static ItemQuarkSourceHopeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
