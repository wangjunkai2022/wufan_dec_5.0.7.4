package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.zxing.android.view.ViewfinderView;
/* loaded from: classes3.dex */
public final class FaceTransferScanQrCodeActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f19356b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SurfaceView f19357c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f19358d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TopbarLeftTitleBinding f19359e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ViewfinderView f19360f;

    private FaceTransferScanQrCodeActivityBinding(@NonNull FrameLayout frameLayout, @NonNull SurfaceView surfaceView, @NonNull FrameLayout frameLayout2, @NonNull TopbarLeftTitleBinding topbarLeftTitleBinding, @NonNull ViewfinderView viewfinderView) {
        this.f19356b = frameLayout;
        this.f19357c = surfaceView;
        this.f19358d = frameLayout2;
        this.f19359e = topbarLeftTitleBinding;
        this.f19360f = viewfinderView;
    }

    @NonNull
    public static FaceTransferScanQrCodeActivityBinding bind(@NonNull View view) {
        int i4 = R.id.preview_view;
        SurfaceView surfaceView = (SurfaceView) ViewBindings.findChildViewById(view, R.id.preview_view);
        if (surfaceView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            i4 = R.id.scan_qr_code_title;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.scan_qr_code_title);
            if (findChildViewById != null) {
                TopbarLeftTitleBinding bind = TopbarLeftTitleBinding.bind(findChildViewById);
                i4 = R.id.viewfinder_view;
                ViewfinderView viewfinderView = (ViewfinderView) ViewBindings.findChildViewById(view, R.id.viewfinder_view);
                if (viewfinderView != null) {
                    return new FaceTransferScanQrCodeActivityBinding(frameLayout, surfaceView, frameLayout, bind, viewfinderView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FaceTransferScanQrCodeActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f19356b;
    }

    @NonNull
    public static FaceTransferScanQrCodeActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.face_transfer_scan_qr_code_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
