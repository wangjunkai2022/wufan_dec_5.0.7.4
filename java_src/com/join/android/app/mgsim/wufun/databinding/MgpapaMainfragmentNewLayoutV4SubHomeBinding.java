package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import com.join.mgps.ptr.PtrClassicFrameLayout;
/* loaded from: classes3.dex */
public final class MgpapaMainfragmentNewLayoutV4SubHomeBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f24872b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f24873c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final PtrClassicFrameLayout f24874d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final XQuickRecyclerView f24875e;

    private MgpapaMainfragmentNewLayoutV4SubHomeBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull XQuickRecyclerView xQuickRecyclerView) {
        this.f24872b = constraintLayout;
        this.f24873c = simpleDraweeView;
        this.f24874d = ptrClassicFrameLayout;
        this.f24875e = xQuickRecyclerView;
    }

    @NonNull
    public static MgpapaMainfragmentNewLayoutV4SubHomeBinding bind(@NonNull View view) {
        int i4 = R.id.ivFloatad;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ivFloatad);
        if (simpleDraweeView != null) {
            i4 = R.id.ptr;
            PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.ptr);
            if (ptrClassicFrameLayout != null) {
                i4 = R.id.recyclerView;
                XQuickRecyclerView xQuickRecyclerView = (XQuickRecyclerView) ViewBindings.findChildViewById(view, R.id.recyclerView);
                if (xQuickRecyclerView != null) {
                    return new MgpapaMainfragmentNewLayoutV4SubHomeBinding((ConstraintLayout) view, simpleDraweeView, ptrClassicFrameLayout, xQuickRecyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgpapaMainfragmentNewLayoutV4SubHomeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f24872b;
    }

    @NonNull
    public static MgpapaMainfragmentNewLayoutV4SubHomeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mgpapa_mainfragment_new_layout_v4_sub_home, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
