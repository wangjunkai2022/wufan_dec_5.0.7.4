package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class CommentDetailHeadViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18123b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f18124c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f18125d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f18126e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18127f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f18128g;

    private CommentDetailHeadViewBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull View view) {
        this.f18123b = linearLayout;
        this.f18124c = simpleDraweeView;
        this.f18125d = imageView;
        this.f18126e = linearLayout2;
        this.f18127f = textView;
        this.f18128g = view;
    }

    @NonNull
    public static CommentDetailHeadViewBinding bind(@NonNull View view) {
        int i4 = R.id.appIcon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.appIcon);
        if (simpleDraweeView != null) {
            i4 = R.id.arrow;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.arrow);
            if (imageView != null) {
                i4 = R.id.commentDetailTopLl;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.commentDetailTopLl);
                if (linearLayout != null) {
                    i4 = R.id.gameName;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.gameName);
                    if (textView != null) {
                        i4 = R.id.line;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
                        if (findChildViewById != null) {
                            return new CommentDetailHeadViewBinding((LinearLayout) view, simpleDraweeView, imageView, linearLayout, textView, findChildViewById);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static CommentDetailHeadViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18123b;
    }

    @NonNull
    public static CommentDetailHeadViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.comment_detail_head_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
