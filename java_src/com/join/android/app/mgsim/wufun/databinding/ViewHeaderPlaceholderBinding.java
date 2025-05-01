package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.join.android.app.mgsim.wufun.R;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class ViewHeaderPlaceholderBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f27064b;

    private ViewHeaderPlaceholderBinding(@NonNull FrameLayout frameLayout) {
        this.f27064b = frameLayout;
    }

    @NonNull
    public static ViewHeaderPlaceholderBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new ViewHeaderPlaceholderBinding((FrameLayout) view);
    }

    @NonNull
    public static ViewHeaderPlaceholderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f27064b;
    }

    @NonNull
    public static ViewHeaderPlaceholderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.view_header_placeholder, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
