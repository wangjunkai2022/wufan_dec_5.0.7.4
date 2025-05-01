package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemSimulatorTitleViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22815b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f22816c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RelativeLayout f22817d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f22818e;

    private ItemSimulatorTitleViewBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView) {
        this.f22815b = linearLayout;
        this.f22816c = view;
        this.f22817d = relativeLayout;
        this.f22818e = textView;
    }

    @NonNull
    public static ItemSimulatorTitleViewBinding bind(@NonNull View view) {
        int i4 = R.id.line;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
        if (findChildViewById != null) {
            i4 = R.id.simulator_right_rl;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.simulator_right_rl);
            if (relativeLayout != null) {
                i4 = R.id.simulator_title_tv;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.simulator_title_tv);
                if (textView != null) {
                    return new ItemSimulatorTitleViewBinding((LinearLayout) view, findChildViewById, relativeLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemSimulatorTitleViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22815b;
    }

    @NonNull
    public static ItemSimulatorTitleViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_simulator_title_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
