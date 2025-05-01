package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FragmentModIntroductionListForSimulatorBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19895b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f19896c;

    private FragmentModIntroductionListForSimulatorBinding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView) {
        this.f19895b = linearLayout;
        this.f19896c = recyclerView;
    }

    @NonNull
    public static FragmentModIntroductionListForSimulatorBinding bind(@NonNull View view) {
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_list_data);
        if (recyclerView != null) {
            return new FragmentModIntroductionListForSimulatorBinding((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.rv_list_data)));
    }

    @NonNull
    public static FragmentModIntroductionListForSimulatorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19895b;
    }

    @NonNull
    public static FragmentModIntroductionListForSimulatorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mod_introduction_list_for_simulator, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
