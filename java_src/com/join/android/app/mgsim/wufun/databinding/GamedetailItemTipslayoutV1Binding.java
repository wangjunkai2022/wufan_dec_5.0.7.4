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
public final class GamedetailItemTipslayoutV1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20725b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f20726c;

    private GamedetailItemTipslayoutV1Binding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2) {
        this.f20725b = linearLayout;
        this.f20726c = linearLayout2;
    }

    @NonNull
    public static GamedetailItemTipslayoutV1Binding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tipslayout);
        if (linearLayout != null) {
            return new GamedetailItemTipslayoutV1Binding((LinearLayout) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tipslayout)));
    }

    @NonNull
    public static GamedetailItemTipslayoutV1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20725b;
    }

    @NonNull
    public static GamedetailItemTipslayoutV1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetail_item_tipslayout_v1, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
