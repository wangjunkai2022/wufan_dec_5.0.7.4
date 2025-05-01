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
import it.sephiroth.android.library.widget.HListView;
/* loaded from: classes3.dex */
public final class PapamainInterstingMidleLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f25752b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final HListView f25753c;

    private PapamainInterstingMidleLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull HListView hListView) {
        this.f25752b = relativeLayout;
        this.f25753c = hListView;
    }

    @NonNull
    public static PapamainInterstingMidleLayoutBinding bind(@NonNull View view) {
        HListView hListView = (HListView) ViewBindings.findChildViewById(view, R.id.interstinglist);
        if (hListView != null) {
            return new PapamainInterstingMidleLayoutBinding((RelativeLayout) view, hListView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.interstinglist)));
    }

    @NonNull
    public static PapamainInterstingMidleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f25752b;
    }

    @NonNull
    public static PapamainInterstingMidleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.papamain_intersting_midle_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
