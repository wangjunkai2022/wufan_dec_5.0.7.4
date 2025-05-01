package com.mob.commons;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import com.join.mgps.activity.QuarkPromptActivity_;
import com.mob.MobSDK;
import com.mob.tools.MDP;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.network.NetCommunicator;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.FileLocker;
import com.mob.tools.utils.FileUtils;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.ResHelper;
import com.mob.tools.utils.SQLiteHelper;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes5.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static c f56237a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile SQLiteHelper.SingleTableDB f56238b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private static final a[] f56249a = new a[3];

        /* renamed from: b  reason: collision with root package name */
        private long f56250b;

        /* renamed from: c  reason: collision with root package name */
        private HashMap<String, Object> f56251c;

        private a(long j4, HashMap<String, Object> hashMap) {
            this.f56250b = j4;
            this.f56251c = hashMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.a(p.a(p.f56424b), new o() { // from class: com.mob.commons.c.a.1
                    @Override // com.mob.commons.o
                    public boolean a(FileLocker fileLocker) {
                        DH.requester(MobSDK.getContext()).getDetailNetworkTypeForStatic().request(new DH.DHResponder() { // from class: com.mob.commons.c.a.1.1
                            @Override // com.mob.tools.utils.DH.DHResponder
                            public void onResponse(DH.DHResponse dHResponse) throws Throwable {
                                b a5;
                                ContentValues contentValues = new ContentValues();
                                contentValues.put(C0811r.b("004h)chceXe"), String.valueOf(a.this.f56250b));
                                if (a.this.f56251c != null) {
                                    a.this.f56251c.put(C0811r.b("006ciiZdg2eOdb"), u.a());
                                    a.this.f56251c.put(C0811r.b("006ciiiBdgdi"), DH.SyncMtd.getPackageName());
                                    a.this.f56251c.put(C0811r.b("006cii7cc?e;ci"), DH.SyncMtd.getAppVersionName());
                                    long longValue = ((Long) com.mob.commons.b.a(C0811r.b("010Jeh@hYci@cheUdidbddcb"), 0L)).longValue();
                                    if (longValue != 0) {
                                        a.this.f56251c.put(C0811r.b("010Beh-hWci'cheBdidbddcb"), Long.valueOf(longValue));
                                    }
                                }
                                contentValues.put(C0811r.b("004CcbGchc"), Base64.encodeToString(Data.AES128Encode(Data.rawMD5(DH.SyncMtd.getManufacturer()), HashonHelper.fromHashMap(a.this.f56251c).getBytes("utf-8")), 2));
                                SQLiteHelper.insert(c.f56238b, contentValues);
                                long longValue2 = ((Long) com.mob.commons.b.a(C0811r.b("004Icb0e5cfJi"), 2L)).longValue();
                                if (C0811r.b("004d:cj$de").equals(dHResponse.getDetailNetworkTypeForStatic())) {
                                    longValue2 = 120;
                                }
                                if (!com.mob.commons.b.c() || (a5 = b.a()) == null) {
                                    return;
                                }
                                if (longValue2 <= 0) {
                                    a5.run();
                                } else if (com.mob.commons.a.l.a().a(longValue2, a5)) {
                                } else {
                                    a5.c();
                                }
                            }
                        });
                        return false;
                    }
                });
            } finally {
                try {
                } finally {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a b(long j4, HashMap<String, Object> hashMap) {
            a[] aVarArr = f56249a;
            synchronized (aVarArr) {
                for (int i4 = 0; i4 < 3; i4++) {
                    a aVar = aVarArr[i4];
                    if (aVar != null) {
                        aVar.f56250b = j4;
                        HashMap<String, Object> hashMap2 = aVar.f56251c;
                        if (hashMap2 != null) {
                            hashMap2.clear();
                        }
                        aVar.f56251c = hashMap;
                        aVarArr[i4] = null;
                        return aVar;
                    }
                }
                return new a(j4, hashMap);
            }
        }

        private void a() {
            try {
                a[] aVarArr = f56249a;
                synchronized (aVarArr) {
                    for (int i4 = 0; i4 < 3; i4++) {
                        if (aVarArr[i4] == null) {
                            this.f56250b = 0L;
                            HashMap<String, Object> hashMap = this.f56251c;
                            if (hashMap != null) {
                                hashMap.clear();
                            }
                            this.f56251c = null;
                            aVarArr[i4] = this;
                            return;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private static final b[] f56254b;

        /* renamed from: a  reason: collision with root package name */
        public boolean f56255a = false;

        static {
            f56254b = r0;
            b[] bVarArr = {new b()};
        }

        private static b b() {
            b[] bVarArr = f56254b;
            synchronized (bVarArr) {
                b bVar = bVarArr[0];
                if (bVar != null) {
                    bVarArr[0] = null;
                    if (bVar.f56255a) {
                        bVar.f56255a = false;
                    }
                    return bVar;
                }
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            b[] bVarArr = f56254b;
            synchronized (bVarArr) {
                if (bVarArr[0] == null) {
                    bVarArr[0] = this;
                }
            }
            this.f56255a = false;
        }

        @Override // java.lang.Runnable
        public void run() {
            DH.requester(MobSDK.getContext()).getDeviceKey().getDetailNetworkTypeForStatic().getDataNtType().request(new DH.DHResponder() { // from class: com.mob.commons.c.b.1
                /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
                    com.mob.commons.a.l.a().d();
                 */
                @Override // com.mob.tools.utils.DH.DHResponder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void onResponse(com.mob.tools.utils.DH.DHResponse r6) {
                    /*
                        r5 = this;
                        r0 = 50
                        java.lang.String[][] r1 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L41
                        com.mob.commons.c$b r2 = com.mob.commons.c.b.this     // Catch: java.lang.Throwable -> L41
                        int r2 = com.mob.commons.c.b.a(r2, r1)     // Catch: java.lang.Throwable -> L41
                    La:
                        if (r2 <= 0) goto L3b
                        com.mob.commons.c$b r3 = com.mob.commons.c.b.this     // Catch: java.lang.Throwable -> L41
                        android.util.SparseArray r3 = com.mob.commons.c.b.a(r3, r1, r2, r6)     // Catch: java.lang.Throwable -> L41
                        int r4 = r3.size()     // Catch: java.lang.Throwable -> L41
                        if (r4 != 0) goto L26
                        com.mob.commons.c$b r4 = com.mob.commons.c.b.this     // Catch: java.lang.Throwable -> L41
                        boolean r4 = r4.f56255a     // Catch: java.lang.Throwable -> L41
                        if (r4 == 0) goto L26
                        com.mob.commons.a.l r6 = com.mob.commons.a.l.a()     // Catch: java.lang.Throwable -> L41
                        r6.d()     // Catch: java.lang.Throwable -> L41
                        goto L3b
                    L26:
                        int r4 = r3.size()     // Catch: java.lang.Throwable -> L41
                        if (r4 <= 0) goto L31
                        com.mob.commons.c$b r4 = com.mob.commons.c.b.this     // Catch: java.lang.Throwable -> L41
                        com.mob.commons.c.b.a(r4, r3)     // Catch: java.lang.Throwable -> L41
                    L31:
                        if (r2 >= r0) goto L34
                        goto L3b
                    L34:
                        com.mob.commons.c$b r2 = com.mob.commons.c.b.this     // Catch: java.lang.Throwable -> L41
                        int r2 = com.mob.commons.c.b.a(r2, r1)     // Catch: java.lang.Throwable -> L41
                        goto La
                    L3b:
                        com.mob.commons.c$b r6 = com.mob.commons.c.b.this
                        com.mob.commons.c.b.a(r6)
                        return
                    L41:
                        r6 = move-exception
                        com.mob.commons.c$b r0 = com.mob.commons.c.b.this
                        com.mob.commons.c.b.a(r0)
                        goto L49
                    L48:
                        throw r6
                    L49:
                        goto L48
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.c.b.AnonymousClass1.onResponse(com.mob.tools.utils.DH$DHResponse):void");
                }
            });
        }

        static /* synthetic */ b a() {
            return b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int a(String[][] strArr) {
            Cursor cursor = null;
            int i4 = 0;
            try {
                cursor = SQLiteHelper.query(c.f56238b, new String[]{C0811r.b("004h[chceUe"), C0811r.b("004=cb6chc")}, null, null, "time desc");
                if (cursor == null) {
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Throwable unused) {
                        }
                    }
                    return 0;
                } else if (!cursor.moveToFirst()) {
                    try {
                        cursor.close();
                    } catch (Throwable unused2) {
                    }
                    return 0;
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    int i5 = 0;
                    try {
                        do {
                            try {
                                String[] strArr2 = new String[2];
                                strArr2[0] = cursor.getString(0);
                                strArr2[1] = cursor.getString(1);
                                long j4 = -1;
                                try {
                                    j4 = Long.parseLong(strArr2[0]);
                                } catch (Throwable unused3) {
                                }
                                if (j4 <= currentTimeMillis) {
                                    strArr[i5] = strArr2;
                                    i5++;
                                }
                                if (i5 >= strArr.length) {
                                    break;
                                }
                            } catch (Throwable th) {
                                th = th;
                                i4 = i5;
                                try {
                                    MobLog.getInstance().w(th);
                                    if (cursor != null) {
                                        try {
                                            cursor.close();
                                        } catch (Throwable unused4) {
                                        }
                                    }
                                    return i4;
                                } catch (Throwable th2) {
                                    if (cursor != null) {
                                        try {
                                            cursor.close();
                                        } catch (Throwable unused5) {
                                        }
                                    }
                                    throw th2;
                                }
                            }
                        } while (cursor.moveToNext());
                        break;
                        cursor.close();
                    } catch (Throwable unused6) {
                        return i5;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int a(SparseArray<String> sparseArray) {
            try {
                StringBuilder sb = new StringBuilder();
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append('\'');
                    sb.append(sparseArray.valueAt(i4));
                    sb.append('\'');
                }
                SQLiteHelper.SingleTableDB singleTableDB = c.f56238b;
                return SQLiteHelper.delete(singleTableDB, "time in (" + sb.toString() + ")", null);
            } catch (Throwable th) {
                MobLog.getInstance().w(th);
                return 0;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SparseArray<String> a(String[][] strArr, int i4, DH.DHResponse dHResponse) {
            HashMap<String, Object> hashMap;
            ArrayList arrayList;
            SparseArray<String> sparseArray = new SparseArray<>();
            try {
                hashMap = new HashMap<>();
                hashMap.put(C0811r.b("004ifch"), Integer.valueOf(DH.SyncMtd.getPlatformCode()));
                hashMap.put(C0811r.b("006,cb]e(ccch6be"), dHResponse.getDeviceKey());
                hashMap.put(C0811r.b("005Ececjcb-ef"), DH.SyncMtd.getModel());
                hashMap.put(C0811r.b("004Lcbcfchcb"), e.a((MobProduct) null));
                hashMap.put(C0811r.b("011deh$efcjcidgUhMdb<ie"), dHResponse.getDetailNetworkTypeForStatic());
                hashMap.put(C0811r.b("015.cbAchcZdf=eh)efcjcidgebdb]ie"), Integer.valueOf(dHResponse.getDataNtType()));
                arrayList = new ArrayList();
                byte[] rawMD5 = Data.rawMD5(DH.SyncMtd.getManufacturer());
                for (int i5 = 0; i5 < i4; i5++) {
                    String[] strArr2 = strArr[i5];
                    HashMap fromJson = HashonHelper.fromJson(new String(Data.AES128Decode(rawMD5, Base64.decode(strArr2[1], 2)), "utf-8").trim());
                    sparseArray.put(i5, strArr2[0]);
                    arrayList.add(fromJson);
                }
            } catch (Throwable th) {
                MobLog.getInstance().w(th);
            }
            if (arrayList.isEmpty()) {
                return new SparseArray<>();
            }
            hashMap.put(C0811r.b("005'cb:chcXeh"), arrayList);
            hashMap.put(C0811r.b("005hTcjdgVed"), ac.a().b());
            HashMap<String, String> hashMap2 = new HashMap<>();
            hashMap2.put(C0811r.b("013Zdjeh]e]cigjddcbNedh9ch_hGdb"), aa.c());
            hashMap2.put(C0811r.b("004Ocecjchcb"), com.mob.tools.b.c.a(MobSDK.getContext()).d().ai());
            NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
            networkTimeOut.readTimout = 30000;
            networkTimeOut.connectionTimeout = 30000;
            NetCommunicator netCommunicator = new NetCommunicator(1024, "ceeef5035212dfe7c6a0acdc0ef35ce5b118aab916477037d7381f85c6b6176fcf57b1d1c3296af0bb1c483fe5e1eb0ce9eb2953b44e494ca60777a1b033cc07", "191737288d17e660c4b61440d5d14228a0bf9854499f9d68d8274db55d6d954489371ecf314f26bec236e58fac7fffa9b27bcf923e1229c4080d49f7758739e5bd6014383ed2a75ce1be9b0ab22f283c5c5e11216c5658ba444212b6270d629f2d615b8dfdec8545fb7d4f935b0cc10b6948ab4fc1cb1dd496a8f94b51e888dd", networkTimeOut);
            if (!"200".equals(String.valueOf(HashonHelper.fromJson((String) netCommunicator.requestWithoutEncode(false, hashMap2, hashMap, i.a().a("gclg") + "/v6/gcl", false)).get(C0811r.b("006>eh>hch-cfeh"))))) {
                sparseArray.clear();
            }
            return sparseArray;
        }
    }

    private c() {
        try {
            Context context = MobSDK.getContext();
            String str = m.f56413a;
            File dataCacheFile = ResHelper.getDataCacheFile(context, str, true);
            if (dataCacheFile.exists() && dataCacheFile.length() > 209715200) {
                dataCacheFile.delete();
                dataCacheFile = ResHelper.getDataCacheFile(MobSDK.getContext(), str, true);
            }
            String absolutePath = dataCacheFile.getAbsolutePath();
            f56238b = SQLiteHelper.getDatabase(absolutePath, C0811r.b("008OekBchcSejKeci") + "_1");
            f56238b.addField(C0811r.b("004h:chceOe"), C0811r.b("004heTdh<h"), true);
            f56238b.addField(C0811r.b("004?cb2chc"), C0811r.b("004heNdh]h"), true);
            b a5 = b.a();
            if (a5 != null) {
                com.mob.commons.a.l.a().a(0L, 180, a5);
            }
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:41:0x00fb
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private static java.io.File b(java.lang.Object... r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.c.b(java.lang.Object[]):java.io.File");
    }

    public static synchronized c a() {
        c cVar;
        synchronized (c.class) {
            if (f56237a == null) {
                f56237a = new c();
            }
            cVar = f56237a;
        }
        return cVar;
    }

    public void a(long j4, HashMap<String, Object> hashMap) {
        boolean a5 = com.mob.commons.b.a();
        NLog mobLog = MobLog.getInstance();
        mobLog.d("DH PD: " + hashMap.get(C0811r.b("004h)dbMie")) + ", to: " + a5, new Object[0]);
        if (a5) {
            z.f56520d.execute(a.b(j4, hashMap));
        }
    }

    public static void a(Object... objArr) {
        try {
            h.a().a(13);
            ResHelper.deleteFileAndFolder(b(objArr));
        } catch (Throwable th) {
            h.a().a(4, th);
        }
    }

    public static void a(final ArrayList<HashMap<String, Object>> arrayList, final com.mob.tools.utils.e<Void> eVar) throws Throwable {
        if (arrayList != null && !arrayList.isEmpty()) {
            DH.requester(MobSDK.getContext()).getDeviceKey().getMIUIVersion().getAdvertisingID().request(new DH.DHResponder() { // from class: com.mob.commons.c.1
                @Override // com.mob.tools.utils.DH.DHResponder
                public void onResponse(DH.DHResponse dHResponse) {
                    try {
                        File file = new File(MobSDK.getContext().getFilesDir(), C0811r.b("0035ehee$f"));
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        final ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            HashMap hashMap = (HashMap) it2.next();
                            Boolean bool = (Boolean) hashMap.get(C0811r.b("002cTeh"));
                            boolean booleanValue = bool != null ? bool.booleanValue() : false;
                            String str = (String) hashMap.get(C0811r.b("002(deCf"));
                            String str2 = (String) hashMap.get("m");
                            String str3 = (String) hashMap.get(QuarkPromptActivity_.E);
                            Object obj = hashMap.get(C0811r.b("002Hchcb"));
                            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                                String a5 = e.a((MobProduct) null);
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put(C0811r.b("004[cbcfchcb"), a5);
                                hashMap2.put(C0811r.b("005hOcjdg*ed"), ac.a().b());
                                hashMap2.put(C0811r.b("004Ucecjchcb"), com.mob.tools.b.c.a(MobSDK.getContext()).d().ah());
                                hashMap2.put(C0811r.b("010Yehcbdgfj8e%ciehchcjPd"), Integer.valueOf(MobSDK.SDK_VERSION_CODE));
                                hashMap2.put(C0811r.b("006ciiDdg_eUdb"), u.a());
                                hashMap2.put(C0811r.b("009ciiQdkOeb8ciSeh"), MobSDK.getAppSecret());
                                hashMap2.put(C0811r.b("006Kcbcjce7cXchId"), MobSDK.getDomain().getDomain());
                                hashMap2.put(C0811r.b("010Jdecjci!beFejVhhi?eh"), Boolean.valueOf(MobSDK.checkForceHttps()));
                                hashMap2.put(C0811r.b("009!decjciYbe dd;i.ccgg"), Boolean.valueOf(MobSDK.checkV6()));
                                hashMap2.put(C0811r.b("004ebe4dh"), Long.valueOf(((Long) com.mob.commons.b.a(C0811r.b("004ebe6dh"), 5L)).longValue()));
                                hashMap2.put(C0811r.b("002b2cb"), (String) com.mob.commons.b.a(C0811r.b("002b1cb"), C0811r.b("006Tgdgdgegegege")));
                                hashMap2.put("usridt", aa.e());
                                hashMap2.put(C0811r.b("002Mchcb"), obj);
                                if (!TextUtils.isEmpty(str3)) {
                                    hashMap2.put(QuarkPromptActivity_.E, HashonHelper.fromJson(str3));
                                }
                                hashMap2.put(C0811r.b("008Ucb*e5ccchQbe]ddcb"), dHResponse.getDeviceKey());
                                hashMap2.put("imei", null);
                                hashMap2.put("imsi", null);
                                hashMap2.put("sno", null);
                                hashMap2.put("ssno", null);
                                hashMap2.put("miui", dHResponse.getMIUIVersion());
                                hashMap2.put(C0811r.b("005<cecjcbAef"), DH.SyncMtd.getModel());
                                hashMap2.put(C0811r.b("007%de_cbhJcjcidb"), DH.SyncMtd.getManufacturer());
                                hashMap2.put(C0811r.b("005@eeci=cd_cb"), DH.SyncMtd.getBrand());
                                hashMap2.put(C0811r.b("005c$cbehchcb"), dHResponse.getAdvertisingID());
                                hashMap2.put(C0811r.b("006cii(cc@eKci"), DH.SyncMtd.getAppVersionName());
                                hashMap2.put("appVerCode", Integer.valueOf(DH.SyncMtd.getAppVersion()));
                                hashMap2.put(C0811r.b("011icb1dgPc]diGeTdf$cZceNe"), DH.SyncMtd.getPackageName());
                                hashMap2.put(C0811r.b("005]eeehehchcb"), null);
                                hashMap2.put("osint", Integer.valueOf(DH.SyncMtd.getOSVersionInt()));
                                hashMap2.put("osname", DH.SyncMtd.getOSVersionName());
                                hashMap2.put("mdpName", MDP.class.getName());
                                String fromHashMap = HashonHelper.fromHashMap(hashMap2);
                                String checkHttpRequestUrl = NetCommunicator.checkHttpRequestUrl(str);
                                if (!TextUtils.isEmpty(str2)) {
                                    File file2 = new File(file, str2);
                                    if (booleanValue) {
                                        arrayList2.add(file2.getAbsolutePath());
                                    }
                                    c.b(String.valueOf(obj), file2, booleanValue, checkHttpRequestUrl, str2, fromHashMap);
                                }
                            }
                        }
                        FileUtils.deleteFilesInDirWithFilter(file, new FileFilter() { // from class: com.mob.commons.c.1.1
                            @Override // java.io.FileFilter
                            public boolean accept(File file3) {
                                return !arrayList2.contains(file3.getAbsolutePath());
                            }
                        });
                    } finally {
                        try {
                        } finally {
                        }
                    }
                }
            });
        } else {
            eVar.a(null);
        }
    }

    public static String a(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < iArr.length; i4++) {
            String f5 = x.f();
            if (iArr[i4] < f5.length()) {
                sb.append((char) (f5.charAt(iArr[i4]) - 2));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final String str, final File file, final boolean z4, final String str2, final String str3, final String str4) {
        new Thread(new Runnable() { // from class: com.mob.commons.c.2
            @Override // java.lang.Runnable
            public void run() {
                FileOutputStream fileOutputStream;
                int i4 = 7;
                int i5 = 13;
                try {
                    ByteArrayOutputStream byteArrayOutputStream = null;
                    if (z4) {
                        try {
                            if (file.exists() && str3.equals(Data.MD5(file))) {
                                if (c.b(str, 5, file.getAbsolutePath(), null, str4)) {
                                    return;
                                }
                                file.delete();
                                return;
                            }
                            if (file.exists()) {
                                file.delete();
                            }
                            try {
                                try {
                                    fileOutputStream = new FileOutputStream(file);
                                    try {
                                        NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
                                        networkTimeOut.readTimout = 60000;
                                        networkTimeOut.connectionTimeout = com.join.mgps.socket.entity.b.f54676c;
                                        new NetworkHelper().download(str2, fileOutputStream, networkTimeOut);
                                        v.a(fileOutputStream);
                                        if (file.length() > 0 && TextUtils.equals(str3, Data.MD5(file))) {
                                            if (c.b(str, 7, file.getAbsolutePath(), null, str4)) {
                                                return;
                                            }
                                            file.delete();
                                            return;
                                        } else if (file.exists()) {
                                            file.delete();
                                            return;
                                        } else {
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        v.a(fileOutputStream);
                                        if (file.length() > 0 && TextUtils.equals(str3, Data.MD5(file))) {
                                            if (!c.b(str, 7, file.getAbsolutePath(), null, str4)) {
                                                file.delete();
                                            }
                                        } else {
                                            if (file.exists()) {
                                                file.delete();
                                            }
                                            i4 = 6;
                                        }
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            i5 = i4;
                                            th = th2;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    i5 = 7;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                fileOutputStream = null;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            i5 = 5;
                        }
                    } else {
                        if (file.exists()) {
                            file.delete();
                        }
                        try {
                            try {
                                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                try {
                                    NetworkHelper.NetworkTimeOut networkTimeOut2 = new NetworkHelper.NetworkTimeOut();
                                    networkTimeOut2.readTimout = 60000;
                                    networkTimeOut2.connectionTimeout = com.join.mgps.socket.entity.b.f54676c;
                                    new NetworkHelper().download(str2, byteArrayOutputStream2, networkTimeOut2);
                                    v.a(byteArrayOutputStream2);
                                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                                    if (byteArray.length <= 0 || !TextUtils.equals(str3, Data.MD5(byteArray))) {
                                        return;
                                    }
                                    try {
                                        c.b(str, 9, null, byteArray, str4);
                                        return;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        i5 = 9;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    byteArrayOutputStream = byteArrayOutputStream2;
                                    v.a(byteArrayOutputStream);
                                    throw th;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            i5 = 8;
                        }
                    }
                } catch (Throwable th10) {
                    th = th10;
                }
                g.a().a(5, i5, th, str);
                MobLog.getInstance().d(th);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(String str, int i4, String str2, byte[] bArr, String str3) {
        Method[] methods;
        try {
            Method method = null;
            boolean z4 = false;
            for (Method method2 : com.mob.tools.c.a.class.getMethods()) {
                Annotation[] annotations = method2.getAnnotations();
                if (annotations != null) {
                    int length = annotations.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        Annotation annotation = annotations[i5];
                        if (annotation != null && annotation.annotationType() == com.mob.tools.c.b.class) {
                            method = method2;
                            z4 = true;
                            break;
                        }
                        i5++;
                    }
                    if (z4) {
                        break;
                    }
                }
            }
            if (bArr != null) {
                com.mob.commons.cc.a.a(MobSDK.getContext(), bArr, str3, method);
            } else {
                com.mob.commons.cc.a.a(MobSDK.getContext(), str2, str3, method);
            }
            return true;
        } catch (Throwable th) {
            try {
                g.a().a(6, i4, th, str);
                MobLog.getInstance().d(th);
            } catch (Throwable unused) {
            }
            return false;
        }
    }
}
