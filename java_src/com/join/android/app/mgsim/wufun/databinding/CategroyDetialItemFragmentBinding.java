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
/* loaded from: classes3.dex */
public final class CategroyDetialItemFragmentBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f17680b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final FailedLayoutIncludeBinding f17681c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LodingLayoutIncludeBinding f17682d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final NoneLayoutIncludeBinding f17683e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final XRecyclerView f17684f;

    private CategroyDetialItemFragmentBinding(@NonNull ConstraintLayout constraintLayout, @NonNull FailedLayoutIncludeBinding failedLayoutIncludeBinding, @NonNull LodingLayoutIncludeBinding lodingLayoutIncludeBinding, @NonNull NoneLayoutIncludeBinding noneLayoutIncludeBinding, @NonNull XRecyclerView xRecyclerView) {
        this.f17680b = constraintLayout;
        this.f17681c = failedLayoutIncludeBinding;
        this.f17682d = lodingLayoutIncludeBinding;
        this.f17683e = noneLayoutIncludeBinding;
        this.f17684f = xRecyclerView;
    }

    @NonNull
    public static CategroyDetialItemFragmentBinding bind(@NonNull View view) {
        int i4 = R.id.failedLayoutMain;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.failedLayoutMain);
        if (findChildViewById != null) {
            FailedLayoutIncludeBinding bind = FailedLayoutIncludeBinding.bind(findChildViewById);
            i4 = R.id.loadingLayoutMain;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.loadingLayoutMain);
            if (findChildViewById2 != null) {
                LodingLayoutIncludeBinding bind2 = LodingLayoutIncludeBinding.bind(findChildViewById2);
                i4 = R.id.noData;
                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.noData);
                if (findChildViewById3 != null) {
                    NoneLayoutIncludeBinding bind3 = NoneLayoutIncludeBinding.bind(findChildViewById3);
                    i4 = R.id.recycleView;
                    XRecyclerView xRecyclerView = (XRecyclerView) ViewBindings.findChildViewById(view, R.id.recycleView);
                    if (xRecyclerView != null) {
                        return new CategroyDetialItemFragmentBinding((ConstraintLayout) view, bind, bind2, bind3, xRecyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static CategroyDetialItemFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f17680b;
    }

    @NonNull
    public static CategroyDetialItemFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.categroy_detial_item_fragment, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
