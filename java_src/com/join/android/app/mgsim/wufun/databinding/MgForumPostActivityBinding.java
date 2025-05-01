package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.join.android.app.component.xrecyclerview.XQuickRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CustomLoadingView;
import com.join.mgps.customview.ForumStickView;
import com.join.mgps.customview.KeyboardListenLayout;
/* loaded from: classes3.dex */
public final class MgForumPostActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final KeyboardListenLayout f24007b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final MgForumTitleDetailLayoutBinding f24008c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f24009d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ConsecutiveScrollerLayout f24010e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ForumStickView f24011f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final IncludeChatBottomBar1Binding f24012g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final CustomLoadingView f24013h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final XQuickRecyclerView f24014i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final RecyclerView f24015j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final FrameLayout f24016k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final VideoLayoutBinding f24017l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ViewRvListEmptyBinding f24018m;

    private MgForumPostActivityBinding(@NonNull KeyboardListenLayout keyboardListenLayout, @NonNull MgForumTitleDetailLayoutBinding mgForumTitleDetailLayoutBinding, @NonNull View view, @NonNull ConsecutiveScrollerLayout consecutiveScrollerLayout, @NonNull ForumStickView forumStickView, @NonNull IncludeChatBottomBar1Binding includeChatBottomBar1Binding, @NonNull CustomLoadingView customLoadingView, @NonNull XQuickRecyclerView xQuickRecyclerView, @NonNull RecyclerView recyclerView, @NonNull FrameLayout frameLayout, @NonNull VideoLayoutBinding videoLayoutBinding, @NonNull ViewRvListEmptyBinding viewRvListEmptyBinding) {
        this.f24007b = keyboardListenLayout;
        this.f24008c = mgForumTitleDetailLayoutBinding;
        this.f24009d = view;
        this.f24010e = consecutiveScrollerLayout;
        this.f24011f = forumStickView;
        this.f24012g = includeChatBottomBar1Binding;
        this.f24013h = customLoadingView;
        this.f24014i = xQuickRecyclerView;
        this.f24015j = recyclerView;
        this.f24016k = frameLayout;
        this.f24017l = videoLayoutBinding;
        this.f24018m = viewRvListEmptyBinding;
    }

    @NonNull
    public static MgForumPostActivityBinding bind(@NonNull View view) {
        int i4 = R.id.actionbarLayout;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.actionbarLayout);
        if (findChildViewById != null) {
            MgForumTitleDetailLayoutBinding bind = MgForumTitleDetailLayoutBinding.bind(findChildViewById);
            i4 = R.id.bottom;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.bottom);
            if (findChildViewById2 != null) {
                i4 = R.id.csl_view;
                ConsecutiveScrollerLayout consecutiveScrollerLayout = (ConsecutiveScrollerLayout) ViewBindings.findChildViewById(view, R.id.csl_view);
                if (consecutiveScrollerLayout != null) {
                    i4 = R.id.fsv_stick;
                    ForumStickView forumStickView = (ForumStickView) ViewBindings.findChildViewById(view, R.id.fsv_stick);
                    if (forumStickView != null) {
                        i4 = R.id.layout_chat_cell_container;
                        View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.layout_chat_cell_container);
                        if (findChildViewById3 != null) {
                            IncludeChatBottomBar1Binding bind2 = IncludeChatBottomBar1Binding.bind(findChildViewById3);
                            i4 = R.id.loadingView;
                            CustomLoadingView customLoadingView = (CustomLoadingView) ViewBindings.findChildViewById(view, R.id.loadingView);
                            if (customLoadingView != null) {
                                i4 = R.id.rv_comment_list;
                                XQuickRecyclerView xQuickRecyclerView = (XQuickRecyclerView) ViewBindings.findChildViewById(view, R.id.rv_comment_list);
                                if (xQuickRecyclerView != null) {
                                    i4 = R.id.rv_head;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_head);
                                    if (recyclerView != null) {
                                        i4 = R.id.videoContainer;
                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.videoContainer);
                                        if (frameLayout != null) {
                                            i4 = R.id.videoLayout;
                                            View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.videoLayout);
                                            if (findChildViewById4 != null) {
                                                VideoLayoutBinding bind3 = VideoLayoutBinding.bind(findChildViewById4);
                                                i4 = R.id.view_empty;
                                                View findChildViewById5 = ViewBindings.findChildViewById(view, R.id.view_empty);
                                                if (findChildViewById5 != null) {
                                                    return new MgForumPostActivityBinding((KeyboardListenLayout) view, bind, findChildViewById2, consecutiveScrollerLayout, forumStickView, bind2, customLoadingView, xQuickRecyclerView, recyclerView, frameLayout, bind3, ViewRvListEmptyBinding.bind(findChildViewById5));
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumPostActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public KeyboardListenLayout getRoot() {
        return this.f24007b;
    }

    @NonNull
    public static MgForumPostActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_post_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
