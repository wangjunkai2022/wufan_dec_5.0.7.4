package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class InformationTopItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21570b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f21571c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f21572d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f21573e;

    private InformationTopItemBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3) {
        this.f21570b = linearLayout;
        this.f21571c = imageView;
        this.f21572d = imageView2;
        this.f21573e = imageView3;
    }

    @NonNull
    public static InformationTopItemBinding bind(@NonNull View view) {
        int i4 = R.id.imageBottom;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageBottom);
        if (imageView != null) {
            i4 = R.id.imageLeft;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageLeft);
            if (imageView2 != null) {
                i4 = R.id.imageTop;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageTop);
                if (imageView3 != null) {
                    return new InformationTopItemBinding((LinearLayout) view, imageView, imageView2, imageView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static InformationTopItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21570b;
    }

    @NonNull
    public static InformationTopItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.information_top_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
