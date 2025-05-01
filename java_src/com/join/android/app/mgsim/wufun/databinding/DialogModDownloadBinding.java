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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogModDownloadBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18847b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f18848c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ProgressBar f18849d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18850e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18851f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f18852g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f18853h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f18854i;

    private DialogModDownloadBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ProgressBar progressBar, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f18847b = linearLayout;
        this.f18848c = linearLayout2;
        this.f18849d = progressBar;
        this.f18850e = textView;
        this.f18851f = textView2;
        this.f18852g = textView3;
        this.f18853h = textView4;
        this.f18854i = textView5;
    }

    @NonNull
    public static DialogModDownloadBinding bind(@NonNull View view) {
        int i4 = R.id.ll_mod_download;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_mod_download);
        if (linearLayout != null) {
            i4 = R.id.pb_mod_progress;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_mod_progress);
            if (progressBar != null) {
                i4 = R.id.tv_mod_opt_left;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_mod_opt_left);
                if (textView != null) {
                    i4 = R.id.tv_mod_opt_right;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_mod_opt_right);
                    if (textView2 != null) {
                        i4 = R.id.tv_mod_progress;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_mod_progress);
                        if (textView3 != null) {
                            i4 = R.id.tv_mod_status;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_mod_status);
                            if (textView4 != null) {
                                i4 = R.id.tv_mod_title;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_mod_title);
                                if (textView5 != null) {
                                    return new DialogModDownloadBinding((LinearLayout) view, linearLayout, progressBar, textView, textView2, textView3, textView4, textView5);
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
    public static DialogModDownloadBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18847b;
    }

    @NonNull
    public static DialogModDownloadBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_mod_download, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
