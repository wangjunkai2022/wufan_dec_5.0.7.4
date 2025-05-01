package com.zxing.android.decoding;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.zxing.android.CaptureActivity;
import java.util.Vector;
/* loaded from: classes6.dex */
public final class CaptureActivityHandler extends Handler {

    /* renamed from: d  reason: collision with root package name */
    private static final String f68731d = CaptureActivityHandler.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private final CaptureActivity f68732a;

    /* renamed from: b  reason: collision with root package name */
    private final e f68733b;

    /* renamed from: c  reason: collision with root package name */
    private State f68734c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public enum State {
        PREVIEW,
        SUCCESS,
        DONE
    }

    public CaptureActivityHandler(CaptureActivity captureActivity, Vector<BarcodeFormat> vector, String str) {
        this.f68732a = captureActivity;
        e eVar = new e(captureActivity, vector, str, new com.zxing.android.view.a(captureActivity.d()));
        this.f68733b = eVar;
        eVar.start();
        this.f68734c = State.SUCCESS;
        captureActivity.b().k();
        b();
    }

    private void b() {
        if (this.f68734c == State.SUCCESS) {
            this.f68734c = State.PREVIEW;
            this.f68732a.b().i(this.f68733b.a(), 2);
            this.f68732a.b().h(this, 1);
            this.f68732a.a();
        }
    }

    public void a() {
        this.f68734c = State.DONE;
        this.f68732a.b().l();
        Message.obtain(this.f68733b.a(), 8).sendToTarget();
        try {
            this.f68733b.join();
        } catch (InterruptedException unused) {
        }
        removeMessages(4);
        removeMessages(3);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == 1) {
            if (this.f68734c == State.PREVIEW) {
                this.f68732a.b().h(this, 1);
            }
        } else if (i4 == 3) {
            this.f68734c = State.PREVIEW;
            this.f68732a.b().i(this.f68733b.a(), 2);
        } else if (i4 == 4) {
            this.f68734c = State.SUCCESS;
            Bundle data = message.getData();
            this.f68732a.e((Result) message.obj, data == null ? null : (Bitmap) data.getParcelable("barcode_bitmap"));
        } else if (i4 == 7) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String) message.obj));
            intent.addFlags(524288);
            this.f68732a.startActivity(intent);
        } else if (i4 == 8) {
            b();
        } else if (i4 != 9) {
        } else {
            this.f68732a.setResult(-1, (Intent) message.obj);
            this.f68732a.finish();
        }
    }
}
