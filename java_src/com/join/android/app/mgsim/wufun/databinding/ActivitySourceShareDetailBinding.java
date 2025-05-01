package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.quark.proxy.SourceShareClickProxy;
import com.join.kotlin.quark.viewmodel.SourceShareDetailViewModel;
/* loaded from: classes3.dex */
public abstract class ActivitySourceShareDetailBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f17061b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f17062c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RelativeLayout f17063d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f17064e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f17065f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f17066g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f17067h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f17068i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f17069j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f17070k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final WebView f17071l;
    @Bindable

    /* renamed from: m  reason: collision with root package name */
    protected SourceShareDetailViewModel f17072m;
    @Bindable

    /* renamed from: n  reason: collision with root package name */
    protected SourceShareClickProxy f17073n;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivitySourceShareDetailBinding(Object obj, View view, int i4, ImageView imageView, ConstraintLayout constraintLayout, RelativeLayout relativeLayout, SimpleDraweeView simpleDraweeView, SimpleDraweeView simpleDraweeView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, WebView webView) {
        super(obj, view, i4);
        this.f17061b = imageView;
        this.f17062c = constraintLayout;
        this.f17063d = relativeLayout;
        this.f17064e = simpleDraweeView;
        this.f17065f = simpleDraweeView2;
        this.f17066g = textView;
        this.f17067h = textView2;
        this.f17068i = textView3;
        this.f17069j = textView4;
        this.f17070k = textView5;
        this.f17071l = webView;
    }

    @Deprecated
    public static ActivitySourceShareDetailBinding b(@NonNull View view, @Nullable Object obj) {
        return (ActivitySourceShareDetailBinding) ViewDataBinding.bind(obj, view, R.layout.activity_source_share_detail);
    }

    public static ActivitySourceShareDetailBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivitySourceShareDetailBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ActivitySourceShareDetailBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_source_share_detail, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ActivitySourceShareDetailBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivitySourceShareDetailBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_source_share_detail, null, false, obj);
    }

    @NonNull
    public static ActivitySourceShareDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public SourceShareClickProxy c() {
        return this.f17073n;
    }

    @Nullable
    public SourceShareDetailViewModel d() {
        return this.f17072m;
    }

    public abstract void g(@Nullable SourceShareClickProxy sourceShareClickProxy);

    public abstract void h(@Nullable SourceShareDetailViewModel sourceShareDetailViewModel);

    @NonNull
    public static ActivitySourceShareDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
