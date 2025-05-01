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
import moe.codeest.enviews.ENDownloadView;
import moe.codeest.enviews.ENPlayView;
/* loaded from: classes3.dex */
public final class StandardVideoViewDetailBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26699b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f26700c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f26701d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f26702e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ProgressBar f26703f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f26704g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f26705h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f26706i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f26707j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ENDownloadView f26708k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ImageView f26709l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f26710m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final SeekBar f26711n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final ImageView f26712o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final ENPlayView f26713p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final RelativeLayout f26714q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final RelativeLayout f26715r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final SimpleDraweeView f26716s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f26717t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f26718u;

    private StandardVideoViewDetailBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ProgressBar progressBar, @NonNull TextView textView, @NonNull ImageView imageView4, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ENDownloadView eNDownloadView, @NonNull ImageView imageView5, @NonNull ImageView imageView6, @NonNull SeekBar seekBar, @NonNull ImageView imageView7, @NonNull ENPlayView eNPlayView, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f26699b = relativeLayout;
        this.f26700c = imageView;
        this.f26701d = imageView2;
        this.f26702e = imageView3;
        this.f26703f = progressBar;
        this.f26704g = textView;
        this.f26705h = imageView4;
        this.f26706i = linearLayout;
        this.f26707j = linearLayout2;
        this.f26708k = eNDownloadView;
        this.f26709l = imageView5;
        this.f26710m = imageView6;
        this.f26711n = seekBar;
        this.f26712o = imageView7;
        this.f26713p = eNPlayView;
        this.f26714q = relativeLayout2;
        this.f26715r = relativeLayout3;
        this.f26716s = simpleDraweeView;
        this.f26717t = textView2;
        this.f26718u = textView3;
    }

    @NonNull
    public static StandardVideoViewDetailBinding bind(@NonNull View view) {
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
                        i4 = R.id.current;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.current);
                        if (textView != null) {
                            i4 = R.id.fullscreen;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.fullscreen);
                            if (imageView4 != null) {
                                i4 = R.id.layout_bottom;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout_bottom);
                                if (linearLayout != null) {
                                    i4 = R.id.layout_top;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout_top);
                                    if (linearLayout2 != null) {
                                        i4 = R.id.loading;
                                        ENDownloadView eNDownloadView = (ENDownloadView) ViewBindings.findChildViewById(view, R.id.loading);
                                        if (eNDownloadView != null) {
                                            i4 = R.id.lock_screen;
                                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.lock_screen);
                                            if (imageView5 != null) {
                                                i4 = R.id.mute;
                                                ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.mute);
                                                if (imageView6 != null) {
                                                    i4 = R.id.progress;
                                                    SeekBar seekBar = (SeekBar) ViewBindings.findChildViewById(view, R.id.progress);
                                                    if (seekBar != null) {
                                                        i4 = R.id.small_close;
                                                        ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.small_close);
                                                        if (imageView7 != null) {
                                                            i4 = R.id.start;
                                                            ENPlayView eNPlayView = (ENPlayView) ViewBindings.findChildViewById(view, R.id.start);
                                                            if (eNPlayView != null) {
                                                                i4 = R.id.surface_container;
                                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.surface_container);
                                                                if (relativeLayout != null) {
                                                                    i4 = R.id.thumb;
                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.thumb);
                                                                    if (relativeLayout2 != null) {
                                                                        i4 = R.id.thumbImageView;
                                                                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.thumbImageView);
                                                                        if (simpleDraweeView != null) {
                                                                            i4 = R.id.title;
                                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                                                                            if (textView2 != null) {
                                                                                i4 = R.id.total;
                                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.total);
                                                                                if (textView3 != null) {
                                                                                    return new StandardVideoViewDetailBinding((RelativeLayout) view, imageView, imageView2, imageView3, progressBar, textView, imageView4, linearLayout, linearLayout2, eNDownloadView, imageView5, imageView6, seekBar, imageView7, eNPlayView, relativeLayout, relativeLayout2, simpleDraweeView, textView2, textView3);
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
    public static StandardVideoViewDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26699b;
    }

    @NonNull
    public static StandardVideoViewDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.standard_video_view_detail, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
