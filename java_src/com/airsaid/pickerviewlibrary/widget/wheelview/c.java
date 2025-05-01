package com.airsaid.pickerviewlibrary.widget.wheelview;

import android.os.Handler;
import android.os.Message;
import com.airsaid.pickerviewlibrary.widget.wheelview.WheelView;
/* compiled from: MessageHandler.java */
/* loaded from: classes2.dex */
final class c extends Handler {

    /* renamed from: b  reason: collision with root package name */
    public static final int f4500b = 1000;

    /* renamed from: c  reason: collision with root package name */
    public static final int f4501c = 2000;

    /* renamed from: d  reason: collision with root package name */
    public static final int f4502d = 3000;

    /* renamed from: a  reason: collision with root package name */
    final WheelView f4503a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(WheelView wheelView) {
        this.f4503a = wheelView;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == 1000) {
            this.f4503a.invalidate();
        } else if (i4 == 2000) {
            this.f4503a.m(WheelView.ACTION.FLING);
        } else if (i4 != 3000) {
        } else {
            this.f4503a.j();
        }
    }
}
