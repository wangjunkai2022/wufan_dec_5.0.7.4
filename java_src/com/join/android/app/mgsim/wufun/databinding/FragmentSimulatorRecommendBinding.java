package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FragmentSimulatorRecommendBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f20124b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Group f20125c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f20126d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f20127e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f20128f;

    private FragmentSimulatorRecommendBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Group group, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f20124b = constraintLayout;
        this.f20125c = group;
        this.f20126d = recyclerView;
        this.f20127e = textView;
        this.f20128f = textView2;
    }

    @NonNull
    public static FragmentSimulatorRecommendBinding bind(@NonNull View view) {
        int i4 = R.id.groupMain;
        Group group = (Group) ViewBindings.findChildViewById(view, R.id.groupMain);
        if (group != null) {
            i4 = R.id.rvRecom;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvRecom);
            if (recyclerView != null) {
                i4 = R.id.tvRecGameount;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvRecGameount);
                if (textView != null) {
                    i4 = R.id.tvTitleRecom;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleRecom);
                    if (textView2 != null) {
                        return new FragmentSimulatorRecommendBinding((ConstraintLayout) view, group, recyclerView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentSimulatorRecommendBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f20124b;
    }

    @NonNull
    public static FragmentSimulatorRecommendBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_simulator_recommend, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
