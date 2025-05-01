package com.zxing.android.decoding;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.join.mgps.activity.FaceTransferScanQrCodeActivity;
import java.util.Vector;
/* loaded from: classes6.dex */
public final class CaptureActivityHandlerForFace extends Handler {

    /* renamed from: d  reason: collision with root package name */
    private static final String f68735d = CaptureActivityHandlerForFace.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private final FaceTransferScanQrCodeActivity f68736a;

    /* renamed from: b  reason: collision with root package name */
    private final f f68737b;

    /* renamed from: c  reason: collision with root package name */
    private State f68738c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public enum State {
        PREVIEW,
        SUCCESS,
        DONE
    }

    public CaptureActivityHandlerForFace(FaceTransferScanQrCodeActivity faceTransferScanQrCodeActivity, Vector<BarcodeFormat> vector, String str) {
        this.f68736a = faceTransferScanQrCodeActivity;
        f fVar = new f(faceTransferScanQrCodeActivity, vector, str, new com.zxing.android.view.a(faceTransferScanQrCodeActivity.t0()));
        this.f68737b = fVar;
        fVar.start();
        this.f68738c = State.SUCCESS;
        faceTransferScanQrCodeActivity.q0().k();
        b();
    }

    private void b() {
        if (this.f68738c == State.SUCCESS) {
            this.f68738c = State.PREVIEW;
            this.f68736a.q0().i(this.f68737b.a(), 2);
            this.f68736a.q0().h(this, 1);
            this.f68736a.p0();
        }
    }

    public void a() {
        this.f68738c = State.DONE;
        this.f68736a.q0().l();
        Message.obtain(this.f68737b.a(), 8).sendToTarget();
        try {
            this.f68737b.join();
        } catch (InterruptedException unused) {
        }
        removeMessages(4);
        removeMessages(3);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == 1) {
            if (this.f68738c == State.PREVIEW) {
                this.f68736a.q0().h(this, 1);
            }
        } else if (i4 == 3) {
            this.f68738c = State.PREVIEW;
            this.f68736a.q0().i(this.f68737b.a(), 2);
        } else if (i4 == 4) {
            this.f68738c = State.SUCCESS;
            Bundle data = message.getData();
            this.f68736a.v0((Result) message.obj, data == null ? null : (Bitmap) data.getParcelable("barcode_bitmap"));
        } else if (i4 == 7) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String) message.obj));
            intent.addFlags(524288);
            this.f68736a.startActivity(intent);
        } else if (i4 == 8) {
            b();
        } else if (i4 != 9) {
        } else {
            this.f68736a.setResult(-1, (Intent) message.obj);
            this.f68736a.finish();
        }
    }
}
