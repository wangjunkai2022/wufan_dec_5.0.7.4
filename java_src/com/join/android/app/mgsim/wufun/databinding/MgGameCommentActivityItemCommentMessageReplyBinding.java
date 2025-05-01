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
/* loaded from: classes3.dex */
public final class MgGameCommentActivityItemCommentMessageReplyBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24421b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f24422c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f24423d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f24424e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f24425f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f24426g;

    private MgGameCommentActivityItemCommentMessageReplyBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull LinearLayout linearLayout2, @NonNull View view2, @NonNull View view3, @NonNull LinearLayout linearLayout3) {
        this.f24421b = linearLayout;
        this.f24422c = view;
        this.f24423d = linearLayout2;
        this.f24424e = view2;
        this.f24425f = view3;
        this.f24426g = linearLayout3;
    }

    @NonNull
    public static MgGameCommentActivityItemCommentMessageReplyBinding bind(@NonNull View view) {
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
                        i4 = R.id.parentLayout;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.parentLayout);
                        if (linearLayout2 != null) {
                            return new MgGameCommentActivityItemCommentMessageReplyBinding((LinearLayout) view, findChildViewById, linearLayout, findChildViewById2, findChildViewById3, linearLayout2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgGameCommentActivityItemCommentMessageReplyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24421b;
    }

    @NonNull
    public static MgGameCommentActivityItemCommentMessageReplyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_game_comment_activity_item_comment_message_reply, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
