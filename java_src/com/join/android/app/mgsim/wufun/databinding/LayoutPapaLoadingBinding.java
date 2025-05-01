package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.LoadingImageView;
import com.join.mgps.customview.LoadingLayout;
/* loaded from: classes3.dex */
public final class LayoutPapaLoadingBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LoadingLayout f23169b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TopbarLeftTitleBinding f23170c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23171d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f23172e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LoadingImageView f23173f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f23174g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f23175h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f23176i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f23177j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f23178k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ImageView f23179l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f23180m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f23181n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final Button f23182o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f23183p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f23184q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f23185r;

    private LayoutPapaLoadingBinding(@NonNull LoadingLayout loadingLayout, @NonNull TopbarLeftTitleBinding topbarLeftTitleBinding, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull LoadingImageView loadingImageView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView2, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView3, @NonNull Button button, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f23169b = loadingLayout;
        this.f23170c = topbarLeftTitleBinding;
        this.f23171d = textView;
        this.f23172e = linearLayout;
        this.f23173f = loadingImageView;
        this.f23174g = imageView;
        this.f23175h = linearLayout2;
        this.f23176i = linearLayout3;
        this.f23177j = linearLayout4;
        this.f23178k = textView2;
        this.f23179l = imageView2;
        this.f23180m = imageView3;
        this.f23181n = textView3;
        this.f23182o = button;
        this.f23183p = textView4;
        this.f23184q = textView5;
        this.f23185r = textView6;
    }

    @NonNull
    public static LayoutPapaLoadingBinding bind(@NonNull View view) {
        int i4 = R.id.build_qr_code_title;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.build_qr_code_title);
        if (findChildViewById != null) {
            TopbarLeftTitleBinding bind = TopbarLeftTitleBinding.bind(findChildViewById);
            i4 = R.id.failedMessage;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.failedMessage);
            if (textView != null) {
                i4 = R.id.loading_none;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.loading_none);
                if (linearLayout != null) {
                    i4 = R.id.loading_view;
                    LoadingImageView loadingImageView = (LoadingImageView) ViewBindings.findChildViewById(view, R.id.loading_view);
                    if (loadingImageView != null) {
                        i4 = R.id.lodingBackImage;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.lodingBackImage);
                        if (imageView != null) {
                            i4 = R.id.loding_faile;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.loding_faile);
                            if (linearLayout2 != null) {
                                i4 = R.id.loding_layout;
                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.loding_layout);
                                if (linearLayout3 != null) {
                                    i4 = R.id.nodata_layout;
                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.nodata_layout);
                                    if (linearLayout4 != null) {
                                        i4 = R.id.noneMessage;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.noneMessage);
                                        if (textView2 != null) {
                                            i4 = R.id.noneReloadImage;
                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.noneReloadImage);
                                            if (imageView2 != null) {
                                                i4 = R.id.relodingimag;
                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.relodingimag);
                                                if (imageView3 != null) {
                                                    i4 = R.id.setAll;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.setAll);
                                                    if (textView3 != null) {
                                                        i4 = R.id.setNetwork;
                                                        Button button = (Button) ViewBindings.findChildViewById(view, R.id.setNetwork);
                                                        if (button != null) {
                                                            i4 = R.id.setting;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.setting);
                                                            if (textView4 != null) {
                                                                i4 = R.id.textView2;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.textView2);
                                                                if (textView5 != null) {
                                                                    i4 = R.id.textView_nodata;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.textView_nodata);
                                                                    if (textView6 != null) {
                                                                        return new LayoutPapaLoadingBinding((LoadingLayout) view, bind, textView, linearLayout, loadingImageView, imageView, linearLayout2, linearLayout3, linearLayout4, textView2, imageView2, imageView3, textView3, button, textView4, textView5, textView6);
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
    public static LayoutPapaLoadingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LoadingLayout getRoot() {
        return this.f23169b;
    }

    @NonNull
    public static LayoutPapaLoadingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_papa_loading, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
