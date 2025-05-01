package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.LoadMoreRecyclerView;
/* loaded from: classes3.dex */
public final class AtestfragmentLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f17481b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LoadMoreRecyclerView f17482c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SwipeRefreshLayout f17483d;

    private AtestfragmentLayoutBinding(@NonNull FrameLayout frameLayout, @NonNull LoadMoreRecyclerView loadMoreRecyclerView, @NonNull SwipeRefreshLayout swipeRefreshLayout) {
        this.f17481b = frameLayout;
        this.f17482c = loadMoreRecyclerView;
        this.f17483d = swipeRefreshLayout;
    }

    @NonNull
    public static AtestfragmentLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.recycler_view;
        LoadMoreRecyclerView loadMoreRecyclerView = (LoadMoreRecyclerView) ViewBindings.findChildViewById(view, R.id.recycler_view);
        if (loadMoreRecyclerView != null) {
            i4 = R.id.refresh_layout;
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(view, R.id.refresh_layout);
            if (swipeRefreshLayout != null) {
                return new AtestfragmentLayoutBinding((FrameLayout) view, loadMoreRecyclerView, swipeRefreshLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static AtestfragmentLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f17481b;
    }

    @NonNull
    public static AtestfragmentLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.atestfragment_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
