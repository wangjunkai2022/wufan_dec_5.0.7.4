package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FragmentGamelistBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f19863b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f19864c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final XRecyclerView f19865d;

    private FragmentGamelistBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull XRecyclerView xRecyclerView) {
        this.f19863b = relativeLayout;
        this.f19864c = relativeLayout2;
        this.f19865d = xRecyclerView;
    }

    @NonNull
    public static FragmentGamelistBinding bind(@NonNull View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        XRecyclerView xRecyclerView = (XRecyclerView) ViewBindings.findChildViewById(view, R.id.listView2);
        if (xRecyclerView != null) {
            return new FragmentGamelistBinding(relativeLayout, relativeLayout, xRecyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.listView2)));
    }

    @NonNull
    public static FragmentGamelistBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f19863b;
    }

    @NonNull
    public static FragmentGamelistBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_gamelist, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
