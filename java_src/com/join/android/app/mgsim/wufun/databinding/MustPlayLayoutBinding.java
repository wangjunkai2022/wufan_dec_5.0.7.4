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
public final class MustPlayLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25173b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final XListView2 f25174c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final PtrClassicFrameLayout f25175d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f25176e;

    private MustPlayLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull XListView2 xListView2, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull View view) {
        this.f25173b = linearLayout;
        this.f25174c = xListView2;
        this.f25175d = ptrClassicFrameLayout;
        this.f25176e = view;
    }

    @NonNull
    public static MustPlayLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.listview;
        XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.listview);
        if (xListView2 != null) {
            i4 = R.id.mPtrFrame;
            PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
            if (ptrClassicFrameLayout != null) {
                i4 = R.id.viewBg;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.viewBg);
                if (findChildViewById != null) {
                    return new MustPlayLayoutBinding((LinearLayout) view, xListView2, ptrClassicFrameLayout, findChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MustPlayLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25173b;
    }

    @NonNull
    public static MustPlayLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.must_play_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
