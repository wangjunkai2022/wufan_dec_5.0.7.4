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
import com.join.mgps.ptr.PtrClassicFrameLayout;
/* loaded from: classes3.dex */
public final class FragmentRankItemV2Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f20077b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f20078c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final PtrClassicFrameLayout f20079d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f20080e;

    private FragmentRankItemV2Binding(@NonNull RelativeLayout relativeLayout, @NonNull RecyclerView recyclerView, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull RelativeLayout relativeLayout2) {
        this.f20077b = relativeLayout;
        this.f20078c = recyclerView;
        this.f20079d = ptrClassicFrameLayout;
        this.f20080e = relativeLayout2;
    }

    @NonNull
    public static FragmentRankItemV2Binding bind(@NonNull View view) {
        int i4 = R.id.classifyListView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.classifyListView);
        if (recyclerView != null) {
            i4 = R.id.mPtrFrame;
            PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
            if (ptrClassicFrameLayout != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                return new FragmentRankItemV2Binding(relativeLayout, recyclerView, ptrClassicFrameLayout, relativeLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentRankItemV2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f20077b;
    }

    @NonNull
    public static FragmentRankItemV2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_rank_item_v2, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
