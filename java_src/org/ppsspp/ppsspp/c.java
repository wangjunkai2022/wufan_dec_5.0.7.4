package org.ppsspp.ppsspp;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.YuvImage;
import android.hardware.Camera;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
/* compiled from: CameraHelper.java */
@TargetApi(23)
/* loaded from: classes7.dex */
class c {

    /* renamed from: g  reason: collision with root package name */
    private static final String f72932g = "CameraHelper";

    /* renamed from: a  reason: collision with root package name */
    private Camera f72933a = null;

    /* renamed from: b  reason: collision with root package name */
    private int f72934b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f72935c = 0;

    /* renamed from: d  reason: collision with root package name */
    private long f72936d = 0;

    /* renamed from: f  reason: collision with root package name */
    private Camera.PreviewCallback f72938f = new a();

    /* renamed from: e  reason: collision with root package name */
    private SurfaceTexture f72937e = new SurfaceTexture(10);

    /* compiled from: CameraHelper.java */
    /* loaded from: classes7.dex */
    class a implements Camera.PreviewCallback {
        a() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - c.this.f72936d < 100) {
                return;
            }
            c.this.f72936d = currentTimeMillis;
            YuvImage yuvImage = new YuvImage(bArr, 17, c.this.f72934b, c.this.f72935c, null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            yuvImage.compressToJpeg(new Rect((c.this.f72934b - 480) / 2, (c.this.f72935c - 272) / 2, c.this.f72934b - ((c.this.f72934b - 480) / 2), c.this.f72935c - ((c.this.f72935c - 272) / 2)), 80, byteArrayOutputStream);
            NativeApp.pushCameraImage(byteArrayOutputStream.toByteArray());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        try {
            Camera open = Camera.open();
            this.f72933a = open;
            Camera.Parameters parameters = open.getParameters();
            List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
            this.f72934b = supportedPreviewSizes.get(0).width;
            this.f72935c = supportedPreviewSizes.get(0).height;
            int i4 = 0;
            while (true) {
                if (i4 >= supportedPreviewSizes.size()) {
                    break;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("getSupportedPreviewSizes[");
                sb.append(i4);
                sb.append("]: ");
                sb.append(supportedPreviewSizes.get(i4).height);
                sb.append(" ");
                sb.append(supportedPreviewSizes.get(i4).width);
                if (supportedPreviewSizes.get(i4).width <= 640 && supportedPreviewSizes.get(i4).height <= 480) {
                    this.f72934b = supportedPreviewSizes.get(i4).width;
                    this.f72935c = supportedPreviewSizes.get(i4).height;
                    break;
                }
                i4++;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("setPreviewSize(");
            sb2.append(this.f72934b);
            sb2.append(", ");
            sb2.append(this.f72935c);
            sb2.append(")");
            parameters.setPreviewSize(this.f72934b, this.f72935c);
            List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
            int[] iArr = supportedPreviewFpsRange.get(0);
            for (int i5 = 0; i5 < supportedPreviewFpsRange.size(); i5++) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("getSupportedPreviewFpsRange[");
                sb3.append(i5);
                sb3.append("]: ");
                sb3.append(supportedPreviewFpsRange.get(i5)[0]);
                sb3.append(" ");
                sb3.append(supportedPreviewFpsRange.get(i5)[1]);
                if (supportedPreviewFpsRange.get(i5)[0] <= iArr[0] && supportedPreviewFpsRange.get(i5)[1] <= iArr[1]) {
                    iArr = supportedPreviewFpsRange.get(i5);
                }
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("setPreviewFpsRange(");
            sb4.append(iArr[0]);
            sb4.append(", ");
            sb4.append(iArr[1]);
            sb4.append(")");
            parameters.setPreviewFpsRange(iArr[0], iArr[1]);
            this.f72933a.setParameters(parameters);
            this.f72933a.setPreviewTexture(this.f72937e);
            this.f72933a.setPreviewCallback(this.f72938f);
            this.f72933a.startPreview();
        } catch (IOException e5) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Cannot start camera: ");
            sb5.append(e5.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        Camera camera = this.f72933a;
        if (camera != null) {
            camera.setPreviewCallback(null);
            this.f72933a.stopPreview();
            this.f72933a.release();
            this.f72933a = null;
        }
    }
}
