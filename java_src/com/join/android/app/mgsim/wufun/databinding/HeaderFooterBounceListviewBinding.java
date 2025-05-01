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
public final class HeaderFooterBounceListviewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21455b;

    private HeaderFooterBounceListviewBinding(@NonNull LinearLayout linearLayout) {
        this.f21455b = linearLayout;
    }

    @NonNull
    public static HeaderFooterBounceListviewBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new HeaderFooterBounceListviewBinding((LinearLayout) view);
    }

    @NonNull
    public static HeaderFooterBounceListviewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21455b;
    }

    @NonNull
    public static HeaderFooterBounceListviewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.header_footer_bounce_listview, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
