package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.join.android.app.mgsim.wufun.R;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class DetialMoreInformationItemImageLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18475b;

    private DetialMoreInformationItemImageLayoutBinding(@NonNull LinearLayout linearLayout) {
        this.f18475b = linearLayout;
    }

    @NonNull
    public static DetialMoreInformationItemImageLayoutBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new DetialMoreInformationItemImageLayoutBinding((LinearLayout) view);
    }

    @NonNull
    public static DetialMoreInformationItemImageLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18475b;
    }

    @NonNull
    public static DetialMoreInformationItemImageLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.detial_more_information_item_image_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
