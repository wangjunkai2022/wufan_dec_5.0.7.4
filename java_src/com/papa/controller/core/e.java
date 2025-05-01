package com.papa.controller.core;

import android.content.Context;
import android.os.Handler;
import com.join.mgps.Util.h0;
import com.papa.controller.component.bluetooth.spp.a;
import com.papa.controller.core.hardware.g;
/* compiled from: PaBluetoothSpp.java */
/* loaded from: classes5.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private Context f58084a;

    /* renamed from: b  reason: collision with root package name */
    private String f58085b;

    /* renamed from: c  reason: collision with root package name */
    private String f58086c;

    /* renamed from: d  reason: collision with root package name */
    private com.papa.controller.component.bluetooth.spp.a f58087d;

    /* renamed from: e  reason: collision with root package name */
    private PadInfo f58088e;

    /* renamed from: f  reason: collision with root package name */
    private com.papa.controller.core.c f58089f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f58090g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f58091h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f58092i = false;

    /* renamed from: j  reason: collision with root package name */
    private Handler f58093j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaBluetoothSpp.java */
    /* loaded from: classes5.dex */
    public class a implements a.g {
        a() {
        }

        @Override // com.papa.controller.component.bluetooth.spp.a.g
        public void a(byte[] bArr, String str) {
            try {
                e eVar = e.this;
                eVar.w(eVar.f58085b, bArr);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaBluetoothSpp.java */
    /* loaded from: classes5.dex */
    public class b implements a.f {
        b() {
        }

        @Override // com.papa.controller.component.bluetooth.spp.a.f
        public void a(int i4) {
            PadStateEvent padStateEvent;
            if (i4 == 2) {
                padStateEvent = new PadStateEvent(System.currentTimeMillis(), -1, e.this.f58086c, 2, 2, e.this.f58085b);
            } else if (i4 == 3) {
                padStateEvent = new PadStateEvent(System.currentTimeMillis(), -1, e.this.f58086c, 1, 1, e.this.f58085b);
                e.this.t();
            } else {
                padStateEvent = null;
            }
            if (e.this.f58089f == null || padStateEvent == null) {
                return;
            }
            e.this.f58089f.I(padStateEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaBluetoothSpp.java */
    /* loaded from: classes5.dex */
    public class c implements a.e {
        c() {
        }

        @Override // com.papa.controller.component.bluetooth.spp.a.e
        public void a() {
            if (e.this.f58087d.J() == 3 || e.this.f58087d.J() == 1) {
                return;
            }
            PadStateEvent padStateEvent = new PadStateEvent(System.currentTimeMillis(), -1, e.this.f58086c, 8, 2, e.this.f58085b);
            if (e.this.f58089f != null) {
                e.this.f58089f.I(padStateEvent);
            }
        }

        @Override // com.papa.controller.component.bluetooth.spp.a.e
        public void b() {
            PadStateEvent padStateEvent = new PadStateEvent(System.currentTimeMillis(), -1, e.this.f58086c, 0, 0, e.this.f58085b);
            if (e.this.f58089f != null) {
                e.this.f58089f.I(padStateEvent);
            }
        }

        @Override // com.papa.controller.component.bluetooth.spp.a.e
        public void c(String str, String str2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaBluetoothSpp.java */
    /* loaded from: classes5.dex */
    public class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f58097b;

        d(long j4) {
            this.f58097b = j4;
        }

        @Override // java.lang.Runnable
        public void run() {
            do {
                try {
                    if (System.currentTimeMillis() - this.f58097b >= 3000) {
                        e.this.f58092i = true;
                        if (e.this.f58093j != null) {
                            e.this.f58093j.obtainMessage(10000, 0, 0, e.this.r()).sendToTarget();
                        }
                        e.this.n();
                        return;
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    return;
                }
            } while (!e.this.f58091h);
            e.this.z(1);
            e.this.f58092i = true;
            if (e.this.f58093j != null) {
                e.this.f58093j.obtainMessage(10000, 1, 0, e.this.r()).sendToTarget();
            }
            if (e.this.f58090g) {
                e.this.n();
            }
        }
    }

    public e(Context context, String str, String str2) {
        this.f58084a = context;
        this.f58085b = str;
        this.f58086c = str2;
        if (context != null) {
            this.f58087d = new com.papa.controller.component.bluetooth.spp.a(context);
            PadInfo padInfo = new PadInfo();
            this.f58088e = padInfo;
            padInfo.O(str2);
            this.f58088e.L(str);
        }
        D();
    }

    private void A(String str, com.papa.controller.core.hardware.b bVar) {
        try {
            this.f58088e.G(r2.a.a(bVar.k()));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void B(String str, com.papa.controller.core.hardware.c cVar) {
        try {
            Integer num = new Integer(cVar.f());
            String str2 = ((num.intValue() >> 4) & 255) + h0.f27805a + (num.intValue() & 15);
            String n4 = cVar.n();
            byte[] o4 = cVar.o();
            byte[] m4 = cVar.m();
            boolean z4 = cVar.k() == 1;
            boolean z5 = cVar.l() == 1;
            this.f58088e.O(n4);
            this.f58088e.R(n4);
            this.f58088e.V(r2.a.a(o4));
            this.f58088e.Q(r2.a.a(m4));
            this.f58088e.X(str2);
            this.f58088e.L(str);
            this.f58088e.H(z4);
            this.f58088e.I(z5);
            this.f58091h = true;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void C(String str, com.papa.controller.core.hardware.f fVar) {
        try {
            int k4 = fVar.k();
            boolean z4 = fVar.l() == 1;
            boolean z5 = fVar.m() == 1;
            this.f58088e.B(k4);
            this.f58088e.S(z4);
            this.f58088e.Y(z5);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void D() {
        com.papa.controller.component.bluetooth.spp.a aVar = this.f58087d;
        if (aVar == null) {
            return;
        }
        aVar.V(new a());
        this.f58087d.T(new b());
        this.f58087d.S(new c());
    }

    private void J() {
        new Thread(new d(System.currentTimeMillis())).start();
    }

    private void m(String str) {
        com.papa.controller.component.bluetooth.spp.a aVar;
        if (str == null || str.trim() == "" || (aVar = this.f58087d) == null) {
            return;
        }
        this.f58085b = str;
        if (!aVar.L() || this.f58087d.J() == 2 || this.f58087d.J() == 3) {
            return;
        }
        try {
            I();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        this.f58087d.B(str);
        J();
    }

    private void o(String str) {
        if (this.f58087d == null || str == null || str.trim() == "") {
            return;
        }
        if (this.f58087d.J() == 3 || this.f58087d.J() == 2) {
            this.f58087d.C();
        }
    }

    private void p(String str, com.papa.controller.core.hardware.d dVar) {
        try {
            com.papa.controller.core.c cVar = this.f58089f;
            if (cVar == null) {
                return;
            }
            this.f58088e.a(cVar, dVar);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.papa.controller.core.b r() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8 = this.f58086c;
        String str9 = this.f58085b;
        PadInfo padInfo = this.f58088e;
        if (padInfo != null) {
            String h4 = padInfo.h();
            String p4 = this.f58088e.p();
            String w4 = this.f58088e.w();
            String k4 = this.f58088e.k();
            String u4 = this.f58088e.u();
            str = p4;
            str4 = w4;
            str2 = k4;
            str3 = h4;
            str5 = u4;
            str6 = this.f58088e.r();
            str7 = this.f58088e.d();
        } else {
            str = str8;
            str2 = str9;
            str3 = "";
            str4 = str3;
            str5 = str4;
            str6 = str5;
            str7 = str6;
        }
        return new com.papa.controller.core.b(str3, str, str4, str2, str5, str6, str7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        com.papa.controller.component.bluetooth.spp.a aVar = this.f58087d;
        if (aVar == null) {
            return;
        }
        aVar.Q(new com.papa.controller.core.hardware.c().a(), false);
        this.f58087d.Q(new com.papa.controller.core.hardware.f().a(), false);
        this.f58087d.Q(new com.papa.controller.core.hardware.b().a(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(String str, byte[] bArr) {
        int type = new com.papa.controller.core.hardware.a(bArr).getType();
        if (type == 1) {
            p(str, new com.papa.controller.core.hardware.d(bArr));
        } else if (type == 5) {
            C(str, new com.papa.controller.core.hardware.f(bArr));
        } else if (type == 20) {
            A(str, new com.papa.controller.core.hardware.b(bArr));
        } else if (type != 246) {
        } else {
            B(str, new com.papa.controller.core.hardware.c(bArr));
        }
    }

    public void E(com.papa.controller.core.c cVar) {
        this.f58089f = cVar;
    }

    public void F(Handler handler) {
        this.f58093j = handler;
    }

    public void G(boolean z4) {
        this.f58090g = z4;
    }

    public void H(int i4, int i5) {
        com.papa.controller.component.bluetooth.spp.a aVar = this.f58087d;
        if (aVar == null || !aVar.O()) {
            return;
        }
        this.f58087d.Q(new g().k(i4, i5), false);
    }

    public void I() throws Exception {
        com.papa.controller.component.bluetooth.spp.a aVar = this.f58087d;
        if (aVar == null) {
            return;
        }
        if (aVar.M()) {
            if (this.f58087d.O()) {
                return;
            }
            this.f58087d.W();
            this.f58087d.startService(false);
            return;
        }
        throw new Exception("Bluetooth is not enable!");
    }

    public void K() {
        com.papa.controller.component.bluetooth.spp.a aVar = this.f58087d;
        if (aVar == null) {
            return;
        }
        try {
            aVar.stopService();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void l() {
        String str = this.f58085b;
        if (str == null || str.equals("")) {
            return;
        }
        m(this.f58085b);
    }

    public void n() {
        String str = this.f58085b;
        if (str == null || str.equals("")) {
            return;
        }
        o(this.f58085b);
    }

    public String q() {
        return this.f58085b;
    }

    public com.papa.controller.core.c s() {
        return this.f58089f;
    }

    public com.papa.controller.component.bluetooth.spp.a u() {
        return this.f58087d;
    }

    public PadInfo v() {
        return this.f58088e;
    }

    public boolean x() {
        return this.f58091h;
    }

    public boolean y() {
        return this.f58092i;
    }

    public void z(int i4) {
        com.papa.controller.component.bluetooth.spp.a aVar = this.f58087d;
        if (aVar != null) {
            aVar.Q(new com.papa.controller.core.hardware.e().k(i4), false);
        }
    }
}
