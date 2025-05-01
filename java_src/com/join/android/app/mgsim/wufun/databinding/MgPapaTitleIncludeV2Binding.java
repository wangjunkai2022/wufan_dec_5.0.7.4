package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgPapaTitleIncludeV2Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24669b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ViewFlipper f24670c;

    private MgPapaTitleIncludeV2Binding(@NonNull LinearLayout linearLayout, @NonNull ViewFlipper viewFlipper) {
        this.f24669b = linearLayout;
        this.f24670c = viewFlipper;
    }

    @NonNull
    public static MgPapaTitleIncludeV2Binding bind(@NonNull View view) {
        ViewFlipper viewFlipper = (ViewFlipper) ViewBindings.findChildViewById(view, R.id.topLineView);
        if (viewFlipper != null) {
            return new MgPapaTitleIncludeV2Binding((LinearLayout) view, viewFlipper);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.topLineView)));
    }

    @NonNull
    public static MgPapaTitleIncludeV2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24669b;
    }

    @NonNull
    public static MgPapaTitleIncludeV2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_papa_title_include_v2, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
