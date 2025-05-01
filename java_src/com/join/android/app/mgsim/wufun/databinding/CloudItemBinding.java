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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class CloudItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f17939b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f17940c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f17941d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f17942e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f17943f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f17944g;

    private CloudItemBinding(@NonNull FrameLayout frameLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView) {
        this.f17939b = frameLayout;
        this.f17940c = simpleDraweeView;
        this.f17941d = linearLayout;
        this.f17942e = textView;
        this.f17943f = textView2;
        this.f17944g = imageView;
    }

    @NonNull
    public static CloudItemBinding bind(@NonNull View view) {
        int i4 = R.id.img;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.img);
        if (simpleDraweeView != null) {
            i4 = R.id.main_lay;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.main_lay);
            if (linearLayout != null) {
                i4 = R.id.name;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                if (textView != null) {
                    i4 = R.id.number;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.number);
                    if (textView2 != null) {
                        i4 = R.id.select;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.select);
                        if (imageView != null) {
                            return new CloudItemBinding((FrameLayout) view, simpleDraweeView, linearLayout, textView, textView2, imageView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static CloudItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f17939b;
    }

    @NonNull
    public static CloudItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.cloud_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
