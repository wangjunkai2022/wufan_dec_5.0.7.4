package com.join.mgps.socket.fight.arena;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import app.mgsim.arena.ArenaRequest;
import app.mgsim.arena.SocketError;
import com.join.mgps.Util.AccountUtil_;
import org.androidannotations.api.a;
/* loaded from: classes5.dex */
public final class ArenaService_ extends ArenaService {

    /* renamed from: t  reason: collision with root package name */
    private final IntentFilter f54732t = new IntentFilter();

    /* renamed from: u  reason: collision with root package name */
    private final BroadcastReceiver f54733u = new a();

    /* loaded from: classes5.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ArenaService_.this.x();
        }
    }

    /* loaded from: classes5.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f54735b;

        b(String str) {
            this.f54735b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArenaService_.super.a(this.f54735b);
        }
    }

    /* loaded from: classes5.dex */
    class c extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SocketError f54737b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, long j4, String str2, SocketError socketError) {
            super(str, j4, str2);
            this.f54737b = socketError;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ArenaService_.super.w(this.f54737b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes5.dex */
    class d extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArenaRequest f54739b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, long j4, String str2, ArenaRequest arenaRequest) {
            super(str, j4, str2);
            this.f54739b = arenaRequest;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ArenaService_.super.C(this.f54739b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes5.dex */
    class e extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f54741b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, long j4, String str2, Object obj) {
            super(str, j4, str2);
            this.f54741b = obj;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ArenaService_.super.r(this.f54741b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes5.dex */
    class f extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArenaRequest f54743b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, long j4, String str2, ArenaRequest arenaRequest) {
            super(str, j4, str2);
            this.f54743b = arenaRequest;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ArenaService_.super.k(this.f54743b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes5.dex */
    class g extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f54745b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f54745b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ArenaService_.super.t(this.f54745b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes5.dex */
    class h extends a.c {
        h(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ArenaService_.super.i();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class i extends a.c {
        i(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ArenaService_.super.x();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class j extends org.androidannotations.api.builder.g<j> {
        public j(Context context) {
            super(context, ArenaService_.class);
        }
    }

    private void P() {
        this.f54721i = AccountUtil_.getInstance_(this);
        this.f54732t.addAction(o1.a.B);
    }

    public static j Q(Context context) {
        return new j(context);
    }

    @Override // com.join.mgps.socket.fight.arena.ArenaService
    public void C(ArenaRequest arenaRequest) {
        org.androidannotations.api.a.l(new d("", 0L, "", arenaRequest));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.socket.fight.arena.ArenaService
    public void a(String str) {
        org.androidannotations.api.b.e("", new b(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.socket.fight.arena.ArenaService
    public void i() {
        org.androidannotations.api.a.l(new h("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.socket.fight.arena.ArenaService
    public void k(ArenaRequest arenaRequest) {
        org.androidannotations.api.a.l(new f("", 0L, "", arenaRequest));
    }

    @Override // com.join.mgps.socket.fight.arena.ArenaService, android.app.Service
    public void onCreate() {
        P();
        super.onCreate();
        registerReceiver(this.f54733u, this.f54732t);
    }

    @Override // com.join.mgps.socket.fight.arena.ArenaService, android.app.Service
    public void onDestroy() {
        unregisterReceiver(this.f54733u);
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.socket.fight.arena.ArenaService
    public void r(Object obj) {
        org.androidannotations.api.a.l(new e("", 0L, "", obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.socket.fight.arena.ArenaService
    public void t(int i4) {
        org.androidannotations.api.a.l(new g("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.socket.fight.arena.ArenaService
    public void w(SocketError socketError) {
        org.androidannotations.api.a.l(new c("", 0L, "", socketError));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.socket.fight.arena.ArenaService
    public void x() {
        org.androidannotations.api.a.l(new i("", 0L, ""));
    }
}
