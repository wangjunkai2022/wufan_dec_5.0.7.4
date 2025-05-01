package com.join.mgps.zxing.decoding;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.zxing.CaptureActivity;
import java.util.Vector;
/* loaded from: classes5.dex */
public final class CaptureActivityHandler extends Handler {

    /* renamed from: d  reason: collision with root package name */
    private static final String f55081d = CaptureActivityHandler.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private final CaptureActivity f55082a;

    /* renamed from: b  reason: collision with root package name */
    private final c f55083b;

    /* renamed from: c  reason: collision with root package name */
    private State f55084c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public enum State {
        PREVIEW,
        SUCCESS,
        DONE
    }

    public CaptureActivityHandler(CaptureActivity captureActivity, Vector<BarcodeFormat> vector, String str) {
        this.f55082a = captureActivity;
        c cVar = new c(captureActivity, vector, str, new com.join.mgps.zxing.view.b(captureActivity.i0()));
        this.f55083b = cVar;
        cVar.start();
        this.f55084c = State.SUCCESS;
        com.join.mgps.zxing.camera.c.c().l();
        b();
    }

    private void b() {
        if (this.f55084c == State.SUCCESS) {
            this.f55084c = State.PREVIEW;
            com.join.mgps.zxing.camera.c.c().k(this.f55083b.a(), R.id.decode);
            com.join.mgps.zxing.camera.c.c().j(this, R.id.auto_focus);
            this.f55082a.g0();
        }
    }

    public void a() {
        this.f55084c = State.DONE;
        com.join.mgps.zxing.camera.c.c().m();
        Message.obtain(this.f55083b.a(), (int) R.id.quit).sendToTarget();
        try {
            this.f55083b.join();
        } catch (InterruptedException unused) {
        }
        removeMessages(R.id.decode_succeeded);
        removeMessages(R.id.decode_failed);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == R.id.auto_focus) {
            if (this.f55084c == State.PREVIEW) {
                com.join.mgps.zxing.camera.c.c().j(this, R.id.auto_focus);
            }
        } else if (i4 == R.id.restart_preview) {
            b();
        } else if (i4 == R.id.decode_succeeded) {
            this.f55084c = State.SUCCESS;
            Bundle data = message.getData();
            this.f55082a.j0((Result) message.obj, data == null ? null : (Bitmap) data.getParcelable("barcode_bitmap"));
        } else if (i4 == R.id.decode_failed) {
            this.f55084c = State.PREVIEW;
            com.join.mgps.zxing.camera.c.c().k(this.f55083b.a(), R.id.decode);
        } else if (i4 == R.id.return_scan_result) {
            this.f55082a.setResult(-1, (Intent) message.obj);
            this.f55082a.finish();
        } else if (i4 == R.id.launch_product_query) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String) message.obj));
            intent.addFlags(524288);
            this.f55082a.startActivity(intent);
        }
    }
}
