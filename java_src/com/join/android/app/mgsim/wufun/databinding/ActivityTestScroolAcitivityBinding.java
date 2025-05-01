package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.swiperefresh.SwipeRefresh;
/* loaded from: classes3.dex */
public final class ActivityTestScroolAcitivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final CoordinatorLayout f17137b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final AppBarLayout f17138c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final CollapsingToolbarLayout f17139d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final FloatingActionButton f17140e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final CoordinatorLayout f17141f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final XRecyclerView f17142g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final SwipeRefresh f17143h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f17144i;

    private ActivityTestScroolAcitivityBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull CollapsingToolbarLayout collapsingToolbarLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull CoordinatorLayout coordinatorLayout2, @NonNull XRecyclerView xRecyclerView, @NonNull SwipeRefresh swipeRefresh, @NonNull ImageView imageView) {
        this.f17137b = coordinatorLayout;
        this.f17138c = appBarLayout;
        this.f17139d = collapsingToolbarLayout;
        this.f17140e = floatingActionButton;
        this.f17141f = coordinatorLayout2;
        this.f17142g = xRecyclerView;
        this.f17143h = swipeRefresh;
        this.f17144i = imageView;
    }

    @NonNull
    public static ActivityTestScroolAcitivityBinding bind(@NonNull View view) {
        int i4 = R.id.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, R.id.appbar);
        if (appBarLayout != null) {
            i4 = R.id.colltoobar;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) ViewBindings.findChildViewById(view, R.id.colltoobar);
            if (collapsingToolbarLayout != null) {
                i4 = R.id.fab;
                FloatingActionButton floatingActionButton = (FloatingActionButton) ViewBindings.findChildViewById(view, R.id.fab);
                if (floatingActionButton != null) {
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                    i4 = R.id.recyclerView;
                    XRecyclerView xRecyclerView = (XRecyclerView) ViewBindings.findChildViewById(view, R.id.recyclerView);
                    if (xRecyclerView != null) {
                        i4 = R.id.refreshx;
                        SwipeRefresh swipeRefresh = (SwipeRefresh) ViewBindings.findChildViewById(view, R.id.refreshx);
                        if (swipeRefresh != null) {
                            i4 = R.id.topImag;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.topImag);
                            if (imageView != null) {
                                return new ActivityTestScroolAcitivityBinding(coordinatorLayout, appBarLayout, collapsingToolbarLayout, floatingActionButton, coordinatorLayout, xRecyclerView, swipeRefresh, imageView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityTestScroolAcitivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public CoordinatorLayout getRoot() {
        return this.f17137b;
    }

    @NonNull
    public static ActivityTestScroolAcitivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_test_scrool_acitivity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
