package org.ppsspp.ppsspp;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
/* compiled from: InputDeviceState.java */
@TargetApi(12)
/* loaded from: classes7.dex */
public class d {

    /* renamed from: c  reason: collision with root package name */
    private static final String f72940c = "InputDeviceState";

    /* renamed from: d  reason: collision with root package name */
    private static final int f72941d = 10;

    /* renamed from: a  reason: collision with root package name */
    private InputDevice f72942a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f72943b;

    public d(InputDevice inputDevice) {
        this.f72942a = inputDevice;
        int i4 = 0;
        int i5 = 0;
        for (InputDevice.MotionRange motionRange : inputDevice.getMotionRanges()) {
            if ((motionRange.getSource() & 16) != 0) {
                i5++;
            }
        }
        this.f72943b = new int[i5];
        for (InputDevice.MotionRange motionRange2 : inputDevice.getMotionRanges()) {
            if ((motionRange2.getSource() & 16) != 0) {
                this.f72943b[i4] = motionRange2.getAxis();
                i4++;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Registering input device with ");
        sb.append(i5);
        sb.append(" axes: ");
        sb.append(inputDevice.getName());
        if (Build.VERSION.SDK_INT >= 19) {
            b(inputDevice);
        }
        NativeApp.sendMessage("inputDeviceConnected", inputDevice.getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InputDevice a() {
        return this.f72942a;
    }

    @TargetApi(19)
    void b(InputDevice inputDevice) {
        StringBuilder sb = new StringBuilder();
        sb.append("Vendor ID:");
        sb.append(inputDevice.getVendorId());
        sb.append(" productId: ");
        sb.append(inputDevice.getProductId());
    }

    public boolean c(MotionEvent motionEvent) {
        int i4 = 0;
        if ((motionEvent.getSource() & 16) == 0) {
            return false;
        }
        NativeApp.beginJoystickEvent();
        while (true) {
            int[] iArr = this.f72943b;
            if (i4 < iArr.length) {
                int i5 = iArr[i4];
                NativeApp.joystickAxis(10, i5, motionEvent.getAxisValue(i5));
                i4++;
            } else {
                NativeApp.endJoystickEvent();
                return true;
            }
        }
    }

    public boolean d(KeyEvent keyEvent) {
        return NativeApp.keyDown(10, keyEvent.getKeyCode(), keyEvent.getRepeatCount() > 0);
    }

    public boolean e(KeyEvent keyEvent) {
        return NativeApp.keyUp(10, keyEvent.getKeyCode());
    }
}
