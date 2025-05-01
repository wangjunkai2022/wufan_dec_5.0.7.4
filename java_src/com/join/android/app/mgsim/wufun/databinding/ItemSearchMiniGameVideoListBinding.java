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
public final class ItemSearchMiniGameVideoListBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final CardView f22735b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f22736c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f22737d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f22738e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f22739f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f22740g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f22741h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f22742i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f22743j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f22744k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f22745l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f22746m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ProgressBar f22747n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final ProgressBar f22748o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final ProgressBar f22749p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final RelativeLayout f22750q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final LinearLayout f22751r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final TextView f22752s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f22753t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final MultiStandVideo f22754u;

    private ItemSearchMiniGameVideoListBinding(@NonNull CardView cardView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull ProgressBar progressBar, @NonNull ProgressBar progressBar2, @NonNull ProgressBar progressBar3, @NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout5, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull MultiStandVideo multiStandVideo) {
        this.f22735b = cardView;
        this.f22736c = textView;
        this.f22737d = textView2;
        this.f22738e = imageView;
        this.f22739f = linearLayout;
        this.f22740g = linearLayout2;
        this.f22741h = linearLayout3;
        this.f22742i = linearLayout4;
        this.f22743j = textView3;
        this.f22744k = textView4;
        this.f22745l = textView5;
        this.f22746m = textView6;
        this.f22747n = progressBar;
        this.f22748o = progressBar2;
        this.f22749p = progressBar3;
        this.f22750q = relativeLayout;
        this.f22751r = linearLayout5;
        this.f22752s = textView7;
        this.f22753t = textView8;
        this.f22754u = multiStandVideo;
    }

    @NonNull
    public static ItemSearchMiniGameVideoListBinding bind(@NonNull View view) {
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
                                                                                    return new ItemSearchMiniGameVideoListBinding((CardView) view, textView, textView2, imageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, textView3, textView4, textView5, textView6, progressBar, progressBar2, progressBar3, relativeLayout, linearLayout5, textView7, textView8, multiStandVideo);
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
    public static ItemSearchMiniGameVideoListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public CardView getRoot() {
        return this.f22735b;
    }

    @NonNull
    public static ItemSearchMiniGameVideoListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_search_mini_game_video_list, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
