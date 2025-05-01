package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.swiperefresh.SwipeRefresh;
/* loaded from: classes3.dex */
public final class DiscoveryTabFragmentLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19117b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final XRecyclerView f19118c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SwipeRefresh f19119d;

    private DiscoveryTabFragmentLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull XRecyclerView xRecyclerView, @NonNull SwipeRefresh swipeRefresh) {
        this.f19117b = linearLayout;
        this.f19118c = xRecyclerView;
        this.f19119d = swipeRefresh;
    }

    @NonNull
    public static DiscoveryTabFragmentLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.recyclerView;
        XRecyclerView xRecyclerView = (XRecyclerView) ViewBindings.findChildViewById(view, R.id.recyclerView);
        if (xRecyclerView != null) {
            i4 = R.id.refreshx;
            SwipeRefresh swipeRefresh = (SwipeRefresh) ViewBindings.findChildViewById(view, R.id.refreshx);
            if (swipeRefresh != null) {
                return new DiscoveryTabFragmentLayoutBinding((LinearLayout) view, xRecyclerView, swipeRefresh);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DiscoveryTabFragmentLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19117b;
    }

    @NonNull
    public static DiscoveryTabFragmentLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.discovery_tab_fragment_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
