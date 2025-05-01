package com.join.mgps.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.dto.AppBean;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.DownloadGameArgsBean;
import com.join.mgps.dto.PayOrderInfo;
import com.join.mgps.dto.QueryDownloadInfoResponseData;
import com.join.mgps.dto.SharePostRequest;
import com.join.mgps.dto.SpValue;
import com.join.mgps.pref.PrefDef_;
import com.papa91.arc.common.constants.BAction;
import java.util.List;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class CommonService_ extends CommonService {
    private final IntentFilter Z = new IntentFilter();

    /* renamed from: p0  reason: collision with root package name */
    private final BroadcastReceiver f54257p0 = new k();

    /* renamed from: p1  reason: collision with root package name */
    private final IntentFilter f54258p1 = new IntentFilter();

    /* renamed from: v1  reason: collision with root package name */
    private final BroadcastReceiver f54265v1 = new v();
    private final IntentFilter A1 = new IntentFilter();
    private final BroadcastReceiver B1 = new g0();
    private final IntentFilter C1 = new IntentFilter();
    private final BroadcastReceiver D1 = new r0();
    private final IntentFilter E1 = new IntentFilter();
    private final BroadcastReceiver F1 = new c1();
    private final IntentFilter G1 = new IntentFilter();
    private final BroadcastReceiver H1 = new n1();
    private final IntentFilter I1 = new IntentFilter();
    private final BroadcastReceiver J1 = new y1();
    private final IntentFilter K1 = new IntentFilter();
    private final BroadcastReceiver L1 = new f2();
    private final IntentFilter M1 = new IntentFilter();
    private final BroadcastReceiver N1 = new g2();
    private final IntentFilter O1 = new IntentFilter();
    private final BroadcastReceiver P1 = new a();
    private final IntentFilter Q1 = new IntentFilter();
    private final BroadcastReceiver R1 = new b();
    private final IntentFilter S1 = new IntentFilter();
    private final BroadcastReceiver T1 = new c();
    private final IntentFilter U1 = new IntentFilter();
    private final BroadcastReceiver V1 = new d();
    private final IntentFilter W1 = new IntentFilter();
    private final BroadcastReceiver X1 = new e();
    private final IntentFilter Y1 = new IntentFilter();
    private final BroadcastReceiver Z1 = new f();

    /* renamed from: a2  reason: collision with root package name */
    private final IntentFilter f54236a2 = new IntentFilter();

    /* renamed from: b2  reason: collision with root package name */
    private final BroadcastReceiver f54238b2 = new g();

    /* renamed from: c2  reason: collision with root package name */
    private final IntentFilter f54240c2 = new IntentFilter();

    /* renamed from: d2  reason: collision with root package name */
    private final BroadcastReceiver f54242d2 = new h();

    /* renamed from: e2  reason: collision with root package name */
    private final IntentFilter f54244e2 = new IntentFilter();

    /* renamed from: f2  reason: collision with root package name */
    private final BroadcastReceiver f54246f2 = new i();

    /* renamed from: g2  reason: collision with root package name */
    private final IntentFilter f54248g2 = new IntentFilter();

    /* renamed from: h2  reason: collision with root package name */
    private final BroadcastReceiver f54249h2 = new j();

    /* renamed from: i2  reason: collision with root package name */
    private final IntentFilter f54250i2 = new IntentFilter();

    /* renamed from: j2  reason: collision with root package name */
    private final BroadcastReceiver f54251j2 = new l();

    /* renamed from: k2  reason: collision with root package name */
    private final IntentFilter f54252k2 = new IntentFilter();

    /* renamed from: l2  reason: collision with root package name */
    private final BroadcastReceiver f54253l2 = new m();

    /* renamed from: m2  reason: collision with root package name */
    private final IntentFilter f54254m2 = new IntentFilter();

    /* renamed from: n2  reason: collision with root package name */
    private final BroadcastReceiver f54255n2 = new n();

    /* renamed from: o2  reason: collision with root package name */
    private final IntentFilter f54256o2 = new IntentFilter();

    /* renamed from: p2  reason: collision with root package name */
    private final BroadcastReceiver f54259p2 = new o();

    /* renamed from: q2  reason: collision with root package name */
    private final IntentFilter f54260q2 = new IntentFilter();

    /* renamed from: r2  reason: collision with root package name */
    private final BroadcastReceiver f54261r2 = new p();

    /* renamed from: s2  reason: collision with root package name */
    private final IntentFilter f54262s2 = new IntentFilter();

    /* renamed from: t2  reason: collision with root package name */
    private final BroadcastReceiver f54263t2 = new q();

    /* renamed from: u2  reason: collision with root package name */
    private final IntentFilter f54264u2 = new IntentFilter();
    private final BroadcastReceiver v2 = new r();

    /* renamed from: w2  reason: collision with root package name */
    private final IntentFilter f54266w2 = new IntentFilter();

    /* renamed from: x2  reason: collision with root package name */
    private final BroadcastReceiver f54267x2 = new s();
    private final IntentFilter y2 = new IntentFilter();

    /* renamed from: z2  reason: collision with root package name */
    private final BroadcastReceiver f54268z2 = new t();
    private final IntentFilter A2 = new IntentFilter();
    private final BroadcastReceiver B2 = new u();
    private final IntentFilter C2 = new IntentFilter();
    private final BroadcastReceiver D2 = new w();
    private final IntentFilter E2 = new IntentFilter();
    private final BroadcastReceiver F2 = new x();
    private final IntentFilter G2 = new IntentFilter();
    private final BroadcastReceiver H2 = new y();
    private final IntentFilter I2 = new IntentFilter();
    private final BroadcastReceiver J2 = new z();
    private final IntentFilter K2 = new IntentFilter();
    private final BroadcastReceiver L2 = new a0();
    private final IntentFilter M2 = new IntentFilter();
    private final BroadcastReceiver N2 = new b0();
    private final IntentFilter O2 = new IntentFilter();
    private final BroadcastReceiver P2 = new c0();
    private final IntentFilter Q2 = new IntentFilter();
    private final BroadcastReceiver R2 = new d0();
    private final IntentFilter S2 = new IntentFilter();
    private final BroadcastReceiver T2 = new e0();
    private final IntentFilter U2 = new IntentFilter();
    private final BroadcastReceiver V2 = new f0();
    private final IntentFilter W2 = new IntentFilter();
    private final BroadcastReceiver X2 = new h0();
    private final IntentFilter Y2 = new IntentFilter();
    private final BroadcastReceiver Z2 = new i0();

    /* renamed from: a3  reason: collision with root package name */
    private final IntentFilter f54237a3 = new IntentFilter();

    /* renamed from: b3  reason: collision with root package name */
    private final BroadcastReceiver f54239b3 = new j0();

    /* renamed from: c3  reason: collision with root package name */
    private final IntentFilter f54241c3 = new IntentFilter();

    /* renamed from: d3  reason: collision with root package name */
    private final BroadcastReceiver f54243d3 = new k0();

    /* renamed from: e3  reason: collision with root package name */
    private final IntentFilter f54245e3 = new IntentFilter();

    /* renamed from: f3  reason: collision with root package name */
    private final BroadcastReceiver f54247f3 = new l0();

    /* loaded from: classes4.dex */
    class a extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54269b = "packageName";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54270c = "gameId";

        /* renamed from: d  reason: collision with root package name */
        public static final String f54271d = "sec";

        /* renamed from: e  reason: collision with root package name */
        public static final String f54272e = "uid";

        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.J(extras.getString("packageName"), extras.getString("gameId"), extras.getInt("sec"), extras.getString("uid"));
        }
    }

    /* loaded from: classes4.dex */
    class a0 extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54274b = "packageName";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54275c = "key";

        /* renamed from: d  reason: collision with root package name */
        public static final String f54276d = "msg";

        /* renamed from: e  reason: collision with root package name */
        public static final String f54277e = "startMode";

        /* renamed from: f  reason: collision with root package name */
        public static final String f54278f = "gameId";

        /* renamed from: g  reason: collision with root package name */
        public static final String f54279g = "roomId";

        /* renamed from: h  reason: collision with root package name */
        public static final String f54280h = "uid";

        a0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.A0(extras.getString("packageName"), extras.getString("key"), extras.getString("msg"), extras.getInt("startMode"), extras.getString("gameId"), extras.getString(f54279g), extras.getString("uid"));
        }
    }

    /* loaded from: classes4.dex */
    class a1 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f54282b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a1(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f54282b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.k1(this.f54282b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class a2 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f54284b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a2(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f54284b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.a0(this.f54284b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class b extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54286b = "packageName";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54287c = "gameId";

        /* renamed from: d  reason: collision with root package name */
        public static final String f54288d = "uid";

        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.M(extras.getString("packageName"), extras.getString("gameId"), extras.getString("uid"));
        }
    }

    /* loaded from: classes4.dex */
    class b0 extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54290b = "eventName";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54291c = "gameId";

        /* renamed from: d  reason: collision with root package name */
        public static final String f54292d = "position";

        /* renamed from: e  reason: collision with root package name */
        public static final String f54293e = "uid";

        /* renamed from: f  reason: collision with root package name */
        public static final String f54294f = "endId";

        b0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.F(extras.getString(f54290b), extras.getString("gameId"), extras.getString("position"), extras.getString("uid"), extras.getString("endId"));
        }
    }

    /* loaded from: classes4.dex */
    class b1 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f54296b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b1(String str, long j4, String str2, DownloadTask downloadTask) {
            super(str, j4, str2);
            this.f54296b = downloadTask;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.v(this.f54296b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class b2 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f54298b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f54299c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b2(String str, long j4, String str2, String str3, String str4) {
            super(str, j4, str2);
            this.f54298b = str3;
            this.f54299c = str4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.Z1(this.f54298b, this.f54299c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class c extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54301b = "packageName";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54302c = "gameId";

        /* renamed from: d  reason: collision with root package name */
        public static final String f54303d = "uid";

        /* renamed from: e  reason: collision with root package name */
        public static final String f54304e = "startMode";

        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.N(extras.getString("packageName"), extras.getString("gameId"), extras.getString("uid"), extras.getInt("startMode"));
        }
    }

    /* loaded from: classes4.dex */
    class c0 extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54306b = "imagePath";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54307c = "from";

        c0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.e1(extras.getString(f54306b), (Integer) extras.getSerializable("from"));
        }
    }

    /* loaded from: classes4.dex */
    class c1 extends BroadcastReceiver {
        c1() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CommonService_.this.x0(intent);
        }
    }

    /* loaded from: classes4.dex */
    class c2 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f54310b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f54311c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f54312d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c2(String str, long j4, String str2, boolean z4, boolean z5, String str3) {
            super(str, j4, str2);
            this.f54310b = z4;
            this.f54311c = z5;
            this.f54312d = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.E(this.f54310b, this.f54311c, this.f54312d);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class d extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54314b = "packageName";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54315c = "gameId";

        /* renamed from: d  reason: collision with root package name */
        public static final String f54316d = "uid";

        d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.O(extras.getString("packageName"), extras.getString("gameId"), extras.getString("uid"));
        }
    }

    /* loaded from: classes4.dex */
    class d0 extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54318b = "md5Str";

        d0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CommonService_.this.m1((intent.getExtras() != null ? intent.getExtras() : new Bundle()).getString(f54318b));
        }
    }

    /* loaded from: classes4.dex */
    class d1 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f54320b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f54321c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f54322d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f54323e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ QueryDownloadInfoResponseData f54324f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f54325g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f54326h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f54327i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ boolean f54328j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ DownloadGameArgsBean f54329k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d1(String str, long j4, String str2, String str3, String str4, boolean z4, long j5, QueryDownloadInfoResponseData queryDownloadInfoResponseData, boolean z5, int i4, int i5, boolean z6, DownloadGameArgsBean downloadGameArgsBean) {
            super(str, j4, str2);
            this.f54320b = str3;
            this.f54321c = str4;
            this.f54322d = z4;
            this.f54323e = j5;
            this.f54324f = queryDownloadInfoResponseData;
            this.f54325g = z5;
            this.f54326h = i4;
            this.f54327i = i5;
            this.f54328j = z6;
            this.f54329k = downloadGameArgsBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.T(this.f54320b, this.f54321c, this.f54322d, this.f54323e, this.f54324f, this.f54325g, this.f54326h, this.f54327i, this.f54328j, this.f54329k);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class d2 extends a.c {
        d2(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.s1();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class e extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54332b = "packageName";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54333c = "gameId";

        /* renamed from: d  reason: collision with root package name */
        public static final String f54334d = "uid";

        /* renamed from: e  reason: collision with root package name */
        public static final String f54335e = "p2Uid";

        /* renamed from: f  reason: collision with root package name */
        public static final String f54336f = "time";

        e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.P(extras.getString("packageName"), extras.getString("gameId"), extras.getString("uid"), extras.getString("p2Uid"), extras.getLong("time"));
        }
    }

    /* loaded from: classes4.dex */
    class e0 extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54338b = "gameId";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54339c = "liveTime";

        e0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.a2(extras.getString("gameId"), (Long) extras.getSerializable(f54339c));
        }
    }

    /* loaded from: classes4.dex */
    class e1 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f54341b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f54342c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f54343d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e1(String str, long j4, String str2, String str3, int i4, String str4) {
            super(str, j4, str2);
            this.f54341b = str3;
            this.f54342c = i4;
            this.f54343d = str4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.b0(this.f54341b, this.f54342c, this.f54343d);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class e2 extends a.c {
        e2(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.s0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class f extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54346b = "packageName";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54347c = "gameId";

        /* renamed from: d  reason: collision with root package name */
        public static final String f54348d = "uid";

        /* renamed from: e  reason: collision with root package name */
        public static final String f54349e = "p2Uid";

        /* renamed from: f  reason: collision with root package name */
        public static final String f54350f = "time";

        f() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.I(extras.getString("packageName"), extras.getString("gameId"), extras.getString("uid"), extras.getString("p2Uid"), extras.getLong("time"));
        }
    }

    /* loaded from: classes4.dex */
    class f0 extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54352b = "packageName";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54353c = "gameId";

        /* renamed from: d  reason: collision with root package name */
        public static final String f54354d = "sec";

        /* renamed from: e  reason: collision with root package name */
        public static final String f54355e = "uid";

        f0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.L(extras.getString("packageName"), extras.getString("gameId"), extras.getLong("sec"), extras.getString("uid"));
        }
    }

    /* loaded from: classes4.dex */
    class f1 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f54357b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f1(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f54357b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.I0(this.f54357b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class f2 extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54359b = "gameData";

        f2() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CommonService_.this.E0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes4.dex */
    class g extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54361b = "packageName";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54362c = "gameId";

        /* renamed from: d  reason: collision with root package name */
        public static final String f54363d = "jsonData";

        /* renamed from: e  reason: collision with root package name */
        public static final String f54364e = "uid";

        g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.u0(extras.getString("packageName"), extras.getString("gameId"), extras.getString("jsonData"), extras.getString("uid"));
        }
    }

    /* loaded from: classes4.dex */
    class g0 extends BroadcastReceiver {
        g0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CommonService_.this.t0();
        }
    }

    /* loaded from: classes4.dex */
    class g1 extends a.c {
        g1(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.f0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class g2 extends BroadcastReceiver {
        g2() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CommonService_.this.f1();
        }
    }

    /* loaded from: classes4.dex */
    class h extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54369b = "packageName";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54370c = "gameId";

        /* renamed from: d  reason: collision with root package name */
        public static final String f54371d = "uid";

        /* renamed from: e  reason: collision with root package name */
        public static final String f54372e = "sec";

        h() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.H0(extras.getString("packageName"), extras.getString("gameId"), extras.getString("uid"), extras.getLong("sec"));
        }
    }

    /* loaded from: classes4.dex */
    class h0 extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54374b = "packageName";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54375c = "gameId";

        /* renamed from: d  reason: collision with root package name */
        public static final String f54376d = "sec";

        /* renamed from: e  reason: collision with root package name */
        public static final String f54377e = "uid";

        h0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.K(extras.getString("packageName"), extras.getString("gameId"), extras.getLong("sec"), extras.getString("uid"));
        }
    }

    /* loaded from: classes4.dex */
    class h1 extends a.c {
        h1(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.g0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class h2 extends org.androidannotations.api.builder.g<h2> {
        public h2(Context context) {
            super(context, CommonService_.class);
        }
    }

    /* loaded from: classes4.dex */
    class i extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54380b = "gameId";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54381c = "uid";

        /* renamed from: d  reason: collision with root package name */
        public static final String f54382d = "packageName";

        /* renamed from: e  reason: collision with root package name */
        public static final String f54383e = "version";

        /* renamed from: f  reason: collision with root package name */
        public static final String f54384f = "errorInfo";

        i() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.G(extras.getString("gameId"), extras.getString("uid"), extras.getString("packageName"), extras.getString("version"), extras.getString(f54384f));
        }
    }

    /* loaded from: classes4.dex */
    class i0 extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54386b = "key_name";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54387c = "show";

        i0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.F0(extras.getString(f54386b), extras.getBoolean(f54387c));
        }
    }

    /* loaded from: classes4.dex */
    class i1 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f54389b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i1(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f54389b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.h0(this.f54389b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class j extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54391b = "packageName";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54392c = "gameId";

        /* renamed from: d  reason: collision with root package name */
        public static final String f54393d = "sec";

        /* renamed from: e  reason: collision with root package name */
        public static final String f54394e = "uid";

        j() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.J0(extras.getString("packageName"), extras.getString("gameId"), extras.getInt("sec"), extras.getString("uid"));
        }
    }

    /* loaded from: classes4.dex */
    class j0 extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54396b = "challengeId";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54397c = "gameId";

        j0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.B0(extras.getString(f54396b), extras.getString("gameId"));
        }
    }

    /* loaded from: classes4.dex */
    class j1 extends a.c {
        j1(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.e0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class k extends BroadcastReceiver {
        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CommonService_.this.c1();
        }
    }

    /* loaded from: classes4.dex */
    class k0 extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54401b = "sp_key";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54402c = "sp_value";

        k0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.D0(extras.getString(f54401b), (SpValue) extras.getSerializable(f54402c));
        }
    }

    /* loaded from: classes4.dex */
    class k1 extends a.c {
        k1(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.V();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class l extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54405b = "packageName";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54406c = "gameId";

        /* renamed from: d  reason: collision with root package name */
        public static final String f54407d = "sec";

        /* renamed from: e  reason: collision with root package name */
        public static final String f54408e = "uid";

        l() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.N0(extras.getString("packageName"), extras.getString("gameId"), extras.getInt("sec"), extras.getString("uid"));
        }
    }

    /* loaded from: classes4.dex */
    class l0 extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54410b = "gameId";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54411c = "isOnStart";

        l0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.z(extras.getString("gameId"), extras.getBoolean(f54411c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l1 extends a.c {
        l1(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.Y1();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class m extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54414b = "packageName";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54415c = "gameId";

        /* renamed from: d  reason: collision with root package name */
        public static final String f54416d = "sec";

        /* renamed from: e  reason: collision with root package name */
        public static final String f54417e = "uid";

        m() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.M0(extras.getString("packageName"), extras.getString("gameId"), extras.getInt("sec"), extras.getString("uid"));
        }
    }

    /* loaded from: classes4.dex */
    class m0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f54419b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PayOrderInfo f54420c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.wufan.user.service.protobuf.n0 f54421d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f54422e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f54423f;

        m0(String str, PayOrderInfo payOrderInfo, com.wufan.user.service.protobuf.n0 n0Var, boolean z4, String str2) {
            this.f54419b = str;
            this.f54420c = payOrderInfo;
            this.f54421d = n0Var;
            this.f54422e = z4;
            this.f54423f = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonService_.super.N1(this.f54419b, this.f54420c, this.f54421d, this.f54422e, this.f54423f);
        }
    }

    /* loaded from: classes4.dex */
    class m1 extends a.c {
        m1(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.c0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class n extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54426b = "packageName";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54427c = "gameId";

        /* renamed from: d  reason: collision with root package name */
        public static final String f54428d = "sec";

        /* renamed from: e  reason: collision with root package name */
        public static final String f54429e = "uid";

        n() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.L0(extras.getString("packageName"), extras.getString("gameId"), extras.getInt("sec"), extras.getString("uid"));
        }
    }

    /* loaded from: classes4.dex */
    class n0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f54431b;

        n0(String str) {
            this.f54431b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonService_.super.r0(this.f54431b);
        }
    }

    /* loaded from: classes4.dex */
    class n1 extends BroadcastReceiver {
        n1() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CommonService_.this.Y1();
        }
    }

    /* loaded from: classes4.dex */
    class o extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54434b = "packageName";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54435c = "gameId";

        /* renamed from: d  reason: collision with root package name */
        public static final String f54436d = "sec";

        /* renamed from: e  reason: collision with root package name */
        public static final String f54437e = "uid";

        o() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.O0(extras.getString("packageName"), extras.getString("gameId"), extras.getInt("sec"), extras.getString("uid"));
        }
    }

    /* loaded from: classes4.dex */
    class o0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CollectionBeanSub f54439b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f54440c;

        o0(CollectionBeanSub collectionBeanSub, boolean z4) {
            this.f54439b = collectionBeanSub;
            this.f54440c = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonService_.super.I1(this.f54439b, this.f54440c);
        }
    }

    /* loaded from: classes4.dex */
    class o1 extends a.c {
        o1(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.Q();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class p extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54443b = "packageName";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54444c = "gameId";

        /* renamed from: d  reason: collision with root package name */
        public static final String f54445d = "position";

        /* renamed from: e  reason: collision with root package name */
        public static final String f54446e = "uid";

        p() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.W0(extras.getString("packageName"), extras.getString("gameId"), extras.getInt("position"), extras.getString("uid"));
        }
    }

    /* loaded from: classes4.dex */
    class p0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CollectionBeanSub f54448b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f54449c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f54450d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f54451e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f54452f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f54453g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ DownloadGameArgsBean f54454h;

        p0(CollectionBeanSub collectionBeanSub, boolean z4, boolean z5, String str, boolean z6, boolean z7, DownloadGameArgsBean downloadGameArgsBean) {
            this.f54448b = collectionBeanSub;
            this.f54449c = z4;
            this.f54450d = z5;
            this.f54451e = str;
            this.f54452f = z6;
            this.f54453g = z7;
            this.f54454h = downloadGameArgsBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonService_.super.J1(this.f54448b, this.f54449c, this.f54450d, this.f54451e, this.f54452f, this.f54453g, this.f54454h);
        }
    }

    /* loaded from: classes4.dex */
    class p1 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f54456b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p1(String str, long j4, String str2, List list) {
            super(str, j4, str2);
            this.f54456b = list;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.u(this.f54456b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class q extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54458b = "packageName";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54459c = "gameId";

        /* renamed from: d  reason: collision with root package name */
        public static final String f54460d = "position";

        /* renamed from: e  reason: collision with root package name */
        public static final String f54461e = "uid";

        q() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.R0(extras.getString("packageName"), extras.getString("gameId"), extras.getInt("position"), extras.getString("uid"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class q0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Intent f54463b;

        q0(Intent intent) {
            this.f54463b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonService_.super.x0(this.f54463b);
        }
    }

    /* loaded from: classes4.dex */
    class q1 extends a.c {
        q1(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.d();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class r extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54466b = "packageName";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54467c = "gameId";

        /* renamed from: d  reason: collision with root package name */
        public static final String f54468d = "position";

        /* renamed from: e  reason: collision with root package name */
        public static final String f54469e = "uid";

        r() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.X0(extras.getString("packageName"), extras.getString("gameId"), extras.getInt("position"), extras.getString("uid"));
        }
    }

    /* loaded from: classes4.dex */
    class r0 extends BroadcastReceiver {
        r0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CommonService_.this.j0();
        }
    }

    /* loaded from: classes4.dex */
    class r1 extends a.c {
        r1(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.j1();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class s extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54473b = "packageName";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54474c = "gameId";

        /* renamed from: d  reason: collision with root package name */
        public static final String f54475d = "position";

        /* renamed from: e  reason: collision with root package name */
        public static final String f54476e = "uid";

        s() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.Q0(extras.getString("packageName"), extras.getString("gameId"), extras.getInt("position"), extras.getString("uid"));
        }
    }

    /* loaded from: classes4.dex */
    class s0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f54478b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f54479c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ QueryDownloadInfoResponseData f54480d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DownloadTask f54481e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f54482f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ DownloadGameArgsBean f54483g;

        s0(String str, String str2, QueryDownloadInfoResponseData queryDownloadInfoResponseData, DownloadTask downloadTask, boolean z4, DownloadGameArgsBean downloadGameArgsBean) {
            this.f54478b = str;
            this.f54479c = str2;
            this.f54480d = queryDownloadInfoResponseData;
            this.f54481e = downloadTask;
            this.f54482f = z4;
            this.f54483g = downloadGameArgsBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonService_.super.F1(this.f54478b, this.f54479c, this.f54480d, this.f54481e, this.f54482f, this.f54483g);
        }
    }

    /* loaded from: classes4.dex */
    class s1 extends a.c {
        s1(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.d0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class t extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54486b = "packageName";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54487c = "gameId";

        /* renamed from: d  reason: collision with root package name */
        public static final String f54488d = "position";

        /* renamed from: e  reason: collision with root package name */
        public static final String f54489e = "uid";

        t() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.V0(extras.getString("packageName"), extras.getString("gameId"), extras.getInt("position"), extras.getString("uid"));
        }
    }

    /* loaded from: classes4.dex */
    class t0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f54491b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f54492c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f54493d;

        t0(String str, String str2, boolean z4) {
            this.f54491b = str;
            this.f54492c = str2;
            this.f54493d = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonService_.super.U(this.f54491b, this.f54492c, this.f54493d);
        }
    }

    /* loaded from: classes4.dex */
    class t1 extends a.c {
        t1(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.Z();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class u extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54496b = "packageName";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54497c = "gameId";

        /* renamed from: d  reason: collision with root package name */
        public static final String f54498d = "position";

        /* renamed from: e  reason: collision with root package name */
        public static final String f54499e = "uid";

        u() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.S0(extras.getString("packageName"), extras.getString("gameId"), extras.getInt("position"), extras.getString("uid"));
        }
    }

    /* loaded from: classes4.dex */
    class u0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f54501b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f54502c;

        u0(String str, int i4) {
            this.f54501b = str;
            this.f54502c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonService_.super.L1(this.f54501b, this.f54502c);
        }
    }

    /* loaded from: classes4.dex */
    class u1 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f54504b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u1(String str, long j4, String str2, List list) {
            super(str, j4, str2);
            this.f54504b = list;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.q1(this.f54504b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class v extends BroadcastReceiver {
        v() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CommonService_.this.d1();
        }
    }

    /* loaded from: classes4.dex */
    class v0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f54507b;

        v0(String str) {
            this.f54507b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonService_.super.P1(this.f54507b);
        }
    }

    /* loaded from: classes4.dex */
    class v1 extends a.c {
        v1(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.x();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class w extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54510b = "packageName";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54511c = "gameId";

        /* renamed from: d  reason: collision with root package name */
        public static final String f54512d = "position";

        /* renamed from: e  reason: collision with root package name */
        public static final String f54513e = "uid";

        w() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.T0(extras.getString("packageName"), extras.getString("gameId"), extras.getInt("position"), extras.getString("uid"));
        }
    }

    /* loaded from: classes4.dex */
    class w0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SharePostRequest f54515b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w0(String str, long j4, String str2, SharePostRequest sharePostRequest) {
            super(str, j4, str2);
            this.f54515b = sharePostRequest;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.B1(this.f54515b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class w1 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f54517b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w1(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f54517b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.y(this.f54517b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class x extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54519b = "packageName";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54520c = "gameId";

        /* renamed from: d  reason: collision with root package name */
        public static final String f54521d = "position";

        /* renamed from: e  reason: collision with root package name */
        public static final String f54522e = "uid";

        x() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.U0(extras.getString("packageName"), extras.getString("gameId"), extras.getInt("position"), extras.getString("uid"));
        }
    }

    /* loaded from: classes4.dex */
    class x0 extends a.c {
        x0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.Q1();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class x1 extends a.c {
        x1(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.e();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class y extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54526b = "packageName";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54527c = "gameId";

        /* renamed from: d  reason: collision with root package name */
        public static final String f54528d = "position";

        /* renamed from: e  reason: collision with root package name */
        public static final String f54529e = "uid";

        y() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.P0(extras.getString("packageName"), extras.getString("gameId"), extras.getInt("position"), extras.getString("uid"));
        }
    }

    /* loaded from: classes4.dex */
    class y0 extends a.c {
        y0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.W();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class y1 extends BroadcastReceiver {
        y1() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CommonService_.this.G0(intent);
        }
    }

    /* loaded from: classes4.dex */
    class z extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f54533b = "packageName";

        /* renamed from: c  reason: collision with root package name */
        public static final String f54534c = "gameId";

        /* renamed from: d  reason: collision with root package name */
        public static final String f54535d = "position";

        /* renamed from: e  reason: collision with root package name */
        public static final String f54536e = "uid";

        z() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            CommonService_.this.K0(extras.getString("packageName"), extras.getString("gameId"), extras.getInt("position"), extras.getString("uid"));
        }
    }

    /* loaded from: classes4.dex */
    class z0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f54538b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z0(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f54538b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.i1(this.f54538b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class z1 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f54540b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f54541c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ DownloadTask f54542d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f54543e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ DownloadGameArgsBean f54544f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z1(String str, long j4, String str2, String str3, String str4, DownloadTask downloadTask, boolean z4, DownloadGameArgsBean downloadGameArgsBean) {
            super(str, j4, str2);
            this.f54540b = str3;
            this.f54541c = str4;
            this.f54542d = downloadTask;
            this.f54543e = z4;
            this.f54544f = downloadGameArgsBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonService_.super.D(this.f54540b, this.f54541c, this.f54542d, this.f54543e, this.f54544f);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    private void R2() {
        this.f54155c = new PrefDef_(this);
        this.f54156d = AccountUtil_.getInstance_(this);
        this.Z.addAction(o1.a.f72038z);
        this.f54258p1.addAction(o1.a.f72024s);
        this.A1.addAction(o1.a.f72012m);
        this.C1.addAction(o1.a.f72020q);
        this.E1.addAction("android.net.wifi.STATE_CHANGE");
        this.E1.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        this.E1.addAction("android.net.wifi.SCAN_RESULTS");
        this.E1.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.G1.addAction("com.join.android.app.mgsim.wufun.broadcast.action_login_success");
        this.G1.addAction(o1.a.f72028u);
        this.I1.addAction(o1.a.f72034x);
        this.K1.addAction(o1.a.G);
        this.M1.addAction(o1.a.B);
        this.M1.addAction(o1.a.H);
        this.O1.addAction(o1.a.V);
        this.Q1.addAction(o1.a.P);
        this.S1.addAction(o1.a.T);
        this.U1.addAction(o1.a.Q);
        this.W1.addAction(o1.a.R);
        this.Y1.addAction(o1.a.S);
        this.f54236a2.addAction(o1.a.U);
        this.f54240c2.addAction(o1.a.O);
        this.f54244e2.addAction(o1.a.W);
        this.f54248g2.addAction(o1.a.X);
        this.f54250i2.addAction(o1.a.Y);
        this.f54252k2.addAction(o1.a.Z);
        this.f54254m2.addAction(o1.a.f71989a0);
        this.f54256o2.addAction(o1.a.f71991b0);
        this.f54260q2.addAction("com.join.android.app.mgsim.wufun.broadcast.emu.showvippopup");
        this.f54262s2.addAction("com.join.android.app.mgsim.wufun.broadcast.emu.onclickVippopup");
        this.f54264u2.addAction("com.join.android.app.mgsim.wufun.broadcast.emu.uesVippopup");
        this.f54266w2.addAction("com.join.android.app.mgsim.wufun.broadcast.emu.onclickFunction");
        this.y2.addAction("com.join.android.app.mgsim.wufun.broadcast.emu.shareScreenshot");
        this.A2.addAction("com.join.android.app.mgsim.wufun.broadcast.emu.openGoldfinger");
        this.C2.addAction("com.join.android.app.mgsim.wufun.broadcast.emu.openKeyskill");
        this.E2.addAction("com.join.android.app.mgsim.wufun.broadcast.emu.selectLevel");
        this.G2.addAction("com.join.android.app.mgsim.wufun.broadcast.emu.NotpromptVippopup");
        this.I2.addAction("com.join.android.app.mgsim.wufun.broadcast.emu.exitVippopup");
        this.K2.addAction(o1.a.L0);
        this.M2.addAction("com.join.android.app.mgsim.wufun.broadcast.emu.commonpoint");
        this.O2.addAction(o1.a.f72013m0);
        this.Q2.addAction("com.join.android.app.mgsim.wufun.broadcast.emu.adInfo");
        this.S2.addAction(BAction.ACTION_EMU_GAME_PLAY_TIMES);
        this.U2.addAction(o1.a.H0);
        this.W2.addAction(o1.a.I0);
        this.Y2.addAction(o1.a.J0);
        this.f54237a3.addAction(BAction.ACTION_ENDGAME_RECORD_UPLOAD);
        this.f54241c3.addAction(o1.a.K0);
        this.f54245e3.addAction(BAction.ACTION_EMU_SHOW_HIDE);
    }

    public static h2 S2(Context context) {
        return new h2(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void B1(SharePostRequest sharePostRequest) {
        org.androidannotations.api.a.l(new w0("", 0L, "", sharePostRequest));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void D(String str, String str2, DownloadTask downloadTask, boolean z4, DownloadGameArgsBean downloadGameArgsBean) {
        org.androidannotations.api.a.l(new z1("", 0L, "", str, str2, downloadTask, z4, downloadGameArgsBean));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void E(boolean z4, boolean z5, String str) {
        org.androidannotations.api.a.l(new c2("", 0L, "", z4, z5, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void F1(String str, String str2, QueryDownloadInfoResponseData queryDownloadInfoResponseData, DownloadTask downloadTask, boolean z4, DownloadGameArgsBean downloadGameArgsBean) {
        org.androidannotations.api.b.e("", new s0(str, str2, queryDownloadInfoResponseData, downloadTask, z4, downloadGameArgsBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void H1(String str) {
        org.androidannotations.api.b.e("", new n0(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void I0(int i4) {
        org.androidannotations.api.a.l(new f1("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void I1(CollectionBeanSub collectionBeanSub, boolean z4) {
        org.androidannotations.api.b.e("", new o0(collectionBeanSub, z4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void J1(CollectionBeanSub collectionBeanSub, boolean z4, boolean z5, String str, boolean z6, boolean z7, DownloadGameArgsBean downloadGameArgsBean) {
        org.androidannotations.api.b.e("", new p0(collectionBeanSub, z4, z5, str, z6, z7, downloadGameArgsBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void L1(String str, int i4) {
        org.androidannotations.api.b.e("", new u0(str, i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void N1(String str, PayOrderInfo payOrderInfo, com.wufan.user.service.protobuf.n0 n0Var, boolean z4, String str2) {
        org.androidannotations.api.b.e("", new m0(str, payOrderInfo, n0Var, z4, str2), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void P1(String str) {
        org.androidannotations.api.b.e("", new v0(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void Q() {
        org.androidannotations.api.a.l(new o1("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void Q1() {
        org.androidannotations.api.a.l(new x0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void T(String str, String str2, boolean z4, long j4, QueryDownloadInfoResponseData queryDownloadInfoResponseData, boolean z5, int i4, int i5, boolean z6, DownloadGameArgsBean downloadGameArgsBean) {
        org.androidannotations.api.a.l(new d1("", 0L, "", str, str2, z4, j4, queryDownloadInfoResponseData, z5, i4, i5, z6, downloadGameArgsBean));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void U(String str, String str2, boolean z4) {
        org.androidannotations.api.b.e("", new t0(str, str2, z4), 200L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void V() {
        org.androidannotations.api.a.l(new k1("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void W() {
        org.androidannotations.api.a.l(new y0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void Y1() {
        org.androidannotations.api.a.l(new l1("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void Z() {
        org.androidannotations.api.a.l(new t1("", 500L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void Z1(String str, String str2) {
        org.androidannotations.api.a.l(new b2("", 0L, "", str, str2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void a0(String str) {
        org.androidannotations.api.a.l(new a2("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void b0(String str, int i4, String str2) {
        org.androidannotations.api.a.l(new e1("", 0L, "", str, i4, str2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void c0() {
        org.androidannotations.api.a.l(new m1("", 5000L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void d() {
        org.androidannotations.api.a.l(new q1("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void d0() {
        org.androidannotations.api.a.l(new s1("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void e() {
        org.androidannotations.api.a.l(new x1("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void e0() {
        org.androidannotations.api.a.l(new j1("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void f0() {
        org.androidannotations.api.a.l(new g1("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void g0() {
        org.androidannotations.api.a.l(new h1("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void h0(int i4) {
        org.androidannotations.api.a.l(new i1("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void i1(String str) {
        org.androidannotations.api.a.l(new z0("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void j1() {
        org.androidannotations.api.a.l(new r1("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void k1(String str) {
        org.androidannotations.api.a.l(new a1("", 0L, "", str));
    }

    @Override // com.join.mgps.service.CommonService, android.app.Service
    public void onCreate() {
        R2();
        super.onCreate();
        registerReceiver(this.f54257p0, this.Z);
        registerReceiver(this.f54265v1, this.f54258p1);
        registerReceiver(this.B1, this.A1);
        registerReceiver(this.D1, this.C1);
        registerReceiver(this.F1, this.E1);
        registerReceiver(this.H1, this.G1);
        registerReceiver(this.J1, this.I1);
        registerReceiver(this.L1, this.K1);
        registerReceiver(this.N1, this.M1);
        registerReceiver(this.P1, this.O1);
        registerReceiver(this.R1, this.Q1);
        registerReceiver(this.T1, this.S1);
        registerReceiver(this.V1, this.U1);
        registerReceiver(this.X1, this.W1);
        registerReceiver(this.Z1, this.Y1);
        registerReceiver(this.f54238b2, this.f54236a2);
        registerReceiver(this.f54242d2, this.f54240c2);
        registerReceiver(this.f54246f2, this.f54244e2);
        registerReceiver(this.f54249h2, this.f54248g2);
        registerReceiver(this.f54251j2, this.f54250i2);
        registerReceiver(this.f54253l2, this.f54252k2);
        registerReceiver(this.f54255n2, this.f54254m2);
        registerReceiver(this.f54259p2, this.f54256o2);
        registerReceiver(this.f54261r2, this.f54260q2);
        registerReceiver(this.f54263t2, this.f54262s2);
        registerReceiver(this.v2, this.f54264u2);
        registerReceiver(this.f54267x2, this.f54266w2);
        registerReceiver(this.f54268z2, this.y2);
        registerReceiver(this.B2, this.A2);
        registerReceiver(this.D2, this.C2);
        registerReceiver(this.F2, this.E2);
        registerReceiver(this.H2, this.G2);
        registerReceiver(this.J2, this.I2);
        registerReceiver(this.L2, this.K2);
        registerReceiver(this.N2, this.M2);
        registerReceiver(this.P2, this.O2);
        registerReceiver(this.R2, this.Q2);
        registerReceiver(this.T2, this.S2);
        registerReceiver(this.V2, this.U2);
        registerReceiver(this.X2, this.W2);
        registerReceiver(this.Z2, this.Y2);
        registerReceiver(this.f54239b3, this.f54237a3);
        registerReceiver(this.f54243d3, this.f54241c3);
        registerReceiver(this.f54247f3, this.f54245e3);
    }

    @Override // com.join.mgps.service.CommonService, android.app.Service
    public void onDestroy() {
        unregisterReceiver(this.f54257p0);
        unregisterReceiver(this.f54265v1);
        unregisterReceiver(this.B1);
        unregisterReceiver(this.D1);
        unregisterReceiver(this.F1);
        unregisterReceiver(this.H1);
        unregisterReceiver(this.J1);
        unregisterReceiver(this.L1);
        unregisterReceiver(this.N1);
        unregisterReceiver(this.P1);
        unregisterReceiver(this.R1);
        unregisterReceiver(this.T1);
        unregisterReceiver(this.V1);
        unregisterReceiver(this.X1);
        unregisterReceiver(this.Z1);
        unregisterReceiver(this.f54238b2);
        unregisterReceiver(this.f54242d2);
        unregisterReceiver(this.f54246f2);
        unregisterReceiver(this.f54249h2);
        unregisterReceiver(this.f54251j2);
        unregisterReceiver(this.f54253l2);
        unregisterReceiver(this.f54255n2);
        unregisterReceiver(this.f54259p2);
        unregisterReceiver(this.f54261r2);
        unregisterReceiver(this.f54263t2);
        unregisterReceiver(this.v2);
        unregisterReceiver(this.f54267x2);
        unregisterReceiver(this.f54268z2);
        unregisterReceiver(this.B2);
        unregisterReceiver(this.D2);
        unregisterReceiver(this.F2);
        unregisterReceiver(this.H2);
        unregisterReceiver(this.J2);
        unregisterReceiver(this.L2);
        unregisterReceiver(this.N2);
        unregisterReceiver(this.P2);
        unregisterReceiver(this.R2);
        unregisterReceiver(this.T2);
        unregisterReceiver(this.V2);
        unregisterReceiver(this.X2);
        unregisterReceiver(this.Z2);
        unregisterReceiver(this.f54239b3);
        unregisterReceiver(this.f54243d3);
        unregisterReceiver(this.f54247f3);
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void q1(List<AppBean> list) {
        org.androidannotations.api.a.l(new u1("", 0L, "", list));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void s0() {
        org.androidannotations.api.a.l(new e2("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void s1() {
        org.androidannotations.api.a.l(new d2("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void u(List<String> list) {
        org.androidannotations.api.a.l(new p1("", 0L, "", list));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void v(DownloadTask downloadTask) {
        org.androidannotations.api.a.l(new b1("", 0L, "", downloadTask));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void x() {
        org.androidannotations.api.a.l(new v1("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void x0(Intent intent) {
        org.androidannotations.api.b.e("", new q0(intent), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.service.CommonService
    public void y(String str) {
        org.androidannotations.api.a.l(new w1("", 0L, "", str));
    }
}
