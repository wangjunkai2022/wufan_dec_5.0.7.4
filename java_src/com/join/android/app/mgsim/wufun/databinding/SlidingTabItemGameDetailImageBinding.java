package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class SlidingTabItemGameDetailImageBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f26626b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26627c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f26628d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f26629e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26630f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f26631g;

    private SlidingTabItemGameDetailImageBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LinearLayout linearLayout, @NonNull TextView textView2, @NonNull ImageView imageView) {
        this.f26626b = constraintLayout;
        this.f26627c = textView;
        this.f26628d = simpleDraweeView;
        this.f26629e = linearLayout;
        this.f26630f = textView2;
        this.f26631g = imageView;
    }

    @NonNull
    public static SlidingTabItemGameDetailImageBinding bind(@NonNull View view) {
        int i4 = R.id.bg;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.bg);
        if (textView != null) {
            i4 = R.id.image;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.image);
            if (simpleDraweeView != null) {
                i4 = R.id.indicator;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.indicator);
                if (linearLayout != null) {
                    i4 = R.id.name;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                    if (textView2 != null) {
                        i4 = R.id.play;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.play);
                        if (imageView != null) {
                            return new SlidingTabItemGameDetailImageBinding((ConstraintLayout) view, textView, simpleDraweeView, linearLayout, textView2, imageView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static SlidingTabItemGameDetailImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f26626b;
    }

    @NonNull
    public static SlidingTabItemGameDetailImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.sliding_tab_item_game_detail_image, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
