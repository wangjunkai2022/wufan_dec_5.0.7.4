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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemAppDownFinishBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f21657b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21658c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f21659d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21660e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f21661f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f21662g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f21663h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f21664i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f21665j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f21666k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ProgressBar f21667l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ProgressBar f21668m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f21669n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f21670o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f21671p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f21672q;

    private ItemAppDownFinishBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView3, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull TextView textView4, @NonNull LinearLayout linearLayout2, @NonNull ProgressBar progressBar, @NonNull ProgressBar progressBar2, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8) {
        this.f21657b = relativeLayout;
        this.f21658c = textView;
        this.f21659d = imageView;
        this.f21660e = textView2;
        this.f21661f = simpleDraweeView;
        this.f21662g = textView3;
        this.f21663h = imageView2;
        this.f21664i = linearLayout;
        this.f21665j = textView4;
        this.f21666k = linearLayout2;
        this.f21667l = progressBar;
        this.f21668m = progressBar2;
        this.f21669n = textView5;
        this.f21670o = textView6;
        this.f21671p = textView7;
        this.f21672q = textView8;
    }

    @NonNull
    public static ItemAppDownFinishBinding bind(@NonNull View view) {
        int i4 = R.id.appSize;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appSize);
        if (textView != null) {
            i4 = R.id.cancle;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.cancle);
            if (imageView != null) {
                i4 = R.id.goMygame;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.goMygame);
                if (textView2 != null) {
                    i4 = R.id.icon;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon);
                    if (simpleDraweeView != null) {
                        i4 = R.id.info;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.info);
                        if (textView3 != null) {
                            i4 = R.id.iv_star;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star);
                            if (imageView2 != null) {
                                i4 = R.id.linearLayout2;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout2);
                                if (linearLayout != null) {
                                    i4 = R.id.lodingInfo;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.lodingInfo);
                                    if (textView4 != null) {
                                        i4 = R.id.main;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.main);
                                        if (linearLayout2 != null) {
                                            i4 = R.id.progressBar;
                                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                                            if (progressBar != null) {
                                                i4 = R.id.progressBarZip;
                                                ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBarZip);
                                                if (progressBar2 != null) {
                                                    i4 = R.id.tipsLayout;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tipsLayout);
                                                    if (textView5 != null) {
                                                        i4 = R.id.title;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                                                        if (textView6 != null) {
                                                            i4 = R.id.tv_ok;
                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ok);
                                                            if (textView7 != null) {
                                                                i4 = R.id.tv_score;
                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_score);
                                                                if (textView8 != null) {
                                                                    return new ItemAppDownFinishBinding((RelativeLayout) view, textView, imageView, textView2, simpleDraweeView, textView3, imageView2, linearLayout, textView4, linearLayout2, progressBar, progressBar2, textView5, textView6, textView7, textView8);
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
    public static ItemAppDownFinishBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f21657b;
    }

    @NonNull
    public static ItemAppDownFinishBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_app_down_finish, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
