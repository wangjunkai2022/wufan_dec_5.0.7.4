package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgChooseLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23725b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final GridView f23726c;

    private MgChooseLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull GridView gridView) {
        this.f23725b = linearLayout;
        this.f23726c = gridView;
    }

    @NonNull
    public static MgChooseLayoutBinding bind(@NonNull View view) {
        GridView gridView = (GridView) ViewBindings.findChildViewById(view, R.id.chooseGridView);
        if (gridView != null) {
            return new MgChooseLayoutBinding((LinearLayout) view, gridView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.chooseGridView)));
    }

    @NonNull
    public static MgChooseLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23725b;
    }

    @NonNull
    public static MgChooseLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_choose_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
