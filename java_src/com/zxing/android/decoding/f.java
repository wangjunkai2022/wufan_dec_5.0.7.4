package com.zxing.android.decoding;

import android.os.Handler;
import android.os.Looper;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.ResultPointCallback;
import com.join.mgps.activity.FaceTransferScanQrCodeActivity;
import java.util.Hashtable;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DecodeThreadForFace.java */
/* loaded from: classes6.dex */
public final class f extends Thread {

    /* renamed from: f  reason: collision with root package name */
    public static final String f68756f = "barcode_bitmap";

    /* renamed from: b  reason: collision with root package name */
    private final FaceTransferScanQrCodeActivity f68757b;

    /* renamed from: c  reason: collision with root package name */
    private final Hashtable<DecodeHintType, Object> f68758c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f68759d;

    /* renamed from: e  reason: collision with root package name */
    private final CountDownLatch f68760e = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(FaceTransferScanQrCodeActivity faceTransferScanQrCodeActivity, Vector<BarcodeFormat> vector, String str, ResultPointCallback resultPointCallback) {
        this.f68757b = faceTransferScanQrCodeActivity;
        Hashtable<DecodeHintType, Object> hashtable = new Hashtable<>(3);
        this.f68758c = hashtable;
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
            this.f68760e.await();
        } catch (InterruptedException unused) {
        }
        return this.f68759d;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.f68759d = new d(this.f68757b, this.f68758c);
        this.f68760e.countDown();
        Looper.loop();
    }
}
