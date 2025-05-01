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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogStickAdBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19043b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f19044c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f19045d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f19046e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f19047f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f19048g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f19049h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f19050i;

    private DialogStickAdBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f19043b = linearLayout;
        this.f19044c = imageView;
        this.f19045d = imageView2;
        this.f19046e = relativeLayout;
        this.f19047f = textView;
        this.f19048g = textView2;
        this.f19049h = textView3;
        this.f19050i = textView4;
    }

    @NonNull
    public static DialogStickAdBinding bind(@NonNull View view) {
        int i4 = R.id.icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.icon);
        if (imageView != null) {
            i4 = R.id.iv_close;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close);
            if (imageView2 != null) {
                i4 = R.id.rl_opt_view_ad;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_opt_view_ad);
                if (relativeLayout != null) {
                    i4 = R.id.tv_ad_tip;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ad_tip);
                    if (textView != null) {
                        i4 = R.id.tv_opt_view;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_opt_view);
                        if (textView2 != null) {
                            i4 = R.id.tv_opt_vip;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_opt_vip);
                            if (textView3 != null) {
                                i4 = R.id.tv_view_ad_label;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_view_ad_label);
                                if (textView4 != null) {
                                    return new DialogStickAdBinding((LinearLayout) view, imageView, imageView2, relativeLayout, textView, textView2, textView3, textView4);
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
    public static DialogStickAdBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19043b;
    }

    @NonNull
    public static DialogStickAdBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_stick_ad, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
