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
import com.join.mgps.customview.XListView;
/* loaded from: classes3.dex */
public final class MgForumForumTopicActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23914b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final MgForumTitleLayoutBinding f23915c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f23916d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final XListView f23917e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ForumLoadingView f23918f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final FrameLayout f23919g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final VideoLayoutBinding f23920h;

    private MgForumForumTopicActivityBinding(@NonNull LinearLayout linearLayout, @NonNull MgForumTitleLayoutBinding mgForumTitleLayoutBinding, @NonNull View view, @NonNull XListView xListView, @NonNull ForumLoadingView forumLoadingView, @NonNull FrameLayout frameLayout, @NonNull VideoLayoutBinding videoLayoutBinding) {
        this.f23914b = linearLayout;
        this.f23915c = mgForumTitleLayoutBinding;
        this.f23916d = view;
        this.f23917e = xListView;
        this.f23918f = forumLoadingView;
        this.f23919g = frameLayout;
        this.f23920h = videoLayoutBinding;
    }

    @NonNull
    public static MgForumForumTopicActivityBinding bind(@NonNull View view) {
        int i4 = R.id.actionbarLayout;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.actionbarLayout);
        if (findChildViewById != null) {
            MgForumTitleLayoutBinding bind = MgForumTitleLayoutBinding.bind(findChildViewById);
            i4 = R.id.bottom;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.bottom);
            if (findChildViewById2 != null) {
                i4 = R.id.listView;
                XListView xListView = (XListView) ViewBindings.findChildViewById(view, R.id.listView);
                if (xListView != null) {
                    i4 = R.id.loadingView;
                    ForumLoadingView forumLoadingView = (ForumLoadingView) ViewBindings.findChildViewById(view, R.id.loadingView);
                    if (forumLoadingView != null) {
                        i4 = R.id.videoContainer;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.videoContainer);
                        if (frameLayout != null) {
                            i4 = R.id.videoLayout;
                            View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.videoLayout);
                            if (findChildViewById3 != null) {
                                return new MgForumForumTopicActivityBinding((LinearLayout) view, bind, findChildViewById2, xListView, forumLoadingView, frameLayout, VideoLayoutBinding.bind(findChildViewById3));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumForumTopicActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23914b;
    }

    @NonNull
    public static MgForumForumTopicActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_forum_topic_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
