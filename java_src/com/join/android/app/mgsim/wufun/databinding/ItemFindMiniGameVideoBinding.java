package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.component.video.MultiStandVideo;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemFindMiniGameVideoBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final CardView f22118b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f22119c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f22120d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f22121e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f22122f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f22123g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f22124h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f22125i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f22126j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f22127k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f22128l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f22129m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ProgressBar f22130n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final ProgressBar f22131o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final ProgressBar f22132p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final RelativeLayout f22133q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final LinearLayout f22134r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final TextView f22135s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f22136t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final MultiStandVideo f22137u;

    private ItemFindMiniGameVideoBinding(@NonNull CardView cardView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull ProgressBar progressBar, @NonNull ProgressBar progressBar2, @NonNull ProgressBar progressBar3, @NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout5, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull MultiStandVideo multiStandVideo) {
        this.f22118b = cardView;
        this.f22119c = textView;
        this.f22120d = textView2;
        this.f22121e = imageView;
        this.f22122f = linearLayout;
        this.f22123g = linearLayout2;
        this.f22124h = linearLayout3;
        this.f22125i = linearLayout4;
        this.f22126j = textView3;
        this.f22127k = textView4;
        this.f22128l = textView5;
        this.f22129m = textView6;
        this.f22130n = progressBar;
        this.f22131o = progressBar2;
        this.f22132p = progressBar3;
        this.f22133q = relativeLayout;
        this.f22134r = linearLayout5;
        this.f22135s = textView7;
        this.f22136t = textView8;
        this.f22137u = multiStandVideo;
    }

    @NonNull
    public static ItemFindMiniGameVideoBinding bind(@NonNull View view) {
        int i4 = R.id.adText;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.adText);
        if (textView != null) {
            i4 = R.id.appSize;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.appSize);
            if (textView2 != null) {
                i4 = R.id.giftPackageSwich;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.giftPackageSwich);
                if (imageView != null) {
                    i4 = R.id.linearLayout;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout);
                    if (linearLayout != null) {
                        i4 = R.id.linearLayout2;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout2);
                        if (linearLayout2 != null) {
                            i4 = R.id.ll_bottom_container;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_bottom_container);
                            if (linearLayout3 != null) {
                                i4 = R.id.ll_label;
                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_label);
                                if (linearLayout4 != null) {
                                    i4 = R.id.loding_info;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.loding_info);
                                    if (textView3 != null) {
                                        i4 = R.id.mgListviewItemAppname;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.mgListviewItemAppname);
                                        if (textView4 != null) {
                                            i4 = R.id.mgListviewItemInstall;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.mgListviewItemInstall);
                                            if (textView5 != null) {
                                                i4 = R.id.moneyText;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.moneyText);
                                                if (textView6 != null) {
                                                    i4 = R.id.pb_loading;
                                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_loading);
                                                    if (progressBar != null) {
                                                        i4 = R.id.progressBar;
                                                        ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                                                        if (progressBar2 != null) {
                                                            i4 = R.id.progressBarZip;
                                                            ProgressBar progressBar3 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBarZip);
                                                            if (progressBar3 != null) {
                                                                i4 = R.id.rLayoutRight;
                                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rLayoutRight);
                                                                if (relativeLayout != null) {
                                                                    i4 = R.id.relateLayoutApp;
                                                                    LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.relateLayoutApp);
                                                                    if (linearLayout5 != null) {
                                                                        i4 = R.id.tv_label;
                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_label);
                                                                        if (textView7 != null) {
                                                                            i4 = R.id.tv_score;
                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_score);
                                                                            if (textView8 != null) {
                                                                                i4 = R.id.wf_video;
                                                                                MultiStandVideo multiStandVideo = (MultiStandVideo) ViewBindings.findChildViewById(view, R.id.wf_video);
                                                                                if (multiStandVideo != null) {
                                                                                    return new ItemFindMiniGameVideoBinding((CardView) view, textView, textView2, imageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, textView3, textView4, textView5, textView6, progressBar, progressBar2, progressBar3, relativeLayout, linearLayout5, textView7, textView8, multiStandVideo);
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
    public static ItemFindMiniGameVideoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public CardView getRoot() {
        return this.f22118b;
    }

    @NonNull
    public static ItemFindMiniGameVideoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_find_mini_game_video, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
