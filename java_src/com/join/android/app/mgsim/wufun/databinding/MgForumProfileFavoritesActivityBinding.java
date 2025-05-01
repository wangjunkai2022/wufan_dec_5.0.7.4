package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.ptr.PtrClassicFrameLayout;
/* loaded from: classes3.dex */
public final class MgForumProfileFavoritesActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24197b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final MgForumTitleLayoutBinding f24198c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f24199d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final XListView2 f24200e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ForumLoadingView f24201f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final PtrClassicFrameLayout f24202g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final FrameLayout f24203h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final VideoLayoutBinding f24204i;

    private MgForumProfileFavoritesActivityBinding(@NonNull LinearLayout linearLayout, @NonNull MgForumTitleLayoutBinding mgForumTitleLayoutBinding, @NonNull View view, @NonNull XListView2 xListView2, @NonNull ForumLoadingView forumLoadingView, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull FrameLayout frameLayout, @NonNull VideoLayoutBinding videoLayoutBinding) {
        this.f24197b = linearLayout;
        this.f24198c = mgForumTitleLayoutBinding;
        this.f24199d = view;
        this.f24200e = xListView2;
        this.f24201f = forumLoadingView;
        this.f24202g = ptrClassicFrameLayout;
        this.f24203h = frameLayout;
        this.f24204i = videoLayoutBinding;
    }

    @NonNull
    public static MgForumProfileFavoritesActivityBinding bind(@NonNull View view) {
        int i4 = R.id.actionbarLayout;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.actionbarLayout);
        if (findChildViewById != null) {
            MgForumTitleLayoutBinding bind = MgForumTitleLayoutBinding.bind(findChildViewById);
            i4 = R.id.bottom;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.bottom);
            if (findChildViewById2 != null) {
                i4 = R.id.forum_posts_list;
                XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.forum_posts_list);
                if (xListView2 != null) {
                    i4 = R.id.loadingView;
                    ForumLoadingView forumLoadingView = (ForumLoadingView) ViewBindings.findChildViewById(view, R.id.loadingView);
                    if (forumLoadingView != null) {
                        i4 = R.id.mPtrFrame;
                        PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
                        if (ptrClassicFrameLayout != null) {
                            i4 = R.id.videoContainer;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.videoContainer);
                            if (frameLayout != null) {
                                i4 = R.id.videoLayout;
                                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.videoLayout);
                                if (findChildViewById3 != null) {
                                    return new MgForumProfileFavoritesActivityBinding((LinearLayout) view, bind, findChildViewById2, xListView2, forumLoadingView, ptrClassicFrameLayout, frameLayout, VideoLayoutBinding.bind(findChildViewById3));
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
    public static MgForumProfileFavoritesActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24197b;
    }

    @NonNull
    public static MgForumProfileFavoritesActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_profile_favorites_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
