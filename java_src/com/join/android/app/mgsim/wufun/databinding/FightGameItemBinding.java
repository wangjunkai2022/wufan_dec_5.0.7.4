package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FightGameItemBinding implements ViewBinding {
    @NonNull
    public final TextView A;
    @NonNull
    public final TextView B;
    @NonNull
    public final TextView C;
    @NonNull
    public final ImageView D;
    @NonNull
    public final ImageView E;
    @NonNull
    public final ImageView F;
    @NonNull
    public final ImageView G;
    @NonNull
    public final ImageView H;
    @NonNull
    public final ImageView I;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19455b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19456c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f19457d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f19458e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f19459f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f19460g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f19461h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final SimpleDraweeView f19462i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final SimpleDraweeView f19463j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final SimpleDraweeView f19464k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f19465l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f19466m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f19467n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f19468o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f19469p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f19470q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final ProgressBar f19471r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final ProgressBar f19472s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final ProgressBar f19473t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final ProgressBar f19474u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final ProgressBar f19475v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final ProgressBar f19476w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    public final TextView f19477x;
    @NonNull

    /* renamed from: y  reason: collision with root package name */
    public final TextView f19478y;
    @NonNull

    /* renamed from: z  reason: collision with root package name */
    public final TextView f19479z;

    private FightGameItemBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull LinearLayout linearLayout5, @NonNull LinearLayout linearLayout6, @NonNull LinearLayout linearLayout7, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull ProgressBar progressBar, @NonNull ProgressBar progressBar2, @NonNull ProgressBar progressBar3, @NonNull ProgressBar progressBar4, @NonNull ProgressBar progressBar5, @NonNull ProgressBar progressBar6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull TextView textView12, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6) {
        this.f19455b = linearLayout;
        this.f19456c = textView;
        this.f19457d = textView2;
        this.f19458e = textView3;
        this.f19459f = linearLayout2;
        this.f19460g = linearLayout3;
        this.f19461h = linearLayout4;
        this.f19462i = simpleDraweeView;
        this.f19463j = simpleDraweeView2;
        this.f19464k = simpleDraweeView3;
        this.f19465l = linearLayout5;
        this.f19466m = linearLayout6;
        this.f19467n = linearLayout7;
        this.f19468o = textView4;
        this.f19469p = textView5;
        this.f19470q = textView6;
        this.f19471r = progressBar;
        this.f19472s = progressBar2;
        this.f19473t = progressBar3;
        this.f19474u = progressBar4;
        this.f19475v = progressBar5;
        this.f19476w = progressBar6;
        this.f19477x = textView7;
        this.f19478y = textView8;
        this.f19479z = textView9;
        this.A = textView10;
        this.B = textView11;
        this.C = textView12;
        this.D = imageView;
        this.E = imageView2;
        this.F = imageView3;
        this.G = imageView4;
        this.H = imageView5;
        this.I = imageView6;
    }

    @NonNull
    public static FightGameItemBinding bind(@NonNull View view) {
        int i4 = R.id.appSizeTvLeft;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appSizeTvLeft);
        if (textView != null) {
            i4 = R.id.appSizeTvMid;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.appSizeTvMid);
            if (textView2 != null) {
                i4 = R.id.appSizeTvRight;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.appSizeTvRight);
                if (textView3 != null) {
                    i4 = R.id.downloadStatusLeft;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.downloadStatusLeft);
                    if (linearLayout != null) {
                        i4 = R.id.downloadStatusMid;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.downloadStatusMid);
                        if (linearLayout2 != null) {
                            i4 = R.id.downloadStatusRight;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.downloadStatusRight);
                            if (linearLayout3 != null) {
                                i4 = R.id.fightImgLeft;
                                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.fightImgLeft);
                                if (simpleDraweeView != null) {
                                    i4 = R.id.fightImgMid;
                                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.fightImgMid);
                                    if (simpleDraweeView2 != null) {
                                        i4 = R.id.fightImgRight;
                                        SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.fightImgRight);
                                        if (simpleDraweeView3 != null) {
                                            i4 = R.id.fightLayoutLeft;
                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.fightLayoutLeft);
                                            if (linearLayout4 != null) {
                                                i4 = R.id.fightLayoutMid;
                                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.fightLayoutMid);
                                                if (linearLayout5 != null) {
                                                    i4 = R.id.fightLayoutRight;
                                                    LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.fightLayoutRight);
                                                    if (linearLayout6 != null) {
                                                        i4 = R.id.fightNameIvRight;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.fightNameIvRight);
                                                        if (textView4 != null) {
                                                            i4 = R.id.fightNameTvLeft;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.fightNameTvLeft);
                                                            if (textView5 != null) {
                                                                i4 = R.id.fightNameTvMid;
                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.fightNameTvMid);
                                                                if (textView6 != null) {
                                                                    i4 = R.id.progressBarLeft;
                                                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBarLeft);
                                                                    if (progressBar != null) {
                                                                        i4 = R.id.progressBarMid;
                                                                        ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBarMid);
                                                                        if (progressBar2 != null) {
                                                                            i4 = R.id.progressBarRight;
                                                                            ProgressBar progressBar3 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBarRight);
                                                                            if (progressBar3 != null) {
                                                                                i4 = R.id.progressBarZipLeft;
                                                                                ProgressBar progressBar4 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBarZipLeft);
                                                                                if (progressBar4 != null) {
                                                                                    i4 = R.id.progressBarZipMid;
                                                                                    ProgressBar progressBar5 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBarZipMid);
                                                                                    if (progressBar5 != null) {
                                                                                        i4 = R.id.progressBarZipRight;
                                                                                        ProgressBar progressBar6 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBarZipRight);
                                                                                        if (progressBar6 != null) {
                                                                                            i4 = R.id.speedTvLeft;
                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.speedTvLeft);
                                                                                            if (textView7 != null) {
                                                                                                i4 = R.id.speedTvMid;
                                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.speedTvMid);
                                                                                                if (textView8 != null) {
                                                                                                    i4 = R.id.speedTvRight;
                                                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.speedTvRight);
                                                                                                    if (textView9 != null) {
                                                                                                        i4 = R.id.statusBtnLeft;
                                                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.statusBtnLeft);
                                                                                                        if (textView10 != null) {
                                                                                                            i4 = R.id.statusBtnMid;
                                                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.statusBtnMid);
                                                                                                            if (textView11 != null) {
                                                                                                                i4 = R.id.statusBtnRight;
                                                                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.statusBtnRight);
                                                                                                                if (textView12 != null) {
                                                                                                                    i4 = R.id.statusImgLeft;
                                                                                                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.statusImgLeft);
                                                                                                                    if (imageView != null) {
                                                                                                                        i4 = R.id.statusImgMid;
                                                                                                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.statusImgMid);
                                                                                                                        if (imageView2 != null) {
                                                                                                                            i4 = R.id.statusImgRight;
                                                                                                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.statusImgRight);
                                                                                                                            if (imageView3 != null) {
                                                                                                                                i4 = R.id.tagImgLeft;
                                                                                                                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.tagImgLeft);
                                                                                                                                if (imageView4 != null) {
                                                                                                                                    i4 = R.id.tagImgMid;
                                                                                                                                    ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.tagImgMid);
                                                                                                                                    if (imageView5 != null) {
                                                                                                                                        i4 = R.id.tagImgRight;
                                                                                                                                        ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.tagImgRight);
                                                                                                                                        if (imageView6 != null) {
                                                                                                                                            return new FightGameItemBinding((LinearLayout) view, textView, textView2, textView3, linearLayout, linearLayout2, linearLayout3, simpleDraweeView, simpleDraweeView2, simpleDraweeView3, linearLayout4, linearLayout5, linearLayout6, textView4, textView5, textView6, progressBar, progressBar2, progressBar3, progressBar4, progressBar5, progressBar6, textView7, textView8, textView9, textView10, textView11, textView12, imageView, imageView2, imageView3, imageView4, imageView5, imageView6);
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
    public static FightGameItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19455b;
    }

    @NonNull
    public static FightGameItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fight_game_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
