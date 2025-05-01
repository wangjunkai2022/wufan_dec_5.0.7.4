package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class GamedetialMoreStrategyTableBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21090b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f21091c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f21092d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f21093e;

    private GamedetialMoreStrategyTableBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull View view, @NonNull LinearLayout linearLayout3) {
        this.f21090b = linearLayout;
        this.f21091c = linearLayout2;
        this.f21092d = view;
        this.f21093e = linearLayout3;
    }

    @NonNull
    public static GamedetialMoreStrategyTableBinding bind(@NonNull View view) {
        int i4 = R.id.group;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.group);
        if (linearLayout != null) {
            i4 = R.id.line;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
            if (findChildViewById != null) {
                LinearLayout linearLayout2 = (LinearLayout) view;
                return new GamedetialMoreStrategyTableBinding(linearLayout2, linearLayout, findChildViewById, linearLayout2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GamedetialMoreStrategyTableBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21090b;
    }

    @NonNull
    public static GamedetialMoreStrategyTableBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetial_more_strategy_table, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
