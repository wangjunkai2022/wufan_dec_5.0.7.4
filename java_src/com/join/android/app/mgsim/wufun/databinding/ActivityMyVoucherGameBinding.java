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
public final class ActivityMyVoucherGameBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f16657b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f16658c;

    private ActivityMyVoucherGameBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2) {
        this.f16657b = linearLayout;
        this.f16658c = linearLayout2;
    }

    @NonNull
    public static ActivityMyVoucherGameBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        LinearLayout linearLayout = (LinearLayout) view;
        return new ActivityMyVoucherGameBinding(linearLayout, linearLayout);
    }

    @NonNull
    public static ActivityMyVoucherGameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f16657b;
    }

    @NonNull
    public static ActivityMyVoucherGameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_my_voucher_game, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
