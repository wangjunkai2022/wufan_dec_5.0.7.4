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
/* loaded from: classes3.dex */
public final class EverdayNewFragmentBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19327b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final FailedLayoutIncludeBinding f19328c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LodingLayoutIncludeBinding f19329d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final XRecyclerView f19330e;

    private EverdayNewFragmentBinding(@NonNull LinearLayout linearLayout, @NonNull FailedLayoutIncludeBinding failedLayoutIncludeBinding, @NonNull LodingLayoutIncludeBinding lodingLayoutIncludeBinding, @NonNull XRecyclerView xRecyclerView) {
        this.f19327b = linearLayout;
        this.f19328c = failedLayoutIncludeBinding;
        this.f19329d = lodingLayoutIncludeBinding;
        this.f19330e = xRecyclerView;
    }

    @NonNull
    public static EverdayNewFragmentBinding bind(@NonNull View view) {
        int i4 = R.id.failedLayoutMain;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.failedLayoutMain);
        if (findChildViewById != null) {
            FailedLayoutIncludeBinding bind = FailedLayoutIncludeBinding.bind(findChildViewById);
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.loadingLayoutMain);
            if (findChildViewById2 != null) {
                LodingLayoutIncludeBinding bind2 = LodingLayoutIncludeBinding.bind(findChildViewById2);
                XRecyclerView xRecyclerView = (XRecyclerView) ViewBindings.findChildViewById(view, R.id.recycleView);
                if (xRecyclerView != null) {
                    return new EverdayNewFragmentBinding((LinearLayout) view, bind, bind2, xRecyclerView);
                }
                i4 = R.id.recycleView;
            } else {
                i4 = R.id.loadingLayoutMain;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static EverdayNewFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19327b;
    }

    @NonNull
    public static EverdayNewFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.everday_new_fragment, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
