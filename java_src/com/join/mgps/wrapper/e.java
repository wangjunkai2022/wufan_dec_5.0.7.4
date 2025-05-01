package com.join.mgps.wrapper;

import android.annotation.TargetApi;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
/* compiled from: Wrapper5.java */
@TargetApi(5)
/* loaded from: classes5.dex */
class e {
    e() {
    }

    public static void a(Activity activity) {
        activity.onBackPressed();
    }

    public static boolean b(KeyEvent keyEvent) {
        return keyEvent.isLongPress();
    }

    public static final int c(MotionEvent motionEvent, int i4) {
        return motionEvent.findPointerIndex(i4);
    }

    public static final int d(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }

    public static final int e(MotionEvent motionEvent, int i4) {
        return motionEvent.getPointerId(i4);
    }

    public static final float f(MotionEvent motionEvent, int i4) {
        return motionEvent.getSize(i4);
    }

    public static final float g(MotionEvent motionEvent, int i4) {
        return motionEvent.getX(i4);
    }

    public static final float h(MotionEvent motionEvent, int i4) {
        return motionEvent.getY(i4);
    }

    public static final boolean i() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.getScanMode() == 23;
    }

    public static final boolean j() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    public static final boolean k() {
        return BluetoothAdapter.getDefaultAdapter() != null;
    }

    public static final boolean l(Context context) {
        if (a.f55010b < 7) {
            return true;
        }
        return context.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch");
    }
}
