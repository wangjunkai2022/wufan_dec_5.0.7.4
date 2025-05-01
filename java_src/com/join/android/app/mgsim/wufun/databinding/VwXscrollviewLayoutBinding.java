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
/* loaded from: classes3.dex */
public final class VwXscrollviewLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f27118b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f27119c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f27120d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f27121e;

    private VwXscrollviewLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4) {
        this.f27118b = linearLayout;
        this.f27119c = linearLayout2;
        this.f27120d = linearLayout3;
        this.f27121e = linearLayout4;
    }

    @NonNull
    public static VwXscrollviewLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.content_layout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.content_layout);
        if (linearLayout != null) {
            i4 = R.id.footer_layout;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.footer_layout);
            if (linearLayout2 != null) {
                i4 = R.id.header_layout;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.header_layout);
                if (linearLayout3 != null) {
                    return new VwXscrollviewLayoutBinding((LinearLayout) view, linearLayout, linearLayout2, linearLayout3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static VwXscrollviewLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f27118b;
    }

    @NonNull
    public static VwXscrollviewLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.vw_xscrollview_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
