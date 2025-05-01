package com.mob.commons;

import android.os.Message;
import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.network.NetCommunicator;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.ResHelper;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
/* loaded from: classes5.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private static final String f56361a = C0811r.b("004=ckcbdbDf");

    /* renamed from: b  reason: collision with root package name */
    private static h f56362b;

    /* renamed from: c  reason: collision with root package name */
    private NetCommunicator f56363c;

    /* renamed from: f  reason: collision with root package name */
    private String f56366f;

    /* renamed from: d  reason: collision with root package name */
    private SimpleDateFormat f56364d = new SimpleDateFormat(C0811r.b("0256dbdbdbdbgjgbgbgjcbcbheejej4j:cece<j1ehehckdkdkdkhefc"));

    /* renamed from: e  reason: collision with root package name */
    private HashMap<String, Object> f56365e = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    private int f56367g = -1;

    /* renamed from: h  reason: collision with root package name */
    private Runnable f56368h = new com.mob.tools.utils.i() { // from class: com.mob.commons.h.1
        @Override // com.mob.tools.utils.i
        protected void a() {
            if (b.c()) {
                h.this.c();
            }
        }
    };

    private h() {
        this.f56366f = null;
        this.f56366f = UUID.randomUUID().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        boolean z4;
        File[] listFiles;
        if (this.f56365e.size() > 0) {
            z4 = a(this.f56365e);
            if (!z4) {
                c(this.f56365e);
            }
            this.f56365e.clear();
        } else {
            z4 = true;
        }
        if (z4) {
            File e5 = e();
            if (!e5.exists() || !e5.isDirectory() || (listFiles = e5.listFiles()) == null || listFiles.length <= 0) {
                return;
            }
            for (File file : listFiles) {
                if (a((HashMap) ResHelper.readObjectFromFile(file.getAbsolutePath())) && !file.delete()) {
                    file.delete();
                }
            }
        }
    }

    private void d() {
        if (this.f56363c == null) {
            this.f56363c = new NetCommunicator(1024, "ab0a0a6473d1891d388773574764b239d4ad80cb2fd3a83d81d03901c1548c13fee7c9692c326e6682b239d4c5d0021d1b607642c47ec29f10b0602908c3e6c9", "23c3c8cb41c47dd288cc7f4c218fbc7c839a34e0a0d1b2130e87b7914936b120a2d6570ee7ac66282328d50f2acfd82f2259957c89baea32547758db05de9cd7c6822304c8e45742f24bbbe41c1e12f09e18c6fab4d078065f2e5aaed94c900c66e8bbf8a120eefa7bd1fb52114d529250084f5f6f369ed4ce9645978dd30c51");
        }
    }

    private File e() {
        return new File(ResHelper.getDataCache(MobSDK.getContext()), f56361a);
    }

    private synchronized int b() {
        return this.f56367g;
    }

    public static synchronized h a() {
        h hVar;
        synchronized (h.class) {
            if (f56362b == null) {
                f56362b = new h();
            }
            hVar = f56362b;
        }
        return hVar;
    }

    private boolean b(HashMap<String, Object> hashMap) throws Throwable {
        if (hashMap == null || hashMap.isEmpty()) {
            return true;
        }
        HashMap<String, Object> e5 = u.e();
        e5.put(C0811r.b("006e@cicicjcieh"), hashMap);
        d();
        HashMap hashMap2 = (HashMap) this.f56363c.requestWithoutEncode(false, NetCommunicator.getCommonDefaultHeaders(), e5, i.a().a("dtc") + "/v2/drl", true);
        return hashMap2 == null || hashMap2.isEmpty();
    }

    public synchronized void a(int i4) {
        this.f56367g = i4;
        if (i4 != 1 && i4 != 4 && i4 != 17 && i4 != 18 && i4 != 19 && i4 != 20) {
        }
    }

    public synchronized void a(int i4, Throwable th) {
        a(i4, b(), th, null, "-99");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private synchronized void a(int i4, int i5, Throwable th, String str, String str2) {
        if (th == null) {
            MobLog.getInstance().d(str, new Object[0]);
        } else {
            MobLog.getInstance().d(th);
        }
        if (e.a()) {
            return;
        }
        final Message message = new Message();
        message.what = 1;
        Object[] objArr = new Object[5];
        objArr[0] = Long.valueOf(System.currentTimeMillis());
        if (th == null) {
            th = str;
        }
        objArr[1] = th;
        objArr[2] = Integer.valueOf(i4);
        objArr[3] = Integer.valueOf(i5);
        objArr[4] = str2;
        message.obj = objArr;
        z.f56520d.execute(new com.mob.tools.utils.i() { // from class: com.mob.commons.h.2
            @Override // com.mob.tools.utils.i
            protected void a() {
                h.this.a(message);
            }
        });
    }

    private void c(HashMap<String, Object> hashMap) {
        File[] listFiles;
        try {
            File e5 = e();
            if (!e5.exists() || !e5.isDirectory()) {
                e5.delete();
                e5.mkdirs();
            }
            StringBuilder sb = new StringBuilder();
            String str = f56361a;
            sb.append(str);
            sb.append("_");
            int i4 = 0;
            sb.append(0);
            File file = new File(e5, sb.toString());
            if (file.exists() && (listFiles = e5.listFiles()) != null && listFiles.length > 0) {
                file = new File(e5, str + "_0");
                while (file.exists()) {
                    i4++;
                    file = new File(e5, f56361a + "_" + i4);
                }
            }
            ResHelper.saveObjectToFile(file.getPath(), hashMap);
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        String valueOf;
        if (this.f56365e.size() > 10) {
            c(this.f56365e);
            this.f56365e.clear();
        }
        Object[] objArr = (Object[]) message.obj;
        this.f56365e.put(C0811r.b("0027ehcb"), this.f56366f);
        ArrayList arrayList = (ArrayList) this.f56365e.get(C0811r.b("004f?cheh4h"));
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(C0811r.b("002bh"), objArr[0]);
        if (objArr[1] instanceof Throwable) {
            valueOf = a((Throwable) objArr[1]);
        } else {
            valueOf = String.valueOf(objArr[1]);
        }
        if (!TextUtils.isEmpty(valueOf)) {
            valueOf = valueOf.replaceAll("\r\n\t", " ").replaceAll("\n\t", " ").replaceAll("\n", " ");
        }
        String b5 = C0811r.b("002Gcedi");
        hashMap.put(b5, "[" + this.f56364d.format(objArr[0]) + "][" + objArr[2] + "][" + objArr[3] + "][" + objArr[4] + "] " + valueOf);
        hashMap.put(C0811r.b("002eh"), objArr[2]);
        hashMap.put(C0811r.b("002i(cj"), objArr[3]);
        arrayList.add(hashMap);
        this.f56365e.put(C0811r.b("004f;chehXh"), arrayList);
        if (e.a()) {
            return;
        }
        DH.requester(MobSDK.getContext()).request(new DH.DHResponder() { // from class: com.mob.commons.h.3
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                com.mob.commons.a.l.a().b(10L, h.this.f56368h);
            }
        });
    }

    private boolean a(HashMap<String, Object> hashMap) {
        try {
            return b(hashMap);
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            try {
                return b(hashMap);
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
                return false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #1 {all -> 0x005a, blocks: (B:20:0x003c, B:22:0x0040, B:25:0x004e), top: B:34:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e A[Catch: all -> 0x005a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x005a, blocks: (B:20:0x003c, B:22:0x0040, B:25:0x004e), top: B:34:0x003c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(java.lang.Throwable r7) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            if (r7 != 0) goto L5
            return r0
        L5:
            r1 = 0
            r2 = r7
        L7:
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1c
            boolean r5 = r2 instanceof java.net.UnknownHostException     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L17
            java.io.Closeable[] r7 = new java.io.Closeable[r4]
            r7[r3] = r1
            com.mob.commons.v.a(r7)
            return r0
        L17:
            java.lang.Throwable r2 = r2.getCause()     // Catch: java.lang.Throwable -> L3b
            goto L7
        L1c:
            java.io.StringWriter r0 = new java.io.StringWriter     // Catch: java.lang.Throwable -> L3b
            r0.<init>()     // Catch: java.lang.Throwable -> L3b
            java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> L38
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L38
            r7.printStackTrace(r1)     // Catch: java.lang.Throwable -> L38
            r1.flush()     // Catch: java.lang.Throwable -> L38
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> L38
            java.io.Closeable[] r1 = new java.io.Closeable[r4]
            r1[r3] = r0
            com.mob.commons.v.a(r1)
            return r7
        L38:
            r7 = move-exception
            r1 = r0
            goto L3c
        L3b:
            r7 = move-exception
        L3c:
            boolean r0 = r7 instanceof java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto L4e
            java.lang.String r7 = "023PdiNeh(dk hcbOdgebciUcbe-dkHh,cich^d8dihecjcjce"
            java.lang.String r7 = com.mob.commons.C0811r.b(r7)     // Catch: java.lang.Throwable -> L5a
            java.io.Closeable[] r0 = new java.io.Closeable[r4]
            r0[r3] = r1
            com.mob.commons.v.a(r0)
            return r7
        L4e:
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> L5a
            java.io.Closeable[] r0 = new java.io.Closeable[r4]
            r0[r3] = r1
            com.mob.commons.v.a(r0)
            return r7
        L5a:
            r7 = move-exception
            java.io.Closeable[] r0 = new java.io.Closeable[r4]
            r0[r3] = r1
            com.mob.commons.v.a(r0)
            goto L64
        L63:
            throw r7
        L64:
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.h.a(java.lang.Throwable):java.lang.String");
    }
}
