package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.join.android.app.mgsim.wufun.R;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class ItemSimulatorMomentFooterBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final TextView f22803b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f22804c;

    private ItemSimulatorMomentFooterBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.f22803b = textView;
        this.f22804c = textView2;
    }

    @NonNull
    public static ItemSimulatorMomentFooterBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        TextView textView = (TextView) view;
        return new ItemSimulatorMomentFooterBinding(textView, textView);
    }

    @NonNull
    public static ItemSimulatorMomentFooterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public TextView getRoot() {
        return this.f22803b;
    }

    @NonNull
    public static ItemSimulatorMomentFooterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_simulator_moment_footer, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
