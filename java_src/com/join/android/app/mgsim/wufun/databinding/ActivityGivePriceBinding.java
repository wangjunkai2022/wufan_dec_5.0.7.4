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
public final class ActivityGivePriceBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f16468b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f16469c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final XListView2 f16470d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f16471e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f16472f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final PtrClassicFrameLayout f16473g;

    private ActivityGivePriceBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull XListView2 xListView2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout) {
        this.f16468b = linearLayout;
        this.f16469c = linearLayout2;
        this.f16470d = xListView2;
        this.f16471e = linearLayout3;
        this.f16472f = linearLayout4;
        this.f16473g = ptrClassicFrameLayout;
    }

    @NonNull
    public static ActivityGivePriceBinding bind(@NonNull View view) {
        int i4 = R.id.iv_nome;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.iv_nome);
        if (linearLayout != null) {
            i4 = R.id.listview;
            XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.listview);
            if (xListView2 != null) {
                i4 = R.id.ll_finsh;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_finsh);
                if (linearLayout2 != null) {
                    i4 = R.id.ll_title;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_title);
                    if (linearLayout3 != null) {
                        i4 = R.id.myswip;
                        PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.myswip);
                        if (ptrClassicFrameLayout != null) {
                            return new ActivityGivePriceBinding((LinearLayout) view, linearLayout, xListView2, linearLayout2, linearLayout3, ptrClassicFrameLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityGivePriceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f16468b;
    }

    @NonNull
    public static ActivityGivePriceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_give_price, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
