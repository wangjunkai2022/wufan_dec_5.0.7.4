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
import com.join.mgps.customview.XExpandableListView;
import com.join.mgps.ptr.PtrClassicFrameLayout;
/* loaded from: classes3.dex */
public final class ActivityForumMyBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f16175b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final MgForumTitleLayoutBinding f16176c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final XExpandableListView f16177d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ForumLoadingView f16178e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final PtrClassicFrameLayout f16179f;

    private ActivityForumMyBinding(@NonNull LinearLayout linearLayout, @NonNull MgForumTitleLayoutBinding mgForumTitleLayoutBinding, @NonNull XExpandableListView xExpandableListView, @NonNull ForumLoadingView forumLoadingView, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout) {
        this.f16175b = linearLayout;
        this.f16176c = mgForumTitleLayoutBinding;
        this.f16177d = xExpandableListView;
        this.f16178e = forumLoadingView;
        this.f16179f = ptrClassicFrameLayout;
    }

    @NonNull
    public static ActivityForumMyBinding bind(@NonNull View view) {
        int i4 = R.id.actionBar;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.actionBar);
        if (findChildViewById != null) {
            MgForumTitleLayoutBinding bind = MgForumTitleLayoutBinding.bind(findChildViewById);
            i4 = R.id.expandableListView;
            XExpandableListView xExpandableListView = (XExpandableListView) ViewBindings.findChildViewById(view, R.id.expandableListView);
            if (xExpandableListView != null) {
                i4 = R.id.loadingView;
                ForumLoadingView forumLoadingView = (ForumLoadingView) ViewBindings.findChildViewById(view, R.id.loadingView);
                if (forumLoadingView != null) {
                    i4 = R.id.mPtrFrame;
                    PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
                    if (ptrClassicFrameLayout != null) {
                        return new ActivityForumMyBinding((LinearLayout) view, bind, xExpandableListView, forumLoadingView, ptrClassicFrameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityForumMyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f16175b;
    }

    @NonNull
    public static ActivityForumMyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_forum_my, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
