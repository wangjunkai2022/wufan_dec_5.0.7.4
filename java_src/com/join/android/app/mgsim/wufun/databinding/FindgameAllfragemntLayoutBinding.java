package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.ptr.PtrClassicFrameLayout;
/* loaded from: classes3.dex */
public final class FindgameAllfragemntLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f19495b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final FailedLayoutIncludeBinding f19496c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final PtrClassicFrameLayout f19497d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LodingLayoutIncludeBinding f19498e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final XRecyclerView f19499f;

    private FindgameAllfragemntLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull FailedLayoutIncludeBinding failedLayoutIncludeBinding, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull LodingLayoutIncludeBinding lodingLayoutIncludeBinding, @NonNull XRecyclerView xRecyclerView) {
        this.f19495b = constraintLayout;
        this.f19496c = failedLayoutIncludeBinding;
        this.f19497d = ptrClassicFrameLayout;
        this.f19498e = lodingLayoutIncludeBinding;
        this.f19499f = xRecyclerView;
    }

    @NonNull
    public static FindgameAllfragemntLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.failedLayoutMain;
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
                    i4 = R.id.recycleView;
                    XRecyclerView xRecyclerView = (XRecyclerView) ViewBindings.findChildViewById(view, R.id.recycleView);
                    if (xRecyclerView != null) {
                        return new FindgameAllfragemntLayoutBinding((ConstraintLayout) view, bind, ptrClassicFrameLayout, bind2, xRecyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FindgameAllfragemntLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f19495b;
    }

    @NonNull
    public static FindgameAllfragemntLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.findgame_allfragemnt_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
