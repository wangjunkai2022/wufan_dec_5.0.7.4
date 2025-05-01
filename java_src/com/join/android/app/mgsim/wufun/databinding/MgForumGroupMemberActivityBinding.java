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
import com.join.mgps.ptr.PtrClassicFrameLayout;
/* loaded from: classes3.dex */
public final class MgForumGroupMemberActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23932b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final MgForumTitleLayoutBinding f23933c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final XListView2 f23934d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ForumLoadingView f23935e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final PtrClassicFrameLayout f23936f;

    private MgForumGroupMemberActivityBinding(@NonNull LinearLayout linearLayout, @NonNull MgForumTitleLayoutBinding mgForumTitleLayoutBinding, @NonNull XListView2 xListView2, @NonNull ForumLoadingView forumLoadingView, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout) {
        this.f23932b = linearLayout;
        this.f23933c = mgForumTitleLayoutBinding;
        this.f23934d = xListView2;
        this.f23935e = forumLoadingView;
        this.f23936f = ptrClassicFrameLayout;
    }

    @NonNull
    public static MgForumGroupMemberActivityBinding bind(@NonNull View view) {
        int i4 = R.id.actionBar;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.actionBar);
        if (findChildViewById != null) {
            MgForumTitleLayoutBinding bind = MgForumTitleLayoutBinding.bind(findChildViewById);
            i4 = R.id.listView;
            XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.listView);
            if (xListView2 != null) {
                i4 = R.id.loadingView;
                ForumLoadingView forumLoadingView = (ForumLoadingView) ViewBindings.findChildViewById(view, R.id.loadingView);
                if (forumLoadingView != null) {
                    i4 = R.id.mPtrFrame;
                    PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
                    if (ptrClassicFrameLayout != null) {
                        return new MgForumGroupMemberActivityBinding((LinearLayout) view, bind, xListView2, forumLoadingView, ptrClassicFrameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumGroupMemberActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23932b;
    }

    @NonNull
    public static MgForumGroupMemberActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_group_member_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
