package com.join.mgps.socket.fight.arena;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import app.mgsim.arena.ArenaRequest;
import com.join.mgps.socket.fight.arena.ArenaService;
/* compiled from: ArenaServiceBinderDelegate.java */
/* loaded from: classes5.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private Context f54851a;

    /* renamed from: b  reason: collision with root package name */
    private ArenaService_ f54852b;

    /* renamed from: c  reason: collision with root package name */
    private InterfaceC0385b f54853c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f54854d = false;

    /* renamed from: e  reason: collision with root package name */
    private final ServiceConnection f54855e = new a();

    /* compiled from: ArenaServiceBinderDelegate.java */
    /* loaded from: classes5.dex */
    class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            b.this.f54854d = true;
            b.this.f54852b = (ArenaService_) ((ArenaService.b) iBinder).getService();
            if (b.this.f54853c != null) {
                b.this.f54853c.c();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            b.this.f54854d = false;
            if (b.this.f54853c != null) {
                b.this.f54853c.a();
            }
            b.this.f54852b = null;
        }
    }

    /* compiled from: ArenaServiceBinderDelegate.java */
    /* renamed from: com.join.mgps.socket.fight.arena.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0385b {
        void a();

        void b(boolean z4);

        void c();
    }

    /* compiled from: ArenaServiceBinderDelegate.java */
    /* loaded from: classes5.dex */
    public static class c implements InterfaceC0385b {
        @Override // com.join.mgps.socket.fight.arena.b.InterfaceC0385b
        public void a() {
        }

        @Override // com.join.mgps.socket.fight.arena.b.InterfaceC0385b
        public void b(boolean z4) {
        }

        @Override // com.join.mgps.socket.fight.arena.b.InterfaceC0385b
        public void c() {
        }
    }

    public b(Context context, InterfaceC0385b interfaceC0385b) {
        this.f54851a = context;
        this.f54853c = interfaceC0385b;
    }

    public void bindService() {
        try {
            if (this.f54854d || this.f54851a == null) {
                return;
            }
            Intent intent = new Intent(this.f54851a, ArenaService_.class);
            this.f54851a.bindService(intent, this.f54855e, 1);
            this.f54851a.startService(intent);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public ArenaService_ d() {
        return this.f54852b;
    }

    public boolean e() {
        return this.f54852b != null;
    }

    public void f(ArenaRequest arenaRequest) {
        if (e()) {
            if (d() != null) {
                d().C(arenaRequest);
                return;
            }
            return;
        }
        this.f54854d = false;
        InterfaceC0385b interfaceC0385b = this.f54853c;
        if (interfaceC0385b != null) {
            interfaceC0385b.a();
        }
        this.f54852b = null;
    }

    public void g() {
        try {
            if (d() == null || !this.f54854d) {
                return;
            }
            this.f54851a.unbindService(this.f54855e);
            this.f54854d = false;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void h() {
    }

    public void stopService() {
        this.f54851a.stopService(new Intent(this.f54851a, ArenaService_.class));
    }
}
