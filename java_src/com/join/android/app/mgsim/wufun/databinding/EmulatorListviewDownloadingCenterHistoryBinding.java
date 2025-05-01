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
public final class EmulatorListviewDownloadingCenterHistoryBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19282b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f19283c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f19284d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f19285e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f19286f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f19287g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final SimpleDraweeView f19288h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final View f19289i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f19290j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f19291k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f19292l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f19293m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f19294n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final ProgressBar f19295o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final ProgressBar f19296p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final RelativeLayout f19297q;

    private EmulatorListviewDownloadingCenterHistoryBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout3, @NonNull ImageView imageView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull View view, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull TextView textView3, @NonNull LinearLayout linearLayout6, @NonNull TextView textView4, @NonNull ProgressBar progressBar, @NonNull ProgressBar progressBar2, @NonNull RelativeLayout relativeLayout) {
        this.f19282b = linearLayout;
        this.f19283c = linearLayout2;
        this.f19284d = textView;
        this.f19285e = textView2;
        this.f19286f = linearLayout3;
        this.f19287g = imageView;
        this.f19288h = simpleDraweeView;
        this.f19289i = view;
        this.f19290j = linearLayout4;
        this.f19291k = linearLayout5;
        this.f19292l = textView3;
        this.f19293m = linearLayout6;
        this.f19294n = textView4;
        this.f19295o = progressBar;
        this.f19296p = progressBar2;
        this.f19297q = relativeLayout;
    }

    @NonNull
    public static EmulatorListviewDownloadingCenterHistoryBinding bind(@NonNull View view) {
        int i4 = R.id.addtoDesk;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.addtoDesk);
        if (linearLayout != null) {
            i4 = R.id.appSize;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appSize);
            if (textView != null) {
                i4 = R.id.btnOp;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.btnOp);
                if (textView2 != null) {
                    i4 = R.id.dellGame;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.dellGame);
                    if (linearLayout2 != null) {
                        i4 = R.id.giftPackageSwitch;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.giftPackageSwitch);
                        if (imageView != null) {
                            i4 = R.id.img;
                            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.img);
                            if (simpleDraweeView != null) {
                                i4 = R.id.line;
                                View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
                                if (findChildViewById != null) {
                                    LinearLayout linearLayout3 = (LinearLayout) view;
                                    i4 = R.id.listview_download;
                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.listview_download);
                                    if (linearLayout4 != null) {
                                        i4 = R.id.loding_info;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.loding_info);
                                        if (textView3 != null) {
                                            i4 = R.id.more_layout;
                                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.more_layout);
                                            if (linearLayout5 != null) {
                                                i4 = R.id.name;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                                                if (textView4 != null) {
                                                    i4 = R.id.progressBar;
                                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                                                    if (progressBar != null) {
                                                        i4 = R.id.progressBarZip;
                                                        ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBarZip);
                                                        if (progressBar2 != null) {
                                                            i4 = R.id.rLayoutRight;
                                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rLayoutRight);
                                                            if (relativeLayout != null) {
                                                                return new EmulatorListviewDownloadingCenterHistoryBinding(linearLayout3, linearLayout, textView, textView2, linearLayout2, imageView, simpleDraweeView, findChildViewById, linearLayout3, linearLayout4, textView3, linearLayout5, textView4, progressBar, progressBar2, relativeLayout);
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
    public static EmulatorListviewDownloadingCenterHistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19282b;
    }

    @NonNull
    public static EmulatorListviewDownloadingCenterHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.emulator_listview_downloading_center_history, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
