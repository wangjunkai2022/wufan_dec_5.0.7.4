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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ForumPostsActivityFunctionsItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19547b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f19548c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f19549d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f19550e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f19551f;

    private ForumPostsActivityFunctionsItemBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull View view) {
        this.f19547b = linearLayout;
        this.f19548c = imageView;
        this.f19549d = linearLayout2;
        this.f19550e = textView;
        this.f19551f = view;
    }

    @NonNull
    public static ForumPostsActivityFunctionsItemBinding bind(@NonNull View view) {
        int i4 = R.id.icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.icon);
        if (imageView != null) {
            i4 = R.id.ll_report;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_report);
            if (linearLayout != null) {
                i4 = R.id.name;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                if (textView != null) {
                    i4 = R.id.v_divider;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.v_divider);
                    if (findChildViewById != null) {
                        return new ForumPostsActivityFunctionsItemBinding((LinearLayout) view, imageView, linearLayout, textView, findChildViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ForumPostsActivityFunctionsItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19547b;
    }

    @NonNull
    public static ForumPostsActivityFunctionsItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.forum_posts_activity_functions_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
