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
public final class ChioceItemChoiceTopBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17725b;

    private ChioceItemChoiceTopBinding(@NonNull LinearLayout linearLayout) {
        this.f17725b = linearLayout;
    }

    @NonNull
    public static ChioceItemChoiceTopBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new ChioceItemChoiceTopBinding((LinearLayout) view);
    }

    @NonNull
    public static ChioceItemChoiceTopBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17725b;
    }

    @NonNull
    public static ChioceItemChoiceTopBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.chioce_item_choice_top, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
