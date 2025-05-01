package com.papa.controller.component.bluetooth.spp;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Set;
/* compiled from: BluetoothSPP.java */
@SuppressLint({"NewApi"})
/* loaded from: classes5.dex */
public class a {

    /* renamed from: e  reason: collision with root package name */
    private Context f57910e;

    /* renamed from: f  reason: collision with root package name */
    private BluetoothAdapter f57911f;

    /* renamed from: q  reason: collision with root package name */
    private e f57922q;

    /* renamed from: a  reason: collision with root package name */
    private f f57906a = null;

    /* renamed from: b  reason: collision with root package name */
    private g f57907b = null;

    /* renamed from: c  reason: collision with root package name */
    private e f57908c = null;

    /* renamed from: d  reason: collision with root package name */
    private d f57909d = null;

    /* renamed from: g  reason: collision with root package name */
    private com.papa.controller.component.bluetooth.spp.b f57912g = null;

    /* renamed from: h  reason: collision with root package name */
    private String f57913h = null;

    /* renamed from: i  reason: collision with root package name */
    private String f57914i = null;

    /* renamed from: j  reason: collision with root package name */
    private boolean f57915j = false;

    /* renamed from: k  reason: collision with root package name */
    private boolean f57916k = false;

    /* renamed from: l  reason: collision with root package name */
    private boolean f57917l = false;

    /* renamed from: m  reason: collision with root package name */
    private boolean f57918m = false;

    /* renamed from: n  reason: collision with root package name */
    private boolean f57919n = false;

    /* renamed from: o  reason: collision with root package name */
    private String f57920o = "";

    /* renamed from: p  reason: collision with root package name */
    private boolean f57921p = true;

    /* renamed from: r  reason: collision with root package name */
    private int f57923r = 0;
    @SuppressLint({"HandlerLeak"})

    /* renamed from: s  reason: collision with root package name */
    private final Handler f57924s = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BluetoothSPP.java */
    /* renamed from: com.papa.controller.component.bluetooth.spp.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class RunnableC0584a implements Runnable {
        RunnableC0584a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f57912g != null) {
                a.this.f57919n = false;
                a.this.f57912g.q();
            }
        }
    }

    /* compiled from: BluetoothSPP.java */
    /* loaded from: classes5.dex */
    class b extends Handler {
        b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i4 = message.what;
            if (i4 != 1) {
                if (i4 == 2) {
                    byte[] bArr = (byte[]) message.obj;
                    String str = new String(bArr);
                    if (bArr == null || bArr.length <= 0 || a.this.f57907b == null) {
                        return;
                    }
                    a.this.f57907b.a(bArr, str);
                    return;
                } else if (i4 != 4) {
                    if (i4 != 5) {
                        return;
                    }
                    Toast.makeText(a.this.f57910e, message.getData().getString(com.papa.controller.component.bluetooth.spp.c.f57968o), 0).show();
                    return;
                } else {
                    a.this.f57913h = message.getData().getString("device_name");
                    a.this.f57914i = message.getData().getString(com.papa.controller.component.bluetooth.spp.c.f57967n);
                    if (a.this.f57908c != null) {
                        a.this.f57908c.c(a.this.f57913h, a.this.f57914i);
                    }
                    a.this.f57917l = true;
                    return;
                }
            }
            if (a.this.f57906a != null) {
                a.this.f57906a.a(message.arg1);
            }
            if (a.this.f57917l && message.arg1 != 3) {
                if (a.this.f57908c != null) {
                    a.this.f57908c.b();
                }
                if (a.this.f57916k) {
                    a.this.f57916k = false;
                    a aVar = a.this;
                    aVar.y(aVar.f57920o);
                }
                a.this.f57917l = false;
                a.this.f57913h = null;
                a.this.f57914i = null;
            }
            if (a.this.f57918m || message.arg1 != 2) {
                if (a.this.f57918m) {
                    if (message.arg1 != 3 && a.this.f57908c != null) {
                        a.this.f57908c.a();
                    }
                    a.this.f57918m = false;
                    return;
                }
                return;
            }
            a.this.f57918m = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BluetoothSPP.java */
    /* loaded from: classes5.dex */
    public class c implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f57927a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f57928b;

        c(ArrayList arrayList, ArrayList arrayList2) {
            this.f57927a = arrayList;
            this.f57928b = arrayList2;
        }

        @Override // com.papa.controller.component.bluetooth.spp.a.e
        public void a() {
            if (a.this.f57919n) {
                if (!a.this.f57916k) {
                    a.this.f57922q = null;
                    a.this.f57915j = false;
                    return;
                }
                a.k(a.this);
                if (a.this.f57923r >= this.f57927a.size()) {
                    a.this.f57923r = 0;
                }
                a aVar = a.this;
                aVar.B((String) this.f57927a.get(aVar.f57923r));
                if (a.this.f57909d != null) {
                    a.this.f57909d.b((String) this.f57928b.get(a.this.f57923r), (String) this.f57927a.get(a.this.f57923r));
                }
            }
        }

        @Override // com.papa.controller.component.bluetooth.spp.a.e
        public void b() {
        }

        @Override // com.papa.controller.component.bluetooth.spp.a.e
        public void c(String str, String str2) {
            a.this.f57922q = null;
            a.this.f57915j = false;
        }
    }

    /* compiled from: BluetoothSPP.java */
    /* loaded from: classes5.dex */
    public interface d {
        void a();

        void b(String str, String str2);
    }

    /* compiled from: BluetoothSPP.java */
    /* loaded from: classes5.dex */
    public interface e {
        void a();

        void b();

        void c(String str, String str2);
    }

    /* compiled from: BluetoothSPP.java */
    /* loaded from: classes5.dex */
    public interface f {
        void a(int i4);
    }

    /* compiled from: BluetoothSPP.java */
    /* loaded from: classes5.dex */
    public interface g {
        void a(byte[] bArr, String str);
    }

    public a(Context context) {
        this.f57911f = null;
        this.f57910e = context;
        this.f57911f = BluetoothAdapter.getDefaultAdapter();
    }

    static /* synthetic */ int k(a aVar) {
        int i4 = aVar.f57923r;
        aVar.f57923r = i4 + 1;
        return i4;
    }

    public void A(Intent intent) {
        this.f57912g.j(this.f57911f.getRemoteDevice(intent.getExtras().getString(com.papa.controller.component.bluetooth.spp.c.f57971r)));
    }

    public void B(String str) {
        this.f57912g.j(this.f57911f.getRemoteDevice(str));
    }

    public void C() {
        com.papa.controller.component.bluetooth.spp.b bVar = this.f57912g;
        if (bVar != null) {
            this.f57919n = false;
            bVar.q();
            if (this.f57912g.n() == 0) {
                this.f57919n = true;
                this.f57912g.p(this.f57921p);
            }
        }
    }

    public void D() {
        this.f57911f.enable();
    }

    public BluetoothAdapter E() {
        return this.f57911f;
    }

    public String F() {
        return this.f57914i;
    }

    public String G() {
        return this.f57913h;
    }

    public String[] H() {
        Set<BluetoothDevice> bondedDevices = this.f57911f.getBondedDevices();
        String[] strArr = new String[bondedDevices.size()];
        int i4 = 0;
        for (BluetoothDevice bluetoothDevice : bondedDevices) {
            strArr[i4] = bluetoothDevice.getAddress();
            i4++;
        }
        return strArr;
    }

    public String[] I() {
        Set<BluetoothDevice> bondedDevices = this.f57911f.getBondedDevices();
        String[] strArr = new String[bondedDevices.size()];
        int i4 = 0;
        for (BluetoothDevice bluetoothDevice : bondedDevices) {
            strArr[i4] = bluetoothDevice.getName();
            i4++;
        }
        return strArr;
    }

    public int J() {
        com.papa.controller.component.bluetooth.spp.b bVar = this.f57912g;
        if (bVar != null) {
            return bVar.n();
        }
        return -1;
    }

    public boolean K() {
        return this.f57915j;
    }

    public boolean L() {
        try {
            BluetoothAdapter bluetoothAdapter = this.f57911f;
            if (bluetoothAdapter != null) {
                return !bluetoothAdapter.getAddress().equals(null);
            }
            return false;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    public boolean M() {
        return this.f57911f.isEnabled();
    }

    public boolean N() {
        return this.f57911f.isDiscovering();
    }

    public boolean O() {
        return this.f57912g != null;
    }

    public void P(String str, boolean z4) {
        if (this.f57912g.n() == 3) {
            if (z4) {
                str = str + "\r\n";
            }
            this.f57912g.r(str.getBytes());
        }
    }

    public void Q(byte[] bArr, boolean z4) {
        if (this.f57912g.n() == 3) {
            if (z4) {
                int length = bArr.length + 2;
                byte[] bArr2 = new byte[length];
                for (int i4 = 0; i4 < bArr.length; i4++) {
                    bArr2[i4] = bArr[i4];
                }
                bArr2[length - 2] = 10;
                bArr2[length - 1] = 13;
                this.f57912g.r(bArr2);
                return;
            }
            this.f57912g.r(bArr);
        }
    }

    public void R(d dVar) {
        this.f57909d = dVar;
    }

    public void S(e eVar) {
        this.f57908c = eVar;
    }

    public void T(f fVar) {
        this.f57906a = fVar;
    }

    public void U(boolean z4) {
        stopService();
        startService(z4);
        this.f57921p = z4;
    }

    public void V(g gVar) {
        this.f57907b = gVar;
    }

    public void W() {
        this.f57912g = new com.papa.controller.component.bluetooth.spp.b(this.f57910e, this.f57924s);
    }

    public boolean X() {
        return this.f57911f.startDiscovery();
    }

    public void Y() {
        this.f57916k = false;
    }

    public void startService(boolean z4) {
        com.papa.controller.component.bluetooth.spp.b bVar = this.f57912g;
        if (bVar == null || bVar.n() != 0) {
            return;
        }
        this.f57919n = true;
        this.f57912g.p(z4);
        this.f57921p = z4;
    }

    public void stopService() {
        com.papa.controller.component.bluetooth.spp.b bVar = this.f57912g;
        if (bVar != null) {
            this.f57919n = false;
            bVar.q();
        }
        new Handler().postDelayed(new RunnableC0584a(), 500L);
    }

    public void y(String str) {
        if (this.f57916k) {
            return;
        }
        this.f57920o = str;
        this.f57916k = true;
        this.f57915j = true;
        d dVar = this.f57909d;
        if (dVar != null) {
            dVar.a();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String[] I = I();
        String[] H = H();
        for (int i4 = 0; i4 < I.length; i4++) {
            if (I[i4].contains(str)) {
                arrayList.add(H[i4]);
                arrayList2.add(I[i4]);
            }
        }
        c cVar = new c(arrayList, arrayList2);
        this.f57922q = cVar;
        S(cVar);
        this.f57923r = 0;
        d dVar2 = this.f57909d;
        if (dVar2 != null) {
            dVar2.b(I[0], H[0]);
        }
        if (arrayList.size() > 0) {
            B((String) arrayList.get(this.f57923r));
        } else {
            Toast.makeText(this.f57910e, "Device name mismatch", 0).show();
        }
    }

    public boolean z() {
        return this.f57911f.cancelDiscovery();
    }
}
