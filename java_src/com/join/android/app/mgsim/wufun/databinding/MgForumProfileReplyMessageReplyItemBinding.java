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
public final class MgForumProfileReplyMessageReplyItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f24241b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f24242c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f24243d;

    private MgForumProfileReplyMessageReplyItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull View view) {
        this.f24241b = relativeLayout;
        this.f24242c = linearLayout;
        this.f24243d = view;
    }

    @NonNull
    public static MgForumProfileReplyMessageReplyItemBinding bind(@NonNull View view) {
        int i4 = R.id.comment_reply_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.comment_reply_container);
        if (linearLayout != null) {
            i4 = R.id.comment_reply_divider;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.comment_reply_divider);
            if (findChildViewById != null) {
                return new MgForumProfileReplyMessageReplyItemBinding((RelativeLayout) view, linearLayout, findChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumProfileReplyMessageReplyItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f24241b;
    }

    @NonNull
    public static MgForumProfileReplyMessageReplyItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_profile_reply_message_reply_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
