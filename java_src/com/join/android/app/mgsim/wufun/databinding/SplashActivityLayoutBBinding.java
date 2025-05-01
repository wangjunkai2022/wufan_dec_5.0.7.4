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
import com.join.android.app.component.video.EmptyControlVideoView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class SplashActivityLayoutBBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26644b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f26645c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26646d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f26647e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26648f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f26649g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f26650h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f26651i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f26652j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f26653k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final RelativeLayout f26654l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final RelativeLayout f26655m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f26656n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f26657o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f26658p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final EmptyControlVideoView f26659q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final SimpleDraweeView f26660r;

    private SplashActivityLayoutBBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull RelativeLayout relativeLayout3, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout4, @NonNull RelativeLayout relativeLayout5, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull EmptyControlVideoView emptyControlVideoView, @NonNull SimpleDraweeView simpleDraweeView) {
        this.f26644b = relativeLayout;
        this.f26645c = relativeLayout2;
        this.f26646d = textView;
        this.f26647e = relativeLayout3;
        this.f26648f = textView2;
        this.f26649g = imageView;
        this.f26650h = imageView2;
        this.f26651i = imageView3;
        this.f26652j = linearLayout;
        this.f26653k = linearLayout2;
        this.f26654l = relativeLayout4;
        this.f26655m = relativeLayout5;
        this.f26656n = textView3;
        this.f26657o = textView4;
        this.f26658p = textView5;
        this.f26659q = emptyControlVideoView;
        this.f26660r = simpleDraweeView;
    }

    @NonNull
    public static SplashActivityLayoutBBinding bind(@NonNull View view) {
        int i4 = R.id.bottomImag;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.bottomImag);
        if (relativeLayout != null) {
            i4 = R.id.countdown;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.countdown);
            if (textView != null) {
                i4 = R.id.countdownLayout;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.countdownLayout);
                if (relativeLayout2 != null) {
                    i4 = R.id.countdownVideo;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.countdownVideo);
                    if (textView2 != null) {
                        i4 = R.id.imageView24;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView24);
                        if (imageView != null) {
                            i4 = R.id.iv_hand_shake;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_hand_shake);
                            if (imageView2 != null) {
                                i4 = R.id.iv_hand_up;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_hand_up);
                                if (imageView3 != null) {
                                    i4 = R.id.ll_hand_shake;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_hand_shake);
                                    if (linearLayout != null) {
                                        i4 = R.id.ll_hand_up;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_hand_up);
                                        if (linearLayout2 != null) {
                                            i4 = R.id.rl_opts_bottom;
                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_opts_bottom);
                                            if (relativeLayout3 != null) {
                                                RelativeLayout relativeLayout4 = (RelativeLayout) view;
                                                i4 = R.id.textViewVersion;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textViewVersion);
                                                if (textView3 != null) {
                                                    i4 = R.id.tv_hand_shake_tip;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_hand_shake_tip);
                                                    if (textView4 != null) {
                                                        i4 = R.id.tv_hand_up_tip;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_hand_up_tip);
                                                        if (textView5 != null) {
                                                            i4 = R.id.video_player;
                                                            EmptyControlVideoView emptyControlVideoView = (EmptyControlVideoView) ViewBindings.findChildViewById(view, R.id.video_player);
                                                            if (emptyControlVideoView != null) {
                                                                i4 = R.id.viewImage;
                                                                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.viewImage);
                                                                if (simpleDraweeView != null) {
                                                                    return new SplashActivityLayoutBBinding(relativeLayout4, relativeLayout, textView, relativeLayout2, textView2, imageView, imageView2, imageView3, linearLayout, linearLayout2, relativeLayout3, relativeLayout4, textView3, textView4, textView5, emptyControlVideoView, simpleDraweeView);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
    public static SplashActivityLayoutBBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26644b;
    }

    @NonNull
    public static SplashActivityLayoutBBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.splash_activity_layout_b, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
