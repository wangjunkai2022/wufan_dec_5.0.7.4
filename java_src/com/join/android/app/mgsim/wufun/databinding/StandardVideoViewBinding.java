package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
public final class StandardVideoViewBinding implements ViewBinding {
    @NonNull
    public final TextView A;
    @NonNull
    public final TextView B;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26674b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f26675c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f26676d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f26677e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f26678f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f26679g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ProgressBar f26680h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final SeekBar f26681i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f26682j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final EqualizerView f26683k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ImageView f26684l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f26685m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f26686n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final LinearLayout f26687o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final ProgressBar f26688p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final SimpleDraweeView f26689q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final ImageView f26690r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final LinearLayout f26691s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f26692t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f26693u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final ImageView f26694v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final LinearLayout f26695w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    public final FrameLayout f26696x;
    @NonNull

    /* renamed from: y  reason: collision with root package name */
    public final SimpleDraweeView f26697y;
    @NonNull

    /* renamed from: z  reason: collision with root package name */
    public final TextView f26698z;

    private StandardVideoViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull LinearLayout linearLayout, @NonNull ProgressBar progressBar, @NonNull SeekBar seekBar, @NonNull TextView textView, @NonNull EqualizerView equalizerView, @NonNull ImageView imageView5, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull ProgressBar progressBar2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView6, @NonNull LinearLayout linearLayout5, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ImageView imageView7, @NonNull LinearLayout linearLayout6, @NonNull FrameLayout frameLayout, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f26674b = relativeLayout;
        this.f26675c = imageView;
        this.f26676d = imageView2;
        this.f26677e = imageView3;
        this.f26678f = imageView4;
        this.f26679g = linearLayout;
        this.f26680h = progressBar;
        this.f26681i = seekBar;
        this.f26682j = textView;
        this.f26683k = equalizerView;
        this.f26684l = imageView5;
        this.f26685m = linearLayout2;
        this.f26686n = linearLayout3;
        this.f26687o = linearLayout4;
        this.f26688p = progressBar2;
        this.f26689q = simpleDraweeView;
        this.f26690r = imageView6;
        this.f26691s = linearLayout5;
        this.f26692t = textView2;
        this.f26693u = textView3;
        this.f26694v = imageView7;
        this.f26695w = linearLayout6;
        this.f26696x = frameLayout;
        this.f26697y = simpleDraweeView2;
        this.f26698z = textView4;
        this.A = textView5;
        this.B = textView6;
    }

    @NonNull
    public static StandardVideoViewBinding bind(@NonNull View view) {
        int i4 = R.id.autoPlay;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.autoPlay);
        if (imageView != null) {
            i4 = R.id.back;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.back);
            if (imageView2 != null) {
                i4 = R.id.back_tiny;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.back_tiny);
                if (imageView3 != null) {
                    i4 = R.id.battery_level;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.battery_level);
                    if (imageView4 != null) {
                        i4 = R.id.battery_time_layout;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.battery_time_layout);
                        if (linearLayout != null) {
                            i4 = R.id.bottom_progress;
                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.bottom_progress);
                            if (progressBar != null) {
                                i4 = R.id.bottom_seek_progress;
                                SeekBar seekBar = (SeekBar) ViewBindings.findChildViewById(view, R.id.bottom_seek_progress);
                                if (seekBar != null) {
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
                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout_bottom);
                                                if (linearLayout2 != null) {
                                                    i4 = R.id.layout_bottom2;
                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout_bottom2);
                                                    if (linearLayout3 != null) {
                                                        i4 = R.id.layout_top;
                                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout_top);
                                                        if (linearLayout4 != null) {
                                                            i4 = R.id.loading;
                                                            ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.loading);
                                                            if (progressBar2 != null) {
                                                                i4 = R.id.loadingM;
                                                                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.loadingM);
                                                                if (simpleDraweeView != null) {
                                                                    i4 = R.id.mute;
                                                                    ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.mute);
                                                                    if (imageView6 != null) {
                                                                        i4 = R.id.playFinishCover;
                                                                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.playFinishCover);
                                                                        if (linearLayout5 != null) {
                                                                            i4 = R.id.progressTextShow;
                                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.progressTextShow);
                                                                            if (textView2 != null) {
                                                                                i4 = R.id.retry_text;
                                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.retry_text);
                                                                                if (textView3 != null) {
                                                                                    i4 = R.id.start;
                                                                                    ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.start);
                                                                                    if (imageView7 != null) {
                                                                                        i4 = R.id.start_layout;
                                                                                        LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.start_layout);
                                                                                        if (linearLayout6 != null) {
                                                                                            i4 = R.id.surface_container;
                                                                                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.surface_container);
                                                                                            if (frameLayout != null) {
                                                                                                i4 = R.id.thumb;
                                                                                                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.thumb);
                                                                                                if (simpleDraweeView2 != null) {
                                                                                                    i4 = R.id.title;
                                                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                                                                                                    if (textView4 != null) {
                                                                                                        i4 = R.id.total;
                                                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.total);
                                                                                                        if (textView5 != null) {
                                                                                                            i4 = R.id.video_current_time;
                                                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.video_current_time);
                                                                                                            if (textView6 != null) {
                                                                                                                return new StandardVideoViewBinding((RelativeLayout) view, imageView, imageView2, imageView3, imageView4, linearLayout, progressBar, seekBar, textView, equalizerView, imageView5, linearLayout2, linearLayout3, linearLayout4, progressBar2, simpleDraweeView, imageView6, linearLayout5, textView2, textView3, imageView7, linearLayout6, frameLayout, simpleDraweeView2, textView4, textView5, textView6);
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
    public static StandardVideoViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26674b;
    }

    @NonNull
    public static StandardVideoViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.standard_video_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
