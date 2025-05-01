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
public final class NettyClientActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25412b;

    private NettyClientActivityBinding(@NonNull LinearLayout linearLayout) {
        this.f25412b = linearLayout;
    }

    @NonNull
    public static NettyClientActivityBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new NettyClientActivityBinding((LinearLayout) view);
    }

    @NonNull
    public static NettyClientActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25412b;
    }

    @NonNull
    public static NettyClientActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.netty_client_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
