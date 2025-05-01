package com.zxing.android.decoding;

import android.os.Handler;
import android.os.Looper;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.ResultPointCallback;
import com.zxing.android.CaptureActivity;
import java.util.Hashtable;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DecodeThread.java */
/* loaded from: classes6.dex */
public final class e extends Thread {

    /* renamed from: f  reason: collision with root package name */
    public static final String f68751f = "barcode_bitmap";

    /* renamed from: b  reason: collision with root package name */
    private final CaptureActivity f68752b;

    /* renamed from: c  reason: collision with root package name */
    private final Hashtable<DecodeHintType, Object> f68753c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f68754d;

    /* renamed from: e  reason: collision with root package name */
    private final CountDownLatch f68755e = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(CaptureActivity captureActivity, Vector<BarcodeFormat> vector, String str, ResultPointCallback resultPointCallback) {
        this.f68752b = captureActivity;
        Hashtable<DecodeHintType, Object> hashtable = new Hashtable<>(3);
        this.f68753c = hashtable;
        if (vector == null || vector.isEmpty()) {
            vector = new Vector<>();
            vector.addAll(b.f68742c);
            vector.addAll(b.f68743d);
            vector.addAll(b.f68744e);
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
            this.f68755e.await();
        } catch (InterruptedException unused) {
        }
        return this.f68754d;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.f68754d = new c(this.f68752b, this.f68753c);
        this.f68755e.countDown();
        Looper.loop();
    }
}
