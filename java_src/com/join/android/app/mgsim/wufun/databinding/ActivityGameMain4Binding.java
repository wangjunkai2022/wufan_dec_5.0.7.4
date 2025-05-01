package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.WrapContentGridView;
/* loaded from: classes3.dex */
public final class ActivityGameMain4Binding implements ViewBinding {
    @NonNull
    public final ViewPager A;
    @NonNull
    public final WrapContentGridView B;
    @NonNull
    public final TextView C;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f16263b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f16264c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f16265d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f16266e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ConstraintLayout f16267f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final CoordinatorLayout f16268g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final FrameLayout f16269h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final FrameLayout f16270i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final FrameLayout f16271j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final FrameLayout f16272k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final SimpleDraweeView f16273l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final GridView f16274m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final RecyclerView f16275n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f16276o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final ImageView f16277p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final ImageView f16278q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final ImageView f16279r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final ConstraintLayout f16280s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final LinearLayout f16281t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final View f16282u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final FrameLayout f16283v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final TextView f16284w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    public final ImageView f16285x;
    @NonNull

    /* renamed from: y  reason: collision with root package name */
    public final TabLayout f16286y;
    @NonNull

    /* renamed from: z  reason: collision with root package name */
    public final TextView f16287z;

    private ActivityGameMain4Binding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2, @NonNull CoordinatorLayout coordinatorLayout, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull FrameLayout frameLayout4, @NonNull SimpleDraweeView simpleDraweeView, @NonNull GridView gridView, @NonNull RecyclerView recyclerView, @NonNull TextView textView2, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ConstraintLayout constraintLayout3, @NonNull LinearLayout linearLayout, @NonNull View view2, @NonNull FrameLayout frameLayout5, @NonNull TextView textView3, @NonNull ImageView imageView5, @NonNull TabLayout tabLayout, @NonNull TextView textView4, @NonNull ViewPager viewPager, @NonNull WrapContentGridView wrapContentGridView, @NonNull TextView textView5) {
        this.f16263b = constraintLayout;
        this.f16264c = view;
        this.f16265d = imageView;
        this.f16266e = textView;
        this.f16267f = constraintLayout2;
        this.f16268g = coordinatorLayout;
        this.f16269h = frameLayout;
        this.f16270i = frameLayout2;
        this.f16271j = frameLayout3;
        this.f16272k = frameLayout4;
        this.f16273l = simpleDraweeView;
        this.f16274m = gridView;
        this.f16275n = recyclerView;
        this.f16276o = textView2;
        this.f16277p = imageView2;
        this.f16278q = imageView3;
        this.f16279r = imageView4;
        this.f16280s = constraintLayout3;
        this.f16281t = linearLayout;
        this.f16282u = view2;
        this.f16283v = frameLayout5;
        this.f16284w = textView3;
        this.f16285x = imageView5;
        this.f16286y = tabLayout;
        this.f16287z = textView4;
        this.A = viewPager;
        this.B = wrapContentGridView;
        this.C = textView5;
    }

    @NonNull
    public static ActivityGameMain4Binding bind(@NonNull View view) {
        int i4 = R.id.back;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.back);
        if (findChildViewById != null) {
            i4 = R.id.battleHall;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.battleHall);
            if (imageView != null) {
                i4 = R.id.buyVip;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.buyVip);
                if (textView != null) {
                    i4 = R.id.constraintLayout9;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.constraintLayout9);
                    if (constraintLayout != null) {
                        i4 = R.id.coordinatorLayout;
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, R.id.coordinatorLayout);
                        if (coordinatorLayout != null) {
                            i4 = R.id.endGameEntrance;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.endGameEntrance);
                            if (frameLayout != null) {
                                i4 = R.id.expandContainer;
                                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.expandContainer);
                                if (frameLayout2 != null) {
                                    i4 = R.id.frameLayout;
                                    FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.frameLayout);
                                    if (frameLayout3 != null) {
                                        i4 = R.id.friendContainer;
                                        FrameLayout frameLayout4 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.friendContainer);
                                        if (frameLayout4 != null) {
                                            i4 = R.id.gameImg;
                                            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.gameImg);
                                            if (simpleDraweeView != null) {
                                                i4 = R.id.gameMainNewLeftGv;
                                                GridView gridView = (GridView) ViewBindings.findChildViewById(view, R.id.gameMainNewLeftGv);
                                                if (gridView != null) {
                                                    i4 = R.id.gameMainNewRv;
                                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.gameMainNewRv);
                                                    if (recyclerView != null) {
                                                        i4 = R.id.gameName;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.gameName);
                                                        if (textView2 != null) {
                                                            i4 = R.id.imageView80;
                                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView80);
                                                            if (imageView2 != null) {
                                                                i4 = R.id.ivChoose;
                                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.ivChoose);
                                                                if (imageView3 != null) {
                                                                    i4 = R.id.ivTips;
                                                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.ivTips);
                                                                    if (imageView4 != null) {
                                                                        i4 = R.id.leftContainer;
                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.leftContainer);
                                                                        if (constraintLayout2 != null) {
                                                                            i4 = R.id.ll_loading;
                                                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_loading);
                                                                            if (linearLayout != null) {
                                                                                i4 = R.id.mask;
                                                                                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.mask);
                                                                                if (findChildViewById2 != null) {
                                                                                    i4 = R.id.rightContainer;
                                                                                    FrameLayout frameLayout5 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.rightContainer);
                                                                                    if (frameLayout5 != null) {
                                                                                        i4 = R.id.roomCount;
                                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.roomCount);
                                                                                        if (textView3 != null) {
                                                                                            i4 = R.id.startGame;
                                                                                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.startGame);
                                                                                            if (imageView5 != null) {
                                                                                                i4 = R.id.tabLayout;
                                                                                                TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tabLayout);
                                                                                                if (tabLayout != null) {
                                                                                                    i4 = R.id.tv_loading_info;
                                                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_loading_info);
                                                                                                    if (textView4 != null) {
                                                                                                        i4 = R.id.viewPager;
                                                                                                        ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.viewPager);
                                                                                                        if (viewPager != null) {
                                                                                                            i4 = R.id.vipFunc;
                                                                                                            WrapContentGridView wrapContentGridView = (WrapContentGridView) ViewBindings.findChildViewById(view, R.id.vipFunc);
                                                                                                            if (wrapContentGridView != null) {
                                                                                                                i4 = R.id.vipTitle;
                                                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.vipTitle);
                                                                                                                if (textView5 != null) {
                                                                                                                    return new ActivityGameMain4Binding((ConstraintLayout) view, findChildViewById, imageView, textView, constraintLayout, coordinatorLayout, frameLayout, frameLayout2, frameLayout3, frameLayout4, simpleDraweeView, gridView, recyclerView, textView2, imageView2, imageView3, imageView4, constraintLayout2, linearLayout, findChildViewById2, frameLayout5, textView3, imageView5, tabLayout, textView4, viewPager, wrapContentGridView, textView5);
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
    public static ActivityGameMain4Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f16263b;
    }

    @NonNull
    public static ActivityGameMain4Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_game_main4, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
