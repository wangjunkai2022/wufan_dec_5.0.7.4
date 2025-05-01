package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView;
/* loaded from: classes3.dex */
public final class CategoryCommonFragmentBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17678b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final XListView f17679c;

    private CategoryCommonFragmentBinding(@NonNull LinearLayout linearLayout, @NonNull XListView xListView) {
        this.f17678b = linearLayout;
        this.f17679c = xListView;
    }

    @NonNull
    public static CategoryCommonFragmentBinding bind(@NonNull View view) {
        XListView xListView = (XListView) ViewBindings.findChildViewById(view, R.id.commonListView);
        if (xListView != null) {
            return new CategoryCommonFragmentBinding((LinearLayout) view, xListView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.commonListView)));
    }

    @NonNull
    public static CategoryCommonFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17678b;
    }

    @NonNull
    public static CategoryCommonFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.category_common_fragment, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
