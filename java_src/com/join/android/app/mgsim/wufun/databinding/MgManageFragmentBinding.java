package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView;
/* loaded from: classes3.dex */
public final class MgManageFragmentBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f24633b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final XListView f24634c;

    private MgManageFragmentBinding(@NonNull RelativeLayout relativeLayout, @NonNull XListView xListView) {
        this.f24633b = relativeLayout;
        this.f24634c = xListView;
    }

    @NonNull
    public static MgManageFragmentBinding bind(@NonNull View view) {
        XListView xListView = (XListView) ViewBindings.findChildViewById(view, R.id.manageListView);
        if (xListView != null) {
            return new MgManageFragmentBinding((RelativeLayout) view, xListView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.manageListView)));
    }

    @NonNull
    public static MgManageFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f24633b;
    }

    @NonNull
    public static MgManageFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_manage_fragment, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
