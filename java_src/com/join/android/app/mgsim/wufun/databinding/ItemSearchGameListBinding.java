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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemSearchGameListBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final CardView f22687b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f22688c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f22689d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f22690e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f22691f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f22692g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f22693h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f22694i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f22695j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f22696k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f22697l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f22698m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ProgressBar f22699n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final ProgressBar f22700o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final ProgressBar f22701p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final RelativeLayout f22702q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final LinearLayout f22703r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final SimpleDraweeView f22704s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f22705t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f22706u;

    private ItemSearchGameListBinding(@NonNull CardView cardView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull ProgressBar progressBar, @NonNull ProgressBar progressBar2, @NonNull ProgressBar progressBar3, @NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout4, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView7, @NonNull TextView textView8) {
        this.f22687b = cardView;
        this.f22688c = textView;
        this.f22689d = textView2;
        this.f22690e = imageView;
        this.f22691f = view;
        this.f22692g = linearLayout;
        this.f22693h = linearLayout2;
        this.f22694i = linearLayout3;
        this.f22695j = textView3;
        this.f22696k = textView4;
        this.f22697l = textView5;
        this.f22698m = textView6;
        this.f22699n = progressBar;
        this.f22700o = progressBar2;
        this.f22701p = progressBar3;
        this.f22702q = relativeLayout;
        this.f22703r = linearLayout4;
        this.f22704s = simpleDraweeView;
        this.f22705t = textView7;
        this.f22706u = textView8;
    }

    @NonNull
    public static ItemSearchGameListBinding bind(@NonNull View view) {
        int i4 = R.id.adText;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.adText);
        if (textView != null) {
            i4 = R.id.appSize;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.appSize);
            if (textView2 != null) {
                i4 = R.id.giftPackageSwich;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.giftPackageSwich);
                if (imageView != null) {
                    i4 = R.id.line;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
                    if (findChildViewById != null) {
                        i4 = R.id.linearLayout;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout);
                        if (linearLayout != null) {
                            i4 = R.id.linearLayout2;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout2);
                            if (linearLayout2 != null) {
                                i4 = R.id.ll_label;
                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_label);
                                if (linearLayout3 != null) {
                                    i4 = R.id.loding_info;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.loding_info);
                                    if (textView3 != null) {
                                        i4 = R.id.mgListviewItemAppname;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.mgListviewItemAppname);
                                        if (textView4 != null) {
                                            i4 = R.id.mgListviewItemDescribe;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.mgListviewItemDescribe);
                                            if (textView5 != null) {
                                                i4 = R.id.mgListviewItemInstall;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.mgListviewItemInstall);
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
                                                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.relateLayoutApp);
                                                                    if (linearLayout4 != null) {
                                                                        i4 = R.id.sdv_image;
                                                                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.sdv_image);
                                                                        if (simpleDraweeView != null) {
                                                                            i4 = R.id.tv_label;
                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_label);
                                                                            if (textView7 != null) {
                                                                                i4 = R.id.tv_score;
                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_score);
                                                                                if (textView8 != null) {
                                                                                    return new ItemSearchGameListBinding((CardView) view, textView, textView2, imageView, findChildViewById, linearLayout, linearLayout2, linearLayout3, textView3, textView4, textView5, textView6, progressBar, progressBar2, progressBar3, relativeLayout, linearLayout4, simpleDraweeView, textView7, textView8);
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
    public static ItemSearchGameListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public CardView getRoot() {
        return this.f22687b;
    }

    @NonNull
    public static ItemSearchGameListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_search_game_list, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
