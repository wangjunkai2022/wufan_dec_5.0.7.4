package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FragmentEndGameDiscoveryBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f19749b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f19750c;

    private FragmentEndGameDiscoveryBinding(@NonNull FrameLayout frameLayout, @NonNull RecyclerView recyclerView) {
        this.f19749b = frameLayout;
        this.f19750c = recyclerView;
    }

    @NonNull
    public static FragmentEndGameDiscoveryBinding bind(@NonNull View view) {
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvList);
        if (recyclerView != null) {
            return new FragmentEndGameDiscoveryBinding((FrameLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.rvList)));
    }

    @NonNull
    public static FragmentEndGameDiscoveryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f19749b;
    }

    @NonNull
    public static FragmentEndGameDiscoveryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_end_game_discovery, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
