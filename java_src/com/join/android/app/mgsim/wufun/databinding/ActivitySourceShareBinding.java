package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.quark.proxy.SourceShareClickProxy;
import com.join.kotlin.quark.viewmodel.SourceShareViewModel;
import com.youth.banner.Banner;
/* loaded from: classes3.dex */
public abstract class ActivitySourceShareBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final AppBarLayout f17035b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f17036c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Banner f17037d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final CollapsingToolbarLayout f17038e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f17039f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f17040g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f17041h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final RelativeLayout f17042i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final CoordinatorLayout f17043j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ImageView f17044k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final EditText f17045l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TabLayout f17046m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f17047n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f17048o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final ViewPager f17049p;
    @Bindable

    /* renamed from: q  reason: collision with root package name */
    protected SourceShareViewModel f17050q;
    @Bindable

    /* renamed from: r  reason: collision with root package name */
    protected SourceShareClickProxy f17051r;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivitySourceShareBinding(Object obj, View view, int i4, AppBarLayout appBarLayout, ImageView imageView, Banner banner, CollapsingToolbarLayout collapsingToolbarLayout, View view2, ImageView imageView2, ImageView imageView3, RelativeLayout relativeLayout, CoordinatorLayout coordinatorLayout, ImageView imageView4, EditText editText, TabLayout tabLayout, TextView textView, TextView textView2, ViewPager viewPager) {
        super(obj, view, i4);
        this.f17035b = appBarLayout;
        this.f17036c = imageView;
        this.f17037d = banner;
        this.f17038e = collapsingToolbarLayout;
        this.f17039f = view2;
        this.f17040g = imageView2;
        this.f17041h = imageView3;
        this.f17042i = relativeLayout;
        this.f17043j = coordinatorLayout;
        this.f17044k = imageView4;
        this.f17045l = editText;
        this.f17046m = tabLayout;
        this.f17047n = textView;
        this.f17048o = textView2;
        this.f17049p = viewPager;
    }

    @Deprecated
    public static ActivitySourceShareBinding b(@NonNull View view, @Nullable Object obj) {
        return (ActivitySourceShareBinding) ViewDataBinding.bind(obj, view, R.layout.activity_source_share);
    }

    public static ActivitySourceShareBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivitySourceShareBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ActivitySourceShareBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_source_share, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ActivitySourceShareBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivitySourceShareBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_source_share, null, false, obj);
    }

    @NonNull
    public static ActivitySourceShareBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public SourceShareClickProxy c() {
        return this.f17051r;
    }

    @Nullable
    public SourceShareViewModel d() {
        return this.f17050q;
    }

    public abstract void g(@Nullable SourceShareClickProxy sourceShareClickProxy);

    public abstract void h(@Nullable SourceShareViewModel sourceShareViewModel);

    @NonNull
    public static ActivitySourceShareBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
