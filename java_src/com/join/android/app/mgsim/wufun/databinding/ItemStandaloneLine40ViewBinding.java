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
public final class ItemStandaloneLine40ViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22854b;

    private ItemStandaloneLine40ViewBinding(@NonNull LinearLayout linearLayout) {
        this.f22854b = linearLayout;
    }

    @NonNull
    public static ItemStandaloneLine40ViewBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new ItemStandaloneLine40ViewBinding((LinearLayout) view);
    }

    @NonNull
    public static ItemStandaloneLine40ViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22854b;
    }

    @NonNull
    public static ItemStandaloneLine40ViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_standalone_line_40_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
