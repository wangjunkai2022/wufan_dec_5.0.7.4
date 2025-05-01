package com.papa.controller.core;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import com.join.mgps.Util.h0;
import com.papa.controller.component.bluetooth.a;
import com.papa.controller.component.bluetooth.spp.a;
import com.papa.controller.core.hardware.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PaBluetoothSppMonitor.java */
/* loaded from: classes5.dex */
public class f {

    /* renamed from: j  reason: collision with root package name */
    private static f f58099j;

    /* renamed from: b  reason: collision with root package name */
    private Context f58101b;

    /* renamed from: c  reason: collision with root package name */
    private com.papa.controller.core.c f58102c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f58103d;

    /* renamed from: g  reason: collision with root package name */
    com.papa.controller.component.bluetooth.a f58106g;

    /* renamed from: h  reason: collision with root package name */
    a.d f58107h;

    /* renamed from: i  reason: collision with root package name */
    Map<String, e> f58108i;

    /* renamed from: a  reason: collision with root package name */
    private final String f58100a = getClass().getSimpleName();

    /* renamed from: e  reason: collision with root package name */
    private boolean f58104e = true;

    /* renamed from: f  reason: collision with root package name */
    private int f58105f = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaBluetoothSppMonitor.java */
    /* loaded from: classes5.dex */
    public class a implements a.d {
        a() {
        }

        @Override // com.papa.controller.component.bluetooth.a.d
        public void a(BluetoothDevice bluetoothDevice) {
            if (bluetoothDevice != null && f.this.f58104e) {
                f.this.g(bluetoothDevice.getAddress(), bluetoothDevice.getName());
            }
        }

        @Override // com.papa.controller.component.bluetooth.a.d
        public void b(BluetoothDevice bluetoothDevice) {
            if (bluetoothDevice == null) {
                return;
            }
            f.this.h(bluetoothDevice.getAddress());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaBluetoothSppMonitor.java */
    /* loaded from: classes5.dex */
    public class b implements a.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f58110a;

        b(String str) {
            this.f58110a = str;
        }

        @Override // com.papa.controller.component.bluetooth.spp.a.g
        public void a(byte[] bArr, String str) {
            try {
                f.this.m(this.f58110a, bArr);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaBluetoothSppMonitor.java */
    /* loaded from: classes5.dex */
    public class c implements a.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f58112a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58113b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.papa.controller.component.bluetooth.spp.a f58114c;

        c(String str, String str2, com.papa.controller.component.bluetooth.spp.a aVar) {
            this.f58112a = str;
            this.f58113b = str2;
            this.f58114c = aVar;
        }

        @Override // com.papa.controller.component.bluetooth.spp.a.f
        public void a(int i4) {
            PadStateEvent padStateEvent;
            if (i4 == 2) {
                padStateEvent = new PadStateEvent(System.currentTimeMillis(), -1, this.f58112a, 2, 2, this.f58113b);
            } else if (i4 == 3) {
                padStateEvent = new PadStateEvent(System.currentTimeMillis(), -1, this.f58112a, 1, 1, this.f58113b);
                f.this.z(this.f58114c);
            } else {
                padStateEvent = null;
            }
            if (f.this.f58102c == null || padStateEvent == null) {
                return;
            }
            f.this.f58102c.I(padStateEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaBluetoothSppMonitor.java */
    /* loaded from: classes5.dex */
    public class d implements a.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f58116a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58117b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.papa.controller.component.bluetooth.spp.a f58118c;

        d(String str, String str2, com.papa.controller.component.bluetooth.spp.a aVar) {
            this.f58116a = str;
            this.f58117b = str2;
            this.f58118c = aVar;
        }

        @Override // com.papa.controller.component.bluetooth.spp.a.e
        public void a() {
            if (this.f58118c.J() == 3 || this.f58118c.J() == 1) {
                return;
            }
            PadStateEvent padStateEvent = new PadStateEvent(System.currentTimeMillis(), -1, this.f58116a, 8, 2, this.f58117b);
            if (f.this.f58102c != null) {
                f.this.f58102c.I(padStateEvent);
            }
        }

        @Override // com.papa.controller.component.bluetooth.spp.a.e
        public void b() {
            PadStateEvent padStateEvent = new PadStateEvent(System.currentTimeMillis(), -1, this.f58116a, 0, 0, this.f58117b);
            if (f.this.f58102c != null) {
                f.this.f58102c.I(padStateEvent);
            }
        }

        @Override // com.papa.controller.component.bluetooth.spp.a.e
        public void c(String str, String str2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaBluetoothSppMonitor.java */
    /* loaded from: classes5.dex */
    public class e {

        /* renamed from: a  reason: collision with root package name */
        public com.papa.controller.component.bluetooth.spp.a f58120a;

        /* renamed from: b  reason: collision with root package name */
        public PadInfo f58121b;

        public e() {
        }
    }

    public f(Context context) {
        this.f58101b = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(String str, String str2) {
        if (str == null || str.trim() == "") {
            return;
        }
        if (this.f58108i == null) {
            this.f58108i = new HashMap();
        }
        e eVar = new e();
        com.papa.controller.component.bluetooth.spp.a aVar = new com.papa.controller.component.bluetooth.spp.a(this.f58101b);
        aVar.W();
        aVar.startService(false);
        eVar.f58120a = aVar;
        PadInfo padInfo = new PadInfo();
        eVar.f58121b = padInfo;
        int i4 = this.f58105f;
        this.f58105f = i4 + 1;
        padInfo.C(i4);
        this.f58108i.put(str, eVar);
        if (aVar.L()) {
            aVar.V(new b(str));
            aVar.T(new c(str2, str, aVar));
            aVar.S(new d(str2, str, aVar));
            aVar.B(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(String str) {
        Map<String, e> map;
        if (str == null || str.trim() == "" || (map = this.f58108i) == null || map.size() == 0 || !this.f58108i.containsKey(str)) {
            return;
        }
        com.papa.controller.component.bluetooth.spp.a aVar = this.f58108i.get(str).f58120a;
        if (aVar.J() == 3) {
            aVar.C();
        }
    }

    private void i() {
        Map<String, e> map = this.f58108i;
        if (map == null || map.size() == 0) {
            return;
        }
        for (e eVar : this.f58108i.values()) {
            com.papa.controller.component.bluetooth.spp.a aVar = eVar.f58120a;
            if (aVar.J() == 3) {
                aVar.C();
            }
        }
    }

    private void j(String str, com.papa.controller.core.hardware.d dVar) {
        try {
            if (this.f58102c == null) {
                return;
            }
            this.f58108i.get(str).f58121b.a(this.f58102c, dVar);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static f l(Context context) {
        f fVar = f58099j;
        if (fVar == null) {
            f58099j = new f(context);
            return null;
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(String str, byte[] bArr) {
        int type = new com.papa.controller.core.hardware.a(bArr).getType();
        if (type == 1) {
            j(str, new com.papa.controller.core.hardware.d(bArr));
        } else if (type == 5) {
            r(str, new com.papa.controller.core.hardware.f(bArr));
        } else if (type == 20) {
            p(str, new com.papa.controller.core.hardware.b(bArr));
        } else if (type != 246) {
        } else {
            q(str, new com.papa.controller.core.hardware.c(bArr));
        }
    }

    private void n() {
        Context context = this.f58101b;
        if (context == null) {
            return;
        }
        com.papa.controller.component.bluetooth.a aVar = new com.papa.controller.component.bluetooth.a(context);
        this.f58106g = aVar;
        try {
            if (aVar.p()) {
                a aVar2 = new a();
                this.f58107h = aVar2;
                this.f58106g.u(aVar2);
                this.f58106g.x();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void o() {
        this.f58108i = new HashMap();
    }

    private void p(String str, com.papa.controller.core.hardware.b bVar) {
        try {
            this.f58108i.get(str).f58121b.G(r2.a.a(bVar.k()));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void q(String str, com.papa.controller.core.hardware.c cVar) {
        try {
            PadInfo padInfo = this.f58108i.get(str).f58121b;
            Integer num = new Integer(cVar.f());
            String str2 = ((num.intValue() >> 4) & 255) + h0.f27805a + (num.intValue() & 15);
            String n4 = cVar.n();
            byte[] o4 = cVar.o();
            byte[] m4 = cVar.m();
            boolean z4 = cVar.k() == 1;
            boolean z5 = cVar.l() == 1;
            padInfo.O(n4);
            padInfo.R(n4);
            padInfo.V(r2.a.a(o4));
            padInfo.Q(r2.a.a(m4));
            padInfo.X(str2);
            padInfo.L(str);
            padInfo.H(z4);
            padInfo.I(z5);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void r(String str, com.papa.controller.core.hardware.f fVar) {
        try {
            PadInfo padInfo = this.f58108i.get(str).f58121b;
            int k4 = fVar.k();
            boolean z4 = fVar.l() == 1;
            boolean z5 = fVar.m() == 1;
            padInfo.B(k4);
            padInfo.S(z4);
            padInfo.Y(z5);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void w() throws Exception {
        Map<String, e> map = this.f58108i;
        if (map == null || map.size() == 0) {
            return;
        }
        for (e eVar : this.f58108i.values()) {
            com.papa.controller.component.bluetooth.spp.a aVar = eVar.f58120a;
            if (aVar.M()) {
                if (!aVar.O()) {
                    aVar.W();
                    aVar.startService(false);
                }
            } else {
                throw new Exception("Bluetooth is not enable!");
            }
        }
    }

    private void y() {
        Map<String, e> map = this.f58108i;
        if (map == null || map.size() == 0) {
            return;
        }
        for (e eVar : this.f58108i.values()) {
            eVar.f58120a.stopService();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(com.papa.controller.component.bluetooth.spp.a aVar) {
        aVar.Q(new com.papa.controller.core.hardware.e().k(1), false);
        aVar.Q(new com.papa.controller.core.hardware.c().a(), false);
        aVar.Q(new com.papa.controller.core.hardware.f().a(), false);
        aVar.Q(new com.papa.controller.core.hardware.b().a(), false);
    }

    public List<com.papa.controller.core.b> k() {
        ArrayList arrayList = new ArrayList();
        Map<String, e> map = this.f58108i;
        if (map != null && map.size() != 0) {
            for (e eVar : this.f58108i.values()) {
                PadInfo padInfo = eVar.f58121b;
                if (padInfo != null) {
                    String valueOf = String.valueOf(padInfo.c());
                    String p4 = padInfo.p();
                    String w4 = padInfo.w();
                    String k4 = padInfo.k();
                    padInfo.b();
                    arrayList.add(new com.papa.controller.core.b(valueOf, p4, w4, k4, "", "", padInfo.d()));
                }
            }
        }
        return arrayList;
    }

    public void s() {
        this.f58102c = null;
        this.f58103d = null;
        this.f58105f = -1;
        x();
    }

    public void t(com.papa.controller.core.c cVar, Handler handler) {
        this.f58102c = cVar;
        this.f58103d = handler;
        v();
    }

    public void u(int i4, int i5) {
        for (e eVar : this.f58108i.values()) {
            eVar.f58120a.Q(new g().k(i4, i5), false);
        }
    }

    public void v() {
        try {
            o();
            n();
            if (this.f58104e) {
                w();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void x() {
        y();
        com.papa.controller.component.bluetooth.a aVar = this.f58106g;
        if (aVar != null) {
            aVar.y();
        }
    }
}
