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
public final class SlidingTabItemGameDetailImageV1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f26632b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26633c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f26634d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f26635e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26636f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f26637g;

    private SlidingTabItemGameDetailImageV1Binding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LinearLayout linearLayout, @NonNull TextView textView2, @NonNull ImageView imageView) {
        this.f26632b = constraintLayout;
        this.f26633c = textView;
        this.f26634d = simpleDraweeView;
        this.f26635e = linearLayout;
        this.f26636f = textView2;
        this.f26637g = imageView;
    }

    @NonNull
    public static SlidingTabItemGameDetailImageV1Binding bind(@NonNull View view) {
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
                            return new SlidingTabItemGameDetailImageV1Binding((ConstraintLayout) view, textView, simpleDraweeView, linearLayout, textView2, imageView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static SlidingTabItemGameDetailImageV1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f26632b;
    }

    @NonNull
    public static SlidingTabItemGameDetailImageV1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.sliding_tab_item_game_detail_image_v1, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
