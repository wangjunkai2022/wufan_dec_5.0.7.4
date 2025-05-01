package com.join.mgps.zxing.decoding;

import android.os.Handler;
import android.os.Looper;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.ResultPointCallback;
import com.join.mgps.activity.FaceTransferScanQrCodeActivity;
import java.util.Hashtable;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
/* compiled from: FaceTransferDecodeThread.java */
/* loaded from: classes5.dex */
public class e extends Thread {

    /* renamed from: f  reason: collision with root package name */
    public static final String f55105f = "barcode_bitmap";

    /* renamed from: b  reason: collision with root package name */
    private final FaceTransferScanQrCodeActivity f55106b;

    /* renamed from: c  reason: collision with root package name */
    private final Hashtable<DecodeHintType, Object> f55107c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f55108d;

    /* renamed from: e  reason: collision with root package name */
    private final CountDownLatch f55109e = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(FaceTransferScanQrCodeActivity faceTransferScanQrCodeActivity, Vector<BarcodeFormat> vector, String str, ResultPointCallback resultPointCallback) {
        this.f55106b = faceTransferScanQrCodeActivity;
        Hashtable<DecodeHintType, Object> hashtable = new Hashtable<>(3);
        this.f55107c = hashtable;
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
            this.f55109e.await();
        } catch (InterruptedException unused) {
        }
        return this.f55108d;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.f55108d = new d(this.f55106b, this.f55107c);
        this.f55109e.countDown();
        Looper.loop();
    }
}
