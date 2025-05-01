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
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.ptr.PtrClassicFrameLayout;
/* loaded from: classes3.dex */
public final class FindgameClassfyFragmentLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19502b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final XRecyclerView f19503c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final FailedLayoutIncludeBinding f19504d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final PtrClassicFrameLayout f19505e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LodingLayoutIncludeBinding f19506f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RecyclerView f19507g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final XRecyclerView f19508h;

    private FindgameClassfyFragmentLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull XRecyclerView xRecyclerView, @NonNull FailedLayoutIncludeBinding failedLayoutIncludeBinding, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull LodingLayoutIncludeBinding lodingLayoutIncludeBinding, @NonNull RecyclerView recyclerView, @NonNull XRecyclerView xRecyclerView2) {
        this.f19502b = linearLayout;
        this.f19503c = xRecyclerView;
        this.f19504d = failedLayoutIncludeBinding;
        this.f19505e = ptrClassicFrameLayout;
        this.f19506f = lodingLayoutIncludeBinding;
        this.f19507g = recyclerView;
        this.f19508h = xRecyclerView2;
    }

    @NonNull
    public static FindgameClassfyFragmentLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.dataList;
        XRecyclerView xRecyclerView = (XRecyclerView) ViewBindings.findChildViewById(view, R.id.dataList);
        if (xRecyclerView != null) {
            i4 = R.id.failedLayoutMain;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.failedLayoutMain);
            if (findChildViewById != null) {
                FailedLayoutIncludeBinding bind = FailedLayoutIncludeBinding.bind(findChildViewById);
                i4 = R.id.ll_main;
                PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.ll_main);
                if (ptrClassicFrameLayout != null) {
                    i4 = R.id.loadingLayoutMain;
                    View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.loadingLayoutMain);
                    if (findChildViewById2 != null) {
                        LodingLayoutIncludeBinding bind2 = LodingLayoutIncludeBinding.bind(findChildViewById2);
                        i4 = R.id.tabLayout;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.tabLayout);
                        if (recyclerView != null) {
                            i4 = R.id.typeList;
                            XRecyclerView xRecyclerView2 = (XRecyclerView) ViewBindings.findChildViewById(view, R.id.typeList);
                            if (xRecyclerView2 != null) {
                                return new FindgameClassfyFragmentLayoutBinding((LinearLayout) view, xRecyclerView, bind, ptrClassicFrameLayout, bind2, recyclerView, xRecyclerView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FindgameClassfyFragmentLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19502b;
    }

    @NonNull
    public static FindgameClassfyFragmentLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.findgame_classfy_fragment_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
