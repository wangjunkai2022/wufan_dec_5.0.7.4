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
public final class FragmentMyGamePapaLocalBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f20011b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final XListView2 f20012c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ConstraintLayout f20013d;

    private FragmentMyGamePapaLocalBinding(@NonNull ConstraintLayout constraintLayout, @NonNull XListView2 xListView2, @NonNull ConstraintLayout constraintLayout2) {
        this.f20011b = constraintLayout;
        this.f20012c = xListView2;
        this.f20013d = constraintLayout2;
    }

    @NonNull
    public static FragmentMyGamePapaLocalBinding bind(@NonNull View view) {
        XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.listView);
        if (xListView2 != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            return new FragmentMyGamePapaLocalBinding(constraintLayout, xListView2, constraintLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.listView)));
    }

    @NonNull
    public static FragmentMyGamePapaLocalBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f20011b;
    }

    @NonNull
    public static FragmentMyGamePapaLocalBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_my_game_papa_local, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
