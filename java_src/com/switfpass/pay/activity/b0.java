package com.switfpass.pay.activity;

import android.os.Handler;
import android.os.Message;
/* loaded from: classes5.dex */
final class b0 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == -1) {
            new StringBuilder().append(message.obj);
        } else if (i4 != 0) {
        } else {
            new StringBuilder().append(message.obj);
        }
    }
}
