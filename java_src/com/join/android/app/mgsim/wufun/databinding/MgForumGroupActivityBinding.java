package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ForumGroupHeaderView;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.SlidingTabLayout4;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import ru.noties.scrollable.ScrollableLayout;
/* loaded from: classes3.dex */
public final class MgForumGroupActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23921b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final MgForumTitleLayoutBinding f23922c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f23923d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f23924e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ForumGroupHeaderView f23925f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ForumLoadingView f23926g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final PtrClassicFrameLayout f23927h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final RelativeLayout f23928i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ScrollableLayout f23929j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final SlidingTabLayout4 f23930k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ViewPager f23931l;

    private MgForumGroupActivityBinding(@NonNull LinearLayout linearLayout, @NonNull MgForumTitleLayoutBinding mgForumTitleLayoutBinding, @NonNull View view, @NonNull Button button, @NonNull ForumGroupHeaderView forumGroupHeaderView, @NonNull ForumLoadingView forumLoadingView, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull RelativeLayout relativeLayout, @NonNull ScrollableLayout scrollableLayout, @NonNull SlidingTabLayout4 slidingTabLayout4, @NonNull ViewPager viewPager) {
        this.f23921b = linearLayout;
        this.f23922c = mgForumTitleLayoutBinding;
        this.f23923d = view;
        this.f23924e = button;
        this.f23925f = forumGroupHeaderView;
        this.f23926g = forumLoadingView;
        this.f23927h = ptrClassicFrameLayout;
        this.f23928i = relativeLayout;
        this.f23929j = scrollableLayout;
        this.f23930k = slidingTabLayout4;
        this.f23931l = viewPager;
    }

    @NonNull
    public static MgForumGroupActivityBinding bind(@NonNull View view) {
        int i4 = R.id.actionBar;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.actionBar);
        if (findChildViewById != null) {
            MgForumTitleLayoutBinding bind = MgForumTitleLayoutBinding.bind(findChildViewById);
            i4 = R.id.bottom;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.bottom);
            if (findChildViewById2 != null) {
                i4 = R.id.btnSendPosts;
                Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnSendPosts);
                if (button != null) {
                    i4 = R.id.headerView;
                    ForumGroupHeaderView forumGroupHeaderView = (ForumGroupHeaderView) ViewBindings.findChildViewById(view, R.id.headerView);
                    if (forumGroupHeaderView != null) {
                        i4 = R.id.loadingView;
                        ForumLoadingView forumLoadingView = (ForumLoadingView) ViewBindings.findChildViewById(view, R.id.loadingView);
                        if (forumLoadingView != null) {
                            i4 = R.id.mPtrFrame;
                            PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
                            if (ptrClassicFrameLayout != null) {
                                i4 = R.id.rlOrderBy;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rlOrderBy);
                                if (relativeLayout != null) {
                                    i4 = R.id.scrollableLayout;
                                    ScrollableLayout scrollableLayout = (ScrollableLayout) ViewBindings.findChildViewById(view, R.id.scrollableLayout);
                                    if (scrollableLayout != null) {
                                        i4 = R.id.tabsLayout;
                                        SlidingTabLayout4 slidingTabLayout4 = (SlidingTabLayout4) ViewBindings.findChildViewById(view, R.id.tabsLayout);
                                        if (slidingTabLayout4 != null) {
                                            i4 = R.id.viewPager;
                                            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.viewPager);
                                            if (viewPager != null) {
                                                return new MgForumGroupActivityBinding((LinearLayout) view, bind, findChildViewById2, button, forumGroupHeaderView, forumLoadingView, ptrClassicFrameLayout, relativeLayout, scrollableLayout, slidingTabLayout4, viewPager);
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
    public static MgForumGroupActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23921b;
    }

    @NonNull
    public static MgForumGroupActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_group_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
