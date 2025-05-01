package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ScreenshortListFragmentLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26303b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final XRecyclerView f26304c;

    private ScreenshortListFragmentLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull XRecyclerView xRecyclerView) {
        this.f26303b = relativeLayout;
        this.f26304c = xRecyclerView;
    }

    @NonNull
    public static ScreenshortListFragmentLayoutBinding bind(@NonNull View view) {
        XRecyclerView xRecyclerView = (XRecyclerView) ViewBindings.findChildViewById(view, R.id.recycleView);
        if (xRecyclerView != null) {
            return new ScreenshortListFragmentLayoutBinding((RelativeLayout) view, xRecyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.recycleView)));
    }

    @NonNull
    public static ScreenshortListFragmentLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26303b;
    }

    @NonNull
    public static ScreenshortListFragmentLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.screenshort_list_fragment_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
