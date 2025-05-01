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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class InformationCommentItemLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21555b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21556c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f21557d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f21558e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f21559f;

    private InformationCommentItemLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView3) {
        this.f21555b = linearLayout;
        this.f21556c = textView;
        this.f21557d = textView2;
        this.f21558e = simpleDraweeView;
        this.f21559f = textView3;
    }

    @NonNull
    public static InformationCommentItemLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.message;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.message);
        if (textView != null) {
            i4 = R.id.time;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.time);
            if (textView2 != null) {
                i4 = R.id.userIcon;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.userIcon);
                if (simpleDraweeView != null) {
                    i4 = R.id.userName;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.userName);
                    if (textView3 != null) {
                        return new InformationCommentItemLayoutBinding((LinearLayout) view, textView, textView2, simpleDraweeView, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static InformationCommentItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21555b;
    }

    @NonNull
    public static InformationCommentItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.information_comment_item__layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
