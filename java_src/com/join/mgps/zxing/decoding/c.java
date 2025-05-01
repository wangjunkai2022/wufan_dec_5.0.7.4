package com.join.mgps.zxing.decoding;

import android.os.Handler;
import android.os.Looper;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.ResultPointCallback;
import com.join.mgps.zxing.CaptureActivity;
import java.util.Hashtable;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DecodeThread.java */
/* loaded from: classes5.dex */
public final class c extends Thread {

    /* renamed from: f  reason: collision with root package name */
    public static final String f55097f = "barcode_bitmap";

    /* renamed from: b  reason: collision with root package name */
    private final CaptureActivity f55098b;

    /* renamed from: c  reason: collision with root package name */
    private final Hashtable<DecodeHintType, Object> f55099c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f55100d;

    /* renamed from: e  reason: collision with root package name */
    private final CountDownLatch f55101e = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(CaptureActivity captureActivity, Vector<BarcodeFormat> vector, String str, ResultPointCallback resultPointCallback) {
        this.f55098b = captureActivity;
        Hashtable<DecodeHintType, Object> hashtable = new Hashtable<>(3);
        this.f55099c = hashtable;
        if (vector == null || vector.isEmpty()) {
            vector = new Vector<>();
            vector.addAll(a.f55091c);
            vector.addAll(a.f55092d);
            vector.addAll(a.f55093e);
        }
        hashtable.put(DecodeHintType.POSSIBLE_FORMATS, vector);
        if (str != null) {
            hashtable.put(DecodeHintType.CHARACTER_SET, str);
        }
        hashtable.put(DecodeHintType.NEED_RESULT_POINT_CALLBACK, resultPointCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Handler a() {
        try {
            this.f55101e.await();
        } catch (InterruptedException unused) {
        }
        return this.f55100d;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.f55100d = new b(this.f55098b, this.f55099c);
        this.f55101e.countDown();
        Looper.loop();
    }
}
