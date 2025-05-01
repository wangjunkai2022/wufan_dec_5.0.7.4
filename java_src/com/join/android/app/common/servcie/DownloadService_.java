package com.join.android.app.common.servcie;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.join.mgps.dto.DetailResultBean;
import com.join.mgps.pref.PrefDef_;
import org.androidannotations.api.a;
/* loaded from: classes.dex */
public final class DownloadService_ extends DownloadService {

    /* renamed from: o  reason: collision with root package name */
    private final IntentFilter f14770o = new IntentFilter();

    /* renamed from: p  reason: collision with root package name */
    private final BroadcastReceiver f14771p = new c();

    /* renamed from: q  reason: collision with root package name */
    private final IntentFilter f14772q = new IntentFilter();

    /* renamed from: r  reason: collision with root package name */
    private final BroadcastReceiver f14773r = new d();

    /* renamed from: s  reason: collision with root package name */
    private final IntentFilter f14774s = new IntentFilter();

    /* renamed from: t  reason: collision with root package name */
    private final BroadcastReceiver f14775t = new e();

    /* renamed from: u  reason: collision with root package name */
    private final IntentFilter f14776u = new IntentFilter();

    /* renamed from: v  reason: collision with root package name */
    private final BroadcastReceiver f14777v = new f();

    /* loaded from: classes3.dex */
    class a extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f14778b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f14778b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                DownloadService_.super.o(this.f14778b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class b extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f14780b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f14781c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, long j4, String str2, int i4, String str3) {
            super(str, j4, str2);
            this.f14780b = i4;
            this.f14781c = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                DownloadService_.super.p(this.f14780b, this.f14781c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DownloadService_.this.m(intent);
        }
    }

    /* loaded from: classes3.dex */
    class d extends BroadcastReceiver {
        d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DownloadService_.this.n(intent);
        }
    }

    /* loaded from: classes3.dex */
    class e extends BroadcastReceiver {
        e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DownloadService_.this.s(intent);
        }
    }

    /* loaded from: classes3.dex */
    class f extends BroadcastReceiver {
        f() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DownloadService_.this.E(intent);
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DetailResultBean f14787b;

        g(DetailResultBean detailResultBean) {
            this.f14787b = detailResultBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadService_.super.S(this.f14787b);
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f14789b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f14790c;

        h(int i4, int i5) {
            this.f14789b = i4;
            this.f14790c = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadService_.super.R(this.f14789b, this.f14790c);
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadService_.super.M();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Intent f14793b;

        j(Intent intent) {
            this.f14793b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadService_.super.E(this.f14793b);
        }
    }

    /* loaded from: classes3.dex */
    class k extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f14795b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f14795b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                DownloadService_.super.t(this.f14795b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class l extends org.androidannotations.api.builder.g<l> {
        public l(Context context) {
            super(context, DownloadService_.class);
        }
    }

    private void b0() {
        this.f14762c = new PrefDef_(this);
        this.f14770o.addAction(o1.a.f72014n);
        this.f14772q.addAction(o1.a.f72016o);
        this.f14774s.addAction(o1.a.f72018p);
        this.f14776u.addAction("android.net.wifi.STATE_CHANGE");
        this.f14776u.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        this.f14776u.addAction("android.net.wifi.SCAN_RESULTS");
        this.f14776u.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    }

    public static l c0(Context context) {
        return new l(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.android.app.common.servcie.DownloadService
    public void E(Intent intent) {
        org.androidannotations.api.b.e("", new j(intent), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.android.app.common.servcie.DownloadService
    public void M() {
        org.androidannotations.api.b.e("", new i(), 3000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.android.app.common.servcie.DownloadService
    public void R(int i4, int i5) {
        org.androidannotations.api.b.e("", new h(i4, i5), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.android.app.common.servcie.DownloadService
    public void S(DetailResultBean detailResultBean) {
        org.androidannotations.api.b.e("", new g(detailResultBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.android.app.common.servcie.DownloadService
    public void o(String str) {
        org.androidannotations.api.a.l(new a("", 0L, "", str));
    }

    @Override // com.join.android.app.common.servcie.DownloadService, android.app.Service
    public void onCreate() {
        b0();
        super.onCreate();
        registerReceiver(this.f14771p, this.f14770o);
        registerReceiver(this.f14773r, this.f14772q);
        registerReceiver(this.f14775t, this.f14774s);
        registerReceiver(this.f14777v, this.f14776u);
    }

    @Override // com.join.android.app.common.servcie.DownloadService, android.app.Service
    public void onDestroy() {
        unregisterReceiver(this.f14771p);
        unregisterReceiver(this.f14773r);
        unregisterReceiver(this.f14775t);
        unregisterReceiver(this.f14777v);
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.android.app.common.servcie.DownloadService
    public void p(int i4, String str) {
        org.androidannotations.api.a.l(new b("", 0L, "", i4, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.android.app.common.servcie.DownloadService
    public void t(String str) {
        org.androidannotations.api.a.l(new k("", 0L, "", str));
    }
}
