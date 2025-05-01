package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.TextViewWithHyperlink;
/* loaded from: classes3.dex */
public final class CommentReplyItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18221b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextViewWithHyperlink f18222c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18223d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18224e;

    private CommentReplyItemBinding(@NonNull LinearLayout linearLayout, @NonNull TextViewWithHyperlink textViewWithHyperlink, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f18221b = linearLayout;
        this.f18222c = textViewWithHyperlink;
        this.f18223d = textView;
        this.f18224e = textView2;
    }

    @NonNull
    public static CommentReplyItemBinding bind(@NonNull View view) {
        int i4 = R.id.comment_reply_content;
        TextViewWithHyperlink textViewWithHyperlink = (TextViewWithHyperlink) ViewBindings.findChildViewById(view, R.id.comment_reply_content);
        if (textViewWithHyperlink != null) {
            i4 = R.id.comment_reply_more;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.comment_reply_more);
            if (textView != null) {
                i4 = R.id.tvReplyName;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvReplyName);
                if (textView2 != null) {
                    return new CommentReplyItemBinding((LinearLayout) view, textViewWithHyperlink, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static CommentReplyItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18221b;
    }

    @NonNull
    public static CommentReplyItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.comment_reply_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
