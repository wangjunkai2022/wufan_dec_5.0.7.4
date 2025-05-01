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
public final class ModgameModtabFragmentLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25151b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f25152c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f25153d;

    private ModgameModtabFragmentLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.f25151b = linearLayout;
        this.f25152c = recyclerView;
        this.f25153d = recyclerView2;
    }

    @NonNull
    public static ModgameModtabFragmentLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.rv_cheat_list;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_cheat_list);
        if (recyclerView != null) {
            i4 = R.id.rv_cheat_type;
            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_cheat_type);
            if (recyclerView2 != null) {
                return new ModgameModtabFragmentLayoutBinding((LinearLayout) view, recyclerView, recyclerView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ModgameModtabFragmentLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25151b;
    }

    @NonNull
    public static ModgameModtabFragmentLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.modgame_modtab_fragment_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
