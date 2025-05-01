package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.FlowLayout;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class MgForumFlowLayoutContainerBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FlowLayout f23821b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final FlowLayout f23822c;

    private MgForumFlowLayoutContainerBinding(@NonNull FlowLayout flowLayout, @NonNull FlowLayout flowLayout2) {
        this.f23821b = flowLayout;
        this.f23822c = flowLayout2;
    }

    @NonNull
    public static MgForumFlowLayoutContainerBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        FlowLayout flowLayout = (FlowLayout) view;
        return new MgForumFlowLayoutContainerBinding(flowLayout, flowLayout);
    }

    @NonNull
    public static MgForumFlowLayoutContainerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FlowLayout getRoot() {
        return this.f23821b;
    }

    @NonNull
    public static MgForumFlowLayoutContainerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_flow_layout_container, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
