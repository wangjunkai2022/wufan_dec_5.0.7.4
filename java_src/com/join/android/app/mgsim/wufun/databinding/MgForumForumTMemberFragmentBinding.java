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
import com.join.mgps.customview.XListView;
/* loaded from: classes3.dex */
public final class MgForumForumTMemberFragmentBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f23890b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final XListView f23891c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ForumLoadingView f23892d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f23893e;

    private MgForumForumTMemberFragmentBinding(@NonNull RelativeLayout relativeLayout, @NonNull XListView xListView, @NonNull ForumLoadingView forumLoadingView, @NonNull View view) {
        this.f23890b = relativeLayout;
        this.f23891c = xListView;
        this.f23892d = forumLoadingView;
        this.f23893e = view;
    }

    @NonNull
    public static MgForumForumTMemberFragmentBinding bind(@NonNull View view) {
        int i4 = R.id.listView;
        XListView xListView = (XListView) ViewBindings.findChildViewById(view, R.id.listView);
        if (xListView != null) {
            i4 = R.id.loadingView;
            ForumLoadingView forumLoadingView = (ForumLoadingView) ViewBindings.findChildViewById(view, R.id.loadingView);
            if (forumLoadingView != null) {
                i4 = R.id.requestLayout;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.requestLayout);
                if (findChildViewById != null) {
                    return new MgForumForumTMemberFragmentBinding((RelativeLayout) view, xListView, forumLoadingView, findChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumForumTMemberFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f23890b;
    }

    @NonNull
    public static MgForumForumTMemberFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_forum_t_member_fragment, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
