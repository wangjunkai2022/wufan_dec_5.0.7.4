package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class UpdateBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26821b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26822c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f26823d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ProgressBar f26824e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26825f;

    private UpdateBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ProgressBar progressBar, @NonNull TextView textView2) {
        this.f26821b = linearLayout;
        this.f26822c = textView;
        this.f26823d = imageView;
        this.f26824e = progressBar;
        this.f26825f = textView2;
    }

    @NonNull
    public static UpdateBinding bind(@NonNull View view) {
        int i4 = R.id.appInfo;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appInfo);
        if (textView != null) {
            i4 = R.id.ivLogo;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivLogo);
            if (imageView != null) {
                i4 = R.id.pbDownload;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pbDownload);
                if (progressBar != null) {
                    i4 = R.id.tvProcess;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvProcess);
                    if (textView2 != null) {
                        return new UpdateBinding((LinearLayout) view, textView, imageView, progressBar, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static UpdateBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26821b;
    }

    @NonNull
    public static UpdateBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.update, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
