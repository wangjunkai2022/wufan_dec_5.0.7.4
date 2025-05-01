package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LayoutRectBoxBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23299b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final EditText f23300c;

    private LayoutRectBoxBinding(@NonNull LinearLayout linearLayout, @NonNull EditText editText) {
        this.f23299b = linearLayout;
        this.f23300c = editText;
    }

    @NonNull
    public static LayoutRectBoxBinding bind(@NonNull View view) {
        EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.et_value);
        if (editText != null) {
            return new LayoutRectBoxBinding((LinearLayout) view, editText);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.et_value)));
    }

    @NonNull
    public static LayoutRectBoxBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23299b;
    }

    @NonNull
    public static LayoutRectBoxBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_rect_box, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
