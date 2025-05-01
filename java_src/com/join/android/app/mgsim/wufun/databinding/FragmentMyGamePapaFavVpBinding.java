package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.NestedScrollableHost;
/* loaded from: classes3.dex */
public final class FragmentMyGamePapaFavVpBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f20007b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final NestedScrollableHost f20008c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f20009d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ViewPager2 f20010e;

    private FragmentMyGamePapaFavVpBinding(@NonNull ConstraintLayout constraintLayout, @NonNull NestedScrollableHost nestedScrollableHost, @NonNull RecyclerView recyclerView, @NonNull ViewPager2 viewPager2) {
        this.f20007b = constraintLayout;
        this.f20008c = nestedScrollableHost;
        this.f20009d = recyclerView;
        this.f20010e = viewPager2;
    }

    @NonNull
    public static FragmentMyGamePapaFavVpBinding bind(@NonNull View view) {
        int i4 = R.id.nsTags;
        NestedScrollableHost nestedScrollableHost = (NestedScrollableHost) ViewBindings.findChildViewById(view, R.id.nsTags);
        if (nestedScrollableHost != null) {
            i4 = R.id.rvTags;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvTags);
            if (recyclerView != null) {
                i4 = R.id.vp;
                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, R.id.vp);
                if (viewPager2 != null) {
                    return new FragmentMyGamePapaFavVpBinding((ConstraintLayout) view, nestedScrollableHost, recyclerView, viewPager2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentMyGamePapaFavVpBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f20007b;
    }

    @NonNull
    public static FragmentMyGamePapaFavVpBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_my_game_papa_fav_vp, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
