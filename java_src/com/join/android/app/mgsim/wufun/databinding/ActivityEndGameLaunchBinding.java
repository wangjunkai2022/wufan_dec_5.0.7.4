package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityEndGameLaunchBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f16056b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f16057c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f16058d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f16059e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final FrameLayout f16060f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f16061g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f16062h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f16063i;

    private ActivityEndGameLaunchBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView3, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f16056b = constraintLayout;
        this.f16057c = simpleDraweeView;
        this.f16058d = imageView;
        this.f16059e = imageView2;
        this.f16060f = frameLayout;
        this.f16061g = imageView3;
        this.f16062h = textView;
        this.f16063i = textView2;
    }

    @NonNull
    public static ActivityEndGameLaunchBinding bind(@NonNull View view) {
        int i4 = R.id.ivGameIcon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ivGameIcon);
        if (simpleDraweeView != null) {
            i4 = R.id.line1;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.line1);
            if (imageView != null) {
                i4 = R.id.line2;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.line2);
                if (imageView2 != null) {
                    i4 = R.id.progress;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.progress);
                    if (frameLayout != null) {
                        i4 = R.id.progressBorder;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.progressBorder);
                        if (imageView3 != null) {
                            i4 = R.id.subTitle;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.subTitle);
                            if (textView != null) {
                                i4 = R.id.tvLoading;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLoading);
                                if (textView2 != null) {
                                    return new ActivityEndGameLaunchBinding((ConstraintLayout) view, simpleDraweeView, imageView, imageView2, frameLayout, imageView3, textView, textView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityEndGameLaunchBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f16056b;
    }

    @NonNull
    public static ActivityEndGameLaunchBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_end_game_launch, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
