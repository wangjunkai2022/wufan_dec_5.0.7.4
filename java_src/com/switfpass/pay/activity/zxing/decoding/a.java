package com.switfpass.pay.activity.zxing.decoding;

import android.os.Handler;
import android.os.Looper;
import com.google.zxing.DecodeHintType;
import com.google.zxing.ResultPointCallback;
import com.switfpass.pay.activity.PaySDKCaptureActivity;
import java.util.Hashtable;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
/* loaded from: classes5.dex */
public final class a extends Thread {

    /* renamed from: f  reason: collision with root package name */
    public static final String f61654f = "barcode_bitmap";

    /* renamed from: b  reason: collision with root package name */
    private final PaySDKCaptureActivity f61655b;

    /* renamed from: c  reason: collision with root package name */
    private final Hashtable f61656c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f61657d;

    /* renamed from: e  reason: collision with root package name */
    private final CountDownLatch f61658e = new CountDownLatch(1);

    public a(PaySDKCaptureActivity paySDKCaptureActivity, Vector vector, String str, ResultPointCallback resultPointCallback) {
        this.f61655b = paySDKCaptureActivity;
        Hashtable hashtable = new Hashtable(3);
        this.f61656c = hashtable;
        if (vector == null || vector.isEmpty()) {
            vector = new Vector();
            vector.addAll(j.f61684b);
            vector.addAll(j.f61685c);
            vector.addAll(j.f61686d);
        }
        hashtable.put(DecodeHintType.POSSIBLE_FORMATS, vector);
        if (str != null) {
            hashtable.put(DecodeHintType.CHARACTER_SET, str);
        }
        hashtable.put(DecodeHintType.NEED_RESULT_POINT_CALLBACK, resultPointCallback);
    }

    public final Handler a() {
        try {
            this.f61658e.await();
        } catch (InterruptedException unused) {
        }
        return this.f61657d;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Looper.prepare();
        this.f61657d = new k(this.f61655b, this.f61656c);
        this.f61658e.countDown();
        Looper.loop();
    }
}
