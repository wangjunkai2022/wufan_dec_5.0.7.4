package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.XListView2;
/* loaded from: classes3.dex */
public final class ActivityForumPostsTagSelectBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f16184b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final MgForumTitleLayoutBinding f16185c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final XListView2 f16186d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ForumLoadingView f16187e;

    private ActivityForumPostsTagSelectBinding(@NonNull LinearLayout linearLayout, @NonNull MgForumTitleLayoutBinding mgForumTitleLayoutBinding, @NonNull XListView2 xListView2, @NonNull ForumLoadingView forumLoadingView) {
        this.f16184b = linearLayout;
        this.f16185c = mgForumTitleLayoutBinding;
        this.f16186d = xListView2;
        this.f16187e = forumLoadingView;
    }

    @NonNull
    public static ActivityForumPostsTagSelectBinding bind(@NonNull View view) {
        int i4 = R.id.actionBar;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.actionBar);
        if (findChildViewById != null) {
            MgForumTitleLayoutBinding bind = MgForumTitleLayoutBinding.bind(findChildViewById);
            XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.listView);
            if (xListView2 != null) {
                ForumLoadingView forumLoadingView = (ForumLoadingView) ViewBindings.findChildViewById(view, R.id.loadingView);
                if (forumLoadingView != null) {
                    return new ActivityForumPostsTagSelectBinding((LinearLayout) view, bind, xListView2, forumLoadingView);
                }
                i4 = R.id.loadingView;
            } else {
                i4 = R.id.listView;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityForumPostsTagSelectBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f16184b;
    }

    @NonNull
    public static ActivityForumPostsTagSelectBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_forum_posts_tag_select, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
