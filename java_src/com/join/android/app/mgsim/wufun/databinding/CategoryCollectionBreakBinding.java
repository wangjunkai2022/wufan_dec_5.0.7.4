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
public final class CategoryCollectionBreakBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17665b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final XListView2 f17666c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final PtrClassicFrameLayout f17667d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TopbarLeftTitleLayoutBinding f17668e;

    private CategoryCollectionBreakBinding(@NonNull LinearLayout linearLayout, @NonNull XListView2 xListView2, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull TopbarLeftTitleLayoutBinding topbarLeftTitleLayoutBinding) {
        this.f17665b = linearLayout;
        this.f17666c = xListView2;
        this.f17667d = ptrClassicFrameLayout;
        this.f17668e = topbarLeftTitleLayoutBinding;
    }

    @NonNull
    public static CategoryCollectionBreakBinding bind(@NonNull View view) {
        int i4 = R.id.breakListView;
        XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.breakListView);
        if (xListView2 != null) {
            i4 = R.id.mPtrFrame;
            PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
            if (ptrClassicFrameLayout != null) {
                i4 = R.id.title_bar_layout;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.title_bar_layout);
                if (findChildViewById != null) {
                    return new CategoryCollectionBreakBinding((LinearLayout) view, xListView2, ptrClassicFrameLayout, TopbarLeftTitleLayoutBinding.bind(findChildViewById));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static CategoryCollectionBreakBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17665b;
    }

    @NonNull
    public static CategoryCollectionBreakBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.category_collection_break, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
