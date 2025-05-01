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
import moe.codeest.enviews.ENDownloadView;
import moe.codeest.enviews.ENPlayView;
/* loaded from: classes3.dex */
public final class VideoLayoutMultiWufunBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26915b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f26916c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f26917d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ProgressBar f26918e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26919f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f26920g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f26921h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f26922i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ENDownloadView f26923j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ImageView f26924k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final SeekBar f26925l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final SimpleDraweeView f26926m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ImageView f26927n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final ENPlayView f26928o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final FrameLayout f26929p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final RelativeLayout f26930q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final SimpleDraweeView f26931r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final TextView f26932s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f26933t;

    private VideoLayoutMultiWufunBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ProgressBar progressBar, @NonNull TextView textView, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ENDownloadView eNDownloadView, @NonNull ImageView imageView4, @NonNull SeekBar seekBar, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView5, @NonNull ENPlayView eNPlayView, @NonNull FrameLayout frameLayout, @NonNull RelativeLayout relativeLayout2, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f26915b = relativeLayout;
        this.f26916c = imageView;
        this.f26917d = imageView2;
        this.f26918e = progressBar;
        this.f26919f = textView;
        this.f26920g = imageView3;
        this.f26921h = linearLayout;
        this.f26922i = linearLayout2;
        this.f26923j = eNDownloadView;
        this.f26924k = imageView4;
        this.f26925l = seekBar;
        this.f26926m = simpleDraweeView;
        this.f26927n = imageView5;
        this.f26928o = eNPlayView;
        this.f26929p = frameLayout;
        this.f26930q = relativeLayout2;
        this.f26931r = simpleDraweeView2;
        this.f26932s = textView2;
        this.f26933t = textView3;
    }

    @NonNull
    public static VideoLayoutMultiWufunBinding bind(@NonNull View view) {
        int i4 = R.id.back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back);
        if (imageView != null) {
            i4 = R.id.back_tiny;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.back_tiny);
            if (imageView2 != null) {
                i4 = R.id.bottom_progressbar;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.bottom_progressbar);
                if (progressBar != null) {
                    i4 = R.id.current;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.current);
                    if (textView != null) {
                        i4 = R.id.fullscreen;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.fullscreen);
                        if (imageView3 != null) {
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
                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.lock_screen);
                                        if (imageView4 != null) {
                                            i4 = R.id.progress;
                                            SeekBar seekBar = (SeekBar) ViewBindings.findChildViewById(view, R.id.progress);
                                            if (seekBar != null) {
                                                i4 = R.id.sdv_image_bluer;
                                                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.sdv_image_bluer);
                                                if (simpleDraweeView != null) {
                                                    i4 = R.id.small_close;
                                                    ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.small_close);
                                                    if (imageView5 != null) {
                                                        i4 = R.id.start;
                                                        ENPlayView eNPlayView = (ENPlayView) ViewBindings.findChildViewById(view, R.id.start);
                                                        if (eNPlayView != null) {
                                                            i4 = R.id.surface_container;
                                                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.surface_container);
                                                            if (frameLayout != null) {
                                                                i4 = R.id.thumb;
                                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.thumb);
                                                                if (relativeLayout != null) {
                                                                    i4 = R.id.thumbImageView;
                                                                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.thumbImageView);
                                                                    if (simpleDraweeView2 != null) {
                                                                        i4 = R.id.title;
                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                                                                        if (textView2 != null) {
                                                                            i4 = R.id.total;
                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.total);
                                                                            if (textView3 != null) {
                                                                                return new VideoLayoutMultiWufunBinding((RelativeLayout) view, imageView, imageView2, progressBar, textView, imageView3, linearLayout, linearLayout2, eNDownloadView, imageView4, seekBar, simpleDraweeView, imageView5, eNPlayView, frameLayout, relativeLayout, simpleDraweeView2, textView2, textView3);
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
    public static VideoLayoutMultiWufunBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26915b;
    }

    @NonNull
    public static VideoLayoutMultiWufunBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.video_layout_multi_wufun, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
