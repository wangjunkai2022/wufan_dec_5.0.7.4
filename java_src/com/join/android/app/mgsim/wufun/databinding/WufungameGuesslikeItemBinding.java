package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.join.android.app.mgsim.wufun.R;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class WufungameGuesslikeItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f27169b;

    private WufungameGuesslikeItemBinding(@NonNull ConstraintLayout constraintLayout) {
        this.f27169b = constraintLayout;
    }

    @NonNull
    public static WufungameGuesslikeItemBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new WufungameGuesslikeItemBinding((ConstraintLayout) view);
    }

    @NonNull
    public static WufungameGuesslikeItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f27169b;
    }

    @NonNull
    public static WufungameGuesslikeItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.wufungame_guesslike_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
