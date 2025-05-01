package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class GamedetailVideoMainActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f20839b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f20840c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f20841d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f20842e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ConstraintLayout f20843f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RelativeLayout f20844g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f20845h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final View f20846i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final View f20847j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TabLayout f20848k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final RelativeLayout f20849l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ViewPager f20850m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ViewPager2 f20851n;

    private GamedetailVideoMainActivityBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView2, @NonNull ConstraintLayout constraintLayout, @NonNull RelativeLayout relativeLayout2, @NonNull LinearLayout linearLayout, @NonNull View view, @NonNull View view2, @NonNull TabLayout tabLayout, @NonNull RelativeLayout relativeLayout3, @NonNull ViewPager viewPager, @NonNull ViewPager2 viewPager2) {
        this.f20839b = relativeLayout;
        this.f20840c = imageView;
        this.f20841d = frameLayout;
        this.f20842e = imageView2;
        this.f20843f = constraintLayout;
        this.f20844g = relativeLayout2;
        this.f20845h = linearLayout;
        this.f20846i = view;
        this.f20847j = view2;
        this.f20848k = tabLayout;
        this.f20849l = relativeLayout3;
        this.f20850m = viewPager;
        this.f20851n = viewPager2;
    }

    @NonNull
    public static GamedetailVideoMainActivityBinding bind(@NonNull View view) {
        int i4 = R.id.backImg;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.backImg);
        if (imageView != null) {
            i4 = R.id.fragment;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.fragment);
            if (frameLayout != null) {
                i4 = R.id.iv_back;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_back);
                if (imageView2 != null) {
                    i4 = R.id.layout_new;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.layout_new);
                    if (constraintLayout != null) {
                        i4 = R.id.layout_old;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.layout_old);
                        if (relativeLayout != null) {
                            i4 = R.id.main_content;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.main_content);
                            if (linearLayout != null) {
                                i4 = R.id.mainCover;
                                View findChildViewById = ViewBindings.findChildViewById(view, R.id.mainCover);
                                if (findChildViewById != null) {
                                    i4 = R.id.statuHVIew;
                                    View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.statuHVIew);
                                    if (findChildViewById2 != null) {
                                        i4 = R.id.tablayout;
                                        TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tablayout);
                                        if (tabLayout != null) {
                                            i4 = R.id.titleTransfer;
                                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.titleTransfer);
                                            if (relativeLayout2 != null) {
                                                i4 = R.id.viewPager;
                                                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.viewPager);
                                                if (viewPager != null) {
                                                    i4 = R.id.viewpager;
                                                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, R.id.viewpager);
                                                    if (viewPager2 != null) {
                                                        return new GamedetailVideoMainActivityBinding((RelativeLayout) view, imageView, frameLayout, imageView2, constraintLayout, relativeLayout, linearLayout, findChildViewById, findChildViewById2, tabLayout, relativeLayout2, viewPager, viewPager2);
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
    public static GamedetailVideoMainActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f20839b;
    }

    @NonNull
    public static GamedetailVideoMainActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetail_video_main_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
