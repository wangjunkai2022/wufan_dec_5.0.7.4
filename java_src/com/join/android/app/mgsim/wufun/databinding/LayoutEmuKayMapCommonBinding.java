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
public final class LayoutEmuKayMapCommonBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f23009b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f23010c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23011d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f23012e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f23013f;

    private LayoutEmuKayMapCommonBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull TextView textView, @NonNull Button button2, @NonNull TextView textView2) {
        this.f23009b = relativeLayout;
        this.f23010c = button;
        this.f23011d = textView;
        this.f23012e = button2;
        this.f23013f = textView2;
    }

    @NonNull
    public static LayoutEmuKayMapCommonBinding bind(@NonNull View view) {
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
                        return new LayoutEmuKayMapCommonBinding((RelativeLayout) view, button, textView, button2, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutEmuKayMapCommonBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f23009b;
    }

    @NonNull
    public static LayoutEmuKayMapCommonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_emu_kay_map_common, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
