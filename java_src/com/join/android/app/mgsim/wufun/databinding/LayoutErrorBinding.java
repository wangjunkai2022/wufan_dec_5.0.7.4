package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LayoutErrorBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23030b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f23031c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f23032d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f23033e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f23034f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final Button f23035g;

    private LayoutErrorBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull Button button) {
        this.f23030b = linearLayout;
        this.f23031c = textView;
        this.f23032d = linearLayout2;
        this.f23033e = imageView;
        this.f23034f = imageView2;
        this.f23035g = button;
    }

    @NonNull
    public static LayoutErrorBinding bind(@NonNull View view) {
        int i4 = R.id.failedMessage;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.failedMessage);
        if (textView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i4 = R.id.lodingBackImage;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.lodingBackImage);
            if (imageView != null) {
                i4 = R.id.relodingimag;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.relodingimag);
                if (imageView2 != null) {
                    i4 = R.id.setNetwork;
                    Button button = (Button) ViewBindings.findChildViewById(view, R.id.setNetwork);
                    if (button != null) {
                        return new LayoutErrorBinding(linearLayout, textView, linearLayout, imageView, imageView2, button);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutErrorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23030b;
    }

    @NonNull
    public static LayoutErrorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_error, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
