package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class WufungameUnzipfailedDialogBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f27182b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f27183c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f27184d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f27185e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f27186f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f27187g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f27188h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f27189i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f27190j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final SimpleDraweeView f27191k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f27192l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f27193m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f27194n;

    private WufungameUnzipfailedDialogBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout3, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f27182b = relativeLayout;
        this.f27183c = imageView;
        this.f27184d = textView;
        this.f27185e = textView2;
        this.f27186f = simpleDraweeView;
        this.f27187g = linearLayout;
        this.f27188h = linearLayout2;
        this.f27189i = textView3;
        this.f27190j = linearLayout3;
        this.f27191k = simpleDraweeView2;
        this.f27192l = textView4;
        this.f27193m = textView5;
        this.f27194n = textView6;
    }

    @NonNull
    public static WufungameUnzipfailedDialogBinding bind(@NonNull View view) {
        int i4 = R.id.close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.close);
        if (imageView != null) {
            i4 = R.id.gameName;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.gameName);
            if (textView != null) {
                i4 = R.id.goH5;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.goH5);
                if (textView2 != null) {
                    i4 = R.id.icon;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon);
                    if (simpleDraweeView != null) {
                        i4 = R.id.llReUnzip;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llReUnzip);
                        if (linearLayout != null) {
                            i4 = R.id.main;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.main);
                            if (linearLayout2 != null) {
                                i4 = R.id.message;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.message);
                                if (textView3 != null) {
                                    i4 = R.id.moreSelecter;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.moreSelecter);
                                    if (linearLayout3 != null) {
                                        i4 = R.id.sdv_image;
                                        SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.sdv_image);
                                        if (simpleDraweeView2 != null) {
                                            i4 = R.id.startButn;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.startButn);
                                            if (textView4 != null) {
                                                i4 = R.id.tvReDownload;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvReDownload);
                                                if (textView5 != null) {
                                                    i4 = R.id.tvReUnzip;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvReUnzip);
                                                    if (textView6 != null) {
                                                        return new WufungameUnzipfailedDialogBinding((RelativeLayout) view, imageView, textView, textView2, simpleDraweeView, linearLayout, linearLayout2, textView3, linearLayout3, simpleDraweeView2, textView4, textView5, textView6);
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
    public static WufungameUnzipfailedDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f27182b;
    }

    @NonNull
    public static WufungameUnzipfailedDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.wufungame_unzipfailed_dialog, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
