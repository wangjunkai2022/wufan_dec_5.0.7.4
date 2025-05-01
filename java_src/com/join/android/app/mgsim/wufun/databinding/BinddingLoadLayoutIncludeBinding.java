package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.domain.common.LoadBindClickProxy;
import com.join.kotlin.domain.common.LoadBindindData;
import com.join.mgps.customview.LoadingImageView;
/* loaded from: classes3.dex */
public abstract class BinddingLoadLayoutIncludeBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final TextView f17538b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f17539c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LoadingImageView f17540d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f17541e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f17542f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f17543g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f17544h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f17545i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f17546j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f17547k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final Button f17548l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f17549m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f17550n;
    @Bindable

    /* renamed from: o  reason: collision with root package name */
    protected LoadBindindData f17551o;
    @Bindable

    /* renamed from: p  reason: collision with root package name */
    protected LoadBindClickProxy f17552p;

    /* JADX INFO: Access modifiers changed from: protected */
    public BinddingLoadLayoutIncludeBinding(Object obj, View view, int i4, TextView textView, LinearLayout linearLayout, LoadingImageView loadingImageView, ImageView imageView, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView2, ImageView imageView2, ImageView imageView3, TextView textView3, Button button, TextView textView4, TextView textView5) {
        super(obj, view, i4);
        this.f17538b = textView;
        this.f17539c = linearLayout;
        this.f17540d = loadingImageView;
        this.f17541e = imageView;
        this.f17542f = linearLayout2;
        this.f17543g = linearLayout3;
        this.f17544h = textView2;
        this.f17545i = imageView2;
        this.f17546j = imageView3;
        this.f17547k = textView3;
        this.f17548l = button;
        this.f17549m = textView4;
        this.f17550n = textView5;
    }

    @Deprecated
    public static BinddingLoadLayoutIncludeBinding b(@NonNull View view, @Nullable Object obj) {
        return (BinddingLoadLayoutIncludeBinding) ViewDataBinding.bind(obj, view, R.layout.bindding_load_layout_include);
    }

    public static BinddingLoadLayoutIncludeBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static BinddingLoadLayoutIncludeBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (BinddingLoadLayoutIncludeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.bindding_load_layout_include, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static BinddingLoadLayoutIncludeBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (BinddingLoadLayoutIncludeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.bindding_load_layout_include, null, false, obj);
    }

    @NonNull
    public static BinddingLoadLayoutIncludeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public LoadBindindData c() {
        return this.f17551o;
    }

    @Nullable
    public LoadBindClickProxy d() {
        return this.f17552p;
    }

    public abstract void g(@Nullable LoadBindindData loadBindindData);

    public abstract void h(@Nullable LoadBindClickProxy loadBindClickProxy);

    @NonNull
    public static BinddingLoadLayoutIncludeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
