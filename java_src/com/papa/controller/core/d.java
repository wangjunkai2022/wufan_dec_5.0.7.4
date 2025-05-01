package com.papa.controller.core;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.papa.controller.core.ControllerManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ControllerMonitor.java */
/* loaded from: classes5.dex */
public class d {

    /* renamed from: q  reason: collision with root package name */
    private static d f58065q;

    /* renamed from: b  reason: collision with root package name */
    private Context f58067b;

    /* renamed from: c  reason: collision with root package name */
    private c f58068c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f58069d;

    /* renamed from: p  reason: collision with root package name */
    private Map<String, e> f58081p;

    /* renamed from: a  reason: collision with root package name */
    private final String f58066a = getClass().getSimpleName();

    /* renamed from: e  reason: collision with root package name */
    private boolean f58070e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f58071f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f58072g = false;

    /* renamed from: h  reason: collision with root package name */
    private int f58073h = -1;

    /* renamed from: i  reason: collision with root package name */
    private ControllerManager f58074i = null;

    /* renamed from: j  reason: collision with root package name */
    private ControllerManager.d f58075j = null;

    /* renamed from: k  reason: collision with root package name */
    private Handler f58076k = null;

    /* renamed from: l  reason: collision with root package name */
    private final int f58077l = 1;

    /* renamed from: m  reason: collision with root package name */
    private final int f58078m = 2;

    /* renamed from: n  reason: collision with root package name */
    private final int f58079n = 3;

    /* renamed from: o  reason: collision with root package name */
    private final int f58080o = 4;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ControllerMonitor.java */
    /* loaded from: classes5.dex */
    public class a extends Handler {
        a() {
        }

        void a(ControllerManager.c cVar) {
            if (!d.this.f58071f || !d.this.f58070e || cVar == null || cVar.b() == null) {
                return;
            }
            Object b5 = cVar.b();
            if (b5 instanceof BluetoothDevice) {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) b5;
                String address = bluetoothDevice.getAddress();
                String name = bluetoothDevice.getName();
                if (d.this.f58081p.containsKey(address)) {
                    d.this.m((e) d.this.f58081p.get(address));
                    return;
                }
                e eVar = new e(d.this.f58067b, address, name);
                eVar.E(d.this.f58068c);
                d.this.f58081p.put(address, eVar);
                d.this.D(eVar);
            }
        }

        void b(ControllerManager.c cVar) {
            if (cVar == null || cVar.b() == null) {
                return;
            }
            Object b5 = cVar.b();
            if (b5 instanceof BluetoothDevice) {
                String address = ((BluetoothDevice) b5).getAddress();
                if (d.this.f58081p.containsKey(address)) {
                    d.this.H((e) d.this.f58081p.get(address));
                }
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i4 = message.what;
            if (i4 == 1) {
                Object obj = message.obj;
                if (obj != null) {
                    a((ControllerManager.c) obj);
                }
            } else if (i4 == 2) {
                Object obj2 = message.obj;
                if (obj2 != null) {
                    b((ControllerManager.c) obj2);
                }
            } else if (i4 != 3) {
                if (i4 == 4 && d.this.f58075j != null) {
                    d.this.f58075j.b((ControllerManager.c) message.obj);
                }
            } else if (d.this.f58075j != null) {
                d.this.f58075j.a((ControllerManager.c) message.obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ControllerMonitor.java */
    /* loaded from: classes5.dex */
    public class b implements ControllerManager.d {
        b() {
        }

        @Override // com.papa.controller.core.ControllerManager.d
        public void a(ControllerManager.c cVar) {
            if (d.this.f58076k != null) {
                d.this.f58076k.obtainMessage(3, -1, -1, cVar).sendToTarget();
            }
            c(cVar);
        }

        @Override // com.papa.controller.core.ControllerManager.d
        public void b(ControllerManager.c cVar) {
            if (d.this.f58076k != null) {
                d.this.f58076k.obtainMessage(4, -1, -1, cVar).sendToTarget();
            }
        }

        void c(ControllerManager.c cVar) {
            if (!d.this.f58071f || !d.this.f58070e || cVar == null || cVar.b() == null) {
                return;
            }
            Object b5 = cVar.b();
            if (b5 instanceof BluetoothDevice) {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) b5;
                String address = bluetoothDevice.getAddress();
                String name = bluetoothDevice.getName();
                if (d.this.f58081p.containsKey(address)) {
                    d.this.m((e) d.this.f58081p.get(address));
                    return;
                }
                e eVar = new e(d.this.f58067b, address, name);
                eVar.E(d.this.f58068c);
                eVar.F(d.this.f58069d);
                eVar.G(d.this.f58072g);
                d.this.f58081p.put(address, eVar);
                d.this.D(eVar);
            }
        }
    }

    public d(Context context) {
        this.f58067b = context;
    }

    private void A() {
        if (this.f58081p == null) {
            this.f58081p = new HashMap();
        }
        Context context = this.f58067b;
        if (context == null) {
            return;
        }
        if (this.f58074i == null) {
            this.f58074i = new ControllerManager(context);
            this.f58076k = new a();
            this.f58074i.c(new b());
        }
        this.f58074i.u();
    }

    private void C() {
        Map<String, e> map = this.f58081p;
        if (map == null) {
            return;
        }
        for (e eVar : map.values()) {
            if (!eVar.y()) {
                D(eVar);
            } else if (eVar.x()) {
                D(eVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(e eVar) {
        if (eVar == null) {
            return;
        }
        try {
            m(eVar);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void E() {
        ControllerManager controllerManager = this.f58074i;
        if (controllerManager != null) {
            controllerManager.x();
        }
    }

    private void G() {
        Map<String, e> map = this.f58081p;
        if (map == null) {
            return;
        }
        for (e eVar : map.values()) {
            H(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(e eVar) {
        if (eVar == null) {
            return;
        }
        try {
            eVar.n();
            eVar.K();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m(e eVar) {
        if (eVar != null && eVar.u() != null) {
            String[] strArr = {"mocute"};
            String G = eVar.u().G();
            if (!TextUtils.isEmpty(G)) {
                G.toLowerCase().contains(strArr[0]);
            }
        }
        return false;
    }

    public static d r(Context context) {
        if (f58065q == null) {
            f58065q = new d(context);
        }
        return f58065q;
    }

    private PadMotionEvent t(int i4, String str, int i5, float f5, float f6) {
        try {
            return new PadMotionEvent(System.currentTimeMillis(), i4, str, i5, f5, f6);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private void z(String str, int i4, int i5) {
        if (this.f58081p.containsKey(str)) {
            this.f58081p.get(str).H(i4, i5);
        }
    }

    public void B() {
        this.f58070e = true;
        A();
        C();
    }

    public void F() {
        this.f58070e = false;
        E();
        G();
    }

    @TargetApi(12)
    public boolean n(MotionEvent motionEvent) {
        int deviceId = motionEvent.getDeviceId();
        if (motionEvent.getDevice() != null) {
            String name = motionEvent.getDevice().getName();
            float axisValue = motionEvent.getAxisValue(0);
            float axisValue2 = motionEvent.getAxisValue(1);
            float axisValue3 = motionEvent.getAxisValue(11);
            float axisValue4 = motionEvent.getAxisValue(14);
            if ((motionEvent.getAction() & 255) == 2) {
                c cVar = this.f58068c;
                if (cVar != null) {
                    cVar.w(axisValue, axisValue2, t(deviceId, name, 200, axisValue, axisValue2));
                    this.f58068c.x(axisValue3, axisValue4, t(deviceId, name, 201, axisValue3, axisValue4));
                }
                motionEvent.getAxisValue(17);
                motionEvent.getAxisValue(18);
                return s(motionEvent) == 0;
            }
            return false;
        }
        return false;
    }

    public boolean o(KeyEvent keyEvent) {
        int i4 = keyEvent.getAction() == 0 ? 1 : 0;
        long currentTimeMillis = System.currentTimeMillis();
        int i5 = this.f58073h;
        String name = keyEvent.getDevice().getName();
        int keyCode = keyEvent.getKeyCode();
        PadKeyEvent padKeyEvent = new PadKeyEvent(currentTimeMillis, i5, name, keyCode, i4 ^ 1, i4 != 0 ? 1.0f : 0.0f);
        c cVar = this.f58068c;
        if (cVar != null) {
            if (i4 != 0) {
                cVar.j(keyCode, padKeyEvent);
            } else {
                cVar.D(keyCode, padKeyEvent);
            }
        }
        return true;
    }

    public int p() {
        ControllerManager controllerManager = this.f58074i;
        if (controllerManager != null) {
            return controllerManager.e();
        }
        return 0;
    }

    public List<ControllerManager.c> q() {
        ControllerManager controllerManager = this.f58074i;
        if (controllerManager != null) {
            return controllerManager.f();
        }
        return null;
    }

    @TargetApi(12)
    int s(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(15);
        float axisValue2 = motionEvent.getAxisValue(16);
        int i4 = axisValue == -1.0f ? 21 : axisValue == 1.0f ? 22 : 0;
        return axisValue2 == -1.0f ? i4 | 19 : axisValue2 == 1.0f ? i4 | 20 : i4;
    }

    public void u() {
        this.f58068c = null;
        this.f58069d = null;
        this.f58073h = -1;
    }

    public void v(ControllerManager.d dVar) {
        this.f58075j = dVar;
    }

    public void w(c cVar, Handler handler) {
        this.f58068c = cVar;
        this.f58069d = handler;
    }

    public void x(boolean z4) {
        this.f58072g = z4;
    }

    public void y(int i4, int i5) {
        for (e eVar : this.f58081p.values()) {
            z(eVar.q(), i4, i5);
        }
    }
}
