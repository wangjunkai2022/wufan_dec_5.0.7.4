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
public final class ActivityEmuLoadingBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f16011b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f16012c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f16013d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ProgressBar f16014e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f16015f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f16016g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f16017h;

    private ActivityEmuLoadingBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull ProgressBar progressBar, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f16011b = relativeLayout;
        this.f16012c = imageView;
        this.f16013d = linearLayout;
        this.f16014e = progressBar;
        this.f16015f = textView;
        this.f16016g = textView2;
        this.f16017h = textView3;
    }

    @NonNull
    public static ActivityEmuLoadingBinding bind(@NonNull View view) {
        int i4 = R.id.iv_loading;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_loading);
        if (imageView != null) {
            i4 = R.id.ll_download_status;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_download_status);
            if (linearLayout != null) {
                i4 = R.id.pb_progress;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_progress);
                if (progressBar != null) {
                    i4 = R.id.tv_launch_status;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_launch_status);
                    if (textView != null) {
                        i4 = R.id.tv_progress_status_1;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_progress_status_1);
                        if (textView2 != null) {
                            i4 = R.id.tv_progress_status_2;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_progress_status_2);
                            if (textView3 != null) {
                                return new ActivityEmuLoadingBinding((RelativeLayout) view, imageView, linearLayout, progressBar, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityEmuLoadingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f16011b;
    }

    @NonNull
    public static ActivityEmuLoadingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_emu_loading, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
