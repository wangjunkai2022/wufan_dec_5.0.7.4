package com.tencent.bugly.proguard;

import android.content.Context;
import java.util.Map;
import java.util.UUID;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private int f62710a;

    /* renamed from: b  reason: collision with root package name */
    private int f62711b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f62712c;

    /* renamed from: d  reason: collision with root package name */
    private final int f62713d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f62714e;

    /* renamed from: f  reason: collision with root package name */
    private final com.tencent.bugly.crashreport.common.info.a f62715f;

    /* renamed from: g  reason: collision with root package name */
    private final com.tencent.bugly.crashreport.common.strategy.a f62716g;

    /* renamed from: h  reason: collision with root package name */
    private final s f62717h;

    /* renamed from: i  reason: collision with root package name */
    private final u f62718i;

    /* renamed from: j  reason: collision with root package name */
    private final int f62719j;

    /* renamed from: k  reason: collision with root package name */
    private final t f62720k;

    /* renamed from: l  reason: collision with root package name */
    private final t f62721l;

    /* renamed from: m  reason: collision with root package name */
    private String f62722m;

    /* renamed from: n  reason: collision with root package name */
    private final String f62723n;

    /* renamed from: o  reason: collision with root package name */
    private final Map<String, String> f62724o;

    /* renamed from: p  reason: collision with root package name */
    private int f62725p;

    /* renamed from: q  reason: collision with root package name */
    private long f62726q;

    /* renamed from: r  reason: collision with root package name */
    private long f62727r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f62728s;

    public v(Context context, int i4, int i5, byte[] bArr, String str, String str2, t tVar, boolean z4, boolean z5) {
        this(context, i4, i5, bArr, str, str2, tVar, 2, 30000, z5, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.tencent.bugly.proguard.an r4, boolean r5, int r6, java.lang.String r7) {
        /*
            r3 = this;
            int r4 = r3.f62713d
            r0 = 630(0x276, float:8.83E-43)
            if (r4 == r0) goto L1a
            r0 = 640(0x280, float:8.97E-43)
            if (r4 == r0) goto L17
            r0 = 830(0x33e, float:1.163E-42)
            if (r4 == r0) goto L1a
            r0 = 840(0x348, float:1.177E-42)
            if (r4 == r0) goto L17
            java.lang.String r4 = java.lang.String.valueOf(r4)
            goto L1c
        L17:
            java.lang.String r4 = "userinfo"
            goto L1c
        L1a:
            java.lang.String r4 = "crash"
        L1c:
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L2a
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r6[r1] = r4
            java.lang.String r4 = "[Upload] Success: %s"
            com.tencent.bugly.proguard.x.a(r4, r6)
            goto L3d
        L2a:
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2[r1] = r6
            r2[r0] = r4
            r4 = 2
            r2[r4] = r7
            java.lang.String r4 = "[Upload] Failed to upload(%d) %s: %s"
            com.tencent.bugly.proguard.x.e(r4, r2)
        L3d:
            long r6 = r3.f62726q
            long r0 = r3.f62727r
            long r6 = r6 + r0
            r0 = 0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 <= 0) goto L5d
            com.tencent.bugly.proguard.u r4 = r3.f62718i
            boolean r6 = r3.f62728s
            long r6 = r4.a(r6)
            long r0 = r3.f62726q
            long r6 = r6 + r0
            long r0 = r3.f62727r
            long r6 = r6 + r0
            com.tencent.bugly.proguard.u r4 = r3.f62718i
            boolean r0 = r3.f62728s
            r4.a(r6, r0)
        L5d:
            com.tencent.bugly.proguard.t r4 = r3.f62720k
            if (r4 == 0) goto L64
            r4.a(r5)
        L64:
            com.tencent.bugly.proguard.t r4 = r3.f62721l
            if (r4 == 0) goto L6b
            r4.a(r5)
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.v.a(com.tencent.bugly.proguard.an, boolean, int, java.lang.String):void");
    }

    public final void b(long j4) {
        this.f62727r += j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0218 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b2 A[Catch: all -> 0x0321, TryCatch #0 {all -> 0x0321, blocks: (B:3:0x0007, B:5:0x001a, B:8:0x0022, B:11:0x0027, B:13:0x003b, B:15:0x003f, B:17:0x0043, B:20:0x0049, B:22:0x004f, B:24:0x0055, B:26:0x0082, B:27:0x0085, B:29:0x00b4, B:31:0x00ba, B:32:0x00ce, B:35:0x00d6, B:37:0x00ed, B:38:0x00fa, B:41:0x013d, B:43:0x0150, B:46:0x0158, B:49:0x015f, B:52:0x0167, B:64:0x01b2, B:66:0x01de, B:67:0x01e6, B:69:0x01ec, B:70:0x020d, B:75:0x0247, B:77:0x025a, B:79:0x026b, B:80:0x0273, B:82:0x0279, B:83:0x0294, B:85:0x029b, B:88:0x02a3, B:90:0x02a9, B:92:0x02b0, B:96:0x02c4, B:98:0x02d7, B:100:0x02de, B:95:0x02c3, B:103:0x02e6, B:54:0x0171, B:56:0x0177, B:57:0x017f, B:59:0x018d, B:60:0x0199, B:61:0x01a6, B:105:0x030c, B:107:0x0313, B:109:0x031a), top: B:117:0x0007 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.v.run():void");
    }

    public v(Context context, int i4, int i5, byte[] bArr, String str, String str2, t tVar, int i6, int i7, boolean z4, Map<String, String> map) {
        this.f62710a = 2;
        this.f62711b = 30000;
        this.f62722m = null;
        this.f62725p = 0;
        this.f62726q = 0L;
        this.f62727r = 0L;
        this.f62728s = false;
        this.f62712c = context;
        this.f62715f = com.tencent.bugly.crashreport.common.info.a.a(context);
        this.f62714e = bArr;
        this.f62716g = com.tencent.bugly.crashreport.common.strategy.a.a();
        this.f62717h = s.a(context);
        this.f62718i = u.a();
        this.f62719j = i4;
        this.f62722m = str;
        this.f62723n = str2;
        this.f62720k = tVar;
        this.f62721l = null;
        this.f62713d = i5;
        if (i6 > 0) {
            this.f62710a = i6;
        }
        if (i7 > 0) {
            this.f62711b = i7;
        }
        this.f62728s = z4;
        this.f62724o = map;
    }

    private static boolean a(an anVar, com.tencent.bugly.crashreport.common.info.a aVar, com.tencent.bugly.crashreport.common.strategy.a aVar2) {
        if (anVar == null) {
            x.d("resp == null!", new Object[0]);
            return false;
        }
        byte b5 = anVar.f62574a;
        if (b5 != 0) {
            x.e("resp result error %d", Byte.valueOf(b5));
            return false;
        }
        try {
            if (!z.a(anVar.f62578e) && !com.tencent.bugly.crashreport.common.info.a.b().j().equals(anVar.f62578e)) {
                p.a().a(com.tencent.bugly.crashreport.common.strategy.a.f62301a, com.alipay.sdk.packet.d.f4907p, anVar.f62578e.getBytes("UTF-8"), (o) null, true);
                aVar.f(anVar.f62578e);
            }
        } catch (Throwable th) {
            x.a(th);
        }
        aVar.f62258i = anVar.f62577d;
        int i4 = anVar.f62575b;
        if (i4 == 510) {
            byte[] bArr = anVar.f62576c;
            if (bArr == null) {
                x.e("[Upload] Strategy data is null. Response cmd: %d", Integer.valueOf(i4));
                return false;
            }
            ap apVar = (ap) a.a(bArr, ap.class);
            if (apVar == null) {
                x.e("[Upload] Failed to decode strategy from server. Response cmd: %d", Integer.valueOf(anVar.f62575b));
                return false;
            }
            aVar2.a(apVar);
        }
        return true;
    }

    public final void a(long j4) {
        this.f62725p++;
        this.f62726q += j4;
    }

    private static String a(String str) {
        if (z.a(str)) {
            return str;
        }
        try {
            return String.format("%s?aid=%s", str, UUID.randomUUID().toString());
        } catch (Throwable th) {
            x.a(th);
            return str;
        }
    }
}
