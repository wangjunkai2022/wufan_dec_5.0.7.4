package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.LoadingImageView;
import com.join.mgps.customview.LoadingLayout;
import com.join.mgps.customview.SlidingTabLayoutNoViewPager;
import com.join.mgps.customview.swiperefresh.SwipeRefresh;
/* loaded from: classes3.dex */
public final class ActivityClassifyGameBinding implements ViewBinding {
    @NonNull
    public final SlidingTabLayoutNoViewPager A;
    @NonNull
    public final TextView B;
    @NonNull
    public final TextView C;
    @NonNull
    public final Toolbar D;
    @NonNull
    public final ImageView E;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f15727b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f15728c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final AppBarLayout f15729d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final CollapsingToolbarLayout f15730e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f15731f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f15732g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f15733h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LoadingImageView f15734i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f15735j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f15736k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f15737l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final LoadingLayout f15738m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final FrameLayout f15739n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final CoordinatorLayout f15740o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final LinearLayout f15741p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f15742q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final ImageView f15743r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final SwipeRefresh f15744s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final ImageView f15745t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f15746u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final TextView f15747v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final Button f15748w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    public final TextView f15749x;
    @NonNull

    /* renamed from: y  reason: collision with root package name */
    public final SlidingTabLayoutNoViewPager f15750y;
    @NonNull

    /* renamed from: z  reason: collision with root package name */
    public final SlidingTabLayoutNoViewPager f15751z;

    private ActivityClassifyGameBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull AppBarLayout appBarLayout, @NonNull CollapsingToolbarLayout collapsingToolbarLayout, @NonNull TextView textView, @NonNull View view, @NonNull LinearLayout linearLayout2, @NonNull LoadingImageView loadingImageView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LoadingLayout loadingLayout, @NonNull FrameLayout frameLayout, @NonNull CoordinatorLayout coordinatorLayout, @NonNull LinearLayout linearLayout5, @NonNull TextView textView2, @NonNull ImageView imageView2, @NonNull SwipeRefresh swipeRefresh, @NonNull ImageView imageView3, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull Button button, @NonNull TextView textView5, @NonNull SlidingTabLayoutNoViewPager slidingTabLayoutNoViewPager, @NonNull SlidingTabLayoutNoViewPager slidingTabLayoutNoViewPager2, @NonNull SlidingTabLayoutNoViewPager slidingTabLayoutNoViewPager3, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull Toolbar toolbar, @NonNull ImageView imageView4) {
        this.f15727b = relativeLayout;
        this.f15728c = linearLayout;
        this.f15729d = appBarLayout;
        this.f15730e = collapsingToolbarLayout;
        this.f15731f = textView;
        this.f15732g = view;
        this.f15733h = linearLayout2;
        this.f15734i = loadingImageView;
        this.f15735j = imageView;
        this.f15736k = linearLayout3;
        this.f15737l = linearLayout4;
        this.f15738m = loadingLayout;
        this.f15739n = frameLayout;
        this.f15740o = coordinatorLayout;
        this.f15741p = linearLayout5;
        this.f15742q = textView2;
        this.f15743r = imageView2;
        this.f15744s = swipeRefresh;
        this.f15745t = imageView3;
        this.f15746u = textView3;
        this.f15747v = textView4;
        this.f15748w = button;
        this.f15749x = textView5;
        this.f15750y = slidingTabLayoutNoViewPager;
        this.f15751z = slidingTabLayoutNoViewPager2;
        this.A = slidingTabLayoutNoViewPager3;
        this.B = textView6;
        this.C = textView7;
        this.D = toolbar;
        this.E = imageView4;
    }

    @NonNull
    public static ActivityClassifyGameBinding bind(@NonNull View view) {
        int i4 = R.id.activity_classify_game;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.activity_classify_game);
        if (linearLayout != null) {
            i4 = R.id.appbar;
            AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, R.id.appbar);
            if (appBarLayout != null) {
                i4 = R.id.colltoobar;
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) ViewBindings.findChildViewById(view, R.id.colltoobar);
                if (collapsingToolbarLayout != null) {
                    i4 = R.id.failedMessage;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.failedMessage);
                    if (textView != null) {
                        i4 = R.id.line;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
                        if (findChildViewById != null) {
                            i4 = R.id.loading_none;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.loading_none);
                            if (linearLayout2 != null) {
                                i4 = R.id.loading_view;
                                LoadingImageView loadingImageView = (LoadingImageView) ViewBindings.findChildViewById(view, R.id.loading_view);
                                if (loadingImageView != null) {
                                    i4 = R.id.lodingBackImage;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.lodingBackImage);
                                    if (imageView != null) {
                                        i4 = R.id.loding_faile;
                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.loding_faile);
                                        if (linearLayout3 != null) {
                                            i4 = R.id.loding_layout;
                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.loding_layout);
                                            if (linearLayout4 != null) {
                                                i4 = R.id.mLoadingLayout;
                                                LoadingLayout loadingLayout = (LoadingLayout) ViewBindings.findChildViewById(view, R.id.mLoadingLayout);
                                                if (loadingLayout != null) {
                                                    i4 = R.id.mViewpagerV4;
                                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.mViewpagerV4);
                                                    if (frameLayout != null) {
                                                        i4 = R.id.main_content;
                                                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, R.id.main_content);
                                                        if (coordinatorLayout != null) {
                                                            i4 = R.id.nodata_layout;
                                                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.nodata_layout);
                                                            if (linearLayout5 != null) {
                                                                i4 = R.id.noneMessage;
                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.noneMessage);
                                                                if (textView2 != null) {
                                                                    i4 = R.id.noneReloadImage;
                                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.noneReloadImage);
                                                                    if (imageView2 != null) {
                                                                        i4 = R.id.refreshx;
                                                                        SwipeRefresh swipeRefresh = (SwipeRefresh) ViewBindings.findChildViewById(view, R.id.refreshx);
                                                                        if (swipeRefresh != null) {
                                                                            i4 = R.id.relodingimag;
                                                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.relodingimag);
                                                                            if (imageView3 != null) {
                                                                                i4 = R.id.selectedType;
                                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.selectedType);
                                                                                if (textView3 != null) {
                                                                                    i4 = R.id.setAll;
                                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.setAll);
                                                                                    if (textView4 != null) {
                                                                                        i4 = R.id.setNetwork;
                                                                                        Button button = (Button) ViewBindings.findChildViewById(view, R.id.setNetwork);
                                                                                        if (button != null) {
                                                                                            i4 = R.id.setting;
                                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.setting);
                                                                                            if (textView5 != null) {
                                                                                                i4 = R.id.table1;
                                                                                                SlidingTabLayoutNoViewPager slidingTabLayoutNoViewPager = (SlidingTabLayoutNoViewPager) ViewBindings.findChildViewById(view, R.id.table1);
                                                                                                if (slidingTabLayoutNoViewPager != null) {
                                                                                                    i4 = R.id.table2;
                                                                                                    SlidingTabLayoutNoViewPager slidingTabLayoutNoViewPager2 = (SlidingTabLayoutNoViewPager) ViewBindings.findChildViewById(view, R.id.table2);
                                                                                                    if (slidingTabLayoutNoViewPager2 != null) {
                                                                                                        i4 = R.id.table3;
                                                                                                        SlidingTabLayoutNoViewPager slidingTabLayoutNoViewPager3 = (SlidingTabLayoutNoViewPager) ViewBindings.findChildViewById(view, R.id.table3);
                                                                                                        if (slidingTabLayoutNoViewPager3 != null) {
                                                                                                            i4 = R.id.textView2;
                                                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.textView2);
                                                                                                            if (textView6 != null) {
                                                                                                                i4 = R.id.textView_nodata;
                                                                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.textView_nodata);
                                                                                                                if (textView7 != null) {
                                                                                                                    i4 = R.id.toolbar;
                                                                                                                    Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar);
                                                                                                                    if (toolbar != null) {
                                                                                                                        i4 = R.id.topImag;
                                                                                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.topImag);
                                                                                                                        if (imageView4 != null) {
                                                                                                                            return new ActivityClassifyGameBinding((RelativeLayout) view, linearLayout, appBarLayout, collapsingToolbarLayout, textView, findChildViewById, linearLayout2, loadingImageView, imageView, linearLayout3, linearLayout4, loadingLayout, frameLayout, coordinatorLayout, linearLayout5, textView2, imageView2, swipeRefresh, imageView3, textView3, textView4, button, textView5, slidingTabLayoutNoViewPager, slidingTabLayoutNoViewPager2, slidingTabLayoutNoViewPager3, textView6, textView7, toolbar, imageView4);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityClassifyGameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f15727b;
    }

    @NonNull
    public static ActivityClassifyGameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_classify_game, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
