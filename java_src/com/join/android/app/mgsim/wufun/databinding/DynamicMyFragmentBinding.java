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
public final class DynamicMyFragmentBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f19244b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f19245c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final XListView2 f19246d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final PtrClassicFrameLayout f19247e;

    private DynamicMyFragmentBinding(@NonNull RelativeLayout relativeLayout, @NonNull View view, @NonNull XListView2 xListView2, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout) {
        this.f19244b = relativeLayout;
        this.f19245c = view;
        this.f19246d = xListView2;
        this.f19247e = ptrClassicFrameLayout;
    }

    @NonNull
    public static DynamicMyFragmentBinding bind(@NonNull View view) {
        int i4 = R.id.bottom;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.bottom);
        if (findChildViewById != null) {
            i4 = R.id.forum_posts_list;
            XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.forum_posts_list);
            if (xListView2 != null) {
                i4 = R.id.mPtrFrame;
                PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
                if (ptrClassicFrameLayout != null) {
                    return new DynamicMyFragmentBinding((RelativeLayout) view, findChildViewById, xListView2, ptrClassicFrameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DynamicMyFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f19244b;
    }

    @NonNull
    public static DynamicMyFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dynamic_my_fragment, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
