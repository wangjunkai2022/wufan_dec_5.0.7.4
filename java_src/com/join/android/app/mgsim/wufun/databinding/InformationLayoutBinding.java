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
import com.join.mgps.customview.XListView2;
import com.join.mgps.ptr.PtrClassicFrameLayout;
/* loaded from: classes3.dex */
public final class InformationLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21566b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final PtrClassicFrameLayout f21567c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TopbarLeftTitleLayoutBinding f21568d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final XListView2 f21569e;

    private InformationLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull TopbarLeftTitleLayoutBinding topbarLeftTitleLayoutBinding, @NonNull XListView2 xListView2) {
        this.f21566b = linearLayout;
        this.f21567c = ptrClassicFrameLayout;
        this.f21568d = topbarLeftTitleLayoutBinding;
        this.f21569e = xListView2;
    }

    @NonNull
    public static InformationLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.mPtrFrame;
        PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
        if (ptrClassicFrameLayout != null) {
            i4 = R.id.title_bar_layout;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.title_bar_layout);
            if (findChildViewById != null) {
                TopbarLeftTitleLayoutBinding bind = TopbarLeftTitleLayoutBinding.bind(findChildViewById);
                XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.xListView);
                if (xListView2 != null) {
                    return new InformationLayoutBinding((LinearLayout) view, ptrClassicFrameLayout, bind, xListView2);
                }
                i4 = R.id.xListView;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static InformationLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21566b;
    }

    @NonNull
    public static InformationLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.information_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
