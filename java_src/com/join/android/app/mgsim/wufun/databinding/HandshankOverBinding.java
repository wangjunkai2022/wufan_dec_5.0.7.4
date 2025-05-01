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
public final class HandshankOverBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f21416b;

    private HandshankOverBinding(@NonNull FrameLayout frameLayout) {
        this.f21416b = frameLayout;
    }

    @NonNull
    public static HandshankOverBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new HandshankOverBinding((FrameLayout) view);
    }

    @NonNull
    public static HandshankOverBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f21416b;
    }

    @NonNull
    public static HandshankOverBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.handshank_over, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
