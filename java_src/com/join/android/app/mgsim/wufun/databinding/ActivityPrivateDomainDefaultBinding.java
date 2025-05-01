package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityPrivateDomainDefaultBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f16787b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f16788c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f16789d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f16790e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f16791f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final SimpleDraweeView f16792g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f16793h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final View f16794i;

    private ActivityPrivateDomainDefaultBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull RelativeLayout relativeLayout2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView2, @NonNull View view) {
        this.f16787b = relativeLayout;
        this.f16788c = imageView;
        this.f16789d = linearLayout;
        this.f16790e = textView;
        this.f16791f = relativeLayout2;
        this.f16792g = simpleDraweeView;
        this.f16793h = textView2;
        this.f16794i = view;
    }

    @NonNull
    public static ActivityPrivateDomainDefaultBinding bind(@NonNull View view) {
        int i4 = R.id.iv_close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close);
        if (imageView != null) {
            i4 = R.id.ll_content;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_content);
            if (linearLayout != null) {
                i4 = R.id.name;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                if (textView != null) {
                    i4 = R.id.rl_container;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_container);
                    if (relativeLayout != null) {
                        i4 = R.id.sdv_image;
                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.sdv_image);
                        if (simpleDraweeView != null) {
                            i4 = R.id.tv_save_qr;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_save_qr);
                            if (textView2 != null) {
                                i4 = R.id.v_close1;
                                View findChildViewById = ViewBindings.findChildViewById(view, R.id.v_close1);
                                if (findChildViewById != null) {
                                    return new ActivityPrivateDomainDefaultBinding((RelativeLayout) view, imageView, linearLayout, textView, relativeLayout, simpleDraweeView, textView2, findChildViewById);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityPrivateDomainDefaultBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f16787b;
    }

    @NonNull
    public static ActivityPrivateDomainDefaultBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_private_domain_default, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
