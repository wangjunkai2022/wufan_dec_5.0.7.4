package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.SlidingTabLayout1;
/* loaded from: classes3.dex */
public final class MgForumAllActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f23794b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final MgForumTitleLayoutBinding f23795c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f23796d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ForumLoadingView f23797e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ViewPager f23798f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final SlidingTabLayout1 f23799g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final View f23800h;

    private MgForumAllActivityBinding(@NonNull RelativeLayout relativeLayout, @NonNull MgForumTitleLayoutBinding mgForumTitleLayoutBinding, @NonNull View view, @NonNull ForumLoadingView forumLoadingView, @NonNull ViewPager viewPager, @NonNull SlidingTabLayout1 slidingTabLayout1, @NonNull View view2) {
        this.f23794b = relativeLayout;
        this.f23795c = mgForumTitleLayoutBinding;
        this.f23796d = view;
        this.f23797e = forumLoadingView;
        this.f23798f = viewPager;
        this.f23799g = slidingTabLayout1;
        this.f23800h = view2;
    }

    @NonNull
    public static MgForumAllActivityBinding bind(@NonNull View view) {
        int i4 = R.id.actionBar;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.actionBar);
        if (findChildViewById != null) {
            MgForumTitleLayoutBinding bind = MgForumTitleLayoutBinding.bind(findChildViewById);
            i4 = R.id.lineTop;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.lineTop);
            if (findChildViewById2 != null) {
                i4 = R.id.loadingView;
                ForumLoadingView forumLoadingView = (ForumLoadingView) ViewBindings.findChildViewById(view, R.id.loadingView);
                if (forumLoadingView != null) {
                    i4 = R.id.mPager;
                    ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.mPager);
                    if (viewPager != null) {
                        i4 = R.id.mTab;
                        SlidingTabLayout1 slidingTabLayout1 = (SlidingTabLayout1) ViewBindings.findChildViewById(view, R.id.mTab);
                        if (slidingTabLayout1 != null) {
                            i4 = R.id.viewBg;
                            View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.viewBg);
                            if (findChildViewById3 != null) {
                                return new MgForumAllActivityBinding((RelativeLayout) view, bind, findChildViewById2, forumLoadingView, viewPager, slidingTabLayout1, findChildViewById3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumAllActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f23794b;
    }

    @NonNull
    public static MgForumAllActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_all_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
