package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.KeyboardListenLayout;
import com.join.mgps.customview.XListView;
/* loaded from: classes3.dex */
public final class MgForumProfileMessageReplyActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final KeyboardListenLayout f24222b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final IncludeChatBottomBarBinding f24223c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final MgForumTitleLayoutBinding f24224d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ForumLoadingView f24225e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final XListView f24226f;

    private MgForumProfileMessageReplyActivityBinding(@NonNull KeyboardListenLayout keyboardListenLayout, @NonNull IncludeChatBottomBarBinding includeChatBottomBarBinding, @NonNull MgForumTitleLayoutBinding mgForumTitleLayoutBinding, @NonNull ForumLoadingView forumLoadingView, @NonNull XListView xListView) {
        this.f24222b = keyboardListenLayout;
        this.f24223c = includeChatBottomBarBinding;
        this.f24224d = mgForumTitleLayoutBinding;
        this.f24225e = forumLoadingView;
        this.f24226f = xListView;
    }

    @NonNull
    public static MgForumProfileMessageReplyActivityBinding bind(@NonNull View view) {
        int i4 = R.id.layout_chat_cell_container;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.layout_chat_cell_container);
        if (findChildViewById != null) {
            IncludeChatBottomBarBinding bind = IncludeChatBottomBarBinding.bind(findChildViewById);
            i4 = R.id.layout_forum_posts_title;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.layout_forum_posts_title);
            if (findChildViewById2 != null) {
                MgForumTitleLayoutBinding bind2 = MgForumTitleLayoutBinding.bind(findChildViewById2);
                i4 = R.id.loadingView;
                ForumLoadingView forumLoadingView = (ForumLoadingView) ViewBindings.findChildViewById(view, R.id.loadingView);
                if (forumLoadingView != null) {
                    i4 = R.id.mg_forum_profile_message_list;
                    XListView xListView = (XListView) ViewBindings.findChildViewById(view, R.id.mg_forum_profile_message_list);
                    if (xListView != null) {
                        return new MgForumProfileMessageReplyActivityBinding((KeyboardListenLayout) view, bind, bind2, forumLoadingView, xListView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumProfileMessageReplyActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public KeyboardListenLayout getRoot() {
        return this.f24222b;
    }

    @NonNull
    public static MgForumProfileMessageReplyActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_profile_message_reply_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
