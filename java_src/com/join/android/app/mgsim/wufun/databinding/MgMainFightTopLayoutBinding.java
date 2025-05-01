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
import in.srain.cube.views.GridViewWithHeaderAndFooter;
/* loaded from: classes3.dex */
public final class MgMainFightTopLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f24606b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final GridViewWithHeaderAndFooter f24607c;

    private MgMainFightTopLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull GridViewWithHeaderAndFooter gridViewWithHeaderAndFooter) {
        this.f24606b = relativeLayout;
        this.f24607c = gridViewWithHeaderAndFooter;
    }

    @NonNull
    public static MgMainFightTopLayoutBinding bind(@NonNull View view) {
        GridViewWithHeaderAndFooter gridViewWithHeaderAndFooter = (GridViewWithHeaderAndFooter) ViewBindings.findChildViewById(view, R.id.gridViewWithHeaderAndFooter);
        if (gridViewWithHeaderAndFooter != null) {
            return new MgMainFightTopLayoutBinding((RelativeLayout) view, gridViewWithHeaderAndFooter);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.gridViewWithHeaderAndFooter)));
    }

    @NonNull
    public static MgMainFightTopLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f24606b;
    }

    @NonNull
    public static MgMainFightTopLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_main_fight_top_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
