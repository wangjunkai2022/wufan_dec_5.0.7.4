package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FragmentSimulatorLaunchMomentBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f20118b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f20119c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f20120d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f20121e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final NestedScrollView f20122f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final XRecyclerView f20123g;

    private FragmentSimulatorLaunchMomentBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull NestedScrollView nestedScrollView, @NonNull XRecyclerView xRecyclerView) {
        this.f20118b = constraintLayout;
        this.f20119c = textView;
        this.f20120d = imageView;
        this.f20121e = linearLayout;
        this.f20122f = nestedScrollView;
        this.f20123g = xRecyclerView;
    }

    @NonNull
    public static FragmentSimulatorLaunchMomentBinding bind(@NonNull View view) {
        int i4 = R.id.editText5;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.editText5);
        if (textView != null) {
            i4 = R.id.imageView44;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView44);
            if (imageView != null) {
                i4 = R.id.ll_empty;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_empty);
                if (linearLayout != null) {
                    i4 = R.id.nes;
                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, R.id.nes);
                    if (nestedScrollView != null) {
                        i4 = R.id.recyclerView;
                        XRecyclerView xRecyclerView = (XRecyclerView) ViewBindings.findChildViewById(view, R.id.recyclerView);
                        if (xRecyclerView != null) {
                            return new FragmentSimulatorLaunchMomentBinding((ConstraintLayout) view, textView, imageView, linearLayout, nestedScrollView, xRecyclerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentSimulatorLaunchMomentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f20118b;
    }

    @NonNull
    public static FragmentSimulatorLaunchMomentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_simulator_launch_moment, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
