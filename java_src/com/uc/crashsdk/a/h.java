package com.uc.crashsdk.a;

import android.os.Build;
import android.os.Process;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.material.timepicker.TimeModel;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.join.mgps.activity.ForumPostsTagSelectActivity_;
import com.tencent.stat.DeviceInfo;
import com.uc.crashsdk.JNIBridge;
import com.umeng.analytics.pro.aw;
import com.umeng.analytics.pro.bm;
import io.netty.handler.codec.rtsp.RtspHeaders;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.ByteCompanionObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f63097a = true;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f63098b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, String> f63099c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private static int f63100d = 0;

    /* renamed from: e  reason: collision with root package name */
    private static final Map<String, a> f63101e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private static final Object f63102f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static final Object f63103g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private static final SparseArray<String> f63104h = new SparseArray<>();

    /* renamed from: i  reason: collision with root package name */
    private static boolean f63105i = false;

    /* renamed from: j  reason: collision with root package name */
    private static boolean f63106j = false;

    /* renamed from: k  reason: collision with root package name */
    private static final Object f63107k = new Object();

    /* renamed from: l  reason: collision with root package name */
    private static String f63108l = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        long f63109a = 0;

        /* renamed from: b  reason: collision with root package name */
        int f63110b = 0;

        /* renamed from: c  reason: collision with root package name */
        Map<String, String> f63111c = new HashMap();

        /* renamed from: d  reason: collision with root package name */
        private String f63112d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f63113e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f63114f;

        a(String str, boolean z4, boolean z5) {
            this.f63113e = false;
            this.f63114f = false;
            this.f63112d = str;
            this.f63113e = z4;
            this.f63114f = z5;
        }

        private long d(String str) {
            return g.c(a(str));
        }

        final void a(String str, String str2) {
            this.f63111c.put(str, str2);
        }

        final String b(String str) {
            String a5 = a(str);
            return a5 == null ? "" : a5;
        }

        final boolean c(String str) {
            if (g.a(str)) {
                return false;
            }
            String str2 = null;
            long j4 = 0;
            HashMap hashMap = new HashMap();
            Map c5 = h.c(str);
            int i4 = 0;
            for (String str3 : c5.keySet()) {
                String str4 = (String) c5.get(str3);
                if (str3.equals("lt")) {
                    str2 = str4;
                } else if (this.f63113e && str3.equals("up")) {
                    j4 = g.c(str4);
                } else if (this.f63113e && str3.equals(ForumPostsTagSelectActivity_.f30896z)) {
                    i4 = (int) g.c(str4);
                } else {
                    hashMap.put(str3, str4);
                }
            }
            String str5 = this.f63112d;
            if (str5 == null || str5.equals(str2)) {
                this.f63109a = j4;
                this.f63110b = i4;
                this.f63112d = str2;
                this.f63111c = hashMap;
                return true;
            }
            return false;
        }

        final void a(String str, long j4) {
            long d5 = d(str) + j4;
            if (d5 <= 100) {
                j4 = d5 < 0 ? 0L : d5;
            }
            a(str, String.valueOf(j4));
        }

        final boolean a(a aVar) {
            if (!this.f63114f) {
                com.uc.crashsdk.a.a.a("crashsdk", String.format(Locale.US, "WaItem '%s' is not mergable!", this.f63112d), null);
                return false;
            }
            for (String str : aVar.f63111c.keySet()) {
                if (str.startsWith("c_")) {
                    a(str, aVar.a(str));
                } else {
                    long d5 = aVar.d(str);
                    if (d5 == 0) {
                        a(str, aVar.a(str));
                    } else if (d5 < 100) {
                        a(str, d5);
                    }
                }
            }
            return true;
        }

        final String a(String str) {
            return this.f63111c.get(str);
        }

        final String a(boolean z4, boolean z5, boolean z6) {
            if (this.f63112d == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            if (z4) {
                h.b(sb, "lt", "uc");
                h.b(sb, "pre", com.uc.crashsdk.g.e());
                h.b(sb, "pkg", com.uc.crashsdk.a.f63035a);
                h.b(sb, "rom", Build.VERSION.RELEASE);
                h.b(sb, "brd", Build.BRAND);
                h.b(sb, "model", Build.MODEL);
                h.a(sb, com.umeng.ccg.a.f64025r, Build.VERSION.SDK_INT);
                h.b(sb, bm.f63462w, com.uc.crashsdk.e.e());
                h.b(sb, "hdw", com.uc.crashsdk.e.f());
                long l4 = h.l();
                h.a(sb, "ram", l4);
                h.b(sb, "aram", h.a(l4));
                h.b(sb, "cver", "3.3.2.2");
                h.b(sb, "cseq", "211215141717");
                h.b(sb, "ctag", "release");
                h.b(sb, "aver", com.uc.crashsdk.a.a());
                h.b(sb, DeviceInfo.TAG_VERSION, com.uc.crashsdk.g.T());
                h.b(sb, "sver", com.uc.crashsdk.g.U());
                h.b(sb, RtspHeaders.Values.SEQ, com.uc.crashsdk.g.V());
                h.b(sb, "grd", com.uc.crashsdk.b.A() ? "fg" : "bg");
                h.b(sb, bm.f63463x, q.a.f73126a);
                h.b(sb, "dn", com.uc.crashsdk.e.q());
                String ab = com.uc.crashsdk.g.ab();
                if (TextUtils.isEmpty(ab)) {
                    ab = com.uc.crashsdk.e.q();
                }
                h.b(sb, "k_uid", ab);
                String ac = com.uc.crashsdk.g.ac();
                if (!TextUtils.isEmpty(ac)) {
                    h.b(sb, "k_channel", ac);
                }
                sb.append("\n");
            }
            h.b(sb, "lt", this.f63112d);
            h.a(sb, this.f63111c);
            if (this.f63113e && !z5) {
                long j4 = this.f63109a;
                if (j4 != 0) {
                    h.b(sb, "up", String.valueOf(j4));
                }
                if (z6) {
                    h.b(sb, ForumPostsTagSelectActivity_.f30896z, String.format(Locale.US, TimeModel.NUMBER_FORMAT, Integer.valueOf(Process.myPid())));
                } else {
                    int i4 = this.f63110b;
                    if (i4 != 0) {
                        h.b(sb, ForumPostsTagSelectActivity_.f30896z, String.format(Locale.US, TimeModel.NUMBER_FORMAT, Integer.valueOf(i4)));
                    }
                }
            }
            sb.append("\n");
            return sb.toString();
        }
    }

    static /* synthetic */ String a(long j4) {
        return j4 < PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED ? "512M" : String.format(Locale.US, "%dG", Long.valueOf(((j4 / 1024) + 512) / 1024));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(SimpleComparison.EQUAL_TO_OPERATION);
        sb.append(str2);
        sb.append("`");
    }

    static /* synthetic */ Map c(String str) {
        String[] split;
        HashMap hashMap = new HashMap();
        for (String str2 : str.split("`")) {
            if (str2.length() > 1) {
                String[] split2 = str2.split(SimpleComparison.EQUAL_TO_OPERATION, 3);
                if (split2.length == 2) {
                    hashMap.put(split2[0], split2[1]);
                }
            }
        }
        return hashMap;
    }

    public static void d() {
        b(2, 2000L);
        a(1, 70000L);
    }

    public static boolean e() {
        return f63106j;
    }

    public static void f() {
        b(1, 2000L);
    }

    public static void g() {
        b(3, 0L);
    }

    public static void h() {
        b(4, 0L);
    }

    public static void i() {
        if (com.uc.crashsdk.g.Q()) {
            f.a(1, new e(303));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] j() {
        return new byte[]{ByteCompanionObject.MAX_VALUE, 100, 110, 31};
    }

    public static void k() {
        synchronized (f63107k) {
            f63108l = null;
        }
    }

    static /* synthetic */ long l() {
        return o();
    }

    private static String m() {
        return com.uc.crashsdk.g.W() + "pv.wa";
    }

    private static String n() {
        return com.uc.crashsdk.g.W() + "cdt.wa";
    }

    private static long o() {
        Iterator<String> it2 = g.a(new File("/proc/meminfo"), 2).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            String next = it2.next();
            if (next.contains("MemTotal:")) {
                try {
                    return Long.parseLong(next.replaceAll("\\D+", ""));
                } catch (NumberFormatException e5) {
                    g.a(e5);
                }
            }
        }
        return 0L;
    }

    static /* synthetic */ void a(StringBuilder sb, String str, long j4) {
        b(sb, str, String.valueOf(j4));
    }

    public static void b() {
        a(2, 0L);
    }

    public static void c() {
        a(3, 0L);
    }

    private static void b(int i4, long j4) {
        if (com.uc.crashsdk.g.Q()) {
            f.a(1, new e(301, new Object[]{Integer.valueOf(i4)}), j4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean c(java.lang.String r9, java.lang.String r10) {
        /*
            boolean r0 = com.uc.crashsdk.a.g.a(r10)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            byte[] r10 = r10.getBytes()
            r0 = 16
            r2 = 8
            r3 = 0
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L3b
            byte[] r4 = com.uc.crashsdk.a.c.a()     // Catch: java.lang.Throwable -> L3b
            com.uc.crashsdk.a.c.a(r0, r3, r4)     // Catch: java.lang.Throwable -> L3b
            r4 = 4
            byte[] r5 = j()     // Catch: java.lang.Throwable -> L3b
            com.uc.crashsdk.a.c.a(r0, r4, r5)     // Catch: java.lang.Throwable -> L3b
            byte[] r4 = com.uc.crashsdk.a.f()     // Catch: java.lang.Throwable -> L3b
            com.uc.crashsdk.a.c.a(r0, r2, r4)     // Catch: java.lang.Throwable -> L3b
            r4 = 12
            byte[] r5 = com.uc.crashsdk.a.d.d()     // Catch: java.lang.Throwable -> L3b
            com.uc.crashsdk.a.c.a(r0, r4, r5)     // Catch: java.lang.Throwable -> L3b
            byte[] r0 = com.uc.crashsdk.a.c.a(r10, r0)     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L3f
            r10 = r0
            r0 = 1
            goto L40
        L3b:
            r0 = move-exception
            com.uc.crashsdk.a.g.a(r0)
        L3f:
            r0 = 0
        L40:
            if (r9 != 0) goto L44
            java.lang.String r9 = "unknown"
        L44:
            boolean r4 = com.uc.crashsdk.g.R()
            if (r4 == 0) goto L4d
            java.lang.String r4 = "4ea4e41a3993"
            goto L4f
        L4d:
            java.lang.String r4 = "28ef1713347d"
        L4f:
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r9)
            r6.append(r5)
            java.lang.String r7 = "AppChk#2014"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = com.uc.crashsdk.a.g.d(r6)
            if (r6 != 0) goto L76
            r9 = 0
            goto Lba
        L76:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = com.uc.crashsdk.g.z()
            r7.append(r8)
            java.lang.String r8 = "?chk="
            r7.append(r8)
            int r8 = r6.length()
            int r8 = r8 - r2
            int r2 = r6.length()
            java.lang.String r2 = r6.substring(r8, r2)
            r7.append(r2)
            java.lang.String r2 = "&vno="
            r7.append(r2)
            r7.append(r5)
            java.lang.String r2 = "&uuid="
            r7.append(r2)
            r7.append(r9)
            java.lang.String r9 = "&app="
            r7.append(r9)
            r7.append(r4)
            if (r0 == 0) goto Lb6
            java.lang.String r9 = "&enc=aes"
            r7.append(r9)
        Lb6:
            java.lang.String r9 = r7.toString()
        Lba:
            if (r9 != 0) goto Lbd
            return r3
        Lbd:
            byte[] r9 = com.uc.crashsdk.a.c.a(r9, r10)
            if (r9 != 0) goto Lc4
            return r3
        Lc4:
            java.lang.String r10 = new java.lang.String
            r10.<init>(r9)
            java.lang.String r9 = "retcode=0"
            boolean r9 = r10.contains(r9)
            if (r9 == 0) goto Ld2
            return r1
        Ld2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.h.c(java.lang.String, java.lang.String):boolean");
    }

    private static boolean d(String str) {
        boolean c5;
        File file = new File(str);
        Iterator<a> it2 = a(file, "cst", 30).iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            String a5 = next.a("prc");
            if (!g.a(a5)) {
                Map<String, a> map = f63101e;
                a aVar = map.get(a5);
                if (aVar != null) {
                    aVar.a(next);
                } else {
                    map.put(a5, next);
                }
            }
        }
        Map<String, a> map2 = f63101e;
        StringBuilder a6 = a((Iterable<a>) map2.values(), true, false);
        if (com.uc.crashsdk.g.aa()) {
            c5 = b(com.uc.crashsdk.e.q(), a6.toString());
        } else {
            c5 = c(com.uc.crashsdk.e.q(), a6.toString());
        }
        g.b(file);
        if (c5 || g.a(file, a((Iterable<a>) map2.values(), false, true).toString())) {
            map2.clear();
        }
        return true;
    }

    static /* synthetic */ void a(StringBuilder sb, Map map) {
        for (String str : map.keySet()) {
            b(sb, str, (String) map.get(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str) {
        synchronized (f63098b) {
            File file = new File(m());
            a aVar = new a(com.umeng.analytics.pro.f.T, true, true);
            String c5 = g.c(file);
            if (!g.a(c5)) {
                aVar.c(c5);
            }
            aVar.a(str, 1L);
            aVar.a("aujv", 1L);
            g.a(file, aVar.a(false, false, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(int i4, Object[] objArr) {
        switch (i4) {
            case 351:
                if (f63097a || objArr != null) {
                    String str = (String) objArr[0];
                    int intValue = ((Integer) objArr[1]).intValue();
                    if (intValue == 1) {
                        if (f63106j) {
                            return false;
                        }
                        f63106j = true;
                    }
                    if (com.uc.crashsdk.g.Z()) {
                        File file = new File(str);
                        ArrayList<a> a5 = a(file, "crp", 100);
                        if (intValue != 4) {
                            a aVar = new a("crp", false, false);
                            if (intValue == 1) {
                                aVar.a("et", String.valueOf(com.uc.crashsdk.b.I()));
                                aVar.a("ete", String.valueOf(com.uc.crashsdk.b.J()));
                            } else if (intValue == 3) {
                                aVar.a("et", "1");
                                aVar.a("ete", "1");
                            } else if (intValue == 2) {
                                aVar.a("hpv", "1");
                            }
                            aVar.a("prc", com.uc.crashsdk.e.h());
                            aVar.a(aw.f63372c, com.uc.crashsdk.b.F() ? "1" : "0");
                            a(aVar);
                            a5.add(0, aVar);
                        }
                        if (!a5.isEmpty()) {
                            boolean c5 = c(com.uc.crashsdk.e.q(), a((Iterable<a>) a5, true, false).toString());
                            g.b(file);
                            if (!c5) {
                                g.a(file, a((Iterable<a>) a5, false, true).toString());
                            }
                        }
                        return true;
                    }
                    return false;
                }
                throw new AssertionError();
            case 352:
                if (f63097a || objArr != null) {
                    return d((String) objArr[0]);
                }
                throw new AssertionError();
            case 353:
                if (f63097a || objArr != null) {
                    return b((String) objArr[0], (String) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue());
                }
                throw new AssertionError();
            case 354:
                if (f63097a || objArr != null) {
                    File file2 = new File((String) objArr[0]);
                    boolean c6 = c(com.uc.crashsdk.e.q(), a((Iterable<a>) a(file2, "cst", 30), true, false).toString());
                    if (c6) {
                        g.b(file2);
                    }
                    return c6;
                }
                throw new AssertionError();
            default:
                return false;
        }
    }

    public static void a() {
        a(0, com.uc.crashsdk.b.H() ? 700000L : 70000L);
    }

    private static void a(int i4, long j4) {
        if (com.uc.crashsdk.b.F()) {
            f.a(0, new e(302, new Object[]{Integer.valueOf(i4)}), j4);
        }
    }

    public static boolean a(String str, String str2) {
        try {
            String str3 = "c_" + str.replaceAll("[^0-9a-zA-Z-_]", "-");
            String replaceAll = g.a(str2) ? "" : str2.replaceAll("[`=]", "-");
            Map<String, String> map = f63099c;
            synchronized (map) {
                if (map.get(str3) == null) {
                    int i4 = f63100d;
                    if (i4 >= 20) {
                        return false;
                    }
                    f63100d = i4 + 1;
                }
                map.put(str3, replaceAll);
                return true;
            }
        } catch (Throwable th) {
            g.a(th);
            return false;
        }
    }

    public static void b(boolean z4) {
        if (a(z4, "crash detail upload")) {
            return;
        }
        String str = com.uc.crashsdk.g.W() + "dt.wa";
        com.uc.crashsdk.b.a(f63102f, str, new e(352, new Object[]{str}));
        String n4 = n();
        com.uc.crashsdk.b.a(f63103g, n4, new e(354, new Object[]{n4}));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean b(java.lang.String r8, java.lang.String r9) {
        /*
            boolean r0 = com.uc.crashsdk.a.g.a(r9)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            byte[] r9 = r9.getBytes()
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = com.uc.crashsdk.g.e()
            r0.append(r4)
            r0.append(r8)
            r0.append(r2)
            java.lang.String r4 = "AppChk#2014"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = com.uc.crashsdk.a.g.d(r0)
            r4 = 0
            int r5 = r0.length()     // Catch: java.lang.Throwable -> L4b
            int r5 = r5 + (-16)
            int r6 = r0.length()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r5 = r0.substring(r5, r6)     // Catch: java.lang.Throwable -> L4b
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Throwable -> L4b
            byte[] r5 = com.uc.crashsdk.a.c.a(r9, r5)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L4f
            r9 = r5
            r5 = 1
            goto L50
        L4b:
            r5 = move-exception
            com.uc.crashsdk.a.g.a(r5)
        L4f:
            r5 = 0
        L50:
            int r6 = r0.length()
            int r6 = r6 + (-8)
            int r7 = r0.length()
            java.lang.String r0 = r0.substring(r6, r7)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = com.uc.crashsdk.g.z()
            r6.append(r7)
            java.lang.String r7 = "/api/v1/crashtrack/upload?chk="
            r6.append(r7)
            r6.append(r0)
            java.lang.String r0 = "&vno="
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = "&uuid="
            r6.append(r0)
            r6.append(r8)
            java.lang.String r8 = "&app="
            r6.append(r8)
            java.lang.String r8 = com.uc.crashsdk.g.e()
            r6.append(r8)
            if (r5 == 0) goto L95
            java.lang.String r8 = "&enc=aes"
            r6.append(r8)
        L95:
            java.lang.String r8 = r6.toString()
            if (r8 != 0) goto L9c
            return r4
        L9c:
            byte[] r8 = com.uc.crashsdk.a.c.a(r8, r9)
            if (r8 != 0) goto La3
            return r4
        La3:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r8)
            java.lang.String r8 = "retcode=0"
            boolean r8 = r9.contains(r8)
            if (r8 == 0) goto Lb1
            return r1
        Lb1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.h.b(java.lang.String, java.lang.String):boolean");
    }

    private static void a(a aVar) {
        Map<String, String> map = f63099c;
        synchronized (map) {
            for (String str : map.keySet()) {
                aVar.a(str, f63099c.get(str));
            }
        }
    }

    public static void a(boolean z4) {
        a(1, z4);
    }

    public static boolean a(boolean z4, String str) {
        if (com.uc.crashsdk.b.f63118d && !z4 && JNIBridge.nativeIsCrashing()) {
            com.uc.crashsdk.a.a.b("crashsdk", "Native is crashing, skip stat for " + str);
            return true;
        }
        return false;
    }

    private static boolean b(String str, String str2, boolean z4, boolean z5) {
        a aVar;
        File file = new File(n());
        ArrayList<a> a5 = a(file, "cst", 30);
        String str3 = str + str2;
        Iterator<a> it2 = a5.iterator();
        while (true) {
            if (!it2.hasNext()) {
                aVar = null;
                break;
            }
            aVar = it2.next();
            if (str3.equals(aVar.b("prc") + aVar.b("typ"))) {
                break;
            }
        }
        if (aVar == null) {
            aVar = new a("cst", false, true);
            aVar.a("prc", str);
            aVar.a("typ", str2);
            a(aVar);
            a5.add(aVar);
        }
        aVar.a("cnt", 1L);
        if (z4) {
            aVar.a("lim", 1L);
        }
        if (z5) {
            aVar.a("syu", 1L);
        }
        return g.a(file, a((Iterable<a>) a5, false, false).toString());
    }

    private static void a(int i4, boolean z4) {
        if (a(z4, "crash rate")) {
            return;
        }
        String str = com.uc.crashsdk.g.W() + "cr.wa";
        com.uc.crashsdk.b.a(f63098b, str, new e(351, new Object[]{str, Integer.valueOf(i4)}));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
        if (r3 == false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af A[Catch: all -> 0x00cb, TryCatch #0 {, blocks: (B:17:0x001d, B:19:0x0028, B:21:0x002c, B:53:0x00c9, B:22:0x002e, B:24:0x0038, B:26:0x0040, B:28:0x005a, B:30:0x005f, B:37:0x0070, B:38:0x0077, B:44:0x008b, B:46:0x0097, B:51:0x00af, B:52:0x00c2, B:49:0x00a5, B:43:0x0083), top: B:69:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(int r9, java.lang.Object[] r10) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.h.a(int, java.lang.Object[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(String str) {
        synchronized (f63107k) {
            f63108l = str;
            String k4 = com.uc.crashsdk.b.k();
            b.a(k4, str + "\n");
        }
    }

    private static StringBuilder a(Iterable<a> iterable, boolean z4, boolean z5) {
        StringBuilder sb = new StringBuilder();
        boolean z6 = true;
        for (a aVar : iterable) {
            if (z6) {
                sb.append(aVar.a(z4, z4, z5));
                z6 = false;
            } else {
                sb.append(aVar.a(false, z4, z5));
            }
        }
        return sb;
    }

    public static void a(String str, int i4, int i5) {
        if (com.uc.crashsdk.g.Q()) {
            synchronized (f63102f) {
                Map<String, a> map = f63101e;
                a aVar = map.get(str);
                if (aVar == null) {
                    aVar = new a("cst", false, true);
                    map.put(str, aVar);
                    a(aVar);
                }
                SparseArray<String> sparseArray = f63104h;
                synchronized (sparseArray) {
                    if (sparseArray.size() == 0) {
                        a(100, com.umeng.analytics.pro.f.T);
                        a(102, "hpv");
                        a(1, "all");
                        a(2, "afg");
                        a(101, "abg");
                        a(3, "jfg");
                        a(4, "jbg");
                        a(7, "nfg");
                        a(8, "nbg");
                        a(27, "nafg");
                        a(28, "nabg");
                        a(9, "nho");
                        a(10, "uar");
                        a(29, "ulm");
                        a(30, "ukt");
                        a(31, "uet");
                        a(32, "urs");
                        a(11, "ufg");
                        a(12, "ubg");
                        a(40, "anf");
                        a(41, "anb");
                        a(42, "ancf");
                        a(43, "ancb");
                        a(13, "lup");
                        a(14, "luf");
                        a(15, "lef");
                        a(200, "ltf");
                        a(16, "laf");
                        a(22, "lac");
                        a(23, "lau");
                        a(17, "llf");
                        a(18, "lul");
                        a(19, "lub");
                        a(20, "luc");
                        a(21, "luu");
                        a(24, "lzc");
                        a(201, "lec");
                        a(25, "lrc");
                        a(26, "lss");
                    }
                }
                String str2 = sparseArray.get(i4);
                if (str2 == null) {
                    com.uc.crashsdk.a.a.a("crashsdk", "map key is not set with: " + i4, null);
                }
                aVar.a("prc", str);
                if (str2 != null) {
                    aVar.a(str2, String.valueOf(i5));
                }
            }
        }
    }

    public static boolean a(String str, String str2, boolean z4, boolean z5) {
        if (com.uc.crashsdk.g.Q()) {
            return com.uc.crashsdk.b.a(f63103g, n(), new e(353, new Object[]{str, str2, Boolean.valueOf(z4), Boolean.valueOf(z5)}));
        }
        return false;
    }

    private static void a(int i4, String str) {
        f63104h.put(i4, str);
    }

    private static ArrayList<a> a(File file, String str, int i4) {
        ArrayList<String> a5 = g.a(file, i4);
        ArrayList<a> arrayList = new ArrayList<>();
        Iterator<String> it2 = a5.iterator();
        while (it2.hasNext()) {
            a aVar = new a(str, false, false);
            if (aVar.c(it2.next())) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }
}
