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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.SlidingTabForumLayout;
import com.join.mgps.customview.XListView2;
import com.join.mgps.ptr.PtrClassicFrameLayout;
/* loaded from: classes3.dex */
public final class MgForumForumActivity2Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23827b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final MgForumTitleLayoutBinding f23828c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f23829d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final XListView2 f23830e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ForumLoadingView f23831f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final PtrClassicFrameLayout f23832g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final RelativeLayout f23833h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f23834i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final SlidingTabForumLayout f23835j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final FrameLayout f23836k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final VideoLayoutBinding f23837l;

    private MgForumForumActivity2Binding(@NonNull LinearLayout linearLayout, @NonNull MgForumTitleLayoutBinding mgForumTitleLayoutBinding, @NonNull View view, @NonNull XListView2 xListView2, @NonNull ForumLoadingView forumLoadingView, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull SlidingTabForumLayout slidingTabForumLayout, @NonNull FrameLayout frameLayout, @NonNull VideoLayoutBinding videoLayoutBinding) {
        this.f23827b = linearLayout;
        this.f23828c = mgForumTitleLayoutBinding;
        this.f23829d = view;
        this.f23830e = xListView2;
        this.f23831f = forumLoadingView;
        this.f23832g = ptrClassicFrameLayout;
        this.f23833h = relativeLayout;
        this.f23834i = imageView;
        this.f23835j = slidingTabForumLayout;
        this.f23836k = frameLayout;
        this.f23837l = videoLayoutBinding;
    }

    @NonNull
    public static MgForumForumActivity2Binding bind(@NonNull View view) {
        int i4 = R.id.actionbarLayout;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.actionbarLayout);
        if (findChildViewById != null) {
            MgForumTitleLayoutBinding bind = MgForumTitleLayoutBinding.bind(findChildViewById);
            i4 = R.id.bottom;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.bottom);
            if (findChildViewById2 != null) {
                i4 = R.id.listView;
                XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.listView);
                if (xListView2 != null) {
                    i4 = R.id.loadingView;
                    ForumLoadingView forumLoadingView = (ForumLoadingView) ViewBindings.findChildViewById(view, R.id.loadingView);
                    if (forumLoadingView != null) {
                        i4 = R.id.mPtrFrame;
                        PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
                        if (ptrClassicFrameLayout != null) {
                            i4 = R.id.refresh;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.refresh);
                            if (relativeLayout != null) {
                                i4 = R.id.refreshImg;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.refreshImg);
                                if (imageView != null) {
                                    i4 = R.id.tabHover;
                                    SlidingTabForumLayout slidingTabForumLayout = (SlidingTabForumLayout) ViewBindings.findChildViewById(view, R.id.tabHover);
                                    if (slidingTabForumLayout != null) {
                                        i4 = R.id.videoContainer;
                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.videoContainer);
                                        if (frameLayout != null) {
                                            i4 = R.id.videoLayout;
                                            View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.videoLayout);
                                            if (findChildViewById3 != null) {
                                                return new MgForumForumActivity2Binding((LinearLayout) view, bind, findChildViewById2, xListView2, forumLoadingView, ptrClassicFrameLayout, relativeLayout, imageView, slidingTabForumLayout, frameLayout, VideoLayoutBinding.bind(findChildViewById3));
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
    public static MgForumForumActivity2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23827b;
    }

    @NonNull
    public static MgForumForumActivity2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_forum_activity2, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
