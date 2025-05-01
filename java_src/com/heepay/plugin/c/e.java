package com.heepay.plugin.c;

import android.os.Message;
/* loaded from: classes3.dex */
public class e {
    public static Message a(int i4, com.heepay.plugin.domain.f fVar) {
        Message obtain = Message.obtain();
        obtain.what = i4;
        obtain.obj = fVar.b();
        return obtain;
    }

    public static Message a(int i4, Exception exc, String str) {
        Message obtain = Message.obtain();
        obtain.what = i4;
        if (exc.getMessage() != null) {
            obtain.obj = exc.getMessage();
        } else {
            obtain.obj = str;
        }
        return obtain;
    }

    public static Message a(int i4, String str) {
        Message obtain = Message.obtain();
        obtain.what = i4;
        obtain.obj = str;
        return obtain;
    }

    public static Message b(int i4, com.heepay.plugin.domain.f fVar) {
        Message obtain = Message.obtain();
        obtain.what = i4;
        obtain.obj = fVar.c();
        return obtain;
    }
}
