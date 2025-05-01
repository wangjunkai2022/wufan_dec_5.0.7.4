package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class TopbarPostingLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26775b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f26776c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f26777d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f26778e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f26779f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f26780g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f26781h;

    private TopbarPostingLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull Button button, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout, @NonNull TextView textView) {
        this.f26775b = relativeLayout;
        this.f26776c = imageView;
        this.f26777d = button;
        this.f26778e = imageView2;
        this.f26779f = imageView3;
        this.f26780g = linearLayout;
        this.f26781h = textView;
    }

    @NonNull
    public static TopbarPostingLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.back_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back_image);
        if (imageView != null) {
            i4 = R.id.btnSubmit;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnSubmit);
            if (button != null) {
                i4 = R.id.iv_posting_location;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_posting_location);
                if (imageView2 != null) {
                    i4 = R.id.iv_posting_select;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_posting_select);
                    if (imageView3 != null) {
                        i4 = R.id.ll_top_center;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_top_center);
                        if (linearLayout != null) {
                            i4 = R.id.tv_posting_group;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_posting_group);
                            if (textView != null) {
                                return new TopbarPostingLayoutBinding((RelativeLayout) view, imageView, button, imageView2, imageView3, linearLayout, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static TopbarPostingLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26775b;
    }

    @NonNull
    public static TopbarPostingLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.topbar_posting_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
