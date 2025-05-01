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
public final class CategoryCollectionRankBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17669b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final PtrClassicFrameLayout f17670c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final XListView2 f17671d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TopbarLeftTitleLayoutBinding f17672e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f17673f;

    private CategoryCollectionRankBinding(@NonNull LinearLayout linearLayout, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull XListView2 xListView2, @NonNull TopbarLeftTitleLayoutBinding topbarLeftTitleLayoutBinding, @NonNull View view) {
        this.f17669b = linearLayout;
        this.f17670c = ptrClassicFrameLayout;
        this.f17671d = xListView2;
        this.f17672e = topbarLeftTitleLayoutBinding;
        this.f17673f = view;
    }

    @NonNull
    public static CategoryCollectionRankBinding bind(@NonNull View view) {
        int i4 = R.id.mPtrFrame;
        PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
        if (ptrClassicFrameLayout != null) {
            i4 = R.id.rankListView;
            XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.rankListView);
            if (xListView2 != null) {
                i4 = R.id.title_bar_layout;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.title_bar_layout);
                if (findChildViewById != null) {
                    TopbarLeftTitleLayoutBinding bind = TopbarLeftTitleLayoutBinding.bind(findChildViewById);
                    i4 = R.id.viewBg;
                    View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.viewBg);
                    if (findChildViewById2 != null) {
                        return new CategoryCollectionRankBinding((LinearLayout) view, ptrClassicFrameLayout, xListView2, bind, findChildViewById2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static CategoryCollectionRankBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17669b;
    }

    @NonNull
    public static CategoryCollectionRankBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.category_collection_rank, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
