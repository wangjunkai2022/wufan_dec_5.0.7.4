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
public final class LayoutCustomFailedBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22962b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f22963c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f22964d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f22965e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f22966f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final Button f22967g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f22968h;

    private LayoutCustomFailedBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView2, @NonNull Button button, @NonNull TextView textView2) {
        this.f22962b = linearLayout;
        this.f22963c = textView;
        this.f22964d = imageView;
        this.f22965e = linearLayout2;
        this.f22966f = imageView2;
        this.f22967g = button;
        this.f22968h = textView2;
    }

    @NonNull
    public static LayoutCustomFailedBinding bind(@NonNull View view) {
        int i4 = R.id.failedMessage;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.failedMessage);
        if (textView != null) {
            i4 = R.id.lodingBackImage;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.lodingBackImage);
            if (imageView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i4 = R.id.relodingimag;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.relodingimag);
                if (imageView2 != null) {
                    i4 = R.id.setNetwork;
                    Button button = (Button) ViewBindings.findChildViewById(view, R.id.setNetwork);
                    if (button != null) {
                        i4 = R.id.setting;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.setting);
                        if (textView2 != null) {
                            return new LayoutCustomFailedBinding(linearLayout, textView, imageView, linearLayout, imageView2, button, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutCustomFailedBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22962b;
    }

    @NonNull
    public static LayoutCustomFailedBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_custom_failed, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
