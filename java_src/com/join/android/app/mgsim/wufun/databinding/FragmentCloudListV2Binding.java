package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FragmentCloudListV2Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19656b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f19657c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final XRecyclerView f19658d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f19659e;

    private FragmentCloudListV2Binding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull XRecyclerView xRecyclerView, @NonNull TextView textView) {
        this.f19656b = linearLayout;
        this.f19657c = linearLayout2;
        this.f19658d = xRecyclerView;
        this.f19659e = textView;
    }

    @NonNull
    public static FragmentCloudListV2Binding bind(@NonNull View view) {
        int i4 = R.id.ll_nodata;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_nodata);
        if (linearLayout != null) {
            i4 = R.id.rcy_recommed;
            XRecyclerView xRecyclerView = (XRecyclerView) ViewBindings.findChildViewById(view, R.id.rcy_recommed);
            if (xRecyclerView != null) {
                i4 = R.id.tv_show_nodata;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_show_nodata);
                if (textView != null) {
                    return new FragmentCloudListV2Binding((LinearLayout) view, linearLayout, xRecyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentCloudListV2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19656b;
    }

    @NonNull
    public static FragmentCloudListV2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_cloud_list_v2, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
