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
import com.join.mgps.customview.XListView2;
import com.join.mgps.ptr.PtrClassicFrameLayout;
/* loaded from: classes3.dex */
public final class ClassifyListLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f17869b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final XListView2 f17870c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final PtrClassicFrameLayout f17871d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f17872e;

    private ClassifyListLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull XListView2 xListView2, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull RelativeLayout relativeLayout2) {
        this.f17869b = relativeLayout;
        this.f17870c = xListView2;
        this.f17871d = ptrClassicFrameLayout;
        this.f17872e = relativeLayout2;
    }

    @NonNull
    public static ClassifyListLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.classifyListView;
        XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.classifyListView);
        if (xListView2 != null) {
            i4 = R.id.mPtrFrame;
            PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
            if (ptrClassicFrameLayout != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                return new ClassifyListLayoutBinding(relativeLayout, xListView2, ptrClassicFrameLayout, relativeLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ClassifyListLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f17869b;
    }

    @NonNull
    public static ClassifyListLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.classify_list_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
