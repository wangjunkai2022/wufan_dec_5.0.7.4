package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.component.xrecyclerview.XQuickRecyclerView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FragmentSearchGameListBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f20085b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final XQuickRecyclerView f20086c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final MgForumSearchItemAllNoMoreBinding f20087d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ItemSearchNoGameMiniProgramBinding f20088e;

    private FragmentSearchGameListBinding(@NonNull ConstraintLayout constraintLayout, @NonNull XQuickRecyclerView xQuickRecyclerView, @NonNull MgForumSearchItemAllNoMoreBinding mgForumSearchItemAllNoMoreBinding, @NonNull ItemSearchNoGameMiniProgramBinding itemSearchNoGameMiniProgramBinding) {
        this.f20085b = constraintLayout;
        this.f20086c = xQuickRecyclerView;
        this.f20087d = mgForumSearchItemAllNoMoreBinding;
        this.f20088e = itemSearchNoGameMiniProgramBinding;
    }

    @NonNull
    public static FragmentSearchGameListBinding bind(@NonNull View view) {
        int i4 = R.id.rv_list_data;
        XQuickRecyclerView xQuickRecyclerView = (XQuickRecyclerView) ViewBindings.findChildViewById(view, R.id.rv_list_data);
        if (xQuickRecyclerView != null) {
            i4 = R.id.v_no_data;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.v_no_data);
            if (findChildViewById != null) {
                MgForumSearchItemAllNoMoreBinding bind = MgForumSearchItemAllNoMoreBinding.bind(findChildViewById);
                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.v_pd_view);
                if (findChildViewById2 != null) {
                    return new FragmentSearchGameListBinding((ConstraintLayout) view, xQuickRecyclerView, bind, ItemSearchNoGameMiniProgramBinding.bind(findChildViewById2));
                }
                i4 = R.id.v_pd_view;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentSearchGameListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f20085b;
    }

    @NonNull
    public static FragmentSearchGameListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_search_game_list, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
