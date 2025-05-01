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
public final class PartDiscoveryHeaderV4Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25914b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f25915c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f25916d;

    private PartDiscoveryHeaderV4Binding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView) {
        this.f25914b = linearLayout;
        this.f25915c = linearLayout2;
        this.f25916d = imageView;
    }

    @NonNull
    public static PartDiscoveryHeaderV4Binding bind(@NonNull View view) {
        int i4 = R.id.llHeader;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llHeader);
        if (linearLayout != null) {
            i4 = R.id.tvTitleForum;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.tvTitleForum);
            if (imageView != null) {
                return new PartDiscoveryHeaderV4Binding((LinearLayout) view, linearLayout, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PartDiscoveryHeaderV4Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25914b;
    }

    @NonNull
    public static PartDiscoveryHeaderV4Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.part_discovery_header_v4, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
