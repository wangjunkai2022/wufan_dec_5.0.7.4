package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
/* loaded from: classes3.dex */
public final class FragmentPapaGameLocalBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f20056b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final XListView2 f20057c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ConstraintLayout f20058d;

    private FragmentPapaGameLocalBinding(@NonNull ConstraintLayout constraintLayout, @NonNull XListView2 xListView2, @NonNull ConstraintLayout constraintLayout2) {
        this.f20056b = constraintLayout;
        this.f20057c = xListView2;
        this.f20058d = constraintLayout2;
    }

    @NonNull
    public static FragmentPapaGameLocalBinding bind(@NonNull View view) {
        XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.listView);
        if (xListView2 != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            return new FragmentPapaGameLocalBinding(constraintLayout, xListView2, constraintLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.listView)));
    }

    @NonNull
    public static FragmentPapaGameLocalBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f20056b;
    }

    @NonNull
    public static FragmentPapaGameLocalBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_papa_game_local, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
