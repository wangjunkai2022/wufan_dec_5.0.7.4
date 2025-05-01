package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.EqualizerView;
/* loaded from: classes3.dex */
public final class VideoLayoutStandardWufunBinding implements ViewBinding {
    @NonNull
    public final TextView A;
    @NonNull
    public final TextView B;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26934b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f26935c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f26936d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f26937e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ProgressBar f26938f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f26939g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f26940h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final EqualizerView f26941i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f26942j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f26943k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f26944l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f26945m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f26946n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final SimpleDraweeView f26947o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final ImageView f26948p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final ImageView f26949q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f26950r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final LinearLayout f26951s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final SeekBar f26952t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f26953u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final ImageView f26954v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f26955w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    public final RelativeLayout f26956x;
    @NonNull

    /* renamed from: y  reason: collision with root package name */
    public final RelativeLayout f26957y;
    @NonNull

    /* renamed from: z  reason: collision with root package name */
    public final SimpleDraweeView f26958z;

    private VideoLayoutStandardWufunBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ProgressBar progressBar, @NonNull ImageView imageView4, @NonNull TextView textView, @NonNull EqualizerView equalizerView, @NonNull ImageView imageView5, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView6, @NonNull ImageView imageView7, @NonNull TextView textView2, @NonNull LinearLayout linearLayout5, @NonNull SeekBar seekBar, @NonNull TextView textView3, @NonNull ImageView imageView8, @NonNull ImageView imageView9, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f26934b = relativeLayout;
        this.f26935c = imageView;
        this.f26936d = imageView2;
        this.f26937e = imageView3;
        this.f26938f = progressBar;
        this.f26939g = imageView4;
        this.f26940h = textView;
        this.f26941i = equalizerView;
        this.f26942j = imageView5;
        this.f26943k = linearLayout;
        this.f26944l = linearLayout2;
        this.f26945m = linearLayout3;
        this.f26946n = linearLayout4;
        this.f26947o = simpleDraweeView;
        this.f26948p = imageView6;
        this.f26949q = imageView7;
        this.f26950r = textView2;
        this.f26951s = linearLayout5;
        this.f26952t = seekBar;
        this.f26953u = textView3;
        this.f26954v = imageView8;
        this.f26955w = imageView9;
        this.f26956x = relativeLayout2;
        this.f26957y = relativeLayout3;
        this.f26958z = simpleDraweeView2;
        this.A = textView4;
        this.B = textView5;
    }

    @NonNull
    public static VideoLayoutStandardWufunBinding bind(@NonNull View view) {
        int i4 = R.id.autoPlay;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.autoPlay);
        if (imageView != null) {
            i4 = R.id.back;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.back);
            if (imageView2 != null) {
                i4 = R.id.back_tiny;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.back_tiny);
                if (imageView3 != null) {
                    i4 = R.id.bottom_progressbar;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.bottom_progressbar);
                    if (progressBar != null) {
                        i4 = R.id.coverDetailBack;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.coverDetailBack);
                        if (imageView4 != null) {
                            i4 = R.id.current;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.current);
                            if (textView != null) {
                                i4 = R.id.equalizer_view;
                                EqualizerView equalizerView = (EqualizerView) ViewBindings.findChildViewById(view, R.id.equalizer_view);
                                if (equalizerView != null) {
                                    i4 = R.id.fullscreen;
                                    ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.fullscreen);
                                    if (imageView5 != null) {
                                        i4 = R.id.layout_bottom;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout_bottom);
                                        if (linearLayout != null) {
                                            i4 = R.id.layout_bottom2;
                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout_bottom2);
                                            if (linearLayout2 != null) {
                                                i4 = R.id.layout_top;
                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout_top);
                                                if (linearLayout3 != null) {
                                                    i4 = R.id.ll_time;
                                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_time);
                                                    if (linearLayout4 != null) {
                                                        i4 = R.id.loading;
                                                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.loading);
                                                        if (simpleDraweeView != null) {
                                                            i4 = R.id.lock_screen;
                                                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.lock_screen);
                                                            if (imageView6 != null) {
                                                                i4 = R.id.mute;
                                                                ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.mute);
                                                                if (imageView7 != null) {
                                                                    i4 = R.id.netWorkType;
                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.netWorkType);
                                                                    if (textView2 != null) {
                                                                        i4 = R.id.playFinishCover;
                                                                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.playFinishCover);
                                                                        if (linearLayout5 != null) {
                                                                            i4 = R.id.progress;
                                                                            SeekBar seekBar = (SeekBar) ViewBindings.findChildViewById(view, R.id.progress);
                                                                            if (seekBar != null) {
                                                                                i4 = R.id.progressTextShow;
                                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.progressTextShow);
                                                                                if (textView3 != null) {
                                                                                    i4 = R.id.small_close;
                                                                                    ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view, R.id.small_close);
                                                                                    if (imageView8 != null) {
                                                                                        i4 = R.id.start;
                                                                                        ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(view, R.id.start);
                                                                                        if (imageView9 != null) {
                                                                                            i4 = R.id.surface_container;
                                                                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.surface_container);
                                                                                            if (relativeLayout != null) {
                                                                                                i4 = R.id.thumb;
                                                                                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.thumb);
                                                                                                if (relativeLayout2 != null) {
                                                                                                    i4 = R.id.thumbImageView;
                                                                                                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.thumbImageView);
                                                                                                    if (simpleDraweeView2 != null) {
                                                                                                        i4 = R.id.title;
                                                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                                                                                                        if (textView4 != null) {
                                                                                                            i4 = R.id.total;
                                                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.total);
                                                                                                            if (textView5 != null) {
                                                                                                                return new VideoLayoutStandardWufunBinding((RelativeLayout) view, imageView, imageView2, imageView3, progressBar, imageView4, textView, equalizerView, imageView5, linearLayout, linearLayout2, linearLayout3, linearLayout4, simpleDraweeView, imageView6, imageView7, textView2, linearLayout5, seekBar, textView3, imageView8, imageView9, relativeLayout, relativeLayout2, simpleDraweeView2, textView4, textView5);
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
    public static VideoLayoutStandardWufunBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26934b;
    }

    @NonNull
    public static VideoLayoutStandardWufunBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.video_layout_standard_wufun, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
