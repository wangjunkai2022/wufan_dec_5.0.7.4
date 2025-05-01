package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LayoutEmuKayMapCommonPsBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f23019b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f23020c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23021d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f23022e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f23023f;

    private LayoutEmuKayMapCommonPsBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull TextView textView, @NonNull Button button2, @NonNull TextView textView2) {
        this.f23019b = relativeLayout;
        this.f23020c = button;
        this.f23021d = textView;
        this.f23022e = button2;
        this.f23023f = textView2;
    }

    @NonNull
    public static LayoutEmuKayMapCommonPsBinding bind(@NonNull View view) {
        int i4 = R.id.select;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.select);
        if (button != null) {
            i4 = R.id.select_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.select_tv);
            if (textView != null) {
                i4 = R.id.start;
                Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.start);
                if (button2 != null) {
                    i4 = R.id.start_tv;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.start_tv);
                    if (textView2 != null) {
                        return new LayoutEmuKayMapCommonPsBinding((RelativeLayout) view, button, textView, button2, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutEmuKayMapCommonPsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f23019b;
    }

    @NonNull
    public static LayoutEmuKayMapCommonPsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_emu_kay_map_common_ps, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
