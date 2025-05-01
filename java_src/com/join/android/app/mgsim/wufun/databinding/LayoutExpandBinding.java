package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LayoutExpandBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f23036b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f23037c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23038d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f23039e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f23040f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final FrameLayout f23041g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f23042h;

    private LayoutExpandBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout2, @NonNull TextView textView3) {
        this.f23036b = frameLayout;
        this.f23037c = textView;
        this.f23038d = textView2;
        this.f23039e = imageView;
        this.f23040f = linearLayout;
        this.f23041g = frameLayout2;
        this.f23042h = textView3;
    }

    @NonNull
    public static LayoutExpandBinding bind(@NonNull View view) {
        int i4 = R.id.expand_content_tv;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.expand_content_tv);
        if (textView != null) {
            i4 = R.id.expand_helper_tv;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.expand_helper_tv);
            if (textView2 != null) {
                i4 = R.id.expand_iv;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.expand_iv);
                if (imageView != null) {
                    i4 = R.id.expand_ll;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.expand_ll);
                    if (linearLayout != null) {
                        FrameLayout frameLayout = (FrameLayout) view;
                        i4 = R.id.expand_tv;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.expand_tv);
                        if (textView3 != null) {
                            return new LayoutExpandBinding(frameLayout, textView, textView2, imageView, linearLayout, frameLayout, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutExpandBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f23036b;
    }

    @NonNull
    public static LayoutExpandBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_expand, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
