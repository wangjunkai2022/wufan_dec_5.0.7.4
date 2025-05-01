package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DetialGoldenFinger1LayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final HorizontalScrollView f18453b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18454c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18455d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18456e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18457f;

    private DetialGoldenFinger1LayoutBinding(@NonNull HorizontalScrollView horizontalScrollView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f18453b = horizontalScrollView;
        this.f18454c = textView;
        this.f18455d = textView2;
        this.f18456e = textView3;
        this.f18457f = textView4;
    }

    @NonNull
    public static DetialGoldenFinger1LayoutBinding bind(@NonNull View view) {
        int i4 = R.id.f15603k1;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.f15603k1);
        if (textView != null) {
            i4 = R.id.f15604k2;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.f15604k2);
            if (textView2 != null) {
                i4 = R.id.f15605k3;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.f15605k3);
                if (textView3 != null) {
                    i4 = R.id.k4;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.k4);
                    if (textView4 != null) {
                        return new DetialGoldenFinger1LayoutBinding((HorizontalScrollView) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DetialGoldenFinger1LayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public HorizontalScrollView getRoot() {
        return this.f18453b;
    }

    @NonNull
    public static DetialGoldenFinger1LayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.detial_golden_finger1_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
