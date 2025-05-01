package com.mob.commons;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.network.NetCommunicator;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.FileLocker;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.ResHelper;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private boolean f56027a = false;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f56028b = new byte[0];

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        ab a5 = ab.a();
        String str = ab.f56122a;
        long b5 = a5.b(str, -1L);
        if (b5 != -1) {
            return System.currentTimeMillis() >= b5 + (((Long) com.mob.commons.b.a(m.a("005%babgchKbh"), 2592000L)).longValue() * 1000);
        }
        ab.a().a(str, System.currentTimeMillis());
        return false;
    }

    /* loaded from: classes5.dex */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private static final List<String> f56041a = Arrays.asList("4c5f81a0-4728-476f-a57f-b46fa44f07d3", "f6af99e2-2b64-4eb6-aba6-4d44fb935939", "00000000-0000-0000-0000-000000000000");

        /* renamed from: b  reason: collision with root package name */
        private List<String> f56042b;

        private b() {
        }

        private void c() {
            c e5;
            if (MobSDK.SDK_VERSION_CODE + 30 >= d()) {
                e5 = ab.a().i();
            } else {
                e5 = e();
            }
            if (e5 != null && e5.c() != null) {
                this.f56042b = e5.c();
            }
            if (this.f56042b == null) {
                this.f56042b = f56041a;
            }
        }

        private int d() {
            return Integer.parseInt(new SimpleDateFormat("yyyyMMdd").format(new Date()));
        }

        private c e() {
            try {
                NetworkHelper networkHelper = new NetworkHelper();
                NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
                networkTimeOut.connectionTimeout = 2000;
                networkTimeOut.readTimout = 5000;
                String httpPostNew = networkHelper.httpPostNew(i.a().a("dg") + "/getDuidBlacklist", null, null, networkTimeOut);
                HashMap fromJson = HashonHelper.fromJson(httpPostNew);
                if (fromJson != null && !fromJson.isEmpty()) {
                    if ("200".equals(String.valueOf(fromJson.get(m.a("006.dgGgbg-bedg"))))) {
                        String valueOf = String.valueOf(fromJson.get(m.a("0041baObgb")));
                        if (!TextUtils.isEmpty(valueOf)) {
                            c a5 = c.a(Data.AES128Decode(f(), Base64.decode(valueOf, 0)));
                            ab.a().a(a5);
                            return a5;
                        }
                    } else {
                        throw new Throwable("RS is illegal: " + httpPostNew);
                    }
                }
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
            return null;
        }

        private String f() {
            String[] strArr = {"QvxJJ", "FYsAX", "cvWe", "MqlWJL"};
            return strArr[1] + strArr[3] + new String[]{"akuRE", "wbMqR", "uBs", "CDpnc"}[3];
        }

        public C0549a a() {
            c();
            return b();
        }

        public C0549a b() {
            boolean z4 = true;
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final String[] strArr = new String[1];
            DH.requester(MobSDK.getContext()).getAdvertisingID().request(new DH.DHResponder() { // from class: com.mob.commons.a.b.1
                @Override // com.mob.tools.utils.DH.DHResponder
                public void onResponse(DH.DHResponse dHResponse) throws Throwable {
                    try {
                        strArr[0] = dHResponse.getAdvertisingID();
                    } finally {
                        countDownLatch.countDown();
                    }
                }
            });
            try {
                countDownLatch.await(500L, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
            }
            try {
                String model = DH.SyncMtd.getModel();
                String trim = model == null ? null : model.trim();
                String h4 = y.a().h();
                if (TextUtils.isEmpty(h4)) {
                    h4 = (TextUtils.isEmpty(strArr[0]) || this.f56042b.contains(strArr[0])) ? null : strArr[0];
                }
                if (TextUtils.isEmpty(h4)) {
                    h4 = a(SystemClock.elapsedRealtime());
                } else {
                    z4 = false;
                }
                String str = trim + ":" + h4 + ":" + ((Object) null) + ":" + ((Object) null);
                String byteToHex = !TextUtils.isEmpty(str) ? Data.byteToHex(Data.SHA1(str)) : null;
                if (z4) {
                    byteToHex = "s_" + byteToHex;
                }
                C0549a c0549a = new C0549a(byteToHex, System.currentTimeMillis(), "client", 0L, Base64.encodeToString(str.getBytes(), 2));
                ab.a().a(c0549a);
                return c0549a;
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return null;
            }
        }

        private String a(long j4) {
            String uuid = UUID.randomUUID().toString();
            return TextUtils.isEmpty(uuid) ? b(j4) : uuid;
        }

        private String b(long j4) {
            ByteArrayOutputStream byteArrayOutputStream;
            DataOutputStream dataOutputStream;
            String str = null;
            try {
                long nextLong = new SecureRandom().nextLong();
                long currentTimeMillis = j4 + System.currentTimeMillis();
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    try {
                        dataOutputStream.writeLong(nextLong);
                        dataOutputStream.writeLong(currentTimeMillis);
                        str = Data.byteToHex(byteArrayOutputStream.toByteArray());
                        v.a(dataOutputStream, byteArrayOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        try {
                            MobLog.getInstance().d(th);
                            v.a(dataOutputStream, byteArrayOutputStream);
                            return str;
                        } catch (Throwable th2) {
                            v.a(dataOutputStream, byteArrayOutputStream);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    dataOutputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
                dataOutputStream = null;
            }
            return str;
        }
    }

    private String c() {
        return m.a("0160dgbacfbjXaZbibdbdbi4cbh-bjdgbacf");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File d() {
        return ResHelper.getDataCacheFile(MobSDK.getContext(), m.f56414b, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, Object> e() {
        try {
            return a(DH.SyncMtd.getModel(), ResHelper.readFromFileNoCompress(d()));
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return new HashMap<>();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String b() {
        String str;
        Throwable th;
        try {
            str = a();
            try {
            } catch (Throwable th2) {
                th = th2;
                MobLog.getInstance().d(th);
                return str;
            }
        } catch (Throwable th3) {
            str = null;
            th = th3;
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals("null", str)) {
            C0549a a5 = new b().a();
            if (a5 != null) {
                str = a5.c();
            }
            return str;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private List<String> f56048a;

        /* renamed from: b  reason: collision with root package name */
        private List<String> f56049b;

        public c(List<String> list, List<String> list2) {
            this.f56048a = list;
            this.f56049b = list2;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002e A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:4:0x0007, B:6:0x0013, B:8:0x0017, B:13:0x0026, B:15:0x002e, B:17:0x0032, B:22:0x0041, B:18:0x0039, B:20:0x003d, B:9:0x001e, B:11:0x0022), top: B:27:0x0007 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.mob.commons.a.c a(java.lang.String r3) {
            /*
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                r1 = 0
                if (r0 != 0) goto L4f
                java.util.HashMap r3 = com.mob.tools.utils.HashonHelper.fromJson(r3)     // Catch: java.lang.Throwable -> L47
                java.lang.String r0 = "idfas"
                java.lang.Object r0 = r3.get(r0)     // Catch: java.lang.Throwable -> L47
                if (r0 == 0) goto L25
                boolean r2 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L47
                if (r2 == 0) goto L1e
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L47
                java.util.List r0 = b(r0)     // Catch: java.lang.Throwable -> L47
                goto L26
            L1e:
                boolean r2 = r0 instanceof java.util.List     // Catch: java.lang.Throwable -> L47
                if (r2 == 0) goto L25
                java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L47
                goto L26
            L25:
                r0 = r1
            L26:
                java.lang.String r2 = "oiid"
                java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L47
                if (r3 == 0) goto L40
                boolean r2 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L47
                if (r2 == 0) goto L39
                java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L47
                java.util.List r3 = b(r3)     // Catch: java.lang.Throwable -> L47
                goto L41
            L39:
                boolean r2 = r3 instanceof java.util.List     // Catch: java.lang.Throwable -> L47
                if (r2 == 0) goto L40
                java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L47
                goto L41
            L40:
                r3 = r1
            L41:
                com.mob.commons.a$c r2 = new com.mob.commons.a$c     // Catch: java.lang.Throwable -> L47
                r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L47
                return r2
            L47:
                r3 = move-exception
                com.mob.tools.log.NLog r0 = com.mob.tools.MobLog.getInstance()
                r0.d(r3)
            L4f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.a.c.a(java.lang.String):com.mob.commons.a$c");
        }

        public HashMap<String, Object> b() {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("idfas", this.f56048a);
            hashMap.put("oiid", this.f56049b);
            return hashMap;
        }

        public List<String> c() {
            return this.f56048a;
        }

        public List<String> d() {
            return this.f56049b;
        }

        private static List<String> b(String str) {
            String[] split;
            if (!TextUtils.isEmpty(str) && (split = str.split(",")) != null && split.length > 0) {
                return new ArrayList(Arrays.asList(split));
            }
            return new ArrayList();
        }

        public String a() {
            return HashonHelper.fromHashMap(b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String a() {
        C0549a j4 = ab.a().j();
        if (j4 == null || TextUtils.isEmpty(j4.c())) {
            return null;
        }
        return j4.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] b(String str, HashMap<String, Object> hashMap) {
        String fromHashMap = HashonHelper.fromHashMap(hashMap);
        try {
            return Data.AES128Encode(str, fromHashMap);
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return fromHashMap.getBytes();
        }
    }

    public void a(final MobProduct mobProduct, final com.mob.tools.utils.e<Void> eVar) {
        MobLog.getInstance().d("di init", new Object[0]);
        DH.RequestBuilder grammaticalGender = DH.requester(MobSDK.getContext()).getAdvertisingID().getCarrier().getMemoryInfo().getSizeInfo().cx().isRooted().getDeviceType().checkPad().getScreenSize().getDetailNetworkTypeForStatic().getODH().getOD().getAppLastUpdateTime().getMIUIVersion().getInnerAppLanguage().getGrammaticalGender();
        if (((Integer) com.mob.commons.b.a("ndi", 0)).intValue() == 1) {
            grammaticalGender.getLATime(m.a("028j7ba-bgbj*dgcadg>gd=bd!jebKdgDgLfi6fdbCba6dKbhbj!g-cg(g")).getLATime(m.a("035j@baQbgbj_dgcadg,gdGbd'j^deKbgafeKbgdgAg7bfdg:dgg,bg<cOchdgbjcgbdYe")).getLATime(m.a("028jVba@bgbjOdgcadgNgd6bdYje8bi%a6cfdg0dgg.bg(cSchdgbjbadd")).getLATime(m.a("005j+baYbgb")).getLATime(m.a("012jZba,bgbjDdgcadg*gdKbd")).getLATime(m.a("018j,ba>bgbj[dgcadgIgdMbdMj9bedgCd0bhdg")).getLATime(m.a("045jMba;bgbj'dgcadg8gd:bdHjWbedgMd3bhdg?j*dfOj(dg6dggGbg:cAchdgbfcdbgWcEchOd bh.hQbhbg2cgUbjcgbdPe"));
        }
        grammaticalGender.request(new DH.DHResponder() { // from class: com.mob.commons.a.1
            /* JADX WARN: Removed duplicated region for block: B:13:0x008c A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00ac, blocks: (B:3:0x0001, B:4:0x0007, B:5:0x0008, B:11:0x002e, B:13:0x008c, B:15:0x0092, B:16:0x0094, B:20:0x00a2, B:19:0x009d), top: B:29:0x0001 }] */
            @Override // com.mob.tools.utils.DH.DHResponder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onResponse(com.mob.tools.utils.DH.DHResponse r13) {
                /*
                    r12 = this;
                    r0 = 0
                    com.mob.commons.a r1 = com.mob.commons.a.this     // Catch: java.lang.Throwable -> Lac
                    byte[] r1 = com.mob.commons.a.a(r1)     // Catch: java.lang.Throwable -> Lac
                    monitor-enter(r1)     // Catch: java.lang.Throwable -> Lac
                    com.mob.commons.a r2 = com.mob.commons.a.this     // Catch: java.lang.Throwable -> La9
                    java.lang.String r3 = com.mob.commons.e.f56335a     // Catch: java.lang.Throwable -> La9
                    java.lang.String r2 = com.mob.commons.a.a(r2, r3, r13)     // Catch: java.lang.Throwable -> La9
                    com.mob.commons.a r3 = com.mob.commons.a.this     // Catch: java.lang.Throwable -> La9
                    java.util.HashMap r3 = com.mob.commons.a.b(r3)     // Catch: java.lang.Throwable -> La9
                    com.mob.commons.a r4 = com.mob.commons.a.this     // Catch: java.lang.Throwable -> La9
                    boolean r4 = com.mob.commons.a.a(r4, r3, r13)     // Catch: java.lang.Throwable -> La9
                    com.mob.commons.a r5 = com.mob.commons.a.this     // Catch: java.lang.Throwable -> La9
                    boolean r5 = com.mob.commons.a.c(r5)     // Catch: java.lang.Throwable -> La9
                    com.mob.commons.a r6 = com.mob.commons.a.this     // Catch: java.lang.Throwable -> La9
                    r7 = 0
                    r8 = 1
                    if (r4 != 0) goto L2d
                    if (r5 == 0) goto L2b
                    goto L2d
                L2b:
                    r9 = 0
                    goto L2e
                L2d:
                    r9 = 1
                L2e:
                    com.mob.commons.a.a(r6, r9)     // Catch: java.lang.Throwable -> La9
                    com.mob.commons.a r6 = com.mob.commons.a.this     // Catch: java.lang.Throwable -> La9
                    com.mob.commons.MobProduct r9 = r2     // Catch: java.lang.Throwable -> La9
                    boolean r6 = com.mob.commons.a.a(r6, r3, r9, r13)     // Catch: java.lang.Throwable -> La9
                    com.mob.tools.log.NLog r9 = com.mob.tools.MobLog.getInstance()     // Catch: java.lang.Throwable -> La9
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La9
                    r10.<init>()     // Catch: java.lang.Throwable -> La9
                    java.lang.String r11 = "map: "
                    r10.append(r11)     // Catch: java.lang.Throwable -> La9
                    r10.append(r3)     // Catch: java.lang.Throwable -> La9
                    java.lang.String r11 = "\nisCh: "
                    r10.append(r11)     // Catch: java.lang.Throwable -> La9
                    r10.append(r4)     // Catch: java.lang.Throwable -> La9
                    java.lang.String r11 = ", isG: "
                    r10.append(r11)     // Catch: java.lang.Throwable -> La9
                    r10.append(r5)     // Catch: java.lang.Throwable -> La9
                    java.lang.String r5 = ", isReg: "
                    r10.append(r5)     // Catch: java.lang.Throwable -> La9
                    r10.append(r6)     // Catch: java.lang.Throwable -> La9
                    java.lang.String r5 = r10.toString()     // Catch: java.lang.Throwable -> La9
                    java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> La9
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La9
                    r10.<init>()     // Catch: java.lang.Throwable -> La9
                    java.lang.String r11 = ", udif:"
                    r10.append(r11)     // Catch: java.lang.Throwable -> La9
                    com.mob.commons.a r11 = com.mob.commons.a.this     // Catch: java.lang.Throwable -> La9
                    boolean r11 = com.mob.commons.a.d(r11)     // Catch: java.lang.Throwable -> La9
                    r10.append(r11)     // Catch: java.lang.Throwable -> La9
                    java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> La9
                    r8[r7] = r10     // Catch: java.lang.Throwable -> La9
                    r9.d(r5, r8)     // Catch: java.lang.Throwable -> La9
                    com.mob.commons.a r5 = com.mob.commons.a.this     // Catch: java.lang.Throwable -> La9
                    boolean r5 = com.mob.commons.a.d(r5)     // Catch: java.lang.Throwable -> La9
                    if (r5 == 0) goto L99
                    boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> La9
                    if (r5 == 0) goto L94
                    java.lang.String r2 = com.mob.commons.e.f56335a     // Catch: java.lang.Throwable -> La9
                L94:
                    com.mob.commons.a r5 = com.mob.commons.a.this     // Catch: java.lang.Throwable -> La9
                    com.mob.commons.a.a(r5, r3, r2, r13)     // Catch: java.lang.Throwable -> La9
                L99:
                    if (r4 != 0) goto L9d
                    if (r6 == 0) goto La2
                L9d:
                    com.mob.commons.a r13 = com.mob.commons.a.this     // Catch: java.lang.Throwable -> La9
                    com.mob.commons.a.a(r13, r3)     // Catch: java.lang.Throwable -> La9
                La2:
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> La9
                    com.mob.tools.utils.e r13 = r3
                    r13.a(r0)
                    return
                La9:
                    r13 = move-exception
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> La9
                    throw r13     // Catch: java.lang.Throwable -> Lac
                Lac:
                    r13 = move-exception
                    com.mob.tools.utils.e r1 = r3
                    r1.a(r0)
                    throw r13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.a.AnonymousClass1.onResponse(com.mob.tools.utils.DH$DHResponse):void");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mob.commons.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0549a {

        /* renamed from: a  reason: collision with root package name */
        private String f56034a;

        /* renamed from: b  reason: collision with root package name */
        private long f56035b;

        /* renamed from: c  reason: collision with root package name */
        private String f56036c;

        /* renamed from: d  reason: collision with root package name */
        private long f56037d;

        /* renamed from: e  reason: collision with root package name */
        private String f56038e;

        public C0549a(String str, long j4, String str2, long j5, String str3) {
            this.f56034a = str;
            this.f56035b = j4;
            this.f56036c = str2;
            this.f56037d = j5;
            this.f56038e = str3;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0083 A[Catch: all -> 0x00a6, TryCatch #0 {all -> 0x00a6, blocks: (B:4:0x0007, B:7:0x001f, B:11:0x0027, B:13:0x0035, B:17:0x003e, B:19:0x0050, B:23:0x0059, B:25:0x0063, B:27:0x0067, B:32:0x007b, B:34:0x0083, B:36:0x0087, B:42:0x009c, B:38:0x008f, B:40:0x0093, B:28:0x006e, B:30:0x0072), top: B:47:0x0007 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.mob.commons.a.C0549a a(java.lang.String r12) {
            /*
                boolean r0 = android.text.TextUtils.isEmpty(r12)
                r1 = 0
                if (r0 != 0) goto Lae
                java.util.HashMap r12 = com.mob.tools.utils.HashonHelper.fromJson(r12)     // Catch: java.lang.Throwable -> La6
                java.lang.String r0 = "004Pbabebgba"
                java.lang.String r0 = com.mob.commons.m.a(r0)     // Catch: java.lang.Throwable -> La6
                java.lang.Object r0 = r12.get(r0)     // Catch: java.lang.Throwable -> La6
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> La6
                boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> La6
                java.lang.String r3 = "null"
                if (r2 != 0) goto L26
                boolean r2 = android.text.TextUtils.equals(r3, r0)     // Catch: java.lang.Throwable -> La6
                if (r2 != 0) goto L26
                goto L27
            L26:
                r0 = r1
            L27:
                java.lang.String r2 = "genType"
                java.lang.Object r2 = r12.get(r2)     // Catch: java.lang.Throwable -> La6
                java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> La6
                boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> La6
                if (r4 != 0) goto L3d
                boolean r4 = android.text.TextUtils.equals(r3, r2)     // Catch: java.lang.Throwable -> La6
                if (r4 != 0) goto L3d
                r6 = r2
                goto L3e
            L3d:
                r6 = r1
            L3e:
                java.lang.String r2 = "002.chIh"
                java.lang.String r2 = com.mob.commons.m.a(r2)     // Catch: java.lang.Throwable -> La6
                java.lang.Object r2 = r12.get(r2)     // Catch: java.lang.Throwable -> La6
                java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> La6
                boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> La6
                if (r4 != 0) goto L58
                boolean r3 = android.text.TextUtils.equals(r3, r2)     // Catch: java.lang.Throwable -> La6
                if (r3 != 0) goto L58
                r9 = r2
                goto L59
            L58:
                r9 = r1
            L59:
                java.lang.String r2 = "gt"
                java.lang.Object r2 = r12.get(r2)     // Catch: java.lang.Throwable -> La6
                r3 = 0
                if (r2 == 0) goto L7a
                boolean r5 = r2 instanceof java.lang.Long     // Catch: java.lang.Throwable -> La6
                if (r5 == 0) goto L6e
                java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> La6
                long r7 = r2.longValue()     // Catch: java.lang.Throwable -> La6
                goto L7b
            L6e:
                boolean r5 = r2 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> La6
                if (r5 == 0) goto L7a
                java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> La6
                int r2 = r2.intValue()     // Catch: java.lang.Throwable -> La6
                long r7 = (long) r2     // Catch: java.lang.Throwable -> La6
                goto L7b
            L7a:
                r7 = r3
            L7b:
                java.lang.String r2 = "expTime"
                java.lang.Object r12 = r12.get(r2)     // Catch: java.lang.Throwable -> La6
                if (r12 == 0) goto L9b
                boolean r2 = r12 instanceof java.lang.Long     // Catch: java.lang.Throwable -> La6
                if (r2 == 0) goto L8f
                java.lang.Long r12 = (java.lang.Long) r12     // Catch: java.lang.Throwable -> La6
                long r2 = r12.longValue()     // Catch: java.lang.Throwable -> La6
            L8d:
                r10 = r2
                goto L9c
            L8f:
                boolean r2 = r12 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> La6
                if (r2 == 0) goto L9b
                java.lang.Integer r12 = (java.lang.Integer) r12     // Catch: java.lang.Throwable -> La6
                int r12 = r12.intValue()     // Catch: java.lang.Throwable -> La6
                long r2 = (long) r12     // Catch: java.lang.Throwable -> La6
                goto L8d
            L9b:
                r10 = r3
            L9c:
                com.mob.commons.a$a r12 = new com.mob.commons.a$a     // Catch: java.lang.Throwable -> La6
                r2 = r12
                r3 = r0
                r4 = r7
                r7 = r10
                r2.<init>(r3, r4, r6, r7, r9)     // Catch: java.lang.Throwable -> La6
                return r12
            La6:
                r12 = move-exception
                com.mob.tools.log.NLog r0 = com.mob.tools.MobLog.getInstance()
                r0.d(r12)
            Lae:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.a.C0549a.a(java.lang.String):com.mob.commons.a$a");
        }

        public HashMap<String, Object> b() {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put(m.a("004+babebgba"), this.f56034a);
            hashMap.put("gt", Long.valueOf(this.f56035b));
            hashMap.put("genType", this.f56036c);
            hashMap.put("expTime", Long.valueOf(this.f56037d));
            hashMap.put(m.a("0026chPh"), this.f56038e);
            return hashMap;
        }

        public String c() {
            return this.f56034a;
        }

        public long d() {
            return this.f56035b;
        }

        public String e() {
            return this.f56036c;
        }

        public long f() {
            return this.f56037d;
        }

        public String g() {
            return this.f56038e;
        }

        public String a() {
            return HashonHelper.fromHashMap(b());
        }

        public boolean a(long j4) {
            long j5 = this.f56037d;
            return j5 == 0 || j4 + (j5 * 1000) <= System.currentTimeMillis();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, DH.DHResponse dHResponse) {
        try {
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
        }
        if (com.mob.commons.b.c()) {
            C0549a j4 = ab.a().j();
            if (j4 == null || j4.a(ab.a().b("key_request_duid_time", 0L)) || y.a().d()) {
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(m.a("004hebg"), 1);
                hashMap.put(m.a("005(bdbiba!de"), DH.SyncMtd.getModel());
                hashMap.put(m.a("007IcdEbag=bibhca"), DH.SyncMtd.getManufacturer());
                hashMap.put("admt", dHResponse.getAdvertisingID());
                hashMap.put("oamt", com.mob.tools.b.c.a(MobSDK.getContext()).d().ah());
                hashMap.put("btt", Long.valueOf(SystemClock.elapsedRealtime()));
                hashMap.put(m.a("004Hbhbabgba"), y.a().e());
                hashMap.put("v", y.a().b());
                hashMap.put(m.a("004hGbebgba"), y.a().g());
                hashMap.put(m.a("005Qbabhbdbgba"), y.a().h());
                hashMap.put(m.a("008g)bi8h[bfbabhbddg"), y.a().i());
                if (j4 == null) {
                    hashMap.put(m.a("004Xbabebgba"), str);
                    hashMap.put("genType", "common");
                } else {
                    hashMap.put(m.a("004@babebgba"), j4.c());
                    hashMap.put("gt", Long.valueOf(j4.d()));
                    hashMap.put("genType", j4.e());
                    hashMap.put("expTime", Long.valueOf(j4.f()));
                    hashMap.put(m.a("002%ch!h"), j4.g());
                }
                NetCommunicator netCommunicator = new NetCommunicator(1024, "ceeef5035212dfe7c6a0acdc0ef35ce5b118aab916477037d7381f85c6b6176fcf57b1d1c3296af0bb1c483fe5e1eb0ce9eb2953b44e494ca60777a1b033cc07", "191737288d17e660c4b61440d5d14228a0bf9854499f9d68d8274db55d6d954489371ecf314f26bec236e58fac7fffa9b27bcf923e1229c4080d49f7758739e5bd6014383ed2a75ce1be9b0ab22f283c5c5e11216c5658ba444212b6270d629f2d615b8dfdec8545fb7d4f935b0cc10b6948ab4fc1cb1dd496a8f94b51e888dd");
                HashMap hashMap2 = (HashMap) netCommunicator.requestWithoutEncode(true, null, hashMap, i.a().a("dg") + "/v4/dgen", true);
                if (hashMap2 != null) {
                    ab.a().a("key_request_duid_time", System.currentTimeMillis());
                    String str2 = (String) hashMap2.get(m.a("0040bhbabgba"));
                    if (!TextUtils.isEmpty(str2)) {
                        y.a().a(str2);
                    }
                    C0549a a5 = C0549a.a(HashonHelper.fromHashMap(hashMap2));
                    if (a5 != null) {
                        ab.a().a(a5);
                        return a5.c();
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(HashMap<String, Object> hashMap, MobProduct mobProduct, DH.DHResponse dHResponse) {
        if (mobProduct == null) {
            mobProduct = new MobProduct() { // from class: com.mob.commons.Authorizer$2
                @Override // com.mob.commons.MobProduct
                public String getProductTag() {
                    return m.a("006Gcbeffafaefce");
                }

                @Override // com.mob.commons.MobProduct
                public int getSdkver() {
                    return MobSDK.SDK_VERSION_CODE;
                }
            };
        }
        boolean z4 = false;
        try {
            HashMap hashMap2 = (HashMap) hashMap.get(m.a("007bhhJccEc!cdbi"));
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
                hashMap.put(m.a("007bhhEccDc]cdbi"), hashMap2);
                z4 = true;
            }
            HashMap hashMap3 = (HashMap) hashMap2.get(DH.SyncMtd.getPackageName());
            String str = hashMap3 != null ? (String) hashMap3.get(mobProduct.getProductTag()) : null;
            String a5 = u.a();
            if (str == null || !str.equals(a5)) {
                if (a(mobProduct, hashMap, dHResponse)) {
                    return true;
                }
            }
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
        return z4;
    }

    private boolean a(MobProduct mobProduct, HashMap<String, Object> hashMap, DH.DHResponse dHResponse) throws Throwable {
        if (com.mob.commons.b.c()) {
            HashMap<String, Object> hashMap2 = new HashMap<>();
            hashMap2.put(m.a("007hPbhbibabeXag"), mobProduct.getProductTag());
            C0549a j4 = ab.a().j();
            String c5 = j4 != null ? j4.c() : null;
            String valueOf = String.valueOf(DH.SyncMtd.getPackageName());
            hashMap2.put(m.a("006bhh7cf8d_ca"), u.a());
            hashMap2.put(m.a("004+babebgba"), c5);
            hashMap2.put(m.a("006bhhhJcfch"), valueOf);
            hashMap2.put(m.a("006bhh@bb0dKbh"), String.valueOf(DH.SyncMtd.getAppVersion()));
            hashMap2.put(m.a("006'dgbacfbbSdPbh"), String.valueOf(mobProduct.getSdkver()));
            hashMap2.put(m.a("007cdgCdebibhcf"), String.valueOf(dHResponse.getDetailNetworkTypeForStatic()));
            HashMap<String, String> hashMap3 = new HashMap<>();
            hashMap3.put(m.a("013^cidg8d^bhficcba>dcgXbg;gEca"), aa.c());
            hashMap3.put(m.a("004<bdbibgba"), dHResponse.getODH());
            NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
            networkTimeOut.readTimout = 10000;
            networkTimeOut.connectionTimeout = 10000;
            HashMap fromJson = HashonHelper.fromJson(new NetworkHelper().httpPostNew(i.a().a("dg") + m.a("006j+badgbgchAc"), hashMap2, hashMap3, networkTimeOut));
            if (m.a("004g!bhbeHd").equals(String.valueOf(fromJson.get(m.a("004^bh'dAbe>h"))))) {
                this.f56027a = true;
            }
            if ("200".equals(String.valueOf(fromJson.get(m.a("006Xdg%gbgZbedg"))))) {
                HashMap hashMap4 = (HashMap) hashMap.get(m.a("007bhh.cc1c cdbi"));
                HashMap hashMap5 = (HashMap) hashMap4.get(valueOf);
                if (hashMap5 == null) {
                    hashMap5 = new HashMap();
                }
                hashMap5.put(mobProduct.getProductTag(), u.a());
                hashMap4.put(valueOf, hashMap5);
                hashMap.put(m.a("007bhhYccBcDcdbi"), hashMap4);
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HashMap<String, Object> hashMap, String str, DH.DHResponse dHResponse) {
        try {
            if (com.mob.commons.b.c()) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(m.a("005gFbicf2dc"), ac.a().b());
                for (Map.Entry entry : ((HashMap) hashMap.get(m.a("010Eba^dNbbbg.ad@ccAc<cdbi"))).entrySet()) {
                    hashMap2.put(entry.getKey(), entry.getValue());
                }
                try {
                    hashMap2.put(m.a("007ab4bhbhbgPd3bh"), Integer.valueOf(Integer.parseInt(String.valueOf(hashMap2.get(m.a("007ab?bhbhbgLdKbh"))))));
                } catch (Throwable unused) {
                }
                hashMap2.put(m.a("004Rbabebgba"), str);
                HashMap<String, Long> memoryInfo = dHResponse.getMemoryInfo();
                HashMap<String, HashMap<String, Long>> sizeInfo = dHResponse.getSizeInfo();
                if (memoryInfo != null) {
                    hashMap2.put(m.a("003%bh?bKbd"), memoryInfo.get(m.a("005g9bi5gbe")));
                }
                if (sizeInfo != null) {
                    HashMap<String, Long> hashMap3 = sizeInfo.get(m.a("006Qdgba4ab+bhba"));
                    if (hashMap3 != null) {
                        hashMap2.put(m.a("013;dgbaUab)bhbacj6gRbibhNb>ch?d"), hashMap3.get(m.a("005gAbiKgbe")));
                    }
                    HashMap<String, Long> hashMap4 = sizeInfo.get(m.a("004UbaVbgb"));
                    if (hashMap4 != null) {
                        hashMap2.put(m.a("011Eba7bgb:cjTgUbibh3b7chSd"), hashMap4.get(m.a("005gPbiXgbe")));
                    }
                }
                try {
                    String str2 = (String) hashMap2.get("fsuud");
                    if (!TextUtils.isEmpty(str2)) {
                        hashMap2.put("fsuud", HashonHelper.fromJson(str2));
                    }
                } catch (Throwable unused2) {
                }
                hashMap2.put(m.a("0060bhbibdccbdch"), dHResponse.getMIUIVersion());
                String encodeToString = Base64.encodeToString(Data.AES128Encode(c(), HashonHelper.fromHashMap(hashMap2)), 2);
                HashMap<String, Object> hashMap5 = new HashMap<>();
                hashMap5.put("m", encodeToString);
                NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
                networkTimeOut.readTimout = 30000;
                networkTimeOut.connectionTimeout = 30000;
                NetworkHelper networkHelper = new NetworkHelper();
                String str3 = i.a().a("dg") + m.a("006j7babgOcEcdbi");
                HashMap<String, String> hashMap6 = new HashMap<>();
                hashMap6.put(m.a("0136cidgBd*bhficcbaJdcg.bg3g;ca"), aa.c());
                hashMap6.put(m.a("004Bbdbibgba"), com.mob.tools.b.c.a(MobSDK.getContext()).d().ai());
                if ("200".equals(String.valueOf(HashonHelper.fromJson(networkHelper.httpPostNew(str3, hashMap5, hashMap6, networkTimeOut)).get(m.a("0069dg9gbg;bedg"))))) {
                    ab.a().a(ab.f56122a, System.currentTimeMillis());
                }
            }
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final HashMap<String, Object> hashMap) {
        p.a(p.a(p.f56425c), new o() { // from class: com.mob.commons.a.2
            @Override // com.mob.commons.o
            public boolean a(FileLocker fileLocker) {
                ResHelper.writeToFileNoCompress(a.this.d(), a.b(DH.SyncMtd.getModel(), hashMap));
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(HashMap<String, Object> hashMap, DH.DHResponse dHResponse) {
        boolean z4;
        boolean z5;
        int i4;
        HashMap<String, Object> a5;
        boolean z6 = true;
        if (hashMap == null) {
            hashMap = new HashMap<>();
            z4 = true;
        } else {
            z4 = false;
        }
        HashMap hashMap2 = (HashMap) hashMap.get(m.a("010RbaCd]bbbgMad6ccRc[cdbi"));
        if (hashMap2 == null) {
            hashMap2 = new HashMap();
            hashMap.put(m.a("0105baEd1bbbg1ad'ccKcVcdbi"), hashMap2);
            z4 = true;
        }
        Object obj = hashMap2.get("admt");
        String advertisingID = dHResponse.getAdvertisingID();
        if (advertisingID == null || advertisingID.equals(obj)) {
            z5 = false;
        } else {
            hashMap2.put("admt", advertisingID);
            z5 = true;
        }
        Object obj2 = hashMap2.get(m.a("004(biEbVbgba"));
        String ah = com.mob.tools.b.c.a(MobSDK.getContext()).d().ah();
        if ((obj2 != null || TextUtils.isEmpty(ah)) && (obj2 == null || String.valueOf(obj2).equals(ah))) {
            i4 = 0;
        } else {
            hashMap2.put(m.a("004'bi)bNbgba"), ah);
            z5 = true;
            i4 = 1;
        }
        Object obj3 = hashMap2.get(m.a("004 bhbabgba"));
        String c5 = y.a().c();
        if ((obj3 == null && !TextUtils.isEmpty(c5)) || (obj3 != null && !String.valueOf(obj3).equals(c5))) {
            hashMap2.put(m.a("004$bhbabgba"), c5);
            i4 |= 2;
            z5 = true;
        }
        Object obj4 = hashMap2.get(m.a("005Ibabhbdbgba"));
        String h4 = y.a().h();
        if ((obj4 == null && !TextUtils.isEmpty(h4)) || (obj4 != null && !String.valueOf(obj4).equals(h4))) {
            hashMap2.put(m.a("005Hbabhbdbgba"), h4);
            i4 |= 4;
            z5 = true;
        }
        Object obj5 = hashMap2.get(m.a("004h)bebgba"));
        String g4 = y.a().g();
        if ((obj5 == null && !TextUtils.isEmpty(g4)) || (obj5 != null && !String.valueOf(obj5).equals(g4))) {
            hashMap2.put(m.a("004hZbebgba"), g4);
            i4 |= 8;
            z5 = true;
        }
        Object obj6 = hashMap2.get("v");
        String b5 = y.a().b();
        if ((obj6 == null && !TextUtils.isEmpty(b5)) || (obj6 != null && !String.valueOf(obj6).equals(b5))) {
            hashMap2.put("v", b5);
            z5 = true;
        }
        hashMap2.put("cid_modify", Integer.valueOf(i4));
        if (z5) {
            z4 = true;
        }
        Object obj7 = hashMap2.get(m.a("005Tbdbiba0de"));
        String model = DH.SyncMtd.getModel();
        if (model != null && !model.equals(obj7)) {
            hashMap2.put(m.a("005Rbdbiba)de"), model);
            z4 = true;
        }
        Object obj8 = hashMap2.get(m.a("007=cd8bag2bibhca"));
        String manufacturer = DH.SyncMtd.getManufacturer();
        if (manufacturer != null && !manufacturer.equals(obj8)) {
            hashMap2.put(m.a("007Rcd1bag3bibhca"), manufacturer);
            z4 = true;
        }
        Object obj9 = hashMap2.get(m.a("007ab[bhbhbg*dKbh"));
        String carrier = dHResponse.getCarrier();
        if (carrier != null && !carrier.equals(obj9)) {
            hashMap2.put(m.a("007ab%bhbhbg0d<bh"), carrier);
            z4 = true;
        }
        Object obj10 = hashMap2.get(m.a("006>dgcadgbbQdEbh"));
        String oSVersionName = DH.SyncMtd.getOSVersionName();
        if (oSVersionName != null && !oSVersionName.equals(obj10)) {
            hashMap2.put(m.a("006 dgcadgbb,d-bh"), oSVersionName);
            z4 = true;
        }
        Object obj11 = hashMap2.get(m.a("002TcgHh"));
        boolean cx = dHResponse.cx();
        if (obj11 == null || !String.valueOf(cx ? 1 : 0).equals(String.valueOf(obj11))) {
            hashMap2.put(m.a("0023cgZh"), Integer.valueOf(cx ? 1 : 0));
            z4 = true;
        }
        Object obj12 = hashMap2.get(m.a("007GddbhJdb'cfJdEba"));
        boolean isRooted = dHResponse.isRooted();
        hashMap2.put(m.a("007?ddbh@dbUcf@dGba"), Boolean.valueOf(isRooted));
        if ((obj12 == null && isRooted) || (obj12 != null && !String.valueOf(obj12).equals(String.valueOf(isRooted)))) {
            z4 = true;
        }
        String valueOf = String.valueOf(hashMap2.get("prelangmt"));
        String valueOf2 = String.valueOf(dHResponse.getInnerAppLanguage());
        if (!TextUtils.equals(valueOf, valueOf2)) {
            hashMap2.put("prelangmt", valueOf2);
            z4 = true;
        }
        Object obj13 = hashMap2.get("gramgendt");
        int grammaticalGender = dHResponse.getGrammaticalGender();
        if (obj13 == null || !TextUtils.equals(String.valueOf(obj13), String.valueOf(grammaticalGender))) {
            hashMap2.put("gramgendt", Integer.valueOf(grammaticalGender));
            z4 = true;
        }
        if (((Integer) com.mob.commons.b.a("ndi", 0)).intValue() == 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("fbt", Long.valueOf(dHResponse.getLATime(0)));
            linkedHashMap.put("fwt", Long.valueOf(dHResponse.getLATime(1)));
            linkedHashMap.put("fls", Long.valueOf(dHResponse.getLATime(2)));
            linkedHashMap.put("fda", Long.valueOf(dHResponse.getLATime(3)));
            linkedHashMap.put("fsm", Long.valueOf(dHResponse.getLATime(4)));
            linkedHashMap.put("fus", Long.valueOf(dHResponse.getLATime(5)));
            linkedHashMap.put("fsf", Long.valueOf(dHResponse.getLATime(6)));
            String fromHashMap = HashonHelper.fromHashMap(linkedHashMap);
            if (!TextUtils.equals((String) hashMap2.get("fsuud"), fromHashMap)) {
                hashMap2.put("fsuud", fromHashMap);
                hashMap2.put(m.a("004hebg"), Integer.valueOf(DH.SyncMtd.getPlatformCode()));
                hashMap2.put(m.a("010_baRd^bbbgCad7dacaWhd"), dHResponse.getDeviceType());
                hashMap2.put(m.a("003hbHba"), Integer.valueOf(dHResponse.checkPad() ? 1 : 0));
                hashMap2.put(m.a("010Mdg$aBbhZddc4dgbgebWd"), dHResponse.getScreenSize());
                a5 = com.mob.commons.b.d.a(MobSDK.getContext());
                if (a5 != null && a5.size() > 0) {
                    hashMap2.putAll(a5);
                }
                return z6;
            }
        }
        z6 = z4;
        hashMap2.put(m.a("004hebg"), Integer.valueOf(DH.SyncMtd.getPlatformCode()));
        hashMap2.put(m.a("010_baRd^bbbgCad7dacaWhd"), dHResponse.getDeviceType());
        hashMap2.put(m.a("003hbHba"), Integer.valueOf(dHResponse.checkPad() ? 1 : 0));
        hashMap2.put(m.a("010Mdg$aBbhZddc4dgbgebWd"), dHResponse.getScreenSize());
        a5 = com.mob.commons.b.d.a(MobSDK.getContext());
        if (a5 != null) {
            hashMap2.putAll(a5);
        }
        return z6;
    }

    private static HashMap<String, Object> a(String str, byte[] bArr) throws Throwable {
        return HashonHelper.fromJson(Data.AES128Decode(str, bArr));
    }
}
