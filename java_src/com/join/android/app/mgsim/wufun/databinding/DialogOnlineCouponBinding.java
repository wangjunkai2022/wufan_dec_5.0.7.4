package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogOnlineCouponBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f18942b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f18943c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18944d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18945e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18946f;

    private DialogOnlineCouponBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f18942b = constraintLayout;
        this.f18943c = imageView;
        this.f18944d = textView;
        this.f18945e = textView2;
        this.f18946f = textView3;
    }

    @NonNull
    public static DialogOnlineCouponBinding bind(@NonNull View view) {
        int i4 = R.id.ivClose;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivClose);
        if (imageView != null) {
            i4 = R.id.tvDesc;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvDesc);
            if (textView != null) {
                i4 = R.id.tvGetCoupon;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvGetCoupon);
                if (textView2 != null) {
                    i4 = R.id.tvTitle;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitle);
                    if (textView3 != null) {
                        return new DialogOnlineCouponBinding((ConstraintLayout) view, imageView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogOnlineCouponBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f18942b;
    }

    @NonNull
    public static DialogOnlineCouponBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_online_coupon, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
