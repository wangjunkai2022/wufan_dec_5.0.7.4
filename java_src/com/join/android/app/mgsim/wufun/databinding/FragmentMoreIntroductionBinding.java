package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CornersLinearLayout;
/* loaded from: classes3.dex */
public final class FragmentMoreIntroductionBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final CornersLinearLayout f19897b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f19898c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f19899d;

    private FragmentMoreIntroductionBinding(@NonNull CornersLinearLayout cornersLinearLayout, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView) {
        this.f19897b = cornersLinearLayout;
        this.f19898c = imageView;
        this.f19899d = recyclerView;
    }

    @NonNull
    public static FragmentMoreIntroductionBinding bind(@NonNull View view) {
        int i4 = R.id.iv_close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close);
        if (imageView != null) {
            i4 = R.id.rv_list_data;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_list_data);
            if (recyclerView != null) {
                return new FragmentMoreIntroductionBinding((CornersLinearLayout) view, imageView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentMoreIntroductionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public CornersLinearLayout getRoot() {
        return this.f19897b;
    }

    @NonNull
    public static FragmentMoreIntroductionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_more_introduction, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
