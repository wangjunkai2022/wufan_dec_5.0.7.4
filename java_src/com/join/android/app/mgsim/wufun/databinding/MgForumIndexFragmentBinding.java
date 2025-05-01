package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ForumIndexHeaderView;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.SlidingTabLayout4;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import ru.noties.scrollable.ScrollableLayout;
/* loaded from: classes3.dex */
public final class MgForumIndexFragmentBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f23948b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f23949c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final MgForumTitleLayoutBinding f23950d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ForumIndexHeaderView f23951e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f23952f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ForumLoadingView f23953g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final PtrClassicFrameLayout f23954h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ScrollableLayout f23955i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final SlidingTabLayout4 f23956j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ViewPager f23957k;

    private MgForumIndexFragmentBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull MgForumTitleLayoutBinding mgForumTitleLayoutBinding, @NonNull ForumIndexHeaderView forumIndexHeaderView, @NonNull RelativeLayout relativeLayout2, @NonNull ForumLoadingView forumLoadingView, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull ScrollableLayout scrollableLayout, @NonNull SlidingTabLayout4 slidingTabLayout4, @NonNull ViewPager viewPager) {
        this.f23948b = relativeLayout;
        this.f23949c = textView;
        this.f23950d = mgForumTitleLayoutBinding;
        this.f23951e = forumIndexHeaderView;
        this.f23952f = relativeLayout2;
        this.f23953g = forumLoadingView;
        this.f23954h = ptrClassicFrameLayout;
        this.f23955i = scrollableLayout;
        this.f23956j = slidingTabLayout4;
        this.f23957k = viewPager;
    }

    @NonNull
    public static MgForumIndexFragmentBinding bind(@NonNull View view) {
        int i4 = R.id.aboutWF;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.aboutWF);
        if (textView != null) {
            i4 = R.id.actionPlaceHolder;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.actionPlaceHolder);
            if (findChildViewById != null) {
                MgForumTitleLayoutBinding bind = MgForumTitleLayoutBinding.bind(findChildViewById);
                i4 = R.id.headerView;
                ForumIndexHeaderView forumIndexHeaderView = (ForumIndexHeaderView) ViewBindings.findChildViewById(view, R.id.headerView);
                if (forumIndexHeaderView != null) {
                    i4 = R.id.layout_others;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.layout_others);
                    if (relativeLayout != null) {
                        i4 = R.id.loadingView;
                        ForumLoadingView forumLoadingView = (ForumLoadingView) ViewBindings.findChildViewById(view, R.id.loadingView);
                        if (forumLoadingView != null) {
                            i4 = R.id.mPtrFrame;
                            PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
                            if (ptrClassicFrameLayout != null) {
                                i4 = R.id.scrollableLayout;
                                ScrollableLayout scrollableLayout = (ScrollableLayout) ViewBindings.findChildViewById(view, R.id.scrollableLayout);
                                if (scrollableLayout != null) {
                                    i4 = R.id.tabsLayout;
                                    SlidingTabLayout4 slidingTabLayout4 = (SlidingTabLayout4) ViewBindings.findChildViewById(view, R.id.tabsLayout);
                                    if (slidingTabLayout4 != null) {
                                        i4 = R.id.viewPager;
                                        ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.viewPager);
                                        if (viewPager != null) {
                                            return new MgForumIndexFragmentBinding((RelativeLayout) view, textView, bind, forumIndexHeaderView, relativeLayout, forumLoadingView, ptrClassicFrameLayout, scrollableLayout, slidingTabLayout4, viewPager);
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
    public static MgForumIndexFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f23948b;
    }

    @NonNull
    public static MgForumIndexFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_index_fragment, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
