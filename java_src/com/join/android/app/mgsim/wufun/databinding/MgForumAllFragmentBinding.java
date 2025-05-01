package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.XListView2;
/* loaded from: classes3.dex */
public final class MgForumAllFragmentBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f23803b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final XListView2 f23804c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ForumLoadingView f23805d;

    private MgForumAllFragmentBinding(@NonNull RelativeLayout relativeLayout, @NonNull XListView2 xListView2, @NonNull ForumLoadingView forumLoadingView) {
        this.f23803b = relativeLayout;
        this.f23804c = xListView2;
        this.f23805d = forumLoadingView;
    }

    @NonNull
    public static MgForumAllFragmentBinding bind(@NonNull View view) {
        int i4 = R.id.forum_posts_list;
        XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.forum_posts_list);
        if (xListView2 != null) {
            i4 = R.id.loadingView;
            ForumLoadingView forumLoadingView = (ForumLoadingView) ViewBindings.findChildViewById(view, R.id.loadingView);
            if (forumLoadingView != null) {
                return new MgForumAllFragmentBinding((RelativeLayout) view, xListView2, forumLoadingView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumAllFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f23803b;
    }

    @NonNull
    public static MgForumAllFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_all_fragment, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
