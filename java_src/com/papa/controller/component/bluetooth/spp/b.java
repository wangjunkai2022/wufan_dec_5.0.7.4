package com.papa.controller.component.bluetooth.spp;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.UUID;
/* compiled from: BluetoothService.java */
@SuppressLint({"NewApi"})
/* loaded from: classes5.dex */
public class b {

    /* renamed from: h  reason: collision with root package name */
    private static final String f57930h = "Bluetooth Service";

    /* renamed from: i  reason: collision with root package name */
    private static final String f57931i = "Bluetooth Secure";

    /* renamed from: j  reason: collision with root package name */
    private static final UUID f57932j = UUID.fromString("fa87c0d0-afac-11de-8a39-0800200c9a66");

    /* renamed from: k  reason: collision with root package name */
    private static final UUID f57933k = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");

    /* renamed from: b  reason: collision with root package name */
    private final Handler f57935b;

    /* renamed from: c  reason: collision with root package name */
    private a f57936c;

    /* renamed from: d  reason: collision with root package name */
    private C0585b f57937d;

    /* renamed from: e  reason: collision with root package name */
    private d f57938e;

    /* renamed from: g  reason: collision with root package name */
    private boolean f57940g = false;

    /* renamed from: a  reason: collision with root package name */
    private final BluetoothAdapter f57934a = BluetoothAdapter.getDefaultAdapter();

    /* renamed from: f  reason: collision with root package name */
    private int f57939f = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BluetoothService.java */
    /* loaded from: classes5.dex */
    public class a extends Thread {

        /* renamed from: b  reason: collision with root package name */
        private BluetoothServerSocket f57941b;

        /* renamed from: c  reason: collision with root package name */
        private String f57942c;

        /* renamed from: d  reason: collision with root package name */
        boolean f57943d = true;

        public a(boolean z4) {
            BluetoothServerSocket bluetoothServerSocket;
            try {
                bluetoothServerSocket = z4 ? b.this.f57934a.listenUsingRfcommWithServiceRecord(b.f57931i, b.f57932j) : b.this.f57934a.listenUsingRfcommWithServiceRecord(b.f57931i, b.f57933k);
            } catch (IOException unused) {
                bluetoothServerSocket = null;
            }
            this.f57941b = bluetoothServerSocket;
        }

        public void a() {
            try {
                this.f57941b.close();
                this.f57941b = null;
            } catch (IOException unused) {
            }
        }

        public void b() {
            this.f57943d = false;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(6:14|15|(3:17|(1:27)(1:(1:22))|23)|28|29|23) */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AcceptThread"
                r0.append(r1)
                java.lang.String r1 = r5.f57942c
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r5.setName(r0)
                r0 = 0
            L17:
                com.papa.controller.component.bluetooth.spp.b r1 = com.papa.controller.component.bluetooth.spp.b.this
                int r1 = com.papa.controller.component.bluetooth.spp.b.d(r1)
                r2 = 3
                if (r1 == r2) goto L56
                boolean r1 = r5.f57943d
                if (r1 == 0) goto L56
                android.bluetooth.BluetoothServerSocket r1 = r5.f57941b     // Catch: java.io.IOException -> L56
                if (r1 == 0) goto L2c
                android.bluetooth.BluetoothSocket r0 = r1.accept()     // Catch: java.io.IOException -> L56
            L2c:
                if (r0 == 0) goto L17
                com.papa.controller.component.bluetooth.spp.b r1 = com.papa.controller.component.bluetooth.spp.b.this
                monitor-enter(r1)
                com.papa.controller.component.bluetooth.spp.b r3 = com.papa.controller.component.bluetooth.spp.b.this     // Catch: java.lang.Throwable -> L53
                int r3 = com.papa.controller.component.bluetooth.spp.b.d(r3)     // Catch: java.lang.Throwable -> L53
                if (r3 == 0) goto L4e
                r4 = 1
                if (r3 == r4) goto L42
                r4 = 2
                if (r3 == r4) goto L42
                if (r3 == r2) goto L4e
                goto L51
            L42:
                com.papa.controller.component.bluetooth.spp.b r2 = com.papa.controller.component.bluetooth.spp.b.this     // Catch: java.lang.Throwable -> L53
                android.bluetooth.BluetoothDevice r3 = r0.getRemoteDevice()     // Catch: java.lang.Throwable -> L53
                java.lang.String r4 = r5.f57942c     // Catch: java.lang.Throwable -> L53
                r2.k(r0, r3, r4)     // Catch: java.lang.Throwable -> L53
                goto L51
            L4e:
                r0.close()     // Catch: java.io.IOException -> L51 java.lang.Throwable -> L53
            L51:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L53
                goto L17
            L53:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L53
                throw r0
            L56:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.papa.controller.component.bluetooth.spp.b.a.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BluetoothService.java */
    /* renamed from: com.papa.controller.component.bluetooth.spp.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C0585b extends Thread {

        /* renamed from: b  reason: collision with root package name */
        private final BluetoothSocket f57945b;

        /* renamed from: c  reason: collision with root package name */
        private final BluetoothDevice f57946c;

        /* renamed from: d  reason: collision with root package name */
        private String f57947d;

        public C0585b(BluetoothDevice bluetoothDevice) {
            BluetoothSocket bluetoothSocket;
            this.f57946c = bluetoothDevice;
            try {
                bluetoothSocket = b.this.f57940g ? bluetoothDevice.createRfcommSocketToServiceRecord(b.f57932j) : bluetoothDevice.createRfcommSocketToServiceRecord(b.f57933k);
            } catch (IOException unused) {
                bluetoothSocket = null;
            }
            this.f57945b = bluetoothSocket;
        }

        public void a() {
            try {
                this.f57945b.close();
            } catch (IOException unused) {
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            b.this.f57934a.cancelDiscovery();
            try {
                try {
                    this.f57945b.connect();
                    synchronized (b.this) {
                        b.this.f57937d = null;
                    }
                    b.this.k(this.f57945b, this.f57946c, this.f57947d);
                } catch (IOException unused) {
                    this.f57945b.close();
                    b.this.l();
                }
            } catch (IOException unused2) {
                b.this.l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BluetoothService.java */
    /* loaded from: classes5.dex */
    public class c extends d {
        public c(BluetoothSocket bluetoothSocket, String str) {
            super(bluetoothSocket, str);
        }

        boolean c(ArrayList<Integer> arrayList, int i4) {
            if (arrayList == null || arrayList.size() <= 3 || arrayList.size() + 1 != arrayList.get(3).intValue()) {
                return false;
            }
            arrayList.add(Integer.valueOf(i4));
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
            if (r1 != r5) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
            r2 = false;
         */
        @Override // com.papa.controller.component.bluetooth.spp.b.d, java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
            L5:
                java.io.InputStream r1 = r7.f57951c     // Catch: java.io.IOException -> L77
                int r1 = r1.read()     // Catch: java.io.IOException -> L77
                java.lang.String r2 = "GB"
                byte[] r2 = r2.getBytes()     // Catch: java.io.IOException -> L77
                r3 = 0
                r4 = 0
            L13:
                int r5 = r2.length     // Catch: java.io.IOException -> L77
                if (r4 >= r5) goto L32
                r5 = r2[r4]     // Catch: java.io.IOException -> L77
                int r6 = r0.size()     // Catch: java.io.IOException -> L77
                if (r6 <= r4) goto L2e
                java.lang.Object r6 = r0.get(r4)     // Catch: java.io.IOException -> L77
                java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.io.IOException -> L77
                int r6 = r6.intValue()     // Catch: java.io.IOException -> L77
                if (r6 == r5) goto L2b
                goto L30
            L2b:
                int r4 = r4 + 1
                goto L13
            L2e:
                if (r1 == r5) goto L32
            L30:
                r2 = 0
                goto L33
            L32:
                r2 = 1
            L33:
                if (r2 != 0) goto L39
                r0.clear()     // Catch: java.io.IOException -> L77
                goto L5
            L39:
                boolean r2 = r7.c(r0, r1)     // Catch: java.io.IOException -> L77
                if (r2 == 0) goto L6f
                int r1 = r0.size()     // Catch: java.io.IOException -> L77
                byte[] r2 = new byte[r1]     // Catch: java.io.IOException -> L77
            L45:
                int r4 = r0.size()     // Catch: java.io.IOException -> L77
                if (r3 >= r4) goto L5a
                java.lang.Object r4 = r0.get(r3)     // Catch: java.io.IOException -> L77
                java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.io.IOException -> L77
                byte r4 = r4.byteValue()     // Catch: java.io.IOException -> L77
                r2[r3] = r4     // Catch: java.io.IOException -> L77
                int r3 = r3 + 1
                goto L45
            L5a:
                com.papa.controller.component.bluetooth.spp.b r0 = com.papa.controller.component.bluetooth.spp.b.this     // Catch: java.io.IOException -> L77
                android.os.Handler r0 = com.papa.controller.component.bluetooth.spp.b.h(r0)     // Catch: java.io.IOException -> L77
                r3 = 2
                r4 = -1
                android.os.Message r0 = r0.obtainMessage(r3, r1, r4, r2)     // Catch: java.io.IOException -> L77
                r0.sendToTarget()     // Catch: java.io.IOException -> L77
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.io.IOException -> L77
                r0.<init>()     // Catch: java.io.IOException -> L77
                goto L5
            L6f:
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.io.IOException -> L77
                r0.add(r1)     // Catch: java.io.IOException -> L77
                goto L5
            L77:
                com.papa.controller.component.bluetooth.spp.b r0 = com.papa.controller.component.bluetooth.spp.b.this
                com.papa.controller.component.bluetooth.spp.b.i(r0)
                com.papa.controller.component.bluetooth.spp.b r0 = com.papa.controller.component.bluetooth.spp.b.this
                boolean r1 = com.papa.controller.component.bluetooth.spp.b.e(r0)
                r0.p(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.papa.controller.component.bluetooth.spp.b.c.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BluetoothService.java */
    /* loaded from: classes5.dex */
    public class d extends Thread {

        /* renamed from: b  reason: collision with root package name */
        protected final BluetoothSocket f57950b;

        /* renamed from: c  reason: collision with root package name */
        protected final InputStream f57951c;

        /* renamed from: d  reason: collision with root package name */
        protected final OutputStream f57952d;

        public d(BluetoothSocket bluetoothSocket, String str) {
            InputStream inputStream;
            this.f57950b = bluetoothSocket;
            OutputStream outputStream = null;
            try {
                inputStream = bluetoothSocket.getInputStream();
                try {
                    outputStream = bluetoothSocket.getOutputStream();
                } catch (IOException unused) {
                }
            } catch (IOException unused2) {
                inputStream = null;
            }
            this.f57951c = inputStream;
            this.f57952d = outputStream;
        }

        public void a() {
            try {
                this.f57950b.close();
            } catch (IOException unused) {
            }
        }

        public void b(byte[] bArr) {
            try {
                this.f57952d.write(bArr);
                b.this.f57935b.obtainMessage(3, -1, -1, bArr).sendToTarget();
            } catch (IOException unused) {
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ArrayList arrayList = new ArrayList();
            while (true) {
                try {
                    int read = this.f57951c.read();
                    if (read != 10) {
                        if (read == 13) {
                            int size = arrayList.size();
                            byte[] bArr = new byte[size];
                            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                                bArr[i4] = ((Integer) arrayList.get(i4)).byteValue();
                            }
                            b.this.f57935b.obtainMessage(2, size, -1, bArr).sendToTarget();
                            arrayList = new ArrayList();
                        } else {
                            arrayList.add(Integer.valueOf(read));
                        }
                    }
                } catch (IOException unused) {
                    b.this.m();
                    b bVar = b.this;
                    bVar.p(bVar.f57940g);
                    return;
                }
            }
        }
    }

    public b(Context context, Handler handler) {
        this.f57935b = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        p(this.f57940g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        p(this.f57940g);
    }

    private synchronized void o(int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append("setState() ");
        sb.append(this.f57939f);
        sb.append(" -> ");
        sb.append(i4);
        this.f57939f = i4;
        this.f57935b.obtainMessage(1, i4, -1).sendToTarget();
    }

    public synchronized void j(BluetoothDevice bluetoothDevice) {
        C0585b c0585b;
        if (this.f57939f == 2 && (c0585b = this.f57937d) != null) {
            c0585b.a();
            this.f57937d = null;
        }
        d dVar = this.f57938e;
        if (dVar != null) {
            dVar.a();
            this.f57938e = null;
        }
        C0585b c0585b2 = new C0585b(bluetoothDevice);
        this.f57937d = c0585b2;
        c0585b2.start();
        o(2);
    }

    public synchronized void k(BluetoothSocket bluetoothSocket, BluetoothDevice bluetoothDevice, String str) {
        C0585b c0585b = this.f57937d;
        if (c0585b != null) {
            c0585b.a();
            this.f57937d = null;
        }
        d dVar = this.f57938e;
        if (dVar != null) {
            dVar.a();
            this.f57938e = null;
        }
        a aVar = this.f57936c;
        if (aVar != null) {
            aVar.a();
            this.f57936c = null;
        }
        c cVar = new c(bluetoothSocket, str);
        this.f57938e = cVar;
        cVar.start();
        Message obtainMessage = this.f57935b.obtainMessage(4);
        Bundle bundle = new Bundle();
        bundle.putString("device_name", bluetoothDevice.getName());
        bundle.putString(com.papa.controller.component.bluetooth.spp.c.f57967n, bluetoothDevice.getAddress());
        obtainMessage.setData(bundle);
        this.f57935b.sendMessage(obtainMessage);
        o(3);
    }

    public synchronized int n() {
        return this.f57939f;
    }

    public synchronized void p(boolean z4) {
        C0585b c0585b = this.f57937d;
        if (c0585b != null) {
            c0585b.a();
            this.f57937d = null;
        }
        d dVar = this.f57938e;
        if (dVar != null) {
            dVar.a();
            this.f57938e = null;
        }
        o(1);
        if (this.f57936c == null) {
            a aVar = new a(z4);
            this.f57936c = aVar;
            aVar.start();
            this.f57940g = z4;
        }
    }

    public synchronized void q() {
        C0585b c0585b = this.f57937d;
        if (c0585b != null) {
            c0585b.a();
            this.f57937d = null;
        }
        d dVar = this.f57938e;
        if (dVar != null) {
            dVar.a();
            this.f57938e = null;
        }
        a aVar = this.f57936c;
        if (aVar != null) {
            aVar.a();
            this.f57936c.b();
            this.f57936c = null;
        }
        o(0);
    }

    public void r(byte[] bArr) {
        synchronized (this) {
            if (this.f57939f != 3) {
                return;
            }
            this.f57938e.b(bArr);
        }
    }
}
