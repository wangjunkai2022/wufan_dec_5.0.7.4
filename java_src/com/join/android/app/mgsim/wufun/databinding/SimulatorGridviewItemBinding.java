package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class SimulatorGridviewItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26612b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f26613c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26614d;

    private SimulatorGridviewItemBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f26612b = linearLayout;
        this.f26613c = imageView;
        this.f26614d = textView;
    }

    @NonNull
    public static SimulatorGridviewItemBinding bind(@NonNull View view) {
        int i4 = R.id.imgIconSimulator;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgIconSimulator);
        if (imageView != null) {
            i4 = R.id.textViewSimulator;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textViewSimulator);
            if (textView != null) {
                return new SimulatorGridviewItemBinding((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static SimulatorGridviewItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26612b;
    }

    @NonNull
    public static SimulatorGridviewItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.simulator_gridview_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
