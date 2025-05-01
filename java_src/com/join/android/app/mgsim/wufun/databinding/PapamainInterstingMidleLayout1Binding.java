package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.HorizontalRecyclerView;
/* loaded from: classes3.dex */
public final class PapamainInterstingMidleLayout1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f25750b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final HorizontalRecyclerView f25751c;

    private PapamainInterstingMidleLayout1Binding(@NonNull RelativeLayout relativeLayout, @NonNull HorizontalRecyclerView horizontalRecyclerView) {
        this.f25750b = relativeLayout;
        this.f25751c = horizontalRecyclerView;
    }

    @NonNull
    public static PapamainInterstingMidleLayout1Binding bind(@NonNull View view) {
        HorizontalRecyclerView horizontalRecyclerView = (HorizontalRecyclerView) ViewBindings.findChildViewById(view, R.id.hrecyclerview);
        if (horizontalRecyclerView != null) {
            return new PapamainInterstingMidleLayout1Binding((RelativeLayout) view, horizontalRecyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.hrecyclerview)));
    }

    @NonNull
    public static PapamainInterstingMidleLayout1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f25750b;
    }

    @NonNull
    public static PapamainInterstingMidleLayout1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.papamain_intersting_midle_layout1, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
