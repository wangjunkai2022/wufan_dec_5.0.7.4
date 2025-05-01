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
public final class DetialHandSharkItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18462b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f18463c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f18464d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f18465e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18466f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f18467g;

    private DetialHandSharkItemBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f18462b = linearLayout;
        this.f18463c = linearLayout2;
        this.f18464d = imageView;
        this.f18465e = imageView2;
        this.f18466f = textView;
        this.f18467g = textView2;
    }

    @NonNull
    public static DetialHandSharkItemBinding bind(@NonNull View view) {
        int i4 = R.id.handSharkLayout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.handSharkLayout);
        if (linearLayout != null) {
            i4 = R.id.imageView42;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView42);
            if (imageView != null) {
                i4 = R.id.imageView43;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView43);
                if (imageView2 != null) {
                    i4 = R.id.suntitle;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.suntitle);
                    if (textView != null) {
                        i4 = R.id.title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                        if (textView2 != null) {
                            return new DetialHandSharkItemBinding((LinearLayout) view, linearLayout, imageView, imageView2, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DetialHandSharkItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18462b;
    }

    @NonNull
    public static DetialHandSharkItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.detial_hand_shark_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
