package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogModLaunchDomainBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f18880b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18881c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18882d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f18883e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f18884f;

    private DialogModLaunchDomainBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2) {
        this.f18880b = frameLayout;
        this.f18881c = textView;
        this.f18882d = textView2;
        this.f18883e = simpleDraweeView;
        this.f18884f = simpleDraweeView2;
    }

    @NonNull
    public static DialogModLaunchDomainBinding bind(@NonNull View view) {
        int i4 = R.id.btnNegative;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.btnNegative);
        if (textView != null) {
            i4 = R.id.btnPositive;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.btnPositive);
            if (textView2 != null) {
                i4 = R.id.imgPositive;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.imgPositive);
                if (simpleDraweeView != null) {
                    i4 = R.id.ivPic;
                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ivPic);
                    if (simpleDraweeView2 != null) {
                        return new DialogModLaunchDomainBinding((FrameLayout) view, textView, textView2, simpleDraweeView, simpleDraweeView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogModLaunchDomainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f18880b;
    }

    @NonNull
    public static DialogModLaunchDomainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_mod_launch_domain, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
