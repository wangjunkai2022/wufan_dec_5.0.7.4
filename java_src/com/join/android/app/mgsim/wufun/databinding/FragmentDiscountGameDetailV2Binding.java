package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import com.join.kotlin.discount.proxy.GameDetailFragmentClickProxy;
import com.join.kotlin.discount.viewmodel.GameDetailFragmentViewModel;
import com.join.mgps.customview.MarqueeTextView;
import com.join.mgps.customview.NestedScrollableHost;
/* loaded from: classes3.dex */
public abstract class FragmentDiscountGameDetailV2Binding extends ViewDataBinding {
    @NonNull
    public final RecyclerView A;
    @NonNull
    public final RecyclerView B;
    @NonNull
    public final RecyclerView C;
    @NonNull
    public final XQuickRecyclerView D;
    @NonNull
    public final TextView E;
    @NonNull
    public final ImageView F;
    @NonNull
    public final TextView G;
    @NonNull
    public final SimpleDraweeView H;
    @NonNull
    public final TextView I;
    @NonNull
    public final TextView J;
    @NonNull
    public final TextView K;
    @NonNull
    public final View L;
    @Bindable
    protected GameDetailFragmentViewModel M;
    @Bindable
    protected GameDetailFragmentClickProxy N;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView f19694b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final NestedScrollableHost f19695c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f19696d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f19697e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final FrameLayout f19698f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final FrameLayout f19699g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ConstraintLayout f19700h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ConstraintLayout f19701i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ConstraintLayout f19702j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ConstraintLayout f19703k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f19704l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final View f19705m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f19706n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final FrameLayout f19707o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f19708p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final SimpleDraweeView f19709q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f19710r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final MarqueeTextView f19711s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f19712t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final View f19713u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final View f19714v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final LinearLayout f19715w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    public final LinearLayout f19716x;
    @NonNull

    /* renamed from: y  reason: collision with root package name */
    public final NestedScrollView f19717y;
    @NonNull

    /* renamed from: z  reason: collision with root package name */
    public final TextView f19718z;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentDiscountGameDetailV2Binding(Object obj, View view, int i4, RecyclerView recyclerView, NestedScrollableHost nestedScrollableHost, ImageView imageView, View view2, FrameLayout frameLayout, FrameLayout frameLayout2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, TextView textView, View view3, LinearLayout linearLayout, FrameLayout frameLayout3, TextView textView2, SimpleDraweeView simpleDraweeView, TextView textView3, MarqueeTextView marqueeTextView, TextView textView4, View view4, View view5, LinearLayout linearLayout2, LinearLayout linearLayout3, NestedScrollView nestedScrollView, TextView textView5, RecyclerView recyclerView2, RecyclerView recyclerView3, RecyclerView recyclerView4, XQuickRecyclerView xQuickRecyclerView, TextView textView6, ImageView imageView2, TextView textView7, SimpleDraweeView simpleDraweeView2, TextView textView8, TextView textView9, TextView textView10, View view6) {
        super(obj, view, i4);
        this.f19694b = recyclerView;
        this.f19695c = nestedScrollableHost;
        this.f19696d = imageView;
        this.f19697e = view2;
        this.f19698f = frameLayout;
        this.f19699g = frameLayout2;
        this.f19700h = constraintLayout;
        this.f19701i = constraintLayout2;
        this.f19702j = constraintLayout3;
        this.f19703k = constraintLayout4;
        this.f19704l = textView;
        this.f19705m = view3;
        this.f19706n = linearLayout;
        this.f19707o = frameLayout3;
        this.f19708p = textView2;
        this.f19709q = simpleDraweeView;
        this.f19710r = textView3;
        this.f19711s = marqueeTextView;
        this.f19712t = textView4;
        this.f19713u = view4;
        this.f19714v = view5;
        this.f19715w = linearLayout2;
        this.f19716x = linearLayout3;
        this.f19717y = nestedScrollView;
        this.f19718z = textView5;
        this.A = recyclerView2;
        this.B = recyclerView3;
        this.C = recyclerView4;
        this.D = xQuickRecyclerView;
        this.E = textView6;
        this.F = imageView2;
        this.G = textView7;
        this.H = simpleDraweeView2;
        this.I = textView8;
        this.J = textView9;
        this.K = textView10;
        this.L = view6;
    }

    @Deprecated
    public static FragmentDiscountGameDetailV2Binding b(@NonNull View view, @Nullable Object obj) {
        return (FragmentDiscountGameDetailV2Binding) ViewDataBinding.bind(obj, view, R.layout.fragment_discount_game_detail_v2);
    }

    public static FragmentDiscountGameDetailV2Binding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentDiscountGameDetailV2Binding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (FragmentDiscountGameDetailV2Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_discount_game_detail_v2, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static FragmentDiscountGameDetailV2Binding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentDiscountGameDetailV2Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_discount_game_detail_v2, null, false, obj);
    }

    @NonNull
    public static FragmentDiscountGameDetailV2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public GameDetailFragmentClickProxy c() {
        return this.N;
    }

    @Nullable
    public GameDetailFragmentViewModel d() {
        return this.M;
    }

    public abstract void g(@Nullable GameDetailFragmentClickProxy gameDetailFragmentClickProxy);

    public abstract void h(@Nullable GameDetailFragmentViewModel gameDetailFragmentViewModel);

    @NonNull
    public static FragmentDiscountGameDetailV2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
