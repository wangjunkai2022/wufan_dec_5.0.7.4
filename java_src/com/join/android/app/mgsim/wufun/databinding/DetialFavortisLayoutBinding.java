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
import it.sephiroth.android.library.widget.HListView;
/* loaded from: classes3.dex */
public final class DetialFavortisLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18426b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final HListView f18427c;

    private DetialFavortisLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull HListView hListView) {
        this.f18426b = linearLayout;
        this.f18427c = hListView;
    }

    @NonNull
    public static DetialFavortisLayoutBinding bind(@NonNull View view) {
        HListView hListView = (HListView) ViewBindings.findChildViewById(view, R.id.favoriteList);
        if (hListView != null) {
            return new DetialFavortisLayoutBinding((LinearLayout) view, hListView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.favoriteList)));
    }

    @NonNull
    public static DetialFavortisLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18426b;
    }

    @NonNull
    public static DetialFavortisLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.detial_favortis_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
