package com.zxing.android.decoding;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.common.HybridBinarizer;
import com.zxing.android.CaptureActivity;
import java.util.Hashtable;
/* compiled from: DecodeHandler.java */
/* loaded from: classes6.dex */
final class c extends Handler {

    /* renamed from: c  reason: collision with root package name */
    private static final String f68745c = c.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private final CaptureActivity f68746a;

    /* renamed from: b  reason: collision with root package name */
    private final MultiFormatReader f68747b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(CaptureActivity captureActivity, Hashtable<DecodeHintType, Object> hashtable) {
        MultiFormatReader multiFormatReader = new MultiFormatReader();
        this.f68747b = multiFormatReader;
        multiFormatReader.setHints(hashtable);
        this.f68746a = captureActivity;
    }

    private void a(byte[] bArr, int i4, int i5) {
        Result result;
        long currentTimeMillis = System.currentTimeMillis();
        byte[] bArr2 = new byte[bArr.length];
        for (int i6 = 0; i6 < i5; i6++) {
            for (int i7 = 0; i7 < i4; i7++) {
                bArr2[(((i7 * i5) + i5) - i6) - 1] = bArr[(i6 * i4) + i7];
            }
        }
        com.zxing.android.camera.e a5 = this.f68746a.b().a(bArr2, i5, i4);
        try {
            result = this.f68747b.decodeWithState(new BinaryBitmap(new HybridBinarizer(a5)));
            this.f68747b.reset();
        } catch (ReaderException unused) {
            this.f68747b.reset();
            result = null;
        } catch (Throwable th) {
            this.f68747b.reset();
            throw th;
        }
        if (result != null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            sb.append("Found barcode (");
            sb.append(currentTimeMillis2 - currentTimeMillis);
            sb.append(" ms):\n");
            sb.append(result.toString());
            Message obtain = Message.obtain(this.f68746a.c(), 4, result);
            Bundle bundle = new Bundle();
            bundle.putParcelable("barcode_bitmap", a5.a());
            obtain.setData(bundle);
            obtain.sendToTarget();
            return;
        }
        Message.obtain(this.f68746a.c(), 3).sendToTarget();
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == 2) {
            a((byte[]) message.obj, message.arg1, message.arg2);
        } else if (i4 != 8) {
        } else {
            Looper.myLooper().quit();
        }
    }
}
