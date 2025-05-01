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
public final class ActivityRewardAdBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f16920b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f16921c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f16922d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f16923e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f16924f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f16925g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f16926h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f16927i;

    private ActivityRewardAdBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f16920b = linearLayout;
        this.f16921c = simpleDraweeView;
        this.f16922d = imageView;
        this.f16923e = relativeLayout;
        this.f16924f = textView;
        this.f16925g = textView2;
        this.f16926h = textView3;
        this.f16927i = textView4;
    }

    @NonNull
    public static ActivityRewardAdBinding bind(@NonNull View view) {
        int i4 = R.id.icon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon);
        if (simpleDraweeView != null) {
            i4 = R.id.iv_close;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close);
            if (imageView != null) {
                i4 = R.id.rl_opt_vip;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_opt_vip);
                if (relativeLayout != null) {
                    i4 = R.id.tv_ad_tip;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ad_tip);
                    if (textView != null) {
                        i4 = R.id.tv_ad_vip_tip;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ad_vip_tip);
                        if (textView2 != null) {
                            i4 = R.id.tv_opt_view_ad;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_opt_view_ad);
                            if (textView3 != null) {
                                i4 = R.id.tv_opt_vip;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_opt_vip);
                                if (textView4 != null) {
                                    return new ActivityRewardAdBinding((LinearLayout) view, simpleDraweeView, imageView, relativeLayout, textView, textView2, textView3, textView4);
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
    public static ActivityRewardAdBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f16920b;
    }

    @NonNull
    public static ActivityRewardAdBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_reward_ad, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
