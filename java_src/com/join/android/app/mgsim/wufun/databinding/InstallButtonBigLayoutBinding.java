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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class InstallButtonBigLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21588b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ProgressBar f21589c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f21590d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21591e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f21592f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f21593g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f21594h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f21595i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final RelativeLayout f21596j;

    private InstallButtonBigLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull ProgressBar progressBar, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout2) {
        this.f21588b = linearLayout;
        this.f21589c = progressBar;
        this.f21590d = imageView;
        this.f21591e = textView;
        this.f21592f = relativeLayout;
        this.f21593g = textView2;
        this.f21594h = textView3;
        this.f21595i = linearLayout2;
        this.f21596j = relativeLayout2;
    }

    @NonNull
    public static InstallButtonBigLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.butnProgressBar;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.butnProgressBar);
        if (progressBar != null) {
            i4 = R.id.butn_showdownload;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.butn_showdownload);
            if (imageView != null) {
                i4 = R.id.instalButtomButn;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.instalButtomButn);
                if (textView != null) {
                    i4 = R.id.instalbutnLayout;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.instalbutnLayout);
                    if (relativeLayout != null) {
                        i4 = R.id.moneyText;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.moneyText);
                        if (textView2 != null) {
                            i4 = R.id.percent;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.percent);
                            if (textView3 != null) {
                                i4 = R.id.progress_layout;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.progress_layout);
                                if (linearLayout != null) {
                                    i4 = R.id.progressbarLayout;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.progressbarLayout);
                                    if (relativeLayout2 != null) {
                                        return new InstallButtonBigLayoutBinding((LinearLayout) view, progressBar, imageView, textView, relativeLayout, textView2, textView3, linearLayout, relativeLayout2);
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
    public static InstallButtonBigLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21588b;
    }

    @NonNull
    public static InstallButtonBigLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.install_button_big_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
