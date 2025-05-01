package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemMessageFeedbackReplyBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f22448b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f22449c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f22450d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f22451e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f22452f;

    private ItemMessageFeedbackReplyBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f22448b = constraintLayout;
        this.f22449c = simpleDraweeView;
        this.f22450d = textView;
        this.f22451e = textView2;
        this.f22452f = textView3;
    }

    @NonNull
    public static ItemMessageFeedbackReplyBinding bind(@NonNull View view) {
        int i4 = R.id.avatar;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.avatar);
        if (simpleDraweeView != null) {
            i4 = R.id.tvDesc;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvDesc);
            if (textView != null) {
                i4 = R.id.tvTime;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTime);
                if (textView2 != null) {
                    i4 = R.id.tvUserName;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvUserName);
                    if (textView3 != null) {
                        return new ItemMessageFeedbackReplyBinding((ConstraintLayout) view, simpleDraweeView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemMessageFeedbackReplyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f22448b;
    }

    @NonNull
    public static ItemMessageFeedbackReplyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_message_feedback_reply, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
