package com.beizi.fusion.d;

import android.content.Context;
import android.text.TextUtils;
import com.beizi.fusion.BeiZis;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.ai;
import com.beizi.fusion.g.aj;
import com.beizi.fusion.g.at;
import com.beizi.fusion.g.au;
import com.beizi.fusion.g.b;
import com.beizi.fusion.model.AppEventId;
import com.beizi.fusion.model.RequestInfo;
import com.beizi.fusion.model.ResponseInfo;
/* compiled from: AdManager.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static String f6674a = null;

    /* renamed from: b  reason: collision with root package name */
    public static String f6675b = "";

    /* renamed from: c  reason: collision with root package name */
    private static String f6676c = "AdManager";

    /* renamed from: d  reason: collision with root package name */
    private static b f6677d;

    /* renamed from: e  reason: collision with root package name */
    private static String f6678e;

    /* renamed from: j  reason: collision with root package name */
    private static String f6679j;

    /* renamed from: k  reason: collision with root package name */
    private static String f6680k;

    /* renamed from: f  reason: collision with root package name */
    private Context f6681f;

    /* renamed from: h  reason: collision with root package name */
    private com.beizi.fusion.update.b f6683h;

    /* renamed from: i  reason: collision with root package name */
    private com.beizi.fusion.b.d f6684i;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6682g = false;

    /* renamed from: l  reason: collision with root package name */
    private boolean f6685l = false;

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        com.beizi.fusion.g.r.a().a(this.f6681f);
        ResponseInfo.getInstance(this.f6681f).init();
        this.f6684i.f6575a.a(1);
        com.beizi.fusion.update.b a5 = com.beizi.fusion.update.b.a(this.f6681f);
        this.f6683h = a5;
        a5.b(0);
        if (!aj.b() || (!BeiZis.isLimitPersonalAds() && (BeiZis.getCustomController() == null || (BeiZis.getCustomController() != null && BeiZis.getCustomController().isCanUseOaid())))) {
            String str = (String) at.b(this.f6681f, "__OAID__", "");
            if (!TextUtils.isEmpty(str) && RequestInfo.getInstance(this.f6681f).getDevInfo() != null) {
                RequestInfo.getInstance(this.f6681f).getDevInfo().setOaid(str);
            }
            i();
            j();
        }
        if (!aj.b() || (!BeiZis.isLimitPersonalAds() && (BeiZis.getCustomController() == null || (BeiZis.getCustomController() != null && BeiZis.getCustomController().isCanUseGaid())))) {
            com.beizi.fusion.g.h.b().c().execute(new Runnable() { // from class: com.beizi.fusion.d.b.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        b.a a6 = com.beizi.fusion.g.b.a(b.this.f6681f);
                        String a7 = a6.a();
                        boolean b5 = a6.b();
                        at.a(b.this.f6681f, "__GAID__", (Object) a7);
                        at.a(b.this.f6681f, "isLimitTrackGaid", Boolean.valueOf(b5));
                        if (!b5) {
                            RequestInfo.getInstance(b.this.f6681f).getDevInfo().setGaid(a7);
                            String str2 = b.f6676c;
                            af.b(str2, "advertising id is " + a7);
                        } else {
                            af.b(b.f6676c, "User has opted not to use the advertising Id");
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            });
        }
        if (this.f6684i.f6575a.a() == 1) {
            this.f6684i.f6575a.a(2);
        }
    }

    private void i() {
        try {
            new com.beizi.fusion.e.a.b(ai.f6864b).a(this.f6681f);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:3:0x0004, B:5:0x0014, B:8:0x002b, B:16:0x0055, B:18:0x006f, B:20:0x0087, B:22:0x009e, B:24:0x00ad, B:25:0x00b7, B:14:0x004a), top: B:30:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:3:0x0004, B:5:0x0014, B:8:0x002b, B:16:0x0055, B:18:0x006f, B:20:0x0087, B:22:0x009e, B:24:0x00ad, B:25:0x00b7, B:14:0x004a), top: B:30:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void j() {
        /*
            r10 = this;
            java.lang.String r0 = "0"
            java.lang.String r1 = "SM_STATUS"
            android.content.Context r2 = r10.f6681f     // Catch: java.lang.Throwable -> Lc1
            com.beizi.fusion.model.ResponseInfo r2 = com.beizi.fusion.model.ResponseInfo.getInstance(r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = r2.getSmFlag()     // Catch: java.lang.Throwable -> Lc1
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> Lc1
            if (r2 == 0) goto Lc5
            android.content.Context r2 = r10.f6681f     // Catch: java.lang.Throwable -> Lc1
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r2 = com.beizi.fusion.g.at.b(r2, r1, r4)     // Catch: java.lang.Throwable -> Lc1
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> Lc1
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r4 = "SM_STATUS_EXPIRE_TIME"
            r5 = 3
            r6 = 1
            if (r2 != r6) goto L42
            android.content.Context r2 = r10.f6681f     // Catch: java.lang.Throwable -> Lc1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Lc1
            com.beizi.fusion.g.at.a(r2, r1, r7)     // Catch: java.lang.Throwable -> Lc1
            android.content.Context r2 = r10.f6681f     // Catch: java.lang.Throwable -> Lc1
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lc1
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> Lc1
            com.beizi.fusion.g.at.a(r2, r4, r7)     // Catch: java.lang.Throwable -> Lc1
            r2 = 3
        L42:
            r7 = 2
            if (r2 == 0) goto L4a
            if (r2 != r7) goto L48
            goto L4a
        L48:
            r6 = r2
            goto L53
        L4a:
            android.content.Context r2 = r10.f6681f     // Catch: java.lang.Throwable -> Lc1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Lc1
            com.beizi.fusion.g.at.a(r2, r1, r8)     // Catch: java.lang.Throwable -> Lc1
        L53:
            if (r6 != r5) goto L9e
            android.content.Context r2 = r10.f6681f     // Catch: java.lang.Throwable -> Lc1
            long r5 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> Lc1
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r2 = com.beizi.fusion.g.at.b(r2, r4, r5)     // Catch: java.lang.Throwable -> Lc1
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> Lc1
            long r5 = r2.longValue()     // Catch: java.lang.Throwable -> Lc1
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L9d
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lc1
            long r7 = r2.longValue()     // Catch: java.lang.Throwable -> Lc1
            long r5 = r5 - r7
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> Lc1
            long r5 = r2.longValue()     // Catch: java.lang.Throwable -> Lc1
            r7 = 864000000(0x337f9800, double:4.26872718E-315)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L9d
            android.content.Context r2 = r10.f6681f     // Catch: java.lang.Throwable -> Lc1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lc1
            com.beizi.fusion.g.at.a(r2, r1, r3)     // Catch: java.lang.Throwable -> Lc1
            android.content.Context r1 = r10.f6681f     // Catch: java.lang.Throwable -> Lc1
            long r2 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> Lc1
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> Lc1
            com.beizi.fusion.g.at.a(r1, r4, r0)     // Catch: java.lang.Throwable -> Lc1
        L9d:
            return
        L9e:
            android.content.Context r0 = r10.f6681f     // Catch: java.lang.Throwable -> Lc1
            android.app.Application r0 = (android.app.Application) r0     // Catch: java.lang.Throwable -> Lc1
            com.beizi.fusion.sm.a.b.a(r0)     // Catch: java.lang.Throwable -> Lc1
            android.content.Context r0 = r10.f6681f     // Catch: java.lang.Throwable -> Lc1
            boolean r0 = com.beizi.fusion.sm.a.a.a(r0)     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto Lb7
            android.content.Context r0 = r10.f6681f     // Catch: java.lang.Throwable -> Lc1
            com.beizi.fusion.d.b$3 r2 = new com.beizi.fusion.d.b$3     // Catch: java.lang.Throwable -> Lc1
            r2.<init>()     // Catch: java.lang.Throwable -> Lc1
            com.beizi.fusion.sm.a.a.a(r0, r2)     // Catch: java.lang.Throwable -> Lc1
        Lb7:
            android.content.Context r0 = r10.f6681f     // Catch: java.lang.Throwable -> Lc1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Lc1
            com.beizi.fusion.g.at.a(r0, r1, r2)     // Catch: java.lang.Throwable -> Lc1
            goto Lc5
        Lc1:
            r0 = move-exception
            r0.printStackTrace()
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beizi.fusion.d.b.j():void");
    }

    public String c() {
        return f6679j;
    }

    public String d() {
        return f6680k;
    }

    public Context e() {
        return this.f6681f;
    }

    public com.beizi.fusion.b.d f() {
        return this.f6684i;
    }

    public static b a() {
        if (f6677d == null) {
            synchronized (b.class) {
                if (f6677d == null) {
                    f6677d = new b();
                }
            }
        }
        return f6677d;
    }

    public String b() {
        return f6674a;
    }

    public b a(String str) {
        f6678e = str;
        return f6677d;
    }

    public void a(Context context, String str, String str2, String str3) {
        synchronized (b.class) {
            StringBuilder sb = new StringBuilder();
            sb.append("init start applicationCode：");
            sb.append(str);
            if (context != null) {
                if (!this.f6682g) {
                    String a5 = au.a();
                    f6675b = a5;
                    com.beizi.fusion.b.b bVar = new com.beizi.fusion.b.b(a5, "", "", "", str, "", "", String.valueOf(System.currentTimeMillis()), "");
                    this.f6684i = new com.beizi.fusion.b.d(bVar);
                    this.f6681f = context.getApplicationContext();
                    f6674a = str;
                    f6679j = str2;
                    f6680k = str3;
                    com.beizi.fusion.b.d dVar = this.f6684i;
                    dVar.f6575a.addObserver(dVar);
                    this.f6684i.a().a(bVar);
                    AppEventId.getInstance(this.f6681f).setAppStart();
                    AppEventId.getInstance(this.f6681f).setAppSdkInit();
                    if (this.f6684i.f6575a.a() == 0) {
                        if (BeiZis.isIsSyncInit()) {
                            h();
                        } else {
                            com.beizi.fusion.g.h.b().c().execute(new Runnable() { // from class: com.beizi.fusion.d.b.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    b.this.h();
                                }
                            });
                        }
                        this.f6682g = true;
                    }
                }
            } else {
                throw new IllegalArgumentException("Context cannot be null.");
            }
        }
    }
}
