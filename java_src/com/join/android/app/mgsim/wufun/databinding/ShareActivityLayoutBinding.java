package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.LJWebView;
/* loaded from: classes3.dex */
public final class ShareActivityLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26507b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f26508c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f26509d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f26510e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f26511f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f26512g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f26513h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f26514i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f26515j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ImageView f26516k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ImageView f26517l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f26518m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final RelativeLayout f26519n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f26520o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final FrameLayout f26521p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final LJWebView f26522q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final RelativeLayout f26523r;

    private ShareActivityLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull ImageView imageView4, @NonNull LinearLayout linearLayout4, @NonNull ImageView imageView5, @NonNull ImageView imageView6, @NonNull TextView textView, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView2, @NonNull FrameLayout frameLayout, @NonNull LJWebView lJWebView, @NonNull RelativeLayout relativeLayout3) {
        this.f26507b = relativeLayout;
        this.f26508c = linearLayout;
        this.f26509d = imageView;
        this.f26510e = imageView2;
        this.f26511f = imageView3;
        this.f26512g = linearLayout2;
        this.f26513h = linearLayout3;
        this.f26514i = imageView4;
        this.f26515j = linearLayout4;
        this.f26516k = imageView5;
        this.f26517l = imageView6;
        this.f26518m = textView;
        this.f26519n = relativeLayout2;
        this.f26520o = textView2;
        this.f26521p = frameLayout;
        this.f26522q = lJWebView;
        this.f26523r = relativeLayout3;
    }

    @NonNull
    public static ShareActivityLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.back;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.back);
        if (linearLayout != null) {
            i4 = R.id.back_imag;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back_imag);
            if (imageView != null) {
                i4 = R.id.backNew;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.backNew);
                if (imageView2 != null) {
                    i4 = R.id.download;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.download);
                    if (imageView3 != null) {
                        i4 = R.id.layout_share;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout_share);
                        if (linearLayout2 != null) {
                            i4 = R.id.loding_layout;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.loding_layout);
                            if (linearLayout3 != null) {
                                i4 = R.id.refresh;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.refresh);
                                if (imageView4 != null) {
                                    i4 = R.id.right;
                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.right);
                                    if (linearLayout4 != null) {
                                        i4 = R.id.search;
                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.search);
                                        if (imageView5 != null) {
                                            i4 = R.id.shareImg;
                                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.shareImg);
                                            if (imageView6 != null) {
                                                i4 = R.id.share_textview;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.share_textview);
                                                if (textView != null) {
                                                    i4 = R.id.title;
                                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.title);
                                                    if (relativeLayout != null) {
                                                        i4 = R.id.title_textview;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.title_textview);
                                                        if (textView2 != null) {
                                                            i4 = R.id.video_view;
                                                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.video_view);
                                                            if (frameLayout != null) {
                                                                i4 = R.id.web;
                                                                LJWebView lJWebView = (LJWebView) ViewBindings.findChildViewById(view, R.id.web);
                                                                if (lJWebView != null) {
                                                                    i4 = R.id.weblayout;
                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.weblayout);
                                                                    if (relativeLayout2 != null) {
                                                                        return new ShareActivityLayoutBinding((RelativeLayout) view, linearLayout, imageView, imageView2, imageView3, linearLayout2, linearLayout3, imageView4, linearLayout4, imageView5, imageView6, textView, relativeLayout, textView2, frameLayout, lJWebView, relativeLayout2);
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
    public static ShareActivityLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26507b;
    }

    @NonNull
    public static ShareActivityLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.share_activity_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
