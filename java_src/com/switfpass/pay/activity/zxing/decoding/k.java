package com.switfpass.pay.activity.zxing.decoding;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.common.HybridBinarizer;
import com.join.android.app.mgsim.wufun.R;
import com.switfpass.pay.activity.PaySDKCaptureActivity;
import java.util.Hashtable;
/* loaded from: classes5.dex */
final class k extends Handler {

    /* renamed from: c  reason: collision with root package name */
    private static final String f61687c = k.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private final PaySDKCaptureActivity f61688a;

    /* renamed from: b  reason: collision with root package name */
    private final MultiFormatReader f61689b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(PaySDKCaptureActivity paySDKCaptureActivity, Hashtable hashtable) {
        MultiFormatReader multiFormatReader = new MultiFormatReader();
        this.f61689b = multiFormatReader;
        multiFormatReader.setHints(hashtable);
        this.f61688a = paySDKCaptureActivity;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i4 = message.what;
        if (i4 != R.dimen.abc_action_bar_content_inset_with_nav) {
            if (i4 == R.dimen.abc_action_bar_overflow_padding_end_material) {
                Looper.myLooper().quit();
                return;
            }
            return;
        }
        byte[] bArr = (byte[]) message.obj;
        int i5 = message.arg1;
        int i6 = message.arg2;
        long currentTimeMillis = System.currentTimeMillis();
        Result result = null;
        byte[] bArr2 = new byte[bArr.length];
        for (int i7 = 0; i7 < i6; i7++) {
            for (int i8 = 0; i8 < i5; i8++) {
                bArr2[(((i8 * i6) + i6) - i7) - 1] = bArr[(i7 * i5) + i8];
            }
        }
        com.switfpass.pay.activity.zxing.camera.b a5 = com.switfpass.pay.activity.zxing.camera.a.c().a(bArr2, i6, i5);
        try {
            result = this.f61689b.decodeWithState(new BinaryBitmap(new HybridBinarizer(a5)));
        } catch (ReaderException unused) {
        } catch (Throwable th) {
            this.f61689b.reset();
            throw th;
        }
        this.f61689b.reset();
        if (result == null) {
            Message.obtain(this.f61688a.getHandler(), (int) R.dimen.abc_action_bar_default_height_material).sendToTarget();
            return;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Found barcode (");
        sb.append(currentTimeMillis2 - currentTimeMillis);
        sb.append(" ms):\n");
        sb.append(result.toString());
        Message obtain = Message.obtain(this.f61688a.getHandler(), R.dimen.abc_action_bar_default_padding_end_material, result);
        Bundle bundle = new Bundle();
        bundle.putParcelable("barcode_bitmap", a5.c());
        obtain.setData(bundle);
        obtain.sendToTarget();
    }
}
