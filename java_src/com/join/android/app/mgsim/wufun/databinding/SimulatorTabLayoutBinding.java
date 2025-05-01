package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class SimulatorTabLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26615b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f26616c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RelativeLayout f26617d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26618e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26619f;

    private SimulatorTabLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f26615b = relativeLayout;
        this.f26616c = imageView;
        this.f26617d = relativeLayout2;
        this.f26618e = textView;
        this.f26619f = textView2;
    }

    @NonNull
    public static SimulatorTabLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.icon);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i4 = R.id.name;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.name);
            if (textView != null) {
                i4 = R.id.redPoint;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.redPoint);
                if (textView2 != null) {
                    return new SimulatorTabLayoutBinding(relativeLayout, imageView, relativeLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static SimulatorTabLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26615b;
    }

    @NonNull
    public static SimulatorTabLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.simulator_tab_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
