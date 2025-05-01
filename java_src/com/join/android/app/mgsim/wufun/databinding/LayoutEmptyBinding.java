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
public final class LayoutEmptyBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23001b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f23002c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23003d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f23004e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f23005f;

    private LayoutEmptyBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2) {
        this.f23001b = linearLayout;
        this.f23002c = linearLayout2;
        this.f23003d = textView;
        this.f23004e = imageView;
        this.f23005f = textView2;
    }

    @NonNull
    public static LayoutEmptyBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i4 = R.id.noneMessage;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.noneMessage);
        if (textView != null) {
            i4 = R.id.noneReloadImage;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.noneReloadImage);
            if (imageView != null) {
                i4 = R.id.setAll;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.setAll);
                if (textView2 != null) {
                    return new LayoutEmptyBinding(linearLayout, linearLayout, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutEmptyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23001b;
    }

    @NonNull
    public static LayoutEmptyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_empty, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
