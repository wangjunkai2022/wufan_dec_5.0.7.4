package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.HorizontalRecyclerView;
/* loaded from: classes3.dex */
public final class PapamainItemRecommendStyle2Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f25759b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final HorizontalRecyclerView f25760c;

    private PapamainItemRecommendStyle2Binding(@NonNull FrameLayout frameLayout, @NonNull HorizontalRecyclerView horizontalRecyclerView) {
        this.f25759b = frameLayout;
        this.f25760c = horizontalRecyclerView;
    }

    @NonNull
    public static PapamainItemRecommendStyle2Binding bind(@NonNull View view) {
        HorizontalRecyclerView horizontalRecyclerView = (HorizontalRecyclerView) ViewBindings.findChildViewById(view, R.id.recyclerView);
        if (horizontalRecyclerView != null) {
            return new PapamainItemRecommendStyle2Binding((FrameLayout) view, horizontalRecyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.recyclerView)));
    }

    @NonNull
    public static PapamainItemRecommendStyle2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f25759b;
    }

    @NonNull
    public static PapamainItemRecommendStyle2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.papamain_item_recommend_style2, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
