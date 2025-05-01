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
import com.join.mgps.customview.HandShankAdView;
/* loaded from: classes3.dex */
public final class HandshankLayoutNoBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21402b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f21403c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final HandShankAdView f21404d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21405e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f21406f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f21407g;

    private HandshankLayoutNoBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull HandShankAdView handShankAdView, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2) {
        this.f21402b = linearLayout;
        this.f21403c = button;
        this.f21404d = handShankAdView;
        this.f21405e = textView;
        this.f21406f = imageView;
        this.f21407g = textView2;
    }

    @NonNull
    public static HandshankLayoutNoBinding bind(@NonNull View view) {
        int i4 = R.id.blue_setup_btn;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.blue_setup_btn);
        if (button != null) {
            i4 = R.id.mAdView;
            HandShankAdView handShankAdView = (HandShankAdView) ViewBindings.findChildViewById(view, R.id.mAdView);
            if (handShankAdView != null) {
                i4 = R.id.papahandList;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.papahandList);
                if (textView != null) {
                    i4 = R.id.topIv;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.topIv);
                    if (imageView != null) {
                        i4 = R.id.topTv;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.topTv);
                        if (textView2 != null) {
                            return new HandshankLayoutNoBinding((LinearLayout) view, button, handShankAdView, textView, imageView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static HandshankLayoutNoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21402b;
    }

    @NonNull
    public static HandshankLayoutNoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.handshank_layout_no, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
