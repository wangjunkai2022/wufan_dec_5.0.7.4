package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DetialTagItemLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18485b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f18486c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18487d;

    private DetialTagItemLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView) {
        this.f18485b = linearLayout;
        this.f18486c = linearLayout2;
        this.f18487d = textView;
    }

    @NonNull
    public static DetialTagItemLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.itemBack;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.itemBack);
        if (linearLayout != null) {
            i4 = R.id.tipText;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tipText);
            if (textView != null) {
                return new DetialTagItemLayoutBinding((LinearLayout) view, linearLayout, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DetialTagItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18485b;
    }

    @NonNull
    public static DetialTagItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.detial_tag_item_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
