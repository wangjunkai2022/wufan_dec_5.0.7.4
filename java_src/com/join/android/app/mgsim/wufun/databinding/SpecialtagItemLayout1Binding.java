package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.join.android.app.mgsim.wufun.R;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class SpecialtagItemLayout1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final TextView f26642b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26643c;

    private SpecialtagItemLayout1Binding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.f26642b = textView;
        this.f26643c = textView2;
    }

    @NonNull
    public static SpecialtagItemLayout1Binding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        TextView textView = (TextView) view;
        return new SpecialtagItemLayout1Binding(textView, textView);
    }

    @NonNull
    public static SpecialtagItemLayout1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public TextView getRoot() {
        return this.f26642b;
    }

    @NonNull
    public static SpecialtagItemLayout1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.specialtag_item_layout1, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
