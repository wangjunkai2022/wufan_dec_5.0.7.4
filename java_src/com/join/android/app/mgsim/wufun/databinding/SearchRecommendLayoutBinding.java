package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.FlowLayout;
import com.join.mgps.customview.WrapContentGridView;
import com.youth.banner.Banner;
/* loaded from: classes3.dex */
public final class SearchRecommendLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26428b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f26429c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f26430d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Banner f26431e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f26432f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final FlowLayout f26433g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final WrapContentGridView f26434h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final FlowLayout f26435i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f26436j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ImageView f26437k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ImageView f26438l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f26439m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f26440n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final LinearLayout f26441o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final LinearLayout f26442p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final LinearLayout f26443q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final LinearLayout f26444r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final LinearLayout f26445s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final LinearLayout f26446t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TabLayout f26447u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final TextView f26448v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final ViewPager f26449w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    public final WrapContentGridView f26450x;

    private SearchRecommendLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LinearLayout linearLayout, @NonNull Banner banner, @NonNull LinearLayout linearLayout2, @NonNull FlowLayout flowLayout, @NonNull WrapContentGridView wrapContentGridView, @NonNull FlowLayout flowLayout2, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull LinearLayout linearLayout6, @NonNull LinearLayout linearLayout7, @NonNull LinearLayout linearLayout8, @NonNull LinearLayout linearLayout9, @NonNull LinearLayout linearLayout10, @NonNull TabLayout tabLayout, @NonNull TextView textView2, @NonNull ViewPager viewPager, @NonNull WrapContentGridView wrapContentGridView2) {
        this.f26428b = relativeLayout;
        this.f26429c = simpleDraweeView;
        this.f26430d = linearLayout;
        this.f26431e = banner;
        this.f26432f = linearLayout2;
        this.f26433g = flowLayout;
        this.f26434h = wrapContentGridView;
        this.f26435i = flowLayout2;
        this.f26436j = textView;
        this.f26437k = imageView;
        this.f26438l = imageView2;
        this.f26439m = linearLayout3;
        this.f26440n = linearLayout4;
        this.f26441o = linearLayout5;
        this.f26442p = linearLayout6;
        this.f26443q = linearLayout7;
        this.f26444r = linearLayout8;
        this.f26445s = linearLayout9;
        this.f26446t = linearLayout10;
        this.f26447u = tabLayout;
        this.f26448v = textView2;
        this.f26449w = viewPager;
        this.f26450x = wrapContentGridView2;
    }

    @NonNull
    public static SearchRecommendLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.ad;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ad);
        if (simpleDraweeView != null) {
            i4 = R.id.allGameRanking;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.allGameRanking);
            if (linearLayout != null) {
                i4 = R.id.banner;
                Banner banner = (Banner) ViewBindings.findChildViewById(view, R.id.banner);
                if (banner != null) {
                    i4 = R.id.emulatorGameRanking;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.emulatorGameRanking);
                    if (linearLayout2 != null) {
                        i4 = R.id.flowLayout;
                        FlowLayout flowLayout = (FlowLayout) ViewBindings.findChildViewById(view, R.id.flowLayout);
                        if (flowLayout != null) {
                            i4 = R.id.gameListGrid;
                            WrapContentGridView wrapContentGridView = (WrapContentGridView) ViewBindings.findChildViewById(view, R.id.gameListGrid);
                            if (wrapContentGridView != null) {
                                i4 = R.id.guessLickFlow;
                                FlowLayout flowLayout2 = (FlowLayout) ViewBindings.findChildViewById(view, R.id.guessLickFlow);
                                if (flowLayout2 != null) {
                                    i4 = R.id.guessliketext;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.guessliketext);
                                    if (textView != null) {
                                        i4 = R.id.imageView48;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView48);
                                        if (imageView != null) {
                                            i4 = R.id.ivRefresh;
                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ivRefresh);
                                            if (imageView2 != null) {
                                                i4 = R.id.llCategories;
                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llCategories);
                                                if (linearLayout3 != null) {
                                                    i4 = R.id.llGameList;
                                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llGameList);
                                                    if (linearLayout4 != null) {
                                                        i4 = R.id.llHotSearch;
                                                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llHotSearch);
                                                        if (linearLayout5 != null) {
                                                            i4 = R.id.llHotTag;
                                                            LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llHotTag);
                                                            if (linearLayout6 != null) {
                                                                i4 = R.id.llRecent;
                                                                LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llRecent);
                                                                if (linearLayout7 != null) {
                                                                    i4 = R.id.onlineGameRanking;
                                                                    LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.onlineGameRanking);
                                                                    if (linearLayout8 != null) {
                                                                        i4 = R.id.refreshGameList;
                                                                        LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.refreshGameList);
                                                                        if (linearLayout9 != null) {
                                                                            i4 = R.id.singleGameRanking;
                                                                            LinearLayout linearLayout10 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.singleGameRanking);
                                                                            if (linearLayout10 != null) {
                                                                                i4 = R.id.tabLayout;
                                                                                TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tabLayout);
                                                                                if (tabLayout != null) {
                                                                                    i4 = R.id.textView38;
                                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView38);
                                                                                    if (textView2 != null) {
                                                                                        i4 = R.id.viewPager;
                                                                                        ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.viewPager);
                                                                                        if (viewPager != null) {
                                                                                            i4 = R.id.wrapGridView;
                                                                                            WrapContentGridView wrapContentGridView2 = (WrapContentGridView) ViewBindings.findChildViewById(view, R.id.wrapGridView);
                                                                                            if (wrapContentGridView2 != null) {
                                                                                                return new SearchRecommendLayoutBinding((RelativeLayout) view, simpleDraweeView, linearLayout, banner, linearLayout2, flowLayout, wrapContentGridView, flowLayout2, textView, imageView, imageView2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10, tabLayout, textView2, viewPager, wrapContentGridView2);
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
    public static SearchRecommendLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26428b;
    }

    @NonNull
    public static SearchRecommendLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.search_recommend_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
