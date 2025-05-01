package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.MainLabelHeaderView;
import com.join.mgps.customview.SlidingTabLayout6;
import ru.noties.scrollable.ScrollableLayout;
/* loaded from: classes3.dex */
public final class ActivityMainLabelBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f16559b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f16560c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f16561d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f16562e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f16563f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f16564g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final View f16565h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f16566i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final RelativeLayout f16567j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final MainLabelHeaderView f16568k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final RelativeLayout f16569l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final RelativeLayout f16570m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final RelativeLayout f16571n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final ScrollableLayout f16572o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final SlidingTabLayout6 f16573p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f16574q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f16575r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final TextView f16576s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f16577t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final ViewPager f16578u;

    private ActivityMainLabelBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull Button button, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView2, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull MainLabelHeaderView mainLabelHeaderView, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull RelativeLayout relativeLayout5, @NonNull ScrollableLayout scrollableLayout, @NonNull SlidingTabLayout6 slidingTabLayout6, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull ViewPager viewPager) {
        this.f16559b = relativeLayout;
        this.f16560c = imageView;
        this.f16561d = textView;
        this.f16562e = button;
        this.f16563f = simpleDraweeView;
        this.f16564g = imageView2;
        this.f16565h = view;
        this.f16566i = linearLayout;
        this.f16567j = relativeLayout2;
        this.f16568k = mainLabelHeaderView;
        this.f16569l = relativeLayout3;
        this.f16570m = relativeLayout4;
        this.f16571n = relativeLayout5;
        this.f16572o = scrollableLayout;
        this.f16573p = slidingTabLayout6;
        this.f16574q = textView2;
        this.f16575r = textView3;
        this.f16576s = textView4;
        this.f16577t = textView5;
        this.f16578u = viewPager;
    }

    @NonNull
    public static ActivityMainLabelBinding bind(@NonNull View view) {
        int i4 = R.id.back_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back_image);
        if (imageView != null) {
            i4 = R.id.btnFocus;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.btnFocus);
            if (textView != null) {
                i4 = R.id.btnSendPosts;
                Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnSendPosts);
                if (button != null) {
                    i4 = R.id.iv_label_administrator_avatar;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.iv_label_administrator_avatar);
                    if (simpleDraweeView != null) {
                        i4 = R.id.iv_order;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_order);
                        if (imageView2 != null) {
                            i4 = R.id.line;
                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
                            if (findChildViewById != null) {
                                i4 = R.id.ll_label_property;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_label_property);
                                if (linearLayout != null) {
                                    i4 = R.id.ll_multi_type_posts;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.ll_multi_type_posts);
                                    if (relativeLayout != null) {
                                        i4 = R.id.mScrollableHeader;
                                        MainLabelHeaderView mainLabelHeaderView = (MainLabelHeaderView) ViewBindings.findChildViewById(view, R.id.mScrollableHeader);
                                        if (mainLabelHeaderView != null) {
                                            i4 = R.id.rl_main;
                                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_main);
                                            if (relativeLayout2 != null) {
                                                i4 = R.id.rlOrderBy;
                                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rlOrderBy);
                                                if (relativeLayout3 != null) {
                                                    i4 = R.id.rl_title;
                                                    RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_title);
                                                    if (relativeLayout4 != null) {
                                                        i4 = R.id.scrollableLayout;
                                                        ScrollableLayout scrollableLayout = (ScrollableLayout) ViewBindings.findChildViewById(view, R.id.scrollableLayout);
                                                        if (scrollableLayout != null) {
                                                            i4 = R.id.tabsLayout;
                                                            SlidingTabLayout6 slidingTabLayout6 = (SlidingTabLayout6) ViewBindings.findChildViewById(view, R.id.tabsLayout);
                                                            if (slidingTabLayout6 != null) {
                                                                i4 = R.id.tv_alreadyJoin;
                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_alreadyJoin);
                                                                if (textView2 != null) {
                                                                    i4 = R.id.tv_label_administrator_nickname;
                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_label_administrator_nickname);
                                                                    if (textView3 != null) {
                                                                        i4 = R.id.tv_label_name_head;
                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_label_name_head);
                                                                        if (textView4 != null) {
                                                                            i4 = R.id.tv_posts_counts;
                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_posts_counts);
                                                                            if (textView5 != null) {
                                                                                i4 = R.id.viewPager;
                                                                                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.viewPager);
                                                                                if (viewPager != null) {
                                                                                    return new ActivityMainLabelBinding((RelativeLayout) view, imageView, textView, button, simpleDraweeView, imageView2, findChildViewById, linearLayout, relativeLayout, mainLabelHeaderView, relativeLayout2, relativeLayout3, relativeLayout4, scrollableLayout, slidingTabLayout6, textView2, textView3, textView4, textView5, viewPager);
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
    public static ActivityMainLabelBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f16559b;
    }

    @NonNull
    public static ActivityMainLabelBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_main_label, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
