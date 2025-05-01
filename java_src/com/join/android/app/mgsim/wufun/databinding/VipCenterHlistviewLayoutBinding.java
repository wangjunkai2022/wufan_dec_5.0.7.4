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
import it.sephiroth.android.library.widget.HListView;
/* loaded from: classes3.dex */
public final class VipCenterHlistviewLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f27074b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final HListView f27075c;

    private VipCenterHlistviewLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull HListView hListView) {
        this.f27074b = linearLayout;
        this.f27075c = hListView;
    }

    @NonNull
    public static VipCenterHlistviewLayoutBinding bind(@NonNull View view) {
        HListView hListView = (HListView) ViewBindings.findChildViewById(view, R.id.listview);
        if (hListView != null) {
            return new VipCenterHlistviewLayoutBinding((LinearLayout) view, hListView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.listview)));
    }

    @NonNull
    public static VipCenterHlistviewLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f27074b;
    }

    @NonNull
    public static VipCenterHlistviewLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.vip_center_hlistview_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
