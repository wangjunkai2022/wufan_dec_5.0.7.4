package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.aw;
import com.umeng.analytics.pro.bm;
import com.umeng.analytics.pro.ce;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes6.dex */
public class ImprintHandler implements FileLockCallback {

    /* renamed from: a  reason: collision with root package name */
    private static final String f64398a = "ImprintHandler";

    /* renamed from: k  reason: collision with root package name */
    private static Context f64405k = null;

    /* renamed from: l  reason: collision with root package name */
    private static FileLockUtil f64406l = null;

    /* renamed from: m  reason: collision with root package name */
    private static final int f64407m = 0;

    /* renamed from: n  reason: collision with root package name */
    private static final int f64408n = 1;

    /* renamed from: e  reason: collision with root package name */
    private com.umeng.commonsdk.statistics.internal.d f64411e;

    /* renamed from: h  reason: collision with root package name */
    private a f64412h = new a();

    /* renamed from: i  reason: collision with root package name */
    private com.umeng.commonsdk.statistics.proto.d f64413i = null;

    /* renamed from: b  reason: collision with root package name */
    private static Object f64399b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static final String f64400c = aw.b().b(aw.f63372c);

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f64401d = "pbl0".getBytes();

    /* renamed from: f  reason: collision with root package name */
    private static Map<String, ArrayList<UMImprintChangeCallback>> f64402f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private static Object f64403g = new Object();

    /* renamed from: j  reason: collision with root package name */
    private static ImprintHandler f64404j = null;

    /* renamed from: o  reason: collision with root package name */
    private static Map<String, UMImprintPreProcessCallback> f64409o = new HashMap();

    /* renamed from: p  reason: collision with root package name */
    private static Object f64410p = new Object();

    private ImprintHandler(Context context) {
        f64405k = context.getApplicationContext();
    }

    private static void a(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        synchronized (f64403g) {
            int i4 = 0;
            if (f64402f.containsKey(str)) {
                ArrayList<UMImprintChangeCallback> arrayList = f64402f.get(str);
                int size = arrayList.size();
                ULog.i("--->>> addCallback: before add: callbacks size is: " + size);
                while (i4 < size) {
                    if (uMImprintChangeCallback == arrayList.get(i4)) {
                        ULog.i("--->>> addCallback: callback has exist, just exit");
                        return;
                    }
                    i4++;
                }
                arrayList.add(uMImprintChangeCallback);
                ULog.i("--->>> addCallback: after add: callbacks size is: " + arrayList.size());
            } else {
                ArrayList<UMImprintChangeCallback> arrayList2 = new ArrayList<>();
                int size2 = arrayList2.size();
                ULog.i("--->>> addCallback: before add: callbacks size is: " + size2);
                while (i4 < size2) {
                    if (uMImprintChangeCallback == arrayList2.get(i4)) {
                        ULog.i("--->>> addCallback: callback has exist, just exit");
                        return;
                    }
                    i4++;
                }
                arrayList2.add(uMImprintChangeCallback);
                ULog.i("--->>> addCallback: after add: callbacks size is: " + arrayList2.size());
                f64402f.put(str, arrayList2);
            }
        }
    }

    private static void b(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (TextUtils.isEmpty(str) || uMImprintChangeCallback == null) {
            return;
        }
        synchronized (f64403g) {
            try {
                if (f64402f.containsKey(str)) {
                    ArrayList<UMImprintChangeCallback> arrayList = f64402f.get(str);
                    if (arrayList.size() > 0) {
                        int size = arrayList.size();
                        ULog.i("--->>> removeCallback: before remove: callbacks size is: " + size);
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size) {
                                break;
                            } else if (uMImprintChangeCallback == arrayList.get(i4)) {
                                ULog.i("--->>> removeCallback: remove index " + i4);
                                arrayList.remove(i4);
                                break;
                            } else {
                                i4++;
                            }
                        }
                        ULog.i("--->>> removeCallback: after remove: callbacks size is: " + arrayList.size());
                        if (arrayList.size() == 0) {
                            ULog.i("--->>> removeCallback: remove key from map: key = " + str);
                            f64402f.remove(str);
                        }
                    }
                }
            }
        }
    }

    private boolean c(com.umeng.commonsdk.statistics.proto.d dVar) {
        if (dVar.i().equals(a(dVar))) {
            for (com.umeng.commonsdk.statistics.proto.e eVar : dVar.c().values()) {
                String h4 = eVar.h();
                if (!TextUtils.isEmpty(h4)) {
                    byte[] reverseHexString = DataHelper.reverseHexString(h4);
                    byte[] a5 = a(eVar);
                    for (int i4 = 0; i4 < 4; i4++) {
                        if (reverseHexString[i4] != a5[i4]) {
                            return false;
                        }
                    }
                    continue;
                }
            }
            return true;
        }
        return false;
    }

    private com.umeng.commonsdk.statistics.proto.d d(com.umeng.commonsdk.statistics.proto.d dVar) {
        Map<String, com.umeng.commonsdk.statistics.proto.e> c5 = dVar.c();
        if (c5.containsKey(bm.f63445f)) {
            c5.remove(bm.f63445f);
            this.f64412h.a(bm.f63445f);
            dVar.a(dVar.f());
            dVar.a(a(dVar));
        }
        return dVar;
    }

    private com.umeng.commonsdk.statistics.proto.d e(com.umeng.commonsdk.statistics.proto.d dVar) {
        ArrayList<UMImprintChangeCallback> arrayList;
        boolean z4;
        ArrayList<UMImprintChangeCallback> arrayList2;
        UMImprintPreProcessCallback uMImprintPreProcessCallback;
        Map<String, com.umeng.commonsdk.statistics.proto.e> c5 = dVar.c();
        ArrayList<String> arrayList3 = new ArrayList(c5.size() / 2);
        Iterator<Map.Entry<String, com.umeng.commonsdk.statistics.proto.e>> it2 = c5.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, com.umeng.commonsdk.statistics.proto.e> next = it2.next();
            if (!next.getValue().d()) {
                arrayList3.add(next.getKey());
            } else {
                String key = next.getKey();
                String str = next.getValue().f64564a;
                synchronized (f64410p) {
                    z4 = !TextUtils.isEmpty(key) && f64409o.containsKey(key) && (uMImprintPreProcessCallback = f64409o.get(key)) != null && uMImprintPreProcessCallback.onPreProcessImprintKey(key, str);
                }
                if (z4) {
                    arrayList3.add(key);
                }
                synchronized (f64403g) {
                    if (!TextUtils.isEmpty(key) && f64402f.containsKey(key) && (arrayList2 = f64402f.get(key)) != null) {
                        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                            arrayList2.get(i4).onImprintValueChanged(key, str);
                        }
                    }
                }
            }
        }
        for (String str2 : arrayList3) {
            synchronized (f64403g) {
                if (!TextUtils.isEmpty(str2) && f64402f.containsKey(str2) && (arrayList = f64402f.get(str2)) != null) {
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        arrayList.get(i5).onImprintValueChanged(str2, null);
                    }
                }
            }
            c5.remove(str2);
        }
        return dVar;
    }

    public static synchronized ImprintHandler getImprintService(Context context) {
        ImprintHandler imprintHandler;
        synchronized (ImprintHandler.class) {
            if (f64404j == null) {
                f64404j = new ImprintHandler(context);
                f64406l = new FileLockUtil();
                f64406l.doFileOperateion(new File(f64405k.getFilesDir(), f64400c), f64404j, 0);
            }
            imprintHandler = f64404j;
        }
        return imprintHandler;
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(File file, int i4) {
        if (i4 == 0) {
            f64404j.e();
        } else if (i4 == 1) {
            f64404j.a(file);
        }
        return true;
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(String str) {
        return false;
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(String str, Object obj) {
        return false;
    }

    public void registImprintCallback(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (TextUtils.isEmpty(str) || uMImprintChangeCallback == null) {
            return;
        }
        a(str, uMImprintChangeCallback);
    }

    public void registPreProcessCallback(String str, UMImprintPreProcessCallback uMImprintPreProcessCallback) {
        if (TextUtils.isEmpty(str) || uMImprintPreProcessCallback == null) {
            return;
        }
        synchronized (f64410p) {
            try {
                if (!f64409o.containsKey(str)) {
                    f64409o.put(str, uMImprintPreProcessCallback);
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> registPreProcessCallback: key : " + str + " regist success.");
                } else {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> key : " + str + " PreProcesser has registed!");
                }
            }
        }
    }

    public void unregistImprintCallback(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (TextUtils.isEmpty(str) || uMImprintChangeCallback == null) {
            return;
        }
        b(str, uMImprintChangeCallback);
    }

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private Map<String, String> f64414a = new HashMap();

        a() {
        }

        private synchronized void b(com.umeng.commonsdk.statistics.proto.d dVar) {
            com.umeng.commonsdk.statistics.proto.e eVar;
            if (dVar != null) {
                if (dVar.e()) {
                    Map<String, com.umeng.commonsdk.statistics.proto.e> c5 = dVar.c();
                    for (String str : c5.keySet()) {
                        if (!TextUtils.isEmpty(str) && (eVar = c5.get(str)) != null) {
                            String b5 = eVar.b();
                            if (!TextUtils.isEmpty(b5)) {
                                this.f64414a.put(str, b5);
                                if (AnalyticsConstants.UM_DEBUG) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("imKey is ");
                                    sb.append(str);
                                    sb.append(", imValue is ");
                                    sb.append(b5);
                                }
                            }
                        }
                    }
                }
            }
        }

        public synchronized void a(String str) {
            Map<String, String> map = this.f64414a;
            if (map != null && map.size() > 0 && !TextUtils.isEmpty(str) && this.f64414a.containsKey(str)) {
                this.f64414a.remove(str);
            }
        }

        a(com.umeng.commonsdk.statistics.proto.d dVar) {
            a(dVar);
        }

        public void a(com.umeng.commonsdk.statistics.proto.d dVar) {
            if (dVar == null) {
                return;
            }
            b(dVar);
        }

        public synchronized String a(String str, String str2) {
            if (!TextUtils.isEmpty(str) && this.f64414a.size() > 0) {
                String str3 = this.f64414a.get(str);
                return !TextUtils.isEmpty(str3) ? str3 : str2;
            }
            return str2;
        }
    }

    public void d() {
        if (this.f64413i == null || f64406l == null) {
            return;
        }
        File file = new File(f64405k.getFilesDir(), f64400c);
        if (!file.exists()) {
            try {
                try {
                    file.createNewFile();
                } catch (IOException e5) {
                    UMCrashManager.reportCrash(f64405k, e5);
                }
            } catch (IOException unused) {
                file.createNewFile();
            }
        }
        f64406l.doFileOperateion(file, f64404j, 1);
    }

    public a c() {
        return this.f64412h;
    }

    public void b(com.umeng.commonsdk.statistics.proto.d dVar) {
        com.umeng.commonsdk.statistics.proto.d a5;
        boolean z4;
        if (dVar == null) {
            if (AnalyticsConstants.UM_DEBUG) {
                UMRTLog.d(UMRTLog.RTLOG_TAG, "Imprint is null");
            }
        } else if (!c(dVar)) {
            if (AnalyticsConstants.UM_DEBUG) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "Imprint is not valid");
            }
        } else {
            boolean z5 = AnalyticsConstants.UM_DEBUG;
            HashMap hashMap = new HashMap();
            synchronized (this) {
                com.umeng.commonsdk.statistics.proto.d dVar2 = this.f64413i;
                com.umeng.commonsdk.statistics.proto.d d5 = d(dVar);
                String str = null;
                String i4 = dVar2 == null ? null : dVar2.i();
                if (dVar2 == null) {
                    a5 = e(d5);
                } else {
                    a5 = a(dVar2, d5, hashMap);
                }
                this.f64413i = a5;
                if (a5 != null) {
                    str = a5.i();
                }
                z4 = !a(i4, str);
            }
            com.umeng.commonsdk.statistics.proto.d dVar3 = this.f64413i;
            if (dVar3 != null && z4) {
                this.f64412h.a(dVar3);
                com.umeng.commonsdk.statistics.internal.d dVar4 = this.f64411e;
                if (dVar4 != null) {
                    dVar4.onImprintChanged(this.f64412h);
                }
            }
            if (hashMap.size() > 0) {
                synchronized (f64403g) {
                    for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (!TextUtils.isEmpty(key) && f64402f.containsKey(key)) {
                            ULog.i("--->>> target imprint key is: " + key + "; value is: " + value);
                            ArrayList<UMImprintChangeCallback> arrayList = f64402f.get(key);
                            if (arrayList != null) {
                                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                                    arrayList.get(i5).onImprintValueChanged(key, value);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (f64410p) {
            try {
                if (f64409o.containsKey(str)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> unregistPreProcessCallback: unregist [" + str + "] success.");
                    f64402f.remove(str);
                } else {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> unregistPreProcessCallback: can't find [" + str + "], pls regist first.");
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void e() {
        /*
            r5 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f64405k
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f64400c
            r0.<init>(r1, r2)
            java.lang.Object r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f64399b
            monitor-enter(r1)
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L5e
            if (r0 != 0) goto L18
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5e
            return
        L18:
            r0 = 0
            android.content.Context r3 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f64405k     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2e
            java.io.FileInputStream r2 = r3.openFileInput(r2)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2e
            byte[] r0 = com.umeng.commonsdk.statistics.common.HelperUtils.readStreamToByteArray(r2)     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L59
        L23:
            com.umeng.commonsdk.statistics.common.HelperUtils.safeClose(r2)     // Catch: java.lang.Throwable -> L5e
            goto L34
        L27:
            r3 = move-exception
            goto L30
        L29:
            r2 = move-exception
            r4 = r2
            r2 = r0
            r0 = r4
            goto L5a
        L2e:
            r3 = move-exception
            r2 = r0
        L30:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L59
            goto L23
        L34:
            if (r0 == 0) goto L57
            com.umeng.commonsdk.statistics.proto.d r2 = new com.umeng.commonsdk.statistics.proto.d     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            r2.<init>()     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            com.umeng.analytics.pro.by r3 = new com.umeng.analytics.pro.by     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            r3.<init>()     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            r3.a(r2, r0)     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            r5.f64413i = r2     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler$a r0 = r5.f64412h     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            r0.a(r2)     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            com.umeng.commonsdk.statistics.proto.d r0 = r5.f64413i     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            com.umeng.commonsdk.statistics.proto.d r0 = r5.d(r0)     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            r5.f64413i = r0     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            goto L57
        L53:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L5e
        L57:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5e
            return
        L59:
            r0 = move-exception
        L5a:
            com.umeng.commonsdk.statistics.common.HelperUtils.safeClose(r2)     // Catch: java.lang.Throwable -> L5e
            throw r0     // Catch: java.lang.Throwable -> L5e
        L5e:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5e
            goto L62
        L61:
            throw r0
        L62:
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.idtracking.ImprintHandler.e():void");
    }

    public void a(com.umeng.commonsdk.statistics.internal.d dVar) {
        this.f64411e = dVar;
    }

    public String a(com.umeng.commonsdk.statistics.proto.d dVar) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : new TreeMap(dVar.c()).entrySet()) {
            sb.append((String) entry.getKey());
            if (((com.umeng.commonsdk.statistics.proto.e) entry.getValue()).d()) {
                sb.append(((com.umeng.commonsdk.statistics.proto.e) entry.getValue()).b());
            }
        }
        sb.append(dVar.f64546b);
        return HelperUtils.MD5(sb.toString()).toLowerCase(Locale.US);
    }

    public byte[] a(com.umeng.commonsdk.statistics.proto.e eVar) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(null);
        allocate.putLong(eVar.e());
        byte[] array = allocate.array();
        byte[] bArr = f64401d;
        byte[] bArr2 = new byte[4];
        for (int i4 = 0; i4 < 4; i4++) {
            bArr2[i4] = (byte) (array[i4] ^ bArr[i4]);
        }
        return bArr2;
    }

    public byte[] a() {
        try {
            synchronized (this) {
                com.umeng.commonsdk.statistics.proto.d dVar = this.f64413i;
                if (dVar == null) {
                    return null;
                }
                if (dVar.b() <= 0) {
                    return null;
                }
                return new ce().a(this.f64413i);
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f64405k, th);
            return null;
        }
    }

    public synchronized com.umeng.commonsdk.statistics.proto.d b() {
        return this.f64413i;
    }

    private boolean a(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    private com.umeng.commonsdk.statistics.proto.d a(com.umeng.commonsdk.statistics.proto.d dVar, com.umeng.commonsdk.statistics.proto.d dVar2, Map<String, String> map) {
        UMImprintPreProcessCallback uMImprintPreProcessCallback;
        ArrayList<UMImprintChangeCallback> arrayList;
        if (dVar2 == null) {
            return dVar;
        }
        Map<String, com.umeng.commonsdk.statistics.proto.e> c5 = dVar.c();
        for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.e> entry : dVar2.c().entrySet()) {
            int i4 = 0;
            if (entry.getValue().d()) {
                String key = entry.getKey();
                String str = entry.getValue().f64564a;
                synchronized (f64410p) {
                    if (!TextUtils.isEmpty(key) && f64409o.containsKey(key) && (uMImprintPreProcessCallback = f64409o.get(key)) != null && uMImprintPreProcessCallback.onPreProcessImprintKey(key, str)) {
                        i4 = 1;
                    }
                }
                if (i4 == 0) {
                    c5.put(entry.getKey(), entry.getValue());
                    synchronized (f64403g) {
                        if (!TextUtils.isEmpty(key) && f64402f.containsKey(key) && f64402f.get(key) != null) {
                            map.put(key, str);
                        }
                    }
                } else {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> merge: [" + key + "] should be ignored.");
                }
            } else {
                String key2 = entry.getKey();
                synchronized (f64403g) {
                    if (!TextUtils.isEmpty(key2) && f64402f.containsKey(key2) && (arrayList = f64402f.get(key2)) != null) {
                        while (i4 < arrayList.size()) {
                            arrayList.get(i4).onImprintValueChanged(key2, null);
                            i4++;
                        }
                    }
                }
                c5.remove(key2);
                this.f64412h.a(key2);
            }
        }
        dVar.a(dVar2.f());
        dVar.a(a(dVar));
        return dVar;
    }

    private void a(File file) {
        if (this.f64413i == null) {
            return;
        }
        try {
            synchronized (f64399b) {
                byte[] a5 = new ce().a(this.f64413i);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(a5);
                    fileOutputStream.flush();
                } finally {
                    HelperUtils.safeClose(fileOutputStream);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
