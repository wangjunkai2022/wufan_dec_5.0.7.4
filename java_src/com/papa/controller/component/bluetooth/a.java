package com.papa.controller.component.bluetooth;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: BluetoothManager.java */
@TargetApi(11)
/* loaded from: classes5.dex */
public class a {

    /* renamed from: k  reason: collision with root package name */
    private static a f57891k;

    /* renamed from: a  reason: collision with root package name */
    private Context f57892a;

    /* renamed from: b  reason: collision with root package name */
    private BluetoothAdapter f57893b;

    /* renamed from: f  reason: collision with root package name */
    private d f57897f;

    /* renamed from: g  reason: collision with root package name */
    private Map<String, BluetoothDevice> f57898g;

    /* renamed from: h  reason: collision with root package name */
    private Handler f57899h;

    /* renamed from: c  reason: collision with root package name */
    private int f57894c = 0;

    /* renamed from: d  reason: collision with root package name */
    private BluetoothProfile f57895d = null;

    /* renamed from: e  reason: collision with root package name */
    private boolean f57896e = false;

    /* renamed from: i  reason: collision with root package name */
    private BluetoothProfile.ServiceListener f57900i = new b();

    /* renamed from: j  reason: collision with root package name */
    private BroadcastReceiver f57901j = new c();

    /* compiled from: BluetoothManager.java */
    /* renamed from: com.papa.controller.component.bluetooth.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class HandlerC0582a extends Handler {
        HandlerC0582a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object obj;
            super.handleMessage(message);
            if (a.this.f57897f == null || (obj = message.obj) == null) {
                return;
            }
            BluetoothDevice bluetoothDevice = (BluetoothDevice) obj;
            int i4 = message.what;
            if (i4 == 0) {
                a.this.f57897f.b(bluetoothDevice);
            } else if (i4 == 1) {
                a.this.f57897f.a(bluetoothDevice);
            } else if (i4 == 2) {
                String address = bluetoothDevice.getAddress();
                if (a.this.f57898g.containsKey(address)) {
                    a.this.f57898g.remove(address);
                    a.this.v(0, bluetoothDevice);
                }
            } else if (i4 != 3) {
            } else {
                String address2 = bluetoothDevice.getAddress();
                if (a.this.f57898g.containsKey(address2)) {
                    return;
                }
                a.this.f57898g.put(address2, bluetoothDevice);
                a.this.v(1, bluetoothDevice);
            }
        }
    }

    /* compiled from: BluetoothManager.java */
    /* loaded from: classes5.dex */
    class b implements BluetoothProfile.ServiceListener {
        b() {
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i4, BluetoothProfile bluetoothProfile) {
            a.this.r("onServiceConnected");
            a.this.f57895d = bluetoothProfile;
            a.this.s();
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i4) {
            a.this.r("onServiceDisconnected");
            a.this.f57895d = null;
        }
    }

    /* compiled from: BluetoothManager.java */
    /* loaded from: classes5.dex */
    class c extends BroadcastReceiver {

        /* compiled from: BluetoothManager.java */
        /* renamed from: com.papa.controller.component.bluetooth.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        class RunnableC0583a implements Runnable {
            RunnableC0583a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.s();
            }
        }

        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            a.this.r("btReceiver-onReceive");
            String action = intent.getAction();
            if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                if (a.this.f57892a == null || !a.this.p() || !a.this.f57893b.isEnabled() || a.this.q()) {
                    return;
                }
                a.this.x();
                a.this.s();
            } else if (action.equals("android.bluetooth.adapter.action.DISCOVERY_STARTED") || action.equals("android.bluetooth.adapter.action.DISCOVERY_FINISHED")) {
            } else {
                if (action.equals("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED") || action.equals("android.bluetooth.device.action.ACL_CONNECTED") || action.equals("android.bluetooth.device.action.ACL_DISCONNECTED") || action.equals("android.bluetooth.device.action.BOND_STATE_CHANGED")) {
                    if (a.this.f57899h != null) {
                        a.this.f57899h.postDelayed(new RunnableC0583a(), 500L);
                        return;
                    }
                    a.w(500);
                    a.this.s();
                } else if (action.equals("android.bluetooth.device.action.NAME_CHANGED") || action.equals("android.bluetooth.device.action.CLASS_CHANGED") || action.equals("android.bluetooth.device.action.FOUND")) {
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                }
            }
        }
    }

    /* compiled from: BluetoothManager.java */
    /* loaded from: classes5.dex */
    public interface d {
        void a(BluetoothDevice bluetoothDevice);

        void b(BluetoothDevice bluetoothDevice);
    }

    public a(Context context) {
        this.f57893b = null;
        this.f57899h = null;
        this.f57892a = context;
        this.f57893b = BluetoothAdapter.getDefaultAdapter();
        this.f57899h = new HandlerC0582a();
    }

    private void j() {
        r("closeProfileProxy");
        try {
            if (p() && q()) {
                this.f57893b.closeProfileProxy(this.f57894c, this.f57895d);
                this.f57895d = null;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private Collection<BluetoothDevice> l(Map<String, BluetoothDevice> map, Map<String, BluetoothDevice> map2) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.putAll(map);
        hashMap2.putAll(map2);
        Collection<BluetoothDevice> values = hashMap.values();
        values.removeAll(hashMap2.values());
        return values;
    }

    @TargetApi(11)
    private int m() {
        Field[] fields;
        for (Field field : BluetoothProfile.class.getFields()) {
            int modifiers = field.getModifiers();
            if (Modifier.isStatic(modifiers) && Modifier.isPublic(modifiers) && Modifier.isFinal(modifiers)) {
                try {
                    if (field.getName().equals("INPUT_DEVICE")) {
                        return field.getInt(null);
                    }
                    if (field.getName().equals("HID_HOST")) {
                        return field.getInt(null);
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
        return 4;
    }

    public static a n(Context context) {
        if (f57891k == null) {
            f57891k = new a(context);
        }
        return f57891k;
    }

    private void o() {
        try {
            if (this.f57892a == null) {
                return;
            }
            if (this.f57894c == 0) {
                this.f57894c = m();
            }
            if (!p() || q()) {
                return;
            }
            this.f57893b.getProfileProxy(this.f57892a, this.f57900i, this.f57894c);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q() {
        return this.f57895d != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(String str) {
    }

    private void t() {
        r("Registering BluetoothReceiver...");
        try {
            if (this.f57896e) {
                z();
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
            intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED");
            intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
            intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.device.action.CLASS_CHANGED");
            intentFilter.addAction("android.bluetooth.device.action.FOUND");
            intentFilter.addAction("android.bluetooth.device.action.NAME_CHANGED");
            intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
            intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_STARTED");
            intentFilter.addAction("android.bluetooth.adapter.action.LOCAL_NAME_CHANGED");
            intentFilter.addAction("android.bluetooth.adapter.action.REQUEST_DISCOVERABLE");
            intentFilter.addAction("android.bluetooth.adapter.action.REQUEST_ENABLE");
            intentFilter.addAction("android.bluetooth.adapter.action.SCAN_MODE_CHANGED");
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            this.f57892a.registerReceiver(this.f57901j, intentFilter);
            this.f57896e = true;
        } catch (Exception e5) {
            r("Registering BluetoothReceiver failed.");
            e5.printStackTrace();
        }
        r("Registering BluetoothReceiver finished.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(int i4, BluetoothDevice bluetoothDevice) {
        Handler handler = this.f57899h;
        if (handler == null) {
            return;
        }
        Message obtainMessage = handler.obtainMessage();
        obtainMessage.what = i4;
        obtainMessage.obj = bluetoothDevice;
        obtainMessage.sendToTarget();
    }

    public static void w(int i4) {
        try {
            Thread.sleep(i4);
        } catch (InterruptedException unused) {
        }
    }

    private void z() {
        if (this.f57892a == null) {
            return;
        }
        r("Unregistering BluetoothReceiver...");
        try {
            if (this.f57896e) {
                this.f57892a.unregisterReceiver(this.f57901j);
                this.f57896e = false;
            }
        } catch (Exception e5) {
            r("Unregistering BluetoothReceiver failed.");
            e5.printStackTrace();
        }
        r("Unregistering BluetoothReceiver finished.");
    }

    public List<BluetoothDevice> k() {
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                return new ArrayList(this.f57893b.getBondedDevices());
            }
            BluetoothProfile bluetoothProfile = this.f57895d;
            if (bluetoothProfile != null) {
                return bluetoothProfile.getConnectedDevices();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public boolean p() {
        try {
            BluetoothAdapter bluetoothAdapter = this.f57893b;
            if (bluetoothAdapter != null && !bluetoothAdapter.getAddress().equals(null)) {
                return true;
            }
            r("Bluetooth is not available.");
            return false;
        } catch (NullPointerException unused) {
            r("Bluetooth is not available. Cannot get bluetooth address.");
            return false;
        }
    }

    synchronized void s() {
        if (q()) {
            if (this.f57898g == null) {
                this.f57898g = new HashMap();
            }
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap.putAll(this.f57898g);
            List<BluetoothDevice> k4 = k();
            for (int i4 = 0; k4 != null && i4 < k4.size(); i4++) {
                BluetoothDevice bluetoothDevice = k4.get(i4);
                hashMap2.put(bluetoothDevice.getAddress(), bluetoothDevice);
            }
            for (BluetoothDevice bluetoothDevice2 : l(hashMap, hashMap2)) {
                this.f57899h.obtainMessage(2, -1, -1, bluetoothDevice2).sendToTarget();
            }
            for (BluetoothDevice bluetoothDevice3 : l(hashMap2, hashMap)) {
                this.f57899h.obtainMessage(3, -1, -1, bluetoothDevice3).sendToTarget();
            }
        }
    }

    public void u(d dVar) {
        this.f57897f = dVar;
        s();
    }

    public void x() {
        r("BluetoothManager starting ...");
        if (!p()) {
            r("BluetoothManager start failed.");
            return;
        }
        t();
        try {
            if (q()) {
                j();
            }
            o();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        r("BluetoothManager start finished.");
    }

    public void y() {
        try {
            j();
            z();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
