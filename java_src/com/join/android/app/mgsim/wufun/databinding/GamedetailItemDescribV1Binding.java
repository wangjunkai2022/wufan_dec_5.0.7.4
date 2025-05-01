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
import com.join.mgps.customview.ExpandLayout;
/* loaded from: classes3.dex */
public final class GamedetailItemDescribV1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20534b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ExpandLayout f20535c;

    private GamedetailItemDescribV1Binding(@NonNull LinearLayout linearLayout, @NonNull ExpandLayout expandLayout) {
        this.f20534b = linearLayout;
        this.f20535c = expandLayout;
    }

    @NonNull
    public static GamedetailItemDescribV1Binding bind(@NonNull View view) {
        ExpandLayout expandLayout = (ExpandLayout) ViewBindings.findChildViewById(view, R.id.el_view);
        if (expandLayout != null) {
            return new GamedetailItemDescribV1Binding((LinearLayout) view, expandLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.el_view)));
    }

    @NonNull
    public static GamedetailItemDescribV1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20534b;
    }

    @NonNull
    public static GamedetailItemDescribV1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetail_item_describ_v1, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
