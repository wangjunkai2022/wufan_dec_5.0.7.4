package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.zxing.view.ViewfinderView;
/* loaded from: classes3.dex */
public final class ZxingCameraBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f27231b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f27232c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SurfaceView f27233d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ViewfinderView f27234e;

    private ZxingCameraBinding(@NonNull FrameLayout frameLayout, @NonNull Button button, @NonNull SurfaceView surfaceView, @NonNull ViewfinderView viewfinderView) {
        this.f27231b = frameLayout;
        this.f27232c = button;
        this.f27233d = surfaceView;
        this.f27234e = viewfinderView;
    }

    @NonNull
    public static ZxingCameraBinding bind(@NonNull View view) {
        int i4 = R.id.btn_cancel_scan;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_cancel_scan);
        if (button != null) {
            i4 = R.id.preview_view;
            SurfaceView surfaceView = (SurfaceView) ViewBindings.findChildViewById(view, R.id.preview_view);
            if (surfaceView != null) {
                i4 = R.id.viewfinder_view;
                ViewfinderView viewfinderView = (ViewfinderView) ViewBindings.findChildViewById(view, R.id.viewfinder_view);
                if (viewfinderView != null) {
                    return new ZxingCameraBinding((FrameLayout) view, button, surfaceView, viewfinderView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ZxingCameraBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f27231b;
    }

    @NonNull
    public static ZxingCameraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.zxing_camera, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
