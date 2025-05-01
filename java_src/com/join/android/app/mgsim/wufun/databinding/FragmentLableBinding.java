package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
import com.join.mgps.ptr.PtrClassicFrameLayout;
/* loaded from: classes3.dex */
public final class FragmentLableBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19866b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f19867c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final XListView2 f19868d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final PtrClassicFrameLayout f19869e;

    private FragmentLableBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull XListView2 xListView2, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout) {
        this.f19866b = linearLayout;
        this.f19867c = imageView;
        this.f19868d = xListView2;
        this.f19869e = ptrClassicFrameLayout;
    }

    @NonNull
    public static FragmentLableBinding bind(@NonNull View view) {
        int i4 = R.id.iv_no_data;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_no_data);
        if (imageView != null) {
            i4 = R.id.mListView;
            XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.mListView);
            if (xListView2 != null) {
                i4 = R.id.mPtrFrame;
                PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
                if (ptrClassicFrameLayout != null) {
                    return new FragmentLableBinding((LinearLayout) view, imageView, xListView2, ptrClassicFrameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentLableBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19866b;
    }

    @NonNull
    public static FragmentLableBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_lable, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
