package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FragmentCollectionModuleSevenBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f19664b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f19665c;

    private FragmentCollectionModuleSevenBinding(@NonNull RelativeLayout relativeLayout, @NonNull RecyclerView recyclerView) {
        this.f19664b = relativeLayout;
        this.f19665c = recyclerView;
    }

    @NonNull
    public static FragmentCollectionModuleSevenBinding bind(@NonNull View view) {
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.breakListView);
        if (recyclerView != null) {
            return new FragmentCollectionModuleSevenBinding((RelativeLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.breakListView)));
    }

    @NonNull
    public static FragmentCollectionModuleSevenBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f19664b;
    }

    @NonNull
    public static FragmentCollectionModuleSevenBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_collection_module_seven, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
