package com.papa.controller.component.inputmanagercompat;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.view.InputDevice;
import android.view.MotionEvent;
/* compiled from: InputManagerCompat.java */
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: InputManagerCompat.java */
    /* renamed from: com.papa.controller.component.inputmanagercompat.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0586a {
        public static a a(Context context) {
            if (Build.VERSION.SDK_INT >= 16) {
                return new com.papa.controller.component.inputmanagercompat.b(context);
            }
            return new c();
        }
    }

    /* compiled from: InputManagerCompat.java */
    /* loaded from: classes5.dex */
    public interface b {
        void onInputDeviceAdded(int i4);

        void onInputDeviceChanged(int i4);

        void onInputDeviceRemoved(int i4);
    }

    void a(MotionEvent motionEvent);

    void b(b bVar);

    void c(b bVar, Handler handler);

    InputDevice d(int i4);

    int[] e();

    void onPause();

    void onResume();
}
