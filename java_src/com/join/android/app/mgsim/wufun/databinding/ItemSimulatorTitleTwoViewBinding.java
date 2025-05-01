package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemSimulatorTitleTwoViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f22813b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f22814c;

    private ItemSimulatorTitleTwoViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView) {
        this.f22813b = relativeLayout;
        this.f22814c = textView;
    }

    @NonNull
    public static ItemSimulatorTitleTwoViewBinding bind(@NonNull View view) {
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.simulator_title_two_tv);
        if (textView != null) {
            return new ItemSimulatorTitleTwoViewBinding((RelativeLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.simulator_title_two_tv)));
    }

    @NonNull
    public static ItemSimulatorTitleTwoViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f22813b;
    }

    @NonNull
    public static ItemSimulatorTitleTwoViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_simulator_title_two_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
