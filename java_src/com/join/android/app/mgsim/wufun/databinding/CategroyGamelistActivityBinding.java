package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.SlidingTabLayout6;
/* loaded from: classes3.dex */
public final class CategroyGamelistActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f17685b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SlidingTabLayout6 f17686c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f17687d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f17688e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f17689f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f17690g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f17691h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f17692i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f17693j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f17694k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f17695l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final RecyclerView f17696m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f17697n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TopbarTitleCenterLayoutBinding f17698o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final LinearLayout f17699p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final RecyclerView f17700q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final ViewPager f17701r;

    private CategroyGamelistActivityBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SlidingTabLayout6 slidingTabLayout6, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull View view, @NonNull TextView textView4, @NonNull LinearLayout linearLayout, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull RecyclerView recyclerView, @NonNull TextView textView8, @NonNull TopbarTitleCenterLayoutBinding topbarTitleCenterLayoutBinding, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView2, @NonNull ViewPager viewPager) {
        this.f17685b = constraintLayout;
        this.f17686c = slidingTabLayout6;
        this.f17687d = textView;
        this.f17688e = textView2;
        this.f17689f = textView3;
        this.f17690g = view;
        this.f17691h = textView4;
        this.f17692i = linearLayout;
        this.f17693j = textView5;
        this.f17694k = textView6;
        this.f17695l = textView7;
        this.f17696m = recyclerView;
        this.f17697n = textView8;
        this.f17698o = topbarTitleCenterLayoutBinding;
        this.f17699p = linearLayout2;
        this.f17700q = recyclerView2;
        this.f17701r = viewPager;
    }

    @NonNull
    public static CategroyGamelistActivityBinding bind(@NonNull View view) {
        int i4 = R.id.featureLayout;
        SlidingTabLayout6 slidingTabLayout6 = (SlidingTabLayout6) ViewBindings.findChildViewById(view, R.id.featureLayout);
        if (slidingTabLayout6 != null) {
            i4 = R.id.featureTypeText;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.featureTypeText);
            if (textView != null) {
                i4 = R.id.filter;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.filter);
                if (textView2 != null) {
                    i4 = R.id.gameTypeText;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.gameTypeText);
                    if (textView3 != null) {
                        i4 = R.id.line;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
                        if (findChildViewById != null) {
                            i4 = R.id.modelTypeText;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.modelTypeText);
                            if (textView4 != null) {
                                i4 = R.id.moretag;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.moretag);
                                if (linearLayout != null) {
                                    i4 = R.id.okButn;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.okButn);
                                    if (textView5 != null) {
                                        i4 = R.id.playTypeText;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.playTypeText);
                                        if (textView6 != null) {
                                            i4 = R.id.resetButn;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.resetButn);
                                            if (textView7 != null) {
                                                i4 = R.id.tabRecyclerview;
                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.tabRecyclerview);
                                                if (recyclerView != null) {
                                                    i4 = R.id.themeTypeText;
                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.themeTypeText);
                                                    if (textView8 != null) {
                                                        i4 = R.id.titleLayout;
                                                        View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.titleLayout);
                                                        if (findChildViewById2 != null) {
                                                            TopbarTitleCenterLayoutBinding bind = TopbarTitleCenterLayoutBinding.bind(findChildViewById2);
                                                            i4 = R.id.typeMainLayout;
                                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.typeMainLayout);
                                                            if (linearLayout2 != null) {
                                                                i4 = R.id.typeRecyclerview;
                                                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.typeRecyclerview);
                                                                if (recyclerView2 != null) {
                                                                    i4 = R.id.viewPager;
                                                                    ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.viewPager);
                                                                    if (viewPager != null) {
                                                                        return new CategroyGamelistActivityBinding((ConstraintLayout) view, slidingTabLayout6, textView, textView2, textView3, findChildViewById, textView4, linearLayout, textView5, textView6, textView7, recyclerView, textView8, bind, linearLayout2, recyclerView2, viewPager);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static CategroyGamelistActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f17685b;
    }

    @NonNull
    public static CategroyGamelistActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.categroy_gamelist_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
