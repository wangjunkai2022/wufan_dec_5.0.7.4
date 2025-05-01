package com.papa.controller.component.inputmanagercompat;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.input.InputManager;
import android.os.Handler;
import android.view.InputDevice;
import android.view.MotionEvent;
import com.papa.controller.component.inputmanagercompat.a;
import java.util.HashMap;
import java.util.Map;
/* compiled from: InputManagerV16.java */
@TargetApi(16)
/* loaded from: classes5.dex */
public class b implements com.papa.controller.component.inputmanagercompat.a {

    /* renamed from: a  reason: collision with root package name */
    private final InputManager f57972a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<a.b, a> f57973b = new HashMap();

    /* compiled from: InputManagerV16.java */
    /* loaded from: classes5.dex */
    static class a implements InputManager.InputDeviceListener {

        /* renamed from: a  reason: collision with root package name */
        final a.b f57974a;

        public a(a.b bVar) {
            this.f57974a = bVar;
        }

        @Override // android.hardware.input.InputManager.InputDeviceListener
        public void onInputDeviceAdded(int i4) {
            this.f57974a.onInputDeviceAdded(i4);
        }

        @Override // android.hardware.input.InputManager.InputDeviceListener
        public void onInputDeviceChanged(int i4) {
            this.f57974a.onInputDeviceChanged(i4);
        }

        @Override // android.hardware.input.InputManager.InputDeviceListener
        public void onInputDeviceRemoved(int i4) {
            this.f57974a.onInputDeviceRemoved(i4);
        }
    }

    public b(Context context) {
        this.f57972a = (InputManager) context.getSystemService("input");
    }

    @Override // com.papa.controller.component.inputmanagercompat.a
    public void a(MotionEvent motionEvent) {
    }

    @Override // com.papa.controller.component.inputmanagercompat.a
    public void b(a.b bVar) {
        a remove = this.f57973b.remove(bVar);
        if (remove != null) {
            this.f57972a.unregisterInputDeviceListener(remove);
        }
    }

    @Override // com.papa.controller.component.inputmanagercompat.a
    public void c(a.b bVar, Handler handler) {
        a aVar = new a(bVar);
        this.f57972a.registerInputDeviceListener(aVar, handler);
        this.f57973b.put(bVar, aVar);
    }

    @Override // com.papa.controller.component.inputmanagercompat.a
    public InputDevice d(int i4) {
        return this.f57972a.getInputDevice(i4);
    }

    @Override // com.papa.controller.component.inputmanagercompat.a
    public int[] e() {
        return this.f57972a.getInputDeviceIds();
    }

    @Override // com.papa.controller.component.inputmanagercompat.a
    public void onPause() {
    }

    @Override // com.papa.controller.component.inputmanagercompat.a
    public void onResume() {
    }
}
