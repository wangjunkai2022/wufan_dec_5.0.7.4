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
public final class NoneLayoutIncludeBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25501b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f25502c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f25503d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25504e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f25505f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25506g;

    private NoneLayoutIncludeBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull TextView textView2) {
        this.f25501b = linearLayout;
        this.f25502c = linearLayout2;
        this.f25503d = imageView;
        this.f25504e = textView;
        this.f25505f = imageView2;
        this.f25506g = textView2;
    }

    @NonNull
    public static NoneLayoutIncludeBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i4 = R.id.lodingBackImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.lodingBackImage);
        if (imageView != null) {
            i4 = R.id.noneMessage;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.noneMessage);
            if (textView != null) {
                i4 = R.id.noneReloadImage;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.noneReloadImage);
                if (imageView2 != null) {
                    i4 = R.id.setAll;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.setAll);
                    if (textView2 != null) {
                        return new NoneLayoutIncludeBinding(linearLayout, linearLayout, imageView, textView, imageView2, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static NoneLayoutIncludeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25501b;
    }

    @NonNull
    public static NoneLayoutIncludeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.none_layout_include, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
