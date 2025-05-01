package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.component.video.StandardVideoView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FullscreenActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f20214b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final StandardVideoView f20215c;

    private FullscreenActivityBinding(@NonNull RelativeLayout relativeLayout, @NonNull StandardVideoView standardVideoView) {
        this.f20214b = relativeLayout;
        this.f20215c = standardVideoView;
    }

    @NonNull
    public static FullscreenActivityBinding bind(@NonNull View view) {
        StandardVideoView standardVideoView = (StandardVideoView) ViewBindings.findChildViewById(view, R.id.videoPlayer);
        if (standardVideoView != null) {
            return new FullscreenActivityBinding((RelativeLayout) view, standardVideoView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.videoPlayer)));
    }

    @NonNull
    public static FullscreenActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f20214b;
    }

    @NonNull
    public static FullscreenActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fullscreen_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
