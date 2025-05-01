package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DiscoverLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f19086b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f19087c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f19088d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final FrameLayout f19089e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f19090f;

    private DiscoverLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull FrameLayout frameLayout, @NonNull RelativeLayout relativeLayout2) {
        this.f19086b = relativeLayout;
        this.f19087c = imageView;
        this.f19088d = imageView2;
        this.f19089e = frameLayout;
        this.f19090f = relativeLayout2;
    }

    @NonNull
    public static DiscoverLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.btnBack;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.btnBack);
        if (imageView != null) {
            i4 = R.id.download_bg;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.download_bg);
            if (imageView2 != null) {
                i4 = R.id.frameLayout;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.frameLayout);
                if (frameLayout != null) {
                    i4 = R.id.layoutBack;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.layoutBack);
                    if (relativeLayout != null) {
                        return new DiscoverLayoutBinding((RelativeLayout) view, imageView, imageView2, frameLayout, relativeLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DiscoverLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f19086b;
    }

    @NonNull
    public static DiscoverLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.discover_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
