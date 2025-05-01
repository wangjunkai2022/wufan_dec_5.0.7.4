package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.zxing.android.view.ViewfinderView;
/* loaded from: classes3.dex */
public final class ActivityCaptureBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f15724b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SurfaceView f15725c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ViewfinderView f15726d;

    private ActivityCaptureBinding(@NonNull RelativeLayout relativeLayout, @NonNull SurfaceView surfaceView, @NonNull ViewfinderView viewfinderView) {
        this.f15724b = relativeLayout;
        this.f15725c = surfaceView;
        this.f15726d = viewfinderView;
    }

    @NonNull
    public static ActivityCaptureBinding bind(@NonNull View view) {
        int i4 = R.id.surfaceview;
        SurfaceView surfaceView = (SurfaceView) ViewBindings.findChildViewById(view, R.id.surfaceview);
        if (surfaceView != null) {
            i4 = R.id.viewfinderview;
            ViewfinderView viewfinderView = (ViewfinderView) ViewBindings.findChildViewById(view, R.id.viewfinderview);
            if (viewfinderView != null) {
                return new ActivityCaptureBinding((RelativeLayout) view, surfaceView, viewfinderView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityCaptureBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f15724b;
    }

    @NonNull
    public static ActivityCaptureBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_capture, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
