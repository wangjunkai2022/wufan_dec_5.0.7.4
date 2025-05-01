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
public final class FragmentEndGameSelectBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f19756b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f19757c;

    private FragmentEndGameSelectBinding(@NonNull FrameLayout frameLayout, @NonNull RecyclerView recyclerView) {
        this.f19756b = frameLayout;
        this.f19757c = recyclerView;
    }

    @NonNull
    public static FragmentEndGameSelectBinding bind(@NonNull View view) {
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvList);
        if (recyclerView != null) {
            return new FragmentEndGameSelectBinding((FrameLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.rvList)));
    }

    @NonNull
    public static FragmentEndGameSelectBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f19756b;
    }

    @NonNull
    public static FragmentEndGameSelectBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_end_game_select, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
