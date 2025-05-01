package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class TopbarLeftTitleBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26759b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f26760c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f26761d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f26762e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26763f;

    private TopbarLeftTitleBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull View view, @NonNull ImageView imageView2, @NonNull TextView textView) {
        this.f26759b = relativeLayout;
        this.f26760c = imageView;
        this.f26761d = view;
        this.f26762e = imageView2;
        this.f26763f = textView;
    }

    @NonNull
    public static TopbarLeftTitleBinding bind(@NonNull View view) {
        int i4 = R.id.back_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back_image);
        if (imageView != null) {
            i4 = R.id.line;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
            if (findChildViewById != null) {
                i4 = R.id.setting;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.setting);
                if (imageView2 != null) {
                    i4 = R.id.title_textview;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.title_textview);
                    if (textView != null) {
                        return new TopbarLeftTitleBinding((RelativeLayout) view, imageView, findChildViewById, imageView2, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static TopbarLeftTitleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26759b;
    }

    @NonNull
    public static TopbarLeftTitleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.topbar_left_title, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
