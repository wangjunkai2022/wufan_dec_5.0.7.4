package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgForumPostActivityItemCommentMessageReplyBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f24038b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f24039c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f24040d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f24041e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f24042f;

    private MgForumPostActivityItemCommentMessageReplyBinding(@NonNull RelativeLayout relativeLayout, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull View view2, @NonNull View view3) {
        this.f24038b = relativeLayout;
        this.f24039c = view;
        this.f24040d = linearLayout;
        this.f24041e = view2;
        this.f24042f = view3;
    }

    @NonNull
    public static MgForumPostActivityItemCommentMessageReplyBinding bind(@NonNull View view) {
        int i4 = R.id.bottom;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.bottom);
        if (findChildViewById != null) {
            i4 = R.id.comment_reply_container;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.comment_reply_container);
            if (linearLayout != null) {
                i4 = R.id.comment_reply_divider;
                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.comment_reply_divider);
                if (findChildViewById2 != null) {
                    i4 = R.id.line;
                    View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.line);
                    if (findChildViewById3 != null) {
                        return new MgForumPostActivityItemCommentMessageReplyBinding((RelativeLayout) view, findChildViewById, linearLayout, findChildViewById2, findChildViewById3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumPostActivityItemCommentMessageReplyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f24038b;
    }

    @NonNull
    public static MgForumPostActivityItemCommentMessageReplyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_post_activity_item_comment_message_reply, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
