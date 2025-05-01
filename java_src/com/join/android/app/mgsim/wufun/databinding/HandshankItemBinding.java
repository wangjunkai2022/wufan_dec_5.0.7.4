package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class HandshankItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f21385b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21386c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f21387d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21388e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f21389f;

    private HandshankItemBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull ImageView imageView2) {
        this.f21385b = frameLayout;
        this.f21386c = textView;
        this.f21387d = imageView;
        this.f21388e = textView2;
        this.f21389f = imageView2;
    }

    @NonNull
    public static HandshankItemBinding bind(@NonNull View view) {
        int i4 = R.id.dsc;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.dsc);
        if (textView != null) {
            i4 = R.id.handshank_blue_arrow_img;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.handshank_blue_arrow_img);
            if (imageView != null) {
                i4 = R.id.handshank_name;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.handshank_name);
                if (textView2 != null) {
                    i4 = R.id.img;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img);
                    if (imageView2 != null) {
                        return new HandshankItemBinding((FrameLayout) view, textView, imageView, textView2, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static HandshankItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f21385b;
    }

    @NonNull
    public static HandshankItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.handshank_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
