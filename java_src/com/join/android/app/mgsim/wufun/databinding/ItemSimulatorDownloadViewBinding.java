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
import com.join.mgps.customview.DownloadViewStroke;
/* loaded from: classes3.dex */
public final class ItemSimulatorDownloadViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f22775b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f22776c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final DownloadViewStroke f22777d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f22778e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f22779f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f22780g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f22781h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f22782i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f22783j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f22784k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final SimpleDraweeView f22785l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f22786m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ProgressBar f22787n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final ProgressBar f22788o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final RelativeLayout f22789p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f22790q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f22791r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final LinearLayout f22792s;

    private ItemSimulatorDownloadViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull DownloadViewStroke downloadViewStroke, @NonNull ImageView imageView, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LinearLayout linearLayout3, @NonNull ProgressBar progressBar, @NonNull ProgressBar progressBar2, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull LinearLayout linearLayout4) {
        this.f22775b = relativeLayout;
        this.f22776c = textView;
        this.f22777d = downloadViewStroke;
        this.f22778e = imageView;
        this.f22779f = view;
        this.f22780g = linearLayout;
        this.f22781h = linearLayout2;
        this.f22782i = textView2;
        this.f22783j = textView3;
        this.f22784k = textView4;
        this.f22785l = simpleDraweeView;
        this.f22786m = linearLayout3;
        this.f22787n = progressBar;
        this.f22788o = progressBar2;
        this.f22789p = relativeLayout2;
        this.f22790q = textView5;
        this.f22791r = textView6;
        this.f22792s = linearLayout4;
    }

    @NonNull
    public static ItemSimulatorDownloadViewBinding bind(@NonNull View view) {
        int i4 = R.id.appSize;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appSize);
        if (textView != null) {
            i4 = R.id.downloadView;
            DownloadViewStroke downloadViewStroke = (DownloadViewStroke) ViewBindings.findChildViewById(view, R.id.downloadView);
            if (downloadViewStroke != null) {
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
                                i4 = R.id.loding_info;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.loding_info);
                                if (textView2 != null) {
                                    i4 = R.id.mgListviewItemAppname;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.mgListviewItemAppname);
                                    if (textView3 != null) {
                                        i4 = R.id.mgListviewItemDescribe;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.mgListviewItemDescribe);
                                        if (textView4 != null) {
                                            i4 = R.id.mgListviewItemIcon;
                                            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.mgListviewItemIcon);
                                            if (simpleDraweeView != null) {
                                                i4 = R.id.openTest;
                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.openTest);
                                                if (linearLayout3 != null) {
                                                    i4 = R.id.progressBar;
                                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                                                    if (progressBar != null) {
                                                        i4 = R.id.progressBarZip;
                                                        ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBarZip);
                                                        if (progressBar2 != null) {
                                                            RelativeLayout relativeLayout = (RelativeLayout) view;
                                                            i4 = R.id.testTime;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.testTime);
                                                            if (textView5 != null) {
                                                                i4 = R.id.testType;
                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.testType);
                                                                if (textView6 != null) {
                                                                    i4 = R.id.tipsLayout;
                                                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tipsLayout);
                                                                    if (linearLayout4 != null) {
                                                                        return new ItemSimulatorDownloadViewBinding(relativeLayout, textView, downloadViewStroke, imageView, findChildViewById, linearLayout, linearLayout2, textView2, textView3, textView4, simpleDraweeView, linearLayout3, progressBar, progressBar2, relativeLayout, textView5, textView6, linearLayout4);
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
    public static ItemSimulatorDownloadViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f22775b;
    }

    @NonNull
    public static ItemSimulatorDownloadViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_simulator_download_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
