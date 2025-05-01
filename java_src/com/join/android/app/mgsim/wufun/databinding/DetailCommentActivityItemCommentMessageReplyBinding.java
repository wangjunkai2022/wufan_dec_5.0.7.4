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
public final class DetailCommentActivityItemCommentMessageReplyBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18373b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f18374c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f18375d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f18376e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f18377f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f18378g;

    private DetailCommentActivityItemCommentMessageReplyBinding(@NonNull RelativeLayout relativeLayout, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull View view2, @NonNull View view3, @NonNull LinearLayout linearLayout2) {
        this.f18373b = relativeLayout;
        this.f18374c = view;
        this.f18375d = linearLayout;
        this.f18376e = view2;
        this.f18377f = view3;
        this.f18378g = linearLayout2;
    }

    @NonNull
    public static DetailCommentActivityItemCommentMessageReplyBinding bind(@NonNull View view) {
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
                            return new DetailCommentActivityItemCommentMessageReplyBinding((RelativeLayout) view, findChildViewById, linearLayout, findChildViewById2, findChildViewById3, linearLayout2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DetailCommentActivityItemCommentMessageReplyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18373b;
    }

    @NonNull
    public static DetailCommentActivityItemCommentMessageReplyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.detail_comment_activity_item_comment_message_reply, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
