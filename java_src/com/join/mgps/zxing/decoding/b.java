package com.join.mgps.zxing.decoding;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.common.HybridBinarizer;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.zxing.CaptureActivity;
import java.util.Hashtable;
/* compiled from: DecodeHandler.java */
/* loaded from: classes5.dex */
final class b extends Handler {

    /* renamed from: c  reason: collision with root package name */
    private static final String f55094c = b.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private final CaptureActivity f55095a;

    /* renamed from: b  reason: collision with root package name */
    private final MultiFormatReader f55096b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(CaptureActivity captureActivity, Hashtable<DecodeHintType, Object> hashtable) {
        MultiFormatReader multiFormatReader = new MultiFormatReader();
        this.f55096b = multiFormatReader;
        multiFormatReader.setHints(hashtable);
        this.f55095a = captureActivity;
    }

    private void a(byte[] bArr, int i4, int i5) {
        Result result;
        long currentTimeMillis = System.currentTimeMillis();
        com.join.mgps.zxing.camera.f a5 = com.join.mgps.zxing.camera.c.c().a(bArr, i4, i5);
        try {
            result = this.f55096b.decodeWithState(new BinaryBitmap(new HybridBinarizer(a5)));
            this.f55096b.reset();
        } catch (Exception unused) {
            this.f55096b.reset();
            result = null;
        } catch (Throwable th) {
            this.f55096b.reset();
            throw th;
        }
        if (result != null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            sb.append("Found barcode (");
            sb.append(currentTimeMillis2 - currentTimeMillis);
            sb.append(" ms):\n");
            sb.append(result.toString());
            Message obtain = Message.obtain(this.f55095a.h0(), R.id.decode_succeeded, result);
            Bundle bundle = new Bundle();
            bundle.putParcelable("barcode_bitmap", a5.c());
            obtain.setData(bundle);
            obtain.sendToTarget();
            return;
        }
        Message.obtain(this.f55095a.h0(), (int) R.id.decode_failed).sendToTarget();
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == R.id.decode) {
            a((byte[]) message.obj, message.arg1, message.arg2);
        } else if (i4 == R.id.quit) {
            Looper.myLooper().quit();
        }
    }
}
