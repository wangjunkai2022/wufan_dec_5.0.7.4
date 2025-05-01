package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.domain.common.LoadBindClickProxy;
import com.join.kotlin.ui.cloudarchive.VASingleGameViewModle;
/* loaded from: classes3.dex */
public abstract class ActivityVasingleGameIndexBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final ConstraintLayout f17230b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f17231c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f17232d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f17233e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f17234f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f17235g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f17236h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f17237i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final SimpleDraweeView f17238j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final SimpleDraweeView f17239k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TabLayout f17240l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f17241m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f17242n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f17243o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f17244p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f17245q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f17246r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final TextView f17247s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f17248t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f17249u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final ViewPager f17250v;
    @Bindable

    /* renamed from: w  reason: collision with root package name */
    protected LoadBindClickProxy f17251w;
    @Bindable

    /* renamed from: x  reason: collision with root package name */
    protected VASingleGameViewModle f17252x;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityVasingleGameIndexBinding(Object obj, View view, int i4, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, SimpleDraweeView simpleDraweeView, SimpleDraweeView simpleDraweeView2, TabLayout tabLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, ViewPager viewPager) {
        super(obj, view, i4);
        this.f17230b = constraintLayout;
        this.f17231c = imageView;
        this.f17232d = imageView2;
        this.f17233e = imageView3;
        this.f17234f = linearLayout;
        this.f17235g = linearLayout2;
        this.f17236h = linearLayout3;
        this.f17237i = linearLayout4;
        this.f17238j = simpleDraweeView;
        this.f17239k = simpleDraweeView2;
        this.f17240l = tabLayout;
        this.f17241m = textView;
        this.f17242n = textView2;
        this.f17243o = textView3;
        this.f17244p = textView4;
        this.f17245q = textView5;
        this.f17246r = textView6;
        this.f17247s = textView7;
        this.f17248t = textView8;
        this.f17249u = textView9;
        this.f17250v = viewPager;
    }

    @Deprecated
    public static ActivityVasingleGameIndexBinding b(@NonNull View view, @Nullable Object obj) {
        return (ActivityVasingleGameIndexBinding) ViewDataBinding.bind(obj, view, R.layout.activity_vasingle_game_index);
    }

    public static ActivityVasingleGameIndexBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityVasingleGameIndexBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ActivityVasingleGameIndexBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_vasingle_game_index, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ActivityVasingleGameIndexBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityVasingleGameIndexBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_vasingle_game_index, null, false, obj);
    }

    @NonNull
    public static ActivityVasingleGameIndexBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public LoadBindClickProxy c() {
        return this.f17251w;
    }

    @Nullable
    public VASingleGameViewModle d() {
        return this.f17252x;
    }

    public abstract void g(@Nullable LoadBindClickProxy loadBindClickProxy);

    public abstract void h(@Nullable VASingleGameViewModle vASingleGameViewModle);

    @NonNull
    public static ActivityVasingleGameIndexBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
