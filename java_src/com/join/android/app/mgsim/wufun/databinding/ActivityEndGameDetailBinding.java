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
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.flyco.tablayout.SlidingTabLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityEndGameDetailBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f16032b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final AppBarLayout f16033c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f16034d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ConstraintLayout f16035e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ConstraintLayout f16036f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ConstraintLayout f16037g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final CollapsingToolbarLayout f16038h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final CoordinatorLayout f16039i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final SimpleDraweeView f16040j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ImageView f16041k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final SimpleDraweeView f16042l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f16043m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ImageView f16044n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final LinearLayout f16045o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final LinearLayout f16046p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final SlidingTabLayout f16047q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final ImageView f16048r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final TextView f16049s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f16050t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f16051u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final TextView f16052v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final TextView f16053w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    public final TextView f16054x;
    @NonNull

    /* renamed from: y  reason: collision with root package name */
    public final ViewPager f16055y;

    private ActivityEndGameDetailBinding(@NonNull FrameLayout frameLayout, @NonNull AppBarLayout appBarLayout, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull CollapsingToolbarLayout collapsingToolbarLayout, @NonNull CoordinatorLayout coordinatorLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull SlidingTabLayout slidingTabLayout, @NonNull ImageView imageView4, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull ViewPager viewPager) {
        this.f16032b = frameLayout;
        this.f16033c = appBarLayout;
        this.f16034d = textView;
        this.f16035e = constraintLayout;
        this.f16036f = constraintLayout2;
        this.f16037g = constraintLayout3;
        this.f16038h = collapsingToolbarLayout;
        this.f16039i = coordinatorLayout;
        this.f16040j = simpleDraweeView;
        this.f16041k = imageView;
        this.f16042l = simpleDraweeView2;
        this.f16043m = imageView2;
        this.f16044n = imageView3;
        this.f16045o = linearLayout;
        this.f16046p = linearLayout2;
        this.f16047q = slidingTabLayout;
        this.f16048r = imageView4;
        this.f16049s = textView2;
        this.f16050t = textView3;
        this.f16051u = textView4;
        this.f16052v = textView5;
        this.f16053w = textView6;
        this.f16054x = textView7;
        this.f16055y = viewPager;
    }

    @NonNull
    public static ActivityEndGameDetailBinding bind(@NonNull View view) {
        int i4 = R.id.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, R.id.appbar);
        if (appBarLayout != null) {
            i4 = R.id.btnStart;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.btnStart);
            if (textView != null) {
                i4 = R.id.clAuthor;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.clAuthor);
                if (constraintLayout != null) {
                    i4 = R.id.clBottom;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.clBottom);
                    if (constraintLayout2 != null) {
                        i4 = R.id.clShare;
                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.clShare);
                        if (constraintLayout3 != null) {
                            i4 = R.id.collapsingToolbarLayout;
                            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) ViewBindings.findChildViewById(view, R.id.collapsingToolbarLayout);
                            if (collapsingToolbarLayout != null) {
                                i4 = R.id.coordinatorLayout;
                                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, R.id.coordinatorLayout);
                                if (coordinatorLayout != null) {
                                    i4 = R.id.ivAuthorAvatar;
                                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ivAuthorAvatar);
                                    if (simpleDraweeView != null) {
                                        i4 = R.id.ivBack;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivBack);
                                        if (imageView != null) {
                                            i4 = R.id.ivGameIcon;
                                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ivGameIcon);
                                            if (simpleDraweeView2 != null) {
                                                i4 = R.id.ivMenu;
                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ivMenu);
                                                if (imageView2 != null) {
                                                    i4 = R.id.ivShare;
                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.ivShare);
                                                    if (imageView3 != null) {
                                                        i4 = R.id.llShare;
                                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llShare);
                                                        if (linearLayout != null) {
                                                            i4 = R.id.llTop;
                                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llTop);
                                                            if (linearLayout2 != null) {
                                                                i4 = R.id.tablayout;
                                                                SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, R.id.tablayout);
                                                                if (slidingTabLayout != null) {
                                                                    i4 = R.id.tagPass;
                                                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.tagPass);
                                                                    if (imageView4 != null) {
                                                                        i4 = R.id.tvAuthorName;
                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvAuthorName);
                                                                        if (textView2 != null) {
                                                                            i4 = R.id.tvBestScore;
                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBestScore);
                                                                            if (textView3 != null) {
                                                                                i4 = R.id.tvIntro;
                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvIntro);
                                                                                if (textView4 != null) {
                                                                                    i4 = R.id.tvPassRate;
                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPassRate);
                                                                                    if (textView5 != null) {
                                                                                        i4 = R.id.tvTitle;
                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitle);
                                                                                        if (textView6 != null) {
                                                                                            i4 = R.id.tvTopTitle;
                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTopTitle);
                                                                                            if (textView7 != null) {
                                                                                                i4 = R.id.viewpager;
                                                                                                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.viewpager);
                                                                                                if (viewPager != null) {
                                                                                                    return new ActivityEndGameDetailBinding((FrameLayout) view, appBarLayout, textView, constraintLayout, constraintLayout2, constraintLayout3, collapsingToolbarLayout, coordinatorLayout, simpleDraweeView, imageView, simpleDraweeView2, imageView2, imageView3, linearLayout, linearLayout2, slidingTabLayout, imageView4, textView2, textView3, textView4, textView5, textView6, textView7, viewPager);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityEndGameDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f16032b;
    }

    @NonNull
    public static ActivityEndGameDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_end_game_detail, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
