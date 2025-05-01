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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
/* loaded from: classes3.dex */
public final class FragmentMyGameBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f19900b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f19901c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f19902d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f19903e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f19904f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f19905g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final XListView2 f19906h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f19907i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final FragmentMyGameItemUpdateBinding f19908j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f19909k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f19910l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f19911m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f19912n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final ConstraintLayout f19913o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final ImageView f19914p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final ImageView f19915q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final View f19916r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final TabLayout f19917s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f19918t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f19919u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final ViewPager2 f19920v;

    private FragmentMyGameBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull View view, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull XListView2 xListView2, @NonNull LinearLayout linearLayout, @NonNull FragmentMyGameItemUpdateBinding fragmentMyGameItemUpdateBinding, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull View view2, @NonNull TabLayout tabLayout, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull ViewPager2 viewPager2) {
        this.f19900b = constraintLayout;
        this.f19901c = constraintLayout2;
        this.f19902d = imageView;
        this.f19903e = view;
        this.f19904f = textView;
        this.f19905g = imageView2;
        this.f19906h = xListView2;
        this.f19907i = linearLayout;
        this.f19908j = fragmentMyGameItemUpdateBinding;
        this.f19909k = textView2;
        this.f19910l = textView3;
        this.f19911m = imageView3;
        this.f19912n = linearLayout2;
        this.f19913o = constraintLayout3;
        this.f19914p = imageView4;
        this.f19915q = imageView5;
        this.f19916r = view2;
        this.f19917s = tabLayout;
        this.f19918t = textView4;
        this.f19919u = textView5;
        this.f19920v = viewPager2;
    }

    @NonNull
    public static FragmentMyGameBinding bind(@NonNull View view) {
        int i4 = R.id.appbar;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.appbar);
        if (constraintLayout != null) {
            i4 = R.id.back;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back);
            if (imageView != null) {
                i4 = R.id.filter;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.filter);
                if (findChildViewById != null) {
                    i4 = R.id.filterArr;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.filterArr);
                    if (textView != null) {
                        i4 = R.id.ivOnlineCouponBottomClose;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ivOnlineCouponBottomClose);
                        if (imageView2 != null) {
                            i4 = R.id.listView;
                            XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.listView);
                            if (xListView2 != null) {
                                i4 = R.id.llOnlineCouponBottom;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llOnlineCouponBottom);
                                if (linearLayout != null) {
                                    i4 = R.id.needUpdate;
                                    View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.needUpdate);
                                    if (findChildViewById2 != null) {
                                        FragmentMyGameItemUpdateBinding bind = FragmentMyGameItemUpdateBinding.bind(findChildViewById2);
                                        i4 = R.id.plugProgress;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.plugProgress);
                                        if (textView2 != null) {
                                            i4 = R.id.plugType;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.plugType);
                                            if (textView3 != null) {
                                                i4 = R.id.plugs;
                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.plugs);
                                                if (imageView3 != null) {
                                                    i4 = R.id.plugsDownloadTip;
                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.plugsDownloadTip);
                                                    if (linearLayout2 != null) {
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                                                        i4 = R.id.search;
                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.search);
                                                        if (imageView4 != null) {
                                                            i4 = R.id.settings;
                                                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.settings);
                                                            if (imageView5 != null) {
                                                                i4 = R.id.statubar;
                                                                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.statubar);
                                                                if (findChildViewById3 != null) {
                                                                    i4 = R.id.tabs;
                                                                    TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tabs);
                                                                    if (tabLayout != null) {
                                                                        i4 = R.id.title;
                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                                                                        if (textView4 != null) {
                                                                            i4 = R.id.tvOnlineCouponBottomDesc;
                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvOnlineCouponBottomDesc);
                                                                            if (textView5 != null) {
                                                                                i4 = R.id.vp;
                                                                                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, R.id.vp);
                                                                                if (viewPager2 != null) {
                                                                                    return new FragmentMyGameBinding(constraintLayout2, constraintLayout, imageView, findChildViewById, textView, imageView2, xListView2, linearLayout, bind, textView2, textView3, imageView3, linearLayout2, constraintLayout2, imageView4, imageView5, findChildViewById3, tabLayout, textView4, textView5, viewPager2);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentMyGameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f19900b;
    }

    @NonNull
    public static FragmentMyGameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_my_game, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
