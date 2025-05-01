package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CircleDownloadProgressBar;
/* loaded from: classes3.dex */
public final class LodingProgressLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f23568b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f23569c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final CircleDownloadProgressBar f23570d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23571e;

    private LodingProgressLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull CircleDownloadProgressBar circleDownloadProgressBar, @NonNull TextView textView) {
        this.f23568b = relativeLayout;
        this.f23569c = relativeLayout2;
        this.f23570d = circleDownloadProgressBar;
        this.f23571e = textView;
    }

    @NonNull
    public static LodingProgressLayoutBinding bind(@NonNull View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i4 = R.id.progressBar;
        CircleDownloadProgressBar circleDownloadProgressBar = (CircleDownloadProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
        if (circleDownloadProgressBar != null) {
            i4 = R.id.textView;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView);
            if (textView != null) {
                return new LodingProgressLayoutBinding(relativeLayout, relativeLayout, circleDownloadProgressBar, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LodingProgressLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f23568b;
    }

    @NonNull
    public static LodingProgressLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.loding_progress_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
