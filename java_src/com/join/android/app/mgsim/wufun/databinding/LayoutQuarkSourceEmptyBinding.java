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
public final class LayoutQuarkSourceEmptyBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23266b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f23267c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23268d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f23269e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f23270f;

    private LayoutQuarkSourceEmptyBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2) {
        this.f23266b = linearLayout;
        this.f23267c = linearLayout2;
        this.f23268d = textView;
        this.f23269e = imageView;
        this.f23270f = textView2;
    }

    @NonNull
    public static LayoutQuarkSourceEmptyBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i4 = R.id.noneMessage;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.noneMessage);
        if (textView != null) {
            i4 = R.id.noneReloadImage;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.noneReloadImage);
            if (imageView != null) {
                i4 = R.id.tv_hope_add;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_hope_add);
                if (textView2 != null) {
                    return new LayoutQuarkSourceEmptyBinding(linearLayout, linearLayout, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutQuarkSourceEmptyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23266b;
    }

    @NonNull
    public static LayoutQuarkSourceEmptyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_quark_source_empty, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
