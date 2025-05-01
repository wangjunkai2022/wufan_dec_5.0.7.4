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
public final class PapabiGonglueLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25644b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f25645c;

    private PapabiGonglueLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView) {
        this.f25644b = linearLayout;
        this.f25645c = imageView;
    }

    @NonNull
    public static PapabiGonglueLayoutBinding bind(@NonNull View view) {
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.lodingBackImage);
        if (imageView != null) {
            return new PapabiGonglueLayoutBinding((LinearLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.lodingBackImage)));
    }

    @NonNull
    public static PapabiGonglueLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25644b;
    }

    @NonNull
    public static PapabiGonglueLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.papabi_gonglue_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
