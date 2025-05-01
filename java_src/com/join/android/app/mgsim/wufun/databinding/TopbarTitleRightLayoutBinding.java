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
public final class TopbarTitleRightLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26789b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f26790c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26791d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26792e;

    private TopbarTitleRightLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f26789b = relativeLayout;
        this.f26790c = imageView;
        this.f26791d = textView;
        this.f26792e = textView2;
    }

    @NonNull
    public static TopbarTitleRightLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.back_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back_image);
        if (imageView != null) {
            i4 = R.id.textTopRight;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textTopRight);
            if (textView != null) {
                i4 = R.id.title_textview;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.title_textview);
                if (textView2 != null) {
                    return new TopbarTitleRightLayoutBinding((RelativeLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static TopbarTitleRightLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26789b;
    }

    @NonNull
    public static TopbarTitleRightLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.topbar_title_right_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
