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
public final class LayoutForumStickViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23043b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f23044c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f23045d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23046e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f23047f;

    private LayoutForumStickViewBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f23043b = linearLayout;
        this.f23044c = imageView;
        this.f23045d = imageView2;
        this.f23046e = textView;
        this.f23047f = textView2;
    }

    @NonNull
    public static LayoutForumStickViewBinding bind(@NonNull View view) {
        int i4 = R.id.iv_sort;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_sort);
        if (imageView != null) {
            i4 = R.id.iv_view_poster;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_view_poster);
            if (imageView2 != null) {
                i4 = R.id.tv_sort;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sort);
                if (textView != null) {
                    i4 = R.id.view_poster;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.view_poster);
                    if (textView2 != null) {
                        return new LayoutForumStickViewBinding((LinearLayout) view, imageView, imageView2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutForumStickViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23043b;
    }

    @NonNull
    public static LayoutForumStickViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_forum_stick_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
