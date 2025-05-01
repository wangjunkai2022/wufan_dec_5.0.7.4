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
public final class NetBattleCountdownActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25388b;

    private NetBattleCountdownActivityBinding(@NonNull LinearLayout linearLayout) {
        this.f25388b = linearLayout;
    }

    @NonNull
    public static NetBattleCountdownActivityBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new NetBattleCountdownActivityBinding((LinearLayout) view);
    }

    @NonNull
    public static NetBattleCountdownActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25388b;
    }

    @NonNull
    public static NetBattleCountdownActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.net_battle_countdown_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
