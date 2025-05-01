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
public final class NoneLayoutInclude2Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25497b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f25498c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25499d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f25500e;

    private NoneLayoutInclude2Binding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull ImageView imageView) {
        this.f25497b = linearLayout;
        this.f25498c = linearLayout2;
        this.f25499d = textView;
        this.f25500e = imageView;
    }

    @NonNull
    public static NoneLayoutInclude2Binding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i4 = R.id.noneMessage;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.noneMessage);
        if (textView != null) {
            i4 = R.id.noneReloadImage;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.noneReloadImage);
            if (imageView != null) {
                return new NoneLayoutInclude2Binding(linearLayout, linearLayout, textView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static NoneLayoutInclude2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25497b;
    }

    @NonNull
    public static NoneLayoutInclude2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.none_layout_include2, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
