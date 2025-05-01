package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.DownloadViewNormal;
/* loaded from: classes3.dex */
public final class NowWufunTodaynewGameBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25587b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f25588c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25589d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25590e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final DownloadViewNormal f25591f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f25592g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f25593h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f25594i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ProgressBar f25595j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ProgressBar f25596k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f25597l;

    private NowWufunTodaynewGameBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull DownloadViewNormal downloadViewNormal, @NonNull LinearLayout linearLayout2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout3, @NonNull ProgressBar progressBar, @NonNull ProgressBar progressBar2, @NonNull LinearLayout linearLayout4) {
        this.f25587b = linearLayout;
        this.f25588c = simpleDraweeView;
        this.f25589d = textView;
        this.f25590e = textView2;
        this.f25591f = downloadViewNormal;
        this.f25592g = linearLayout2;
        this.f25593h = textView3;
        this.f25594i = linearLayout3;
        this.f25595j = progressBar;
        this.f25596k = progressBar2;
        this.f25597l = linearLayout4;
    }

    @NonNull
    public static NowWufunTodaynewGameBinding bind(@NonNull View view) {
        int i4 = R.id.appIcon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.appIcon);
        if (simpleDraweeView != null) {
            i4 = R.id.appName;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appName);
            if (textView != null) {
                i4 = R.id.appSize;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.appSize);
                if (textView2 != null) {
                    i4 = R.id.downloadView;
                    DownloadViewNormal downloadViewNormal = (DownloadViewNormal) ViewBindings.findChildViewById(view, R.id.downloadView);
                    if (downloadViewNormal != null) {
                        i4 = R.id.linearLayout2;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout2);
                        if (linearLayout != null) {
                            i4 = R.id.loding_info;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.loding_info);
                            if (textView3 != null) {
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
                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tipsLayout);
                                            if (linearLayout3 != null) {
                                                return new NowWufunTodaynewGameBinding((LinearLayout) view, simpleDraweeView, textView, textView2, downloadViewNormal, linearLayout, textView3, linearLayout2, progressBar, progressBar2, linearLayout3);
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
    public static NowWufunTodaynewGameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25587b;
    }

    @NonNull
    public static NowWufunTodaynewGameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.now_wufun_todaynew_game, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
