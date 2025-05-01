package com.mob.tools.b;

import android.app.ActivityManager;
import android.app.Application;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.net.Proxy;
import android.net.wifi.ScanResult;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.CellInfo;
import android.telephony.NeighboringCellInfo;
import android.text.TextUtils;
import com.mob.commons.CSCenter;
import com.mob.commons.MobMeta;
import com.mob.commons.a.l;
import com.mob.commons.v;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.NtFetcher;
import com.mob.tools.utils.ReflectHelper;
import com.mob.tools.utils.ResHelper;
import com.mob.tools.utils.b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.BlockingQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes5.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    private static b f56646b;

    /* renamed from: a  reason: collision with root package name */
    private Context f56647a;

    private b(Context context) {
        this.f56647a = context.getApplicationContext();
    }

    public static synchronized b a(Context context) {
        b bVar;
        synchronized (b.class) {
            if (f56646b == null && context != null) {
                f56646b = new b(context);
            }
            bVar = f56646b;
        }
        return bVar;
    }

    private Set<String> aA() {
        HashSet hashSet = new HashSet();
        if (com.mob.commons.d.b()) {
            for (int i4 = 10000; i4 <= 13000; i4++) {
                String[] strArr = (String[]) ReflectHelper.invokeInstanceMethod(this.f56647a.getPackageManager(), "getPackagesForUid", new Object[]{Integer.valueOf(i4)}, new Class[]{Integer.TYPE}, null);
                if (strArr != null && !TextUtils.isEmpty(strArr[0]) && !strArr[0].startsWith(l.a("035d0elegemfkelelfk%hgBemSefAedekelejedem4jDekej*di8ekeleg_ghUejggek8eNekfd"))) {
                    hashSet.add(strArr[0]);
                }
            }
        }
        return hashSet;
    }

    private boolean aB() {
        try {
            return ((Boolean) ReflectHelper.invokeStaticMethod(ReflectHelper.importClass(l.a("016ef0edekelejedemelgjemgmQg ggehfk")), l.a("019;ejgjgm<g-ggehfkfkNg!ekfeelKffgdjg1ed"), new Object[0])).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    private String at() {
        try {
            String l4 = c.a(this.f56647a).d().l();
            return Data.byteToHex(Data.SHA1(((Object) null) + ":" + ((Object) null) + ":" + l4));
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return null;
        }
    }

    private String au() {
        HashMap hashMap;
        HashMap<String, Object> av = av();
        if (av == null || (hashMap = (HashMap) av.get(l.a("010[edIg.eeejQdgAff6f=fgel"))) == null) {
            return null;
        }
        try {
            return Data.byteToHex(Data.SHA1(((Object) null) + ":" + ((Object) null) + ":" + ((String) hashMap.get(l.a("0050egeledBgh")))));
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.HashMap<java.lang.String, java.lang.Object> av() {
        /*
            r8 = this;
            android.content.Context r0 = r8.f56647a
            java.lang.String r1 = "014dKelegeg!m(edgggjJm!emedehejed"
            java.lang.String r1 = com.mob.commons.a.l.a(r1)
            r2 = 1
            java.io.File r0 = com.mob.tools.utils.ResHelper.getDataCacheFile(r0, r1, r2)
            boolean r1 = r0.exists()
            r3 = 0
            if (r1 == 0) goto L67
            long r4 = r0.length()
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L67
            r1 = 0
            r4 = 2
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3c
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L3c
            java.io.ObjectInputStream r6 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L3a
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r7 = r6.readObject()     // Catch: java.lang.Throwable -> L3e
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch: java.lang.Throwable -> L3e
            java.io.Closeable[] r4 = new java.io.Closeable[r4]
            r4[r1] = r6
            r4[r2] = r5
            com.mob.commons.v.a(r4)
            goto L48
        L3a:
            r6 = r3
            goto L3e
        L3c:
            r5 = r3
            r6 = r5
        L3e:
            java.io.Closeable[] r4 = new java.io.Closeable[r4]
            r4[r1] = r6
            r4[r2] = r5
            com.mob.commons.v.a(r4)
            r7 = r3
        L48:
            if (r7 == 0) goto L50
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L54
        L50:
            java.util.HashMap r7 = r8.a(r0)
        L54:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L67
            java.lang.String r0 = "0101edXg1eeejDdgNff6f!fgel"
            java.lang.String r0 = com.mob.commons.a.l.a(r0)
            java.lang.Object r0 = r7.get(r0)
            java.util.HashMap r0 = (java.util.HashMap) r0
            return r0
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.b.b.av():java.util.HashMap");
    }

    private String aw() {
        ObjectInputStream objectInputStream;
        FileInputStream fileInputStream;
        File cacheRootFile;
        File file = new File(t(), l.a("008,fm'ieBekGg'fmgmjd"));
        if (file.exists()) {
            File file2 = new File(file, l.a("003$emedfi"));
            if (file2.exists() && (cacheRootFile = ResHelper.getCacheRootFile(this.f56647a, l.a("003-emedfi"))) != null && file2.renameTo(cacheRootFile)) {
                file2.delete();
            }
        }
        File cacheRootFile2 = ResHelper.getCacheRootFile(this.f56647a, l.a("003%emedfi"));
        String str = null;
        if (cacheRootFile2 == null || cacheRootFile2.exists()) {
            try {
                fileInputStream = new FileInputStream(cacheRootFile2);
                try {
                    objectInputStream = new ObjectInputStream(fileInputStream);
                    try {
                        Object readObject = objectInputStream.readObject();
                        if (readObject != null && (readObject instanceof char[])) {
                            str = String.valueOf((char[]) readObject);
                        }
                        v.a(objectInputStream, fileInputStream);
                    } catch (Throwable th) {
                        th = th;
                        try {
                            MobLog.getInstance().d(th);
                            v.a(objectInputStream, fileInputStream);
                            return str;
                        } catch (Throwable th2) {
                            v.a(objectInputStream, fileInputStream);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    objectInputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                objectInputStream = null;
                fileInputStream = null;
            }
            return str;
        }
        return null;
    }

    private HashMap<String, String> ax() {
        try {
            return (HashMap) ResHelper.readObjectFromFile(ResHelper.getDataCacheFile(this.f56647a, l.a("004:em=efTgj")).getAbsolutePath());
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            ResHelper.getDataCacheFile(this.f56647a, l.a("004Xem7efAgj")).delete();
            return null;
        }
    }

    private Set<String> ay() {
        InputStream inputStream;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        Throwable th;
        Object obj;
        HashSet hashSet = new HashSet();
        if (com.mob.commons.d.b() && !l.a("0056egQgXejheeh").equalsIgnoreCase(c()) && j.a()) {
            try {
                try {
                    obj = v.c(l.a("016k5egjg^h_ejgj8j>jgFkedXfiVe<fk gZgj"));
                    try {
                        inputStream = (InputStream) ReflectHelper.invokeInstanceMethod(obj, l.a("014>fkJgj?ff1fk9eh1j^fm>jAek%geBeg"), new Object[0]);
                        try {
                            inputStreamReader = new InputStreamReader(inputStream, "utf-8");
                            try {
                                bufferedReader = new BufferedReader(inputStreamReader);
                                try {
                                    for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                                        String trim = readLine.trim();
                                        if (trim.length() > 8 && trim.substring(0, 8).equalsIgnoreCase(l.a("008kedNfiUeAfk*gl"))) {
                                            String trim2 = trim.substring(8).trim();
                                            if (!TextUtils.isEmpty(trim2)) {
                                                hashSet.add(trim2);
                                            }
                                        }
                                    }
                                    v.a(bufferedReader, inputStreamReader, inputStream);
                                } catch (Throwable th2) {
                                    th = th2;
                                    try {
                                        MobLog.getInstance().w(th);
                                        v.a(bufferedReader, inputStreamReader, inputStream);
                                        if (obj != null) {
                                            ReflectHelper.invokeInstanceMethod(obj, l.a("007Ged,g^gj>j-ekelfd"), new Object[0]);
                                        }
                                        return hashSet;
                                    } catch (Throwable th3) {
                                        v.a(bufferedReader, inputStreamReader, inputStream);
                                        if (obj != null) {
                                            try {
                                                ReflectHelper.invokeInstanceMethod(obj, l.a("007Ged,g^gj>j-ekelfd"), new Object[0]);
                                            } catch (Throwable unused) {
                                            }
                                        }
                                        throw th3;
                                    }
                                }
                            } catch (Throwable th4) {
                                bufferedReader = null;
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            bufferedReader = null;
                            th = th5;
                            inputStreamReader = null;
                        }
                    } catch (Throwable th6) {
                        inputStreamReader = null;
                        bufferedReader = null;
                        th = th6;
                        inputStream = null;
                    }
                } catch (Throwable unused2) {
                }
            } catch (Throwable th7) {
                inputStream = null;
                inputStreamReader = null;
                bufferedReader = null;
                th = th7;
                obj = null;
            }
            if (obj != null) {
                ReflectHelper.invokeInstanceMethod(obj, l.a("007Ged,g^gj>j-ekelfd"), new Object[0]);
            }
        }
        return hashSet;
    }

    private Set<String> az() {
        InputStream inputStream;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        Throwable th;
        Object obj;
        HashSet hashSet = new HashSet();
        if (com.mob.commons.d.b()) {
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    obj = v.c(l.a("032d$egedjg9ked:fi[e'fk)gYjgefeh(g=ekfdil2edjPejeeej4j.ejPg^gjjgil1eWjg") + l.a("026efZedekelejedemejBfjgfj,emEedj1ejel!fFemidgefffh") + " " + l.a("008>ililehgj=gHekjggi"));
                    try {
                        inputStream = (InputStream) ReflectHelper.invokeInstanceMethod(obj, l.a("014Rfk5gjUff^fk ehCj[fm9jQekTgeIeg"), new Object[0]);
                        if (inputStream != null) {
                            try {
                                inputStreamReader = new InputStreamReader(inputStream, "utf-8");
                                try {
                                    bufferedReader = new BufferedReader(inputStreamReader);
                                } catch (Throwable th2) {
                                    bufferedReader = null;
                                    th = th2;
                                }
                            } catch (Throwable th3) {
                                bufferedReader = null;
                                th = th3;
                                inputStreamReader = null;
                            }
                            try {
                                String a5 = l.a("012kedRfi=eNfkXgBfh5e@eg!g4jj");
                                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                                    String trim = readLine.trim();
                                    if (trim.length() > a5.length() && trim.substring(0, a5.length()).equalsIgnoreCase(a5)) {
                                        String trim2 = trim.substring(a5.length()).trim();
                                        if (!TextUtils.isEmpty(trim2)) {
                                            hashSet.add(trim2);
                                        }
                                    }
                                }
                                bufferedReader2 = bufferedReader;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    MobLog.getInstance().w(th);
                                    v.a(bufferedReader, inputStreamReader, inputStream);
                                    if (obj != null) {
                                        ReflectHelper.invokeInstanceMethod(obj, l.a("007.ed8gTgjAj$ekelfd"), new Object[0]);
                                    }
                                    return hashSet;
                                } catch (Throwable th5) {
                                    v.a(bufferedReader, inputStreamReader, inputStream);
                                    if (obj != null) {
                                        try {
                                            ReflectHelper.invokeInstanceMethod(obj, l.a("007.ed8gTgjAj$ekelfd"), new Object[0]);
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    throw th5;
                                }
                            }
                        } else {
                            inputStreamReader = null;
                        }
                        v.a(bufferedReader2, inputStreamReader, inputStream);
                    } catch (Throwable th6) {
                        inputStreamReader = null;
                        bufferedReader = null;
                        th = th6;
                        inputStream = null;
                    }
                } catch (Throwable unused2) {
                }
            } catch (Throwable th7) {
                inputStream = null;
                inputStreamReader = null;
                bufferedReader = null;
                th = th7;
                obj = null;
            }
            if (obj != null) {
                ReflectHelper.invokeInstanceMethod(obj, l.a("007.ed8gTgjAj$ekelfd"), new Object[0]);
            }
        }
        return hashSet;
    }

    public static Context x() {
        return v.a();
    }

    public boolean A() {
        Object systemServiceSafe;
        if (com.mob.commons.d.d() && CSCenter.getInstance().isWifiDataEnable() && DH.SyncMtd.checkPermission(l.a("036efCedekelejedemGkg0ekegejgjgjejel6fGemfeglgefhjehjeihgffhdffeifmgdgegdhj")) && (systemServiceSafe = DH.SyncMtd.getSystemServiceSafe(l.a("0041ghejfgej"))) != null) {
            return ((Boolean) ReflectHelper.invokeInstanceMethodNoThrow(systemServiceSafe, l.a("0090gj8je[ek%jNfmDdef"), Boolean.FALSE, new Object[0])).booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
        r3.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (r5 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.HashMap<java.lang.String, java.lang.Object> B() {
        /*
            r9 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L85
            java.lang.String r2 = "013mk$ekel6dmdkJehej fQfgel"
            java.lang.String r2 = com.mob.commons.a.l.a(r2)     // Catch: java.lang.Throwable -> L85
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L85
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L85
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L85
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L85
            r3.<init>()     // Catch: java.lang.Throwable -> L85
            java.lang.String r4 = "010k$ekel@dgNgjgjelekgj"
            java.lang.String r4 = com.mob.commons.a.l.a(r4)     // Catch: java.lang.Throwable -> L85
            r0.put(r4, r3)     // Catch: java.lang.Throwable -> L85
            r4 = 0
        L24:
            r5 = r4
        L25:
            java.lang.String r6 = r2.readLine()     // Catch: java.lang.Throwable -> L85
            if (r6 == 0) goto L7e
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L85
            if (r7 == 0) goto L37
            if (r5 == 0) goto L24
            r3.add(r5)     // Catch: java.lang.Throwable -> L85
            goto L24
        L37:
            java.lang.String r6 = r6.trim()     // Catch: java.lang.Throwable -> L85
            java.lang.String r7 = "009kAekel8dgDgjgjelek"
            java.lang.String r7 = com.mob.commons.a.l.a(r7)     // Catch: java.lang.Throwable -> L85
            boolean r7 = r6.startsWith(r7)     // Catch: java.lang.Throwable -> L85
            if (r7 == 0) goto L51
            if (r5 == 0) goto L4c
            r3.add(r5)     // Catch: java.lang.Throwable -> L85
        L4c:
            java.util.HashMap r5 = new java.util.HashMap     // Catch: java.lang.Throwable -> L85
            r5.<init>()     // Catch: java.lang.Throwable -> L85
        L51:
            java.lang.String r7 = ":"
            java.lang.String[] r6 = r6.split(r7)     // Catch: java.lang.Throwable -> L85
            int r7 = r6.length     // Catch: java.lang.Throwable -> L85
            r8 = 1
            if (r7 <= r8) goto L25
            r7 = 0
            if (r5 != 0) goto L6e
            r7 = r6[r7]     // Catch: java.lang.Throwable -> L85
            java.lang.String r7 = r7.trim()     // Catch: java.lang.Throwable -> L85
            r6 = r6[r8]     // Catch: java.lang.Throwable -> L85
            java.lang.String r6 = r6.trim()     // Catch: java.lang.Throwable -> L85
            r0.put(r7, r6)     // Catch: java.lang.Throwable -> L85
            goto L25
        L6e:
            r7 = r6[r7]     // Catch: java.lang.Throwable -> L85
            java.lang.String r7 = r7.trim()     // Catch: java.lang.Throwable -> L85
            r6 = r6[r8]     // Catch: java.lang.Throwable -> L85
            java.lang.String r6 = r6.trim()     // Catch: java.lang.Throwable -> L85
            r5.put(r7, r6)     // Catch: java.lang.Throwable -> L85
            goto L25
        L7e:
            r2.close()     // Catch: java.lang.Throwable -> L85
            r1.close()     // Catch: java.lang.Throwable -> L85
            goto L8d
        L85:
            r1 = move-exception
            com.mob.tools.log.NLog r2 = com.mob.tools.MobLog.getInstance()
            r2.d(r1)
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.b.b.B():java.util.HashMap");
    }

    public ArrayList<ArrayList<String>> C() {
        ArrayList<ArrayList<String>> arrayList = new ArrayList<>();
        if (Build.VERSION.SDK_INT < 28) {
            try {
                FileReader fileReader = new FileReader(l.a("017mk.ekel9dmjjXfd m3edekejeeSgIekgj"));
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else if (!TextUtils.isEmpty(readLine)) {
                        String[] split = readLine.trim().split(" ");
                        if (split.length > 1) {
                            ArrayList<String> arrayList2 = new ArrayList<>();
                            for (String str : split) {
                                if (!TextUtils.isEmpty(str)) {
                                    arrayList2.add(str.trim());
                                }
                            }
                            arrayList.add(arrayList2);
                        }
                    }
                }
                bufferedReader.close();
                fileReader.close();
            } catch (Throwable th) {
                MobLog.getInstance().d(th.getMessage(), new Object[0]);
            }
        }
        return arrayList;
    }

    public String D() {
        String a5 = e.a(this.f56647a).a(l.a("014,ekelemfiGg2ek1fgh,emefOgBegeh"), "0");
        return a5 == null ? "0" : a5;
    }

    public HashMap<String, HashMap<String, Long>> E() {
        long availableBlocksLong;
        long freeBlocksLong;
        long blockCountLong;
        long blockSizeLong;
        HashMap<String, HashMap<String, Long>> hashMap = new HashMap<>();
        String[] strArr = {l.a("006EgjedCde(eked"), l.a("004Red_eje")};
        for (int i4 = 0; i4 < 2; i4++) {
            String str = strArr[i4];
            HashMap<String, Long> hashMap2 = new HashMap<>();
            hashMap2.put("available", -1L);
            hashMap2.put(l.a("004Vfgek9gg"), -1L);
            hashMap2.put(l.a("005jKel?jeh"), -1L);
            hashMap.put(str, hashMap2);
        }
        HashMap hashMap3 = new HashMap();
        String t4 = t();
        if (t4 != null) {
            hashMap3.put(l.a("006 gjed[de<eked"), new StatFs(t4));
        }
        File dataDirectory = Environment.getDataDirectory();
        if (dataDirectory != null) {
            hashMap3.put(l.a("004Ued4eje"), new StatFs(dataDirectory.getPath()));
        }
        for (Map.Entry entry : hashMap3.entrySet()) {
            StatFs statFs = (StatFs) entry.getValue();
            if (Build.VERSION.SDK_INT <= 18) {
                availableBlocksLong = statFs.getAvailableBlocks() * statFs.getBlockSize();
                freeBlocksLong = statFs.getFreeBlocks() * statFs.getBlockSize();
                blockCountLong = statFs.getBlockCount();
                blockSizeLong = statFs.getBlockSize();
            } else {
                availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
                freeBlocksLong = statFs.getFreeBlocksLong() * statFs.getBlockSizeLong();
                blockCountLong = statFs.getBlockCountLong();
                blockSizeLong = statFs.getBlockSizeLong();
            }
            HashMap<String, Long> hashMap4 = hashMap.get(entry.getKey());
            hashMap4.put("available", Long.valueOf(availableBlocksLong));
            hashMap4.put(l.a("004_fgek[gg"), Long.valueOf(freeBlocksLong));
            hashMap4.put(l.a("005j<elTjeh"), Long.valueOf(blockCountLong * blockSizeLong));
        }
        return hashMap;
    }

    public HashMap<String, Long> F() {
        HashMap<String, Long> hashMap = new HashMap<>();
        hashMap.put("available", -1L);
        hashMap.put(l.a("005jCel*jeh"), -1L);
        hashMap.put(l.a("005Cejgjgfelgh"), -1L);
        hashMap.put(l.a("009ji+ekKg5gj1i;elWhMed"), -1L);
        Object systemServiceSafe = DH.SyncMtd.getSystemServiceSafe(l.a("008edj,ejeeej j%fd"));
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ReflectHelper.invokeInstanceMethodNoThrow(systemServiceSafe, l.a("013-fk gj7id]g4egelekfdff%fMfgel"), null, memoryInfo);
        hashMap.put("available", Long.valueOf(memoryInfo.availMem));
        if (Build.VERSION.SDK_INT >= 16) {
            hashMap.put(l.a("005jTelSjeh"), Long.valueOf(memoryInfo.totalMem));
        }
        hashMap.put(l.a("005;ejgjgfelgh"), Long.valueOf(memoryInfo.lowMemory ? 1L : 0L));
        hashMap.put(l.a("009jiUek.gDgj]i@el?h,ed"), Long.valueOf(memoryInfo.threshold));
        return hashMap;
    }

    public String G() {
        return com.mob.tools.utils.g.a().b();
    }

    public boolean H() {
        BufferedReader bufferedReader;
        Throwable th;
        String[] strArr = {l.a("020dBelegem4j6elLkWihelIif2ghehemeg9eGfkejgjfi"), l.a("024GejelemfkejBjiMehggem+i5ehgjfifdedfkemegSe(fkejgjfi"), l.a("032AedJgBemekelggeeemFefJedekelejedemfjWkPelgjBg'edemej,fVgjAjehhgMek"), l.a("028:elekfkemeg?gAelghTdejSemKgQedfjAkAelgjXgFedemeg!efeLfk7g0ek"), l.a("0277egelEgSemgj3iMejheehfiehemekCg3edejek8gdj]gjKj]elekFe+fkOg"), l.a("018Veg6gSemghHgQejgj]i;ehemfi?gFek%fgh>gjeh"), l.a("027Aejelemfkej6jiLehggemeeeeggifgiiigiemeg?ei1elgjTi3elihel"), l.a("013'glelelfiemhfejehhgehemhh=k"), "club.youppgd.adhook", l.a("027Fej-dAehemNf0eh;hhkjSekemWekkh=ejgjWjGed^gjgdjXelek"), l.a("032Eejelemfkej:ji'ehggemEi6ehgjfifdedfkemeg,g9egelekfded]gjgdjZelek"), l.a("034d,elegemfkej-ji[ehggemUdekfjRekej?kEgjemfiSgWekQfgh'fg$heQgj@ig%ek")};
        for (int i4 = 0; i4 < 12; i4++) {
            if (c.a(this.f56647a).d().a(strArr[i4], 0) != null) {
                return true;
            }
        }
        try {
            throw new Exception("msk");
        } catch (Throwable th2) {
            for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                if (stackTraceElement.getClassName().contains(l.a("035Wed=g+emekelggeeemMefOedekelejedemfjVk)elgjMgOedemhhGkPelgjLgDedgkekejedfk6g"))) {
                    return true;
                }
            }
            try {
                try {
                    ClassLoader.getSystemClassLoader().loadClass(l.a("0369ed<g3emekelggeeem_efYedekelejedemfjTkXelgj3gNedemhhWkDelgj2gOedgl(ghkg4ekgj")).newInstance();
                    try {
                        ClassLoader.getSystemClassLoader().loadClass(l.a("035Ied!g9emekelggeeem6ef9edekelejedemfj.kIelgj=g+edemhh(k5elgj2gWedgkekejedfkTg")).newInstance();
                    } catch (IllegalAccessException | InstantiationException unused) {
                    }
                    return true;
                } catch (Throwable unused2) {
                    try {
                        bufferedReader = new BufferedReader(new FileReader(l.a("006mkLekel3dm") + Process.myPid() + l.a("005m6eg%ek?gj")));
                        boolean z4 = false;
                        while (true) {
                            try {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null || z4) {
                                    break;
                                }
                                z4 = readLine.toLowerCase().contains(l.a("006PfjWkJelgj;gCed"));
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    MobLog.getInstance().d(th);
                                    v.a(bufferedReader);
                                    return false;
                                } catch (Throwable th4) {
                                    v.a(bufferedReader);
                                    throw th4;
                                }
                            }
                        }
                        v.a(bufferedReader);
                        return z4;
                    } catch (Throwable th5) {
                        bufferedReader = null;
                        th = th5;
                    }
                }
            } catch (IllegalAccessException | InstantiationException unused3) {
                return true;
            }
        }
    }

    public boolean I() {
        return (this.f56647a.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    public boolean J() {
        boolean z4 = false;
        try {
            if (Build.VERSION.SDK_INT < 17 ? Settings.Secure.getInt(this.f56647a.getContentResolver(), "adb_enabled", 0) > 0 : Settings.Secure.getInt(this.f56647a.getContentResolver(), "adb_enabled", 0) > 0) {
                z4 = true;
            }
        } catch (Throwable unused) {
        }
        return z4;
    }

    public boolean K() {
        boolean z4 = false;
        try {
            if (Build.VERSION.SDK_INT < 17 ? Settings.Secure.getInt(this.f56647a.getContentResolver(), "development_settings_enabled", 0) > 0 : Settings.Secure.getInt(this.f56647a.getContentResolver(), "development_settings_enabled", 0) > 0) {
                z4 = true;
            }
        } catch (Throwable unused) {
        }
        return z4;
    }

    public boolean L() {
        Intent a5 = v.a((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        return a5 != null && a5.getIntExtra("plugged", -1) == 2;
    }

    public boolean M() {
        return false;
    }

    public boolean N() {
        ApplicationInfo a5 = c.a(this.f56647a).d().a(false, DH.SyncMtd.getPackageName(), 1);
        return (a5 == null || (a5.flags & 2) == 0) ? false : true;
    }

    public boolean O() {
        String host;
        int port;
        try {
            if (Build.VERSION.SDK_INT >= 14) {
                host = System.getProperty(l.a("014ijjk<emMkFekelfjfdglelgj(j"));
                String property = System.getProperty(l.a("014ijjkSemQk0ekelfjfdhmelek3j"));
                if (property == null) {
                    property = "-1";
                }
                try {
                    port = Integer.parseInt(property);
                } catch (Throwable unused) {
                    port = -1;
                }
            } else {
                host = Proxy.getHost(this.f56647a);
                port = Proxy.getPort(this.f56647a);
            }
            return (TextUtils.isEmpty(host) || port == -1) ? false : true;
        } catch (Throwable unused2) {
            return false;
        }
    }

    public boolean P() {
        return (Build.VERSION.SDK_INT >= 29) && (c.a(this.f56647a).d().ak().targetSdkVersion >= 29);
    }

    public String Q() {
        try {
            String id = TimeZone.getDefault().getID();
            if (TextUtils.isEmpty(id)) {
                Configuration configuration = new Configuration();
                configuration.setToDefaults();
                Settings.System.getConfiguration(this.f56647a.getContentResolver(), configuration);
                Locale locale = configuration.locale;
                if (locale == null) {
                    locale = Locale.getDefault();
                }
                return Calendar.getInstance(locale).getTimeZone().getID();
            }
            return id;
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return null;
        }
    }

    public String R() {
        return c.a(this.f56647a).d().a(l.a("015YekelemggehejDh'edemfg*he0eeelek"));
    }

    public String S() {
        return c.a(this.f56647a).d().a(l.a("020>fkgjegemee3g6ekgjejelEf)emgg?eTgj9gJggSefGed"));
    }

    public String T() {
        return c.a(this.f56647a).d().a(l.a("016GekelemFkYekeledeh7dj4emggel*eSeked"));
    }

    public String U() {
        return c.a(this.f56647a).d().a(l.a("017.ekelemggel6e1ekedem_khej:fgelekeg"));
    }

    public int V() {
        if (com.mob.commons.d.i()) {
            return NtFetcher.getInstance(this.f56647a).getDtNtType();
        }
        return -1;
    }

    public String W() {
        return Build.BRAND;
    }

    public boolean X() {
        return b(this.f56647a) != 0;
    }

    public String Y() {
        String str = "";
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                str = Application.getProcessName();
            } else {
                Method declaredMethod = Class.forName(l.a("026ef.edekelejedemMekk%emge:dj.ejeeej!jOfdgd7i?ek4geNed"), false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                if (invoke instanceof String) {
                    str = (String) invoke;
                }
            }
        } catch (Throwable th) {
            NLog mobLog = MobLog.getInstance();
            mobLog.d("getProcessName: " + th, new Object[0]);
        }
        return str;
    }

    public long Z() {
        Object b5 = c.a(this.f56647a).d().b(false, 0, o(), 0);
        if (b5 != null) {
            return com.mob.tools.c.e(b5, DH.SyncMtd.getPackageName());
        }
        return 0L;
    }

    public String aa() {
        return Build.DEVICE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.BufferedReader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String ab() {
        /*
            r10 = this;
            java.lang.String r0 = "007!edAg2gj3jWekelfd"
            r1 = 1
            r2 = 2
            r3 = 0
            r4 = 0
            java.lang.String r5 = "021dejZjg3mkHekel+dmWgjEgh4fgHmd fkekeleh5k"
            java.lang.String r5 = com.mob.commons.a.l.a(r5)     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r5 = com.mob.commons.v.c(r5)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = "014OfkGgj%ffGfk'eh%j;fm^jNek=ge:eg"
            java.lang.String r6 = com.mob.commons.a.l.a(r6)     // Catch: java.lang.Throwable -> L4c
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r6 = com.mob.tools.utils.ReflectHelper.invokeInstanceMethodNoThrow(r5, r6, r4, r7)     // Catch: java.lang.Throwable -> L4c
            java.io.InputStream r6 = (java.io.InputStream) r6     // Catch: java.lang.Throwable -> L4c
            if (r6 == 0) goto L34
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L31
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L31
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L31
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L31
            java.lang.String r8 = r7.readLine()     // Catch: java.lang.Throwable -> L2f
            goto L36
        L2f:
            r8 = move-exception
            goto L53
        L31:
            r8 = move-exception
            r7 = r4
            goto L53
        L34:
            r7 = r4
            r8 = r7
        L36:
            java.io.Closeable[] r2 = new java.io.Closeable[r2]
            r2[r3] = r7
            r2[r1] = r6
            com.mob.commons.v.a(r2)
            if (r5 == 0) goto L4a
            java.lang.String r0 = com.mob.commons.a.l.a(r0)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.mob.tools.utils.ReflectHelper.invokeInstanceMethodNoThrow(r5, r0, r4, r1)
        L4a:
            r4 = r8
            goto L6e
        L4c:
            r8 = move-exception
            r6 = r4
            goto L52
        L4f:
            r8 = move-exception
            r5 = r4
            r6 = r5
        L52:
            r7 = r6
        L53:
            com.mob.tools.log.NLog r9 = com.mob.tools.MobLog.getInstance()     // Catch: java.lang.Throwable -> L6f
            r9.d(r8)     // Catch: java.lang.Throwable -> L6f
            java.io.Closeable[] r2 = new java.io.Closeable[r2]
            r2[r3] = r7
            r2[r1] = r6
            com.mob.commons.v.a(r2)
            if (r5 == 0) goto L6e
            java.lang.String r0 = com.mob.commons.a.l.a(r0)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.mob.tools.utils.ReflectHelper.invokeInstanceMethodNoThrow(r5, r0, r4, r1)
        L6e:
            return r4
        L6f:
            r8 = move-exception
            java.io.Closeable[] r2 = new java.io.Closeable[r2]
            r2[r3] = r7
            r2[r1] = r6
            com.mob.commons.v.a(r2)
            if (r5 == 0) goto L84
            java.lang.String r0 = com.mob.commons.a.l.a(r0)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.mob.tools.utils.ReflectHelper.invokeInstanceMethodNoThrow(r5, r0, r4, r1)
        L84:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.b.b.ab():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.io.BufferedReader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String ac() {
        /*
            r11 = this;
            java.lang.String r0 = "007BedDg(gj]j,ekelfd"
            r1 = 1
            r2 = 2
            r3 = 0
            r4 = 0
            java.lang.String r5 = "017dej*jgKmk9ekel]dmdk?ehej7fZfgel"
            java.lang.String r5 = com.mob.commons.a.l.a(r5)     // Catch: java.lang.Throwable -> L78
            java.lang.Object r5 = com.mob.commons.v.c(r5)     // Catch: java.lang.Throwable -> L78
            java.lang.String r6 = "014Zfk2gj6ff1fk;ehXj[fmKj!ekHge1eg"
            java.lang.String r6 = com.mob.commons.a.l.a(r6)     // Catch: java.lang.Throwable -> L75
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L75
            java.lang.Object r6 = com.mob.tools.utils.ReflectHelper.invokeInstanceMethodNoThrow(r5, r6, r3, r7)     // Catch: java.lang.Throwable -> L75
            java.io.InputStream r6 = (java.io.InputStream) r6     // Catch: java.lang.Throwable -> L75
            if (r6 == 0) goto L60
            java.lang.StringBuffer r7 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L5d
            r7.<init>()     // Catch: java.lang.Throwable -> L5d
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5d
            java.io.InputStreamReader r9 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L5d
            java.lang.String r10 = "utf-8"
            r9.<init>(r6, r10)     // Catch: java.lang.Throwable -> L5d
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L5d
        L31:
            java.lang.String r9 = r8.readLine()     // Catch: java.lang.Throwable -> L5b
            if (r9 == 0) goto L3b
            r7.append(r9)     // Catch: java.lang.Throwable -> L5b
            goto L31
        L3b:
            r8.close()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = r7.toLowerCase()     // Catch: java.lang.Throwable -> L5b
            java.io.Closeable[] r2 = new java.io.Closeable[r2]
            r2[r4] = r8
            r2[r1] = r6
            com.mob.commons.v.a(r2)
            if (r5 == 0) goto L5a
            java.lang.String r0 = com.mob.commons.a.l.a(r0)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.mob.tools.utils.ReflectHelper.invokeInstanceMethodNoThrow(r5, r0, r3, r1)
        L5a:
            return r7
        L5b:
            r7 = move-exception
            goto L7c
        L5d:
            r7 = move-exception
            r8 = r3
            goto L7c
        L60:
            java.io.Closeable[] r2 = new java.io.Closeable[r2]
            r2[r4] = r3
            r2[r1] = r6
            com.mob.commons.v.a(r2)
            if (r5 == 0) goto L97
            java.lang.String r0 = com.mob.commons.a.l.a(r0)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.mob.tools.utils.ReflectHelper.invokeInstanceMethodNoThrow(r5, r0, r3, r1)
            goto L97
        L75:
            r7 = move-exception
            r6 = r3
            goto L7b
        L78:
            r7 = move-exception
            r5 = r3
            r6 = r5
        L7b:
            r8 = r6
        L7c:
            com.mob.tools.log.NLog r9 = com.mob.tools.MobLog.getInstance()     // Catch: java.lang.Throwable -> L9a
            r9.d(r7)     // Catch: java.lang.Throwable -> L9a
            java.io.Closeable[] r2 = new java.io.Closeable[r2]
            r2[r4] = r8
            r2[r1] = r6
            com.mob.commons.v.a(r2)
            if (r5 == 0) goto L97
            java.lang.String r0 = com.mob.commons.a.l.a(r0)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.mob.tools.utils.ReflectHelper.invokeInstanceMethodNoThrow(r5, r0, r3, r1)
        L97:
            java.lang.String r0 = ""
            return r0
        L9a:
            r7 = move-exception
            java.io.Closeable[] r2 = new java.io.Closeable[r2]
            r2[r4] = r8
            r2[r1] = r6
            com.mob.commons.v.a(r2)
            if (r5 == 0) goto Laf
            java.lang.String r0 = com.mob.commons.a.l.a(r0)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.mob.tools.utils.ReflectHelper.invokeInstanceMethodNoThrow(r5, r0, r3, r1)
        Laf:
            goto Lb1
        Lb0:
            throw r7
        Lb1:
            goto Lb0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.b.b.ac():java.lang.String");
    }

    public String ad() {
        return com.mob.commons.b.d.b(this.f56647a);
    }

    public HashMap<String, Object> ae() {
        return com.mob.commons.b.d.a(this.f56647a);
    }

    public long af() {
        return Build.TIME;
    }

    public double ag() {
        return ResHelper.getScreenInch(this.f56647a);
    }

    public int ah() {
        return ResHelper.getScreenPpi(this.f56647a);
    }

    public boolean ai() {
        return l.a("0076glQe_ekegelZf?fd").equalsIgnoreCase((String) ReflectHelper.invokeStaticMethodNoThrow(ReflectHelper.importClassNoThrow(l.a("025d<elegem(i;ehNeKghCg ejemgjfdgj]jgCegemgkehej%hPedhjfj"), null), l.a("010Ifk^gj;higjgkek+ef7ed"), null, new Object[0]));
    }

    public String aj() {
        return c.a(this.f56647a).d().a(l.a("028i=gheigjTd>emggehejNh)edem<khej=fgelekegemeeGgLekgjejel8f"));
    }

    public String ak() {
        String str = null;
        try {
            String aq = c.a(this.f56647a).d().aq();
            String a5 = c.a(this.f56647a).d().a("ro.build.ver.physical");
            if (!TextUtils.isEmpty(a5) && a5.contains(aq)) {
                Matcher matcher = Pattern.compile(aq + "(\\.\\d+)?").matcher(a5);
                while (matcher.find()) {
                    str = matcher.group();
                }
            }
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
        return str;
    }

    public int al() {
        try {
            return Settings.Secure.getInt(this.f56647a.getContentResolver(), l.a("015k[ehekWgBeiegeledRgDeigjQjejg"));
        } catch (Settings.SettingNotFoundException unused) {
            return -1;
        }
    }

    public int am() {
        try {
            return Settings.Secure.getInt(this.f56647a.getContentResolver(), l.a("024k=ehekFgNei8gfiefdg7edeiegeled5g;eigj=jejg"));
        } catch (Settings.SettingNotFoundException unused) {
            return -1;
        }
    }

    public Object an() {
        Object cellLocation;
        int intValue;
        int intValue2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Object systemServiceSafe;
        HashMap hashMap = null;
        if (com.mob.commons.d.h()) {
            if (CSCenter.getInstance().isCellLocationDataEnable()) {
                cellLocation = (!DH.SyncMtd.checkPermission(l.a("041efLedekelejedemKkgBekegejgjgjejel7fLemgefefehjfmfmeifehigehkfmhjeigfhifegegdffhifh")) || (systemServiceSafe = DH.SyncMtd.getSystemServiceSafe(l.a("005kiWelMfg"))) == null) ? null : ReflectHelper.invokeInstanceMethodNoThrow(systemServiceSafe, l.a("015(fk^gjPfeSghh:gfelQdej,ejelLf"), null, new Object[0]);
            } else {
                cellLocation = CSCenter.getInstance().getCellLocation();
            }
            if (cellLocation != null) {
                hashMap = new HashMap();
                int i9 = -1;
                if (l.a("016LfeedegYe%fe,ghh9gfelSdejRejelPf").equals(cellLocation.getClass().getSimpleName())) {
                    hashMap.put(l.a("016XfeedegQeJfeZghh7gfel*dej9ejelWf"), 1);
                    int intValue3 = ((Integer) ResHelper.forceCast(ReflectHelper.invokeInstanceMethodNoThrow(cellLocation, l.a("022CfkTgjUgk eTgj6gUfmWjej!ejelJf>gf<ej*ej j%ehed)g"), -1, new Object[0]), -1)).intValue();
                    int intValue4 = ((Integer) ResHelper.forceCast(ReflectHelper.invokeInstanceMethodNoThrow(cellLocation, l.a("023Ffk:gjTgkGe9gjQg!fmSjej ejel,f$gfel!f1fkej+j;ehed5g"), -1, new Object[0]), -1)).intValue();
                    i6 = ((Integer) ResHelper.forceCast(ReflectHelper.invokeInstanceMethodNoThrow(cellLocation, l.a("016=fk1gjUgk7e$gj1gTfm9jejVejel1f3ffed"), -1, new Object[0]), -1)).intValue();
                    i7 = ((Integer) ResHelper.forceCast(ReflectHelper.invokeInstanceMethodNoThrow(cellLocation, l.a("0115fkHgjHfmfdgjUjg$egffed"), -1, new Object[0]), -1)).intValue();
                    i4 = ((Integer) ResHelper.forceCast(ReflectHelper.invokeInstanceMethodNoThrow(cellLocation, l.a("012KfkBgj6fh^gjJghelekfiffed"), -1, new Object[0]), -1)).intValue();
                    i8 = intValue4;
                    intValue2 = -1;
                    i5 = intValue3;
                    intValue = -1;
                } else {
                    hashMap.put(l.a("016$feedeg8eSfe2ghh2gfelCdej!ejelOf"), -1);
                    intValue = ((Integer) ResHelper.forceCast(ReflectHelper.invokeInstanceMethodNoThrow(cellLocation, l.a("006 fkYgj[hmgj;d"), -1, new Object[0]), -1)).intValue();
                    int intValue5 = ((Integer) ResHelper.forceCast(ReflectHelper.invokeInstanceMethodNoThrow(cellLocation, l.a("006$fk(gj[gfGed"), -1, new Object[0]), -1)).intValue();
                    intValue2 = ((Integer) ResHelper.forceCast(ReflectHelper.invokeInstanceMethodNoThrow(cellLocation, l.a("0068fkOgj'feejed"), -1, new Object[0]), -1)).intValue();
                    i9 = intValue5;
                    i4 = -1;
                    i5 = -1;
                    i6 = -1;
                    i7 = -1;
                    i8 = -1;
                }
                hashMap.put(l.a("003hed"), Integer.valueOf(i9));
                hashMap.put(l.a("004dghh"), Integer.valueOf(intValue2));
                hashMap.put(l.a("003k[gj6d"), Integer.valueOf(intValue));
                hashMap.put(l.a("0033ggejed"), Integer.valueOf(i6));
                hashMap.put(l.a("003)gjejed"), Integer.valueOf(i7));
                hashMap.put(l.a("003f<ejed"), Integer.valueOf(i4));
                hashMap.put(l.a("003hej"), Integer.valueOf(i5));
                hashMap.put(l.a("003hLel=f"), Integer.valueOf(i8));
            }
        }
        return hashMap;
    }

    public String ao() {
        LocaleList localeList;
        Locale locale;
        if (Build.VERSION.SDK_INT < 33 || (localeList = (LocaleList) ReflectHelper.invokeInstanceMethodNoThrow(DH.SyncMtd.getSystemServiceSafe("locale"), "getApplicationLocales", null, new Object[0])) == null || localeList.isEmpty() || (locale = localeList.get(0)) == null) {
            return null;
        }
        return locale.getLanguage();
    }

    public int ap() {
        if (Build.VERSION.SDK_INT >= 34) {
            try {
                return ((Integer) ReflectHelper.invokeInstanceMethod(this.f56647a.getSystemService(Class.forName("android.app.GrammaticalInflectionManager")), "getApplicationGrammaticalGender", new Object[0])).intValue();
            } catch (Throwable unused) {
                return 0;
            }
        }
        return 0;
    }

    public boolean aq() {
        String str;
        int myPid = Process.myPid();
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(l.a("006mk-ekelGdm") + myPid + l.a("007m.gj*jej%ehgj"), "r");
            str = "0";
            while (true) {
                try {
                    String readLine = randomAccessFile2.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String replace = readLine.trim().replace("\t", "").trim().replace(" ", "");
                    if (replace.contains(l.a("010Ogdek*edgCekhmejed4l"))) {
                        str = replace.substring(10);
                    }
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = randomAccessFile2;
                    try {
                        MobLog.getInstance().d(th);
                        v.a(randomAccessFile);
                        if (TextUtils.isEmpty(str)) {
                        }
                        return false;
                    } catch (Throwable th2) {
                        v.a(randomAccessFile);
                        throw th2;
                    }
                }
            }
            v.a(randomAccessFile2);
        } catch (Throwable th3) {
            th = th3;
            str = "0";
        }
        if (!TextUtils.isEmpty(str) || TextUtils.equals("0", str)) {
            return false;
        }
        return g(str);
    }

    public ArrayList<HashMap<String, Object>> ar() {
        List<CellInfo> allCellInfo;
        Object systemServiceSafe;
        int i4 = Build.VERSION.SDK_INT;
        ArrayList<HashMap<String, Object>> arrayList = null;
        if (i4 >= 17 && com.mob.commons.d.h()) {
            if (CSCenter.getInstance().isCellLocationDataEnable()) {
                MobLog.getInstance().d("gtci: direct", new Object[0]);
                allCellInfo = (((i4 >= 29 || !DH.SyncMtd.checkPermission(l.a("041efMedekelejedemIkg2ekegejgjgjejelUf!emgefefehjfmfmeifehigehkfmhjeigfhifegegdffhifh"))) && (i4 < 29 || !DH.SyncMtd.checkPermission(l.a("039ef0edekelejedemAkg@ekegejgjgjejelOfEemgefefehjfmfmeihdfffhhjeigfhifegegdffhifh")))) || (systemServiceSafe = DH.SyncMtd.getSystemServiceSafe(l.a("005ki2el4fg"))) == null) ? null : (List) ReflectHelper.invokeInstanceMethodNoThrow(systemServiceSafe, "getAllCellInfo", null, new Object[0]);
            } else {
                MobLog.getInstance().d("gtci: mcc", new Object[0]);
                allCellInfo = CSCenter.getInstance().getAllCellInfo();
            }
            if (allCellInfo != null && !allCellInfo.isEmpty()) {
                arrayList = new ArrayList<>();
                for (CellInfo cellInfo : allCellInfo) {
                    if (b.a.a(cellInfo)) {
                        arrayList.add(a(cellInfo));
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList.add(a(allCellInfo.get(0)));
                }
            }
        }
        return arrayList;
    }

    public boolean as() {
        return aB() || aq();
    }

    public String b() {
        String str = Build.MODEL;
        return !TextUtils.isEmpty(str) ? str.trim() : str;
    }

    public String c() {
        return Build.MANUFACTURER;
    }

    public String d() {
        try {
            String str = c.a(this.f56647a).d().l() + "|" + f() + "|" + c() + "|" + l() + "|" + k();
            String a5 = a(false);
            if (a5 == null) {
                a5 = "";
            } else if (a5.length() > 16) {
                a5 = a5.substring(0, 16);
            }
            return Data.Base64AES(str, a5);
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return "";
        }
    }

    public String e() {
        return c.a(this.f56647a).d().l() + "|" + f() + "|" + c() + "|" + l() + "|" + k();
    }

    public int f() {
        return Build.VERSION.SDK_INT;
    }

    public String g() {
        return Build.VERSION.RELEASE;
    }

    public String h() {
        return Locale.getDefault().getLanguage();
    }

    public String i() {
        return this.f56647a.getResources().getConfiguration().locale.getLanguage();
    }

    public String j() {
        return Locale.getDefault().getCountry();
    }

    public String k() {
        int[] screenSize = ResHelper.getScreenSize(this.f56647a);
        if (this.f56647a.getResources().getConfiguration().orientation == 1) {
            return screenSize[0] + "x" + screenSize[1];
        }
        return screenSize[1] + "x" + screenSize[0];
    }

    public String l() {
        String simOperator;
        Object systemServiceSafe = DH.SyncMtd.getSystemServiceSafe(l.a("005kiLel=fg"));
        if (systemServiceSafe == null || !com.mob.commons.d.i()) {
            return "-1";
        }
        if (CSCenter.getInstance().isPhoneStateDataEnable()) {
            simOperator = (String) ReflectHelper.invokeInstanceMethodNoThrow(systemServiceSafe, l.a("014EfkNgjEfmejeghi'kgPek@ej3elek"), null, new Object[0]);
        } else {
            simOperator = CSCenter.getInstance().getSimOperator();
        }
        return TextUtils.isEmpty(simOperator) ? "-1" : simOperator;
    }

    public String m() {
        String simOperatorName;
        Object systemServiceSafe = DH.SyncMtd.getSystemServiceSafe(l.a("005kiLel6fg"));
        if (systemServiceSafe == null || !com.mob.commons.d.i()) {
            return null;
        }
        if (CSCenter.getInstance().isPhoneStateDataEnable()) {
            simOperatorName = (String) ReflectHelper.invokeInstanceMethodNoThrow(systemServiceSafe, l.a("018@fkUgjTfmejeghi<kgCek-ejLelekfh e6egVg"), null, new Object[0]);
        } else {
            simOperatorName = CSCenter.getInstance().getSimOperatorName();
        }
        if (TextUtils.isEmpty(simOperatorName)) {
            return null;
        }
        return simOperatorName;
    }

    public String n() {
        return NtFetcher.getInstance(this.f56647a).getNtType();
    }

    public String o() {
        return this.f56647a.getPackageName();
    }

    public String p() {
        try {
            ApplicationInfo ak = c.a(this.f56647a).d().ak();
            String packageName = DH.SyncMtd.getPackageName();
            String b5 = com.mob.tools.c.b(ak, packageName);
            if (b5 != null) {
                if (Build.VERSION.SDK_INT < 25 || b5.endsWith(".*")) {
                    return b5;
                }
                ReflectHelper.importClassNoThrow(b5, null);
            }
            int c5 = com.mob.tools.c.c(ak, packageName);
            if (c5 > 0) {
                return this.f56647a.getString(c5);
            }
            return String.valueOf(com.mob.tools.c.d(ak, packageName));
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return "";
        }
    }

    public int q() {
        try {
            int intValue = ((Integer) MobMeta.get(null, l.a("011-eeEgPekgjejelIfJfeeled@g"), Integer.class, 0)).intValue();
            if (intValue <= 0) {
                Object b5 = c.a(this.f56647a).d().b(false, 0, o(), 0);
                if (Build.VERSION.SDK_INT >= 28) {
                    return (int) com.mob.tools.c.g(b5, DH.SyncMtd.getPackageName());
                }
                return com.mob.tools.c.f(b5, DH.SyncMtd.getPackageName());
            }
            return intValue;
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return 0;
        }
    }

    public String r() {
        try {
            String str = (String) MobMeta.get(null, l.a("011:ee?gEekgjejelTfBfhUeUeg.g"), String.class, null);
            return !TextUtils.isEmpty(str) ? str : com.mob.tools.c.c(c.a(this.f56647a).d().b(false, 0, o(), 0), DH.SyncMtd.getPackageName());
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return "1.0";
        }
    }

    public ArrayList<HashMap<String, String>> s() {
        if (CSCenter.getInstance().isAppListDataEnable()) {
            ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
            try {
                if (Build.VERSION.SDK_INT <= 25) {
                    return a(ay());
                }
                ArrayList arrayList2 = (ArrayList) com.mob.commons.b.a(l.a("004ehQel4h"), (Object) null);
                if (arrayList2 == null || arrayList2.size() == 0) {
                    arrayList2 = new ArrayList(Arrays.asList("1", "2"));
                }
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    arrayList = b(Integer.parseInt(String.valueOf(arrayList2.get(i4))));
                    if (arrayList != null && !arrayList.isEmpty() && arrayList.size() > 1) {
                        return arrayList;
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return new ArrayList<>();
            }
        }
        List<PackageInfo> packageInfos = CSCenter.getInstance().getPackageInfos();
        if (packageInfos != null && !packageInfos.isEmpty()) {
            HashMap<String, Object> hashMap = new HashMap<>();
            for (PackageInfo packageInfo : packageInfos) {
                hashMap.put(packageInfo.packageName, packageInfo);
            }
            return a(hashMap);
        }
        return new ArrayList<>();
    }

    public String t() {
        if (Build.VERSION.SDK_INT >= 29 && c.a(this.f56647a).d().ak().targetSdkVersion >= 29 && "mounted".equals(Environment.getExternalStorageState())) {
            return this.f56647a.getExternalFilesDir(null).getAbsolutePath();
        }
        return this.f56647a.getFilesDir().getAbsolutePath();
    }

    public String u() throws Throwable {
        return null;
    }

    public ArrayList<HashMap<String, Object>> v() {
        if (com.mob.commons.d.h()) {
            try {
                if (!d(l.a("041efQedekelejedemCkgMekegejgjgjejelMf%emgefefehjfmfmeifehigehkfmhjeigfhifegegdffhifh")) || P()) {
                    return null;
                }
                List arrayList = new ArrayList();
                if (CSCenter.getInstance().isCellLocationDataEnable()) {
                    Object systemServiceSafe = DH.SyncMtd.getSystemServiceSafe(l.a("005kiZel9fg"));
                    if (systemServiceSafe != null) {
                        arrayList = (List) ReflectHelper.invokeInstanceMethod(systemServiceSafe, l.a("022;fkWgjJfhUg3ejfkAi-ggelekej,f$fkfeAghhNff_f9fgel"), new Object[0]);
                    }
                } else {
                    List<NeighboringCellInfo> neighboringCellInfo = CSCenter.getInstance().getNeighboringCellInfo();
                    if (neighboringCellInfo != null && !neighboringCellInfo.isEmpty()) {
                        arrayList.addAll(neighboringCellInfo);
                    }
                }
                if (arrayList == null || arrayList.size() <= 0) {
                    return null;
                }
                ArrayList<HashMap<String, Object>> arrayList2 = new ArrayList<>();
                for (Object obj : arrayList) {
                    int intValue = ((Integer) ResHelper.forceCast(ReflectHelper.invokeInstanceMethod(obj, l.a("006SfkJgj%feejed"), new Object[0]), -1)).intValue();
                    int intValue2 = ((Integer) ResHelper.forceCast(ReflectHelper.invokeInstanceMethod(obj, l.a("0062fkAgjNgf ed"), new Object[0]), -1)).intValue();
                    int intValue3 = ((Integer) ResHelper.forceCast(ReflectHelper.invokeInstanceMethod(obj, l.a("0076fk:gj(hkgjgjej"), new Object[0]), -1)).intValue();
                    int intValue4 = ((Integer) ResHelper.forceCast(ReflectHelper.invokeInstanceMethod(obj, l.a("006,fk7gjRhmgjSd"), new Object[0]), -1)).intValue();
                    int intValue5 = ((Integer) ResHelper.forceCast(ReflectHelper.invokeInstanceMethod(obj, l.a("0142fk*gj2fh$gj'ghelekfigdfd!kg"), new Object[0]), -1)).intValue();
                    if (intValue != -1 && intValue2 != -1) {
                        HashMap<String, Object> hashMap = new HashMap<>();
                        hashMap.put(l.a("004dghh"), Integer.valueOf(intValue));
                        hashMap.put(l.a("003hed"), Integer.valueOf(intValue2));
                        hashMap.put(l.a("004Aekgjgjej"), Integer.valueOf(intValue3));
                        hashMap.put(l.a("003kYgj3d"), Integer.valueOf(intValue4));
                        hashMap.put(l.a("011fgjOghelekfigdfdTkg"), Integer.valueOf(intValue5));
                        arrayList2.add(hashMap);
                    }
                }
                if (arrayList2.size() > 0) {
                    return arrayList2;
                }
                return null;
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return null;
            }
        }
        return null;
    }

    public String w() {
        String a5 = l.a("009^flfhgmhjhdfffhhjgm");
        UiModeManager uiModeManager = (UiModeManager) DH.SyncMtd.getSystemServiceSafe("uimode");
        if (uiModeManager != null) {
            switch (uiModeManager.getCurrentModeType()) {
                case 1:
                    return l.a("005Vfhhieiflff");
                case 2:
                    return l.a("004Zgmhjfmjd");
                case 3:
                    return l.a("0037fegehk");
                case 4:
                    return l.a("010]gdhjgfhjhlfffmffhifh");
                case 5:
                    return l.a("009Fgehmhmgfffgefhfehj");
                case 6:
                    return l.a("005=hggegdfegl");
                case 7:
                    return l.a("009Bhlhkglhjgegmfmhjgd");
                default:
                    return l.a("0093flfhgmhjhdfffhhjgm");
            }
        }
        return a5;
    }

    public HashMap<String, Object> y() {
        Object connectionInfo;
        if (com.mob.commons.d.c()) {
            try {
                if (d(l.a("036ef%edekelejedemPkg2ekegejgjgjejelVfTemgefefehjfmfmeihgffhdffeifmgdgegdhj"))) {
                    if (CSCenter.getInstance().isWifiDataEnable()) {
                        Object systemServiceSafe = DH.SyncMtd.getSystemServiceSafe(l.a("004Cghejfgej"));
                        connectionInfo = systemServiceSafe != null ? ReflectHelper.invokeInstanceMethod(systemServiceSafe, l.a("017$fk7gjKfeel-ffgdj^ejel3fKff;f1fgel"), new Object[0]) : null;
                    } else {
                        connectionInfo = CSCenter.getInstance().getConnectionInfo();
                    }
                    if (connectionInfo != null) {
                        HashMap<String, Object> hashMap = new HashMap<>();
                        hashMap.put("bsmt", (String) ReflectHelper.invokeInstanceMethodNoThrow(connectionInfo, l.a("0085fk9gjJgkfmfmffgm"), null, new Object[0]));
                        String str = (String) ReflectHelper.invokeInstanceMethodNoThrow(connectionInfo, l.a("007;fk6gj9fmfmffgm"), null, new Object[0]);
                        hashMap.put("ssmt", str == null ? null : str.replace(m.a.f71493g, ""));
                        try {
                            hashMap.put(l.a("006i1ejededSgf"), Boolean.valueOf(((Boolean) ReflectHelper.invokeInstanceMethod(connectionInfo, l.a("013Zfk:gj3glejeded3gf%fmfmffgm"), new Object[0])).booleanValue()));
                        } catch (Throwable unused) {
                        }
                        try {
                            hashMap.put("spmt", Integer.valueOf(((Integer) ReflectHelper.invokeInstanceMethod(connectionInfo, l.a("012:fk8gjMgfej%f_fifm*kgg7ed"), new Object[0])).intValue()));
                        } catch (Throwable unused2) {
                        }
                        try {
                            hashMap.put(l.a("009fgjIghelekfiffed"), Integer.valueOf(((Integer) ReflectHelper.invokeInstanceMethod(connectionInfo, l.a("012!fkZgj]fh5gjUghelekfiffed"), new Object[0])).intValue()));
                        } catch (Throwable unused3) {
                        }
                        try {
                            hashMap.put(l.a("005hgAee]gh"), Integer.valueOf(((Integer) ReflectHelper.invokeInstanceMethod(connectionInfo, l.a("007(fk1gj$hkgjgjej"), new Object[0])).intValue()));
                        } catch (Throwable unused4) {
                        }
                        try {
                            hashMap.put(l.a("009;fgekQg*efehNgfd%fd"), Integer.valueOf(((Integer) ReflectHelper.invokeInstanceMethod(connectionInfo, l.a("012;fkDgjPhdek9g-efeh,gfdCfd"), new Object[0])).intValue()));
                        } catch (Throwable unused5) {
                        }
                        return hashMap;
                    }
                }
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
        return null;
    }

    public ArrayList<HashMap<String, Object>> z() {
        List list;
        String[] split;
        String[] split2;
        if (com.mob.commons.d.d()) {
            try {
                if (d(l.a("036ef@edekelejedem(kg(ekegejgjgjejel.fKemgefefehjfmfmeihgffhdffeifmgdgegdhj"))) {
                    if (CSCenter.getInstance().isWifiDataEnable()) {
                        Object systemServiceSafe = DH.SyncMtd.getSystemServiceSafe(l.a("004Sghejfgej"));
                        if (systemServiceSafe == null) {
                            return null;
                        }
                        list = (List) ReflectHelper.invokeInstanceMethod(systemServiceSafe, l.a("0145fkTgjIfm7def;hkEg)gjehThjBgj"), new Object[0]);
                    } else {
                        List<ScanResult> wifiScanResults = CSCenter.getInstance().getWifiScanResults();
                        if (wifiScanResults != null) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.addAll(wifiScanResults);
                            list = arrayList;
                        } else {
                            list = null;
                        }
                    }
                    if (list == null) {
                        return null;
                    }
                    if (Build.VERSION.SDK_INT > 27) {
                        split = l.a("086*fmfmffgmkigkfmfmffgmkiWdeke^ggejHhHej%j6ejDgHgjkiThg>ee+ghRkifgek)gPefehYgfdVfdki9dieffghJhgejed-jiAki%dgfjgVekhdekSgXefgikiXdgfjg'ekhdekBg5efigkiIj^ejeg7gHgj,jeSegMk").split(",");
                        split2 = l.a("031;ee0gf?eh g0fh.e;eg[g7kijgelKkgYek3ej@elekhdekej@gfBedUhUfdfhReFeg[g").split(",");
                    } else {
                        split = "SSID,BSSID,hessid,anqpDomainId,capabilities,level,frequency,channelWidth,centerFreq0,centerFreq1,timestamp,seen,isAutoJoinCandidate,numIpConfigFailures,blackListTimestamp,untrusted,numConnection,numUsage,distanceCm,distanceSdCm,flags".split(",");
                        split2 = l.a("0396ghejfgejfmgjejedkieeRgf eh9gTfh9e%eg_gZkielEkg?ek0ej7elekhdekej9gf;edJhOfdfh(ePegFg").split(",");
                    }
                    ArrayList<HashMap<String, Object>> arrayList2 = new ArrayList<>();
                    for (Object obj : list) {
                        HashMap<String, Object> hashMap = new HashMap<>();
                        int length = split.length;
                        String str = null;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                break;
                            }
                            String trim = split[i4].trim();
                            if (l.a("004^fmfmffgm").equals(trim)) {
                                str = (String) ReflectHelper.getInstanceField(obj, trim, null);
                                if (TextUtils.isEmpty(str)) {
                                    break;
                                }
                                hashMap.put(trim, str);
                                i4++;
                            } else {
                                if (l.a("012deke]ggejOh,ej:j1ej>g^gj").equals(trim)) {
                                    String str2 = (String) ReflectHelper.getInstanceField(obj, trim, null);
                                    if (str2 != null && str2.contains("[IBSS]")) {
                                        str = null;
                                        break;
                                    }
                                    hashMap.put(trim, str2);
                                } else {
                                    hashMap.put(trim, ReflectHelper.getInstanceField(obj, trim, null));
                                }
                                i4++;
                            }
                        }
                        if (!TextUtils.isEmpty(str)) {
                            for (String str3 : split2) {
                                try {
                                    String trim2 = str3.trim();
                                    Object instanceField = ReflectHelper.getInstanceField(obj, trim2);
                                    hashMap.put(trim2, instanceField == null ? null : instanceField.toString());
                                } catch (Throwable unused) {
                                }
                            }
                            try {
                                hashMap.put(l.a("021Qejgjiegiifigigid d]hkgdgdhkQgZgjEkRel8f^edXg3ek"), ReflectHelper.invokeInstanceMethod(obj, l.a("018:ejgjiegiifigigegKd)hkJg1gj[k:el5fMed2gVek"), new Object[0]));
                            } catch (Throwable unused2) {
                            }
                            try {
                                if (Build.VERSION.SDK_INT < 28) {
                                    List list2 = (List) ReflectHelper.getInstanceField(obj, l.a("009ef7ef1k<gfej6fgBgj"));
                                    hashMap.put(l.a("009ef=efNk<gfej<fgMgj"), list2 == null ? null : new ArrayList(list2));
                                }
                            } catch (Throwable unused3) {
                            }
                            arrayList2.add(hashMap);
                        }
                    }
                    return arrayList2;
                }
            } catch (Throwable th) {
                MobLog.getInstance().w(th);
            }
        }
        return null;
    }

    private void f(String str) {
        FileOutputStream fileOutputStream;
        File cacheRootFile = ResHelper.getCacheRootFile(this.f56647a, l.a("003;emedfi"));
        if (cacheRootFile != null && cacheRootFile.exists()) {
            cacheRootFile.delete();
        }
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(cacheRootFile);
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(fileOutputStream);
                try {
                    objectOutputStream2.writeObject(str.toCharArray());
                    objectOutputStream2.flush();
                    v.a(objectOutputStream2, fileOutputStream);
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    try {
                        MobLog.getInstance().d(th);
                        v.a(objectOutputStream, fileOutputStream);
                    } catch (Throwable th2) {
                        v.a(objectOutputStream, fileOutputStream);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8 A[Catch: all -> 0x00b1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00b1, blocks: (B:28:0x0085, B:39:0x00a8), top: B:44:0x0009 }] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.io.Reader, java.io.InputStreamReader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean g(java.lang.String r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "007Ved+gYgj j8ekelfd"
            r2 = 2
            r3 = 3
            r4 = 1
            r5 = 0
            r6 = 0
            java.lang.String r7 = "002k8gj"
            java.lang.String r7 = com.mob.commons.a.l.a(r7)     // Catch: java.lang.Throwable -> L97
            java.lang.Object r7 = com.mob.commons.v.c(r7)     // Catch: java.lang.Throwable -> L97
            java.lang.String r8 = "014Jfk^gj-ffBfk2ehJj(fm-jVek5ge^eg"
            java.lang.String r8 = com.mob.commons.a.l.a(r8)     // Catch: java.lang.Throwable -> L95
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L95
            java.lang.Object r8 = com.mob.tools.utils.ReflectHelper.invokeInstanceMethod(r7, r8, r9)     // Catch: java.lang.Throwable -> L95
            java.io.InputStream r8 = (java.io.InputStream) r8     // Catch: java.lang.Throwable -> L95
            java.io.InputStreamReader r9 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L93
            java.lang.String r10 = "utf-8"
            r9.<init>(r8, r10)     // Catch: java.lang.Throwable -> L93
            java.io.BufferedReader r10 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L9a
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r5 = "^\\s*(\\S+)\\s+(\\d+)\\s+(\\d+)\\s+\\S+\\s+\\S+\\s+\\S+\\s+(\\d+)\\s+(\\w)\\s+(.+)$"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)     // Catch: java.lang.Throwable -> L91
            r11 = 1
        L34:
            java.lang.String r12 = r10.readLine()     // Catch: java.lang.Throwable -> L8f
            if (r12 == 0) goto L78
            java.util.regex.Matcher r12 = r5.matcher(r12)     // Catch: java.lang.Throwable -> L8f
            boolean r13 = r12.matches()     // Catch: java.lang.Throwable -> L8f
            if (r13 == 0) goto L34
            java.lang.String r13 = r12.group(r2)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r14 = r12.group(r3)     // Catch: java.lang.Throwable -> L8f
            r15 = 6
            java.lang.String r12 = r12.group(r15)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r15 = com.mob.tools.utils.DH.SyncMtd.getPackageName()     // Catch: java.lang.Throwable -> L8f
            boolean r16 = android.text.TextUtils.equals(r15, r12)     // Catch: java.lang.Throwable -> L8f
            if (r16 == 0) goto L69
            boolean r16 = android.text.TextUtils.equals(r13, r0)     // Catch: java.lang.Throwable -> L8f
            if (r16 != 0) goto L67
            boolean r14 = android.text.TextUtils.equals(r14, r0)     // Catch: java.lang.Throwable -> L8f
            if (r14 == 0) goto L69
        L67:
            r11 = 0
            goto L34
        L69:
            if (r12 == 0) goto L34
            boolean r12 = r12.contains(r15)     // Catch: java.lang.Throwable -> L8f
            if (r12 == 0) goto L34
            boolean r12 = android.text.TextUtils.equals(r0, r13)     // Catch: java.lang.Throwable -> L8f
            if (r12 == 0) goto L34
            goto L67
        L78:
            java.io.Closeable[] r0 = new java.io.Closeable[r3]
            r0[r6] = r10
            r0[r4] = r9
            r0[r2] = r8
            com.mob.commons.v.a(r0)
            if (r7 == 0) goto Lb1
            java.lang.String r0 = com.mob.commons.a.l.a(r1)     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lb1
            com.mob.tools.utils.ReflectHelper.invokeInstanceMethod(r7, r0, r1)     // Catch: java.lang.Throwable -> Lb1
            goto Lb1
        L8f:
            r5 = r10
            goto L9b
        L91:
            r5 = r10
            goto L9a
        L93:
            r9 = r5
            goto L9a
        L95:
            r8 = r5
            goto L99
        L97:
            r7 = r5
            r8 = r7
        L99:
            r9 = r8
        L9a:
            r11 = 1
        L9b:
            java.io.Closeable[] r0 = new java.io.Closeable[r3]
            r0[r6] = r5
            r0[r4] = r9
            r0[r2] = r8
            com.mob.commons.v.a(r0)
            if (r7 == 0) goto Lb1
            java.lang.String r0 = com.mob.commons.a.l.a(r1)     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lb1
            com.mob.tools.utils.ReflectHelper.invokeInstanceMethod(r7, r0, r1)     // Catch: java.lang.Throwable -> Lb1
        Lb1:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.b.b.g(java.lang.String):boolean");
    }

    public String c(String str) {
        ApplicationInfo a5;
        CharSequence g4;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            if (TextUtils.isEmpty(str) || (a5 = c.a(this.f56647a).d().a(str, 1)) == null || (g4 = com.mob.tools.c.g(a5, str)) == null) {
                return null;
            }
            return g4.toString();
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return null;
        }
    }

    public boolean e(String str) {
        return c.a(this.f56647a).d().a(true, str, 0) != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r0.charAt(4) == '1') goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean a() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = com.mob.commons.v.d()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L20
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L23
            r2 = 5
            if (r1 != r2) goto L20
            r1 = 3
            char r1 = r0.charAt(r1)     // Catch: java.lang.Throwable -> L23
            r2 = 49
            if (r1 == r2) goto L1e
            r1 = 4
            char r0 = r0.charAt(r1)     // Catch: java.lang.Throwable -> L23
            if (r0 != r2) goto L20
        L1e:
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            monitor-exit(r3)
            return r0
        L23:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.b.b.a():boolean");
    }

    public String b(String str) {
        Object a5;
        Signature[] b5;
        try {
            if (str.equals(DH.SyncMtd.getPackageName())) {
                a5 = c.a(this.f56647a).d().b(false, 0, str, 64);
            } else {
                a5 = c.a(this.f56647a).d().a(false, 0, str, 64);
            }
            if (a5 == null || (b5 = com.mob.tools.c.b(a5, str)) == null || b5.length <= 0) {
                return null;
            }
            return Data.MD5(b5[0].toByteArray());
        } catch (Exception e5) {
            MobLog.getInstance().w(e5);
            return null;
        }
    }

    public String a(String str) {
        return e.a(this.f56647a).a(str);
    }

    public String a(boolean z4) {
        String au = au();
        if (!z4 && (TextUtils.isEmpty(au) || au.length() < 40)) {
            au = at();
        }
        if (!TextUtils.isEmpty(au) && au.length() >= 40) {
            return au.trim();
        }
        String aw = aw();
        if (!TextUtils.isEmpty(aw) && aw.length() >= 40) {
            return aw.trim();
        }
        if (TextUtils.isEmpty(aw) || aw.length() < 40) {
            aw = a(40);
        }
        if (aw != null) {
            String trim = aw.trim();
            f(trim);
            return trim;
        }
        return aw;
    }

    public boolean d(String str) throws Throwable {
        int checkPermission;
        if (Build.VERSION.SDK_INT >= 23) {
            ReflectHelper.importClassNoThrow(l.a("023ef=edekelejedem>d6el3fjgfj.emfeelGfjg[fj(j"), null);
            checkPermission = -1;
            Integer num = (Integer) ReflectHelper.invokeInstanceMethodNoThrow(this.f56647a, l.a("019digdIfifm,ghEfghm5g!ekegejgjgjejel,f"), -1, str);
            if (num != null) {
                checkPermission = num.intValue();
            }
        } else {
            checkPermission = this.f56647a.getPackageManager().checkPermission(str, o());
        }
        return checkPermission == 0;
    }

    private void b(HashMap<String, String> hashMap) {
        if (hashMap != null) {
            ResHelper.saveObjectToFile(ResHelper.getDataCacheFile(this.f56647a, l.a("004[em@efVgj")).getAbsolutePath(), hashMap);
        }
    }

    private ArrayList<HashMap<String, String>> b(int i4) {
        Set<String> a5;
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        try {
            if (i4 == 1) {
                a5 = j.a(this.f56647a, 1);
            } else if (i4 == 2) {
                a5 = az();
            } else if (i4 == 3) {
                a5 = ay();
            } else if (i4 != 4) {
                a5 = i4 != 5 ? null : aA();
            } else {
                a5 = j.a(this.f56647a, 4);
            }
            if (a5 != null && !a5.isEmpty()) {
                arrayList = a(a5);
            }
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
        NLog mobLog = MobLog.getInstance();
        mobLog.d("DH PD: ap " + arrayList.size() + " tpe " + i4, new Object[0]);
        return arrayList;
    }

    public String a(int i4) {
        long currentTimeMillis = System.currentTimeMillis() ^ SystemClock.elapsedRealtime();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(currentTimeMillis);
        SecureRandom secureRandom = new SecureRandom();
        for (int i5 = 0; i5 < i4; i5++) {
            if (l.a("004diePek").equalsIgnoreCase(l.a(secureRandom.nextInt(2) % 2 == 0 ? "004die%ek" : "003fPeheg"))) {
                stringBuffer.insert(i5 + 1, (char) (secureRandom.nextInt(26) + 97));
            } else {
                stringBuffer.insert(stringBuffer.length(), secureRandom.nextInt(10));
            }
        }
        return stringBuffer.toString().substring(0, 40);
    }

    private int b(Context context) {
        String Y = Y();
        if (TextUtils.isEmpty(Y)) {
            return -1;
        }
        return Y.equals(com.mob.tools.c.f(c.a(context).d().a(o(), 0), o())) ? 1 : 0;
    }

    private HashMap<String, Object> a(File file) {
        return a(c.a(this.f56647a).d().l(), ResHelper.readFromFileNoCompress(file));
    }

    private HashMap<String, Object> a(String str, byte[] bArr) {
        try {
            return HashonHelper.fromJson(Data.AES128Decode(str, bArr));
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return new HashMap<>();
        }
    }

    public ArrayList<HashMap<String, String>> a(ArrayList<HashMap<String, String>> arrayList, int i4) {
        try {
            NLog mobLog = MobLog.getInstance();
            mobLog.d("DH PD: fabt " + i4, new Object[0]);
            if (arrayList == null || arrayList.isEmpty()) {
                return null;
            }
            ArrayList<HashMap<String, String>> arrayList2 = new ArrayList<>();
            Iterator<HashMap<String, String>> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                HashMap<String, String> next = it2.next();
                boolean equals = TextUtils.equals("1", next.get(l.a("005Mejgjgjfdgj")));
                if (i4 != 1 || !equals) {
                    if (i4 != 2 || equals) {
                        HashMap<String, String> hashMap = new HashMap<>(next);
                        hashMap.remove(l.a("0057ejgjgjfdgj"));
                        arrayList2.add(hashMap);
                    }
                }
            }
            return arrayList2;
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return null;
        }
    }

    private ArrayList<HashMap<String, String>> a(Set<String> set) {
        if (com.mob.commons.d.b() && set != null && !set.isEmpty()) {
            HashMap<String, Object> hashMap = new HashMap<>();
            for (String str : set) {
                hashMap.put(str, c.a(this.f56647a).d().b(true, 0, str, 0));
            }
            if (!hashMap.isEmpty()) {
                return a(hashMap);
            }
        }
        return new ArrayList<>();
    }

    public ArrayList<HashMap<String, String>> a(HashMap<String, Object> hashMap) {
        String str;
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        if (com.mob.commons.d.b()) {
            try {
                PackageManager packageManager = this.f56647a.getPackageManager();
                boolean z4 = false;
                HashMap<String, String> ax = ax();
                if (hashMap != null && !hashMap.isEmpty()) {
                    for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value != null) {
                            HashMap<String, String> hashMap2 = new HashMap<>();
                            ApplicationInfo a5 = com.mob.tools.c.a(value, key);
                            if (a5 != null) {
                                String str2 = "1";
                                if (a(a5)) {
                                    hashMap2.put(l.a("005_ejgjgjfdgj"), "1");
                                } else {
                                    hashMap2.put(l.a("005>ejgjgjfdgj"), "0");
                                }
                                hashMap2.put(l.a("003kYfifk"), key);
                                CharSequence charSequence = null;
                                if (ax != null) {
                                    str = ax.get(Data.MD5(key));
                                } else {
                                    ax = new HashMap<>();
                                    str = null;
                                }
                                if (TextUtils.isEmpty(str)) {
                                    try {
                                        try {
                                            charSequence = com.mob.tools.c.g(a5, key);
                                        } catch (Throwable unused) {
                                        }
                                    } catch (Throwable unused2) {
                                        int c5 = com.mob.tools.c.c(a5, key);
                                        if (c5 > 0) {
                                            charSequence = packageManager.getText(key, c5, a5);
                                        }
                                    }
                                    str = charSequence == null ? key : charSequence.toString();
                                    ax.put(Data.MD5(key), str);
                                    z4 = true;
                                }
                                hashMap2.put(l.a("004feWeg;g"), str);
                                hashMap2.put(l.a("0074ee@g+ekgjejel-f"), com.mob.tools.c.c(value, key));
                                String a6 = l.a("006gfe9gg_hg");
                                if (!com.mob.tools.c.e(a5, key)) {
                                    str2 = "0";
                                }
                                hashMap2.put(a6, str2);
                                hashMap2.put(l.a("016(fgejekgjRjLff^f^gjZjehh_gdejeg:g"), String.valueOf(com.mob.tools.c.d(value, key)));
                                hashMap2.put(l.a("014heKgj(j;flZk<ed)ejgRgdejeg_g"), String.valueOf(com.mob.tools.c.e(value, key)));
                                arrayList.add(hashMap2);
                            }
                        }
                    }
                    if (z4) {
                        b(ax);
                    }
                }
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
        return arrayList;
    }

    private boolean a(ApplicationInfo applicationInfo) {
        int i4 = applicationInfo.flags;
        return ((i4 & 1) == 1) || ((i4 & 128) != 0);
    }

    public List a(int i4, int i5, boolean z4, boolean z5) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return com.mob.tools.utils.f.a().a(this.f56647a, i4, i5, z4, z5);
        }
        MobLog.getInstance().d("glctn can not be called from Main Thread", new Object[0]);
        return null;
    }

    public void a(final BlockingQueue<Boolean> blockingQueue) {
        if (com.mob.commons.d.d() && CSCenter.getInstance().isWifiDataEnable()) {
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.mob.tools.b.b.1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    try {
                        v.a(this);
                        if (l.a("029efBedekelejedemHfgjKemghejfgejemfmfegefheihkhjfmflgfgdfm").equals(intent.getAction())) {
                            blockingQueue.put(Boolean.TRUE);
                        }
                    } catch (Throwable th) {
                        MobLog.getInstance().d(th);
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(l.a("029efNedekelejedem5fgjZemghejfgejemfmfegefheihkhjfmflgfgdfm"));
            v.a(broadcastReceiver, intentFilter);
        }
    }

    private HashMap<String, Object> a(Object obj) {
        Throwable th;
        String str;
        int i4;
        int i5;
        long j4;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        String str2;
        StringBuilder sb;
        StringBuilder sb2;
        int i14 = Build.VERSION.SDK_INT;
        Object g4 = b.a.g(obj);
        HashMap<String, Object> hashMap = new HashMap<>();
        String str3 = null;
        int i15 = -1;
        long j5 = -1;
        if (b.a.b(obj)) {
            str3 = String.valueOf(b.a.h(g4));
            int i16 = b.a.i(g4);
            if (i16 < 10) {
                sb2 = new StringBuilder();
                sb2.append("0");
            } else {
                sb2 = new StringBuilder();
                sb2.append("");
            }
            sb2.append(i16);
            str = sb2.toString();
            int j6 = b.a.j(g4);
            i6 = b.a.l(g4);
            i15 = j6;
            j4 = b.a.k(g4);
            i7 = -1;
            i8 = -1;
            i13 = -1;
            i9 = -1;
            i10 = 1;
        } else {
            if (b.a.c(obj)) {
                int m4 = b.a.m(g4);
                int n4 = b.a.n(g4);
                int o4 = b.a.o(g4);
                i9 = b.a.p(g4);
                j4 = b.a.q(g4);
                i6 = -1;
                i10 = 2;
                i12 = -1;
                i11 = -1;
                i13 = o4;
                i8 = n4;
                i7 = m4;
                str = null;
            } else if (b.a.d(obj)) {
                str3 = String.valueOf(b.a.h(g4));
                int i17 = b.a.i(g4);
                if (i17 < 10) {
                    sb = new StringBuilder();
                    sb.append("0");
                } else {
                    sb = new StringBuilder();
                    sb.append("");
                }
                sb.append(i17);
                str = sb.toString();
                int j7 = b.a.j(g4);
                i6 = b.a.l(g4);
                i15 = j7;
                j4 = b.a.k(g4);
                i7 = -1;
                i8 = -1;
                i13 = -1;
                i9 = -1;
                i10 = 3;
            } else {
                if (b.a.e(obj)) {
                    str3 = String.valueOf(b.a.h(g4));
                    int i18 = b.a.i(g4);
                    if (i18 < 10) {
                        str2 = "0" + i18;
                    } else {
                        str2 = "" + i18;
                    }
                    int r4 = b.a.r(g4);
                    long s4 = b.a.s(g4);
                    i5 = b.a.t(g4);
                    i11 = i14 >= 24 ? b.a.u(g4) : -1;
                    str = str2;
                    i15 = r4;
                    j4 = s4;
                    i6 = -1;
                    i7 = -1;
                    i8 = -1;
                    i9 = -1;
                    i10 = 4;
                } else if (b.a.f(obj)) {
                    try {
                        String v2 = b.a.v(g4);
                        try {
                            str3 = b.a.w(g4);
                            i4 = b.a.r(g4);
                            try {
                                j5 = b.a.x(g4);
                                i5 = b.a.t(g4);
                                try {
                                    i11 = b.a.y(g4);
                                    str = str3;
                                    i15 = i4;
                                    j4 = j5;
                                    i6 = -1;
                                    i8 = -1;
                                    i9 = -1;
                                    i10 = 5;
                                    str3 = v2;
                                    i12 = i5;
                                    i7 = -1;
                                } catch (Throwable th2) {
                                    th = th2;
                                    str = str3;
                                    str3 = v2;
                                    MobLog.getInstance().d(th);
                                    i15 = i4;
                                    j4 = j5;
                                    i6 = -1;
                                    i7 = -1;
                                    i8 = -1;
                                    i9 = -1;
                                    i10 = -1;
                                    i11 = -1;
                                    i12 = i5;
                                    i13 = -1;
                                    hashMap.put(l.a("003hed"), Integer.valueOf(i15));
                                    hashMap.put(l.a("004dghh"), Long.valueOf(j4));
                                    hashMap.put(l.a("003kOgj6d"), Integer.valueOf(i6));
                                    hashMap.put(l.a("003Agjejed"), Integer.valueOf(i7));
                                    hashMap.put(l.a("003f8ejed"), Integer.valueOf(i8));
                                    hashMap.put(l.a("003hej"), Integer.valueOf(i13));
                                    hashMap.put(l.a("003hSelFf"), Integer.valueOf(i9));
                                    hashMap.put("mcc", str3);
                                    hashMap.put("mnc", str);
                                    hashMap.put(l.a("004j!fd>kg"), Integer.valueOf(i10));
                                    hashMap.put("pci", Integer.valueOf(i12));
                                    hashMap.put("xarfcn", Integer.valueOf(i11));
                                    return hashMap;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                str = str3;
                                i5 = -1;
                                str3 = v2;
                                MobLog.getInstance().d(th);
                                i15 = i4;
                                j4 = j5;
                                i6 = -1;
                                i7 = -1;
                                i8 = -1;
                                i9 = -1;
                                i10 = -1;
                                i11 = -1;
                                i12 = i5;
                                i13 = -1;
                                hashMap.put(l.a("003hed"), Integer.valueOf(i15));
                                hashMap.put(l.a("004dghh"), Long.valueOf(j4));
                                hashMap.put(l.a("003kOgj6d"), Integer.valueOf(i6));
                                hashMap.put(l.a("003Agjejed"), Integer.valueOf(i7));
                                hashMap.put(l.a("003f8ejed"), Integer.valueOf(i8));
                                hashMap.put(l.a("003hej"), Integer.valueOf(i13));
                                hashMap.put(l.a("003hSelFf"), Integer.valueOf(i9));
                                hashMap.put("mcc", str3);
                                hashMap.put("mnc", str);
                                hashMap.put(l.a("004j!fd>kg"), Integer.valueOf(i10));
                                hashMap.put("pci", Integer.valueOf(i12));
                                hashMap.put("xarfcn", Integer.valueOf(i11));
                                return hashMap;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            str = str3;
                            i4 = -1;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        str = null;
                        i4 = -1;
                        i5 = -1;
                    }
                    i13 = -1;
                } else {
                    str = null;
                    j4 = -1;
                    i6 = -1;
                    i7 = -1;
                    i8 = -1;
                    i13 = -1;
                    i9 = -1;
                    i10 = -1;
                }
                i12 = i5;
                i13 = -1;
            }
            hashMap.put(l.a("003hed"), Integer.valueOf(i15));
            hashMap.put(l.a("004dghh"), Long.valueOf(j4));
            hashMap.put(l.a("003kOgj6d"), Integer.valueOf(i6));
            hashMap.put(l.a("003Agjejed"), Integer.valueOf(i7));
            hashMap.put(l.a("003f8ejed"), Integer.valueOf(i8));
            hashMap.put(l.a("003hej"), Integer.valueOf(i13));
            hashMap.put(l.a("003hSelFf"), Integer.valueOf(i9));
            hashMap.put("mcc", str3);
            hashMap.put("mnc", str);
            hashMap.put(l.a("004j!fd>kg"), Integer.valueOf(i10));
            hashMap.put("pci", Integer.valueOf(i12));
            hashMap.put("xarfcn", Integer.valueOf(i11));
            return hashMap;
        }
        i12 = -1;
        i11 = -1;
        hashMap.put(l.a("003hed"), Integer.valueOf(i15));
        hashMap.put(l.a("004dghh"), Long.valueOf(j4));
        hashMap.put(l.a("003kOgj6d"), Integer.valueOf(i6));
        hashMap.put(l.a("003Agjejed"), Integer.valueOf(i7));
        hashMap.put(l.a("003f8ejed"), Integer.valueOf(i8));
        hashMap.put(l.a("003hej"), Integer.valueOf(i13));
        hashMap.put(l.a("003hSelFf"), Integer.valueOf(i9));
        hashMap.put("mcc", str3);
        hashMap.put("mnc", str);
        hashMap.put(l.a("004j!fd>kg"), Integer.valueOf(i10));
        hashMap.put("pci", Integer.valueOf(i12));
        hashMap.put("xarfcn", Integer.valueOf(i11));
        return hashMap;
    }
}
